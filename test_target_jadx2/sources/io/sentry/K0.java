package io.sentry;

/* loaded from: classes2.dex */
public final class K0 {

    /* renamed from: a, reason: collision with root package name */
    private io.sentry.protocol.r f34506a;

    /* renamed from: b, reason: collision with root package name */
    private e2 f34507b;

    /* renamed from: c, reason: collision with root package name */
    private e2 f34508c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f34509d;

    /* renamed from: e, reason: collision with root package name */
    private C3402d f34510e;

    public K0() {
        this(new io.sentry.protocol.r(), new e2(), null, null, null);
    }

    private static C3402d a(C3402d c3402d) {
        if (c3402d != null) {
            return new C3402d(c3402d);
        }
        return null;
    }

    public C3402d b() {
        return this.f34510e;
    }

    public e2 c() {
        return this.f34508c;
    }

    public e2 d() {
        return this.f34507b;
    }

    public io.sentry.protocol.r e() {
        return this.f34506a;
    }

    public Boolean f() {
        return this.f34509d;
    }

    public void g(C3402d c3402d) {
        this.f34510e = c3402d;
    }

    public l2 h() {
        C3402d c3402d = this.f34510e;
        if (c3402d != null) {
            return c3402d.F();
        }
        return null;
    }

    public K0(K0 k02) {
        this(k02.e(), k02.d(), k02.c(), a(k02.b()), k02.f());
    }

    public K0(io.sentry.protocol.r rVar, e2 e2Var, e2 e2Var2, C3402d c3402d, Boolean bool) {
        this.f34506a = rVar;
        this.f34507b = e2Var;
        this.f34508c = e2Var2;
        this.f34510e = c3402d;
        this.f34509d = bool;
    }
}
