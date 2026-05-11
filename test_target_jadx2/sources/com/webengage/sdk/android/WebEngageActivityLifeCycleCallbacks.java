package com.webengage.sdk.android;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.webengage.sdk.android.utils.WebEngageUtils;

/* loaded from: classes2.dex */
public class WebEngageActivityLifeCycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public WebEngageActivityLifeCycleCallbacks(Context context) {
        this(context, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        n4.a(WebEngageUtils.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (activity instanceof WETransparentActivity) {
            return;
        }
        n4.a(activity);
        WebEngage.get().analytics().start(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (activity instanceof WETransparentActivity) {
            return;
        }
        WebEngage.get().analytics().stop(activity);
    }

    public WebEngageActivityLifeCycleCallbacks(Context context, WebEngageConfig webEngageConfig) {
        WebEngage.engage(context, webEngageConfig);
    }
}
