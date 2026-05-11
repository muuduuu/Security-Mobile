"""Base agent abstract class with full lifecycle management."""

from __future__ import annotations

import logging
from abc import ABC, abstractmethod
from datetime import datetime
from typing import Any
from uuid import UUID, uuid4

from sentinel.core.events import Event, EventBus, EventType
from sentinel.core.state import SharedState
from sentinel.models.agent import AgentState, AgentStatus, AgentType
from sentinel.models.finding import Finding

logger = logging.getLogger(__name__)


class BaseAgent(ABC):
    """Abstract base class for all SENTINEL agents.

    Lifecycle: CREATED → PLANNING → RUNNING → (WAITING → RUNNING)* → COMPLETED | FAILED

    Subclasses must implement:
    - plan(): Analyze context and produce an execution plan
    - execute(): Run the plan and return findings
    - handle_event(): React to events from other agents
    """

    agent_type: AgentType = AgentType.ORCHESTRATOR
    capabilities: list[str] = []

    def __init__(
        self,
        engagement_id: UUID,
        event_bus: EventBus,
        shared_state: SharedState,
        agent_id: UUID | None = None,
    ) -> None:
        self.id = agent_id or uuid4()
        self.engagement_id = engagement_id
        self.event_bus = event_bus
        self.state = shared_state
        self.status = AgentStatus(
            id=self.id,
            agent_type=self.agent_type,
            engagement_id=engagement_id,
            state=AgentState.CREATED,
        )
        self._findings: list[Finding] = []
        self._log = logging.getLogger(f"sentinel.agent.{self.agent_type.value}")

    @abstractmethod
    async def plan(self, task: str, context: dict[str, Any] | None = None) -> dict[str, Any]:
        """Analyze the task and produce an execution plan.

        Returns a plan dict describing what the agent will do.
        """

    @abstractmethod
    async def execute(self, plan: dict[str, Any]) -> list[Finding]:
        """Execute the plan and return discovered findings."""

    @abstractmethod
    async def handle_event(self, event: Event) -> None:
        """Handle an event from another agent or the system."""

    async def run(self, task: str, context: dict[str, Any] | None = None) -> list[Finding]:
        """Full agent lifecycle: plan → execute → report."""
        try:
            # Planning phase
            self._set_state(AgentState.PLANNING)
            await self._emit_event(EventType.AGENT_SPAWNED, {"task": task})
            plan = await self.plan(task, context)
            self._log.info(f"Plan produced: {plan}")

            # Execution phase
            self._set_state(AgentState.RUNNING)
            findings = await self.execute(plan)

            # Store findings
            for finding in findings:
                await self.state.add_finding(finding)
                await self._emit_event(
                    EventType.FINDING_DISCOVERED,
                    {
                        "finding_id": str(finding.id),
                        "severity": finding.severity,
                        "category": finding.category,
                        "title": finding.title,
                    },
                )

            self._findings.extend(findings)
            self.status.findings_count = len(self._findings)
            self._set_state(AgentState.COMPLETED)
            await self._emit_event(
                EventType.AGENT_COMPLETED,
                {"findings_count": len(findings)},
            )
            return findings

        except Exception as e:
            self._log.error(f"Agent failed: {e}")
            self.status.error = str(e)
            self._set_state(AgentState.FAILED)
            await self._emit_event(EventType.AGENT_FAILED, {"error": str(e)})
            raise

    async def spawn_subagent(
        self,
        agent_cls: type[BaseAgent],
        task: str,
        context: dict[str, Any] | None = None,
    ) -> list[Finding]:
        """Spawn a child agent and wait for its results."""
        child = agent_cls(
            engagement_id=self.engagement_id,
            event_bus=self.event_bus,
            shared_state=self.state,
        )
        self._log.info(f"Spawning sub-agent: {child.agent_type.value}")
        return await child.run(task, context)

    def _set_state(self, new_state: AgentState) -> None:
        old = self.status.state
        self.status.state = new_state
        if new_state == AgentState.COMPLETED:
            self.status.completed_at = datetime.utcnow()
        self._log.debug(f"State: {old.value} → {new_state.value}")

    async def _emit_event(self, event_type: EventType, payload: dict[str, Any]) -> None:
        event = Event(
            event_type=event_type,
            source_agent=self.agent_type.value,
            engagement_id=self.engagement_id,
            payload=payload,
        )
        await self.event_bus.publish(event)
