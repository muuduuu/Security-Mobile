package com.google.android.material.progressindicator;

import H7.l;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.m;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public int f27318a;

    /* renamed from: b, reason: collision with root package name */
    public int f27319b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f27320c = new int[0];

    /* renamed from: d, reason: collision with root package name */
    public int f27321d;

    /* renamed from: e, reason: collision with root package name */
    public int f27322e;

    /* renamed from: f, reason: collision with root package name */
    public int f27323f;

    protected b(Context context, AttributeSet attributeSet, int i10, int i11) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(H7.d.f3191a0);
        TypedArray h10 = m.h(context, attributeSet, l.f3495Q, i10, i11, new int[0]);
        this.f27318a = V7.c.c(context, h10, l.f3567Y, dimensionPixelSize);
        this.f27319b = Math.min(V7.c.c(context, h10, l.f3558X, 0), this.f27318a / 2);
        this.f27322e = h10.getInt(l.f3531U, 0);
        this.f27323f = h10.getInt(l.f3504R, 0);
        c(context, h10);
        d(context, h10);
        h10.recycle();
    }

    private void c(Context context, TypedArray typedArray) {
        if (!typedArray.hasValue(l.f3513S)) {
            this.f27320c = new int[]{M7.a.b(context, H7.b.f3141n, -1)};
            return;
        }
        if (typedArray.peekValue(l.f3513S).type != 1) {
            this.f27320c = new int[]{typedArray.getColor(l.f3513S, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(l.f3513S, -1));
        this.f27320c = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    private void d(Context context, TypedArray typedArray) {
        if (typedArray.hasValue(l.f3549W)) {
            this.f27321d = typedArray.getColor(l.f3549W, -1);
            return;
        }
        this.f27321d = this.f27320c[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f10 = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.f27321d = M7.a.a(this.f27321d, (int) (f10 * 255.0f));
    }

    public boolean a() {
        return this.f27323f != 0;
    }

    public boolean b() {
        return this.f27322e != 0;
    }

    abstract void e();
}
