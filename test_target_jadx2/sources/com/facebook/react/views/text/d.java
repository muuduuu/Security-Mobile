package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import w4.C5036a;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static d f22784b;

    /* renamed from: a, reason: collision with root package name */
    private final C5036a f22785a;

    private d(C5036a c5036a) {
        this.f22785a = c5036a;
    }

    public static d a() {
        if (f22784b == null) {
            f22784b = new d(C5036a.d());
        }
        return f22784b;
    }

    public Typeface b(String str, int i10, int i11, AssetManager assetManager) {
        return this.f22785a.e(str, i10, i11, assetManager);
    }

    public Typeface c(String str, int i10, AssetManager assetManager) {
        return this.f22785a.f(str, i10, assetManager);
    }
}
