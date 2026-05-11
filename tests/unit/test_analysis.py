"""Tests for analysis engines."""

import pytest
from pathlib import Path
import tempfile

from sentinel.analysis.secrets import SecretScanner
from sentinel.analysis.permissions import analyze_permissions
from sentinel.analysis.components import analyze_exported_components
from sentinel.analysis.deeplinks import analyze_deep_links


class TestSecretScanner:
    def test_scan_aws_key(self):
        scanner = SecretScanner()
        with tempfile.NamedTemporaryFile(mode="w", suffix=".java", delete=False) as f:
            f.write('String key = "AKIAIOSFODNN7EXAMPLE";\n')
            f.flush()
            matches = scanner.scan_file(f.name)
            assert any(m.type == "aws_access_key" for m in matches)

    def test_scan_google_api_key(self):
        scanner = SecretScanner()
        with tempfile.NamedTemporaryFile(mode="w", suffix=".java", delete=False) as f:
            f.write('String key = "AIzaSyA1234567890abcdefghijklmnopqrstuv";\n')
            f.flush()
            matches = scanner.scan_file(f.name)
            assert any(m.type == "google_api_key" for m in matches)

    def test_scan_firebase_url(self):
        scanner = SecretScanner()
        with tempfile.NamedTemporaryFile(mode="w", suffix=".java", delete=False) as f:
            f.write('String url = "https://my-project.firebaseio.com";\n')
            f.flush()
            matches = scanner.scan_file(f.name)
            assert any(m.type == "firebase_url" for m in matches)

    def test_scan_generic_api_key(self):
        scanner = SecretScanner()
        with tempfile.NamedTemporaryFile(mode="w", suffix=".java", delete=False) as f:
            f.write('String api_key = "sk-1234567890abcdefghijklmn";\n')
            f.flush()
            matches = scanner.scan_file(f.name)
            assert len(matches) > 0

    def test_scan_clean_file(self):
        scanner = SecretScanner()
        with tempfile.NamedTemporaryFile(mode="w", suffix=".java", delete=False) as f:
            f.write('public class Clean { int x = 42; }\n')
            f.flush()
            matches = scanner.scan_file(f.name)
            assert len(matches) == 0

    def test_deduplication(self):
        from sentinel.analysis.secrets import SecretMatch
        scanner = SecretScanner()
        matches = [
            SecretMatch(type="key", value="abc", file_path="a.java", line_number=1, line_content="x"),
            SecretMatch(type="key", value="abc", file_path="a.java", line_number=1, line_content="x"),
            SecretMatch(type="key", value="def", file_path="a.java", line_number=2, line_content="y"),
        ]
        deduped = scanner.deduplicate(matches)
        assert len(deduped) == 2


class TestPermissionAnalysis:
    def test_dangerous_permissions(self):
        perms = [
            "android.permission.CAMERA",
            "android.permission.READ_CONTACTS",
            "android.permission.ACCESS_FINE_LOCATION",
        ]
        result = analyze_permissions(perms)
        assert result["total_count"] == 3
        assert len(result["dangerous"]) == 3
        assert len(result["issues"]) >= 1

    def test_no_permissions(self):
        result = analyze_permissions([])
        assert result["total_count"] == 0
        assert len(result["dangerous"]) == 0

    def test_normal_only(self):
        perms = ["some.custom.permission.USE_FEATURE"]
        result = analyze_permissions(perms)
        assert len(result["dangerous"]) == 0


class TestComponentAnalysis:
    def test_exported_activity(self):
        activities = [{"name": "com.test.ExposedActivity", "explicit": True, "has_intent_filter": True}]
        result = analyze_exported_components(activities, [], [], [])
        assert result["total_exported"] == 1
        assert len(result["issues"]) >= 1

    def test_no_exports(self):
        result = analyze_exported_components([], [], [], [])
        assert result["total_exported"] == 0
        assert len(result["issues"]) == 0

    def test_exported_provider(self):
        providers = [{"name": "com.test.DataProvider", "explicit": True, "has_intent_filter": False}]
        result = analyze_exported_components([], [], [], providers)
        assert any("provider" in i.get("type", "") for i in result["issues"])


class TestDeepLinkAnalysis:
    def test_http_deep_link(self):
        links = [{"uri": "http://example.com/path", "scheme": "http", "host": "example.com", "path": "/path", "component": ""}]
        result = analyze_deep_links(links)
        assert result["total_count"] == 1
        assert any("HTTP" in i["title"] for i in result["issues"])

    def test_custom_scheme(self):
        links = [{"uri": "myapp://open/profile", "scheme": "myapp", "host": "open", "path": "/profile", "component": "Activity"}]
        result = analyze_deep_links(links)
        assert any("Custom scheme" in i["title"] for i in result["issues"])

    def test_sensitive_path(self):
        links = [{"uri": "myapp://auth/login", "scheme": "myapp", "host": "auth", "path": "/login", "component": "AuthActivity"}]
        result = analyze_deep_links(links)
        assert any("login" in i.get("description", "").lower() or "Sensitive" in i["title"] for i in result["issues"])

    def test_no_links(self):
        result = analyze_deep_links([])
        assert result["total_count"] == 0
        assert len(result["issues"]) == 0
