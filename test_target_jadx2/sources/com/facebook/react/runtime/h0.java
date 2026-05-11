package com.facebook.react.runtime;

import android.app.Activity;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.LifecycleState;

/* loaded from: classes.dex */
class h0 {

    /* renamed from: a, reason: collision with root package name */
    LifecycleState f22087a = LifecycleState.BEFORE_CREATE;

    /* renamed from: b, reason: collision with root package name */
    private final C1906d f22088b;

    h0(C1906d c1906d) {
        this.f22088b = c1906d;
    }

    public LifecycleState a() {
        return this.f22087a;
    }

    public void b(ReactContext reactContext) {
        if (reactContext != null) {
            LifecycleState lifecycleState = this.f22087a;
            if (lifecycleState == LifecycleState.BEFORE_RESUME) {
                this.f22088b.a("ReactContext.onHostDestroy()");
                reactContext.onHostDestroy();
            } else if (lifecycleState == LifecycleState.RESUMED) {
                this.f22088b.a("ReactContext.onHostPause()");
                reactContext.onHostPause();
                this.f22088b.a("ReactContext.onHostDestroy()");
                reactContext.onHostDestroy();
            }
        }
        this.f22087a = LifecycleState.BEFORE_CREATE;
    }

    public void c(ReactContext reactContext, Activity activity) {
        if (reactContext != null) {
            LifecycleState lifecycleState = this.f22087a;
            if (lifecycleState == LifecycleState.BEFORE_CREATE) {
                this.f22088b.a("ReactContext.onHostResume()");
                reactContext.onHostResume(activity);
                this.f22088b.a("ReactContext.onHostPause()");
                reactContext.onHostPause();
            } else if (lifecycleState == LifecycleState.RESUMED) {
                this.f22088b.a("ReactContext.onHostPause()");
                reactContext.onHostPause();
            }
        }
        this.f22087a = LifecycleState.BEFORE_RESUME;
    }

    public void d(ReactContext reactContext, Activity activity) {
        LifecycleState lifecycleState = this.f22087a;
        LifecycleState lifecycleState2 = LifecycleState.RESUMED;
        if (lifecycleState == lifecycleState2) {
            return;
        }
        if (reactContext != null) {
            this.f22088b.a("ReactContext.onHostResume()");
            reactContext.onHostResume(activity);
        }
        this.f22087a = lifecycleState2;
    }

    public void e(ReactContext reactContext, Activity activity) {
        if (this.f22087a == LifecycleState.RESUMED) {
            this.f22088b.a("ReactContext.onHostResume()");
            reactContext.onHostResume(activity);
        }
    }
}
