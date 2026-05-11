"""Frida hook orchestration engine."""

from __future__ import annotations

import asyncio
import json
import logging
from dataclasses import dataclass, field
from pathlib import Path
from typing import Any

from sentinel.core.exceptions import AgentError

logger = logging.getLogger(__name__)

SCRIPTS_DIR = Path(__file__).parent.parent.parent.parent / "frida_scripts"


@dataclass
class HookResult:
    """Result from a Frida hook execution."""

    script_name: str
    package: str
    output: list[str] = field(default_factory=list)
    errors: list[str] = field(default_factory=list)
    duration: float = 0.0
    success: bool = False


class HookEngine:
    """Orchestrates Frida hooks against a target application.

    Manages:
    - Loading pre-built scripts from frida_scripts/
    - Generating dynamic hooks based on analysis
    - Executing hooks via Frida CLI
    - Collecting and parsing output
    """

    def __init__(self, frida_path: str = "frida") -> None:
        self._frida_path = frida_path
        self._results: list[HookResult] = []

    def get_script_path(self, name: str) -> Path | None:
        """Find a pre-built script by name."""
        script = SCRIPTS_DIR / f"{name}.js"
        return script if script.exists() else None

    def list_available_scripts(self) -> list[dict[str, str]]:
        """List all pre-built Frida scripts."""
        scripts = []
        if SCRIPTS_DIR.exists():
            for f in SCRIPTS_DIR.glob("*.js"):
                scripts.append({
                    "name": f.stem,
                    "path": str(f),
                    "size": f.stat().st_size,
                })
        return scripts

    async def run_hook(
        self,
        package: str,
        script_path: str,
        device_serial: str | None = None,
        timeout: int = 30,
    ) -> HookResult:
        """Run a Frida script against a package on a connected device."""
        result = HookResult(script_name=Path(script_path).stem, package=package)

        args = ["-U", "-f", package, "-l", script_path, "--no-pause"]
        if device_serial:
            args = ["-H", device_serial] + args

        try:
            proc = await asyncio.create_subprocess_exec(
                self._frida_path, *args,
                stdout=asyncio.subprocess.PIPE,
                stderr=asyncio.subprocess.PIPE,
            )

            try:
                stdout, stderr = await asyncio.wait_for(
                    proc.communicate(), timeout=timeout
                )
                result.output = stdout.decode("utf-8", errors="replace").strip().split("\n")
                result.errors = stderr.decode("utf-8", errors="replace").strip().split("\n")
                result.success = True
            except asyncio.TimeoutError:
                proc.kill()
                await proc.communicate()
                result.errors = [f"Hook timed out after {timeout}s"]
                # Partial output is still useful
                result.success = False

        except FileNotFoundError:
            result.errors = ["Frida not found. Install: pip install frida-tools"]
        except Exception as e:
            result.errors = [str(e)]

        self._results.append(result)
        return result

    async def run_prebuilt(
        self,
        package: str,
        script_name: str,
        timeout: int = 30,
    ) -> HookResult:
        """Run a pre-built Frida script by name."""
        path = self.get_script_path(script_name)
        if path is None:
            return HookResult(
                script_name=script_name,
                package=package,
                errors=[f"Script not found: {script_name}.js"],
            )
        return await self.run_hook(package, str(path), timeout=timeout)

    async def run_ssl_bypass(self, package: str) -> HookResult:
        """Run SSL pinning bypass."""
        return await self.run_prebuilt(package, "ssl_bypass", timeout=20)

    async def run_root_bypass(self, package: str) -> HookResult:
        """Run root detection bypass."""
        return await self.run_prebuilt(package, "root_bypass", timeout=20)

    async def run_crypto_intercept(self, package: str) -> HookResult:
        """Run crypto operation interception."""
        return await self.run_prebuilt(package, "crypto_intercept", timeout=30)

    async def run_auth_intercept(self, package: str) -> HookResult:
        """Run auth/token interception."""
        return await self.run_prebuilt(package, "auth_intercept", timeout=30)

    async def run_socket_monitor(self, package: str) -> HookResult:
        """Run socket/network monitoring."""
        return await self.run_prebuilt(package, "socket_monitor", timeout=30)

    async def run_all_hooks(self, package: str) -> list[HookResult]:
        """Run all pre-built hooks sequentially."""
        results = []
        hooks = [
            ("ssl_bypass", self.run_ssl_bypass),
            ("root_bypass", self.run_root_bypass),
            ("crypto_intercept", self.run_crypto_intercept),
            ("auth_intercept", self.run_auth_intercept),
            ("socket_monitor", self.run_socket_monitor),
        ]
        for name, hook_fn in hooks:
            logger.info(f"Running hook: {name}")
            result = await hook_fn(package)
            results.append(result)
        return results

    def get_results(self) -> list[HookResult]:
        return self._results
