package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.producers.X;
import i3.InterfaceC3317b;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class D extends AbstractC1837d {

    /* renamed from: a, reason: collision with root package name */
    private int f20753a;

    /* renamed from: b, reason: collision with root package name */
    private String f20754b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f20755c;

    /* renamed from: d, reason: collision with root package name */
    private final ExecutorService f20756d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3317b f20757e;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f20758a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X.a f20759b;

        a(c cVar, X.a aVar) {
            this.f20758a = cVar;
            this.f20759b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            D.this.j(this.f20758a, this.f20759b);
        }
    }

    class b extends AbstractC1839f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Future f20761a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X.a f20762b;

        b(Future future, X.a aVar) {
            this.f20761a = future;
            this.f20762b = aVar;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            if (this.f20761a.cancel(false)) {
                this.f20762b.a();
            }
        }
    }

    public static class c extends C {

        /* renamed from: f, reason: collision with root package name */
        private long f20764f;

        /* renamed from: g, reason: collision with root package name */
        private long f20765g;

        /* renamed from: h, reason: collision with root package name */
        private long f20766h;

        public c(InterfaceC1847n interfaceC1847n, e0 e0Var) {
            super(interfaceC1847n, e0Var);
        }
    }

    public D(int i10) {
        this(null, null, RealtimeSinceBootClock.get());
        this.f20753a = i10;
    }

    private HttpURLConnection g(Uri uri, int i10) {
        HttpURLConnection o10 = o(uri);
        String str = this.f20754b;
        if (str != null) {
            o10.setRequestProperty("User-Agent", str);
        }
        Map map = this.f20755c;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                o10.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        o10.setConnectTimeout(this.f20753a);
        int responseCode = o10.getResponseCode();
        if (m(responseCode)) {
            return o10;
        }
        if (!l(responseCode)) {
            o10.disconnect();
            throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
        }
        String headerField = o10.getHeaderField("Location");
        o10.disconnect();
        Uri parse = headerField == null ? null : Uri.parse(headerField);
        String scheme = uri.getScheme();
        if (i10 <= 0 || parse == null || b3.j.a(parse.getScheme(), scheme)) {
            throw new IOException(i10 == 0 ? h("URL %s follows too many redirects", uri.toString()) : h("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode)));
        }
        return g(parse, i10 - 1);
    }

    private static String h(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    private static boolean l(int i10) {
        if (i10 == 307 || i10 == 308) {
            return true;
        }
        switch (i10) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    private static boolean m(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    static HttpURLConnection o(Uri uri) {
        return (HttpURLConnection) j3.f.p(uri).openConnection();
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public c e(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        return new c(interfaceC1847n, e0Var);
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, X.a aVar) {
        cVar.f20764f = this.f20757e.now();
        cVar.b().d(new b(this.f20756d.submit(new a(cVar, aVar)), aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void j(c cVar, X.a aVar) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream = null;
        try {
            httpURLConnection = g(cVar.g(), 5);
            try {
                try {
                    cVar.f20765g = this.f20757e.now();
                    if (httpURLConnection != null) {
                        inputStream = httpURLConnection.getInputStream();
                        aVar.b(inputStream, -1);
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (httpURLConnection == null) {
                        return;
                    }
                } catch (IOException e10) {
                    e = e10;
                    aVar.onFailure(e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (httpURLConnection == null) {
                        return;
                    }
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                if (httpURLConnection != null) {
                    throw th;
                }
                httpURLConnection.disconnect();
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            httpURLConnection = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
            if (inputStream != null) {
            }
            if (httpURLConnection != null) {
            }
        }
        httpURLConnection.disconnect();
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Map c(c cVar, int i10) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(cVar.f20765g - cVar.f20764f));
        hashMap.put("fetch_time", Long.toString(cVar.f20766h - cVar.f20765g));
        hashMap.put("total_time", Long.toString(cVar.f20766h - cVar.f20764f));
        hashMap.put("image_size", Integer.toString(i10));
        return hashMap;
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void a(c cVar, int i10) {
        cVar.f20766h = this.f20757e.now();
    }

    D(String str, Map map, InterfaceC3317b interfaceC3317b) {
        this.f20756d = Executors.newFixedThreadPool(3);
        this.f20757e = interfaceC3317b;
        this.f20755c = map;
        this.f20754b = str;
    }
}
