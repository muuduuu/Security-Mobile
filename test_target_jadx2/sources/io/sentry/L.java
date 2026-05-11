package io.sentry;

/* loaded from: classes2.dex */
public interface L {
    void A(C3405e c3405e, A a10);

    void B(P0 p02);

    void C(Throwable th, S s10, String str);

    P1 D();

    void E(P0 p02);

    L F();

    default io.sentry.protocol.r G(Throwable th) {
        return H(th, new A());
    }

    io.sentry.protocol.r H(Throwable th, A a10);

    io.sentry.protocol.r I(io.sentry.protocol.y yVar, l2 l2Var, A a10, I0 i02);

    void J();

    default io.sentry.protocol.r K(C3416h1 c3416h1) {
        return x(c3416h1, new A());
    }

    void L();

    io.sentry.protocol.r M(A1 a12, A a10);

    void close();

    boolean isEnabled();

    void v(long j10);

    default void w(C3405e c3405e) {
        A(c3405e, new A());
    }

    io.sentry.protocol.r x(C3416h1 c3416h1, A a10);

    T y(o2 o2Var, q2 q2Var);

    default io.sentry.protocol.r z(io.sentry.protocol.y yVar, l2 l2Var, A a10) {
        return I(yVar, l2Var, a10, null);
    }
}
