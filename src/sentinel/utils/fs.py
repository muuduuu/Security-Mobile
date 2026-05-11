"""Filesystem helpers."""

from __future__ import annotations

import shutil
import tempfile
from pathlib import Path


def ensure_dir(path: str | Path) -> Path:
    """Create directory if it doesn't exist."""
    p = Path(path)
    p.mkdir(parents=True, exist_ok=True)
    return p


def temp_dir(prefix: str = "sentinel_") -> str:
    """Create a temporary directory."""
    return tempfile.mkdtemp(prefix=prefix)


def cleanup_dir(path: str | Path) -> None:
    """Remove a directory and all its contents."""
    p = Path(path)
    if p.exists() and p.is_dir():
        shutil.rmtree(p, ignore_errors=True)


def find_files(directory: str | Path, pattern: str = "*") -> list[Path]:
    """Find files matching a glob pattern."""
    return list(Path(directory).rglob(pattern))
