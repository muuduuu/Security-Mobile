"""Base LLM provider interface."""

from __future__ import annotations

from abc import ABC, abstractmethod
from typing import Any, AsyncIterator

from pydantic import BaseModel


class LLMMessage(BaseModel):
    role: str  # "system" | "user" | "assistant"
    content: str


class LLMResponse(BaseModel):
    content: str
    model: str = ""
    usage: dict[str, int] = {}
    raw: dict[str, Any] = {}


class LLMProvider(ABC):
    """Abstract base class for LLM providers."""

    @abstractmethod
    async def complete(
        self,
        messages: list[LLMMessage],
        max_tokens: int = 4096,
        temperature: float = 0.1,
    ) -> LLMResponse:
        """Complete a chat completion."""

    @abstractmethod
    async def structured_complete(
        self,
        messages: list[LLMMessage],
        response_schema: type[BaseModel],
        max_tokens: int = 4096,
    ) -> BaseModel:
        """Complete with structured output matching a Pydantic model."""

    @abstractmethod
    async def stream(
        self,
        messages: list[LLMMessage],
        max_tokens: int = 4096,
        temperature: float = 0.1,
    ) -> AsyncIterator[str]:
        """Stream a chat completion."""

    @property
    @abstractmethod
    def name(self) -> str:
        """Provider name."""

    @property
    @abstractmethod
    def is_available(self) -> bool:
        """Check if the provider is configured and available."""
