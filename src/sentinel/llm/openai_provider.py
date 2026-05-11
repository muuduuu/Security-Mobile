"""OpenAI LLM provider."""

from __future__ import annotations

import json
import logging
from typing import Any, AsyncIterator

from pydantic import BaseModel

from sentinel.core.exceptions import LLMError
from sentinel.llm.provider import LLMMessage, LLMProvider, LLMResponse

logger = logging.getLogger(__name__)


class OpenAIProvider(LLMProvider):
    """OpenAI GPT provider."""

    def __init__(self, api_key: str, model: str = "gpt-4o", base_url: str = "") -> None:
        self._api_key = api_key
        self._model = model
        self._base_url = base_url
        self._client = None

    @property
    def name(self) -> str:
        return f"openai:{self._model}"

    @property
    def is_available(self) -> bool:
        return bool(self._api_key)

    def _get_client(self):
        if self._client is None:
            try:
                from openai import AsyncOpenAI

                kwargs = {"api_key": self._api_key}
                if self._base_url:
                    kwargs["base_url"] = self._base_url
                self._client = AsyncOpenAI(**kwargs)
            except ImportError:
                raise LLMError("openai package not installed. Run: pip install openai")
        return self._client

    async def complete(
        self,
        messages: list[LLMMessage],
        max_tokens: int = 4096,
        temperature: float = 0.1,
    ) -> LLMResponse:
        client = self._get_client()
        formatted = [{"role": m.role, "content": m.content} for m in messages]

        try:
            resp = await client.chat.completions.create(
                model=self._model,
                messages=formatted,
                max_tokens=max_tokens,
                temperature=temperature,
            )
            choice = resp.choices[0]
            return LLMResponse(
                content=choice.message.content or "",
                model=resp.model,
                usage={
                    "input_tokens": resp.usage.prompt_tokens if resp.usage else 0,
                    "output_tokens": resp.usage.completion_tokens if resp.usage else 0,
                },
            )
        except Exception as e:
            raise LLMError(f"OpenAI API error: {e}") from e

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
            raise LLMError(f"Failed to parse structured response: {e}") from e

    async def stream(
        self,
        messages: list[LLMMessage],
        max_tokens: int = 4096,
        temperature: float = 0.1,
    ) -> AsyncIterator[str]:
        client = self._get_client()
        formatted = [{"role": m.role, "content": m.content} for m in messages]

        try:
            stream = await client.chat.completions.create(
                model=self._model,
                messages=formatted,
                max_tokens=max_tokens,
                temperature=temperature,
                stream=True,
            )
            async for chunk in stream:
                if chunk.choices and chunk.choices[0].delta.content:
                    yield chunk.choices[0].delta.content
        except Exception as e:
            raise LLMError(f"OpenAI streaming error: {e}") from e
