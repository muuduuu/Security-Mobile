"""Exported component analysis."""

from __future__ import annotations

import logging
from typing import Any

logger = logging.getLogger(__name__)


def analyze_exported_components(
    activities: list[dict],
    services: list[dict],
    receivers: list[dict],
    providers: list[dict],
) -> dict[str, Any]:
    """Analyze exported components for security issues."""
    issues: list[dict[str, Any]] = []

    for activity in activities:
        issues.extend(_check_component(activity, "activity"))

    for service in services:
        issues.extend(_check_component(service, "service"))

    for receiver in receivers:
        issues.extend(_check_component(receiver, "receiver"))

    for provider in providers:
        issues.extend(_check_component(provider, "provider"))
        issues.extend(_check_content_provider(provider))

    return {
        "total_exported": len(activities) + len(services) + len(receivers) + len(providers),
        "exported_activities": len(activities),
        "exported_services": len(services),
        "exported_receivers": len(receivers),
        "exported_providers": len(providers),
        "issues": issues,
    }


def _check_component(component: dict[str, Any], comp_type: str) -> list[dict[str, Any]]:
    """Check a single component for security issues."""
    issues = []
    name = component.get("name", "unknown")

    # Exported activity without protection
    if comp_type == "activity" and component.get("has_intent_filter"):
        issues.append({
            "title": f"Exported activity with intent filter: {_short_name(name)}",
            "severity": "medium",
            "category": "M1: Platform Misuse",
            "component": name,
            "type": comp_type,
            "description": (
                f"Activity {_short_name(name)} is exported and has intent filters. "
                "This may allow unauthorized access or data leakage."
            ),
        })

    # Exported service
    if comp_type == "service":
        issues.append({
            "title": f"Exported service: {_short_name(name)}",
            "severity": "high",
            "category": "M1: Platform Misuse",
            "component": name,
            "type": comp_type,
            "description": (
                f"Service {_short_name(name)} is exported. Other apps can start/bind to it."
            ),
        })

    # Exported broadcast receiver
    if comp_type == "receiver":
        issues.append({
            "title": f"Exported broadcast receiver: {_short_name(name)}",
            "severity": "medium",
            "category": "M1: Platform Misuse",
            "component": name,
            "type": comp_type,
            "description": (
                f"Receiver {_short_name(name)} is exported. Other apps can send broadcasts to it."
            ),
        })

    return issues


def _check_content_provider(provider: dict[str, Any]) -> list[dict[str, Any]]:
    """Check content provider for data leakage risks."""
    issues = []
    name = provider.get("name", "unknown")

    issues.append({
        "title": f"Exported content provider: {_short_name(name)}",
        "severity": "high",
        "category": "M2: Insecure Data Storage",
        "component": name,
        "type": "provider",
        "description": (
            f"Content provider {_short_name(name)} is exported. "
            "Other apps can query its data without authentication."
        ),
    })
    return issues


def _short_name(full_name: str) -> str:
    if "." in full_name:
        return full_name.rsplit(".", 1)[-1]
    return full_name
