package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import io.sentry.AbstractC3410f1;

/* loaded from: classes2.dex */
public final class SentryPerformanceProvider extends V implements Application.ActivityLifecycleCallbacks {

    /* renamed from: e, reason: collision with root package name */
    private static AbstractC3410f1 f34760e = AbstractC3388s.a();

    /* renamed from: f, reason: collision with root package name */
    private static long f34761f = SystemClock.uptimeMillis();

    /* renamed from: b, reason: collision with root package name */
    private boolean f34762b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f34763c = false;

    /* renamed from: d, reason: collision with root package name */
    private Application f34764d;

    public SentryPerformanceProvider() {
        L.e().i(f34761f, f34760e);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.f34762b) {
            return;
        }
        L.e().j(bundle == null);
        this.f34762b = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (!this.f34763c) {
            this.f34763c = true;
            L.e().g();
        }
        Application application = this.f34764d;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this);
        }
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

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        if (!(context instanceof Application)) {
            return true;
        }
        Application application = (Application) context;
        this.f34764d = application;
        application.registerActivityLifecycleCallbacks(this);
        return true;
    }
}
