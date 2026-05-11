"""Auth interception hooks."""

from __future__ import annotations

import logging

from sentinel.runtime.hook_engine import HookEngine

logger = logging.getLogger(__name__)


class AuthHook:
    """Hooks authentication-related methods to capture tokens and credentials."""

    def __init__(self, hook_engine: HookEngine) -> None:
        self.engine = hook_engine

    async def intercept_auth(self, package: str) -> dict:
        """Run auth interception hooks."""
        result = await self.engine.run_auth_intercept(package)
        return {
            "success": result.success,
            "output": result.output,
            "errors": result.errors,
            "tokens_captured": self._extract_tokens(result.output),
        }

    async def intercept_crypto(self, package: str) -> dict:
        """Run crypto interception hooks."""
        result = await self.engine.run_crypto_intercept(package)
        return {
            "success": result.success,
            "output": result.output,
            "errors": result.errors,
            "crypto_operations": self._extract_crypto(result.output),
        }

    def _extract_tokens(self, output: list[str]) -> list[dict[str, str]]:
        """Extract captured tokens from hook output."""
        tokens = []
        for line in output:
            if "Authorization:" in line or "token" in line.lower():
                tokens.append({"line": line.strip(), "type": "auth_header"})
            if "Cookie:" in line:
                tokens.append({"line": line.strip(), "type": "cookie"})
        return tokens

    def _extract_crypto(self, output: list[str]) -> list[dict[str, str]]:
        """Extract crypto operations from hook output."""
        ops = []
        for line in output:
            if "Cipher" in line or "MessageDigest" in line:
                ops.append({"operation": line.strip()})
        return ops
