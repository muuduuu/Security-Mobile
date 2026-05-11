package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.view.AbstractC1484a0;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f26908a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f26909b;

    /* renamed from: c, reason: collision with root package name */
    private final ColorStateList f26910c;

    /* renamed from: d, reason: collision with root package name */
    private final ColorStateList f26911d;

    /* renamed from: e, reason: collision with root package name */
    private final int f26912e;

    /* renamed from: f, reason: collision with root package name */
    private final Y7.k f26913f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, Y7.k kVar, Rect rect) {
        y0.f.d(rect.left);
        y0.f.d(rect.top);
        y0.f.d(rect.right);
        y0.f.d(rect.bottom);
        this.f26908a = rect;
        this.f26909b = colorStateList2;
        this.f26910c = colorStateList;
        this.f26911d = colorStateList3;
        this.f26912e = i10;
        this.f26913f = kVar;
    }

    static b a(Context context, int i10) {
        y0.f.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, H7.l.f3409G3);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(H7.l.f3418H3, 0), obtainStyledAttributes.getDimensionPixelOffset(H7.l.f3436J3, 0), obtainStyledAttributes.getDimensionPixelOffset(H7.l.f3427I3, 0), obtainStyledAttributes.getDimensionPixelOffset(H7.l.f3445K3, 0));
        ColorStateList a10 = V7.c.a(context, obtainStyledAttributes, H7.l.f3454L3);
        ColorStateList a11 = V7.c.a(context, obtainStyledAttributes, H7.l.f3499Q3);
        ColorStateList a12 = V7.c.a(context, obtainStyledAttributes, H7.l.f3481O3);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(H7.l.f3490P3, 0);
        Y7.k m10 = Y7.k.b(context, obtainStyledAttributes.getResourceId(H7.l.f3463M3, 0), obtainStyledAttributes.getResourceId(H7.l.f3472N3, 0)).m();
        obtainStyledAttributes.recycle();
        return new b(a10, a11, a12, dimensionPixelSize, m10, rect);
    }

    void b(TextView textView) {
        Y7.g gVar = new Y7.g();
        Y7.g gVar2 = new Y7.g();
        gVar.setShapeAppearanceModel(this.f26913f);
        gVar2.setShapeAppearanceModel(this.f26913f);
        gVar.X(this.f26910c);
        gVar.c0(this.f26912e, this.f26911d);
        textView.setTextColor(this.f26909b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f26909b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f26908a;
        AbstractC1484a0.u0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
