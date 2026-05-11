"""Tests for the event bus system."""

import asyncio
from uuid import uuid4

import pytest

from sentinel.core.events import EventBus, Event, EventType


@pytest.mark.asyncio
async def test_publish_subscribe(event_bus):
    """Test basic pub/sub."""
    received = []

    async def handler(event: Event):
        received.append(event)

    await event_bus.subscribe(EventType.FINDING_DISCOVERED, handler)

    event = Event(
        event_type=EventType.FINDING_DISCOVERED,
        source_agent="test",
        engagement_id=uuid4(),
        payload={"title": "test finding"},
    )
    await event_bus.publish(event)

    assert len(received) == 1
    assert received[0].payload["title"] == "test finding"


@pytest.mark.asyncio
async def test_multiple_subscribers(event_bus):
    """Test multiple subscribers receive events."""
    count_a = []
    count_b = []

    async def handler_a(event: Event):
        count_a.append(event)

    async def handler_b(event: Event):
        count_b.append(event)

    await event_bus.subscribe(EventType.AGENT_SPAWNED, handler_a)
    await event_bus.subscribe(EventType.AGENT_SPAWNED, handler_b)

    await event_bus.publish(Event(
        event_type=EventType.AGENT_SPAWNED,
        source_agent="orchestrator",
        engagement_id=uuid4(),
    ))

    assert len(count_a) == 1
    assert len(count_b) == 1


@pytest.mark.asyncio
async def test_wildcard_subscriber(event_bus):
    """Test wildcard subscriber gets all events."""
    all_events = []

    async def handler(event: Event):
        all_events.append(event)

    await event_bus.subscribe_all(handler)

    await event_bus.publish(Event(
        event_type=EventType.FINDING_DISCOVERED,
        source_agent="test",
        engagement_id=uuid4(),
    ))
    await event_bus.publish(Event(
        event_type=EventType.AGENT_COMPLETED,
        source_agent="test",
        engagement_id=uuid4(),
    ))

    assert len(all_events) == 2


@pytest.mark.asyncio
async def test_event_history(event_bus):
    """Test event history tracking."""
    eng_id = uuid4()

    for i in range(5):
        await event_bus.publish(Event(
            event_type=EventType.FINDING_DISCOVERED,
            source_agent="test",
            engagement_id=eng_id,
            payload={"index": i},
        ))

    history = event_bus.get_history(engagement_id=eng_id)
    assert len(history) == 5

    filtered = event_bus.get_history(
        event_type=EventType.FINDING_DISCOVERED,
        engagement_id=eng_id,
    )
    assert len(filtered) == 5


@pytest.mark.asyncio
async def test_event_to_dict():
    """Test event serialization."""
    event = Event(
        event_type=EventType.APK_INGESTED,
        source_agent="test",
        engagement_id=uuid4(),
        payload={"path": "/test.apk"},
    )
    d = event.to_dict()
    assert d["event_type"] == "apk_ingested"
    assert "event_id" in d
    assert "timestamp" in d
