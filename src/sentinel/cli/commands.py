"""CLI commands for SENTINEL."""

from __future__ import annotations

import asyncio
import logging
from pathlib import Path
from typing import Optional
from uuid import UUID

import typer
from rich.console import Console
from rich.panel import Panel
from rich.table import Table

from sentinel import __version__

app = typer.Typer(
    name="sentinel",
    help="SENTINEL — AI-powered agentic mobile pentesting platform",
    add_completion=False,
)
console = Console()


def setup_logging(level: str = "INFO") -> None:
    logging.basicConfig(
        level=getattr(logging, level),
        format="%(asctime)s [%(name)s] %(levelname)s: %(message)s",
        datefmt="%H:%M:%S",
    )


@app.command()
def scan(
    apk_path: str = typer.Argument(..., help="Path to the APK file to analyze"),
    output: Optional[str] = typer.Option(None, "--output", "-o", help="Output directory for results"),
    config_file: Optional[str] = typer.Option(None, "--config", "-c", help="Configuration file"),
    verbose: bool = typer.Option(False, "--verbose", "-v", help="Enable verbose logging"),
) -> None:
    """Run a full security scan on an APK."""
    setup_logging("DEBUG" if verbose else "INFO")
    asyncio.run(_scan(apk_path, output))


async def _scan(apk_path: str, output: str | None = None) -> None:
    """Async scan implementation."""
    from sentinel.core.config import load_config
    from sentinel.core.engine import SentinelEngine
    from sentinel.core.events import EventBus, Event, EventType
    from sentinel.core.state import SharedState
    from sentinel.models.engagement import Engagement, EngagementConfig
    from sentinel.agents.orchestrator import OrchestratorAgent
    from sentinel.memory.store import Store
    from sentinel.memory.graph import KnowledgeGraph

    # Validate APK
    apk = Path(apk_path)
    if not apk.exists():
        console.print(f"[red]APK not found: {apk_path}[/red]")
        raise typer.Exit(1)

    console.print(Panel(
        f"[bold green]SENTINEL v{__version__}[/bold green]\n"
        f"Target: {apk.name}",
        title="Mobile Pentest",
        border_style="green",
    ))

    # Initialize engine
    config = load_config()
    engine = SentinelEngine(config)
    await engine.initialize()

    # Create engagement
    engagement = Engagement(apk_path=str(apk.resolve()))
    await engine.store.save_engagement(engagement)

    # Setup shared state
    event_bus = EventBus()
    shared_state = SharedState(engagement=engagement)
    engine.register_engagement(shared_state)

    # Subscribe to events for console output
    async def on_finding(event: Event) -> None:
        if event.event_type == EventType.FINDING_DISCOVERED:
            severity_colors = {
                "critical": "bold red",
                "high": "red",
                "medium": "yellow",
                "low": "blue",
                "info": "dim",
            }
            color = severity_colors.get(event.payload.get("severity", ""), "white")
            console.print(
                f"  [{color}]*[/{color}] {event.payload.get('title', 'Finding')} "
                f"[{color}]{event.payload.get('severity', '?')}[/{color}]"
            )

    await event_bus.subscribe(EventType.FINDING_DISCOVERED, on_finding)

    console.print("\n[bold]Starting engagement...[/bold]")

    # Run orchestrator
    try:
        orchestrator = OrchestratorAgent(
            engagement_id=engagement.id,
            event_bus=event_bus,
            shared_state=shared_state,
        )
        findings = await orchestrator.run(
            task="Full security assessment",
            context={"apk_path": str(apk.resolve())},
        )

        # Save findings
        for finding in findings:
            await engine.store.save_finding(finding)

        # Update engagement
        engagement.status = "completed"
        engagement.findings_count = shared_state.findings_summary()
        await engine.store.save_engagement(engagement)

        # Display results
        console.print("\n")
        _display_results(engagement, findings)

    except Exception as e:
        console.print(f"\n[red]Scan failed: {e}[/red]")
        engagement.status = "failed"
        engagement.errors.append(str(e))
        await engine.store.save_engagement(engagement)
        raise
    finally:
        await engine.shutdown()


