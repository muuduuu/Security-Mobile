"""Frida — runtime instrumentation tool integration."""

from __future__ import annotations

import logging
from pathlib import Path

from sentinel.tools.base import BaseTool, ToolResult
from sentinel.tools.sandbox import SandboxExecutor

logger = logging.getLogger(__name__)


class FridaTool(BaseTool):
    """Frida instrumentation tool integration."""

    def __init__(self, sandbox: SandboxExecutor, frida_path: str = "frida") -> None:
        self._path = frida_path
        self._sandbox = sandbox

    @property
    def tool_name(self) -> str:
        return self._path

    @property
    def install_guide(self) -> str:
        return (
            "Install Frida:\n"
            "  - pip install frida-tools frida\n"
            "  - Download frida-server for your device:\n"
            "    https://github.com/frida/frida/releases\n"
            "  - Push to device: adb push frida-server /data/local/tmp/\n"
            "  - chmod +x and run on device"
        )

    async def check_server(self, serial: str | None = None) -> bool:
        """Check if Frida server is running on the device."""
        args = ["-H", "127.0.0.1:27042", "--version"] if not serial else ["--version"]
        result = await self._sandbox.execute(self._path, ["--version"], timeout=10)
        return result.success

    async def list_processes(self, serial: str | None = None) -> list[dict]:
        """List running processes on the device."""
        args = ["ps"]
        if serial:
            args.extend(["-U", "-H", serial])
        else:
            args.append("-U")

        result = await self._sandbox.execute(self._path + "-ps", args, timeout=15)
        if not result.success:
            return []

        processes = []
        for line in result.stdout.strip().split("\n")[1:]:
            parts = line.split()
            if len(parts) >= 2:
                processes.append({"pid": parts[0], "name": " ".join(parts[1:])})
        return processes

    async def run_script(
        self,
        package: str,
        script_path: str,
        serial: str | None = None,
    ) -> ToolResult:
        """Run a Frida script against a package."""
        args = ["-U", "-f", package, "-l", script_path, "--no-pause"]
        result = await self._sandbox.execute(self._path, args, timeout=120)
        return result
