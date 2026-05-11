"""Crypto operation interception hooks."""

from __future__ import annotations

import logging

from sentinel.runtime.hook_engine import HookEngine

logger = logging.getLogger(__name__)


class CryptoHook:
    """Intercepts cryptographic operations via Frida."""

    def __init__(self, hook_engine: HookEngine) -> None:
        self.engine = hook_engine

    async def intercept(self, package: str) -> dict:
        """Run crypto interception."""
        result = await self.engine.run_crypto_intercept(package)
        return {
            "success": result.success,
            "output": result.output,
            "errors": result.errors,
        }
