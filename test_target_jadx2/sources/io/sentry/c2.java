package io.sentry;

import io.sentry.e2;
import io.sentry.g2;
import io.sentry.protocol.r;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class c2 implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.r f35023a;

    /* renamed from: b, reason: collision with root package name */
    private final e2 f35024b;

    /* renamed from: c, reason: collision with root package name */
    private final e2 f35025c;

    /* renamed from: d, reason: collision with root package name */
    private transient n2 f35026d;

    /* renamed from: e, reason: collision with root package name */
    protected String f35027e;

    /* renamed from: f, reason: collision with root package name */
    protected String f35028f;

    /* renamed from: g, reason: collision with root package name */
    protected g2 f35029g;

    /* renamed from: h, reason: collision with root package name */
    protected Map f35030h;

    /* renamed from: i, reason: collision with root package name */
    protected String f35031i;

    /* renamed from: j, reason: collision with root package name */
    private Map f35032j;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c2 a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            c3409f0.b();
            ConcurrentHashMap concurrentHashMap = null;
            io.sentry.protocol.r rVar = null;
            e2 e2Var = null;
            String str = null;
            e2 e2Var2 = null;
            String str2 = null;
            g2 g2Var = null;
            String str3 = null;
            Map map = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "span_id":
                        e2Var = new e2.a().a(c3409f0, iLogger);
                        break;
                    case "parent_span_id":
                        e2Var2 = (e2) c3409f0.v1(iLogger, new e2.a());
                        break;
                    case "description":
                        str2 = c3409f0.x();
                        break;
                    case "origin":
                        str3 = c3409f0.x();
                        break;
                    case "status":
                        g2Var = (g2) c3409f0.v1(iLogger, new g2.a());
                        break;
                    case "op":
                        str = c3409f0.x();
                        break;
                    case "tags":
                        map = io.sentry.util.b.b((Map) c3409f0.t1());
                        break;
                    case "trace_id":
                        rVar = new r.a().a(c3409f0, iLogger);
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c3409f0.z1(iLogger, concurrentHashMap, r10);
                        break;
                }
            }
            if (rVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                iLogger.b(K1.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (e2Var == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
                iLogger.b(K1.ERROR, "Missing required field \"span_id\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (str == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"op\"");
                iLogger.b(K1.ERROR, "Missing required field \"op\"", illegalStateException3);
                throw illegalStateException3;
            }
            c2 c2Var = new c2(rVar, e2Var, str, e2Var2, null);
            c2Var.l(str2);
            c2Var.o(g2Var);
            c2Var.m(str3);
            if (map != null) {
                c2Var.f35030h = map;
            }
            c2Var.p(concurrentHashMap);
            c3409f0.g();
            return c2Var;
        }
    }

    public c2(String str) {
        this(new io.sentry.protocol.r(), new e2(), str, null, null);
    }

    public String a() {
        return this.f35028f;
    }

    public String b() {
        return this.f35027e;
    }

    public String c() {
        return this.f35031i;
    }

    public e2 d() {
        return this.f35025c;
    }

    public Boolean e() {
        n2 n2Var = this.f35026d;
        if (n2Var == null) {
            return null;
        }
        return n2Var.a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return this.f35023a.equals(c2Var.f35023a) && this.f35024b.equals(c2Var.f35024b) && io.sentry.util.n.a(this.f35025c, c2Var.f35025c) && this.f35027e.equals(c2Var.f35027e) && io.sentry.util.n.a(this.f35028f, c2Var.f35028f) && this.f35029g == c2Var.f35029g;
    }

    public Boolean f() {
        n2 n2Var = this.f35026d;
        if (n2Var == null) {
            return null;
        }
        return n2Var.c();
    }

    public n2 g() {
        return this.f35026d;
    }

    public e2 h() {
        return this.f35024b;
    }

    public int hashCode() {
        return io.sentry.util.n.b(this.f35023a, this.f35024b, this.f35025c, this.f35027e, this.f35028f, this.f35029g);
    }

    public g2 i() {
        return this.f35029g;
    }

    public Map j() {
        return this.f35030h;
    }

    public io.sentry.protocol.r k() {
        return this.f35023a;
    }

    public void l(String str) {
        this.f35028f = str;
    }

    public void m(String str) {
        this.f35031i = str;
    }

    public void n(n2 n2Var) {
        this.f35026d = n2Var;
    }

    public void o(g2 g2Var) {
        this.f35029g = g2Var;
    }

    public void p(Map map) {
        this.f35032j = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        a02.k("trace_id");
        this.f35023a.serialize(a02, iLogger);
        a02.k("span_id");
        this.f35024b.serialize(a02, iLogger);
        if (this.f35025c != null) {
            a02.k("parent_span_id");
            this.f35025c.serialize(a02, iLogger);
        }
        a02.k("op").b(this.f35027e);
        if (this.f35028f != null) {
            a02.k("description").b(this.f35028f);
        }
        if (this.f35029g != null) {
            a02.k("status").g(iLogger, this.f35029g);
        }
        if (this.f35031i != null) {
            a02.k("origin").g(iLogger, this.f35031i);
        }
        if (!this.f35030h.isEmpty()) {
            a02.k("tags").g(iLogger, this.f35030h);
        }
        Map map = this.f35032j;
        if (map != null) {
            for (String str : map.keySet()) {
                a02.k(str).g(iLogger, this.f35032j.get(str));
            }
        }
        a02.d();
    }

    public c2(io.sentry.protocol.r rVar, e2 e2Var, String str, e2 e2Var2, n2 n2Var) {
        this(rVar, e2Var, e2Var2, str, null, n2Var, null, "manual");
    }

    public c2(io.sentry.protocol.r rVar, e2 e2Var, e2 e2Var2, String str, String str2, n2 n2Var, g2 g2Var, String str3) {
        this.f35030h = new ConcurrentHashMap();
        this.f35031i = "manual";
        this.f35023a = (io.sentry.protocol.r) io.sentry.util.n.c(rVar, "traceId is required");
        this.f35024b = (e2) io.sentry.util.n.c(e2Var, "spanId is required");
        this.f35027e = (String) io.sentry.util.n.c(str, "operation is required");
        this.f35025c = e2Var2;
        this.f35026d = n2Var;
        this.f35028f = str2;
        this.f35029g = g2Var;
        this.f35031i = str3;
    }

    public c2(c2 c2Var) {
        this.f35030h = new ConcurrentHashMap();
        this.f35031i = "manual";
        this.f35023a = c2Var.f35023a;
        this.f35024b = c2Var.f35024b;
        this.f35025c = c2Var.f35025c;
        this.f35026d = c2Var.f35026d;
        this.f35027e = c2Var.f35027e;
        this.f35028f = c2Var.f35028f;
        this.f35029g = c2Var.f35029g;
        Map b10 = io.sentry.util.b.b(c2Var.f35030h);
        if (b10 != null) {
            this.f35030h = b10;
        }
    }
}
