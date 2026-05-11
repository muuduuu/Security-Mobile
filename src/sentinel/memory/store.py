"""SQLite-based persistent store for findings and engagements."""

from __future__ import annotations

import json
import logging
from datetime import datetime
from pathlib import Path
from typing import Any
from uuid import UUID

import aiosqlite

from sentinel.core.config import SentinelConfig
from sentinel.models.engagement import Engagement, EngagementStatus
from sentinel.models.finding import Finding, Severity

logger = logging.getLogger(__name__)

SCHEMA = """
CREATE TABLE IF NOT EXISTS engagements (
    id TEXT PRIMARY KEY,
    apk_path TEXT NOT NULL,
    apk_hash TEXT DEFAULT '',
    package_name TEXT DEFAULT '',
    app_name TEXT DEFAULT '',
    version_name TEXT DEFAULT '',
    status TEXT DEFAULT 'created',
    config TEXT DEFAULT '{}',
    started_at TEXT NOT NULL,
    completed_at TEXT,
    agents_spawned TEXT DEFAULT '[]',
    findings_count TEXT DEFAULT '{}',
    attack_surface TEXT DEFAULT '{}',
    errors TEXT DEFAULT '[]'
);

CREATE TABLE IF NOT EXISTS findings (
    id TEXT PRIMARY KEY,
    engagement_id TEXT NOT NULL,
    title TEXT NOT NULL,
    description TEXT DEFAULT '',
    severity TEXT NOT NULL,
    category TEXT DEFAULT '',
    source TEXT DEFAULT '',
    confidence REAL DEFAULT 0.5,
    evidence TEXT DEFAULT '{}',
    exploitability REAL DEFAULT 0.0,
    cvss_vector TEXT,
    cvss_score REAL,
    remediation TEXT,
    validated INTEGER DEFAULT 0,
    file_path TEXT,
    line_number INTEGER,
    discovered_at TEXT NOT NULL,
    metadata TEXT DEFAULT '{}',
    FOREIGN KEY (engagement_id) REFERENCES engagements(id)
);

CREATE TABLE IF NOT EXISTS apk_metadata (
    id TEXT PRIMARY KEY,
    engagement_id TEXT NOT NULL,
    file_path TEXT NOT NULL,
    file_hash TEXT DEFAULT '',
    package_name TEXT DEFAULT '',
    app_name TEXT DEFAULT '',
    version_name TEXT DEFAULT '',
    permissions TEXT DEFAULT '[]',
    exported_activities TEXT DEFAULT '[]',
    exported_services TEXT DEFAULT '[]',
    exported_receivers TEXT DEFAULT '[]',
    exported_providers TEXT DEFAULT '[]',
    deep_links TEXT DEFAULT '[]',
    jadx_output_dir TEXT DEFAULT '',
    apktool_output_dir TEXT DEFAULT '',
    FOREIGN KEY (engagement_id) REFERENCES engagements(id)
);

CREATE INDEX IF NOT EXISTS idx_findings_engagement ON findings(engagement_id);
CREATE INDEX IF NOT EXISTS idx_findings_severity ON findings(severity);
"""


