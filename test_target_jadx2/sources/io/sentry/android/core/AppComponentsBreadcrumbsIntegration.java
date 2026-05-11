package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import io.sentry.C3405e;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.K1;
import io.sentry.P1;
import io.sentry.protocol.f;
import java.io.Closeable;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class AppComponentsBreadcrumbsIntegration implements Integration, Closeable, ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34673a;

    /* renamed from: b, reason: collision with root package name */
    private io.sentry.L f34674b;

    /* renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f34675c;

    public AppComponentsBreadcrumbsIntegration(Context context) {
        this.f34673a = (Context) io.sentry.util.n.c(context, "Context is required");
    }

    private void b(Integer num) {
        if (this.f34674b != null) {
            C3405e c3405e = new C3405e();
            if (num != null) {
                if (num.intValue() < 40) {
                    return;
                } else {
                    c3405e.i("level", num);
                }
            }
            c3405e.l("system");
            c3405e.h("device.event");
            c3405e.k("Low memory");
            c3405e.i("action", "LOW_MEMORY");
            c3405e.j(K1.WARNING);
            this.f34674b.w(c3405e);
        }
    }

    @Override // io.sentry.Integration
    public void c(io.sentry.L l10, P1 p12) {
        this.f34674b = (io.sentry.L) io.sentry.util.n.c(l10, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.n.c(p12 instanceof SentryAndroidOptions ? (SentryAndroidOptions) p12 : null, "SentryAndroidOptions is required");
        this.f34675c = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        K1 k12 = K1.DEBUG;
        logger.c(k12, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f34675c.isEnableAppComponentBreadcrumbs()));
        if (this.f34675c.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f34673a.registerComponentCallbacks(this);
                p12.getLogger().c(k12, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                a();
            } catch (Throwable th) {
                this.f34675c.setEnableAppComponentBreadcrumbs(false);
                p12.getLogger().a(K1.INFO, th, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f34673a.unregisterComponentCallbacks(this);
        } catch (Throwable th) {
            SentryAndroidOptions sentryAndroidOptions = this.f34675c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().a(K1.DEBUG, th, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f34675c;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().c(K1.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (this.f34674b != null) {
            f.b a10 = io.sentry.android.core.internal.util.h.a(this.f34673a.getResources().getConfiguration().orientation);
            String lowerCase = a10 != null ? a10.name().toLowerCase(Locale.ROOT) : "undefined";
            C3405e c3405e = new C3405e();
            c3405e.l("navigation");
            c3405e.h("device.orientation");
            c3405e.i("position", lowerCase);
            c3405e.j(K1.INFO);
            io.sentry.A a11 = new io.sentry.A();
            a11.k("android:configuration", configuration);
            this.f34674b.A(c3405e, a11);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        b(null);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        b(Integer.valueOf(i10));
    }
}
