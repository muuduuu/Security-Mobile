"""Test fixtures for SENTINEL tests."""

import asyncio
from uuid import uuid4

import pytest

from sentinel.core.events import EventBus
from sentinel.core.state import SharedState
from sentinel.models.engagement import Engagement


@pytest.fixture
def event_bus():
    return EventBus()


@pytest.fixture
def engagement():
    return Engagement(
        apk_path="/tmp/test.apk",
        package_name="com.test.app",
        app_name="TestApp",
        version_name="1.0.0",
    )


@pytest.fixture
def shared_state(engagement):
    return SharedState(engagement=engagement)


@pytest.fixture
def engagement_id(engagement):
    return engagement.id
