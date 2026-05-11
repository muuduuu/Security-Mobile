"""Main SENTINEL engine — entry point for the platform."""

from __future__ import annotations

import logging
from typing import Any
from uuid import UUID

from sentinel.core.config import SentinelConfig, load_config
from sentinel.core.events import EventBus, Event, EventType
from sentinel.core.state import SharedState
from sentinel.memory.graph import KnowledgeGraph
from sentinel.memory.store import Store

logger = logging.getLogger(__name__)


class SentinelEngine:
    """Central engine coordinating all SENTINEL components.

    Responsibilities:
    - Hold the event bus
    - Manage configurations
    - Coordinate engagement lifecycle
    - Provide shared services (store, graph, event bus)
    """

    def __init__(self, config: SentinelConfig | None = None) -> None:
        self.config = config or load_config()
        self.event_bus = EventBus()
        self._store: Store | None = None
        self._graph: KnowledgeGraph | None = None
        self._engagements: dict[UUID, SharedState] = {}

    async def initialize(self) -> None:
        """Initialize engine components."""
        self._store = Store(self.config)
        await self._store.initialize()
        self._graph = KnowledgeGraph()
        logger.info("SENTINEL engine initialized")

    async def shutdown(self) -> None:
        """Graceful shutdown."""
        if self._store:
            await self._store.close()
        logger.info("SENTINEL engine shut down")

    @property
    def store(self) -> Store:
        assert self._store is not None, "Engine not initialized. Call initialize() first."
        return self._store

    @property
    def graph(self) -> KnowledgeGraph:
        assert self._graph is not None, "Engine not initialized. Call initialize() first."
        return self._graph

    def get_engagement_state(self, engagement_id: UUID) -> SharedState | None:
        return self._engagements.get(engagement_id)

    def register_engagement(self, state: SharedState) -> None:
        self._engagements[state.engagement.id] = state

    def list_engagements(self) -> list[SharedState]:
        return list(self._engagements.values())
