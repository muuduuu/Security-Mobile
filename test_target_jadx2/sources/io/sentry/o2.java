package io.sentry;

/* loaded from: classes2.dex */
public final class o2 extends c2 {

    /* renamed from: p, reason: collision with root package name */
    private static final io.sentry.protocol.A f35229p = io.sentry.protocol.A.CUSTOM;

    /* renamed from: k, reason: collision with root package name */
    private String f35230k;

    /* renamed from: l, reason: collision with root package name */
    private io.sentry.protocol.A f35231l;

    /* renamed from: m, reason: collision with root package name */
    private n2 f35232m;

    /* renamed from: n, reason: collision with root package name */
    private C3402d f35233n;

    /* renamed from: o, reason: collision with root package name */
    private W f35234o;

    public o2(String str, io.sentry.protocol.A a10, String str2) {
        this(str, a10, str2, null);
    }

    public static o2 q(K0 k02) {
        n2 n2Var;
        Boolean f10 = k02.f();
        n2 n2Var2 = f10 == null ? null : new n2(f10);
        C3402d b10 = k02.b();
        if (b10 != null) {
            b10.a();
            Double h10 = b10.h();
            Boolean valueOf = Boolean.valueOf(f10 != null ? f10.booleanValue() : false);
            if (h10 != null) {
                n2Var = new n2(valueOf, h10);
                return new o2(k02.e(), k02.d(), k02.c(), n2Var, b10);
            }
            n2Var2 = new n2(valueOf);
        }
        n2Var = n2Var2;
        return new o2(k02.e(), k02.d(), k02.c(), n2Var, b10);
    }

    public C3402d r() {
        return this.f35233n;
    }

    public W s() {
        return this.f35234o;
    }

    public String t() {
        return this.f35230k;
    }

    public n2 u() {
        return this.f35232m;
    }

    public io.sentry.protocol.A v() {
        return this.f35231l;
    }

    public o2(String str, io.sentry.protocol.A a10, String str2, n2 n2Var) {
        super(str2);
        this.f35234o = W.SENTRY;
        this.f35230k = (String) io.sentry.util.n.c(str, "name is required");
        this.f35231l = a10;
        n(n2Var);
    }

    public o2(io.sentry.protocol.r rVar, e2 e2Var, e2 e2Var2, n2 n2Var, C3402d c3402d) {
        super(rVar, e2Var, "default", e2Var2, null);
        this.f35234o = W.SENTRY;
        this.f35230k = "<unlabeled transaction>";
        this.f35232m = n2Var;
        this.f35231l = f35229p;
        this.f35233n = c3402d;
    }
}
