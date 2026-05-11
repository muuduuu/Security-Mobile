package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import com.google.android.gms.internal.measurement.AbstractC2303n0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.android.gms.measurement.internal.f5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2674f5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final URL f26053a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f26054b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2658d5 f26055c;

    /* renamed from: d, reason: collision with root package name */
    private final String f26056d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f26057e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2682g5 f26058f;

    public RunnableC2674f5(C2682g5 c2682g5, String str, URL url, byte[] bArr, Map map, InterfaceC2658d5 interfaceC2658d5) {
        Objects.requireNonNull(c2682g5);
        this.f26058f = c2682g5;
        AbstractC1287s.g(str);
        AbstractC1287s.m(url);
        AbstractC1287s.m(interfaceC2658d5);
        this.f26053a = url;
        this.f26054b = bArr;
        this.f26055c = interfaceC2658d5;
        this.f26056d = str;
        this.f26057e = map;
    }

    private final void b(final int i10, final Exception exc, final byte[] bArr, final Map map) {
        this.f26058f.f25694a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.e5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                RunnableC2674f5.this.a(i10, exc, bArr, map);
            }
        });
    }

    final /* synthetic */ void a(int i10, Exception exc, byte[] bArr, Map map) {
        this.f26055c.a(this.f26056d, i10, exc, bArr, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.OutputStream] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map map;
        Map map2;
        Map map3;
        Map map4;
        ?? r52;
        ?? r53;
        int responseCode;
        Object obj;
        Object obj2;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        C2682g5 c2682g5 = this.f26058f;
        c2682g5.g();
        int i10 = 0;
        try {
            URL url = this.f26053a;
            int i11 = AbstractC2303n0.f24576a;
            URLConnection openConnection = url.openConnection();
            if (!(openConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            C2760q3 c2760q3 = c2682g5.f25694a;
            c2760q3.w();
            httpURLConnection.setConnectTimeout(60000);
            c2760q3.w();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            ?? r54 = 1;
            httpURLConnection.setDoInput(true);
            try {
                try {
                    Map map5 = this.f26057e;
                    if (map5 != null) {
                        for (Map.Entry entry : map5.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    byte[] bArr = this.f26054b;
                    if (bArr != null) {
                        try {
                            c2760q3.c();
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            byteArrayOutputStream2.close();
                            byte[] byteArray = byteArrayOutputStream2.toByteArray();
                            A2 w10 = this.f26058f.f25694a.a().w();
                            int length = byteArray.length;
                            w10.b("Uploading data. size", Integer.valueOf(length));
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            try {
                                outputStream.write(byteArray);
                                outputStream.close();
                                r54 = outputStream;
                            } catch (IOException e10) {
                                e = e10;
                                map4 = null;
                                r53 = outputStream;
                                if (r53 != 0) {
                                }
                                if (httpURLConnection != null) {
                                }
                                b(i10, e, null, map4);
                            } catch (Throwable th) {
                                th = th;
                                map3 = null;
                                r52 = outputStream;
                                if (r52 != 0) {
                                }
                                if (httpURLConnection != null) {
                                }
                                b(i10, null, null, map3);
                                throw th;
                            }
                        } catch (IOException e11) {
                            this.f26058f.f25694a.a().o().b("Failed to gzip post request content", e11);
                            throw e11;
                        }
                    }
                    responseCode = httpURLConnection.getResponseCode();
                } catch (IOException e12) {
                    e = e12;
                    map2 = null;
                    map4 = map2;
                    r53 = map2;
                    if (r53 != 0) {
                        try {
                            r53.close();
                        } catch (IOException e13) {
                            this.f26058f.f25694a.a().o().c("Error closing HTTP compressed POST connection output stream. appId", C2.x(this.f26056d), e13);
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    b(i10, e, null, map4);
                }
            } catch (Throwable th2) {
                th = th2;
                map = null;
                map3 = map;
                r52 = map;
                if (r52 != 0) {
                    try {
                        r52.close();
                    } catch (IOException e14) {
                        this.f26058f.f25694a.a().o().c("Error closing HTTP compressed POST connection output stream. appId", C2.x(this.f26056d), e14);
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                b(i10, null, null, map3);
                throw th;
            }
            try {
                try {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        inputStream = httpURLConnection.getInputStream();
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = null;
                    }
                    try {
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr2);
                            if (read <= 0) {
                                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                                inputStream.close();
                                httpURLConnection.disconnect();
                                b(responseCode, null, byteArray2, headerFields);
                                return;
                            }
                            byteArrayOutputStream.write(bArr2, 0, read);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        throw th;
                    }
                } catch (IOException e15) {
                    e = e15;
                    obj2 = null;
                    map4 = null;
                    IOException iOException = e;
                    i10 = responseCode;
                    e = iOException;
                    r53 = obj2;
                    if (r53 != 0) {
                    }
                    if (httpURLConnection != null) {
                    }
                    b(i10, e, null, map4);
                } catch (Throwable th5) {
                    th = th5;
                    obj = null;
                    map3 = null;
                    Throwable th6 = th;
                    i10 = responseCode;
                    th = th6;
                    r52 = obj;
                    if (r52 != 0) {
                    }
                    if (httpURLConnection != null) {
                    }
                    b(i10, null, null, map3);
                    throw th;
                }
            } catch (IOException e16) {
                e = e16;
                map4 = r54;
                obj2 = null;
                IOException iOException2 = e;
                i10 = responseCode;
                e = iOException2;
                r53 = obj2;
                if (r53 != 0) {
                }
                if (httpURLConnection != null) {
                }
                b(i10, e, null, map4);
            } catch (Throwable th7) {
                th = th7;
                map3 = r54;
                obj = null;
                Throwable th62 = th;
                i10 = responseCode;
                th = th62;
                r52 = obj;
                if (r52 != 0) {
                }
                if (httpURLConnection != null) {
                }
                b(i10, null, null, map3);
                throw th;
            }
        } catch (IOException e17) {
            e = e17;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
            map = null;
        }
    }
}
