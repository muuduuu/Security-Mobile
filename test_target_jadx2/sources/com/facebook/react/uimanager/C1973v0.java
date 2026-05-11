package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.uimanager.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1973v0 {

    /* renamed from: a, reason: collision with root package name */
    final ReadableMap f22495a;

    public C1973v0(ReadableMap readableMap) {
        this.f22495a = readableMap;
    }

    public boolean a(String str, boolean z10) {
        return this.f22495a.isNull(str) ? z10 : this.f22495a.getBoolean(str);
    }

    public String b(String str) {
        return this.f22495a.getString(str);
    }

    public boolean c(String str) {
        return this.f22495a.hasKey(str);
    }

    public String toString() {
        return "{ " + getClass().getSimpleName() + ": " + this.f22495a.toString() + " }";
    }
}
