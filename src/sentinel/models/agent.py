"""Agent state models."""

from __future__ import annotations

from datetime import datetime
from enum import Enum
from typing import Any
from uuid import UUID, uuid4

from pydantic import BaseModel, Field


class AgentState(str, Enum):
    CREATED = "created"
    PLANNING = "planning"
    RUNNING = "running"
    WAITING = "waiting"
    COMPLETED = "completed"
    FAILED = "failed"


class AgentType(str, Enum):
    ORCHESTRATOR = "orchestrator"
    PLANNER = "planner"
    SAST = "sast"
    DAST = "dast"
    FRIDA = "frida"
    API_FUZZER = "api_fuzzer"
    TRAFFIC = "traffic"
    EXPLOIT = "exploit"
    REPORT = "report"
    KNOWLEDGE = "knowledge"
    DEVICE = "device"
    APK = "apk"
    SSL = "ssl"
    AUTH = "auth"
    LLM = "llm"


class AgentStatus(BaseModel):
    """Current status of an agent instance."""

    id: UUID = Field(default_factory=uuid4)
    agent_type: AgentType
    engagement_id: UUID
    state: AgentState = AgentState.CREATED
    task: str = ""
    started_at: datetime = Field(default_factory=datetime.utcnow)
    completed_at: datetime | None = None
    findings_count: int = 0
    error: str | None = None
    metadata: dict[str, Any] = Field(default_factory=dict)

    model_config = {"from_attributes": True}
