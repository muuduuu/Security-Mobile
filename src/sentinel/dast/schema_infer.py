"""API schema inference from traffic."""

from __future__ import annotations

import logging
import re
from typing import Any

logger = logging.getLogger(__name__)


def infer_endpoints_from_source(source_dir: str) -> list[dict[str, str]]:
    """Scan decompiled source for API endpoints."""
    from pathlib import Path

    endpoints = []
    seen = set()
    url_pattern = re.compile(r'https?://[a-zA-Z0-9\-._~:/?#[\]@!$&\'()*+,;=%]+')
    path_pattern = re.compile(r'["\'](/(?:api|v[0-9]|rest|graphql|auth|user|admin|payment|order|account)/[^"\']+)["\']')

    source_path = Path(source_dir)
    if not source_path.exists():
        return endpoints

    for java_file in source_path.rglob("*.java"):
        try:
            content = java_file.read_text(encoding="utf-8", errors="replace")
        except Exception:
            continue

        # Find full URLs
        for match in url_pattern.finditer(content):
            url = match.group()
            if url not in seen and not _is_excluded_url(url):
                seen.add(url)
                endpoints.append({"url": url, "type": "full_url", "file": str(java_file.relative_to(source_path))})

        # Find API path patterns
        for match in path_pattern.finditer(content):
            path = match.group(1)
            if path not in seen:
                seen.add(path)
                endpoints.append({"path": path, "type": "path_pattern", "file": str(java_file.relative_to(source_path))})

    return endpoints


def _is_excluded_url(url: str) -> bool:
    """Exclude common non-target URLs."""
    excluded = [
        "schemas.android.com", "www.w3.org", "xmlpull.org",
        "www.google.com/schemas", "developer.android.com",
        "example.com", "localhost:8080", "10.0.2.2",
    ]
    return any(ex in url.lower() for ex in excluded)


def extract_api_keys_from_source(source_dir: str) -> list[dict[str, str]]:
    """Extract API-related configuration from source."""
    from pathlib import Path
    import re

    keys = []
    seen = set()
    source_path = Path(source_dir)

    patterns = {
        "firebase_url": re.compile(r'(https://[a-z0-9\-]+\.firebaseio\.com)'),
        "google_maps_key": re.compile(r'AIza[0-9A-Za-z\-_]{35}'),
        "backend_url": re.compile(r'["\'](https?://[a-z0-9\-]+\.groww[a-z]*\.[a-z]+[^"\']*)["\']', re.IGNORECASE),
        "s3_url": re.compile(r'["\'](https?://[a-z0-9\-]+\.s3[.\-][^"\']+)["\']'),
    }

    for java_file in source_path.rglob("*.java"):
        try:
            content = java_file.read_text(encoding="utf-8", errors="replace")
        except Exception:
            continue

        for key_type, pattern in patterns.items():
            for match in pattern.finditer(content):
                value = match.group(1) if match.lastindex else match.group()
                if value not in seen:
                    seen.add(value)
                    keys.append({
                        "type": key_type,
                        "value": value,
                        "file": str(java_file.relative_to(source_path)),
                    })

    return keys
