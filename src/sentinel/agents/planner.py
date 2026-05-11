"""Planner agent — produces attack plans based on findings."""

from __future__ import annotations

import logging
from typing import Any

from sentinel.agents.base import BaseAgent
from sentinel.agents.registry import register_agent
from sentinel.core.events import Event
from sentinel.models.agent import AgentType
from sentinel.models.finding import Finding

logger = logging.getLogger(__name__)


@register_agent(AgentType.PLANNER)
class PlannerAgent(BaseAgent):
    """Analyzes findings and produces prioritized attack plans.

    Uses LLM to reason about which agents to spawn next,
    based on discovered findings and attack surface.
    """

    agent_type = AgentType.PLANNER
    capabilities = ["planning", "prioritization", "attack_graph"]

    async def plan(self, task: str, context: dict[str, Any] | None = None) -> dict[str, Any]:
        """Produce an attack plan."""
        ctx = context or {}
        findings = await self.state.get_findings()

        # Build findings summary for LLM
        findings_summary = self._summarize_findings(findings)

        plan = {
            "task": task,
            "current_findings": len(findings),
            "attack_plan": [],
        }

        # Rule-based planning (fast, no LLM needed for common patterns)
        for finding in findings:
            if finding.category and "hardcoded" in finding.category.lower():
                plan["attack_plan"].append({
                    "agent": "api_fuzzer",
                    "priority": 5,
                    "target": finding.title,
                    "reason": "Hardcoded secret discovered — test API endpoints",
                })
            if "exported" in finding.category.lower():
                plan["attack_plan"].append({
                    "agent": "dast",
                    "priority": 4,
                    "target": finding.title,
                    "reason": "Exported component — test for intent injection",
                })
            if "deep_link" in finding.category.lower():
                plan["attack_plan"].append({
                    "agent": "dast",
                    "priority": 4,
                    "target": finding.title,
                    "reason": "Deep link — test for unauthorized access",
                })

        # Sort by priority
        plan["attack_plan"].sort(key=lambda x: x["priority"], reverse=True)
        return plan

    async def execute(self, plan: dict[str, Any]) -> list[Finding]:
        """Execute the attack plan by spawning agents."""
        # In Phase 1, this is a planning-only agent
        # Agent spawning happens via the orchestrator
        return []

    async def handle_event(self, event: Event) -> None:
        if event.event_type.value == "finding_discovered":
            self._log.info(f"New finding may require plan update: {event.payload.get('title')}")

    def _summarize_findings(self, findings: list[Finding]) -> dict[str, Any]:
        summary: dict[str, Any] = {"by_severity": {}, "by_category": {}}
        for f in findings:
            summary["by_severity"][f.severity] = summary["by_severity"].get(f.severity, 0) + 1
            summary["by_category"][f.category] = summary["by_category"].get(f.category, 0) + 1
        return summary
