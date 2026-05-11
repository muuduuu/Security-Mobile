// Socket Monitor — Intercepts network socket connections
// Captures all TCP/UDP connections and data

Java.perform(function () {
    console.log("[*] Socket Monitor loaded");

    // --- Socket connection monitoring ---
    try {
        var Socket = Java.use("java.net.Socket");
        Socket.$init.overload("java.lang.String", "int").implementation = function (host, port) {
            console.log("[+] Socket.connect: " + host + ":" + port);
            return this.$init(host, port);
        };
        Socket.$init.overload("java.net.InetAddress", "int").implementation = function (addr, port) {
            console.log("[+] Socket.connect: " + addr.getHostAddress() + ":" + port);
            return this.$init(addr, port);
        };
        console.log("[+] Socket connection monitoring active");
    } catch (e) {
        console.log("[-] Socket monitoring failed: " + e);
    }

    // --- URLConnection monitoring ---
    try {
        var URL = Java.use("java.net.URL");
        URL.openConnection.overload().implementation = function () {
            console.log("[+] URL.openConnection: " + this.toString());
            return this.openConnection();
        };
    } catch (e) {}

    // --- OkHttp monitoring ---
    try {
        var OkHttpClient = Java.use("okhttp3.OkHttpClient");
        var newCall = OkHttpClient.newCall;
        newCall.implementation = function (request) {
            var url = request.url().toString();
            var method = request.method();
            console.log("[+] OkHttp Request: " + method + " " + url);

            // Capture headers
            var headers = request.headers();
            var authHeader = headers.get("Authorization");
            if (authHeader) {
                console.log("    Authorization: " + authHeader);
            }

            return this.newCall(request);
        };
        console.log("[+] OkHttp monitoring active");
    } catch (e) {
        console.log("[-] OkHttp monitoring failed: " + e);
    }

    // --- HttpURLConnection monitoring ---
    try {
        var HttpURLConnection = Java.use("java.net.HttpURLConnection");
        HttpURLConnection.setRequestMethod.implementation = function (method) {
            console.log("[+] HTTP Request: " + method + " " + this.getURL().toString());
            return this.setRequestMethod(method);
        };
    } catch (e) {}

    // --- WebView URL monitoring ---
    try {
        var WebView = Java.use("android.webkit.WebView");
        WebView.loadUrl.overload("java.lang.String").implementation = function (url) {
            console.log("[+] WebView.loadUrl: " + url);
            return this.loadUrl(url);
        };
    } catch (e) {}

    console.log("[*] Socket Monitor complete");
});