def _display_results(engagement: Engagement, findings: list) -> None:
    """Display scan results in a formatted table."""
    if not findings:
        console.print("[green]No findings discovered.[/green]")
        return

    table = Table(title=f"Findings — {engagement.package_name or 'Unknown'}")
    table.add_column("#", style="dim", width=4)
    table.add_column("Severity", width=10)
    table.add_column("Category", width=35)
    table.add_column("Title", width=60)
    table.add_column("Source", width=8)

    severity_colors = {
        "critical": "bold red",
        "high": "red",
        "medium": "yellow",
        "low": "blue",
        "info": "dim",
    }

    for i, f in enumerate(findings, 1):
        color = severity_colors.get(f.severity, "white")
        table.add_row(
            str(i),
            f"[{color}]{f.severity}[/{color}]",
            f.category,
            f.title,
            f.source,
        )

    console.print(table)
    console.print(f"\n[bold]Total findings: {len(findings)}[/bold]")
    console.print(f"Engagement ID: {engagement.id}")


@app.command()
def devices() -> None:
    """List connected Android devices."""
    setup_logging("WARNING")
    asyncio.run(_devices())


async def _devices() -> None:
    from sentinel.tools.adb_tool import ADBTool
    from sentinel.tools.sandbox import SandboxExecutor
    from sentinel.core.config import SandboxConfig

    sandbox = SandboxExecutor(SandboxConfig())
    adb = ADBTool(sandbox)

    if not adb.is_available():
        console.print("[red]ADB not found. Install Android Platform Tools.[/red]")
        console.print(f"  {adb.install_guide}")
        return

    device_list = await adb.list_devices()
    if not device_list:
        console.print("[yellow]No devices connected.[/yellow]")
        return

    table = Table(title="Connected Devices")
    table.add_column("Serial")
    table.add_column("Model")
    table.add_column("Android")
    table.add_column("Rooted")
    table.add_column("State")

    for d in device_list:
        rooted = "[green]Yes[/green]" if d.is_rooted else "[red]No[/red]"
        table.add_row(d.serial, d.model, d.android_version, rooted, d.state.value)

    console.print(table)


@app.command()
def tools() -> None:
    """Check availability of external tools."""
    from sentinel.tools.jadx_tool import JADXTool
    from sentinel.tools.apktool_tool import ApktoolTool
    from sentinel.tools.adb_tool import ADBTool
    from sentinel.tools.frida_tool import FridaTool
    from sentinel.tools.sandbox import SandboxExecutor
    from sentinel.core.config import SandboxConfig

    sandbox = SandboxExecutor(SandboxConfig())
    tool_instances = [
        JADXTool(sandbox),
        ApktoolTool(sandbox),
        ADBTool(sandbox),
        FridaTool(sandbox),
    ]

    table = Table(title="Tool Availability")
    table.add_column("Tool")
    table.add_column("Status")
    table.add_column("Install Guide")

    for tool in tool_instances:
        available = tool.is_available()
        status = "[green]Available[/green]" if available else "[red]Not Found[/red]"
        guide = "" if available else tool.install_guide
        table.add_row(tool.tool_name, status, guide)

    console.print(table)


@app.command()
def engagements() -> None:
    """List past engagements."""
    asyncio.run(_engagements())


async def _engagements() -> None:
    from sentinel.core.config import load_config
    from sentinel.core.engine import SentinelEngine

    config = load_config()
    engine = SentinelEngine(config)
    await engine.initialize()

    eng_list = await engine.store.list_engagements()
    if not eng_list:
        console.print("[yellow]No engagements found.[/yellow]")
        return

    table = Table(title="Engagements")
    table.add_column("ID", width=8)
    table.add_column("Package")
    table.add_column("Status")
    table.add_column("Started")
    table.add_column("Findings")

    for eng in eng_list:
        fc = eng.findings_count
        total = sum(fc.values()) if fc else 0
        table.add_row(
            str(eng.id)[:8],
            eng.package_name or eng.apk_path,
            eng.status.value,
            eng.started_at.strftime("%Y-%m-%d %H:%M"),
            str(total),
        )

    console.print(table)
    await engine.shutdown()


@app.command()
def version() -> None:
    """Show version."""
    console.print(f"SENTINEL v{__version__}")


if __name__ == "__main__":
    app()
