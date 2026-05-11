"""Device control agent."""

from __future__ import annotations

import logging
from typing import Any

from sentinel.agents.base import BaseAgent
from sentinel.agents.registry import register_agent
from sentinel.core.events import Event, EventType
from sentinel.models.agent import AgentType
from sentinel.models.finding import Finding

logger = logging.getLogger(__name__)


@register_agent(AgentType.DEVICE)
class DeviceAgent(BaseAgent):
    """Manages connected Android devices.

    Responsibilities:
    - Detect connected devices via ADB
    - Check root access
    - Verify Frida server
    - Deploy instrumentation
    - Configure proxy
    """

    agent_type = AgentType.DEVICE
    capabilities = ["device_management", "adb", "frida_deployment"]

    async def plan(self, task: str, context: dict[str, Any] | None = None) -> dict[str, Any]:
        return {
            "task": task,
            "steps": ["detect_devices", "check_root", "check_frida", "setup_proxy"],
        }

    async def execute(self, plan: dict[str, Any]) -> list[Finding]:
        findings: list[Finding] = []

        try:
            from sentinel.tools.adb_tool import ADBTool
            from sentinel.tools.sandbox import SandboxExecutor
            from sentinel.core.config import SandboxConfig

            sandbox = SandboxExecutor(SandboxConfig())
            adb = ADBTool(sandbox)

            if not adb.is_available():
                self._log.warning("ADB not available. Device management disabled.")
                return findings

            devices = await adb.list_devices()
            self._log.info(f"Found {len(devices)} device(s)")

            for device in devices:
                self._log.info(f"Device: {device.model} ({device.serial}) - {device.state.value}")

                if device.state.value == "connected":
                    # Check root
                    is_rooted = await adb.is_rooted(device.serial)
                    device.is_rooted = is_rooted
                    self._log.info(f"  Rooted: {is_rooted}")

                await self._emit_event(EventType.DEVICE_CONNECTED, {
                    "serial": device.serial,
                    "model": device.model,
                    "rooted": device.is_rooted,
                    "android_version": device.android_version,
                })

            await self.state.set_metadata("devices", [
                {"serial": d.serial, "model": d.model, "rooted": d.is_rooted}
                for d in devices
            ])

        except Exception as e:
            self._log.error(f"Device detection failed: {e}")

        return findings

    async def handle_event(self, event: Event) -> None:
        if event.event_type == EventType.DEVICE_CONNECTED:
            self._log.info(f"Device connected: {event.payload.get('serial')}")
