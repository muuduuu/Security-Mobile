"""Permission analysis engine."""

from __future__ import annotations

import logging
from typing import Any

logger = logging.getLogger(__name__)

# Permission risk classification
DANGEROUS_PERMISSIONS: dict[str, dict[str, str]] = {
    "android.permission.READ_CALENDAR": {"risk": "high", "owasp": "M2", "desc": "Calendar data access"},
    "android.permission.WRITE_CALENDAR": {"risk": "high", "owasp": "M2", "desc": "Calendar data modification"},
    "android.permission.CAMERA": {"risk": "medium", "owasp": "M2", "desc": "Camera access"},
    "android.permission.READ_CONTACTS": {"risk": "high", "owasp": "M2", "desc": "Contact data access"},
    "android.permission.WRITE_CONTACTS": {"risk": "high", "owasp": "M2", "desc": "Contact data modification"},
    "android.permission.GET_ACCOUNTS": {"risk": "medium", "owasp": "M2", "desc": "Account discovery"},
    "android.permission.ACCESS_FINE_LOCATION": {"risk": "high", "owasp": "M2", "desc": "Precise location"},
    "android.permission.ACCESS_COARSE_LOCATION": {"risk": "medium", "owasp": "M2", "desc": "Approximate location"},
    "android.permission.RECORD_AUDIO": {"risk": "high", "owasp": "M2", "desc": "Microphone access"},
    "android.permission.READ_PHONE_STATE": {"risk": "high", "owasp": "M2", "desc": "Device info access"},
    "android.permission.CALL_PHONE": {"risk": "critical", "owasp": "M2", "desc": "Direct phone calls"},
    "android.permission.READ_CALL_LOG": {"risk": "high", "owasp": "M2", "desc": "Call history access"},
    "android.permission.WRITE_CALL_LOG": {"risk": "high", "owasp": "M2", "desc": "Call history modification"},
    "android.permission.PROCESS_OUTGOING_CALLS": {"risk": "high", "owasp": "M2", "desc": "Intercept outgoing calls"},
    "android.permission.BODY_SENSORS": {"risk": "medium", "owasp": "M2", "desc": "Sensor data access"},
    "android.permission.SEND_SMS": {"risk": "critical", "owasp": "M2", "desc": "Send SMS (premium rate risk)"},
    "android.permission.RECEIVE_SMS": {"risk": "high", "owasp": "M2", "desc": "Read SMS messages"},
    "android.permission.READ_SMS": {"risk": "critical", "owasp": "M2", "desc": "Read all SMS"},
    "android.permission.RECEIVE_MMS": {"risk": "medium", "owasp": "M2", "desc": "Receive MMS"},
    "android.permission.READ_EXTERNAL_STORAGE": {"risk": "medium", "owasp": "M2", "desc": "Read shared storage"},
    "android.permission.WRITE_EXTERNAL_STORAGE": {"risk": "medium", "owasp": "M2", "desc": "Write shared storage"},
    "android.permission.MANAGE_EXTERNAL_STORAGE": {"risk": "critical", "owasp": "M2", "desc": "Full file access"},
    "android.permission.REQUEST_INSTALL_PACKAGES": {"risk": "critical", "owasp": "M1", "desc": "Install packages"},
    "android.permission.SYSTEM_ALERT_WINDOW": {"risk": "high", "owasp": "M1", "desc": "Overlay attack potential"},
    "android.permission.WRITE_SETTINGS": {"risk": "medium", "owasp": "M2", "desc": "Modify system settings"},
    "android.permission.ACCESS_WIFI_STATE": {"risk": "low", "owasp": "M5", "desc": "WiFi info"},
    "android.permission.ACCESS_NETWORK_STATE": {"risk": "low", "owasp": "M5", "desc": "Network info"},
    "android.permission.INTERNET": {"risk": "info", "owasp": "", "desc": "Internet access"},
    "android.permission.READ_PHONE_NUMBERS": {"risk": "high", "owasp": "M2", "desc": "Phone number access"},
    "android.permission.ANSWER_PHONE_CALLS": {"risk": "medium", "owasp": "M2", "desc": "Answer calls"},
}

SPECIAL_PERMISSIONS: dict[str, str] = {
    "android.permission.DUMP": "System dump access — debug-only",
    "android.permission.READ_LOGS": "Read system logs — may leak sensitive data",
    "android.permission.SET_DEBUG_APP": "Debug app setting",
    "android.permission.WRITE_SECURE_SETTINGS": "Modify secure system settings",
    "android.permission.DEVICE_POWER": "Power management",
    "android.permission.FORCE_STOP_PACKAGES": "Force stop packages",
    "android.permission.KILL_BACKGROUND_PROCESSES": "Kill background processes",
    "android.permission.RESTART_PACKAGES": "Restart packages",
}


def analyze_permissions(permissions: list[str]) -> dict[str, Any]:
    """Analyze a list of Android permissions for security issues."""
    analysis: dict[str, Any] = {
        "total_count": len(permissions),
        "dangerous": [],
        "special": [],
        "normal": [],
        "risk_summary": {"critical": 0, "high": 0, "medium": 0, "low": 0, "info": 0},
        "issues": [],
    }

    for perm in permissions:
        perm_name = perm.split(".")[-1] if "." in perm else perm

        if perm in DANGEROUS_PERMISSIONS:
            info = DANGEROUS_PERMISSIONS[perm]
            analysis["dangerous"].append({
                "permission": perm,
                "risk": info["risk"],
                "owasp": info["owasp"],
                "description": info["desc"],
            })
            analysis["risk_summary"][info["risk"]] = analysis["risk_summary"].get(info["risk"], 0) + 1

        elif perm in SPECIAL_PERMISSIONS:
            analysis["special"].append({
                "permission": perm,
                "description": SPECIAL_PERMISSIONS[perm],
            })

        else:
            analysis["normal"].append(perm)
            analysis["risk_summary"]["low"] = analysis["risk_summary"].get("low", 0) + 1

    # Generate issues
    for d in analysis["dangerous"]:
        if d["risk"] in ("critical", "high"):
            analysis["issues"].append({
                "title": f"Dangerous permission requested: {d['permission']}",
                "severity": d["risk"],
                "category": "M2: Insecure Data Storage" if d["owasp"] == "M2" else "M1: Platform Misuse",
                "description": f"App requests {d['permission']} — {d['description']}",
                "recommendation": "Verify this permission is necessary and user consent is properly obtained.",
            })

    return analysis
