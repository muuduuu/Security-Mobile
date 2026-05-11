package io.sentry.transport;

import io.sentry.C3416h1;
import io.sentry.ILogger;
import io.sentry.K1;
import io.sentry.L0;
import io.sentry.P1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
final class n {

    /* renamed from: e, reason: collision with root package name */
    private static final Charset f35528e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final Proxy f35529a;

    /* renamed from: b, reason: collision with root package name */
    private final L0 f35530b;

    /* renamed from: c, reason: collision with root package name */
    private final P1 f35531c;

    /* renamed from: d, reason: collision with root package name */
    private final y f35532d;

    public n(P1 p12, L0 l02, y yVar) {
        this(p12, l02, l.a(), yVar);
    }

    private void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
        httpURLConnection.disconnect();
    }

    private HttpURLConnection b() {
        HttpURLConnection e10 = e();
        for (Map.Entry entry : this.f35530b.a().entrySet()) {
            e10.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        e10.setRequestMethod("POST");
        e10.setDoOutput(true);
        e10.setRequestProperty("Content-Encoding", "gzip");
        e10.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        e10.setRequestProperty("Accept", "application/json");
        e10.setRequestProperty("Connection", "close");
        e10.setConnectTimeout(this.f35531c.getConnectionTimeoutMillis());
        e10.setReadTimeout(this.f35531c.getReadTimeoutMillis());
        HostnameVerifier hostnameVerifier = this.f35531c.getHostnameVerifier();
        boolean z10 = e10 instanceof HttpsURLConnection;
        if (z10 && hostnameVerifier != null) {
            ((HttpsURLConnection) e10).setHostnameVerifier(hostnameVerifier);
        }
        SSLSocketFactory sslSocketFactory = this.f35531c.getSslSocketFactory();
        if (z10 && sslSocketFactory != null) {
            ((HttpsURLConnection) e10).setSSLSocketFactory(sslSocketFactory);
        }
        e10.connect();
        return e10;
    }

    private String c(HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f35528e));
                try {
                    StringBuilder sb2 = new StringBuilder();
                    boolean z10 = true;
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (!z10) {
                            sb2.append("\n");
                        }
                        sb2.append(readLine);
                        z10 = false;
                    }
                    String sb3 = sb2.toString();
                    bufferedReader.close();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    return sb3;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    private boolean d(int i10) {
        return i10 == 200;
    }

    private A f(HttpURLConnection httpURLConnection) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                i(httpURLConnection, responseCode);
                if (d(responseCode)) {
                    this.f35531c.getLogger().c(K1.DEBUG, "Envelope sent successfully.", new Object[0]);
                    A e10 = A.e();
                    a(httpURLConnection);
                    return e10;
                }
                ILogger logger = this.f35531c.getLogger();
                K1 k12 = K1.ERROR;
                logger.c(k12, "Request failed, API returned %s", Integer.valueOf(responseCode));
                if (this.f35531c.isDebug()) {
                    this.f35531c.getLogger().c(k12, c(httpURLConnection), new Object[0]);
                }
                A b10 = A.b(responseCode);
                a(httpURLConnection);
                return b10;
            } catch (IOException e11) {
                this.f35531c.getLogger().a(K1.ERROR, e11, "Error reading and logging the response stream", new Object[0]);
                a(httpURLConnection);
                return A.a();
            }
        } catch (Throwable th) {
            a(httpURLConnection);
            throw th;
        }
    }

    private Proxy g(P1.e eVar) {
        if (eVar != null) {
            String c10 = eVar.c();
            String a10 = eVar.a();
            if (c10 != null && a10 != null) {
                try {
                    return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(a10, Integer.parseInt(c10)));
                } catch (NumberFormatException e10) {
                    this.f35531c.getLogger().a(K1.ERROR, e10, "Failed to parse Sentry Proxy port: " + eVar.c() + ". Proxy is ignored", new Object[0]);
                }
            }
        }
        return null;
    }

    HttpURLConnection e() {
        return (HttpURLConnection) (this.f35529a == null ? this.f35530b.b().openConnection() : this.f35530b.b().openConnection(this.f35529a));
    }

    public A h(C3416h1 c3416h1) {
        try {
            OutputStream outputStream = b().getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f35531c.getSerializer().b(c3416h1, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } finally {
                }
            } finally {
            }
        } finally {
            try {
            } finally {
            }
        }
        return f(r0);
    }

    public void i(HttpURLConnection httpURLConnection, int i10) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        this.f35532d.k(httpURLConnection.getHeaderField("X-Sentry-Rate-Limits"), headerField, i10);
    }

    n(P1 p12, L0 l02, l lVar, y yVar) {
        this.f35530b = l02;
        this.f35531c = p12;
        this.f35532d = yVar;
        Proxy g10 = g(p12.getProxy());
        this.f35529a = g10;
        if (g10 == null || p12.getProxy() == null) {
            return;
        }
        String d10 = p12.getProxy().d();
        String b10 = p12.getProxy().b();
        if (d10 == null || b10 == null) {
            return;
        }
        lVar.b(new u(d10, b10));
    }
}
