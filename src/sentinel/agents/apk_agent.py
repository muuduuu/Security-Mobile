"""APK reverse engineering agent."""

from __future__ import annotations

import hashlib
import logging
from pathlib import Path
from typing import Any

from sentinel.agents.base import BaseAgent
from sentinel.agents.registry import register_agent
from sentinel.analysis.manifest import ManifestParser
from sentinel.core.events import Event, EventType
from sentinel.models.agent import AgentType
from sentinel.models.finding import Finding

logger = logging.getLogger(__name__)


@register_agent(AgentType.APK)
class APKAgent(BaseAgent):
    """APK reverse engineering and metadata extraction agent.

    Responsible for:
    - Decompiling APK using JADX and apktool
    - Parsing AndroidManifest.xml
    - Extracting APK metadata
    - Storing artifacts in shared state
    """

    agent_type = AgentType.APK
    capabilities = ["apk_decompilation", "manifest_parsing", "metadata_extraction"]

    async def plan(self, task: str, context: dict[str, Any] | None = None) -> dict[str, Any]:
        ctx = context or {}
        apk_path = ctx.get("apk_path", self.state.engagement.apk_path)
        return {
            "task": task,
            "apk_path": apk_path,
            "steps": [
                "validate_apk",
                "compute_hash",
                "decompile_jadx",
                "decompile_apktool",
                "parse_manifest",
                "store_metadata",
            ],
        }

    async def execute(self, plan: dict[str, Any]) -> list[Finding]:
        """Execute APK analysis pipeline."""
        findings: list[Finding] = []
        apk_path = plan.get("apk_path", "")
        apk = Path(apk_path)

        if not apk.exists():
            self._log.error(f"APK not found: {apk_path}")
            return findings

        # Step 1: Compute hash
        file_hash = self._hash_file(apk)
        self.state.engagement.apk_hash = file_hash

        # Step 2: Try decompilation with available tools
        jadx_dir = None
        apktool_dir = None

        # Try Androguard first (pure Python, always available)
        await self._analyze_with_androguard(apk_path)

        # Try JADX
        try:
            from sentinel.tools.jadx_tool import JADXTool
            from sentinel.tools.sandbox import SandboxExecutor
            from sentinel.core.config import SandboxConfig

            sandbox = SandboxExecutor(SandboxConfig())
            jadx = JADXTool(sandbox)
            if jadx.is_available():
                result = await jadx.decompile(apk_path)
                if result.success:
                    jadx_dir = str(apk.parent / f"{apk.stem}_jadx")
                    await self.state.set_artifact("jadx_output_dir", jadx_dir)
                    self._log.info(f"JADX output: {jadx_dir}")
        except Exception as e:
            self._log.warning(f"JADX decompilation failed (non-critical): {e}")

        # Try apktool
        try:
            from sentinel.tools.apktool_tool import ApktoolTool

            apktool = ApktoolTool(sandbox)
            if apktool.is_available():
                manifest = await apktool.get_manifest(apk_path)
                if manifest:
                    apktool_dir = str(apk.parent / f"{apk.stem}_apktool")
                    await self.state.set_artifact("apktool_output_dir", apktool_dir)
        except Exception as e:
            self._log.warning(f"apktool failed (non-critical): {e}")

        # Step 3: Parse manifest
        manifest_data = {}
        manifest_path = await self._find_manifest(apk_path, jadx_dir, apktool_dir)
        if manifest_path:
            try:
                parser = ManifestParser(manifest_path)
                manifest_data = parser.parse()

                # Store manifest data in shared state
                await self.state.set_metadata("manifest_data", manifest_data)

                # Update engagement
                self.state.engagement.package_name = manifest_data.get("package_name", "")
                self.state.engagement.app_name = manifest_data.get("app_name", "")
                self.state.engagement.version_name = manifest_data.get("version_name", "")

                self._log.info(
                    f"Manifest parsed: {manifest_data.get('package_name')} "
                    f"v{manifest_data.get('version_name', '?')}"
                )
            except Exception as e:
                self._log.error(f"Manifest parsing failed: {e}")

        await self._emit_event(EventType.APK_DECOMPILED, {
            "package_name": self.state.engagement.package_name,
            "hash": file_hash,
            "jadx_available": jadx_dir is not None,
            "apktool_available": apktool_dir is not None,
        })

        return findings

    async def handle_event(self, event: Event) -> None:
        pass

    async def _analyze_with_androguard(self, apk_path: str) -> None:
        """Use Androguard for basic APK analysis (pure Python fallback)."""
        try:
            from androguard.core.apk import APK

            apk = APK(apk_path)
            self.state.engagement.package_name = apk.get_package()
            self.state.engagement.app_name = apk.get_app_name()
            self.state.engagement.version_name = apk.get_androidversion_name()
            self.state.engagement.version_code = apk.get_androidversion_code()

            # Store manifest-level data
            await self.state.set_metadata("manifest_data", {
                "package_name": apk.get_package(),
                "app_name": apk.get_app_name(),
                "version_name": apk.get_androidversion_name() or "",
                "version_code": apk.get_androidversion_code() or "",
                "min_sdk": str(apk.get_min_sdk_version() or ""),
                "target_sdk": str(apk.get_target_sdk_version() or ""),
                "max_sdk": str(apk.get_max_sdk_version() or ""),
                "permissions": apk.get_permissions(),
                "activities": apk.get_activities(),
                "services": apk.get_services(),
                "receivers": apk.get_receivers(),
                "providers": apk.get_providers(),
                "main_activity": apk.get_main_activity() or "",
                "deep_links": [],  # Populated by manifest parser
                "exported_activities": [],  # Populated by manifest parser
                "exported_services": [],
                "exported_receivers": [],
                "exported_providers": [],
            })

            self._log.info(f"Androguard analysis: {apk.get_package()} v{apk.get_androidversion_name()}")
        except ImportError:
            self._log.warning("Androguard not available. Install: pip install androguard")
        except Exception as e:
            self._log.warning(f"Androguard analysis failed: {e}")

    async def _find_manifest(self, apk_path: str, jadx_dir: str | None, apktool_dir: str | None) -> str | None:
        """Find the AndroidManifest.xml from decompiled output."""
        apk = Path(apk_path)

        # Check apktool output first (cleaner XML)
        if apktool_dir:
            manifest = Path(apktool_dir) / "AndroidManifest.xml"
            if manifest.exists():
                return str(manifest)

        # Check JADX output
        if jadx_dir:
            manifest = Path(jadx_dir) / "resources" / "AndroidManifest.xml"
            if manifest.exists():
                return str(manifest)

        return None

    @staticmethod
    def _hash_file(path: Path) -> str:
        """Compute SHA256 hash of a file."""
        h = hashlib.sha256()
        with open(path, "rb") as f:
            for chunk in iter(lambda: f.read(8192), b""):
                h.update(chunk)
        return h.hexdigest()
