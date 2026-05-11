package io.sentry;

/* loaded from: classes2.dex */
public final class H implements L {

    /* renamed from: a, reason: collision with root package name */
    private static final H f34466a = new H();

    private H() {
    }

    public static H a() {
        return f34466a;
    }

    @Override // io.sentry.L
    public void A(C3405e c3405e, A a10) {
        Y0.c(c3405e, a10);
    }

    @Override // io.sentry.L
    public void B(P0 p02) {
        Y0.i(p02);
    }

    @Override // io.sentry.L
    public void C(Throwable th, S s10, String str) {
        Y0.m().C(th, s10, str);
    }

    @Override // io.sentry.L
    public P1 D() {
        return Y0.m().D();
    }

    @Override // io.sentry.L
    public void E(P0 p02) {
        Y0.w(p02);
    }

    @Override // io.sentry.L
    /* renamed from: F */
    public L clone() {
        return Y0.m().clone();
    }

    @Override // io.sentry.L
    public io.sentry.protocol.r H(Throwable th, A a10) {
        return Y0.f(th, a10);
    }

    @Override // io.sentry.L
    public io.sentry.protocol.r I(io.sentry.protocol.y yVar, l2 l2Var, A a10, I0 i02) {
        return Y0.m().I(yVar, l2Var, a10, i02);
    }

    @Override // io.sentry.L
    public void J() {
        Y0.j();
    }

    @Override // io.sentry.L
    public void L() {
        Y0.u();
    }

    @Override // io.sentry.L
    public io.sentry.protocol.r M(A1 a12, A a10) {
        return Y0.e(a12, a10);
    }

    @Override // io.sentry.L
    public void close() {
        Y0.h();
    }

    @Override // io.sentry.L
    public boolean isEnabled() {
        return Y0.q();
    }

    @Override // io.sentry.L
    public void v(long j10) {
        Y0.l(j10);
    }

    @Override // io.sentry.L
    public io.sentry.protocol.r x(C3416h1 c3416h1, A a10) {
        return Y0.m().x(c3416h1, a10);
    }

    @Override // io.sentry.L
    public T y(o2 o2Var, q2 q2Var) {
        return Y0.v(o2Var, q2Var);
    }
}
