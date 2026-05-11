package io.sentry;

import io.sentry.K1;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3405e implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private final Date f35097a;

    /* renamed from: b, reason: collision with root package name */
    private String f35098b;

    /* renamed from: c, reason: collision with root package name */
    private String f35099c;

    /* renamed from: d, reason: collision with root package name */
    private Map f35100d;

    /* renamed from: e, reason: collision with root package name */
    private String f35101e;

    /* renamed from: f, reason: collision with root package name */
    private K1 f35102f;

    /* renamed from: g, reason: collision with root package name */
    private Map f35103g;

    /* renamed from: io.sentry.e$a */
    public static final class a implements Z {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v4, types: [java.util.Map] */
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3405e a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            c3409f0.b();
            Date c10 = AbstractC3420j.c();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            String str = null;
            String str2 = null;
            String str3 = null;
            K1 k12 = null;
            ConcurrentHashMap concurrentHashMap2 = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "data":
                        ?? b10 = io.sentry.util.b.b((Map) c3409f0.t1());
                        if (b10 == 0) {
                            break;
                        } else {
                            concurrentHashMap = b10;
                            break;
                        }
                    case "type":
                        str2 = c3409f0.x1();
                        break;
                    case "category":
                        str3 = c3409f0.x1();
                        break;
                    case "timestamp":
                        Date O02 = c3409f0.O0(iLogger);
                        if (O02 == null) {
                            break;
                        } else {
                            c10 = O02;
                            break;
                        }
                    case "level":
                        try {
                            k12 = new K1.a().a(c3409f0, iLogger);
                            break;
                        } catch (Exception e10) {
                            iLogger.a(K1.ERROR, e10, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                    case "message":
                        str = c3409f0.x1();
                        break;
                    default:
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        c3409f0.z1(iLogger, concurrentHashMap2, r10);
                        break;
                }
            }
            C3405e c3405e = new C3405e(c10);
            c3405e.f35098b = str;
            c3405e.f35099c = str2;
            c3405e.f35100d = concurrentHashMap;
            c3405e.f35101e = str3;
            c3405e.f35102f = k12;
            c3405e.m(concurrentHashMap2);
            c3409f0.g();
            return c3405e;
        }
    }

    public C3405e(Date date) {
        this.f35100d = new ConcurrentHashMap();
        this.f35097a = date;
    }

    public static C3405e n(String str, String str2, String str3, String str4, Map map) {
        C3405e c3405e = new C3405e();
        c3405e.l("user");
        c3405e.h("ui." + str);
        if (str2 != null) {
            c3405e.i("view.id", str2);
        }
        if (str3 != null) {
            c3405e.i("view.class", str3);
        }
        if (str4 != null) {
            c3405e.i("view.tag", str4);
        }
        for (Map.Entry entry : map.entrySet()) {
            c3405e.f().put((String) entry.getKey(), entry.getValue());
        }
        c3405e.j(K1.INFO);
        return c3405e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3405e.class != obj.getClass()) {
            return false;
        }
        C3405e c3405e = (C3405e) obj;
        return this.f35097a.getTime() == c3405e.f35097a.getTime() && io.sentry.util.n.a(this.f35098b, c3405e.f35098b) && io.sentry.util.n.a(this.f35099c, c3405e.f35099c) && io.sentry.util.n.a(this.f35101e, c3405e.f35101e) && this.f35102f == c3405e.f35102f;
    }

    public Map f() {
        return this.f35100d;
    }

    public Date g() {
        return (Date) this.f35097a.clone();
    }

    public void h(String str) {
        this.f35101e = str;
    }

    public int hashCode() {
        return io.sentry.util.n.b(this.f35097a, this.f35098b, this.f35099c, this.f35101e, this.f35102f);
    }

    public void i(String str, Object obj) {
        this.f35100d.put(str, obj);
    }

    public void j(K1 k12) {
        this.f35102f = k12;
    }

    public void k(String str) {
        this.f35098b = str;
    }

    public void l(String str) {
        this.f35099c = str;
    }

    public void m(Map map) {
        this.f35103g = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        a02.k("timestamp").g(iLogger, this.f35097a);
        if (this.f35098b != null) {
            a02.k("message").b(this.f35098b);
        }
        if (this.f35099c != null) {
            a02.k("type").b(this.f35099c);
        }
        a02.k("data").g(iLogger, this.f35100d);
        if (this.f35101e != null) {
            a02.k("category").b(this.f35101e);
        }
        if (this.f35102f != null) {
            a02.k("level").g(iLogger, this.f35102f);
        }
        Map map = this.f35103g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f35103g.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }

    C3405e(C3405e c3405e) {
        this.f35100d = new ConcurrentHashMap();
        this.f35097a = c3405e.f35097a;
        this.f35098b = c3405e.f35098b;
        this.f35099c = c3405e.f35099c;
        this.f35101e = c3405e.f35101e;
        Map b10 = io.sentry.util.b.b(c3405e.f35100d);
        if (b10 != null) {
            this.f35100d = b10;
        }
        this.f35103g = io.sentry.util.b.b(c3405e.f35103g);
        this.f35102f = c3405e.f35102f;
    }

    public C3405e() {
        this(AbstractC3420j.c());
    }
}
