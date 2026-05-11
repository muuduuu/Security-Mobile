"""Prompt templates for security analysis."""

from sentinel.llm.provider import LLMMessage

# --- SAST Prompts ---

SAST_SYSTEM_PROMPT = LLMMessage(
    role="system",
    content=(
        "You are an expert mobile security analyst specializing in Android application security. "
        "You analyze decompiled source code, manifests, and runtime behavior to identify vulnerabilities. "
        "You categorize findings using OWASP Mobile Top 10 categories. "
        "You are thorough, precise, and always provide evidence-based analysis."
    ),
)

SAST_CODE_ANALYSIS_PROMPT = """Analyze the following decompiled Android source code for security vulnerabilities.

Focus on:
- Hardcoded secrets, API keys, tokens, passwords
- Insecure data storage (SharedPreferences, files)
- Cryptographic misuse (weak algorithms, hardcoded keys/IVs)
- WebView vulnerabilities (JavaScript enabled, file access)
- Intent injection / unsafe component exports
- SQL injection
- Insecure network communication
- Improper certificate validation
- Tapjacking vulnerabilities
- Logging of sensitive data

Package: {package_name}
File: {file_path}

```java
{source_code}
```

For each finding, provide:
1. Title
2. Severity (critical/high/medium/low/info)
3. OWASP Mobile Top 10 category
4. Description
5. Evidence (exact code snippet)
6. Remediation advice
"""

SAST_MANIFEST_ANALYSIS_PROMPT = """Analyze the following AndroidManifest.xml for security issues.

Package: {package_name}
Min SDK: {min_sdk}
Target SDK: {target_sdk}

```xml
{manifest_content}
```

Focus on:
- Overly permissive dangerous permissions
- Exported components without proper protection
- Deep links / custom URL schemes
- Backup enabled (android:allowBackup)
- Debuggable enabled (android:debuggable)
- Network security config
- Task hijacking potential
"""

# --- Planner Prompts ---

PLANNER_SYSTEM_PROMPT = LLMMessage(
    role="system",
    content=(
        "You are a senior mobile penetration testing planner. "
        "Given APK metadata and initial analysis results, you produce an attack plan "
        "specifying which security tests to run, in what order, and with what priority. "
        "You think like an attacker and focus on high-impact attack vectors first."
    ),
)

PLANNER_PROMPT = """Given the following APK analysis results, produce a pentest attack plan.

APK Info:
- Package: {package_name}
- App: {app_name}
- Version: {version_name}
- Min SDK: {min_sdk}

Initial Findings:
{findings_summary}

Attack Surface:
{attack_surface}

Produce a prioritized list of attacks to attempt, specifying:
1. Attack type (sast/dast/runtime/api_fuzzing/auth_abuse)
2. Target (what to test)
3. Priority (1-5, 5 highest)
4. Dependencies (what must be done first)
5. Expected technique
"""

# --- Exploit Prompts ---

EXPLOIT_SYSTEM_PROMPT = LLMMessage(
    role="system",
    content=(
        "You are an exploit developer specializing in mobile application vulnerabilities. "
        "You validate findings by producing working proof-of-concept exploits. "
        "You generate Frida scripts, ADB commands, and HTTP requests to demonstrate vulnerabilities."
    ),
)

FRIDA_SCRIPT_GEN_PROMPT = """Generate a Frida script for the following target:

Target class: {class_name}
Target method: {method_name}
Package: {package_name}

Goal: {goal}

Additional context:
{context}

Generate a complete, working Frida JavaScript script that:
1. Hooks the specified target
2. Logs arguments and return values
3. Performs the requested action (bypass, extract, modify)
4. Handles errors gracefully
"""

# --- Report Prompts ---

REPORT_SYSTEM_PROMPT = LLMMessage(
    role="system",
    content=(
        "You are a security report writer. You produce clear, professional "
        "penetration test reports with executive summaries and technical details."
    ),
)
