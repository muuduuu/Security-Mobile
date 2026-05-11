"""Report models."""

from __future__ import annotations

from datetime import datetime
from enum import Enum
from typing import Any
from uuid import UUID, uuid4

from pydantic import BaseModel, Field

from sentinel.models.finding import Finding


class ReportFormat(str, Enum):
    MARKDOWN = "markdown"
    HTML = "html"
    JSON = "json"
    PDF = "pdf"
    SARIF = "sarif"


class Report(BaseModel):
    """Generated security report."""

    id: UUID = Field(default_factory=uuid4)
    engagement_id: UUID
    title: str = ""
    format: ReportFormat = ReportFormat.MARKDOWN
    generated_at: datetime = Field(default_factory=datetime.utcnow)
    findings: list[Finding] = Field(default_factory=list)
    summary: dict[str, Any] = Field(default_factory=dict)
    exploit_chains: list[dict[str, Any]] = Field(default_factory=list)
    content: str = ""

    model_config = {"from_attributes": True}
