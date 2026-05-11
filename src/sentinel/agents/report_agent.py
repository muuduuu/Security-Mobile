"""Reporting agent."""

from __future__ import annotations

import logging
from typing import Any

from sentinel.agents.base import BaseAgent
from sentinel.agents.registry import register_agent
from sentinel.core.events import Event
from sentinel.models.agent import AgentType
from sentinel.models.finding import Finding

logger = logging.getLogger(__name__)


@register_agent(AgentType.REPORT)
class ReportAgent(BaseAgent):
    """Generates security reports from engagement findings."""

    agent_type = AgentType.REPORT
    capabilities = ["report_generation", "markdown", "exploit_chains"]

    async def plan(self, task: str, context: dict[str, Any] | None = None) -> dict[str, Any]:
        return {"task": task, "steps": ["collect_findings", "correlate", "generate_report"]}

    async def execute(self, plan: dict[str, Any]) -> list[Finding]:
        return []

    async def handle_event(self, event: Event) -> None:
        pass
