"""Socket monitoring hooks."""

from __future__ import annotations

import logging

from sentinel.runtime.hook_engine import HookEngine

logger = logging.getLogger(__name__)


class SocketHook:
    """Monitors network socket connections and HTTP requests."""

    def __init__(self, hook_engine: HookEngine) -> None:
        self.engine = hook_engine

    async def monitor(self, package: str) -> dict:
        """Run socket monitoring."""
        result = await self.engine.run_socket_monitor(package)
        return {
            "success": result.success,
            "output": result.output,
            "errors": result.errors,
            "connections": self._parse_connections(result.output),
        }

    def _parse_connections(self, output: list[str]) -> list[dict[str, str]]:
        """Parse discovered connections from output."""
        connections = []
        for line in output:
            if "Socket.connect" in line or "OkHttp Request" in line or "URL.openConnection" in line:
                connections.append({"raw": line.strip()})
        return connections
