package com.google.android.material.progressindicator;

import H7.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.m;

/* loaded from: classes2.dex */
public final class e extends b {

    /* renamed from: g, reason: collision with root package name */
    public int f27343g;

    /* renamed from: h, reason: collision with root package name */
    public int f27344h;

    /* renamed from: i, reason: collision with root package name */
    public int f27345i;

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, H7.b.f3137j);
    }

    @Override // com.google.android.material.progressindicator.b
    void e() {
    }

    public e(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, CircularProgressIndicator.f27298p);
    }

    public e(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(H7.d.f3189Z);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(H7.d.f3188Y);
        TypedArray h10 = m.h(context, attributeSet, l.f3784w1, i10, i11, new int[0]);
        this.f27343g = Math.max(V7.c.c(context, h10, l.f3811z1, dimensionPixelSize), this.f27318a * 2);
        this.f27344h = V7.c.c(context, h10, l.f3802y1, dimensionPixelSize2);
        this.f27345i = h10.getInt(l.f3793x1, 0);
        h10.recycle();
        e();
    }
}
