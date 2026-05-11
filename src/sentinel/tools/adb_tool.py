"""ADB — Android Debug Bridge integration."""

from __future__ import annotations

import logging
import re
from typing import Any

from sentinel.models.device import Device, DeviceState
from sentinel.tools.base import BaseTool, ToolResult
from sentinel.tools.sandbox import SandboxExecutor

logger = logging.getLogger(__name__)


class ADBTool(BaseTool):
    """ADB integration for device management."""

    def __init__(self, sandbox: SandboxExecutor, adb_path: str = "adb") -> None:
        self._path = adb_path
        self._sandbox = sandbox

    @property
    def tool_name(self) -> str:
        return self._path

    @property
    def install_guide(self) -> str:
        return (
            "Install ADB (Android Debug Bridge):\n"
            "  - Install Android SDK Platform Tools:\n"
            "    https://developer.android.com/tools/releases/platform-tools\n"
            "  - Or: brew install android-platform-tools (macOS)\n"
            "  - Or: scoop install adb (Windows)\n"
            "  - Ensure 'adb' is on your PATH"
        )

    async def execute_adb(self, args: list[str], timeout: int = 30) -> ToolResult:
        """Execute an ADB command."""
        self.require()
        return await self._sandbox.execute(self._path, args, timeout=timeout)

    async def list_devices(self) -> list[Device]:
        """List connected Android devices."""
        result = await self.execute_adb(["devices", "-l"])
        if not result.success:
            return []

        devices = []
        lines = result.stdout.strip().split("\n")
        for line in lines[1:]:  # Skip "List of devices attached"
            line = line.strip()
            if not line:
                continue

            parts = line.split()
            if len(parts) < 2:
                continue

            serial = parts[0]
            state_str = parts[1]

            state_map = {
                "device": DeviceState.CONNECTED,
                "unauthorized": DeviceState.UNAUTHORIZED,
                "offline": DeviceState.OFFLINE,
            }
            state = state_map.get(state_str, DeviceState.DISCONNECTED)

            model = ""
            android_ver = ""
            sdk_ver = ""
            props: dict[str, str] = {}

            for part in parts[2:]:
                if "=" in part:
                    key, _, value = part.partition("=")
                    props[key] = value
                    if key == "model":
                        model = value
                    elif key == "product":
                        pass

            if state == DeviceState.CONNECTED:
                # Get more details
                model = await self._get_prop(serial, "ro.product.model") or model
                android_ver = await self._get_prop(serial, "ro.build.version.release") or android_ver
                sdk_ver = await self._get_prop(serial, "ro.build.version.sdk") or sdk_ver

            devices.append(Device(
                serial=serial,
                model=model,
                android_version=android_ver,
                sdk_version=sdk_ver,
                state=state,
                properties=props,
            ))

        return devices

    async def _get_prop(self, serial: str, prop: str) -> str | None:
        result = await self.execute_adb(["-s", serial, "shell", "getprop", prop])
        if result.success:
            return result.stdout.strip()
        return None

    async def is_rooted(self, serial: str) -> bool:
        """Check if a device is rooted."""
        result = await self.execute_adb(["-s", serial, "shell", "which", "su"])
        if result.success and result.stdout.strip():
            return True
        result = await self.execute_adb(["-s", serial, "shell", "su", "-c", "id"])
        return result.success and "uid=0" in result.stdout

    async def install_apk(self, serial: str, apk_path: str) -> ToolResult:
        """Install an APK on a device."""
        return await self.execute_adb(["-s", serial, "install", "-r", apk_path], timeout=120)

    async def uninstall(self, serial: str, package: str) -> ToolResult:
        """Uninstall a package from a device."""
        return await self.execute_adb(["-s", serial, "uninstall", package])

    async def shell(self, serial: str, command: str, timeout: int = 30) -> ToolResult:
        """Execute a shell command on the device."""
        return await self.execute_adb(["-s", serial, "shell", command], timeout=timeout)

    async def push(self, serial: str, local: str, remote: str) -> ToolResult:
        """Push a file to the device."""
        return await self.execute_adb(["-s", serial, "push", local, remote])

    async def pull(self, serial: str, remote: str, local: str) -> ToolResult:
        """Pull a file from the device."""
        return await self.execute_adb(["-s", serial, "pull", remote, local])

    async def forward(self, serial: str, local_port: int, remote_port: int) -> ToolResult:
        """Set up port forwarding."""
        return await self.execute_adb([
            "-s", serial, "forward",
            f"tcp:{local_port}", f"tcp:{remote_port}",
        ])

    async def logcat(self, serial: str, args: list[str] | None = None) -> ToolResult:
        """Capture logcat output (limited duration)."""
        cmd_args = ["-s", serial, "logcat", "-d"]
        if args:
            cmd_args.extend(args)
        return await self.execute_adb(cmd_args, timeout=30)

    async def grant_permission(self, serial: str, package: str, permission: str) -> ToolResult:
        """Grant a runtime permission."""
        return await self.execute_adb([
            "-s", serial, "shell", "pm", "grant", package, permission,
        ])

    async def get_package_info(self, serial: str, package: str) -> dict[str, Any]:
        """Get package information from device."""
        result = await self.execute_adb(["-s", serial, "shell", "dumpsys", "package", package])
        info: dict[str, Any] = {"raw": result.stdout}
        if result.success:
            permissions = re.findall(r"android.permission\.\w+", result.stdout)
            info["permissions"] = list(set(permissions))
        return info
