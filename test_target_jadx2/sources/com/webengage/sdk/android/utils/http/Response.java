package com.webengage.sdk.android.utils.http;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class Response {

    /* renamed from: a, reason: collision with root package name */
    private int f30972a;

    /* renamed from: b, reason: collision with root package name */
    private Exception f30973b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, List<String>> f30974c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f30975d;

    /* renamed from: e, reason: collision with root package name */
    private InputStream f30976e;

    /* renamed from: f, reason: collision with root package name */
    private InputStream f30977f;

    /* renamed from: g, reason: collision with root package name */
    private int f30978g;

    /* renamed from: h, reason: collision with root package name */
    private String f30979h;

    /* renamed from: i, reason: collision with root package name */
    private int f30980i;

    /* renamed from: j, reason: collision with root package name */
    private String f30981j;

    /* renamed from: k, reason: collision with root package name */
    private long f30982k;

    /* renamed from: l, reason: collision with root package name */
    private String f30983l;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private int f30984a = -1;

        /* renamed from: b, reason: collision with root package name */
        private Exception f30985b = null;

        /* renamed from: c, reason: collision with root package name */
        private Map<String, List<String>> f30986c = null;

        /* renamed from: d, reason: collision with root package name */
        private boolean f30987d = true;

        /* renamed from: e, reason: collision with root package name */
        private InputStream f30988e = null;

        /* renamed from: f, reason: collision with root package name */
        private InputStream f30989f = null;

        /* renamed from: g, reason: collision with root package name */
        private int f30990g = -1;

        /* renamed from: h, reason: collision with root package name */
        private String f30991h = BuildConfig.FLAVOR;

        /* renamed from: i, reason: collision with root package name */
        private int f30992i = 0;

        /* renamed from: j, reason: collision with root package name */
        private String f30993j = null;

        /* renamed from: k, reason: collision with root package name */
        private long f30994k = 0;

        /* renamed from: l, reason: collision with root package name */
        private String f30995l = null;

        protected Builder a(int i10) {
            this.f30992i = i10 | this.f30992i;
            return this;
        }

        protected Builder b(int i10) {
            this.f30984a = i10;
            return this;
        }

        public Response build() {
            return new Response(this);
        }

        public Builder setErrorStream(InputStream inputStream) {
            this.f30989f = inputStream;
            return this;
        }

        public Builder setInputStream(InputStream inputStream) {
            this.f30988e = inputStream;
            return this;
        }

        public Builder setResponseHeaders(Map<String, List<String>> map) {
            this.f30986c = map;
            return this;
        }

        protected Builder a(long j10) {
            this.f30994k = j10;
            return this;
        }

        protected Builder b(String str) {
            this.f30995l = str;
            return this;
        }

        protected Builder c(int i10) {
            this.f30990g = i10;
            return this;
        }

        public Builder a(Exception exc) {
            this.f30985b = exc;
            return this;
        }

        protected Builder c(String str) {
            this.f30991h = str;
            return this;
        }

        protected Builder a(String str) {
            this.f30993j = str;
            return this;
        }

        protected Builder a(boolean z10) {
            this.f30987d = z10;
            return this;
        }
    }

    private Response(Builder builder) {
        this.f30973b = builder.f30985b;
        this.f30974c = builder.f30986c;
        this.f30975d = builder.f30987d;
        this.f30976e = builder.f30988e;
        this.f30977f = builder.f30989f;
        this.f30978g = builder.f30990g;
        this.f30979h = builder.f30991h;
        this.f30980i = builder.f30992i;
        this.f30981j = builder.f30993j;
        this.f30982k = builder.f30994k;
        this.f30972a = builder.f30984a;
        this.f30983l = builder.f30995l;
    }

    protected void a() {
        InputStream inputStream = this.f30977f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    protected void b() {
        InputStream inputStream = this.f30976e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    protected String c() {
        return this.f30981j;
    }

    public int d() {
        return this.f30980i;
    }

    public String e() {
        return this.f30979h;
    }

    protected long f() {
        return this.f30982k;
    }

    public boolean g() {
        return this.f30975d;
    }

    public Builder getCurrentState() {
        return new Builder().b(this.f30972a).a(this.f30973b).setResponseHeaders(this.f30974c).a(this.f30975d).c(this.f30978g).setInputStream(this.f30976e).setErrorStream(this.f30977f).c(this.f30979h).a(this.f30980i).a(this.f30981j).a(this.f30982k).b(this.f30983l);
    }

    public InputStream getErrorStream() {
        return this.f30977f;
    }

    public Exception getException() {
        return this.f30973b;
    }

    public InputStream getInputStream() {
        return this.f30976e;
    }

    public String getRequestURL() {
        return this.f30983l;
    }

    public int getResponseCode() {
        return this.f30978g;
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.f30974c;
    }

    public boolean isReadable() {
        return this.f30973b == null && this.f30976e != null && this.f30977f == null;
    }
}
