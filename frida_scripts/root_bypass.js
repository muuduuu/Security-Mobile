// Root Detection Bypass — Universal
// Hooks common root detection methods

Java.perform(function () {
    console.log("[*] Root Detection Bypass loaded");

    // --- File-based root detection ---
    try {
        var File = Java.use("java.io.File");
        File.exists.implementation = function () {
            var path = this.getAbsolutePath();
            var rootPaths = [
                "/system/app/Superuser.apk",
                "/sbin/su", "/system/bin/su", "/system/xbin/su",
                "/data/local/xbin/su", "/data/local/bin/su",
                "/system/sd/xbin/su", "/system/bin/failsafe/su",
                "/data/local/su", "/su/bin/su",
                "/magisk/.core/bin/su",
                "/system/app/SuperSU", "/system/app/SuperSU.apk",
                "/system/lib/libsu.so",
                "/system/bin/.ext/.su",
                "/system/usr/we-need-root",
            ];
            if (rootPaths.indexOf(path) >= 0) {
                console.log("[+] Root check bypassed (file): " + path);
                return false;
            }
            return this.exists();
        };
        console.log("[+] File-based root detection bypass active");
    } catch (e) {
        console.log("[-] File bypass failed: " + e);
    }

    // --- PackageManager-based detection ---
    try {
        var PackageManager = Java.use("android.app.ApplicationPackageManager");
        PackageManager.getPackageInfo.overload("java.lang.String", "int").implementation = function (packageName, flags) {
            var rootPackages = [
                "com.noshufou.android.su",
                "eu.chainfire.supersu",
                "com.koushikdutta.superuser",
                "com.thirdparty.superuser",
                "com.yellowes.su",
                "com.topjohnwu.magisk",
            ];
            if (rootPackages.indexOf(packageName) >= 0) {
                console.log("[+] Root package check bypassed: " + packageName);
                throw Java.use("android.content.pm.PackageManager$NameNotFoundException").$new("Package not found");
            }
            return this.getPackageInfo(packageName, flags);
        };
        console.log("[+] PackageManager bypass active");
    } catch (e) {
        console.log("[-] PackageManager bypass failed: " + e);
    }

    // --- Runtime.exec("su") bypass ---
    try {
        var Runtime = Java.use("java.lang.Runtime");
        Runtime.exec.overload("java.lang.String").implementation = function (cmd) {
            if (cmd === "su" || cmd.indexOf("su ") === 0) {
                console.log("[+] Runtime.exec('su') bypassed");
                throw Java.use("java.io.IOException").$new("Permission denied");
            }
            return this.exec(cmd);
        };
        console.log("[+] Runtime.exec bypass active");
    } catch (e) {
        console.log("[-] Runtime.exec bypass failed: " + e);
    }

    // --- BuildConfig / Settings.Secure checks ---
    try {
        var Settings = Java.use("android.provider.Settings$Secure");
        var getString = Settings.getString.overload("android.content.ContentResolver", "java.lang.String");
        getString.implementation = function (resolver, name) {
            if (name === "adb_enabled") {
                return "0";
            }
            return getString.call(this, resolver, name);
        };
    } catch (e) {}

    console.log("[*] Root Detection Bypass complete");
});
