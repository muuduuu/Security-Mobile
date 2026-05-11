package io.sentry.android.core;

import android.content.Context;
import io.sentry.A1;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.K1;
import io.sentry.P1;
import io.sentry.android.core.C3373c;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class AnrIntegration implements Integration, Closeable {

    /* renamed from: c, reason: collision with root package name */
    private static C3373c f34654c;

    /* renamed from: d, reason: collision with root package name */
    private static final Object f34655d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Context f34656a;

    /* renamed from: b, reason: collision with root package name */
    private P1 f34657b;

    static final class a implements io.sentry.hints.a, io.sentry.hints.p {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f34658a;

        a(boolean z10) {
            this.f34658a = z10;
        }

        @Override // io.sentry.hints.a
        public boolean d() {
            return true;
        }

        @Override // io.sentry.hints.a
        public String f() {
            return this.f34658a ? "anr_background" : "anr_foreground";
        }
    }

    public AnrIntegration(Context context) {
        this.f34656a = context;
    }

    private Throwable e(boolean z10, SentryAndroidOptions sentryAndroidOptions, ApplicationNotResponding applicationNotResponding) {
        String str = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
        if (z10) {
            str = "Background " + str;
        }
        ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(str, applicationNotResponding.a());
        io.sentry.protocol.j jVar = new io.sentry.protocol.j();
        jVar.j("ANR");
        return new io.sentry.exception.a(jVar, applicationNotResponding2, applicationNotResponding2.a(), true);
    }

    private void g(final io.sentry.L l10, final SentryAndroidOptions sentryAndroidOptions) {
        ILogger logger = sentryAndroidOptions.getLogger();
        K1 k12 = K1.DEBUG;
        logger.c(k12, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            synchronized (f34655d) {
                try {
                    if (f34654c == null) {
                        sentryAndroidOptions.getLogger().c(k12, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                        C3373c c3373c = new C3373c(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new C3373c.a() { // from class: io.sentry.android.core.D
                            @Override // io.sentry.android.core.C3373c.a
                            public final void a(ApplicationNotResponding applicationNotResponding) {
                                AnrIntegration.this.f(l10, sentryAndroidOptions, applicationNotResponding);
                            }
                        }, sentryAndroidOptions.getLogger(), this.f34656a);
                        f34654c = c3373c;
                        c3373c.start();
                        sentryAndroidOptions.getLogger().c(k12, "AnrIntegration installed.", new Object[0]);
                        a();
                    }
                } finally {
                }
            }
        }
    }

    @Override // io.sentry.Integration
    public final void c(io.sentry.L l10, P1 p12) {
        this.f34657b = (P1) io.sentry.util.n.c(p12, "SentryOptions is required");
        g(l10, (SentryAndroidOptions) p12);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (f34655d) {
            try {
                C3373c c3373c = f34654c;
                if (c3373c != null) {
                    c3373c.interrupt();
                    f34654c = null;
                    P1 p12 = this.f34657b;
                    if (p12 != null) {
                        p12.getLogger().c(K1.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void f(io.sentry.L l10, SentryAndroidOptions sentryAndroidOptions, ApplicationNotResponding applicationNotResponding) {
        sentryAndroidOptions.getLogger().c(K1.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
        boolean equals = Boolean.TRUE.equals(M.a().b());
        A1 a12 = new A1(e(equals, sentryAndroidOptions, applicationNotResponding));
        a12.z0(K1.ERROR);
        l10.M(a12, io.sentry.util.j.e(new a(equals)));
    }
}
