package com.webengage.sdk.android.utils.http;

import android.content.Context;
import android.text.TextUtils;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.m1;
import com.webengage.sdk.android.utils.http.Response;
import com.webengage.sdk.android.x;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class RequestObject {

    /* renamed from: a, reason: collision with root package name */
    private String f30954a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30955b;

    /* renamed from: c, reason: collision with root package name */
    private final RequestMethod f30956c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f30957d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f30958e;

    /* renamed from: f, reason: collision with root package name */
    private final String f30959f;

    /* renamed from: g, reason: collision with root package name */
    private int f30960g;

    /* renamed from: h, reason: collision with root package name */
    private final int f30961h;

    /* renamed from: i, reason: collision with root package name */
    private Context f30962i;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f30963a;

        /* renamed from: b, reason: collision with root package name */
        private final String f30964b;

        /* renamed from: c, reason: collision with root package name */
        private final RequestMethod f30965c;

        /* renamed from: g, reason: collision with root package name */
        private Context f30969g;

        /* renamed from: d, reason: collision with root package name */
        private Map<String, String> f30966d = null;

        /* renamed from: e, reason: collision with root package name */
        private Object f30967e = null;

        /* renamed from: f, reason: collision with root package name */
        private String f30968f = null;

        /* renamed from: h, reason: collision with root package name */
        private int f30970h = 0;

        /* renamed from: i, reason: collision with root package name */
        private int f30971i = 3;

        public Builder(String str, RequestMethod requestMethod, Context context) {
            this.f30969g = null;
            this.f30964b = str;
            this.f30965c = requestMethod;
            this.f30969g = context.getApplicationContext();
        }

        public Builder a(int i10) {
            this.f30970h = i10 | this.f30970h;
            return this;
        }

        public Builder b(String str) {
            this.f30968f = str;
            return this;
        }

        public RequestObject build() {
            return new RequestObject(this);
        }

        public Builder setCachePolicy(int i10) {
            this.f30971i = i10;
            return this;
        }

        public Builder setHeaders(Map<String, String> map) {
            this.f30966d = map;
            return this;
        }

        public Builder setParams(Object obj) {
            this.f30967e = obj;
            return this;
        }

        protected Builder a(String str) {
            this.f30963a = str;
            return this;
        }
    }

    private RequestObject(Builder builder) {
        this.f30954a = builder.f30963a;
        this.f30955b = builder.f30964b;
        this.f30956c = builder.f30965c;
        this.f30957d = builder.f30966d;
        this.f30958e = builder.f30967e;
        this.f30959f = builder.f30968f;
        this.f30960g = builder.f30970h;
        this.f30961h = builder.f30971i;
        this.f30962i = builder.f30969g;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Response a() {
        boolean z10;
        Response response;
        List<m1> list = com.webengage.sdk.android.utils.http.a.f30996c;
        synchronized (list) {
            try {
                Iterator<m1> it = list.iterator();
                z10 = true;
                while (it.hasNext()) {
                    z10 &= it.next().a(this, this.f30962i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        x a10 = x.a(this.f30962i);
        if (z10) {
            RequestObject onRequest = a10.onRequest(this.f30962i, this);
            if (onRequest != null) {
                response = new c(this.f30962i, onRequest).a();
                return response != null ? new Response.Builder().b(getRequestURL()).build() : response;
            }
            Logger.e("WebEngage", "Error while processing network request as request object is null for url " + getRequestURL());
        }
        response = null;
        if (response != null) {
        }
    }

    protected int b() {
        return this.f30960g;
    }

    protected String c() {
        return this.f30954a;
    }

    protected String d() {
        return this.f30959f;
    }

    protected String e() {
        return this.f30955b;
    }

    public int getCachePolicy() {
        return this.f30961h;
    }

    public Builder getCurrentState() {
        return new Builder(this.f30955b, this.f30956c, this.f30962i).b(this.f30959f).a(this.f30960g).setCachePolicy(this.f30961h).setHeaders(this.f30957d).setParams(this.f30958e).a(this.f30954a);
    }

    public Map<String, String> getHeaders() {
        return this.f30957d;
    }

    public Object getParams() {
        return this.f30958e;
    }

    public RequestMethod getRequestMethod() {
        return this.f30956c;
    }

    public String getRequestURL() {
        return !TextUtils.isEmpty(this.f30954a) ? this.f30954a : this.f30955b;
    }

    protected void a(String str) {
        this.f30954a = str;
    }
}
