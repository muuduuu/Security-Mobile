package com.facebook.react.uimanager;

import android.view.View;

/* renamed from: com.facebook.react.uimanager.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1932a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1932a0 f22316a = new C1932a0();

    private C1932a0() {
    }

    public static final void a(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode == 0 || mode2 == 0) {
            throw new IllegalStateException("A catalyst view must have an explicit width and height given to it. This should normally happen as part of the standard catalyst UI framework.");
        }
    }
}
