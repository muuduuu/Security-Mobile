"""SENTINEL custom exceptions."""


class SentinelError(Exception):
    """Base exception for all SENTINEL errors."""


class ToolNotAvailableError(SentinelError):
    """Raised when a required external tool is not installed."""

    def __init__(self, tool_name: str, install_guide: str = ""):
        self.tool_name = tool_name
        self.install_guide = install_guide
        msg = f"Tool '{tool_name}' is not available"
        if install_guide:
            msg += f". Install: {install_guide}"
        super().__init__(msg)


class AgentError(SentinelError):
    """Raised when an agent encounters an error."""


class EngagementError(SentinelError):
    """Raised for engagement-related errors."""


class ConfigurationError(SentinelError):
    """Raised for configuration errors."""


class SandboxError(SentinelError):
    """Raised when sandboxed execution fails."""


class LLMError(SentinelError):
    """Raised for LLM provider errors."""


class AnalysisError(SentinelError):
    """Raised during analysis failures."""


class DeviceError(SentinelError):
    """Raised for device interaction errors."""


class MemoryError(SentinelError):
    """Raised for memory/store errors."""
