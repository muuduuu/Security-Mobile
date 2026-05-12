# SENTINEL

**Security ENgine for Testing, INtelligence, and ExpLoitation**

AI-powered agentic mobile application penetration testing platform. Autonomous offensive security testing against Android applications with multi-agent orchestration, LLM-driven reasoning, runtime instrumentation, and exploit validation.

## What It Does

SENTINEL behaves like an autonomous mobile red-team operator:

1. **Ingests an APK** → decompiles with JADX + Androguard
2. **SAST** → regex + AI-powered static analysis (secrets, crypto, permissions, components, deep links)
3. **DAST** → API endpoint discovery, schema inference, fuzzing payloads (SQLi, XSS, SSRF, IDOR)
4. **Runtime** → deploys Frida hooks on rooted device (SSL bypass, crypto intercept, auth capture, network monitoring)
5. **AI Reasoning** → LLM analyzes code, reasons about findings, generates attack chains
6. **Correlation** → links findings across static/dynamic/runtime layers into exploit paths
7. **Reporting** → Markdown, JSON, SARIF with attack chains and AI executive summary

## Quick Start

```bash
# Install
pip install -e ".[dev]"

# Install external tools (macOS)
brew install jadx apktool

# Check tool availability
sentinel tools

# Scan an APK
sentinel scan /path/to/target.apk

# List connected devices
sentinel devices

# View past engagements
sentinel engagements

# View a report
sentinel report <engagement-id>
sentinel report <engagement-id> -f json
```

## Configuration

Set LLM provider via environment variables:

```bash
# Option 1: Anthropic / Claude-compatible gateway (e.g. Bifrost, z.ai)
export SENTINEL_LLM_PROVIDER=anthropic
export SENTINEL_LLM_ANTHROPIC_API_KEY=your-key
export SENTINEL_LLM_ANTHROPIC_BASE_URL=https://your-gateway/v1    # optional
export SENTINEL_LLM_ANTHROPIC_MODEL=claude-sonnet-4-20250514       # optional

# Option 2: OpenAI / OpenAI-compatible gateway
export SENTINEL_LLM_PROVIDER=openai
export SENTINEL_LLM_OPENAI_API_KEY=your-key
export SENTINEL_LLM_OPENAI_BASE_URL=https://your-gateway/v1       # optional

# Option 3: Local via Ollama
export SENTINEL_LLM_PROVIDER=local
# defaults to http://localhost:11434 with llama3
```

Or create a `.env` file in the project root — SENTINEL auto-loads it.

## Requirements

