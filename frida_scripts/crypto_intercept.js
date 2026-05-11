// Crypto Operation Interception
// Hooks javax.crypto to intercept encryption/decryption operations

Java.perform(function () {
    console.log("[*] Crypto Interception loaded");

    // --- Cipher interception ---
    try {
        var Cipher = Java.use("javax.crypto.Cipher");

        Cipher.init.overload("int", "java.security.Key").implementation = function (opmode, key) {
            var mode = opmode === 1 ? "ENCRYPT" : opmode === 2 ? "DECRYPT" : "MODE_" + opmode;
            var algorithm = this.getAlgorithm();
            var keyBytes = key.getEncoded ? key.getEncoded() : null;
            console.log("[+] Cipher.init: " + mode + " | Algorithm: " + algorithm);
            if (keyBytes) {
                console.log("    Key (hex): " + bytesToHex(keyBytes));
                console.log("    Key (b64): " + bytesToBase64(keyBytes));
            }
            return this.init(opmode, key);
        };

        Cipher.doFinal.overload("[B").implementation = function (input) {
            var algorithm = this.getAlgorithm();
            console.log("[+] Cipher.doFinal | Algorithm: " + algorithm);
            console.log("    Input (hex): " + bytesToHex(input));
            console.log("    Input length: " + input.length);

            var result = this.doFinal(input);
            if (result) {
                console.log("    Output (hex): " + bytesToHex(result));
                console.log("    Output length: " + result.length);
                console.log("    Output (b64): " + bytesToBase64(result));
            }
            return result;
        };
        console.log("[+] Cipher interception active");
    } catch (e) {
        console.log("[-] Cipher interception failed: " + e);
    }

    // --- MessageDigest (hashing) interception ---
    try {
        var MessageDigest = Java.use("java.security.MessageDigest");
        MessageDigest.getInstance.overload("java.lang.String").implementation = function (algorithm) {
            console.log("[+] MessageDigest: " + algorithm);
            return this.getInstance(algorithm);
        };

        MessageDigest.update.overload("[B").implementation = function (input) {
            console.log("[+] MessageDigest.update: " + bytesToHex(input));
            return this.update(input);
        };

        MessageDigest.digest.overload().implementation = function () {
            var result = this.digest();
            console.log("[+] MessageDigest.digest: " + bytesToHex(result));
            return result;
        };
        console.log("[+] MessageDigest interception active");
    } catch (e) {
        console.log("[-] MessageDigest interception failed: " + e);
    }

    // --- SecretKeySpec interception ---
    try {
        var SecretKeySpec = Java.use("javax.crypto.spec.SecretKeySpec");
        SecretKeySpec.$init.overload("[B", "java.lang.String").implementation = function (keyBytes, algorithm) {
            console.log("[+] SecretKeySpec created");
            console.log("    Algorithm: " + algorithm);
            console.log("    Key (hex): " + bytesToHex(keyBytes));
            console.log("    Key (b64): " + bytesToBase64(keyBytes));
            return this.$init(keyBytes, algorithm);
        };
        console.log("[+] SecretKeySpec interception active");
    } catch (e) {
        console.log("[-] SecretKeySpec interception failed: " + e);
    }

    // --- IVParameterSpec interception ---
    try {
        var IvParameterSpec = Java.use("javax.crypto.spec.IvParameterSpec");
        IvParameterSpec.$init.overload("[B").implementation = function (iv) {
            console.log("[+] IvParameterSpec created");
            console.log("    IV (hex): " + bytesToHex(iv));
            return this.$init(iv);
        };
    } catch (e) {}

    console.log("[*] Crypto Interception complete");

    // --- Helper functions ---
    function bytesToHex(bytes) {
        if (!bytes) return "null";
        var hex = "";
        for (var i = 0; i < bytes.length && i < 256; i++) {
            hex += ("0" + (bytes[i] & 0xff).toString(16)).slice(-2);
        }
        return hex;
    }

    function bytesToBase64(bytes) {
        if (!bytes) return "null";
        var Base64 = Java.use("android.util.Base64");
        return Base64.encodeToString(bytes, 0);
    }
});
