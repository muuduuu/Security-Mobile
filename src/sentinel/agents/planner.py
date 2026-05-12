"""Planner agent — AI-powered attack planning."""

from __future__ import annotations

import json
import logging
from typing import Any

from pydantic import BaseModel, Field

from sentinel.agents.base import BaseAgent
from sentinel.agents.registry import register_agent
from sentinel.core.events import Event
from sentinel.models.agent import AgentType
from sentinel.models.finding import Finding

logger = logging.getLogger(__name__)


class AttackStep(BaseModel):
    agent: str = Field(description="Agent type to spawn")
    target: str = Field(description="What to attack/test")
    priority: int = Field(description="1-5 priority (5 highest)")
    reason: str = Field(description="Why this attack matters")
    technique: str = Field(description="Specific technique to use")


class AttackPlan(BaseModel):
    assessment: str = Field(description="Overall security assessment summary")
    risk_level: str = Field(description="critical/high/medium/low")
    attack_steps: list[AttackStep] = Field(description="Ordered attack steps")


@register_agent(AgentType.PLANNER)
class PlannerAgent(BaseAgent):
    """AI-powered attack planner.

    Uses LLM to reason about findings and produce prioritized attack plans.
    Falls back to rule-based planning when no LLM is available.
    """

    agent_type = AgentType.PLANNER
    capabilities = ["planning", "prioritization", "attack_graph", "ai_reasoning"]

    async def plan(self, task: str, context: dict[str, Any] | None = None) -> dict[str, Any]:
        ctx = context or {}
        findings = await self.state.get_findings()
        findings_summary = self._summarize_findings(findings)

        plan = {
            "task": task,
            "current_findings": len(findings),
            "attack_plan": [],
        }

        # Try AI-powered planning first
        ai_plan = await self._ai_plan(task, findings, findings_summary)
        if ai_plan:
            plan["ai_assessment"] = ai_plan.assessment
            plan["risk_level"] = ai_plan.risk_level
            for step in ai_plan.attack_steps:
                plan["attack_plan"].append({
                    "agent": step.agent,
                    "target": step.target,
                    "priority": step.priority,
                    "reason": step.reason,
                    "technique": step.technique,
                })
            self._log.info(f"AI plan: {ai_plan.assessment[:80]}...")
        else:
            # Fallback to rule-based planning
            plan = self._rule_based_plan(plan, findings)

        plan["attack_plan"].sort(key=lambda x: x["priority"], reverse=True)
        return plan

    async def _ai_plan(
        self, task: str, findings: list[Finding], summary: dict[str, Any]
    ) -> AttackPlan | None:
        """Use LLM to produce an intelligent attack plan."""
        findings_text = "\n".join(
            f"- [{f.severity.value}] {f.title} ({f.category})" for f in findings[:30]
        )

        prompt = f"""Analyze these security findings from a mobile app pentest and create an attack plan.

Package: {self.state.engagement.package_name}
Findings ({len(findings)} total):
{findings_text}

Summary by severity: {json.dumps(summary['by_severity'])}
Summary by category: {json.dumps(summary['by_category'])}

Available agents: frida (runtime hooks), dast (dynamic testing), api_fuzzer (API fuzzing),
ssl_bypass, auth_abuse (authentication attacks), traffic (network interception), exploit (exploit validation)

Create a prioritized attack plan. Think like a red team operator."""

        system = (
            "You are a senior mobile penetration tester planning an attack. "
            "Produce specific, actionable attack steps with clear techniques. "
            "Focus on chaining findings into exploit paths."
        )

        return await self.ask_llm_structured(prompt, AttackPlan, system=system)

    def _rule_based_plan(self, plan: dict[str, Any], findings: list[Finding]) -> dict[str, Any]:
        """Fallback rule-based planning without LLM."""
        for finding in findings:
            cat = finding.category.lower()
            if "hardcoded" in cat or "secret" in cat:
                plan["attack_plan"].append({
                    "agent": "api_fuzzer", "priority": 5,
                    "target": finding.title,
                    "reason": "Hardcoded secret — fuzz discovered API endpoints",
                    "technique": "Use extracted secrets against discovered APIs",
                })
            if "exported" in cat:
                plan["attack_plan"].append({
                    "agent": "dast", "priority": 4,
                    "target": finding.title,
                    "reason": "Exported component — intent injection",
                    "technique": "Craft malicious intents targeting exported components",
                })
            if "deep_link" in cat:
                plan["attack_plan"].append({
                    "agent": "dast", "priority": 4,
                    "target": finding.title,
                    "reason": "Deep link — unauthorized access",
                    "technique": "Fuzz deep link URI parameters",
                })
            if "ssl" in cat or "certificate" in cat:
                plan["attack_plan"].append({
                    "agent": "frida", "priority": 5,
                    "target": finding.title,
                    "reason": "SSL issue — intercept traffic",
                    "technique": "Deploy Frida SSL bypass hooks",
                })
        return plan

    async def execute(self, plan: dict[str, Any]) -> list[Finding]:
        return []

    async def handle_event(self, event: Event) -> None:
        if event.event_type.value == "finding_discovered":
            self._log.info(f"New finding may require plan update: {event.payload.get('title')}")

    def _summarize_findings(self, findings: list[Finding]) -> dict[str, Any]:
        summary: dict[str, Any] = {"by_severity": {}, "by_category": {}}
        for f in findings:
            sev = f.severity.value if hasattr(f.severity, "value") else str(f.severity)
            summary["by_severity"][sev] = summary["by_severity"].get(sev, 0) + 1
            summary["by_category"][f.category] = summary["by_category"].get(f.category, 0) + 1
        return summary
