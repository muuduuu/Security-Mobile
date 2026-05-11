package io.sentry;

import io.sentry.s2;
import java.io.Closeable;
import java.lang.Thread;

/* loaded from: classes2.dex */
public final class UncaughtExceptionHandlerIntegration implements Integration, Thread.UncaughtExceptionHandler, Closeable {

    /* renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f34562a;

    /* renamed from: b, reason: collision with root package name */
    private L f34563b;

    /* renamed from: c, reason: collision with root package name */
    private P1 f34564c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f34565d;

    /* renamed from: e, reason: collision with root package name */
    private final s2 f34566e;

    public static class a extends io.sentry.hints.d implements io.sentry.hints.k {
        public a(long j10, ILogger iLogger) {
            super(j10, iLogger);
        }
    }

    public UncaughtExceptionHandlerIntegration() {
        this(s2.a.c());
    }

    static Throwable b(Thread thread, Throwable th) {
        io.sentry.protocol.j jVar = new io.sentry.protocol.j();
        jVar.i(Boolean.FALSE);
        jVar.j("UncaughtExceptionHandler");
        return new io.sentry.exception.a(jVar, th, thread);
    }

    @Override // io.sentry.Integration
    public final void c(L l10, P1 p12) {
        if (this.f34565d) {
            p12.getLogger().c(K1.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f34565d = true;
        this.f34563b = (L) io.sentry.util.n.c(l10, "Hub is required");
        P1 p13 = (P1) io.sentry.util.n.c(p12, "SentryOptions is required");
        this.f34564c = p13;
        ILogger logger = p13.getLogger();
        K1 k12 = K1.DEBUG;
        logger.c(k12, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f34564c.isEnableUncaughtExceptionHandler()));
        if (this.f34564c.isEnableUncaughtExceptionHandler()) {
            Thread.UncaughtExceptionHandler b10 = this.f34566e.b();
            if (b10 != null) {
                this.f34564c.getLogger().c(k12, "default UncaughtExceptionHandler class='" + b10.getClass().getName() + "'", new Object[0]);
                this.f34562a = b10;
            }
            this.f34566e.a(this);
            this.f34564c.getLogger().c(k12, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this == this.f34566e.b()) {
            this.f34566e.a(this.f34562a);
            P1 p12 = this.f34564c;
            if (p12 != null) {
                p12.getLogger().c(K1.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098  */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void uncaughtException(Thread thread, Throwable th) {
        a aVar;
        A1 a12;
        boolean equals;
        io.sentry.hints.g f10;
        P1 p12 = this.f34564c;
        if (p12 == null || this.f34563b == null) {
            return;
        }
        p12.getLogger().c(K1.INFO, "Uncaught exception received.", new Object[0]);
        try {
            aVar = new a(this.f34564c.getFlushTimeoutMillis(), this.f34564c.getLogger());
            a12 = new A1(b(thread, th));
            a12.z0(K1.FATAL);
            A e10 = io.sentry.util.j.e(aVar);
            equals = this.f34563b.M(a12, e10).equals(io.sentry.protocol.r.f35409b);
            f10 = io.sentry.util.j.f(e10);
        } catch (Throwable th2) {
            this.f34564c.getLogger().b(K1.ERROR, "Error sending uncaught exception to Sentry.", th2);
        }
        if (equals) {
            if (io.sentry.hints.g.MULTITHREADED_DEDUPLICATION.equals(f10)) {
            }
            if (this.f34562a == null) {
                this.f34564c.getLogger().c(K1.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
                this.f34562a.uncaughtException(thread, th);
                return;
            } else {
                if (this.f34564c.isPrintUncaughtStackTrace()) {
                    th.printStackTrace();
                    return;
                }
                return;
            }
        }
        if (!aVar.e()) {
            this.f34564c.getLogger().c(K1.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", a12.G());
        }
        if (this.f34562a == null) {
        }
    }

    UncaughtExceptionHandlerIntegration(s2 s2Var) {
        this.f34565d = false;
        this.f34566e = (s2) io.sentry.util.n.c(s2Var, "threadAdapter is required.");
    }
}
