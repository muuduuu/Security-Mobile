package com.webengage.sdk.android.actions.render;

import android.content.Context;
import android.webkit.JavascriptInterface;

/* loaded from: classes2.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    InAppNotificationData f30338a;

    /* renamed from: b, reason: collision with root package name */
    n f30339b;

    /* renamed from: c, reason: collision with root package name */
    Context f30340c;

    f(InAppNotificationData inAppNotificationData, n nVar) {
        this.f30338a = inAppNotificationData;
        this.f30339b = nVar;
        this.f30340c = nVar.getActivity().getApplicationContext();
    }

    @JavascriptInterface
    public String getData() {
        return this.f30338a.getData().toString();
    }

    @JavascriptInterface
    public String getLayoutId() {
        return this.f30338a.getLayoutId();
    }

    @JavascriptInterface
    public void onClick(String str, String str2, boolean z10) {
        this.f30339b.a(str, str2, z10);
    }

    @JavascriptInterface
    public void onClose() {
        this.f30339b.c();
    }

    @JavascriptInterface
    public void onError(String str) {
        this.f30339b.a(str);
    }

    @JavascriptInterface
    public void onOpen() {
        try {
            this.f30339b.d();
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void trackEvent(String str, String str2) {
        this.f30339b.a(str, str2);
    }
}
