"""Authentication testing engine."""

from __future__ import annotations

import asyncio
import logging
from typing import Any

import httpx

logger = logging.getLogger(__name__)


class AuthTester:
    """Tests authentication mechanisms for common vulnerabilities."""

    def __init__(self, base_url: str, timeout: int = 10) -> None:
        self.base_url = base_url.rstrip("/")
        self.timeout = timeout

    async def test_no_auth(self, endpoints: list[dict[str, str]]) -> list[dict[str, Any]]:
        """Test if endpoints are accessible without authentication."""
        results = []
        async with httpx.AsyncClient(timeout=self.timeout, verify=False) as client:
            for ep in endpoints:
                url = f"{self.base_url}{ep['path']}"
                try:
                    resp = await client.request(ep.get("method", "GET"), url)
                    if resp.status_code == 200:
                        results.append({
                            "endpoint": ep["path"],
                            "method": ep.get("method", "GET"),
                            "status": resp.status_code,
                            "accessible_without_auth": True,
                            "response_length": len(resp.content),
                        })
                except Exception as e:
                    results.append({"endpoint": ep["path"], "error": str(e)})
        return results

    async def test_token_reuse(
        self, endpoint: str, token: str, method: str = "GET"
    ) -> dict[str, Any]:
        """Test if an auth token can be reused from a different context."""
        headers = {"Authorization": f"Bearer {token}"}

        async with httpx.AsyncClient(timeout=self.timeout, verify=False) as client:
            url = f"{self.base_url}{endpoint}"
            try:
                resp = await client.request(method, url, headers=headers)
                return {
                    "endpoint": endpoint,
                    "status": resp.status_code,
                    "token_valid": resp.status_code == 200,
                    "response_length": len(resp.content),
                }
            except Exception as e:
                return {"endpoint": endpoint, "error": str(e)}

    async def test_rate_limit(
        self, endpoint: str, method: str = "GET", num_requests: int = 50
    ) -> dict[str, Any]:
        """Test for rate limiting on an endpoint."""
        statuses = []
        async with httpx.AsyncClient(timeout=self.timeout, verify=False) as client:
            url = f"{self.base_url}{endpoint}"
            tasks = []
            for _ in range(num_requests):
                tasks.append(client.request(method, url))

            responses = await asyncio.gather(*tasks, return_exceptions=True)
            for resp in responses:
                if isinstance(resp, httpx.Response):
                    statuses.append(resp.status_code)
                else:
                    statuses.append(0)

        unique_statuses = set(statuses)
        rate_limited = 429 in unique_statuses
        return {
            "endpoint": endpoint,
            "total_requests": num_requests,
            "rate_limited": rate_limited,
            "status_codes": {str(s): statuses.count(s) for s in unique_statuses},
        }
