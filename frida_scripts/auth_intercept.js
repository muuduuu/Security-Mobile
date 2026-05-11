// Auth Interception — Hooks authentication-related methods
// Captures tokens, credentials, session data

Java.perform(function () {
    console.log("[*] Auth Interception loaded");

    // --- SharedPreferences credential capture ---
    try {
        var SharedPreferences = Java.use("android.app.SharedPreferencesImpl");
        var Editor = Java.use("android.app.SharedPreferencesImpl$EditorImpl");

        SharedPreferences.getString.implementation = function (key, defValue) {
            var value = this.getString(key, defValue);
            var sensitiveKeys = ["token", "auth", "session", "password", "pass", "secret",
                                 "credential", "key", "cookie", "jwt", "access", "refresh"];
            var lowerKey = key.toLowerCase();
            for (var i = 0; i < sensitiveKeys.length; i++) {
                if (lowerKey.indexOf(sensitiveKeys[i]) >= 0) {
                    console.log("[+] SharedPreferences.getString (SENSITIVE)");
                    console.log("    Key: " + key);
                    console.log("    Value: " + value);
                    break;
                }
            }
            return value;
        };
        console.log("[+] SharedPreferences interception active");
    } catch (e) {
        console.log("[-] SharedPreferences interception failed: " + e);
    }

    // --- OkHttp Authorization header capture ---
    try {
        var Request$Builder = Java.use("okhttp3.Request$Builder");
        Request$Builder.header.implementation = function (name, value) {
            if (name.toLowerCase() === "authorization" || name.toLowerCase() === "cookie") {
                console.log("[+] OkHttp Header captured");
                console.log("    " + name + ": " + value);
            }
            return this.header(name, value);
        };
        console.log("[+] OkHttp header interception active");
    } catch (e) {
        console.log("[-] OkHttp header interception failed: " + e);
    }

    // --- URLConnection header capture ---
    try {
        var URLConnection = Java.use("java.net.URLConnection");
        URLConnection.setRequestProperty.implementation = function (key, value) {
            if (key.toLowerCase() === "authorization" || key.toLowerCase() === "cookie") {
                console.log("[+] URLConnection Header captured");
                console.log("    " + key + ": " + value);
            }
            return this.setRequestProperty(key, value);
        };
    } catch (e) {}

    // --- Biometric bypass ---
    try {
        var BiometricPrompt = Java.use("androidx.biometric.BiometricPrompt");
        var onAuthSucceeded = BiometricPrompt.onAuthenticationSucceeded;
        if (onAuthSucceeded) {
            console.log("[+] BiometricPrompt detected — monitoring auth callbacks");
        }
    } catch (e) {}

    console.log("[*] Auth Interception complete");
});
