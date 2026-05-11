"""Knowledge graph agent — manages the attack knowledge graph."""

from __future__ import annotations

import logging
from typing import Any

from sentinel.agents.base import BaseAgent
from sentinel.agents.registry import register_agent
from sentinel.core.events import Event, EventType
from sentinel.models.agent import AgentType
from sentinel.models.finding import Finding

logger = logging.getLogger(__name__)


@register_agent(AgentType.KNOWLEDGE)
class KnowledgeAgent(BaseAgent):
    """Maintains and queries the knowledge graph.

    Adds findings, components, and secrets as graph nodes.
    Creates edges to represent relationships.
    Answers queries about attack paths.
    """

    agent_type = AgentType.KNOWLEDGE
    capabilities = ["knowledge_graph", "attack_path_analysis", "correlation"]

    async def plan(self, task: str, context: dict[str, Any] | None = None) -> dict[str, Any]:
        return {"task": task, "steps": ["sync_graph", "compute_paths", "generate_report_data"]}

    async def execute(self, plan: dict[str, Any]) -> list[Finding]:
        """Sync findings to knowledge graph and compute attack paths."""
        findings = await self.state.get_findings()

        # Access graph through engine (injected by orchestrator)
        # For Phase 1, store correlation metadata
        for finding in findings:
            await self.state.set_metadata(
                f"graph:finding:{finding.id}",
                {
                    "severity": finding.severity,
                    "category": finding.category,
                    "source": finding.source,
                    "file": finding.file_path,
                },
            )

        self._log.info(f"Synced {len(findings)} findings to knowledge graph")
        return []

    async def handle_event(self, event: Event) -> None:
        if event.event_type == EventType.FINDING_DISCOVERED:
            self._log.debug(f"Recording finding in knowledge graph: {event.payload}")
