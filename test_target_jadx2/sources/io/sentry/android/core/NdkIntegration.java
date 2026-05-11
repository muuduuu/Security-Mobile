package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.K1;
import io.sentry.P1;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class NdkIntegration implements Integration, Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final Class f34729a;

    /* renamed from: b, reason: collision with root package name */
    private SentryAndroidOptions f34730b;

    public NdkIntegration(Class cls) {
        this.f34729a = cls;
    }

    private void b(P1 p12) {
        p12.setEnableNdk(false);
        p12.setEnableScopeSync(false);
    }

    @Override // io.sentry.Integration
    public final void c(io.sentry.L l10, P1 p12) {
        io.sentry.util.n.c(l10, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.n.c(p12 instanceof SentryAndroidOptions ? (SentryAndroidOptions) p12 : null, "SentryAndroidOptions is required");
        this.f34730b = sentryAndroidOptions;
        boolean isEnableNdk = sentryAndroidOptions.isEnableNdk();
        ILogger logger = this.f34730b.getLogger();
        K1 k12 = K1.DEBUG;
        logger.c(k12, "NdkIntegration enabled: %s", Boolean.valueOf(isEnableNdk));
        if (!isEnableNdk || this.f34729a == null) {
            b(this.f34730b);
            return;
        }
        if (this.f34730b.getCacheDirPath() == null) {
            this.f34730b.getLogger().c(K1.ERROR, "No cache dir path is defined in options.", new Object[0]);
            b(this.f34730b);
            return;
        }
        try {
            this.f34729a.getMethod("init", SentryAndroidOptions.class).invoke(null, this.f34730b);
            this.f34730b.getLogger().c(k12, "NdkIntegration installed.", new Object[0]);
            a();
        } catch (NoSuchMethodException e10) {
            b(this.f34730b);
            this.f34730b.getLogger().b(K1.ERROR, "Failed to invoke the SentryNdk.init method.", e10);
        } catch (Throwable th) {
            b(this.f34730b);
            this.f34730b.getLogger().b(K1.ERROR, "Failed to initialize SentryNdk.", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f34730b;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class cls = this.f34729a;
        try {
            if (cls != null) {
                try {
                    try {
                        cls.getMethod("close", null).invoke(null, null);
                        this.f34730b.getLogger().c(K1.DEBUG, "NdkIntegration removed.", new Object[0]);
                    } catch (NoSuchMethodException e10) {
                        this.f34730b.getLogger().b(K1.ERROR, "Failed to invoke the SentryNdk.close method.", e10);
                    }
                } finally {
                    b(this.f34730b);
                }
                b(this.f34730b);
            }
        } catch (Throwable th) {
            b(this.f34730b);
        }
    }
}
