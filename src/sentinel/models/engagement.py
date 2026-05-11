"""Engagement models."""

from __future__ import annotations

from datetime import datetime
from enum import Enum
from typing import Any
from uuid import UUID, uuid4

from pydantic import BaseModel, Field

from sentinel.models.finding import Severity


class EngagementStatus(str, Enum):
    CREATED = "created"
    ANALYZING = "analyzing"
    RUNNING = "running"
    COMPLETED = "completed"
    FAILED = "failed"
    PAUSED = "paused"


class EngagementConfig(BaseModel):
    """Configuration for an engagement."""

    enable_sast: bool = True
    enable_dast: bool = False
    enable_runtime: bool = False
    target_device: str | None = None
    max_agents: int = 10
    auto_exploit: bool = False
    proxy_port: int = 8080
    frida_enabled: bool = False


class Engagement(BaseModel):
    """A pentest engagement session."""

    id: UUID = Field(default_factory=uuid4)
    apk_path: str
    apk_hash: str = ""
    package_name: str = ""
    app_name: str = ""
    version_name: str = ""
    version_code: str = ""
    min_sdk: str = ""
    target_sdk: str = ""
    status: EngagementStatus = EngagementStatus.CREATED
    config: EngagementConfig = Field(default_factory=EngagementConfig)
    started_at: datetime = Field(default_factory=datetime.utcnow)
    completed_at: datetime | None = None
    agents_spawned: list[str] = Field(default_factory=list)
    findings_count: dict[str, int] = Field(default_factory=dict)
    attack_surface: dict[str, Any] = Field(default_factory=dict)
    errors: list[str] = Field(default_factory=list)

    model_config = {"from_attributes": True}
