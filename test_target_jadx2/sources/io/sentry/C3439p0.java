package io.sentry;

/* renamed from: io.sentry.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3439p0 implements L {

    /* renamed from: b, reason: collision with root package name */
    private static final C3439p0 f35242b = new C3439p0();

    /* renamed from: a, reason: collision with root package name */
    private final P1 f35243a = P1.empty();

    private C3439p0() {
    }

    public static C3439p0 a() {
        return f35242b;
    }

    @Override // io.sentry.L
    public void A(C3405e c3405e, A a10) {
    }

    @Override // io.sentry.L
    public void B(P0 p02) {
    }

    @Override // io.sentry.L
    public void C(Throwable th, S s10, String str) {
    }

    @Override // io.sentry.L
    public P1 D() {
        return this.f35243a;
    }

    @Override // io.sentry.L
    public void E(P0 p02) {
    }

    @Override // io.sentry.L
    /* renamed from: F */
    public L clone() {
        return f35242b;
    }

    @Override // io.sentry.L
    public io.sentry.protocol.r H(Throwable th, A a10) {
        return io.sentry.protocol.r.f35409b;
    }

    @Override // io.sentry.L
    public io.sentry.protocol.r I(io.sentry.protocol.y yVar, l2 l2Var, A a10, I0 i02) {
        return io.sentry.protocol.r.f35409b;
    }

    @Override // io.sentry.L
    public void J() {
    }

    @Override // io.sentry.L
    public void L() {
    }

    @Override // io.sentry.L
    public io.sentry.protocol.r M(A1 a12, A a10) {
        return io.sentry.protocol.r.f35409b;
    }

    @Override // io.sentry.L
    public void close() {
    }

    @Override // io.sentry.L
    public boolean isEnabled() {
        return false;
    }

    @Override // io.sentry.L
    public void v(long j10) {
    }

    @Override // io.sentry.L
    public io.sentry.protocol.r x(C3416h1 c3416h1, A a10) {
        return io.sentry.protocol.r.f35409b;
    }

    @Override // io.sentry.L
    public T y(o2 o2Var, q2 q2Var) {
        return C3464w0.s();
    }
}
