package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.y1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2402y1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2411z1 f24696a;

    C2402y1(C2411z1 c2411z1) {
        Objects.requireNonNull(c2411z1);
        this.f24696a = c2411z1;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f24696a.j(new C2331q1(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f24696a.j(new C2384w1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f24696a.j(new C2357t1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f24696a.j(new C2348s1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        BinderC2347s0 binderC2347s0 = new BinderC2347s0();
        this.f24696a.j(new C2375v1(this, activity, binderC2347s0));
        Bundle m12 = binderC2347s0.m1(50L);
        if (m12 != null) {
            bundle.putAll(m12);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f24696a.j(new C2339r1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f24696a.j(new C2366u1(this, activity));
    }
}
