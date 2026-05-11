package io.sentry;

import io.sentry.AbstractC3370a1;
import io.sentry.K1;
import io.sentry.protocol.k;
import io.sentry.protocol.q;
import io.sentry.protocol.x;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class A1 extends AbstractC3370a1 implements InterfaceC3421j0 {

    /* renamed from: p, reason: collision with root package name */
    private Date f34420p;

    /* renamed from: q, reason: collision with root package name */
    private io.sentry.protocol.k f34421q;

    /* renamed from: r, reason: collision with root package name */
    private String f34422r;

    /* renamed from: s, reason: collision with root package name */
    private Y1 f34423s;

    /* renamed from: t, reason: collision with root package name */
    private Y1 f34424t;

    /* renamed from: u, reason: collision with root package name */
    private K1 f34425u;

    /* renamed from: v, reason: collision with root package name */
    private String f34426v;

    /* renamed from: w, reason: collision with root package name */
    private List f34427w;

    /* renamed from: x, reason: collision with root package name */
    private Map f34428x;

    /* renamed from: y, reason: collision with root package name */
    private Map f34429y;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public A1 a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            c3409f0.b();
            A1 a12 = new A1();
            AbstractC3370a1.a aVar = new AbstractC3370a1.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "fingerprint":
                        List list = (List) c3409f0.t1();
                        if (list == null) {
                            break;
                        } else {
                            a12.f34427w = list;
                            break;
                        }
                    case "threads":
                        c3409f0.b();
                        c3409f0.r();
                        a12.f34423s = new Y1(c3409f0.l1(iLogger, new x.a()));
                        c3409f0.g();
                        break;
                    case "logger":
                        a12.f34422r = c3409f0.x1();
                        break;
                    case "timestamp":
                        Date O02 = c3409f0.O0(iLogger);
                        if (O02 == null) {
                            break;
                        } else {
                            a12.f34420p = O02;
                            break;
                        }
                    case "level":
                        a12.f34425u = (K1) c3409f0.v1(iLogger, new K1.a());
                        break;
                    case "message":
                        a12.f34421q = (io.sentry.protocol.k) c3409f0.v1(iLogger, new k.a());
                        break;
                    case "modules":
                        a12.f34429y = io.sentry.util.b.b((Map) c3409f0.t1());
                        break;
                    case "exception":
                        c3409f0.b();
                        c3409f0.r();
                        a12.f34424t = new Y1(c3409f0.l1(iLogger, new q.a()));
                        c3409f0.g();
                        break;
                    case "transaction":
                        a12.f34426v = c3409f0.x1();
                        break;
                    default:
                        if (!aVar.a(a12, r10, c3409f0, iLogger)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            c3409f0.z1(iLogger, concurrentHashMap, r10);
                            break;
                        } else {
                            break;
                        }
                }
            }
            a12.F0(concurrentHashMap);
            c3409f0.g();
            return a12;
        }
    }

    A1(io.sentry.protocol.r rVar, Date date) {
        super(rVar);
        this.f34420p = date;
    }

    public void A0(io.sentry.protocol.k kVar) {
        this.f34421q = kVar;
    }

    public void B0(Map map) {
        this.f34429y = io.sentry.util.b.c(map);
    }

    public void C0(List list) {
        this.f34423s = new Y1(list);
    }

    public void D0(Date date) {
        this.f34420p = date;
    }

    public void E0(String str) {
        this.f34426v = str;
    }

    public void F0(Map map) {
        this.f34428x = map;
    }

    public List o0() {
        Y1 y12 = this.f34424t;
        if (y12 == null) {
            return null;
        }
        return y12.a();
    }

    public List p0() {
        return this.f34427w;
    }

    public K1 q0() {
        return this.f34425u;
    }

    Map r0() {
        return this.f34429y;
    }

    public List s0() {
        Y1 y12 = this.f34423s;
        if (y12 != null) {
            return y12.a();
        }
        return null;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        a02.k("timestamp").g(iLogger, this.f34420p);
        if (this.f34421q != null) {
            a02.k("message").g(iLogger, this.f34421q);
        }
        if (this.f34422r != null) {
            a02.k("logger").b(this.f34422r);
        }
        Y1 y12 = this.f34423s;
        if (y12 != null && !y12.a().isEmpty()) {
            a02.k("threads");
            a02.f();
            a02.k("values").g(iLogger, this.f34423s.a());
            a02.d();
        }
        Y1 y13 = this.f34424t;
        if (y13 != null && !y13.a().isEmpty()) {
            a02.k("exception");
            a02.f();
            a02.k("values").g(iLogger, this.f34424t.a());
            a02.d();
        }
        if (this.f34425u != null) {
            a02.k("level").g(iLogger, this.f34425u);
        }
        if (this.f34426v != null) {
            a02.k("transaction").b(this.f34426v);
        }
        if (this.f34427w != null) {
            a02.k("fingerprint").g(iLogger, this.f34427w);
        }
        if (this.f34429y != null) {
            a02.k("modules").g(iLogger, this.f34429y);
        }
        new AbstractC3370a1.b().a(this, a02, iLogger);
        Map map = this.f34428x;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f34428x.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }

    public String t0() {
        return this.f34426v;
    }

    public io.sentry.protocol.q u0() {
        Y1 y12 = this.f34424t;
        if (y12 == null) {
            return null;
        }
        for (io.sentry.protocol.q qVar : y12.a()) {
            if (qVar.g() != null && qVar.g().h() != null && !qVar.g().h().booleanValue()) {
                return qVar;
            }
        }
        return null;
    }

    public boolean v0() {
        return u0() != null;
    }

    public boolean w0() {
        Y1 y12 = this.f34424t;
        return (y12 == null || y12.a().isEmpty()) ? false : true;
    }

    public void x0(List list) {
        this.f34424t = new Y1(list);
    }

    public void y0(List list) {
        this.f34427w = list != null ? new ArrayList(list) : null;
    }

    public void z0(K1 k12) {
        this.f34425u = k12;
    }

    public A1(Throwable th) {
        this();
        this.f34626j = th;
    }

    public A1() {
        this(new io.sentry.protocol.r(), AbstractC3420j.c());
    }
}
