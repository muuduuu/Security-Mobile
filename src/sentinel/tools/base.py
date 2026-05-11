"""Base tool abstract class with auto-detection and install guidance."""

from __future__ import annotations

import logging
import shutil
from abc import ABC, abstractmethod
from dataclasses import dataclass
from typing import Any

from sentinel.core.exceptions import ToolNotAvailableError

logger = logging.getLogger(__name__)


@dataclass
class ToolResult:
    """Result from a tool execution."""

    success: bool
    stdout: str = ""
    stderr: str = ""
    return_code: int = -1
    data: dict[str, Any] | None = None
    duration: float = 0.0


class BaseTool(ABC):
    """Abstract base class for external tool integrations.

    Every tool must implement:
    - tool_name: The binary/command name
    - is_available(): Check if the tool is on PATH
    - install_guide(): Return installation instructions
    """

    @property
    @abstractmethod
    def tool_name(self) -> str:
        """The command/binary name for this tool."""

    @property
    @abstractmethod
    def install_guide(self) -> str:
        """Platform-specific installation instructions."""

    def is_available(self) -> bool:
        """Check if the tool binary exists on PATH."""
        return shutil.which(self.tool_name) is not None

    def require(self) -> None:
        """Raise if tool is not available."""
        if not self.is_available():
            raise ToolNotAvailableError(self.tool_name, self.install_guide)

    def _log_exec(self, cmd: str, args: list[str]) -> None:
        full = f"{cmd} {' '.join(args)}"
        logger.debug(f"Executing: {full}")
