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

/* loaded from: classes2.dex */
final class G2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final URL f25408a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f25409b;

    /* renamed from: c, reason: collision with root package name */
    private final E2 f25410c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25411d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f25412e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ H2 f25413f;

    public G2(H2 h22, String str, URL url, byte[] bArr, Map map, E2 e22) {
        Objects.requireNonNull(h22);
        this.f25413f = h22;
        AbstractC1287s.g(str);
        AbstractC1287s.m(url);
        AbstractC1287s.m(e22);
        this.f25408a = url;
        this.f25409b = bArr;
        this.f25410c = e22;
        this.f25411d = str;
        this.f25412e = map;
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00fd: MOVE (r8 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:254), block:B:80:0x00fc */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0100: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:257), block:B:78:0x00ff */
    /* JADX WARN: Removed duplicated region for block: B:24:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int i11;
        Map map2;
        F2 f22;
        C2696i3 c2696i3;
        URLConnection openConnection;
        Map map3;
        Map map4;
        InputStream inputStream;
        H2 h22 = this.f25413f;
        h22.g();
        OutputStream outputStream = null;
        try {
            URL url = this.f25408a;
            int i12 = AbstractC2303n0.f24576a;
            openConnection = url.openConnection();
        } catch (IOException e10) {
            iOException = e10;
            i11 = 0;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th) {
            th = th;
            i10 = 0;
            httpURLConnection = null;
            map = null;
        }
        if (!(openConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain HTTP connection");
        }
        httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setDefaultUseCaches(false);
        C2760q3 c2760q3 = h22.f25694a;
        c2760q3.w();
        httpURLConnection.setConnectTimeout(60000);
        c2760q3.w();
        httpURLConnection.setReadTimeout(61000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setDoInput(true);
        try {
            Map map5 = this.f25412e;
            if (map5 != null) {
                for (Map.Entry entry : map5.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            byte[] bArr = this.f25409b;
            if (bArr != null) {
                byte[] V10 = h22.f25405b.K0().V(bArr);
                A2 w10 = c2760q3.a().w();
                int length = V10.length;
                w10.b("Uploading data. size", Integer.valueOf(length));
                httpURLConnection.setDoOutput(true);
                httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setFixedLengthStreamingMode(length);
                httpURLConnection.connect();
                OutputStream outputStream2 = httpURLConnection.getOutputStream();
                try {
                    outputStream2.write(V10);
                    outputStream2.close();
                } catch (IOException e11) {
                    iOException = e11;
                    i11 = 0;
                    map2 = null;
                    outputStream = outputStream2;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    H2 h23 = this.f25413f;
                    String str = this.f25411d;
                    E2 e22 = this.f25410c;
                    c2696i3 = h23.f25694a.b();
                    f22 = new F2(str, e22, i11, iOException, null, map2, null);
                    c2696i3.t(f22);
                } catch (Throwable th2) {
                    th = th2;
                    map = null;
                    outputStream = outputStream2;
                    i10 = 0;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    this.f25413f.f25694a.b().t(new F2(this.f25411d, this.f25410c, i10, null, null, map, null));
                    throw th;
                }
            }
            int responseCode = httpURLConnection.getResponseCode();
            try {
                try {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        inputStream = httpURLConnection.getInputStream();
                        try {
                            byte[] bArr2 = new byte[1024];
                            while (true) {
                                int read = inputStream.read(bArr2);
                                if (read <= 0) {
                                    break;
                                } else {
                                    byteArrayOutputStream.write(bArr2, 0, read);
                                }
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            inputStream.close();
                            httpURLConnection.disconnect();
                            H2 h24 = this.f25413f;
                            String str2 = this.f25411d;
                            E2 e23 = this.f25410c;
                            c2696i3 = h24.f25694a.b();
                            f22 = new F2(str2, e23, responseCode, null, byteArray, headerFields, null);
                        } catch (Throwable th3) {
                            th = th3;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = null;
                    }
                } catch (IOException e12) {
                    e = e12;
                    map2 = null;
                    i11 = responseCode;
                    iOException = e;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e13) {
                            this.f25413f.f25694a.a().o().c("Error closing HTTP compressed POST connection output stream. appId", C2.x(this.f25411d), e13);
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    H2 h232 = this.f25413f;
                    String str3 = this.f25411d;
                    E2 e222 = this.f25410c;
                    c2696i3 = h232.f25694a.b();
                    f22 = new F2(str3, e222, i11, iOException, null, map2, null);
                    c2696i3.t(f22);
                } catch (Throwable th5) {
                    th = th5;
                    i10 = responseCode;
                    map = null;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e14) {
                            this.f25413f.f25694a.a().o().c("Error closing HTTP compressed POST connection output stream. appId", C2.x(this.f25411d), e14);
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.f25413f.f25694a.b().t(new F2(this.f25411d, this.f25410c, i10, null, null, map, null));
                    throw th;
                }
            } catch (IOException e15) {
                e = e15;
                i11 = responseCode;
                map2 = map4;
                iOException = e;
                if (outputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                H2 h2322 = this.f25413f;
                String str32 = this.f25411d;
                E2 e2222 = this.f25410c;
                c2696i3 = h2322.f25694a.b();
                f22 = new F2(str32, e2222, i11, iOException, null, map2, null);
                c2696i3.t(f22);
            } catch (Throwable th6) {
                th = th6;
                i10 = responseCode;
                map = map3;
                if (outputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                this.f25413f.f25694a.b().t(new F2(this.f25411d, this.f25410c, i10, null, null, map, null));
                throw th;
            }
        } catch (IOException e16) {
            iOException = e16;
            i11 = 0;
            map2 = null;
        } catch (Throwable th7) {
            th = th7;
            i10 = 0;
        }
        c2696i3.t(f22);
    }
}
