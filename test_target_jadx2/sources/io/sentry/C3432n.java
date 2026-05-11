package io.sentry;

/* renamed from: io.sentry.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3432n implements ILogger {

    /* renamed from: a, reason: collision with root package name */
    private final P1 f35216a;

    /* renamed from: b, reason: collision with root package name */
    private final ILogger f35217b;

    public C3432n(P1 p12, ILogger iLogger) {
        this.f35216a = (P1) io.sentry.util.n.c(p12, "SentryOptions is required.");
        this.f35217b = iLogger;
    }

    @Override // io.sentry.ILogger
    public void a(K1 k12, Throwable th, String str, Object... objArr) {
        if (this.f35217b == null || !d(k12)) {
            return;
        }
        this.f35217b.a(k12, th, str, objArr);
    }

    @Override // io.sentry.ILogger
    public void b(K1 k12, String str, Throwable th) {
        if (this.f35217b == null || !d(k12)) {
            return;
        }
        this.f35217b.b(k12, str, th);
    }

    @Override // io.sentry.ILogger
    public void c(K1 k12, String str, Object... objArr) {
        if (this.f35217b == null || !d(k12)) {
            return;
        }
        this.f35217b.c(k12, str, objArr);
    }

    @Override // io.sentry.ILogger
    public boolean d(K1 k12) {
        return k12 != null && this.f35216a.isDebug() && k12.ordinal() >= this.f35216a.getDiagnosticLevel().ordinal();
    }
}