- **Python 3.11+**
- **ADB** (Android Debug Bridge)
- **JADX** (Java decompiler) — `brew install jadx` or download from [GitHub](https://github.com/skylot/jadx)
- **Frida** (runtime instrumentation) — `pip install frida-tools frida`
- **Rooted Android device** (for runtime hooks)

Optional: `apktool`, `mitmproxy`, `nuclei`

## Architecture

```
                    ┌──────────────────────┐
                    │    CLI / TUI (Typer)  │
                    │    REST API (FastAPI)  │
                    └──────────┬───────────┘
                               │
                    ┌──────────▼───────────┐
                    │   ORCHESTRATOR       │
                    │   Event Bus (async)  │
                    │   Agent Spawner      │
                    └──┬────┬────┬────┬───┘
                       │    │    │    │
              ┌────────▼┐  ┌─▼──┐ ┌▼────────┐
              │SAST Agent│  │DAST│ │Frida    │
              │+ AI LLM  │  │    │ │Runtime  │
              └──────────┘  └────┘ └─────────┘
                       │    │    │    │
                    ┌──▼────▼────▼────▼───┐
                    │   Tool Layer        │
                    │   (Sandboxed)       │
                    │   JADX ADB Frida    │
                    └─────────────────────┘
```

### Agent Types

| Agent | Role |
|-------|------|
| Orchestrator | Coordinates all agents in an engagement |
| Planner | AI-powered attack planning with prioritized steps |
| SAST | Static analysis with regex + AI code reasoning |
| APK | Decompilation and metadata extraction |
| DAST | Dynamic analysis, endpoint discovery |
| Frida | Runtime instrumentation on rooted device |
| API Fuzzer | API fuzzing with attack payloads |
| Traffic | Network interception and analysis |
| Exploit | Exploit validation and PoC generation |
| Report | Report generation with AI executive summary |
| Knowledge | Knowledge graph management |
| Device | ADB device management |

### LLM Integration

The AI layer drives reasoning at three points:

1. **SAST Agent** — LLM analyzes suspicious Java files (auth, crypto, WebView, config classes) that regex patterns miss
2. **Frida Agent** — LLM reasons about runtime hook output and suggests attack chains
3. **Planner Agent** — LLM produces structured attack plans with priority and technique recommendations
4. **Report Generator** — LLM writes executive summaries

Any OpenAI-compatible or Anthropic-compatible gateway works. No LLM? The platform falls back to deterministic rule-based analysis.

### Security Model

- All tool invocations run through a **sandbox executor** with command allowlisting
- LLM **never** directly executes shell commands — produces structured plans that map to validated tool calls
- Every action is **audit-logged**
- Agent permission scopes limit what each agent can do

## Folder Structure

```
src/sentinel/
├── core/          # Engine, config, events, state
├── agents/        # All agent implementations
├── tools/         # External tool integrations (JADX, ADB, Frida)
├── analysis/      # Static analysis engines
├── dast/          # DAST engine (fuzzer, mutator, IDOR, auth tester)
├── runtime/       # Runtime instrumentation (hook engine, script gen)
├── memory/        # Knowledge graph, SQLite store
├── models/        # Pydantic data models
├── llm/           # LLM abstraction (Claude, OpenAI, local)
├── reporting/     # Report generator
├── cli/           # CLI commands
└── utils/         # Utilities

frida_scripts/     # Pre-built Frida hooks
signatures/        # Detection signature files
tests/             # Unit and integration tests
```

## Device Setup

1. Enable USB debugging on your Android device
2. Connect via USB
3. Accept RSA key prompt on device
4. Verify: `sentinel devices`

For runtime hooks:
- Device must be **rooted** (Magisk/KernelSU)
- **Frida server** must be on device:
  ```bash
  # Download frida-server matching your frida version
  # Push to device
  adb push frida-server /data/local/tmp/
  adb shell "chmod 755 /data/local/tmp/frida-server"
  adb shell "su -c /data/local/tmp/frida-server &"
  ```

## CLI Reference

```bash
sentinel scan <apk>              # Full security scan
sentinel scan <apk> -v           # Verbose mode
sentinel devices                 # List connected devices
sentinel tools                   # Check tool availability
sentinel engagements             # List past scans
sentinel report <id>             # View report (markdown)
sentinel report <id> -f json     # View report (JSON)
sentinel report <id> -f sarif    # View report (SARIF)
sentinel version                 # Show version
```

## Output Formats

Reports are generated in `~/.sentinel/workspace/reports/`:

- **Markdown** — Full report with executive summary, findings, attack chains, OWASP mapping
- **JSON** — Structured machine-readable report
- **SARIF** — Static Analysis Results Interchange Format (CI/CD integration)

## Testing

```bash
pytest tests/ -v                 # Run all tests
pytest tests/unit/ -v            # Unit tests only
pytest tests/ --cov=sentinel     # With coverage
```

## Development Phases

- [x] **Phase 1** — Core engine, SAST, APK analysis, device management
- [x] **Phase 2** — Runtime instrumentation, DAST, API fuzzing, traffic analysis
- [x] **Phase 3** — Agentic AI, exploit chaining, reporting engine
- [ ] **Phase 4** — Distributed agents, plugin SDK, iOS support

## License

MIT
