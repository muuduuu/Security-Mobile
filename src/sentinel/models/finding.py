"""Vulnerability finding models."""

from __future__ import annotations

from datetime import datetime
from enum import Enum
from typing import Any
from uuid import UUID, uuid4

from pydantic import BaseModel, Field


class Severity(str, Enum):
    CRITICAL = "critical"
    HIGH = "high"
    MEDIUM = "medium"
    LOW = "low"
    INFO = "info"


class FindingSource(str, Enum):
    SAST = "sast"
    DAST = "dast"
    RUNTIME = "runtime"
    MANUAL = "manual"


class Finding(BaseModel):
    """A security finding discovered during an engagement."""

    id: UUID = Field(default_factory=uuid4)
    engagement_id: UUID
    title: str
    description: str
    severity: Severity
    category: str  # OWASP Mobile Top 10 category
    source: FindingSource
    confidence: float = Field(default=0.5, ge=0.0, le=1.0)
    evidence: dict[str, Any] = Field(default_factory=dict)
    exploitability: float = Field(default=0.0, ge=0.0, le=1.0)
    cvss_vector: str | None = None
    cvss_score: float | None = None
    remediation: str | None = None
    exploit_chain: list[UUID] | None = None
    validated: bool = False
    file_path: str | None = None
    line_number: int | None = None
    discovered_at: datetime = Field(default_factory=datetime.utcnow)
    metadata: dict[str, Any] = Field(default_factory=dict)

    model_config = {"from_attributes": True}


class FindingCreate(BaseModel):
    """Schema for creating a new finding."""

    title: str
    description: str
    severity: Severity
    category: str
    source: FindingSource
    confidence: float = 0.5
    evidence: dict[str, Any] = Field(default_factory=dict)
    file_path: str | None = None
    line_number: int | None = None
