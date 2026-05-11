"""Orchestrator agent — top-level engagement coordinator."""

from __future__ import annotations

import logging
from typing import Any
from uuid import UUID

from sentinel.agents.base import BaseAgent
from sentinel.agents.registry import register_agent
from sentinel.core.events import Event, EventType
from sentinel.core.state import SharedState
from sentinel.models.agent import AgentType
from sentinel.models.engagement import Engagement, EngagementConfig, EngagementStatus
from sentinel.models.finding import Finding

logger = logging.getLogger(__name__)


@register_agent(AgentType.ORCHESTRATOR)
class OrchestratorAgent(BaseAgent):
    """Top-level agent that coordinates all other agents in an engagement.

    Lifecycle:
    1. Receive APK → create engagement
    2. Spawn APK agent → decompile & extract metadata
    3. Spawn Planner → produce attack plan
    4. Execute plan: spawn agents based on findings
    5. Correlate findings through knowledge graph
    6. Generate report
    """

    agent_type = AgentType.ORCHESTRATOR
    capabilities = ["coordination", "planning", "agent_spawning", "correlation"]

    async def plan(self, task: str, context: dict[str, Any] | None = None) -> dict[str, Any]:
        """Plan the engagement execution."""
        ctx = context or {}
        return {
            "task": task,
            "apk_path": ctx.get("apk_path", ""),
            "config": ctx.get("config", {}),
            "steps": [
                "decompile_apk",
                "analyze_manifest",
                "scan_secrets",
                "analyze_components",
                "analyze_permissions",
                "analyze_deep_links",
                "correlate_findings",
                "generate_report",
            ],
        }

    async def execute(self, plan: dict[str, Any]) -> list[Finding]:
        """Execute the engagement plan."""
        from sentinel.agents.apk_agent import APKAgent
        from sentinel.agents.sast_agent import SASTAgent

        all_findings: list[Finding] = []

        # Step 1: Decompile APK and extract metadata
        self._log.info("Phase 1: APK decomposition and analysis")
        try:
            apk_findings = await self.spawn_subagent(
                APKAgent,
                task="Decompile and analyze APK",
                context={"apk_path": plan.get("apk_path", "")},
            )
            all_findings.extend(apk_findings)
        except Exception as e:
            self._log.error(f"APK agent failed: {e}")
            await self.state.engagement.errors.append(f"APK agent error: {e}")

        # Step 2: Run SAST pipeline
        self._log.info("Phase 2: Static analysis (SAST)")
        try:
            sast_findings = await self.spawn_subagent(
                SASTAgent,
                task="Perform comprehensive static analysis",
                context={"apk_path": plan.get("apk_path", "")},
            )
            all_findings.extend(sast_findings)
        except Exception as e:
            self._log.error(f"SAST agent failed: {e}")

        # Step 3: Run DAST — API endpoint discovery and analysis
        self._log.info("Phase 3: Dynamic analysis (DAST)")
        try:
            from sentinel.agents.dast_agent import DASTAgent
            dast_findings = await self.spawn_subagent(
                DASTAgent,
                task="Dynamic analysis — endpoint discovery and API testing",
            )
            all_findings.extend(dast_findings)
        except Exception as e:
            self._log.error(f"DAST agent failed: {e}")

        # Step 4: Runtime instrumentation (if device connected)
        package_name = self.state.engagement.package_name
        if package_name:
            self._log.info("Phase 4: Runtime instrumentation")
            try:
                from sentinel.agents.frida_agent import FridaAgent
                frida_findings = await self.spawn_subagent(
                    FridaAgent,
                    task="Runtime instrumentation and hook deployment",
                    context={"package": package_name},
                )
                all_findings.extend(frida_findings)
            except Exception as e:
                self._log.error(f"Frida agent failed: {e}")

        # Step 5: Correlate findings via knowledge graph
        self._log.info(f"Phase 5: Correlating {len(all_findings)} findings")
        await self._correlate_findings(all_findings)

        # Update engagement
        self.state.engagement.status = EngagementStatus.COMPLETED
        from datetime import datetime
        self.state.engagement.completed_at = datetime.utcnow()
        self.state.engagement.findings_count = self.state.findings_summary()

        await self._emit_event(
            EventType.ENGAGEMENT_COMPLETED,
            {
                "total_findings": len(all_findings),
                "findings_by_severity": self.state.findings_summary(),
            },
        )

        return all_findings

    async def handle_event(self, event: Event) -> None:
        """React to events from other agents."""
        if event.event_type == EventType.FINDING_DISCOVERED:
            self._log.info(
                f"New finding: {event.payload.get('title', 'unknown')} "
                f"[{event.payload.get('severity', '?')}]"
            )
        elif event.event_type == EventType.AGENT_FAILED:
            self._log.error(f"Agent failed: {event.payload.get('error', 'unknown')}")

    async def _correlate_findings(self, findings: list[Finding]) -> None:
        """Cross-correlate findings in the knowledge graph."""
        for finding in findings:
            # Link findings that share components or secrets
            for other in findings:
                if finding.id == other.id:
                    continue
                # Same category or component
                if finding.category == other.category:
                    await self.state.set_metadata(
                        f"correlation:{finding.id}:{other.id}",
                        {"reason": "same_category", "category": finding.category},
                    )
                # Shared file paths
                if finding.file_path and finding.file_path == other.file_path:
                    await self.state.set_metadata(
                        f"correlation:{finding.id}:{other.id}",
                        {"reason": "shared_file", "file": finding.file_path},
                    )
