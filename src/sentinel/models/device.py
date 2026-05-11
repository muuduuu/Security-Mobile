"""Device models."""

from __future__ import annotations

from enum import Enum
from typing import Any
from uuid import UUID, uuid4

from pydantic import BaseModel, Field


class DeviceState(str, Enum):
    CONNECTED = "connected"
    UNAUTHORIZED = "unauthorized"
    OFFLINE = "offline"
    READY = "ready"
    DISCONNECTED = "disconnected"


class Device(BaseModel):
    """An Android device connected via ADB."""

    id: UUID = Field(default_factory=uuid4)
    serial: str
    model: str = ""
    android_version: str = ""
    sdk_version: str = ""
    is_rooted: bool = False
    state: DeviceState = DeviceState.CONNECTED
    frida_installed: bool = False
    properties: dict[str, str] = Field(default_factory=dict)

    model_config = {"from_attributes": True}
