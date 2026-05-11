"""Dynamic Frida script generation based on analysis findings."""

from __future__ import annotations

import logging
from typing import Any

logger = logging.getLogger(__name__)


def generate_class_hook(
    package_name: str,
    class_name: str,
    method_name: str,
    hook_type: str = "log",
) -> str:
    """Generate a Frida script to hook a specific Java class/method."""
    hook_body = _get_hook_body(hook_type)
    return f"""Java.perform(function () {{
    console.log("[*] Hooking {class_name}.{method_name}");

    try {{
        var clazz = Java.use("{class_name}");

        clazz.{method_name}.overload().implementation = function () {{
            console.log("[+] {class_name}.{method_name} called");
            console.log("    this: " + this);

            var result = this.{method_name}();
            console.log("    result: " + result);

            {hook_body}

            return result;
        }};
    }} catch (e) {{
        console.log("[-] Hook failed: " + e);
    }}
}});
"""


def generate_method_trace(
    package_name: str,
    class_name: str,
    method_name: str,
    arg_types: list[str] | None = None,
) -> str:
    """Generate a script to trace method calls with args and return values."""
    overload = ""
    if arg_types:
        overload = ".overload(" + ", ".join(f'"{t}"' for t in arg_types) + ")"
    else:
        overload = ".overload()"

    return f"""Java.perform(function () {{
    console.log("[*] Tracing {class_name}.{method_name}");

    try {{
        var clazz = Java.use("{class_name}");
        clazz.{method_name}{overload}.implementation = function () {{
            var args = Array.prototype.slice.call(arguments);
            console.log("[TRACE] {class_name}.{method_name} ENTER");
            for (var i = 0; i < args.length; i++) {{
                try {{
                    console.log("    arg[" + i + "]: " + JSON.stringify(args[i]));
                }} catch (e2) {{
                    console.log("    arg[" + i + "]: " + args[i]);
                }}
            }}

            var retval = this.{method_name}.apply(this, arguments);

            try {{
                console.log("    return: " + JSON.stringify(retval));
            }} catch (e3) {{
                console.log("    return: " + retval);
            }}
            console.log("[TRACE] {class_name}.{method_name} EXIT");

            return retval;
        }};
    }} catch (e) {{
        console.log("[-] Trace failed: " + e);
    }}
}});
"""


def generate_shared_prefs_hook(package_name: str) -> str:
    """Generate a script to monitor SharedPreferences reads/writes."""
    return f"""Java.perform(function () {{
    console.log("[*] Monitoring SharedPreferences for {package_name}");

    try {{
        var SharedPreferences = Java.use("android.app.SharedPreferencesImpl");
        var Editor = Java.use("android.app.SharedPreferencesImpl$EditorImpl");

        // Monitor puts
        Editor.putString.implementation = function (key, value) {{
            console.log("[SPUT] " + key + " = " + value);
            return this.putString(key, value);
        }};
        Editor.putInt.implementation = function (key, value) {{
            console.log("[SPUT] " + key + " = " + value + " (int)");
            return this.putInt(key, value);
        }};
        Editor.putBoolean.implementation = function (key, value) {{
            console.log("[SPUT] " + key + " = " + value + " (bool)");
            return this.putBoolean(key, value);
        }};
        Editor.putFloat.implementation = function (key, value) {{
            console.log("[SPUT] " + key + " = " + value + " (float)");
            return this.putFloat(key, value);
        }};
        Editor.putLong.implementation = function (key, value) {{
            console.log("[SPUT] " + key + " = " + value + " (long)");
            return this.putLong(key, value);
        }};

        // Monitor gets
        SharedPreferences.getString.implementation = function (key, defValue) {{
            var val = this.getString(key, defValue);
            console.log("[SGET] " + key + " = " + val);
            return val;
        }};

        console.log("[+] SharedPreferences hooks active");
    }} catch (e) {{
        console.log("[-] SharedPreferences hook failed: " + e);
    }}
}});
"""


def generate_webview_hook(package_name: str) -> str:
    """Generate a script to monitor WebView activity."""
    return f"""Java.perform(function () {{
    console.log("[*] Monitoring WebView for {package_name}");

    try {{
        var WebView = Java.use("android.webkit.WebView");
        WebView.loadUrl.overload("java.lang.String").implementation = function (url) {{
            console.log("[WV] loadUrl: " + url);
            return this.loadUrl(url);
        }};
        WebView.loadUrl.overload("java.lang.String", "java.util.Map").implementation = function (url, headers) {{
            console.log("[WV] loadUrl with headers: " + url);
            return this.loadUrl(url, headers);
        }};
        WebView.loadData.implementation = function (data, mime, encoding) {{
            console.log("[WV] loadData: mime=" + mime + " len=" + data.length());
            return this.loadData(data, mime, encoding);
        }};
        WebView.evaluateJavascript.implementation = function (script, callback) {{
            console.log("[WV] evaluateJavascript: " + script.substring(0, 200));
            return this.evaluateJavascript(script, callback);
        }};

        // Check JavaScript enabled
        var WebSettings = Java.use("android.webkit.WebSettings");
        WebSettings.setJavaScriptEnabled.implementation = function (flag) {{
            console.log("[WV] setJavaScriptEnabled: " + flag);
            return this.setJavaScriptEnabled(flag);
        }};

        console.log("[+] WebView hooks active");
    }} catch (e) {{
        console.log("[-] WebView hook failed: " + e);
    }}
}});
"""


def generate_dynamic_hook_from_jadx(jadx_output: dict[str, Any]) -> list[dict[str, str]]:
    """Generate hooks based on JADX analysis findings."""
    hooks = []

    # Generate hooks for interesting classes found in source
    interesting_patterns = [
        ("login", "auth", "Auth hook"),
        ("token", "auth", "Token capture"),
        ("password", "auth", "Password capture"),
        ("encrypt", "crypto", "Encryption intercept"),
        ("decrypt", "crypto", "Decryption intercept"),
        ("cipher", "crypto", "Cipher intercept"),
        ("secret", "secrets", "Secret capture"),
        ("apikey", "secrets", "API key capture"),
        ("api_key", "secrets", "API key capture"),
        ("payment", "finance", "Payment flow"),
        ("transaction", "finance", "Transaction flow"),
        ("otp", "auth", "OTP intercept"),
        ("pin", "auth", "PIN intercept"),
        ("biometric", "auth", "Biometric bypass"),
    ]

    return hooks


def _get_hook_body(hook_type: str) -> str:
    if hook_type == "log":
        return "console.log(\"    [LOG] Method executed\");"
    elif hook_type == "dump_args":
        return """for (var i = 0; i < arguments.length; i++) {
                console.log("    arg[" + i + "]: " + arguments[i]);
            }"""
    elif hook_type == "return_null":
        return 'console.log("    [MODIFY] Returning null");\n            return null;'
    elif hook_type == "return_true":
        return 'console.log("    [BYPASS] Returning true");\n            return true;'
    return ""
