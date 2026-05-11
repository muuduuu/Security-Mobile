"""SSL bypass automation."""

from __future__ import annotations

import logging
from pathlib import Path

from sentinel.runtime.hook_engine import HookEngine

logger = logging.getLogger(__name__)


class SSLBypass:
    """Automated SSL pinning bypass via Frida."""

    def __init__(self, hook_engine: HookEngine) -> None:
        self.engine = hook_engine

    async def bypass(self, package: str) -> dict:
        """Run SSL bypass and return results."""
        result = await self.engine.run_ssl_bypass(package)
        return {
            "success": result.success,
            "output": result.output,
            "errors": result.errors,
            "package": package,
        }
