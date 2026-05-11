"""Sandboxed subprocess executor for safe tool invocation."""

from __future__ import annotations

import asyncio
import logging
import time
from typing import Any

from sentinel.core.config import SandboxConfig
from sentinel.core.exceptions import SandboxError
from sentinel.tools.base import ToolResult

logger = logging.getLogger(__name__)

# Commands that are never allowed
BLOCKED_PATTERNS = [
    "rm -rf /",
    "format ",
    "del /",
    "> /dev/sd",
    "mkfs",
    "dd if=",
    ":(){ :|:& };:",
    "shutdown",
    "reboot",
]


class SandboxExecutor:
    """Sandboxed command executor.

    Enforces:
    - Command allowlist
    - CPU time limits
    - Output size limits
    - Blocked patterns
    - Audit logging
    """

    def __init__(self, config: SandboxConfig) -> None:
        self.config = config
        self._audit_log: list[dict[str, Any]] = []

    def validate_command(self, command: str, args: list[str]) -> None:
        """Validate a command against security policies."""
        full_cmd = f"{command} {' '.join(args)}"

        # Check blocked patterns
        for pattern in BLOCKED_PATTERNS:
            if pattern in full_cmd:
                raise SandboxError(f"Blocked pattern detected: {pattern}")

        # Check allowlist
        if self.config.enabled and self.config.allowed_commands:
            if command not in self.config.allowed_commands:
                raise SandboxError(
                    f"Command '{command}' not in allowlist. "
                    f"Allowed: {self.config.allowed_commands}"
                )

    async def execute(
        self,
        command: str,
        args: list[str],
        timeout: int | None = None,
        cwd: str | None = None,
        env: dict[str, str] | None = None,
    ) -> ToolResult:
        """Execute a command in a sandboxed subprocess."""
        self.validate_command(command, args)

        timeout = timeout or self.config.max_cpu_time
        start = time.monotonic()

        # Audit
        audit_entry = {
            "command": command,
            "args": args,
            "timestamp": time.time(),
        }
        self._audit_log.append(audit_entry)

        try:
            proc = await asyncio.create_subprocess_exec(
                command,
                *args,
                stdout=asyncio.subprocess.PIPE,
                stderr=asyncio.subprocess.PIPE,
                cwd=cwd,
                env=env,
            )

            try:
                stdout_bytes, stderr_bytes = await asyncio.wait_for(
                    proc.communicate(),
                    timeout=timeout,
                )
            except asyncio.TimeoutError:
                proc.kill()
                await proc.communicate()
                raise SandboxError(f"Command timed out after {timeout}s: {command}")

            duration = time.monotonic() - start
            stdout = stdout_bytes.decode("utf-8", errors="replace")
            stderr = stderr_bytes.decode("utf-8", errors="replace")

            # Truncate large outputs
            max_output = 1_000_000  # 1MB
            if len(stdout) > max_output:
                stdout = stdout[:max_output] + "\n... (truncated)"
            if len(stderr) > max_output:
                stderr = stderr[:max_output] + "\n... (truncated)"

            audit_entry.update({
                "return_code": proc.returncode,
                "duration": duration,
                "success": proc.returncode == 0,
            })

            logger.debug(f"Command completed in {duration:.2f}s: {command}")

            return ToolResult(
                success=proc.returncode == 0,
                stdout=stdout,
                stderr=stderr,
                return_code=proc.returncode or -1,
                duration=duration,
            )

        except SandboxError:
            raise
        except FileNotFoundError:
            raise SandboxError(f"Command not found: {command}")
        except Exception as e:
            raise SandboxError(f"Execution error: {e}") from e

    def get_audit_log(self, limit: int = 100) -> list[dict[str, Any]]:
        return self._audit_log[-limit:]
