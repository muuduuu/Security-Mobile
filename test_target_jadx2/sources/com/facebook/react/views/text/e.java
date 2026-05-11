package com.facebook.react.views.text;

import com.facebook.react.uimanager.C1971u0;

/* loaded from: classes2.dex */
public class e extends C1971u0 {

    /* renamed from: y, reason: collision with root package name */
    private String f22786y = null;

    @Z4.a(name = "text")
    public void setText(String str) {
        this.f22786y = str;
        y0();
    }

    @Override // com.facebook.react.uimanager.C1971u0
    public String toString() {
        return O() + " [text: " + this.f22786y + "]";
    }

    @Override // com.facebook.react.uimanager.C1971u0, com.facebook.react.uimanager.InterfaceC1969t0
    public boolean u() {
        return true;
    }

    public String v1() {
        return this.f22786y;
    }
}
