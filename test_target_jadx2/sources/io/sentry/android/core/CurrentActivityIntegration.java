package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.Integration;
import io.sentry.P1;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class CurrentActivityIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final Application f34708a;

    public CurrentActivityIntegration(Application application) {
        this.f34708a = (Application) io.sentry.util.n.c(application, "Application is required");
    }

    private void b(Activity activity) {
        if (Q.c().b() == activity) {
            Q.c().a();
        }
    }

    private void e(Activity activity) {
        Q.c().d(activity);
    }

    @Override // io.sentry.Integration
    public void c(io.sentry.L l10, P1 p12) {
        this.f34708a.registerActivityLifecycleCallbacks(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f34708a.unregisterActivityLifecycleCallbacks(this);
        Q.c().a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        b(activity);
    }
}
