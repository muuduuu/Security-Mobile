"""SAST agent — static analysis pipeline."""

from __future__ import annotations

import logging
from pathlib import Path
from typing import Any
from uuid import uuid4

from sentinel.agents.base import BaseAgent
from sentinel.agents.registry import register_agent
from sentinel.analysis.components import analyze_exported_components
from sentinel.analysis.deeplinks import analyze_deep_links
from sentinel.analysis.manifest import ManifestParser
from sentinel.analysis.permissions import analyze_permissions
from sentinel.analysis.secrets import SecretScanner
from sentinel.core.events import Event
from sentinel.models.agent import AgentType
from sentinel.models.finding import Finding, FindingSource, Severity

logger = logging.getLogger(__name__)


@register_agent(AgentType.SAST)
class SASTAgent(BaseAgent):
    """Comprehensive static analysis agent.

    Runs the full SAST pipeline:
    1. Manifest analysis (permissions, exported components, deep links)
    2. Secret scanning (API keys, credentials, tokens)
    3. Component analysis (exported activities, services, receivers, providers)
    4. Deep link analysis
    """

    agent_type = AgentType.SAST
    capabilities = ["sast", "manifest_analysis", "secret_scanning", "permission_analysis"]

    async def plan(self, task: str, context: dict[str, Any] | None = None) -> dict[str, Any]:
        return {
            "task": task,
            "steps": [
                "analyze_manifest",
                "scan_permissions",
                "scan_secrets",
                "analyze_components",
                "analyze_deep_links",
            ],
        }

    async def execute(self, plan: dict[str, Any]) -> list[Finding]:
        findings: list[Finding] = []

        # Get decompiled paths from shared state
        jadx_dir = await self.state.get_artifact("jadx_output_dir")
        apktool_dir = await self.state.get_artifact("apktool_output_dir")
        manifest_data = await self.state.get_metadata("manifest_data", {})
        package_name = self.state.engagement.package_name

        # Step 1: Permission analysis
        if manifest_data.get("permissions"):
            perm_analysis = analyze_permissions(manifest_data["permissions"])
            for issue in perm_analysis.get("issues", []):
                findings.append(Finding(
                    engagement_id=self.engagement_id,
                    title=issue["title"],
                    description=issue["description"],
                    severity=Severity(issue["severity"]),
                    category=issue["category"],
                    source=FindingSource.SAST,
                    confidence=0.9,
                    evidence={"permission": issue["title"], "analysis": perm_analysis},
                    remediation=issue.get("recommendation"),
                ))

        # Step 2: Exported component analysis
        if any([
            manifest_data.get("exported_activities"),
            manifest_data.get("exported_services"),
            manifest_data.get("exported_receivers"),
            manifest_data.get("exported_providers"),
        ]):
            comp_analysis = analyze_exported_components(
                manifest_data.get("exported_activities", []),
                manifest_data.get("exported_services", []),
                manifest_data.get("exported_receivers", []),
                manifest_data.get("exported_providers", []),
            )
            for issue in comp_analysis.get("issues", []):
                findings.append(Finding(
                    engagement_id=self.engagement_id,
                    title=issue["title"],
                    description=issue["description"],
                    severity=Severity(issue["severity"]),
                    category=issue["category"],
                    source=FindingSource.SAST,
                    confidence=0.85,
                    evidence={"component": issue.get("component", ""), "type": issue.get("type", "")},
                ))

        # Step 3: Deep link analysis
        if manifest_data.get("deep_links"):
            dl_analysis = analyze_deep_links(manifest_data["deep_links"])
            for issue in dl_analysis.get("issues", []):
                findings.append(Finding(
                    engagement_id=self.engagement_id,
                    title=issue["title"],
                    description=issue["description"],
                    severity=Severity(issue["severity"]),
                    category=issue["category"],
                    source=FindingSource.SAST,
                    confidence=0.8,
                    evidence={"uri": issue.get("uri", ""), "component": issue.get("component", "")},
                ))

        # Step 4: Secret scanning (if jadx output available)
        if jadx_dir and Path(jadx_dir).exists():
            scanner = SecretScanner()
            secrets = scanner.scan_directory(Path(jadx_dir) / "sources", max_files=3000)
            secrets = scanner.deduplicate(secrets)

            for secret in secrets:
                findings.append(Finding(
                    engagement_id=self.engagement_id,
                    title=f"Hardcoded secret: {secret.type}",
                    description=f"Potential {secret.type} found in source code",
                    severity=self._severity_for_secret(secret),
                    category="M2: Insecure Data Storage",
                    source=FindingSource.SAST,
                    confidence=secret.confidence,
                    evidence={
                        "type": secret.type,
                        "value_preview": secret.value[:20] + "..." if len(secret.value) > 20 else secret.value,
                        "file_path": secret.file_path,
                        "line_number": secret.line_number,
                        "line_content": secret.line_content,
                    },
                    file_path=secret.file_path,
                    line_number=secret.line_number,
                ))

        # Step 5: Debug/Backup flags
        if manifest_data.get("debuggable"):
            findings.append(Finding(
                engagement_id=self.engagement_id,
                title="Application is debuggable",
                description="android:debuggable=true in AndroidManifest.xml. Allows debugging on all devices.",
                severity=Severity.HIGH,
                category="M1: Platform Misuse",
                source=FindingSource.SAST,
                confidence=0.95,
                evidence={"flag": "debuggable", "value": True},
                remediation="Set android:debuggable=false in release builds.",
            ))

        if manifest_data.get("allow_backup"):
            findings.append(Finding(
                engagement_id=self.engagement_id,
                title="Application allows backup",
                description="android:allowBackup=true. ADB backup can extract app data.",
                severity=Severity.MEDIUM,
                category="M2: Insecure Data Storage",
                source=FindingSource.SAST,
                confidence=0.9,
                evidence={"flag": "allowBackup", "value": True},
                remediation="Set android:allowBackup=false unless explicitly needed.",
            ))

        if manifest_data.get("uses_cleartext_traffic"):
            findings.append(Finding(
                engagement_id=self.engagement_id,
                title="Application uses cleartext traffic",
                description="android:usesCleartextTraffic=true. App may send data over HTTP.",
                severity=Severity.MEDIUM,
                category="M3: Insecure Communication",
                source=FindingSource.SAST,
                confidence=0.85,
                evidence={"flag": "usesCleartextTraffic", "value": True},
                remediation="Disable cleartext traffic and use HTTPS for all communication.",
            ))

        self._log.info(f"SAST complete: {len(findings)} findings")

        # Step 8: AI-powered deep code analysis on high-interest files
        if jadx_dir and Path(jadx_dir).exists():
            ai_findings = await self._ai_code_analysis(jadx_dir, findings)
            findings.extend(ai_findings)

        return findings

    async def handle_event(self, event: Event) -> None:
        pass

    def _severity_for_secret(self, secret) -> Severity:
        """Map secret type to severity."""
        critical_types = {"private_key", "aws_access_key", "aws_secret_key"}
        high_types = {"firebase_key", "github_token", "slack_token", "stripe_key", "sendgrid_api_key"}
        if secret.type in critical_types:
            return Severity.CRITICAL
        if secret.type in high_types:
            return Severity.HIGH
        if secret.confidence >= 0.8:
            return Severity.HIGH
        return Severity.MEDIUM

    async def _ai_code_analysis(self, jadx_dir: str, existing_findings: list[Finding]) -> list[Finding]:
        """Use LLM to analyze suspicious Java files that regex might miss."""
        findings: list[Finding] = []
        sources = Path(jadx_dir) / "sources"
        if not sources.exists():
            return findings

        # Find high-interest files (auth, crypto, network, config)
        interesting_patterns = [
            "**/auth/**/*.java", "**/Auth*.java", "**/Login*.java",
            "**/crypto/**/*.java", "**/Crypto*.java", "**/Cipher*.java",
            "**/network/**/*.java", "**/Api*.java", "**/HttpClient*.java",
            "**/Config*.java", "**/BuildConfig.java",
            "**/Security*.java", "**/Certificate*.java",
            "**/SharedPreferences*.java", "**/WebView*.java",
        ]

        files_to_analyze = []
        for pattern in interesting_patterns:
            files_to_analyze.extend(sources.glob(pattern))

        # Deduplicate and limit
        seen = set()
        unique_files = []
        for f in files_to_analyze:
            if f.name not in seen:
                seen.add(f.name)
                unique_files.append(f)
        unique_files = unique_files[:15]  # Cap to avoid huge LLM calls

        if not unique_files:
            return findings

        self._log.info(f"AI analyzing {len(unique_files)} high-interest files")

        from sentinel.llm.prompts import SAST_SYSTEM_PROMPT, SAST_CODE_ANALYSIS_PROMPT

        for java_file in unique_files:
            try:
                code = java_file.read_text(encoding="utf-8", errors="replace")
            except Exception:
                continue

            # Only analyze files with actual code (skip stubs)
            if len(code) < 100 or "class " not in code:
                continue

            # Truncate to fit in context
            if len(code) > 3000:
                code = code[:3000] + "\n// ... truncated"

            prompt = SAST_CODE_ANALYSIS_PROMPT.format(
                package_name=self.state.engagement.package_name,
                file_path=str(java_file.relative_to(sources)),
                source_code=code,
            )

            response = await self.ask_llm(prompt, system=SAST_SYSTEM_PROMPT.content)
            if not response:
                continue

            # Parse LLM response for findings
            ai_findings = self._parse_ai_response(response, str(java_file))
            findings.extend(ai_findings)

        if findings:
            self._log.info(f"AI analysis found {len(findings)} additional findings")
        return findings

    def _parse_ai_response(self, response: str, file_path: str) -> list[Finding]:
        """Parse LLM analysis response into finding objects."""
        findings = []
        # Simple parsing — look for severity markers in the response
        severity_map = {"critical": Severity.CRITICAL, "high": Severity.HIGH, "medium": Severity.MEDIUM, "low": Severity.LOW}

        # Split by numbered findings
        blocks = response.split("\n\n")
        current_title = ""
        current_severity = Severity.INFO
        current_desc = ""

        for block in blocks:
            block_lower = block.lower()
            # Detect severity
            for sev_name, sev_enum in severity_map.items():
                if f"severity: {sev_name}" in block_lower or f"severity: **{sev_name}" in block_lower:
                    current_severity = sev_enum

            # Look for title patterns
            if "title:" in block_lower or "finding:" in block_lower:
                for line in block.split("\n"):
                    if "title:" in line.lower() or "finding:" in line.lower():
                        current_title = line.split(":", 1)[1].strip().strip("*").strip()

            # Look for OWASP category
            category = "M9: Reverse Engineering"
            for cat in ["M1:", "M2:", "M3:", "M4:", "M5:", "M6:", "M7:", "M8:", "M9:", "M10:"]:
                if cat in block:
                    cat_start = block.index(cat)
                    category = block[cat_start:cat_start + 40].split("\n")[0]
                    break

            # If we found a title, create a finding
            if current_title and current_severity != Severity.INFO:
                findings.append(Finding(
                    engagement_id=self.engagement_id,
                    title=current_title[:200],
                    description=block.strip()[:500],
                    severity=current_severity,
                    category=category,
                    source=FindingSource.SAST,
                    confidence=0.75,
                    evidence={"source": "ai_analysis", "file": file_path},
                    file_path=file_path,
                ))
                current_title = ""
                current_severity = Severity.INFO

        return findings[:10]  # Cap findings per file
