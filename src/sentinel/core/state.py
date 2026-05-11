"""Shared engagement state management."""

from __future__ import annotations

import asyncio
from dataclasses import dataclass, field
from typing import Any
from uuid import UUID

from sentinel.models.finding import Finding
from sentinel.models.engagement import Engagement


@dataclass
class SharedState:
    """Thread-safe shared state for an engagement.

    All agents read/write findings, metadata, and observations here.
    """

    engagement: Engagement
    findings: list[Finding] = field(default_factory=list)
    metadata: dict[str, Any] = field(default_factory=dict)
    artifacts: dict[str, str] = field(default_factory=dict)  # name → file path
    _lock: asyncio.Lock = field(default_factory=asyncio.Lock, repr=False)

    async def add_finding(self, finding: Finding) -> None:
        async with self._lock:
            self.findings.append(finding)

    async def get_findings(
        self,
        severity: str | None = None,
        source: str | None = None,
        category: str | None = None,
    ) -> list[Finding]:
        async with self._lock:
            results = self.findings
            if severity:
                results = [f for f in results if f.severity == severity]
            if source:
                results = [f for f in results if f.source == source]
            if category:
                results = [f for f in results if f.category == category]
            return results

    async def set_artifact(self, name: str, path: str) -> None:
        async with self._lock:
            self.artifacts[name] = path

    async def get_artifact(self, name: str) -> str | None:
        async with self._lock:
            return self.artifacts.get(name)

    async def set_metadata(self, key: str, value: Any) -> None:
        async with self._lock:
            self.metadata[key] = value

    async def get_metadata(self, key: str, default: Any = None) -> Any:
        async with self._lock:
            return self.metadata.get(key, default)

    def findings_summary(self) -> dict[str, int]:
        """Return count of findings by severity."""
        summary: dict[str, int] = {}
        for f in self.findings:
            summary[f.severity] = summary.get(f.severity, 0) + 1
        return summary
