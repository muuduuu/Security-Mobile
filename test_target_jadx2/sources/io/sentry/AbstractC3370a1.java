package io.sentry;

import io.sentry.C3405e;
import io.sentry.protocol.B;
import io.sentry.protocol.C3443c;
import io.sentry.protocol.e;
import io.sentry.protocol.m;
import io.sentry.protocol.p;
import io.sentry.protocol.r;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.a1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3370a1 {

    /* renamed from: a, reason: collision with root package name */
    private io.sentry.protocol.r f34617a;

    /* renamed from: b, reason: collision with root package name */
    private final C3443c f34618b;

    /* renamed from: c, reason: collision with root package name */
    private io.sentry.protocol.p f34619c;

    /* renamed from: d, reason: collision with root package name */
    private io.sentry.protocol.m f34620d;

    /* renamed from: e, reason: collision with root package name */
    private Map f34621e;

    /* renamed from: f, reason: collision with root package name */
    private String f34622f;

    /* renamed from: g, reason: collision with root package name */
    private String f34623g;

    /* renamed from: h, reason: collision with root package name */
    private String f34624h;

    /* renamed from: i, reason: collision with root package name */
    private io.sentry.protocol.B f34625i;

    /* renamed from: j, reason: collision with root package name */
    protected transient Throwable f34626j;

    /* renamed from: k, reason: collision with root package name */
    private String f34627k;

    /* renamed from: l, reason: collision with root package name */
    private String f34628l;

    /* renamed from: m, reason: collision with root package name */
    private List f34629m;

    /* renamed from: n, reason: collision with root package name */
    private io.sentry.protocol.e f34630n;

    /* renamed from: o, reason: collision with root package name */
    private Map f34631o;

    /* renamed from: io.sentry.a1$a */
    public static final class a {
        public boolean a(AbstractC3370a1 abstractC3370a1, String str, C3409f0 c3409f0, ILogger iLogger) {
            str.hashCode();
            switch (str) {
                case "debug_meta":
                    abstractC3370a1.f34630n = (io.sentry.protocol.e) c3409f0.v1(iLogger, new e.a());
                    return true;
                case "server_name":
                    abstractC3370a1.f34627k = c3409f0.x1();
                    return true;
                case "contexts":
                    abstractC3370a1.f34618b.putAll(new C3443c.a().a(c3409f0, iLogger));
                    return true;
                case "environment":
                    abstractC3370a1.f34623g = c3409f0.x1();
                    return true;
                case "breadcrumbs":
                    abstractC3370a1.f34629m = c3409f0.l1(iLogger, new C3405e.a());
                    return true;
                case "sdk":
                    abstractC3370a1.f34619c = (io.sentry.protocol.p) c3409f0.v1(iLogger, new p.a());
                    return true;
                case "dist":
                    abstractC3370a1.f34628l = c3409f0.x1();
                    return true;
                case "tags":
                    abstractC3370a1.f34621e = io.sentry.util.b.b((Map) c3409f0.t1());
                    return true;
                case "user":
                    abstractC3370a1.f34625i = (io.sentry.protocol.B) c3409f0.v1(iLogger, new B.a());
                    return true;
                case "extra":
                    abstractC3370a1.f34631o = io.sentry.util.b.b((Map) c3409f0.t1());
                    return true;
                case "event_id":
                    abstractC3370a1.f34617a = (io.sentry.protocol.r) c3409f0.v1(iLogger, new r.a());
                    return true;
                case "release":
                    abstractC3370a1.f34622f = c3409f0.x1();
                    return true;
                case "request":
                    abstractC3370a1.f34620d = (io.sentry.protocol.m) c3409f0.v1(iLogger, new m.a());
                    return true;
                case "platform":
                    abstractC3370a1.f34624h = c3409f0.x1();
                    return true;
                default:
                    return false;
            }
        }
    }

    /* renamed from: io.sentry.a1$b */
    public static final class b {
        public void a(AbstractC3370a1 abstractC3370a1, A0 a02, ILogger iLogger) {
            if (abstractC3370a1.f34617a != null) {
                a02.k("event_id").g(iLogger, abstractC3370a1.f34617a);
            }
            a02.k("contexts").g(iLogger, abstractC3370a1.f34618b);
            if (abstractC3370a1.f34619c != null) {
                a02.k("sdk").g(iLogger, abstractC3370a1.f34619c);
            }
            if (abstractC3370a1.f34620d != null) {
                a02.k("request").g(iLogger, abstractC3370a1.f34620d);
            }
            if (abstractC3370a1.f34621e != null && !abstractC3370a1.f34621e.isEmpty()) {
                a02.k("tags").g(iLogger, abstractC3370a1.f34621e);
            }
            if (abstractC3370a1.f34622f != null) {
                a02.k("release").b(abstractC3370a1.f34622f);
            }
            if (abstractC3370a1.f34623g != null) {
                a02.k("environment").b(abstractC3370a1.f34623g);
            }
            if (abstractC3370a1.f34624h != null) {
                a02.k("platform").b(abstractC3370a1.f34624h);
            }
            if (abstractC3370a1.f34625i != null) {
                a02.k("user").g(iLogger, abstractC3370a1.f34625i);
            }
            if (abstractC3370a1.f34627k != null) {
                a02.k("server_name").b(abstractC3370a1.f34627k);
            }
            if (abstractC3370a1.f34628l != null) {
                a02.k("dist").b(abstractC3370a1.f34628l);
            }
            if (abstractC3370a1.f34629m != null && !abstractC3370a1.f34629m.isEmpty()) {
                a02.k("breadcrumbs").g(iLogger, abstractC3370a1.f34629m);
            }
            if (abstractC3370a1.f34630n != null) {
                a02.k("debug_meta").g(iLogger, abstractC3370a1.f34630n);
            }
            if (abstractC3370a1.f34631o == null || abstractC3370a1.f34631o.isEmpty()) {
                return;
            }
            a02.k("extra").g(iLogger, abstractC3370a1.f34631o);
        }
    }

    protected AbstractC3370a1(io.sentry.protocol.r rVar) {
        this.f34618b = new C3443c();
        this.f34617a = rVar;
    }

    public List B() {
        return this.f34629m;
    }

    public C3443c C() {
        return this.f34618b;
    }

    public io.sentry.protocol.e D() {
        return this.f34630n;
    }

    public String E() {
        return this.f34628l;
    }

    public String F() {
        return this.f34623g;
    }

    public io.sentry.protocol.r G() {
        return this.f34617a;
    }

    public Map H() {
        return this.f34631o;
    }

    public String I() {
        return this.f34624h;
    }

    public String J() {
        return this.f34622f;
    }

    public io.sentry.protocol.m K() {
        return this.f34620d;
    }

    public io.sentry.protocol.p L() {
        return this.f34619c;
    }

    public String M() {
        return this.f34627k;
    }

    public Map N() {
        return this.f34621e;
    }

    public Throwable O() {
        Throwable th = this.f34626j;
        return th instanceof io.sentry.exception.a ? ((io.sentry.exception.a) th).c() : th;
    }

    public Throwable P() {
        return this.f34626j;
    }

    public io.sentry.protocol.B Q() {
        return this.f34625i;
    }

    public void R(List list) {
        this.f34629m = io.sentry.util.b.a(list);
    }

    public void S(io.sentry.protocol.e eVar) {
        this.f34630n = eVar;
    }

    public void T(String str) {
        this.f34628l = str;
    }

    public void U(String str) {
        this.f34623g = str;
    }

    public void V(String str, Object obj) {
        if (this.f34631o == null) {
            this.f34631o = new HashMap();
        }
        this.f34631o.put(str, obj);
    }

    public void W(Map map) {
        this.f34631o = io.sentry.util.b.c(map);
    }

    public void X(String str) {
        this.f34624h = str;
    }

    public void Y(String str) {
        this.f34622f = str;
    }

    public void Z(io.sentry.protocol.m mVar) {
        this.f34620d = mVar;
    }

    public void a0(io.sentry.protocol.p pVar) {
        this.f34619c = pVar;
    }

    public void b0(String str) {
        this.f34627k = str;
    }

    public void c0(String str, String str2) {
        if (this.f34621e == null) {
            this.f34621e = new HashMap();
        }
        this.f34621e.put(str, str2);
    }

    public void d0(Map map) {
        this.f34621e = io.sentry.util.b.c(map);
    }

    public void e0(io.sentry.protocol.B b10) {
        this.f34625i = b10;
    }

    protected AbstractC3370a1() {
        this(new io.sentry.protocol.r());
    }
}
