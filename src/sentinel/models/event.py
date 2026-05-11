"""Event models for persistence."""

from __future__ import annotations

from datetime import datetime
from uuid import UUID

from pydantic import BaseModel, Field

from sentinel.core.events import EventType


class EventRecord(BaseModel):
    """Persisted event record."""

    id: UUID
    event_type: EventType
    source_agent: str
    engagement_id: UUID
    payload: dict
    timestamp: datetime = Field(default_factory=datetime.utcnow)

    model_config = {"from_attributes": True}
