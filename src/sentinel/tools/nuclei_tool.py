"""Nuclei — vulnerability scanner integration."""

from __future__ import annotations

import logging

from sentinel.tools.base import BaseTool, ToolResult
from sentinel.tools.sandbox import SandboxExecutor

logger = logging.getLogger(__name__)


class NucleiTool(BaseTool):
    """Nuclei vulnerability scanner integration."""

    def __init__(self, sandbox: SandboxExecutor, nuclei_path: str = "nuclei") -> None:
        self._path = nuclei_path
        self._sandbox = sandbox

    @property
    def tool_name(self) -> str:
        return self._path

    @property
    def install_guide(self) -> str:
        return (
            "Install Nuclei:\n"
            "  - https://github.com/projectdiscovery/nuclei\n"
            "  - Or: go install -v github.com/projectdiscovery/nuclei/v3/cmd/nuclei@latest\n"
            "  - Or download binary from GitHub releases"
        )

    async def scan_url(
        self,
        target: str,
        templates: str | None = None,
        output_file: str | None = None,
    ) -> ToolResult:
        """Scan a URL with Nuclei."""
        args = ["-u", target, "-silent"]
        if templates:
            args.extend(["-t", templates])
        if output_file:
            args.extend(["-o", output_file])
        return await self._sandbox.execute(self._path, args, timeout=300)

    async def scan_with_exposures(self, target: str) -> ToolResult:
        """Scan for exposed sensitive files and misconfigurations."""
        args = [
            "-u", target,
            "-t", "exposures/",
            "-t", "misconfiguration/",
            "-silent",
            "-json",
        ]
        return await self._sandbox.execute(self._path, args, timeout=300)
