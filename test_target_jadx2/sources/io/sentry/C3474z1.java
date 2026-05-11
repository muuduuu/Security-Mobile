package io.sentry;

import io.sentry.J1;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: io.sentry.z1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3474z1 implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f35661a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35662b;

    /* renamed from: c, reason: collision with root package name */
    private final J1 f35663c;

    /* renamed from: d, reason: collision with root package name */
    private final int f35664d;

    /* renamed from: e, reason: collision with root package name */
    private final Callable f35665e;

    /* renamed from: f, reason: collision with root package name */
    private final String f35666f;

    /* renamed from: g, reason: collision with root package name */
    private Map f35667g;

    /* renamed from: io.sentry.z1$a */
    public static final class a implements Z {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(K1.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3474z1 a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            c3409f0.b();
            HashMap hashMap = null;
            J1 j12 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            int i10 = 0;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "length":
                        i10 = c3409f0.p();
                        break;
                    case "filename":
                        str2 = c3409f0.x1();
                        break;
                    case "attachment_type":
                        str3 = c3409f0.x1();
                        break;
                    case "type":
                        j12 = (J1) c3409f0.v1(iLogger, new J1.a());
                        break;
                    case "content_type":
                        str = c3409f0.x1();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        c3409f0.z1(iLogger, hashMap, r10);
                        break;
                }
            }
            if (j12 == null) {
                throw c("type", iLogger);
            }
            C3474z1 c3474z1 = new C3474z1(j12, i10, str, str2, str3);
            c3474z1.c(hashMap);
            c3409f0.g();
            return c3474z1;
        }
    }

    public C3474z1(J1 j12, int i10, String str, String str2, String str3) {
        this.f35663c = (J1) io.sentry.util.n.c(j12, "type is required");
        this.f35661a = str;
        this.f35664d = i10;
        this.f35662b = str2;
        this.f35665e = null;
        this.f35666f = str3;
    }

    public int a() {
        Callable callable = this.f35665e;
        if (callable == null) {
            return this.f35664d;
        }
        try {
            return ((Integer) callable.call()).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public J1 b() {
        return this.f35663c;
    }

    public void c(Map map) {
        this.f35667g = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35661a != null) {
            a02.k("content_type").b(this.f35661a);
        }
        if (this.f35662b != null) {
            a02.k("filename").b(this.f35662b);
        }
        a02.k("type").g(iLogger, this.f35663c);
        if (this.f35666f != null) {
            a02.k("attachment_type").b(this.f35666f);
        }
        a02.k("length").a(a());
        Map map = this.f35667g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f35667g.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }

    C3474z1(J1 j12, Callable callable, String str, String str2, String str3) {
        this.f35663c = (J1) io.sentry.util.n.c(j12, "type is required");
        this.f35661a = str;
        this.f35664d = -1;
        this.f35662b = str2;
        this.f35665e = callable;
        this.f35666f = str3;
    }

    C3474z1(J1 j12, Callable callable, String str, String str2) {
        this(j12, callable, str, str2, (String) null);
    }
}
