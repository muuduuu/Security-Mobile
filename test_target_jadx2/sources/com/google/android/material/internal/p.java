package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* loaded from: classes2.dex */
public abstract class p extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    private int f27297a;

    public p(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f27297a = getVisibility();
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f27297a = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f27297a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
