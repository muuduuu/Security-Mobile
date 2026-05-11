"""API fuzzer agent."""

from __future__ import annotations

import logging
from typing import Any

from sentinel.agents.base import BaseAgent
from sentinel.agents.registry import register_agent
from sentinel.core.events import Event
from sentinel.models.agent import AgentType
from sentinel.models.finding import Finding, FindingSource, Severity

logger = logging.getLogger(__name__)


@register_agent(AgentType.API_FUZZER)
class APIFuzzerAgent(BaseAgent):
    """API fuzzing agent — discovers and fuzzes API endpoints."""

    agent_type = AgentType.API_FUZZER
    capabilities = ["api_fuzzing", "endpoint_discovery", "sqli", "xss", "ssrf"]

    async def plan(self, task: str, context: dict[str, Any] | None = None) -> dict[str, Any]:
        return {"task": task, "steps": ["discover", "fuzz", "report"]}

    async def execute(self, plan: dict[str, Any]) -> list[Finding]:
        findings: list[Finding] = []

        # Get discovered endpoints from shared state
        endpoints = await self.state.get_metadata("discovered_endpoints", [])
        base_url = await self.state.get_metadata("backend_url", "")

        if not base_url or not endpoints:
            self._log.info("No endpoints or base URL available for fuzzing")
            return findings

        self._log.info(f"Fuzzing {len(endpoints)} endpoints against {base_url}")

        from sentinel.dast.fuzzer import APIFuzzer

        fuzzer = APIFuzzer(base_url)
        results = await fuzzer.fuzz_all_endpoints(endpoints)

        interesting = fuzzer.get_results(interesting_only=True)
        for result in interesting:
            findings.append(Finding(
                engagement_id=self.engagement_id,
                title=f"Fuzzing anomaly: {result.payload_type} on {result.endpoint}",
                description=(
                    f"Payload type: {result.payload_type}, "
                    f"Status: {result.status_code}, "
                    f"Evidence: {result.evidence}"
                ),
                severity=Severity.MEDIUM,
                category="M8: Security Decisions Via Untrusted Inputs",
                source=FindingSource.DAST,
                confidence=0.7,
                evidence={
                    "endpoint": result.endpoint,
                    "method": result.method,
                    "payload_type": result.payload_type,
                    "payload": result.payload,
                    "status_code": result.status_code,
                    "evidence": result.evidence,
                },
            ))

        return findings

    async def handle_event(self, event: Event) -> None:
        pass
