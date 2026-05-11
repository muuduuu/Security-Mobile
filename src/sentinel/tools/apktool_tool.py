"""apktool — APK resource decoding and rebuilding."""

from __future__ import annotations

import logging
from pathlib import Path

from sentinel.tools.base import BaseTool, ToolResult
from sentinel.tools.sandbox import SandboxExecutor

logger = logging.getLogger(__name__)


class ApktoolTool(BaseTool):
    """apktool integration for decoding APK resources."""

    def __init__(self, sandbox: SandboxExecutor, apktool_path: str = "apktool") -> None:
        self._path = apktool_path
        self._sandbox = sandbox

    @property
    def tool_name(self) -> str:
        return self._path

    @property
    def install_guide(self) -> str:
        return (
            "Install apktool: https://apktool.org/\n"
            "  - Download wrapper script & jar from: https://apktool.org/\n"
            "  - Or: brew install apktool (macOS)\n"
            "  - Or: scoop install apktool (Windows)\n"
            "  - Ensure 'apktool' is on your PATH"
        )

    async def decode(
        self,
        apk_path: str,
        output_dir: str | None = None,
        decode_resources: bool = True,
    ) -> ToolResult:
        """Decode an APK to smali code and resources."""
        self.require()

        apk = Path(apk_path)
        if not apk.exists():
            return ToolResult(success=False, stderr=f"APK not found: {apk_path}")

        if output_dir is None:
            output_dir = str(apk.parent / f"{apk.stem}_apktool")

        args = ["d", "-f", "-o", output_dir]
        if decode_resources:
            args.append("-r")  # Don't decode resources (keep original)
            args.pop()  # Remove -r, actually we DO want resources decoded
        args.append(str(apk))

        result = await self._sandbox.execute(self._path, args, timeout=300)
        if result.success:
            logger.info(f"apktool decode complete: {output_dir}")
        return result

    async def get_manifest(self, apk_path: str) -> str | None:
        """Decode APK and return the AndroidManifest.xml content."""
        apk = Path(apk_path)
        output_dir = str(apk.parent / f"{apk.stem}_apktool")

        result = await self.decode(apk_path, output_dir)
        if not result.success:
            return None

        manifest_path = Path(output_dir) / "AndroidManifest.xml"
        if manifest_path.exists():
            return manifest_path.read_text(encoding="utf-8")
        return None
