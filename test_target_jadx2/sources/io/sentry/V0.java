package io.sentry;

/* loaded from: classes2.dex */
public final class V0 implements T0 {

    /* renamed from: a, reason: collision with root package name */
    private final R0 f34567a;

    public V0(R0 r02) {
        this.f34567a = (R0) io.sentry.util.n.c(r02, "SendFireAndForgetDirPath is required");
    }

    @Override // io.sentry.T0
    public Q0 d(L l10, P1 p12) {
        io.sentry.util.n.c(l10, "Hub is required");
        io.sentry.util.n.c(p12, "SentryOptions is required");
        String a10 = this.f34567a.a();
        if (a10 != null && e(a10, p12.getLogger())) {
            return a(new E0(l10, p12.getEnvelopeReader(), p12.getSerializer(), p12.getLogger(), p12.getFlushTimeoutMillis()), a10, p12.getLogger());
        }
        p12.getLogger().c(K1.ERROR, "No outbox dir path is defined in options.", new Object[0]);
        return null;
    }
}
