package com.webengage.sdk.android;

import android.app.Activity;
import android.content.Intent;
import com.webengage.sdk.android.Analytics;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes2.dex */
class k2 extends Analytics {

    /* renamed from: a, reason: collision with root package name */
    Queue<v3> f30683a;

    k2(Queue<v3> queue) {
        this.f30683a = queue;
    }

    @Override // com.webengage.sdk.android.Analytics
    public C2961i a() {
        return null;
    }

    @Override // com.webengage.sdk.android.Analytics
    protected x2 b() {
        return null;
    }

    @Override // com.webengage.sdk.android.Analytics
    protected z2 c() {
        return null;
    }

    @Override // com.webengage.sdk.android.Analytics
    public WeakReference<Activity> getActivity() {
        return null;
    }

    @Override // com.webengage.sdk.android.Analytics
    public void installed(Intent intent) {
        this.f30683a.add(new C2962j(5, intent));
    }

    @Override // com.webengage.sdk.android.Analytics
    public void screenNavigated(String str) {
        screenNavigated(str, null);
    }

    @Override // com.webengage.sdk.android.Analytics
    public void setScreenData(Map<String, ? extends Object> map) {
        this.f30683a.add(new C2962j(4, map));
    }

    @Override // com.webengage.sdk.android.Analytics
    public void start(Activity activity) {
        this.f30683a.add(new C2962j(1, new WeakReference(activity)));
    }

    @Override // com.webengage.sdk.android.Analytics
    public void stop(Activity activity) {
        this.f30683a.add(new C2962j(2, new WeakReference(activity)));
    }

    @Override // com.webengage.sdk.android.Analytics
    public void track(String str) {
        track(str, null, null);
    }

    @Override // com.webengage.sdk.android.Analytics
    public void trackSystem(String str, Map<String, ?> map, Map<String, ?> map2) {
        this.f30683a.add(new C2962j(6, str, map, map2));
    }

    @Override // com.webengage.sdk.android.Analytics
    protected void a(Object obj) {
    }

    @Override // com.webengage.sdk.android.Analytics
    protected void b(Object obj) {
    }

    @Override // com.webengage.sdk.android.Analytics
    public void screenNavigated(String str, Map<String, ? extends Object> map) {
        this.f30683a.add(new C2962j(3, str, map));
    }

    @Override // com.webengage.sdk.android.Analytics
    public void track(String str, Analytics.Options options) {
        track(str, null, options);
    }

    @Override // com.webengage.sdk.android.Analytics
    public void track(String str, Map<String, ? extends Object> map) {
        track(str, map, null);
    }

    @Override // com.webengage.sdk.android.Analytics
    public void track(String str, Map<String, ?> map, Analytics.Options options) {
        this.f30683a.add(new C2962j(0, str, map, options));
    }
}