class Store:
    """Async SQLite store for SENTINEL data."""

    def __init__(self, config: SentinelConfig) -> None:
        self._config = config
        self._db_path = str(config.workspace / "sentinel.db")
        self._db: aiosqlite.Connection | None = None

    async def initialize(self) -> None:
        """Initialize the database and create tables."""
        Path(self._db_path).parent.mkdir(parents=True, exist_ok=True)
        self._db = await aiosqlite.connect(self._db_path)
        self._db.row_factory = aiosqlite.Row
        await self._db.executescript(SCHEMA)
        await self._db.commit()
        logger.info(f"Store initialized: {self._db_path}")

    async def close(self) -> None:
        if self._db:
            await self._db.close()

    @property
    def db(self) -> aiosqlite.Connection:
        assert self._db is not None, "Store not initialized"
        return self._db

    # --- Engagements ---

    async def save_engagement(self, engagement: Engagement) -> None:
        await self.db.execute(
            """INSERT OR REPLACE INTO engagements
            (id, apk_path, apk_hash, package_name, app_name, version_name,
             status, config, started_at, completed_at, agents_spawned,
             findings_count, attack_surface, errors)
            VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)""",
            (
                str(engagement.id), engagement.apk_path, engagement.apk_hash,
                engagement.package_name, engagement.app_name, engagement.version_name,
                engagement.status.value, engagement.config.model_dump_json(),
                engagement.started_at.isoformat(),
                engagement.completed_at.isoformat() if engagement.completed_at else None,
                json.dumps(engagement.agents_spawned),
                json.dumps(engagement.findings_count),
                json.dumps(engagement.attack_surface),
                json.dumps(engagement.errors),
            ),
        )
        await self.db.commit()

    async def get_engagement(self, engagement_id: UUID) -> Engagement | None:
        cursor = await self.db.execute(
            "SELECT * FROM engagements WHERE id = ?", (str(engagement_id),)
        )
        row = await cursor.fetchone()
        if row is None:
            return None
        return self._row_to_engagement(row)

    async def list_engagements(self, limit: int = 50) -> list[Engagement]:
        cursor = await self.db.execute(
            "SELECT * FROM engagements ORDER BY started_at DESC LIMIT ?", (limit,)
        )
        rows = await cursor.fetchall()
        return [self._row_to_engagement(r) for r in rows]

    # --- Findings ---

    async def save_finding(self, finding: Finding) -> None:
        await self.db.execute(
            """INSERT OR REPLACE INTO findings
            (id, engagement_id, title, description, severity, category, source,
             confidence, evidence, exploitability, cvss_vector, cvss_score,
             remediation, validated, file_path, line_number, discovered_at, metadata)
            VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)""",
            (
                str(finding.id), str(finding.engagement_id),
                finding.title, finding.description, finding.severity.value,
                finding.category, finding.source.value, finding.confidence,
                json.dumps(finding.evidence), finding.exploitability,
                finding.cvss_vector, finding.cvss_score,
                finding.remediation, 1 if finding.validated else 0,
                finding.file_path, finding.line_number,
                finding.discovered_at.isoformat(),
                json.dumps(finding.metadata),
            ),
        )
        await self.db.commit()

    async def get_findings(
        self,
        engagement_id: UUID,
        severity: str | None = None,
        limit: int = 200,
    ) -> list[Finding]:
        query = "SELECT * FROM findings WHERE engagement_id = ?"
        params: list[Any] = [str(engagement_id)]
        if severity:
            query += " AND severity = ?"
            params.append(severity)
        query += " ORDER BY discovered_at DESC LIMIT ?"
        params.append(limit)

        cursor = await self.db.execute(query, params)
        rows = await cursor.fetchall()
        return [self._row_to_finding(r) for r in rows]

    async def get_findings_count(self, engagement_id: UUID) -> dict[str, int]:
        cursor = await self.db.execute(
            "SELECT severity, COUNT(*) as count FROM findings WHERE engagement_id = ? GROUP BY severity",
            (str(engagement_id),),
        )
        rows = await cursor.fetchall()
        return {row["severity"]: row["count"] for row in rows}

    # --- Helpers ---

    def _row_to_engagement(self, row: aiosqlite.Row) -> Engagement:
        return Engagement(
            id=UUID(row["id"]),
            apk_path=row["apk_path"],
            apk_hash=row["apk_hash"] or "",
            package_name=row["package_name"] or "",
            app_name=row["app_name"] or "",
            version_name=row["version_name"] or "",
            status=EngagementStatus(row["status"]),
            started_at=datetime.fromisoformat(row["started_at"]),
            completed_at=datetime.fromisoformat(row["completed_at"]) if row["completed_at"] else None,
            agents_spawned=json.loads(row["agents_spawned"] or "[]"),
            findings_count=json.loads(row["findings_count"] or "{}"),
            attack_surface=json.loads(row["attack_surface"] or "{}"),
            errors=json.loads(row["errors"] or "[]"),
        )

    def _row_to_finding(self, row: aiosqlite.Row) -> Finding:
        return Finding(
            id=UUID(row["id"]),
            engagement_id=UUID(row["engagement_id"]),
            title=row["title"],
            description=row["description"] or "",
            severity=Severity(row["severity"]),
            category=row["category"] or "",
            source=row["source"] or "sast",
            confidence=row["confidence"] or 0.5,
            evidence=json.loads(row["evidence"] or "{}"),
            exploitability=row["exploitability"] or 0.0,
            cvss_vector=row["cvss_vector"],
            cvss_score=row["cvss_score"],
            remediation=row["remediation"],
            validated=bool(row["validated"]),
            file_path=row["file_path"],
            line_number=row["line_number"],
            discovered_at=datetime.fromisoformat(row["discovered_at"]),
            metadata=json.loads(row["metadata"] or "{}"),
        )
