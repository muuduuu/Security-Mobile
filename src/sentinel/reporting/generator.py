"""Report generator — produces security reports from engagement findings."""

from __future__ import annotations

import json
import logging
from datetime import datetime
from pathlib import Path
from typing import Any

from sentinel.models.engagement import Engagement
from sentinel.models.finding import Finding, FindingSource, Severity

logger = logging.getLogger(__name__)


class ReportGenerator:
    """Generates security reports in multiple formats."""

    def __init__(self, llm_router: Any = None) -> None:
        self._llm = llm_router

    async def generate(
        self,
        engagement: Engagement,
        findings: list[Finding],
        graph_data: dict[str, Any] | None = None,
    ) -> dict[str, str]:
        """Generate reports in all formats. Returns {format: content}."""
        reports: dict[str, str] = {}

        # Structured JSON report
        reports["json"] = self._json_report(engagement, findings)

        # Markdown report
        reports["markdown"] = await self._markdown_report(engagement, findings, graph_data)

        # SARIF report
        reports["sarif"] = self._sarif_report(engagement, findings)

        return reports

    async def _markdown_report(
        self,
        engagement: Engagement,
        findings: list[Finding],
        graph_data: dict[str, Any] | None,
    ) -> str:
        """Generate a Markdown security report."""
        lines: list[str] = []

        # Header
        lines.append(f"# Security Assessment Report")
        lines.append(f"")
        lines.append(f"**Application:** {engagement.app_name or engagement.package_name}")
        lines.append(f"**Package:** `{engagement.package_name}`")
        lines.append(f"**Version:** {engagement.version_name}")
        lines.append(f"**Hash:** `{engagement.apk_hash[:16]}...`")
        lines.append(f"**Date:** {engagement.started_at.strftime('%Y-%m-%d %H:%M UTC')}")
        lines.append(f"**Engagement ID:** `{engagement.id}`")
        lines.append(f"")

        # Executive Summary
        summary = self._compute_summary(findings)
        lines.append(f"## Executive Summary")
        lines.append(f"")

        if self._llm:
            lines.append(await self._ai_executive_summary(engagement, findings, summary))
        else:
            lines.append(self._rule_based_summary(engagement, findings, summary))

        lines.append(f"")

        # Risk matrix
        lines.append(f"### Risk Matrix")
        lines.append(f"")
        lines.append(f"| Severity | Count |")
        lines.append(f"|----------|-------|")
        for sev in ["critical", "high", "medium", "low", "info"]:
            count = summary["by_severity"].get(sev, 0)
            if count > 0:
                lines.append(f"| {sev.upper()} | {count} |")
        lines.append(f"| **TOTAL** | **{len(findings)}** |")
        lines.append(f"")

        # Findings by source
        lines.append(f"### Findings by Source")
        lines.append(f"")
        lines.append(f"| Source | Count |")
        lines.append(f"|--------|-------|")
        for source, count in summary["by_source"].items():
            lines.append(f"| {source} | {count} |")
        lines.append(f"")

        # Detailed Findings
        lines.append(f"## Findings")
        lines.append(f"")

        # Group by severity
        for sev in [Severity.CRITICAL, Severity.HIGH, Severity.MEDIUM, Severity.LOW, Severity.INFO]:
            sev_findings = [f for f in findings if f.severity == sev]
            if not sev_findings:
                continue

            lines.append(f"### {sev.value.upper()} ({len(sev_findings)})")
            lines.append(f"")

            for i, f in enumerate(sev_findings, 1):
                lines.append(f"#### {i}. {f.title}")
                lines.append(f"")
                lines.append(f"- **Category:** {f.category}")
                lines.append(f"- **Source:** {f.source.value if hasattr(f.source, 'value') else f.source}")
                lines.append(f"- **Confidence:** {f.confidence:.0%}")
                if f.file_path:
                    lines.append(f"- **File:** `{f.file_path}`" + (f":{f.line_number}" if f.line_number else ""))
                if f.cvss_score:
                    lines.append(f"- **CVSS:** {f.cvss_score}")
                lines.append(f"")
                lines.append(f"{f.description}")
                lines.append(f"")

                # Evidence
                if f.evidence:
                    lines.append(f"**Evidence:**")
                    lines.append(f"```json")
                    lines.append(json.dumps(f.evidence, indent=2, default=str)[:500])
                    lines.append(f"```")
                    lines.append(f"")

                if f.remediation:
                    lines.append(f"**Remediation:** {f.remediation}")
                    lines.append(f"")

        # Attack Chains
        chains = self._compute_attack_chains(findings)
        if chains:
            lines.append(f"## Attack Chains")
            lines.append(f"")
            for i, chain in enumerate(chains, 1):
                lines.append(f"### Chain {i}: {chain['title']}")
                lines.append(f"")
                for step in chain["steps"]:
                    lines.append(f"1. [{step['severity'].upper()}] {step['title']}")
                lines.append(f"")
                lines.append(f"**Impact:** {chain['impact']}")
                lines.append(f"")

        # OWASP Mapping
        lines.append(f"## OWASP Mobile Top 10 Mapping")
        lines.append(f"")
        lines.append(f"| Category | Findings |")
        lines.append(f"|----------|----------|")
        for cat, count in summary["by_category"].items():
            lines.append(f"| {cat} | {count} |")
        lines.append(f"")

        return "\n".join(lines)

    def _json_report(self, engagement: Engagement, findings: list[Finding]) -> str:
        report = {
            "report_type": "SENTINEL Security Assessment",
            "version": "1.0",
            "generated_at": datetime.utcnow().isoformat(),
            "engagement": {
                "id": str(engagement.id),
                "package_name": engagement.package_name,
                "app_name": engagement.app_name,
                "version": engagement.version_name,
                "hash": engagement.apk_hash,
                "started_at": engagement.started_at.isoformat(),
                "completed_at": engagement.completed_at.isoformat() if engagement.completed_at else None,
            },
            "summary": self._compute_summary(findings),
            "findings": [self._finding_to_dict(f) for f in findings],
        }
        return json.dumps(report, indent=2, default=str)

    def _sarif_report(self, engagement: Engagement, findings: list[Finding]) -> str:
        """Generate SARIF (Static Analysis Results Interchange Format)."""
        sarif = {
            "$schema": "https://raw.githubusercontent.com/oasis-tcs/sarif-spec/master/Schemata/sarif-schema-2.1.0.json",
            "version": "2.1.0",
            "runs": [{
                "tool": {
                    "driver": {
                        "name": "SENTINEL",
                        "version": "0.1.0",
                        "informationUri": "https://github.com/sentinel",
                        "rules": [
                            {
                                "id": f["category"].replace(" ", "_").upper(),
                                "shortDescription": {"text": f["category"]},
                            }
                            for f in {json.dumps({"cat": f.category}): f for f in findings}.values()
                        ],
                    }
                },
                "results": [
                    {
                        "ruleId": f.category.replace(" ", "_").upper(),
                        "level": {"critical": "error", "high": "error", "medium": "warning", "low": "note", "info": "note"}.get(f.severity.value, "warning"),
                        "message": {"text": f.description},
                        "locations": [{"physicalLocation": {"artifactLocation": {"uri": f.file_path or ""}, "region": {"startLine": f.line_number or 1}}}],
                    }
                    for f in findings
                ],
            }],
        }
        return json.dumps(sarif, indent=2, default=str)

    async def _ai_executive_summary(
        self, engagement: Engagement, findings: list[Finding], summary: dict
    ) -> str:
        """Use LLM to write an executive summary."""
        findings_text = "\n".join(
            f"- [{f.severity.value}] {f.title} ({f.category})"
            for f in sorted(findings, key=lambda x: ["critical", "high", "medium", "low", "info"].index(x.severity.value))[:15]
        )

        prompt = f"""Write a concise executive summary for this mobile app security assessment.

App: {engagement.package_name} v{engagement.version_name}
Total findings: {len(findings)}
Summary: {json.dumps(summary['by_severity'])}

Top findings:
{findings_text}

Write 2-3 paragraphs covering: overall risk posture, most critical issues, and recommended immediate actions.
Use professional security assessment language. No markdown formatting."""

        from sentinel.llm.provider import LLMMessage
        try:
            messages = [LLMMessage(role="user", content=prompt)]
            resp = await self._llm.complete(messages)
            return resp.content
        except Exception:
            return self._rule_based_summary(engagement, findings, summary)

    def _rule_based_summary(self, engagement: Engagement, findings: list[Finding], summary: dict) -> str:
        """Generate a rule-based executive summary without LLM."""
        total = len(findings)
        high_count = summary["by_severity"].get("high", 0) + summary["by_severity"].get("critical", 0)

        risk = "CRITICAL" if high_count > 5 else "HIGH" if high_count > 2 else "MEDIUM" if total > 5 else "LOW"

        return (
            f"The security assessment of **{engagement.app_name or engagement.package_name}** "
            f"(v{engagement.version_name}) identified **{total} security findings**, "
            f"of which **{high_count} are high or critical severity**. "
            f"Overall risk posture is assessed as **{risk}**. "
            f"Immediate attention is recommended for high-severity findings related to "
            f"data storage, authentication, and network communication."
        )

    def _compute_summary(self, findings: list[Finding]) -> dict[str, Any]:
        by_severity: dict[str, int] = {}
        by_source: dict[str, int] = {}
        by_category: dict[str, int] = {}

        for f in findings:
            sev = f.severity.value if hasattr(f.severity, "value") else str(f.severity)
            src = f.source.value if hasattr(f.source, "value") else str(f.source)
            by_severity[sev] = by_severity.get(sev, 0) + 1
            by_source[src] = by_source.get(src, 0) + 1
            by_category[f.category] = by_category.get(f.category, 0) + 1

        return {"total": len(findings), "by_severity": by_severity, "by_source": by_source, "by_category": by_category}

    def _compute_attack_chains(self, findings: list[Finding]) -> list[dict[str, Any]]:
        """Correlate findings into potential attack chains."""
        chains = []

        # Chain: hardcoded secrets + API endpoints + auth issues
        secrets = [f for f in findings if "secret" in f.title.lower() or "hardcoded" in f.title.lower()]
        endpoints = [f for f in findings if "endpoint" in f.title.lower() or "API" in f.title]
        ssl = [f for f in findings if "ssl" in f.title.lower() or "cleartext" in f.title.lower()]

        if secrets and endpoints:
            chains.append({
                "title": "Secret-Driven API Compromise",
                "steps": [
                    {"severity": f.severity.value, "title": f.title}
                    for f in secrets[:3]
                ] + [
                    {"severity": f.severity.value, "title": f.title}
                    for f in endpoints[:2]
                ],
                "impact": "Extracted secrets can be used to authenticate against discovered API endpoints, potentially accessing user data.",
            })

        if ssl and secrets:
            chains.append({
                "title": "Traffic Interception + Credential Harvest",
                "steps": [
                    {"severity": f.severity.value, "title": f.title}
                    for f in ssl[:2]
                ] + [
                    {"severity": f.severity.value, "title": f.title}
                    for f in secrets[:2]
                ],
                "impact": "SSL bypass allows traffic interception; hardcoded credentials in transit can be captured.",
            })

        return chains

    def _finding_to_dict(self, f: Finding) -> dict[str, Any]:
        return {
            "id": str(f.id),
            "title": f.title,
            "description": f.description,
            "severity": f.severity.value if hasattr(f.severity, "value") else str(f.severity),
            "category": f.category,
            "source": f.source.value if hasattr(f.source, "value") else str(f.source),
            "confidence": f.confidence,
            "exploitability": f.exploitability,
            "file_path": f.file_path,
            "line_number": f.line_number,
            "evidence": f.evidence,
            "remediation": f.remediation,
            "validated": f.validated,
        }
