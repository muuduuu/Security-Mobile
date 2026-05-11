"""Tests for agent framework."""

import asyncio
from uuid import uuid4

import pytest

from sentinel.agents.base import BaseAgent
from sentinel.core.events import Event, EventBus, EventType
from sentinel.core.state import SharedState
from sentinel.models.agent import AgentState, AgentType
from sentinel.models.engagement import Engagement
from sentinel.models.finding import Finding, FindingSource, Severity


class SimpleTestAgent(BaseAgent):
    """Minimal agent for testing the framework."""

    agent_type = AgentType.SAST
    capabilities = ["test"]

    async def plan(self, task, context=None):
        return {"task": task}

    async def execute(self, plan):
        return [
            Finding(
                engagement_id=self.engagement_id,
                title="Test Finding",
                description="A test finding",
                severity=Severity.HIGH,
                category="Test",
                source=FindingSource.SAST,
            )
        ]

    async def handle_event(self, event):
        pass


@pytest.mark.asyncio
async def test_agent_lifecycle(event_bus, shared_state):
    """Test agent created → planning → running → completed lifecycle."""
    agent = SimpleTestAgent(
        engagement_id=shared_state.engagement.id,
        event_bus=event_bus,
        shared_state=shared_state,
    )

    assert agent.status.state == AgentState.CREATED

    findings = await agent.run(task="test task")

    assert agent.status.state == AgentState.COMPLETED
    assert len(findings) == 1
    assert findings[0].title == "Test Finding"


@pytest.mark.asyncio
async def test_agent_publishes_events(event_bus, shared_state):
    """Test agent publishes events during lifecycle."""
    events = []

    async def capture(event: Event):
        events.append(event)

    await event_bus.subscribe_all(capture)

    agent = SimpleTestAgent(
        engagement_id=shared_state.engagement.id,
        event_bus=event_bus,
        shared_state=shared_state,
    )
    await agent.run("test")

    event_types = [e.event_type for e in events]
    assert EventType.AGENT_SPAWNED in event_types
    assert EventType.FINDING_DISCOVERED in event_types
    assert EventType.AGENT_COMPLETED in event_types


@pytest.mark.asyncio
async def test_shared_state_findings(event_bus, shared_state):
    """Test findings are stored in shared state."""
    agent = SimpleTestAgent(
        engagement_id=shared_state.engagement.id,
        event_bus=event_bus,
        shared_state=shared_state,
    )
    await agent.run("test")

    findings = await shared_state.get_findings()
    assert len(findings) == 1


@pytest.mark.asyncio
async def test_shared_state_filtering(event_bus, shared_state):
    """Test finding filtering by severity and source."""
    agent = SimpleTestAgent(
        engagement_id=shared_state.engagement.id,
        event_bus=event_bus,
        shared_state=shared_state,
    )
    await agent.run("test")

    high_findings = await shared_state.get_findings(severity="high")
    assert len(high_findings) == 1

    low_findings = await shared_state.get_findings(severity="low")
    assert len(low_findings) == 0


@pytest.mark.asyncio
async def test_shared_state_summary(event_bus, shared_state):
    """Test findings summary."""
    agent = SimpleTestAgent(
        engagement_id=shared_state.engagement.id,
        event_bus=event_bus,
        shared_state=shared_state,
    )
    await agent.run("test")

    summary = shared_state.findings_summary()
    assert "high" in summary
    assert summary["high"] == 1
