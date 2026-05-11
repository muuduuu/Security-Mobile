"""AndroidManifest.xml parsing and analysis."""

from __future__ import annotations

import logging
import re
from pathlib import Path
from typing import Any
from xml.etree import ElementTree as ET

logger = logging.getLogger(__name__)

ANDROID_NS = "{http://schemas.android.com/apk/res/android}"


class ManifestParser:
    """Parse and extract security-relevant data from AndroidManifest.xml."""

    def __init__(self, manifest_path: str | Path) -> None:
        self.path = Path(manifest_path)
        self._tree: ET.ElementTree | None = None
        self._root: ET.Element | None = None

    def parse(self) -> dict[str, Any]:
        """Parse the manifest and return structured data."""
        if not self.path.exists():
            raise FileNotFoundError(f"Manifest not found: {self.path}")

        self._tree = ET.parse(self.path)
        self._root = self._tree.getroot()

        return {
            "package_name": self._get_package_name(),
            "version_name": self._root.get(f"{ANDROID_NS}versionName", ""),
            "version_code": self._root.get(f"{ANDROID_NS}versionCode", ""),
            "min_sdk": self._get_uses_sdk("minSdkVersion"),
            "target_sdk": self._get_uses_sdk("targetSdkVersion"),
            "max_sdk": self._get_uses_sdk("maxSdkVersion"),
            "permissions": self._get_permissions(),
            "dangerous_permissions": self._get_dangerous_permissions(),
            "activities": self._get_components("activity"),
            "services": self._get_components("service"),
            "receivers": self._get_components("receiver"),
            "providers": self._get_components("provider"),
            "exported_activities": self._get_exported("activity"),
            "exported_services": self._get_exported("service"),
            "exported_receivers": self._get_exported("receiver"),
            "exported_providers": self._get_exported("provider"),
            "deep_links": self._get_deep_links(),
            "intent_filters": self._get_intent_filters(),
            "main_activity": self._get_main_activity(),
            "allow_backup": self._get_flag("allowBackup", default=True),
            "debuggable": self._get_flag("debuggable", default=False),
            "network_security_config": self._get_network_security_config(),
            "uses_cleartext_traffic": self._get_flag("usesCleartextTraffic", default=False),
        }

    def _get_package_name(self) -> str:
        return self._root.get("package", "") if self._root else ""

    def _get_uses_sdk(self, attr: str) -> str:
        if self._root is None:
            return ""
        sdk = self._root.find("uses-sdk")
        if sdk is not None:
            return sdk.get(f"{ANDROID_NS}{attr}", "")
        return ""

    def _get_permissions(self) -> list[str]:
        if self._root is None:
            return []
        return [
            elem.get("name", "")
            for elem in self._root.findall("uses-permission")
            if elem.get("name")
        ]

    def _get_dangerous_permissions(self) -> list[str]:
        """Filter for Android dangerous permissions."""
        dangerous = {
            "READ_CALENDAR", "WRITE_CALENDAR",
            "CAMERA",
            "READ_CONTACTS", "WRITE_CONTACTS", "GET_ACCOUNTS",
            "ACCESS_FINE_LOCATION", "ACCESS_COARSE_LOCATION",
            "RECORD_AUDIO",
            "READ_PHONE_STATE", "CALL_PHONE", "READ_CALL_LOG",
            "WRITE_CALL_LOG", "PROCESS_OUTGOING_CALLS",
            "ADD_VOICEMAIL", "USE_SIP",
            "BODY_SENSORS",
            "SEND_SMS", "RECEIVE_SMS", "READ_SMS",
            "RECEIVE_WAP_PUSH", "RECEIVE_MMS",
            "READ_EXTERNAL_STORAGE", "WRITE_EXTERNAL_STORAGE",
            "ACCESS_MEDIA_LOCATION",
            "ACTIVITY_RECOGNITION",
            "ANSWER_PHONE_CALLS",
            "ACCEPT_HANDOVER",
            "NEARBY_WIFI_DEVICES",
            "POST_NOTIFICATIONS",
            "READ_MEDIA_IMAGES", "READ_MEDIA_VIDEO", "READ_MEDIA_AUDIO",
        }
        all_perms = self._get_permissions()
        return [
            p for p in all_perms
            if any(d in p for d in dangerous)
        ]

    def _get_components(self, component_type: str) -> list[str]:
        if self._root is None:
            return []
        return [
            elem.get(f"{ANDROID_NS}name", elem.get("name", ""))
            for elem in self._root.iter(component_type)
            if elem.get(f"{ANDROID_NS}name") or elem.get("name")
        ]

    def _get_exported(self, component_type: str) -> list[dict[str, Any]]:
        if self._root is None:
            return []
        exported = []
        for elem in self._root.iter(component_type):
            name = elem.get(f"{ANDROID_NS}name", elem.get("name", ""))
            if not name:
                continue

            is_exported = elem.get(f"{ANDROID_NS}exported", "").lower() == "true"

            # Implicit export: has intent-filter and no explicit exported=false
            has_intent_filter = elem.find(".//intent-filter") is not None
            exported_attr = elem.get(f"{ANDROID_NS}exported")
            implicitly_exported = has_intent_filter and exported_attr is None and self._get_uses_sdk("targetSdkVersion") not in ("", "31", "32", "33", "34", "35")

            if is_exported or implicitly_exported:
                exported.append({
                    "name": name,
                    "explicit": is_exported,
                    "has_intent_filter": has_intent_filter,
                })

        return exported

    def _get_deep_links(self) -> list[dict[str, str]]:
        """Extract deep link URI patterns from intent filters."""
        if self._root is None:
            return []
        deep_links = []
        for intent_filter in self._root.iter("intent-filter"):
            for data in intent_filter.findall("data"):
                scheme = data.get(f"{ANDROID_NS}scheme", data.get("scheme", ""))
                host = data.get(f"{ANDROID_NS}host", data.get("host", ""))
                path = data.get(f"{ANDROID_NS}path", data.get("path", ""))
                path_prefix = data.get(f"{ANDROID_NS}pathPrefix", data.get("pathPrefix", ""))
                port = data.get(f"{ANDROID_NS}port", data.get("port", ""))

                if scheme:
                    uri = f"{scheme}://{host}"
                    if port:
                        uri += f":{port}"
                    if path:
                        uri += path
                    elif path_prefix:
                        uri += path_prefix

                    # Find parent component
                    parent = None
                    for elem in self._root.iter():
                        for child in elem:
                            if child == intent_filter:
                                parent = elem
                                break
                    component = ""
                    if parent is not None:
                        component = parent.get(f"{ANDROID_NS}name", parent.get("name", ""))

                    deep_links.append({
                        "uri": uri,
                        "scheme": scheme,
                        "host": host,
                        "path": path or path_prefix,
                        "component": component,
                    })

        return deep_links

    def _get_intent_filters(self) -> list[dict[str, Any]]:
        if self._root is None:
            return []
        filters = []
        for intent_filter in self._root.iter("intent-filter"):
            parent = None
            for elem in self._root.iter():
                for child in elem:
                    if child == intent_filter:
                        parent = elem
                        break

            if parent is None:
                continue

            filter_data: dict[str, Any] = {
                "component": parent.get(f"{ANDROID_NS}name", parent.get("name", "")),
                "component_type": parent.tag,
                "actions": [a.get(f"{ANDROID_NS}name", "") for a in intent_filter.findall("action")],
                "categories": [c.get(f"{ANDROID_NS}name", "") for c in intent_filter.findall("category")],
                "data": [],
            }
            for data in intent_filter.findall("data"):
                filter_data["data"].append({
                    "scheme": data.get(f"{ANDROID_NS}scheme", ""),
                    "host": data.get(f"{ANDROID_NS}host", ""),
                    "path": data.get(f"{ANDROID_NS}path", ""),
                })
            filters.append(filter_data)
        return filters

    def _get_main_activity(self) -> str:
        if self._root is None:
            return ""
        for activity in self._root.iter("activity"):
            for intent_filter in activity.findall("intent-filter"):
                for action in intent_filter.findall("action"):
                    name = action.get(f"{ANDROID_NS}name", "")
                    if name == "android.intent.action.MAIN":
                        for category in intent_filter.findall("category"):
                            cat = category.get(f"{ANDROID_NS}name", "")
                            if cat == "android.intent.category.LAUNCHER":
                                return activity.get(f"{ANDROID_NS}name", "")
        return ""

    def _get_flag(self, flag: str, default: bool = False) -> bool:
        if self._root is None:
            return default
        val = self._root.get(f"{ANDROID_NS}{flag}", "").lower()
        if val == "true":
            return True
        if val == "false":
            return False
        return default

    def _get_network_security_config(self) -> str | None:
        if self._root is None:
            return None
        nsc = self._root.find(f"{ANDROID_NS}networkSecurityConfig")
        if nsc is not None:
            return nsc.get(f"{ANDROID_NS}config", "")
        app = self._root.find("application")
        if app is not None:
            return app.get(f"{ANDROID_NS}networkSecurityConfig", "")
        return None
