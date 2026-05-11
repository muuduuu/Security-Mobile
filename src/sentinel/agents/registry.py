"""Agent registry — discovers and manages available agent types."""

from __future__ import annotations

import logging
from typing import Type

from sentinel.agents.base import BaseAgent
from sentinel.models.agent import AgentType

logger = logging.getLogger(__name__)

# Global registry of agent types
_AGENT_REGISTRY: dict[AgentType, type[BaseAgent]] = {}


def register_agent(agent_type: AgentType) -> callable:
    """Decorator to register an agent class."""

    def decorator(cls: type[BaseAgent]) -> type[BaseAgent]:
        _AGENT_REGISTRY[agent_type] = cls
        logger.debug(f"Registered agent: {agent_type.value} → {cls.__name__}")
        return cls

    return decorator


def get_agent_class(agent_type: AgentType) -> type[BaseAgent] | None:
    """Get the agent class for a given type."""
    return _AGENT_REGISTRY.get(agent_type)


def list_available_agents() -> dict[AgentType, type[BaseAgent]]:
    """List all registered agent types."""
    return dict(_AGENT_REGISTRY)


def create_agent(
    agent_type: AgentType,
    engagement_id,
    event_bus,
    shared_state,
) -> BaseAgent | None:
    """Factory: create an agent instance by type."""
    cls = get_agent_class(agent_type)
    if cls is None:
        logger.warning(f"No agent registered for type: {agent_type.value}")
        return None
    return cls(
        engagement_id=engagement_id,
        event_bus=event_bus,
        shared_state=shared_state,
    )
