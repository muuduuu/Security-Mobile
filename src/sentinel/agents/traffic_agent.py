"""Traffic analysis agent."""

from __future__ import annotations

import logging
from typing import Any

from sentinel.agents.base import BaseAgent
from sentinel.agents.registry import register_agent
from sentinel.core.events import Event
from sentinel.models.agent import AgentType
from sentinel.models.finding import Finding

logger = logging.getLogger(__name__)


@register_agent(AgentType.TRAFFIC)
class TrafficAgent(BaseAgent):
    """Traffic interception and analysis agent.

    Sets up proxy, captures traffic, and analyzes for security issues.
    """

    agent_type = AgentType.TRAFFIC
    capabilities = ["traffic_interception", "proxy", "mitmproxy"]

    async def plan(self, task: str, context: dict[str, Any] | None = None) -> dict[str, Any]:
        return {"task": task, "steps": ["setup_proxy", "capture", "analyze"]}

    async def execute(self, plan: dict[str, Any]) -> list[Finding]:
        findings: list[Finding] = []
        self._log.info("Traffic analysis agent ready (Phase 2 - proxy setup needed)")
        return findings

    async def handle_event(self, event: Event) -> None:
        pass
