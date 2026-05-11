"""Configuration management for SENTINEL."""

from __future__ import annotations

import os
from pathlib import Path
from typing import Literal

from pydantic import Field
from pydantic_settings import BaseSettings, SettingsConfigDict


class LLMConfig(BaseSettings):
    """LLM provider configuration."""

    model_config = SettingsConfigDict(env_prefix="SENTINEL_LLM_")

    provider: Literal["anthropic", "openai", "local"] = "anthropic"
    anthropic_api_key: str = ""
    anthropic_base_url: str = ""  # Custom endpoint (e.g. https://api.z.ai/api/anthropic)
    anthropic_model: str = "claude-sonnet-4-20250514"
    openai_api_key: str = ""
    openai_base_url: str = ""  # Custom endpoint (e.g. https://api.your-proxy.com/v1)
    openai_model: str = "gpt-4o"
    local_base_url: str = "http://localhost:11434"
    local_model: str = "llama3"
    max_tokens: int = 4096
    temperature: float = 0.1
    timeout: int = 120


class DBConfig(BaseSettings):
    """Database configuration."""

    model_config = SettingsConfigDict(env_prefix="SENTINEL_DB_")

    url: str = "sqlite+aiosqlite:///sentinel.db"
    echo: bool = False


class ToolConfig(BaseSettings):
    """External tool configuration."""

    model_config = SettingsConfigDict(env_prefix="SENTINEL_TOOL_")

    jadx_path: str = "jadx"
    apktool_path: str = "apktool"
    adb_path: str = "adb"
    frida_path: str = "frida"
    aapt_path: str = "aapt"
    timeout: int = 300


class SandboxConfig(BaseSettings):
    """Sandbox execution configuration."""

    model_config = SettingsConfigDict(env_prefix="SENTINEL_SANDBOX_")

    enabled: bool = True
    max_cpu_time: int = 300
    max_memory_mb: int = 2048
    allowed_commands: list[str] = Field(
        default=[
            "jadx", "apktool", "adb", "aapt", "frida", "frida-ps",
            "objection", "nuclei", "java", "keytool", "jarsigner",
        ]
    )


class SentinelConfig(BaseSettings):
    """Main SENTINEL configuration."""

    model_config = SettingsConfigDict(
        env_prefix="SENTINEL_",
        env_nested_delimiter="__",
    )

    workspace: Path = Field(default=Path.home() / ".sentinel" / "workspace")
    llm: LLMConfig = Field(default_factory=LLMConfig)
    db: DBConfig = Field(default_factory=DBConfig)
    tools: ToolConfig = Field(default_factory=ToolConfig)
    sandbox: SandboxConfig = Field(default_factory=SandboxConfig)
    log_level: Literal["DEBUG", "INFO", "WARNING", "ERROR"] = "INFO"
    debug: bool = False

    def ensure_workspace(self) -> Path:
        """Create workspace directory if it doesn't exist."""
        self.workspace.mkdir(parents=True, exist_ok=True)
        return self.workspace


def load_config() -> SentinelConfig:
    """Load configuration from environment variables and defaults."""
    config = SentinelConfig()
    config.ensure_workspace()
    return config
