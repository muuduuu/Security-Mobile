// SSL Pinning Bypass — Universal
// Hooks common SSL/TLS pinning implementations

Java.perform(function () {
    console.log("[*] SSL Pinning Bypass loaded");

    // --- TrustManager bypass ---
    try {
        var TrustManager = Java.use("javax.net.ssl.X509TrustManager");
        var SSLContext = Java.use("javax.net.ssl.SSLContext");

        var TrustManagerImpl = Java.registerClass({
            name: "com.sentinel.TrustManager",
            implements: [TrustManager],
            methods: {
                checkClientTrusted: function (chain, authType) {},
                checkServerTrusted: function (chain, authType) {},
                getAcceptedIssuers: function () {
                    return [];
                },
            },
        });

        var SSLContextInit = SSLContext.init.overload(
            "[Ljavax.net.ssl.KeyManager;", "[Ljavax.net.ssl.TrustManager;", "java.security.SecureRandom"
        );
        SSLContextInit.implementation = function (km, tm, sr) {
            console.log("[+] SSLContext.init intercepted — bypassing pinning");
            this.init(km, [TrustManagerImpl.$new()], sr);
        };
        console.log("[+] TrustManager bypass active");
    } catch (e) {
        console.log("[-] TrustManager bypass failed: " + e);
    }

    // --- OkHttp CertificatePinner bypass ---
    try {
        var CertificatePinner = Java.use("okhttp3.CertificatePinner");
        CertificatePinner.check.overload("java.lang.String", "java.util.List").implementation = function (hostname, peerCertificates) {
            console.log("[+] OkHttp CertificatePinner.check bypassed for: " + hostname);
        };
        console.log("[+] OkHttp CertificatePinner bypass active");
    } catch (e) {
        console.log("[-] OkHttp bypass failed (not using OkHttp): " + e);
    }

    // --- WebView SSL error bypass ---
    try {
        var WebViewClient = Java.use("android.webkit.WebViewClient");
        WebViewClient.onReceivedSslError.implementation = function (view, handler, error) {
            console.log("[+] WebView SSL error bypassed");
            handler.proceed();
        };
        console.log("[+] WebView SSL bypass active");
    } catch (e) {
        console.log("[-] WebView SSL bypass failed: " + e);
    }

    // --- HttpClient SSL bypass ---
    try {
        var DefaultHttpClient = Java.use("org.apache.http.impl.client.DefaultHttpClient");
        console.log("[+] Apache HttpClient detected");
    } catch (e) {
        // Not using Apache HttpClient
    }

    console.log("[*] SSL Pinning Bypass complete");
});
