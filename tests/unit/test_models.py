"""Tests for data models."""

from uuid import uuid4

from sentinel.models.finding import Finding, FindingSource, Severity
from sentinel.models.engagement import Engagement, EngagementConfig, EngagementStatus
from sentinel.models.device import Device, DeviceState
from sentinel.models.apk import APKMetadata
from sentinel.models.agent import AgentStatus, AgentState, AgentType


class TestFindingModel:
    def test_create_finding(self):
        finding = Finding(
            engagement_id=uuid4(),
            title="Test",
            description="Desc",
            severity=Severity.HIGH,
            category="M1",
            source=FindingSource.SAST,
        )
        assert finding.severity == Severity.HIGH
        assert finding.confidence == 0.5
        assert finding.validated is False

    def test_finding_serialization(self):
        finding = Finding(
            engagement_id=uuid4(),
            title="Test",
            description="Desc",
            severity=Severity.CRITICAL,
            category="M2",
            source=FindingSource.SAST,
            evidence={"file": "test.java", "line": 42},
        )
        data = finding.model_dump()
        assert data["severity"] == "critical"
        assert data["evidence"]["file"] == "test.java"


class TestEngagementModel:
    def test_create_engagement(self):
        eng = Engagement(apk_path="/test.apk")
        assert eng.status == EngagementStatus.CREATED
        assert eng.config.enable_sast is True

    def test_engagement_with_config(self):
        config = EngagementConfig(enable_sast=True, enable_dast=True)
        eng = Engagement(apk_path="/test.apk", config=config)
        assert eng.config.enable_dast is True


class TestDeviceModel:
    def test_create_device(self):
        device = Device(serial="emulator-5554", model="Pixel 6")
        assert device.state == DeviceState.CONNECTED
        assert device.is_rooted is False


class TestAPKMetadataModel:
    def test_create_apk_metadata(self):
        meta = APKMetadata(
            engagement_id=uuid4(),
            file_path="/test.apk",
            package_name="com.test.app",
        )
        assert meta.permissions == []
        assert meta.deep_links == []


class TestAgentStatusModel:
    def test_create_agent_status(self):
        status = AgentStatus(
            agent_type=AgentType.ORCHESTRATOR,
            engagement_id=uuid4(),
        )
        assert status.state == AgentState.CREATED
        assert status.findings_count == 0
