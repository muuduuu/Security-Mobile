"""Anthropic Claude LLM provider."""

from __future__ import annotations

import json
import logging
from typing import Any, AsyncIterator

from pydantic import BaseModel

from sentinel.core.exceptions import LLMError
from sentinel.llm.provider import LLMMessage, LLMProvider, LLMResponse

logger = logging.getLogger(__name__)


class ClaudeProvider(LLMProvider):
    """Anthropic Claude provider."""

    def __init__(self, api_key: str, model: str = "claude-sonnet-4-20250514", base_url: str = "") -> None:
        self._api_key = api_key
        self._model = model
        self._base_url = base_url
        self._client = None

    @property
    def name(self) -> str:
        return f"claude:{self._model}"

    @property
    def is_available(self) -> bool:
        return bool(self._api_key)

    def _get_client(self):
        if self._client is None:
            try:
                import anthropic

                kwargs = {"api_key": self._api_key}
                if self._base_url:
                    kwargs["base_url"] = self._base_url
                self._client = anthropic.AsyncAnthropic(**kwargs)
            except ImportError:
                raise LLMError("anthropic package not installed. Run: pip install anthropic")
        return self._client

    async def complete(
        self,
        messages: list[LLMMessage],
        max_tokens: int = 4096,
        temperature: float = 0.1,
    ) -> LLMResponse:
        client = self._get_client()
        system_msg = ""
        chat_msgs = []
        for m in messages:
            if m.role == "system":
                system_msg = m.content
            else:
                chat_msgs.append({"role": m.role, "content": m.content})

        try:
            kwargs: dict[str, Any] = {
                "model": self._model,
                "max_tokens": max_tokens,
                "messages": chat_msgs,
                "temperature": temperature,
            }
            if system_msg:
                kwargs["system"] = system_msg

            resp = await client.messages.create(**kwargs)
            return LLMResponse(
                content=resp.content[0].text,
                model=resp.model,
                usage={"input_tokens": resp.usage.input_tokens, "output_tokens": resp.usage.output_tokens},
            )
        except Exception as e:
            raise LLMError(f"Claude API error: {e}") from e

    async def structured_complete(
        self,
        messages: list[LLMMessage],
        response_schema: type[BaseModel],
        max_tokens: int = 4096,
    ) -> BaseModel:
        schema_json = response_schema.model_json_schema()
        system_addition = (
            f"\n\nYou MUST respond with valid JSON matching this schema:\n"
            f"```json\n{json.dumps(schema_json, indent=2)}\n```\n"
            f"Respond ONLY with the JSON object, no other text."
        )
        augmented = list(messages)
        if augmented and augmented[0].role == "system":
            augmented[0] = LLMMessage(role="system", content=augmented[0].content + system_addition)
        else:
            augmented.insert(0, LLMMessage(role="system", content=system_addition))

        response = await self.complete(augmented, max_tokens=max_tokens)
        try:
            data = json.loads(response.content)
            return response_schema.model_validate(data)
        except (json.JSONDecodeError, Exception) as e:
            raise LLMError(f"Failed to parse structured response: {e}\nContent: {response.content[:500]}") from e

    async def stream(
        self,
        messages: list[LLMMessage],
        max_tokens: int = 4096,
        temperature: float = 0.1,
    ) -> AsyncIterator[str]:
        client = self._get_client()
        system_msg = ""
        chat_msgs = []
        for m in messages:
            if m.role == "system":
                system_msg = m.content
            else:
                chat_msgs.append({"role": m.role, "content": m.content})

        try:
            kwargs: dict[str, Any] = {
                "model": self._model,
                "max_tokens": max_tokens,
                "messages": chat_msgs,
                "temperature": temperature,
            }
            if system_msg:
                kwargs["system"] = system_msg

            async with client.messages.stream(**kwargs) as stream:
                async for text in stream.text_stream:
                    yield text
        except Exception as e:
            raise LLMError(f"Claude streaming error: {e}") from e
