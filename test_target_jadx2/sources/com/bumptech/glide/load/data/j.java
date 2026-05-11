package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import i2.EnumC3313a;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes.dex */
public class j implements d {

    /* renamed from: g, reason: collision with root package name */
    static final b f20326g = new a();

    /* renamed from: a, reason: collision with root package name */
    private final o2.h f20327a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20328b;

    /* renamed from: c, reason: collision with root package name */
    private final b f20329c;

    /* renamed from: d, reason: collision with root package name */
    private HttpURLConnection f20330d;

    /* renamed from: e, reason: collision with root package name */
    private InputStream f20331e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f20332f;

    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    interface b {
        HttpURLConnection a(URL url);
    }

    public j(o2.h hVar, int i10) {
        this(hVar, i10, f20326g);
    }

    private HttpURLConnection c(URL url, Map map) {
        try {
            HttpURLConnection a10 = this.f20329c.a(url);
            for (Map.Entry entry : map.entrySet()) {
                a10.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            a10.setConnectTimeout(this.f20328b);
            a10.setReadTimeout(this.f20328b);
            a10.setUseCaches(false);
            a10.setDoInput(true);
            a10.setInstanceFollowRedirects(false);
            return a10;
        } catch (IOException e10) {
            throw new i2.e("URL.openConnection threw", 0, e10);
        }
    }

    private static int d(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e10);
            return -1;
        }
    }

    private InputStream g(HttpURLConnection httpURLConnection) {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f20331e = D2.c.b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f20331e = httpURLConnection.getInputStream();
            }
            return this.f20331e;
        } catch (IOException e10) {
            throw new i2.e("Failed to obtain InputStream", d(httpURLConnection), e10);
        }
    }

    private static boolean h(int i10) {
        return i10 / 100 == 2;
    }

    private static boolean i(int i10) {
        return i10 / 100 == 3;
    }

    private InputStream j(URL url, int i10, URL url2, Map map) {
        if (i10 >= 5) {
            throw new i2.e("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new i2.e("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection c10 = c(url, map);
        this.f20330d = c10;
        try {
            c10.connect();
            this.f20331e = this.f20330d.getInputStream();
            if (this.f20332f) {
                return null;
            }
            int d10 = d(this.f20330d);
            if (h(d10)) {
                return g(this.f20330d);
            }
            if (!i(d10)) {
                if (d10 == -1) {
                    throw new i2.e(d10);
                }
                try {
                    throw new i2.e(this.f20330d.getResponseMessage(), d10);
                } catch (IOException e10) {
                    throw new i2.e("Failed to get a response message", d10, e10);
                }
            }
            String headerField = this.f20330d.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new i2.e("Received empty or null redirect url", d10);
            }
            try {
                URL url3 = new URL(url, headerField);
                b();
                return j(url3, i10 + 1, url, map);
            } catch (MalformedURLException e11) {
                throw new i2.e("Bad redirect url: " + headerField, d10, e11);
            }
        } catch (IOException e12) {
            throw new i2.e("Failed to connect or obtain data", d(this.f20330d), e12);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f20331e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f20330d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f20330d = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f20332f = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public EnumC3313a e() {
        return EnumC3313a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void f(com.bumptech.glide.h hVar, d.a aVar) {
        StringBuilder sb2;
        long b10 = D2.g.b();
        try {
            try {
                aVar.d(j(this.f20327a.i(), 0, null, this.f20327a.e()));
            } catch (IOException e10) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
                }
                aVar.c(e10);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                } else {
                    sb2 = new StringBuilder();
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(D2.g.a(b10));
                Log.v("HttpUrlFetcher", sb2.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + D2.g.a(b10));
            }
            throw th;
        }
    }

    j(o2.h hVar, int i10, b bVar) {
        this.f20327a = hVar;
        this.f20328b = i10;
        this.f20329c = bVar;
    }
}
