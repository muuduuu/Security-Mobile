"""Secret and credential scanning engine."""

from __future__ import annotations

import logging
import re
from dataclasses import dataclass
from pathlib import Path
from typing import Any

logger = logging.getLogger(__name__)


@dataclass
class SecretMatch:
    """A discovered secret/credential."""

    type: str
    value: str
    file_path: str
    line_number: int
    line_content: str
    confidence: float = 0.8


# Secret detection patterns
SECRET_PATTERNS: list[dict[str, Any]] = [
    {
        "name": "aws_access_key",
        "pattern": r"AKIA[0-9A-Z]{16}",
        "type": "aws_access_key",
        "confidence": 0.95,
    },
    {
        "name": "aws_secret_key",
        "pattern": r"(?i)aws(.{0,20})?['\"][0-9a-zA-Z/+]{40}['\"]",
        "type": "aws_secret_key",
        "confidence": 0.8,
    },
    {
        "name": "google_api_key",
        "pattern": r"AIza[0-9A-Za-z\-_]{35}",
        "type": "google_api_key",
        "confidence": 0.95,
    },
    {
        "name": "firebase_url",
        "pattern": r"https://[a-z0-9\-]+\.firebaseio\.com",
        "type": "firebase_url",
        "confidence": 0.9,
    },
    {
        "name": "firebase_key",
        "pattern": r"(?i)firebase['\"]?\s*[:=]\s*['\"][a-zA-Z0-9\-_]{20,}['\"]",
        "type": "firebase_key",
        "confidence": 0.7,
    },
    {
        "name": "private_key",
        "pattern": r"-----BEGIN (?:RSA |EC )?PRIVATE KEY-----",
        "type": "private_key",
        "confidence": 0.95,
    },
    {
        "name": "github_token",
        "pattern": r"gh[ps]_[0-9a-zA-Z]{36,}",
        "type": "github_token",
        "confidence": 0.95,
    },
    {
        "name": "slack_token",
        "pattern": r"xox[baprs]-[0-9]{10,13}-[0-9a-zA-Z]{24,}",
        "type": "slack_token",
        "confidence": 0.95,
    },
    {
        "name": "generic_api_key",
        "pattern": r"(?i)(?:api[_\-]?key|apikey|api[_\-]?secret)['\"]?\s*[:=]\s*['\"][0-9a-zA-Z\-_]{20,}['\"]",
        "type": "generic_api_key",
        "confidence": 0.6,
    },
    {
        "name": "generic_secret",
        "pattern": r"(?i)(?:secret|password|passwd|token|auth)['\"]?\s*[:=]\s*['\"][^'\"]{8,}['\"]",
        "type": "generic_secret",
        "confidence": 0.5,
    },
    {
        "name": "jwt_token",
        "pattern": r"eyJ[a-zA-Z0-9\-_]+\.eyJ[a-zA-Z0-9\-_]+\.[a-zA-Z0-9\-_]+",
        "type": "jwt_token",
        "confidence": 0.7,
    },
    {
        "name": "base64_encoded_secret",
        "pattern": r"(?i)(?:key|secret|token|password|credential)['\"]?\s*[:=]\s*['\"][A-Za-z0-9+/]{40,}={0,2}['\"]",
        "type": "base64_secret",
        "confidence": 0.5,
    },
    {
        "name": "sendgrid_api_key",
        "pattern": r"SG\.[0-9a-zA-Z\-_]{22}\.[0-9a-zA-Z\-_]{43}",
        "type": "sendgrid_api_key",
        "confidence": 0.95,
    },
    {
        "name": "twilio_account_sid",
        "pattern": r"AC[a-z0-9]{32}",
        "type": "twilio_account_sid",
        "confidence": 0.7,
    },
    {
        "name": "stripe_key",
        "pattern": r"(?:sk|pk)_(?:test|live)_[0-9a-zA-Z]{24,}",
        "type": "stripe_key",
        "confidence": 0.95,
    },
    {
        "name": "google_oauth",
        "pattern": r"[0-9]+-[a-z0-9_]{32}\.apps\.googleusercontent\.com",
        "type": "google_oauth_client_id",
        "confidence": 0.9,
    },
    {
        "name": "hardcoded_ip",
        "pattern": r"(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)",
        "type": "hardcoded_ip",
        "confidence": 0.4,
    },
    {
        "name": "hardcoded_url",
        "pattern": r"https?://[a-zA-Z0-9\-._~:/?#\[\]@!$&'()*+,;=]+",
        "type": "hardcoded_url",
        "confidence": 0.3,
    },
]


class SecretScanner:
    """Scan source code files for hardcoded secrets and credentials."""

    def __init__(self, custom_patterns: list[dict[str, Any]] | None = None) -> None:
        self.patterns = SECRET_PATTERNS.copy()
        if custom_patterns:
            self.patterns.extend(custom_patterns)
        self._compiled = [
            {**p, "regex": re.compile(p["pattern"])} for p in self.patterns
        ]

    def scan_file(self, file_path: str | Path) -> list[SecretMatch]:
        """Scan a single file for secrets."""
        path = Path(file_path)
        if not path.exists() or not path.is_file():
            return []

        try:
            content = path.read_text(encoding="utf-8", errors="replace")
        except Exception:
            return []

        return self._scan_content(content, str(path))

    def scan_directory(self, directory: str | Path, max_files: int = 5000) -> list[SecretMatch]:
        """Recursively scan a directory for secrets."""
        directory = Path(directory)
        if not directory.exists():
            return []

        matches = []
        extensions = {".java", ".kt", ".xml", ".json", ".properties", ".yaml", ".yml", ".gradle", ".smali"}

        count = 0
        for path in directory.rglob("*"):
            if count >= max_files:
                break
            if path.is_file() and path.suffix in extensions:
                matches.extend(self.scan_file(path))
                count += 1

        return matches

    def _scan_content(self, content: str, file_path: str) -> list[SecretMatch]:
        """Scan text content for secret patterns."""
        matches = []
        lines = content.split("\n")

        for pattern_def in self._compiled:
            regex = pattern_def["regex"]
            for line_num, line in enumerate(lines, 1):
                for match in regex.finditer(line):
                    matches.append(SecretMatch(
                        type=pattern_def["type"],
                        value=match.group(),
                        file_path=file_path,
                        line_number=line_num,
                        line_content=line.strip(),
                        confidence=pattern_def["confidence"],
                    ))

        return matches

    def deduplicate(self, matches: list[SecretMatch]) -> list[SecretMatch]:
        """Remove duplicate matches."""
        seen: set[str] = set()
        unique = []
        for m in matches:
            key = f"{m.type}:{m.value}:{m.file_path}:{m.line_number}"
            if key not in seen:
                seen.add(key)
                unique.append(m)
        return unique
