"""IDOR detection engine."""

from __future__ import annotations

import logging
from typing import Any

import httpx

logger = logging.getLogger(__name__)


class IDORTester:
    """Tests for Insecure Direct Object Reference vulnerabilities."""

    def __init__(self, base_url: str, timeout: int = 10) -> None:
        self.base_url = base_url.rstrip("/")
        self.timeout = timeout

    async def test_idor(
        self,
        endpoint: str,
        param_name: str,
        valid_value: str,
        auth_token: str | None = None,
        method: str = "GET",
    ) -> list[dict[str, Any]]:
        """Test for IDOR by iterating through parameter values."""
        from sentinel.dast.mutator import mutate_parameter

        mutations = mutate_parameter(valid_value, "idor")
        results = []

        async with httpx.AsyncClient(timeout=self.timeout, verify=False) as client:
            # First get baseline response
            headers = {}
            if auth_token:
                headers["Authorization"] = f"Bearer {auth_token}"

            url = f"{self.base_url}{endpoint}"
            try:
                baseline = await client.request(
                    method, url, params={param_name: valid_value}, headers=headers
                )
                baseline_length = len(baseline.content)
                baseline_hash = hash(baseline.text)
            except Exception:
                return results

            # Test mutations
            for value in mutations:
                try:
                    resp = await client.request(
                        method, url, params={param_name: value}, headers=headers
                    )
                    resp_length = len(resp.content)
                    resp_hash = hash(resp.text)

                    # Different response = potential IDOR
                    different = resp_hash != baseline_hash and resp.status_code == 200
                    results.append({
                        "endpoint": endpoint,
                        "param": param_name,
                        "original_value": valid_value,
                        "test_value": value,
                        "status": resp.status_code,
                        "response_different": different,
                        "baseline_length": baseline_length,
                        "test_length": resp_length,
                    })
                except Exception as e:
                    results.append({
                        "endpoint": endpoint,
                        "param": param_name,
                        "test_value": value,
                        "error": str(e),
                    })

        return results
