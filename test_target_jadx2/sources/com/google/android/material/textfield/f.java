package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes2.dex */
abstract class f {

    /* renamed from: a, reason: collision with root package name */
    TextInputLayout f27683a;

    /* renamed from: b, reason: collision with root package name */
    Context f27684b;

    /* renamed from: c, reason: collision with root package name */
    CheckableImageButton f27685c;

    /* renamed from: d, reason: collision with root package name */
    final int f27686d;

    f(TextInputLayout textInputLayout, int i10) {
        this.f27683a = textInputLayout;
        this.f27684b = textInputLayout.getContext();
        this.f27685c = textInputLayout.getEndIconView();
        this.f27686d = i10;
    }

    abstract void a();

    boolean b(int i10) {
        return true;
    }

    void c(boolean z10) {
    }

    boolean d() {
        return false;
    }
}
