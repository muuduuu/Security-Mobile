"""mitmproxy integration for traffic interception."""

from __future__ import annotations

import logging

from sentinel.tools.base import BaseTool, ToolResult
from sentinel.tools.sandbox import SandboxExecutor

logger = logging.getLogger(__name__)


class MitmproxyTool(BaseTool):
    """mitmproxy integration for HTTP/HTTPS traffic interception."""

    def __init__(self, sandbox: SandboxExecutor, mitmdump_path: str = "mitmdump") -> None:
        self._path = mitmdump_path
        self._sandbox = sandbox

    @property
    def tool_name(self) -> str:
        return self._path

    @property
    def install_guide(self) -> str:
        return (
            "Install mitmproxy:\n"
            "  - pip install mitmproxy\n"
            "  - Or: brew install mitmproxy (macOS)\n"
            "  - Or download from: https://mitmproxy.org/"
        )

    async def capture_traffic(
        self,
        output_file: str,
        listen_port: int = 8080,
        target_host: str | None = None,
        timeout: int = 300,
    ) -> ToolResult:
        """Capture HTTP/HTTPS traffic to a file."""
        args = [
            "-w", output_file,
            "--listen-port", str(listen_port),
            "--set", "block_global=false",
        ]
        if target_host:
            args.extend(["--set", f"view_filter=~d {target_host}"])
        return await self._sandbox.execute(self._path, args, timeout=timeout)

    async def replay_traffic(self, input_file: str) -> ToolResult:
        """Replay captured traffic."""
        args = ["-n", "-r", input_file]
        return await self._sandbox.execute(self._path, args, timeout=60)
