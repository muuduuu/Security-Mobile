package io.sentry.android.core;

import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.K1;
import io.sentry.P1;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class AppLifecycleIntegration implements Integration, Closeable {

    /* renamed from: a, reason: collision with root package name */
    volatile a0 f34676a;

    /* renamed from: b, reason: collision with root package name */
    private SentryAndroidOptions f34677b;

    /* renamed from: c, reason: collision with root package name */
    private final c0 f34678c;

    public AppLifecycleIntegration() {
        this(new c0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void i(io.sentry.L l10) {
        SentryAndroidOptions sentryAndroidOptions = this.f34677b;
        if (sentryAndroidOptions == null) {
            return;
        }
        this.f34676a = new a0(l10, sentryAndroidOptions.getSessionTrackingIntervalMillis(), this.f34677b.isEnableAutoSessionTracking(), this.f34677b.isEnableAppLifecycleBreadcrumbs());
        try {
            ProcessLifecycleOwner.l().getLifecycle().a(this.f34676a);
            this.f34677b.getLogger().c(K1.DEBUG, "AppLifecycleIntegration installed.", new Object[0]);
            a();
        } catch (Throwable th) {
            this.f34676a = null;
            this.f34677b.getLogger().b(K1.ERROR, "AppLifecycleIntegration failed to get Lifecycle and could not be installed.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void g() {
        a0 a0Var = this.f34676a;
        if (a0Var != null) {
            ProcessLifecycleOwner.l().getLifecycle().d(a0Var);
            SentryAndroidOptions sentryAndroidOptions = this.f34677b;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(K1.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
            }
        }
        this.f34676a = null;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0085 -> B:14:0x0090). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0079 -> B:14:0x0090). Please report as a decompilation issue!!! */
    @Override // io.sentry.Integration
    public void c(final io.sentry.L l10, P1 p12) {
        io.sentry.util.n.c(l10, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.n.c(p12 instanceof SentryAndroidOptions ? (SentryAndroidOptions) p12 : null, "SentryAndroidOptions is required");
        this.f34677b = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        K1 k12 = K1.DEBUG;
        logger.c(k12, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f34677b.isEnableAutoSessionTracking()));
        this.f34677b.getLogger().c(k12, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f34677b.isEnableAppLifecycleBreadcrumbs()));
        if (this.f34677b.isEnableAutoSessionTracking() || this.f34677b.isEnableAppLifecycleBreadcrumbs()) {
            try {
                ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.INSTANCE;
                if (io.sentry.android.core.internal.util.b.e().d()) {
                    i(l10);
                    p12 = p12;
                } else {
                    this.f34678c.b(new Runnable() { // from class: io.sentry.android.core.K
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppLifecycleIntegration.this.i(l10);
                        }
                    });
                    p12 = p12;
                }
            } catch (ClassNotFoundException e10) {
                ILogger logger2 = p12.getLogger();
                logger2.b(K1.INFO, "androidx.lifecycle is not available, AppLifecycleIntegration won't be installed", e10);
                p12 = logger2;
            } catch (IllegalStateException e11) {
                ILogger logger3 = p12.getLogger();
                logger3.b(K1.ERROR, "AppLifecycleIntegration could not be installed", e11);
                p12 = logger3;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f34676a == null) {
            return;
        }
        if (io.sentry.android.core.internal.util.b.e().d()) {
            g();
        } else {
            this.f34678c.b(new Runnable() { // from class: io.sentry.android.core.J
                @Override // java.lang.Runnable
                public final void run() {
                    AppLifecycleIntegration.this.g();
                }
            });
        }
    }

    AppLifecycleIntegration(c0 c0Var) {
        this.f34678c = c0Var;
    }
}
