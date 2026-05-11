package io.sentry;

import org.conscrypt.BuildConfig;

/* renamed from: io.sentry.w0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3464w0 implements T {

    /* renamed from: a, reason: collision with root package name */
    private static final C3464w0 f35616a = new C3464w0();

    private C3464w0() {
    }

    public static C3464w0 s() {
        return f35616a;
    }

    @Override // io.sentry.S
    public boolean a() {
        return true;
    }

    @Override // io.sentry.S
    public l2 b() {
        return new l2(io.sentry.protocol.r.f35409b, BuildConfig.FLAVOR);
    }

    @Override // io.sentry.S
    public g2 c() {
        return null;
    }

    @Override // io.sentry.S
    public boolean d(AbstractC3410f1 abstractC3410f1) {
        return false;
    }

    @Override // io.sentry.S
    public void e(g2 g2Var) {
    }

    @Override // io.sentry.T
    public void f(g2 g2Var, boolean z10) {
    }

    @Override // io.sentry.S
    public S g(String str, String str2, AbstractC3410f1 abstractC3410f1, W w10) {
        return C3461v0.s();
    }

    @Override // io.sentry.S
    public String getDescription() {
        return null;
    }

    @Override // io.sentry.T
    public String getName() {
        return BuildConfig.FLAVOR;
    }

    @Override // io.sentry.S
    public void h() {
    }

    @Override // io.sentry.S
    public void i(String str, Number number, InterfaceC3430m0 interfaceC3430m0) {
    }

    @Override // io.sentry.T
    public b2 j() {
        return null;
    }

    @Override // io.sentry.S
    public void k(String str) {
    }

    @Override // io.sentry.T
    public io.sentry.protocol.r l() {
        return io.sentry.protocol.r.f35409b;
    }

    @Override // io.sentry.T
    public void m() {
    }

    @Override // io.sentry.S
    public c2 n() {
        return new c2(io.sentry.protocol.r.f35409b, e2.f35114b, "op", null, null);
    }

    @Override // io.sentry.S
    public AbstractC3410f1 o() {
        return new N1();
    }

    @Override // io.sentry.S
    public void p(g2 g2Var, AbstractC3410f1 abstractC3410f1) {
    }

    @Override // io.sentry.T
    public io.sentry.protocol.A q() {
        return io.sentry.protocol.A.CUSTOM;
    }

    @Override // io.sentry.S
    public AbstractC3410f1 r() {
        return new N1();
    }
}
