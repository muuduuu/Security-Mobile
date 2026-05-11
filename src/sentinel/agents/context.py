"""Agent context — shared memory and state access for agents."""

from __future__ import annotations

from typing import Any
from uuid import UUID

from sentinel.core.events import EventBus
from sentinel.core.state import SharedState
from sentinel.memory.graph import KnowledgeGraph
from sentinel.memory.store import Store


class AgentContext:
    """Provides agents with controlled access to shared resources.

    This is passed to agents so they can:
    - Read/write shared state
    - Query the knowledge graph
    - Access the persistent store
    - Emit events
    """

    def __init__(
        self,
        engagement_id: UUID,
        shared_state: SharedState,
        event_bus: EventBus,
        store: Store,
        graph: KnowledgeGraph,
    ) -> None:
        self.engagement_id = engagement_id
        self.state = shared_state
        self.events = event_bus
        self.store = store
        self.graph = graph

    async def get_artifact(self, name: str) -> str | None:
        return await self.state.get_artifact(name)

    async def set_artifact(self, name: str, path: str) -> None:
        await self.state.set_artifact(name, path)

    async def get_metadata(self, key: str, default: Any = None) -> Any:
        return await self.state.get_metadata(key, default)

    async def set_metadata(self, key: str, value: Any) -> None:
        await self.state.set_metadata(key, value)
