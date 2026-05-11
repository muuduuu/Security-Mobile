"""Event bus for inter-agent communication."""

from __future__ import annotations

import asyncio
import logging
from collections import defaultdict
from dataclasses import dataclass, field
from datetime import datetime
from enum import Enum
from typing import Any, Callable, Coroutine
from uuid import UUID, uuid4

logger = logging.getLogger(__name__)


class EventType(str, Enum):
    """Typed event types for the event bus."""

    # Engagement lifecycle
    ENGAGEMENT_STARTED = "engagement_started"
    ENGAGEMENT_COMPLETED = "engagement_completed"
    ENGAGEMENT_FAILED = "engagement_failed"

    # APK
    APK_INGESTED = "apk_ingested"
    APK_DECOMPILED = "apk_decompiled"

    # Findings
    FINDING_DISCOVERED = "finding_discovered"
    FINDING_VALIDATED = "finding_validated"
    FINDING_CORRELATED = "finding_correlated"

    # Agents
    AGENT_SPAWNED = "agent_spawned"
    AGENT_COMPLETED = "agent_completed"
    AGENT_FAILED = "agent_failed"

    # Devices
    DEVICE_CONNECTED = "device_connected"
    DEVICE_DISCONNECTED = "device_disconnected"
    DEVICE_READY = "device_ready"

    # Runtime
    HOOK_TRIGGERED = "hook_triggered"
    TRAFFIC_CAPTURED = "traffic_captured"
    API_DISCOVERED = "api_discovered"

    # Exploits
    EXPLOIT_ATTEMPTED = "exploit_attempted"
    EXPLOIT_SUCCEEDED = "exploit_succeeded"
    EXPLOIT_FAILED = "exploit_failed"

    # Custom
    CUSTOM = "custom"


@dataclass
class Event:
    """Typed event envelope for inter-agent communication."""

    event_type: EventType
    source_agent: str
    engagement_id: UUID
    payload: dict[str, Any] = field(default_factory=dict)
    event_id: UUID = field(default_factory=uuid4)
    timestamp: datetime = field(default_factory=datetime.utcnow)

    def to_dict(self) -> dict[str, Any]:
        return {
            "event_id": str(self.event_id),
            "event_type": self.event_type.value,
            "source_agent": self.source_agent,
            "engagement_id": str(self.engagement_id),
            "timestamp": self.timestamp.isoformat(),
            "payload": self.payload,
        }


# Type alias for event handlers
EventHandler = Callable[[Event], Coroutine[Any, Any, None]]


class EventBus:
    """Async publish/subscribe event bus for agent communication.

    Supports:
    - Topic-based subscriptions (by EventType)
    - Wildcard subscriptions (all events)
    - Event history replay
    - Async handler execution
    """

    def __init__(self, max_history: int = 1000) -> None:
        self._subscribers: dict[EventType, list[EventHandler]] = defaultdict(list)
        self._wildcard_subscribers: list[EventHandler] = []
        self._history: list[Event] = []
        self._max_history = max_history
        self._lock = asyncio.Lock()

    async def subscribe(self, event_type: EventType, handler: EventHandler) -> None:
        """Subscribe a handler to a specific event type."""
        async with self._lock:
            self._subscribers[event_type].append(handler)
        logger.debug(f"Handler subscribed to {event_type.value}")

    async def subscribe_all(self, handler: EventHandler) -> None:
        """Subscribe a handler to all events."""
        async with self._lock:
            self._wildcard_subscribers.append(handler)

    async def unsubscribe(self, event_type: EventType, handler: EventHandler) -> None:
        """Unsubscribe a handler from a specific event type."""
        async with self._lock:
            handlers = self._subscribers.get(event_type, [])
            if handler in handlers:
                handlers.remove(handler)

    async def publish(self, event: Event) -> None:
        """Publish an event to all subscribers."""
        logger.info(
            f"Event: {event.event_type.value} from {event.source_agent} "
            f"[{str(event.engagement_id)[:8]}]"
        )

        # Store in history
        self._history.append(event)
        if len(self._history) > self._max_history:
            self._history = self._history[-self._max_history :]

        # Gather all handlers
        handlers = list(self._subscribers.get(event.event_type, []))
        handlers.extend(self._wildcard_subscribers)

        # Fire all handlers concurrently (don't await individually)
        tasks = []
        for handler in handlers:
            tasks.append(self._safe_call(handler, event))
        if tasks:
            await asyncio.gather(*tasks, return_exceptions=True)

    @staticmethod
    async def _safe_call(handler: EventHandler, event: Event) -> None:
        """Call handler with error protection."""
        try:
            await handler(event)
        except Exception as e:
            logger.error(f"Event handler error for {event.event_type.value}: {e}")

    def get_history(
        self,
        event_type: EventType | None = None,
        engagement_id: UUID | None = None,
        limit: int = 100,
    ) -> list[Event]:
        """Retrieve event history with optional filtering."""
        events = self._history
        if event_type:
            events = [e for e in events if e.event_type == event_type]
        if engagement_id:
            events = [e for e in events if e.engagement_id == engagement_id]
        return events[-limit:]

    def clear_history(self) -> None:
        self._history.clear()
