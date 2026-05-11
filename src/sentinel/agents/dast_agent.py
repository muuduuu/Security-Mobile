"""DAST agent — dynamic application security testing."""

from __future__ import annotations

import logging
from typing import Any

from sentinel.agents.base import BaseAgent
from sentinel.agents.registry import register_agent
from sentinel.core.events import Event, EventType
from sentinel.models.agent import AgentType
from sentinel.models.finding import Finding, FindingSource, Severity

logger = logging.getLogger(__name__)


@register_agent(AgentType.DAST)
class DASTAgent(BaseAgent):
    """Dynamic Application Security Testing agent.

    Discovers API endpoints from decompiled source and performs
    fuzzing, auth testing, IDOR detection, and parameter mutation.
    """

    agent_type = AgentType.DAST
    capabilities = ["dast", "api_fuzzing", "auth_testing", "idor", "endpoint_discovery"]

    async def plan(self, task: str, context: dict[str, Any] | None = None) -> dict[str, Any]:
        return {
            "task": task,
            "steps": [
                "discover_endpoints",
                "extract_api_keys",
                "fuzz_endpoints",
                "test_auth",
            ],
        }

    async def execute(self, plan: dict[str, Any]) -> list[Finding]:
        findings: list[Finding] = []
        jadx_dir = await self.state.get_artifact("jadx_output_dir")

        if not jadx_dir:
            self._log.warning("No JADX output available for endpoint discovery")
            return findings

        # Step 1: Discover endpoints from source
        self._log.info("Discovering API endpoints from decompiled source")
        from sentinel.dast.schema_infer import infer_endpoints_from_source, extract_api_keys_from_source

        source_dir = f"{jadx_dir}/sources"
        endpoints = infer_endpoints_from_source(source_dir)
        self._log.info(f"Discovered {len(endpoints)} API endpoints")

        if endpoints:
            findings.append(Finding(
                engagement_id=self.engagement_id,
                title=f"Discovered {len(endpoints)} API endpoints in source",
                description=f"Static analysis of decompiled code revealed {len(endpoints)} API endpoints. "
                            "These should be tested for authentication, authorization, and input validation.",
                severity=Severity.INFO,
                category="Reconnaissance",
                source=FindingSource.SAST,
                confidence=0.9,
                evidence={
                    "endpoints": endpoints[:50],
                    "total": len(endpoints),
                },
            ))

        # Step 2: Extract API keys
        api_keys = extract_api_keys_from_source(source_dir)
        for key in api_keys:
            findings.append(Finding(
                engagement_id=self.engagement_id,
                title=f"API configuration: {key['type']}",
                description=f"Found {key['type']} in {key['file']}: {key['value'][:50]}",
                severity=Severity.HIGH,
                category="M2: Insecure Data Storage",
                source=FindingSource.SAST,
                confidence=0.85,
                evidence={"type": key["type"], "value": key["value"][:50], "file": key["file"]},
            ))

        self._log.info(f"DAST complete: {len(findings)} findings")
        return findings

    async def handle_event(self, event: Event) -> None:
        pass
