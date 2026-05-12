"""Frida agent — runtime instrumentation on rooted devices."""

from __future__ import annotations

import logging
from typing import Any

from sentinel.agents.base import BaseAgent
from sentinel.agents.registry import register_agent
from sentinel.core.events import Event, EventType
from sentinel.models.agent import AgentType
from sentinel.models.finding import Finding, FindingSource, Severity

logger = logging.getLogger(__name__)


@register_agent(AgentType.FRIDA)
class FridaAgent(BaseAgent):
    """Runtime instrumentation agent using Frida.

    Deploys and executes Frida hooks on the target app running
    on a rooted device. Captures runtime telemetry including:
    - SSL bypass results
    - Crypto operation interception
    - Auth token capture
    - Network connections
    - SharedPreferences data
    """

    agent_type = AgentType.FRIDA
    capabilities = ["frida", "runtime_hooks", "ssl_bypass", "crypto_intercept", "auth_capture"]

    async def plan(self, task: str, context: dict[str, Any] | None = None) -> dict[str, Any]:
        ctx = context or {}
        return {
            "task": task,
            "package": ctx.get("package", self.state.engagement.package_name),
            "device": ctx.get("device"),
            "hooks": [
                "ssl_bypass",
                "root_bypass",
                "crypto_intercept",
                "auth_intercept",
                "socket_monitor",
            ],
        }

    async def execute(self, plan: dict[str, Any]) -> list[Finding]:
        findings: list[Finding] = []
        package = plan.get("package", "")

        if not package:
            self._log.error("No package name available for Frida hooks")
            return findings

        from sentinel.runtime.hook_engine import HookEngine

        engine = HookEngine()
        self._log.info(f"Running {len(plan.get('hooks', []))} hooks against {package}")

        # Run SSL bypass
        self._log.info("Phase 1: SSL pinning bypass")
        ssl_result = await engine.run_ssl_bypass(package)
        if ssl_result.success:
            findings.append(Finding(
                engagement_id=self.engagement_id,
                title="SSL pinning bypass successful",
                description="Frida SSL bypass script executed. Traffic can now be intercepted.",
                severity=Severity.MEDIUM,
                category="M3: Insecure Communication",
                source=FindingSource.RUNTIME,
                confidence=0.9,
                evidence={"hook": "ssl_bypass", "output": ssl_result.output[:20]},
            ))

        # Run root bypass
        self._log.info("Phase 2: Root detection bypass")
        root_result = await engine.run_root_bypass(package)

        # Run crypto intercept
        self._log.info("Phase 3: Crypto operation interception")
        crypto_result = await engine.run_crypto_intercept(package)
        crypto_findings = self._parse_crypto_output(crypto_result.output)
        findings.extend(crypto_findings)

        # Run auth intercept
        self._log.info("Phase 4: Auth/token interception")
        auth_result = await engine.run_auth_intercept(package)
        auth_findings = self._parse_auth_output(auth_result.output)
        findings.extend(auth_findings)

        # Run socket monitor
        self._log.info("Phase 5: Network monitoring")
        socket_result = await engine.run_socket_monitor(package)
        network_findings = self._parse_network_output(socket_result.output)
        findings.extend(network_findings)

        # Phase 6: AI reasoning on runtime telemetry
        if findings:
            self._log.info("Phase 6: AI reasoning on runtime findings")
            ai_findings = await self._ai_analyze_runtime(package, findings, engine)
            findings.extend(ai_findings)

        self._log.info(f"Frida instrumentation complete: {len(findings)} runtime findings")
        return findings

    async def _ai_analyze_runtime(
        self, package: str, findings: list[Finding], engine: HookEngine
    ) -> list[Finding]:
        """Use LLM to reason about runtime findings and suggest deeper hooks."""
        ai_findings: list[Finding] = []

        findings_text = "\n".join(
            f"- [{f.severity.value}] {f.title}: {f.description[:100]}"
            for f in findings[:20]
        )

        jadx_dir = await self.state.get_artifact("jadx_output_dir")
        class_list = ""
        if jadx_dir:
            from pathlib import Path
            sources = Path(jadx_dir) / "sources"
            if sources.exists():
                classes = [f.stem for f in sources.rglob("*.java") if any(
                    kw in f.stem.lower()
                    for kw in ["auth", "login", "token", "crypto", "cipher", "secret", "api", "http", "webview"]
                )]
                class_list = ", ".join(classes[:30])

        prompt = f"""Runtime instrumentation on {package} found:

{findings_text}

Interesting classes from decompiled source: {class_list}

What additional hooks should we deploy? Are there exploit chains? What is the most critical next step?"""

        system = "You are a mobile security expert analyzing runtime results. Focus on exploit chains."

        response = await self.ask_llm(prompt, system=system)
        if response:
            ai_findings.append(Finding(
                engagement_id=self.engagement_id,
                title="AI runtime analysis: attack chain assessment",
                description=response[:1000],
                severity=Severity.MEDIUM,
                category="M9: Reverse Engineering",
                source=FindingSource.RUNTIME,
                confidence=0.7,
                evidence={"source": "ai_reasoning", "runtime_findings": len(findings)},
            ))

        return ai_findings

    async def handle_event(self, event: Event) -> None:
        pass

    def _parse_crypto_output(self, output: list[str]) -> list[Finding]:
        findings = []
        for line in output:
            if "SecretKeySpec" in line and "Key (hex)" in line:
                findings.append(Finding(
                    engagement_id=self.engagement_id,
                    title="Cryptographic key captured at runtime",
                    description=f"Frida intercepted a SecretKeySpec creation: {line.strip()}",
                    severity=Severity.HIGH,
                    category="M5: Insufficient Cryptography",
                    source=FindingSource.RUNTIME,
                    confidence=0.95,
                    evidence={"type": "crypto_key_capture", "output": line.strip()},
                ))
            elif "MessageDigest" in line and "MD5" in line:
                findings.append(Finding(
                    engagement_id=self.engagement_id,
                    title="Weak hash algorithm (MD5) detected at runtime",
                    description="Application uses MD5 for hashing, which is cryptographically weak.",
                    severity=Severity.MEDIUM,
                    category="M5: Insufficient Cryptography",
                    source=FindingSource.RUNTIME,
                    confidence=0.9,
                    evidence={"output": line.strip()},
                ))
        return findings

    def _parse_auth_output(self, output: list[str]) -> list[Finding]:
        findings = []
        for line in output:
            if "Authorization:" in line and "Bearer" in line:
                findings.append(Finding(
                    engagement_id=self.engagement_id,
                    title="Auth token captured at runtime",
                    description=f"Frida intercepted an Authorization header: {line.strip()[:80]}",
                    severity=Severity.HIGH,
                    category="M4: Insecure Authentication",
                    source=FindingSource.RUNTIME,
                    confidence=0.95,
                    evidence={"type": "auth_token_capture", "output": line.strip()[:100]},
                ))
            elif "SENSITIVE" in line and "SharedPreferences" in line:
                findings.append(Finding(
                    engagement_id=self.engagement_id,
                    title="Sensitive data stored in SharedPreferences",
                    description=f"Runtime capture: {line.strip()[:100]}",
                    severity=Severity.HIGH,
                    category="M2: Insecure Data Storage",
                    source=FindingSource.RUNTIME,
                    confidence=0.85,
                    evidence={"type": "shared_prefs_capture", "output": line.strip()},
                ))
        return findings

    def _parse_network_output(self, output: list[str]) -> list[Finding]:
        findings = []
        seen_hosts = set()
        for line in output:
            if "http://" in line and "https://" not in line:
                findings.append(Finding(
                    engagement_id=self.engagement_id,
                    title="Insecure HTTP connection detected",
                    description=f"App communicates over plaintext HTTP: {line.strip()[:100]}",
                    severity=Severity.MEDIUM,
                    category="M3: Insecure Communication",
                    source=FindingSource.RUNTIME,
                    confidence=0.9,
                    evidence={"output": line.strip()},
                ))
        return findings
