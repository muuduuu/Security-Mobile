"""LLM router — selects the best available provider."""

from __future__ import annotations

import logging
from typing import AsyncIterator

from pydantic import BaseModel

from sentinel.core.config import LLMConfig
from sentinel.core.exceptions import LLMError
from sentinel.llm.provider import LLMMessage, LLMProvider, LLMResponse

logger = logging.getLogger(__name__)


class LLMRouter:
    """Routes LLM requests to the best available provider.

    Priority: configured provider > fallback providers.
    """

    def __init__(self, config: LLMConfig) -> None:
        self._config = config
        self._providers: list[LLMProvider] = []
        self._primary: LLMProvider | None = None
        self._setup_providers()

    def _setup_providers(self) -> None:
        from sentinel.llm.claude import ClaudeProvider
        from sentinel.llm.local import LocalProvider
        from sentinel.llm.openai_provider import OpenAIProvider

        # Create all configured providers
        if self._config.anthropic_api_key:
            p = ClaudeProvider(
                self._config.anthropic_api_key,
                self._config.anthropic_model,
                base_url=self._config.anthropic_base_url,
            )
            self._providers.append(p)

        if self._config.openai_api_key:
            p = OpenAIProvider(
                self._config.openai_api_key,
                self._config.openai_model,
                base_url=self._config.openai_base_url,
            )
            self._providers.append(p)

        # Local provider always available as fallback
        local = LocalProvider(self._config.local_base_url, self._config.local_model)
        self._providers.append(local)

        # Set primary based on config
        provider_map = {
            "anthropic": lambda: next((p for p in self._providers if isinstance(p, ClaudeProvider)), None),
            "openai": lambda: next((p for p in self._providers if isinstance(p, OpenAIProvider)), None),
            "local": lambda: next((p for p in self._providers if isinstance(p, LocalProvider)), None),
        }
        self._primary = provider_map.get(self._config.provider, lambda: None)()

        if self._primary is None:
            # Fallback to first available
            self._primary = next((p for p in self._providers if p.is_available), None)

        if self._primary:
            logger.info(f"Primary LLM: {self._primary.name}")
        else:
            logger.warning("No LLM provider available. Set SENTINEL_LLM_ANTHROPIC_API_KEY or SENTINEL_LLM_OPENAI_API_KEY.")

    @property
    def primary(self) -> LLMProvider:
        if self._primary is None:
            raise LLMError("No LLM provider configured. Set API keys via environment variables.")
        return self._primary

    async def complete(
        self,
        messages: list[LLMMessage],
        max_tokens: int | None = None,
        temperature: float | None = None,
    ) -> LLMResponse:
        """Complete using primary provider, falling back to alternatives."""
        errors = []
        for provider in [self._primary] + self._providers:
            if provider is None or not provider.is_available:
                continue
            try:
                return await provider.complete(
                    messages,
                    max_tokens=max_tokens or self._config.max_tokens,
                    temperature=temperature or self._config.temperature,
                )
            except LLMError as e:
                errors.append(f"{provider.name}: {e}")
                logger.warning(f"Provider {provider.name} failed, trying next...")
        raise LLMError(f"All LLM providers failed: {'; '.join(errors)}")

    async def structured_complete(
        self,
        messages: list[LLMMessage],
        response_schema: type[BaseModel],
        max_tokens: int | None = None,
    ) -> BaseModel:
        return await self.primary.structured_complete(
            messages,
            response_schema,
            max_tokens=max_tokens or self._config.max_tokens,
        )

    async def stream(
        self,
        messages: list[LLMMessage],
        max_tokens: int | None = None,
        temperature: float | None = None,
    ) -> AsyncIterator[str]:
        async for chunk in self.primary.stream(
            messages,
            max_tokens=max_tokens or self._config.max_tokens,
            temperature=temperature or self._config.temperature,
        ):
            yield chunk
