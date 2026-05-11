"""APK metadata models."""

from __future__ import annotations

from typing import Any
from uuid import UUID, uuid4

from pydantic import BaseModel, Field


class APKMetadata(BaseModel):
    """Metadata extracted from an APK file."""

    id: UUID = Field(default_factory=uuid4)
    engagement_id: UUID
    file_path: str
    file_hash: str = ""
    file_size: int = 0
    package_name: str = ""
    app_name: str = ""
    version_name: str = ""
    version_code: str = ""
    min_sdk: str = ""
    target_sdk: str = ""
    max_sdk: str = ""

    # Manifest data
    permissions: list[str] = Field(default_factory=list)
    dangerous_permissions: list[str] = Field(default_factory=list)
    exported_activities: list[str] = Field(default_factory=list)
    exported_services: list[str] = Field(default_factory=list)
    exported_receivers: list[str] = Field(default_factory=list)
    exported_providers: list[str] = Field(default_factory=list)
    deep_links: list[str] = Field(default_factory=list)
    intent_filters: list[dict[str, Any]] = Field(default_factory=list)

    # Analysis results
    certificate_info: dict[str, Any] = Field(default_factory=dict)
    native_libraries: list[str] = Field(default_factory=list)
    main_activity: str = ""
    activities: list[str] = Field(default_factory=list)
    services: list[str] = Field(default_factory=list)
    receivers: list[str] = Field(default_factory=list)
    providers: list[str] = Field(default_factory=list)

    # Decompilation paths
    jadx_output_dir: str = ""
    apktool_output_dir: str = ""

    model_config = {"from_attributes": True}
