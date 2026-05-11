"""Parameter mutation engine."""

from __future__ import annotations

import logging
import random
from typing import Any

logger = logging.getLogger(__name__)


def mutate_parameter(original: str, mutation_type: str) -> list[str]:
    """Generate mutations for a parameter value."""
    mutations = []

    if mutation_type == "idor":
        mutations.extend([
            str(int(original) + 1) if original.isdigit() else "1",
            str(int(original) - 1) if original.isdigit() else "0",
            "0", "1", "-1",
            str(random.randint(1000, 99999)),
            "admin", "root",
        ])

    elif mutation_type == "type_confusion":
        mutations.extend([
            "null", "true", "false",
            "[]", "{}", "",
            str(random.randint(0, 999999)),
            "".join(random.choices("abcdefghijklmnopqrstuvwxyz", k=10)),
        ])

    elif mutation_type == "overflow":
        mutations.extend([
            "9" * 100,
            "a" * 10000,
            str(2**31 - 1),
            str(-2**31),
            str(2**63),
        ])

    elif mutation_type == "format_string":
        mutations.extend([
            "%s%s%s%s", "%n%n%n%n", "%x%x%x%x",
            "%d%d%d%d", "%f%f%f%f",
        ])

    return mutations


def mutate_endpoint(base_path: str) -> list[str]:
    """Generate path mutations for API fuzzing."""
    mutations = [
        base_path + "/",
        base_path + "/..",
        base_path + "/%2e%2e",
        base_path + "/.env",
        base_path + "/.git",
        base_path + "/admin",
        base_path + "/debug",
        base_path + "/test",
        base_path + "/swagger",
        base_path + "/api-docs",
        base_path.replace("/api/", "/api/v1/"),
        base_path.replace("/api/", "/api/v2/"),
    ]
    return mutations
