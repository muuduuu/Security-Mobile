package com.webengage.sdk.android.utils.http;

import android.content.Context;
import android.net.TrafficStats;
import android.text.TextUtils;
import com.webengage.sdk.android.m1;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.WebEngageUtils;
import com.webengage.sdk.android.utils.http.Response;
import com.webengage.sdk.android.x;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes2.dex */
public class c extends com.webengage.sdk.android.utils.http.a {

    /* renamed from: d, reason: collision with root package name */
    String f31001d;

    /* renamed from: e, reason: collision with root package name */
    Response f31002e;

    /* renamed from: f, reason: collision with root package name */
    private Context f31003f;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31004a;

        static {
            int[] iArr = new int[b.values().length];
            f31004a = iArr;
            try {
                iArr[b.MAX_AGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31004a[b.LAST_MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31004a[b.ETAG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31004a[b.EXPIRES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31004a[b.CACHE_CONTROL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private enum b {
        MAX_AGE,
        LAST_MODIFIED,
        ETAG,
        EXPIRES,
        CACHE_CONTROL
    }

    c(Context context, RequestObject requestObject) {
        super(context, requestObject);
        this.f31001d = null;
        this.f31002e = null;
        this.f31003f = null;
        this.f31001d = a(requestObject.e());
        this.f31003f = context;
    }

    private Response h() {
        Response response;
        OutputStream outputStream;
        Response.Builder builder = new Response.Builder();
        builder.c(this.f30998b.d());
        builder.a(this.f30998b.b());
        TrafficStats.setThreadStatsTag(WebEngageConstant.f30862a);
        builder.a(this.f31001d);
        try {
            String e10 = TextUtils.isEmpty(this.f30998b.c()) ? this.f30998b.e() : this.f30998b.c();
            builder.b(e10);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(e10).openConnection();
            httpURLConnection.setRequestMethod(this.f30998b.getRequestMethod().toString());
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(20000);
            if (this.f30998b.getHeaders() != null) {
                for (Map.Entry<String, String> entry : this.f30998b.getHeaders().entrySet()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            }
            RequestMethod requestMethod = RequestMethod.GET;
            if (!requestMethod.toString().equalsIgnoreCase(this.f30998b.getRequestMethod().toString())) {
                httpURLConnection.setDoOutput(true);
            }
            httpURLConnection.setDoInput(true);
            Object params = this.f30998b.getParams();
            if (params != null) {
                if (this.f30998b.getHeaders() != null && this.f30998b.getHeaders().containsKey("Content-Encoding") && "gzip".equalsIgnoreCase(this.f30998b.getHeaders().get("Content-Encoding"))) {
                    httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                    outputStream = httpURLConnection.getOutputStream();
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                    a(new OutputStreamWriter(gZIPOutputStream), params);
                    gZIPOutputStream.close();
                } else {
                    outputStream = httpURLConnection.getOutputStream();
                    a(new OutputStreamWriter(outputStream), params);
                }
                outputStream.close();
            }
            builder.c(httpURLConnection.getResponseCode());
            if (httpURLConnection.getResponseCode() == 304 && requestMethod.equals(this.f30998b.getRequestMethod())) {
                builder.a(false);
            }
            HashMap hashMap = new HashMap();
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            if (headerFields != null) {
                for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(entry2.getValue());
                    if (entry2.getKey() != null) {
                        hashMap.put(entry2.getKey().toLowerCase(), arrayList);
                    }
                }
            }
            builder.setResponseHeaders(hashMap);
            response = builder.build();
            try {
                if (response.getResponseCode() == 200) {
                    response = x.a(this.f30997a).onResponse(this.f30997a, response.getCurrentState().setInputStream(WebEngageUtils.a(httpURLConnection) ? new GZIPInputStream(httpURLConnection.getInputStream()) : httpURLConnection.getInputStream()).build());
                    if (response == null) {
                        return null;
                    }
                    List<m1> list = com.webengage.sdk.android.utils.http.a.f30996c;
                    synchronized (list) {
                        try {
                            Iterator<m1> it = list.iterator();
                            while (it.hasNext()) {
                                response = it.next().a(response, this.f31003f);
                            }
                        } finally {
                        }
                    }
                    response = response.getCurrentState().a(System.currentTimeMillis()).build();
                    if (this.f30998b.getCachePolicy() != 3 && response.isReadable()) {
                        return response.getCurrentState().setInputStream(new ByteArrayInputStream(b(response))).build();
                    }
                } else if (response.getResponseCode() >= 400) {
                    try {
                        response = x.a(this.f30997a).onResponse(this.f30997a, response.getCurrentState().setErrorStream(httpURLConnection.getErrorStream()).build());
                        if (response == null) {
                            return null;
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    response = x.a(this.f30997a).onResponse(this.f30997a, response);
                    if (response == null) {
                        return null;
                    }
                }
                return response;
            } catch (Exception e11) {
                e = e11;
                builder.a(e);
                Response onResponse = x.a(this.f30997a).onResponse(this.f30997a, response);
                if (onResponse != null) {
                    return onResponse;
                }
                return null;
            }
        } catch (Exception e12) {
            e = e12;
            response = null;
        }
    }

    @Override // com.webengage.sdk.android.utils.http.a
    protected Response a(Response response) {
        if (this.f31002e == null) {
            this.f31002e = com.webengage.sdk.android.utils.http.b.b(this.f31003f).b(this.f31001d);
        }
        if (response != null) {
            this.f31002e = this.f31002e.getCurrentState().c(response.getResponseCode()).build();
        }
        return this.f31002e.getCurrentState().c(this.f30998b.d()).a(this.f30998b.b()).b(this.f30998b.getRequestURL()).build();
    }

    protected byte[] b(Response response) {
        return com.webengage.sdk.android.utils.http.b.b(this.f31003f).a(response);
    }

    @Override // com.webengage.sdk.android.utils.http.a
    protected Response c() {
        return h();
    }

    @Override // com.webengage.sdk.android.utils.http.a
    Response d() {
        return this.f31002e;
    }

    @Override // com.webengage.sdk.android.utils.http.a
    protected boolean e() {
        return false;
    }

    @Override // com.webengage.sdk.android.utils.http.a
    protected boolean f() {
        Response b10 = com.webengage.sdk.android.utils.http.b.b(this.f31003f).b(this.f31001d);
        this.f31002e = b10;
        return b10.isReadable();
    }

    @Override // com.webengage.sdk.android.utils.http.a
    protected Response g() {
        if (this.f31002e == null) {
            this.f31002e = com.webengage.sdk.android.utils.http.b.b(this.f31003f).b(this.f31001d);
        }
        String a10 = a(this.f31002e.getResponseHeaders(), b.ETAG);
        String a11 = a(this.f31002e.getResponseHeaders(), b.LAST_MODIFIED);
        if (a10 == null && a11 == null) {
            return h();
        }
        Map<String, String> headers = this.f30998b.getHeaders();
        if (headers == null) {
            headers = new HashMap<>();
        }
        if (a10 != null) {
            headers.put("If-None-Match", a10);
        } else {
            headers.put("If-Modified-Since", a11);
        }
        this.f30998b = this.f30998b.getCurrentState().setHeaders(headers).build();
        return h();
    }

    private String a(String str) {
        return str;
    }

    private String a(Map<String, List<String>> map, b bVar) {
        String str;
        List<String> list;
        int i10 = a.f31004a[bVar.ordinal()];
        if (i10 == 1) {
            if (map.get("cache-control") == null) {
                return null;
            }
            String str2 = map.get("cache-control").get(0);
            if (!str2.contains("max-age")) {
                return null;
            }
            int indexOf = str2.indexOf(",");
            int indexOf2 = str2.indexOf("max-age") + 8;
            if (indexOf == -1) {
                indexOf = str2.length();
            }
            return str2.substring(indexOf2, indexOf);
        }
        if (i10 == 2) {
            str = "last-modified";
            if (map.get("last-modified") == null) {
                return null;
            }
        } else if (i10 == 3) {
            str = "etag";
            if (map.get("etag") == null) {
                return null;
            }
        } else {
            if (i10 != 4) {
                if (i10 != 5 || map.get("cache-control") == null) {
                    return null;
                }
                list = map.get("cache-control");
                return list.get(0);
            }
            str = "expires";
            if (map.get("expires") == null) {
                return null;
            }
        }
        list = map.get(str);
        return list.get(0);
    }

    private void a(Writer writer, Object obj) {
        writer.write(obj instanceof Map ? WebEngageUtils.b((Map<String, String>) obj) : obj.toString());
        writer.close();
    }
}
