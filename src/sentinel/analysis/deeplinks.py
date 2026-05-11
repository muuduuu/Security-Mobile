"""Deep link analysis engine."""

from __future__ import annotations

import logging
from typing import Any

logger = logging.getLogger(__name__)


def analyze_deep_links(deep_links: list[dict[str, str]]) -> dict[str, Any]:
    """Analyze deep links for security issues."""
    issues: list[dict[str, Any]] = []
    schemes: set[str] = set()
    http_links: list[dict] = []
    custom_schemes: list[dict] = []

    for link in deep_links:
        scheme = link.get("scheme", "")
        uri = link.get("uri", "")
        component = link.get("component", "")

        schemes.add(scheme)

        if scheme in ("http", "https"):
            http_links.append(link)
        else:
            custom_schemes.append(link)

        # Check for sensitive path patterns
        path = link.get("path", "")
        sensitive_patterns = [
            ("login", "Authentication bypass potential"),
            ("auth", "Authentication bypass potential"),
            ("token", "Token manipulation potential"),
            ("admin", "Admin panel access"),
            ("reset", "Password reset flow"),
            ("payment", "Payment flow manipulation"),
            ("transfer", "Fund transfer potential"),
            ("otp", "OTP bypass potential"),
            ("pin", "PIN bypass potential"),
            ("verify", "Verification bypass"),
            ("callback", "OAuth callback hijacking"),
        ]

        for pattern, desc in sensitive_patterns:
            if pattern in path.lower():
                issues.append({
                    "title": f"Sensitive deep link path: {pattern}",
                    "severity": "high",
                    "category": "M1: Platform Misuse",
                    "uri": uri,
                    "component": component,
                    "description": f"Deep link URI '{uri}' contains '{pattern}' — {desc}",
                })
                break

    # Check for unvalidated deep links
    for link in custom_schemes:
        uri = link.get("uri", "")
        issues.append({
            "title": f"Custom scheme deep link: {uri}",
            "severity": "medium",
            "category": "M1: Platform Misuse",
            "uri": uri,
            "component": link.get("component", ""),
            "description": (
                f"Custom scheme '{link.get('scheme')}' is used. "
                "Any app can register the same scheme, leading to hijacking."
            ),
        })

    # Check for HTTP (non-HTTPS) deep links
    for link in http_links:
        if link.get("scheme") == "http":
            issues.append({
                "title": f"Insecure HTTP deep link",
                "severity": "medium",
                "category": "M3: Insecure Communication",
                "uri": link.get("uri", ""),
                "component": link.get("component", ""),
                "description": "Deep link uses HTTP instead of HTTPS — susceptible to MITM attacks.",
            })

    return {
        "total_count": len(deep_links),
        "schemes": sorted(schemes),
        "http_links": http_links,
        "custom_schemes": custom_schemes,
        "issues": issues,
    }
