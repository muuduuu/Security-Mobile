"""JADX — Dex to Java decompiler integration."""

from __future__ import annotations

import logging
from pathlib import Path

from sentinel.tools.base import BaseTool, ToolResult
from sentinel.tools.sandbox import SandboxExecutor

logger = logging.getLogger(__name__)


class JADXTool(BaseTool):
    """JADX decompiler integration for converting APK/Dex to Java source."""

    def __init__(self, sandbox: SandboxExecutor, jadx_path: str = "jadx") -> None:
        self._path = jadx_path
        self._sandbox = sandbox

    @property
    def tool_name(self) -> str:
        return self._path

    @property
    def install_guide(self) -> str:
        return (
            "Install JADX: https://github.com/skylot/jadx\n"
            "  - Download from: https://github.com/skylot/jadx/releases\n"
            "  - Or: brew install jadx (macOS)\n"
            "  - Or: scoop install jadx (Windows)\n"
            "  - Ensure 'jadx' is on your PATH"
        )

    async def decompile(
        self,
        apk_path: str,
        output_dir: str | None = None,
        show_bad_code: bool = True,
    ) -> ToolResult:
        """Decompile an APK to Java source code."""
        self.require()

        apk = Path(apk_path)
        if not apk.exists():
            return ToolResult(success=False, stderr=f"APK not found: {apk_path}")

        if output_dir is None:
            output_dir = str(apk.parent / f"{apk.stem}_jadx")

        args = [
            "--no-res",  # Skip resources for speed
            "--threads-count", "4",
            "--output-dir", output_dir,
        ]
        if show_bad_code:
            args.append("--show-bad-code")
        args.append(str(apk))

        result = await self._sandbox.execute(self._path, args, timeout=600)
        if result.success:
            logger.info(f"JADX decompilation complete: {output_dir}")
        return result

    async def decompile_with_resources(
        self,
        apk_path: str,
        output_dir: str | None = None,
    ) -> ToolResult:
        """Decompile APK including resources (manifest, res, etc.)."""
        self.require()

        apk = Path(apk_path)
        if output_dir is None:
            output_dir = str(apk.parent / f"{apk.stem}_jadx_full")

        args = [
            "--threads-count", "4",
            "--output-dir", output_dir,
            str(apk),
        ]
        return await self._sandbox.execute(self._path, args, timeout=600)

    def get_source_path(self, output_dir: str, package_name: str) -> Path:
        """Get the path to decompiled source for a package."""
        return Path(output_dir) / "sources" / package_name.replace(".", "/")
