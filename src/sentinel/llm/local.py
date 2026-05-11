"""Local LLM provider via Ollama or similar."""

from __future__ import annotations

import json
import logging
from typing import Any, AsyncIterator

import httpx
from pydantic import BaseModel

from sentinel.core.exceptions import LLMError
from sentinel.llm.provider import LLMMessage, LLMProvider, LLMResponse

logger = logging.getLogger(__name__)


class LocalProvider(LLMProvider):
    """Local model provider via Ollama-compatible API."""

    def __init__(self, base_url: str = "http://localhost:11434", model: str = "llama3") -> None:
        self._base_url = base_url.rstrip("/")
        self._model = model

    @property
    def name(self) -> str:
        return f"local:{self._model}"

    @property
    def is_available(self) -> bool:
        try:
            resp = httpx.get(f"{self._base_url}/api/tags", timeout=5.0)
            return resp.status_code == 200
        except Exception:
            return False

    def _format_messages(self, messages: list[LLMMessage]) -> str:
        parts = []
        for m in messages:
            if m.role == "system":
                parts.append(f"System: {m.content}")
            elif m.role == "user":
                parts.append(f"User: {m.content}")
            elif m.role == "assistant":
                parts.append(f"Assistant: {m.content}")
        return "\n\n".join(parts)

    async def complete(
        self,
        messages: list[LLMMessage],
        max_tokens: int = 4096,
        temperature: float = 0.1,
    ) -> LLMResponse:
        prompt = self._format_messages(messages)
        try:
            async with httpx.AsyncClient(timeout=120.0) as client:
                resp = await client.post(
                    f"{self._base_url}/api/generate",
                    json={
                        "model": self._model,
                        "prompt": prompt,
                        "stream": False,
                        "options": {"num_predict": max_tokens, "temperature": temperature},
                    },
                )
                resp.raise_for_status()
                data = resp.json()
                return LLMResponse(
                    content=data.get("response", ""),
                    model=self._model,
                    usage={
                        "input_tokens": data.get("prompt_eval_count", 0),
                        "output_tokens": data.get("eval_count", 0),
                    },
                )
        except Exception as e:
            raise LLMError(f"Local model error: {e}") from e

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
        prompt = self._format_messages(messages)
        try:
            async with httpx.AsyncClient(timeout=120.0) as client:
                async with client.stream(
                    "POST",
                    f"{self._base_url}/api/generate",
                    json={
                        "model": self._model,
                        "prompt": prompt,
                        "stream": True,
                        "options": {"num_predict": max_tokens, "temperature": temperature},
                    },
                ) as resp:
                    async for line in resp.aiter_lines():
                        if line:
                            data = json.loads(line)
                            if "response" in data:
                                yield data["response"]
        except Exception as e:
            raise LLMError(f"Local model streaming error: {e}") from e
