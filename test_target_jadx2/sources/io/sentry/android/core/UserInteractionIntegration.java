package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.K1;
import io.sentry.P1;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class UserInteractionIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final Application f34788a;

    /* renamed from: b, reason: collision with root package name */
    private io.sentry.L f34789b;

    /* renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f34790c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f34791d;

    public UserInteractionIntegration(Application application, b0 b0Var) {
        this.f34788a = (Application) io.sentry.util.n.c(application, "Application is required");
        this.f34791d = b0Var.b("androidx.core.view.GestureDetectorCompat", this.f34790c);
    }

    private void b(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f34790c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(K1.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.f34789b == null || this.f34790c == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new io.sentry.android.core.internal.gestures.b();
        }
        window.setCallback(new io.sentry.android.core.internal.gestures.h(callback, activity, new io.sentry.android.core.internal.gestures.g(activity, this.f34789b, this.f34790c), this.f34790c));
    }

    private void e(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f34790c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(K1.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof io.sentry.android.core.internal.gestures.h) {
            io.sentry.android.core.internal.gestures.h hVar = (io.sentry.android.core.internal.gestures.h) callback;
            hVar.c();
            if (hVar.a() instanceof io.sentry.android.core.internal.gestures.b) {
                window.setCallback(null);
            } else {
                window.setCallback(hVar.a());
            }
        }
    }

    @Override // io.sentry.Integration
    public void c(io.sentry.L l10, P1 p12) {
        this.f34790c = (SentryAndroidOptions) io.sentry.util.n.c(p12 instanceof SentryAndroidOptions ? (SentryAndroidOptions) p12 : null, "SentryAndroidOptions is required");
        this.f34789b = (io.sentry.L) io.sentry.util.n.c(l10, "Hub is required");
        boolean z10 = this.f34790c.isEnableUserInteractionBreadcrumbs() || this.f34790c.isEnableUserInteractionTracing();
        ILogger logger = this.f34790c.getLogger();
        K1 k12 = K1.DEBUG;
        logger.c(k12, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z10));
        if (z10) {
            if (!this.f34791d) {
                p12.getLogger().c(K1.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
                return;
            }
            this.f34788a.registerActivityLifecycleCallbacks(this);
            this.f34790c.getLogger().c(k12, "UserInteractionIntegration installed.", new Object[0]);
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f34788a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f34790c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(K1.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
