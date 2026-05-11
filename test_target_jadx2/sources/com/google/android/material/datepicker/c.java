package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* loaded from: classes2.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    final b f26914a;

    /* renamed from: b, reason: collision with root package name */
    final b f26915b;

    /* renamed from: c, reason: collision with root package name */
    final b f26916c;

    /* renamed from: d, reason: collision with root package name */
    final b f26917d;

    /* renamed from: e, reason: collision with root package name */
    final b f26918e;

    /* renamed from: f, reason: collision with root package name */
    final b f26919f;

    /* renamed from: g, reason: collision with root package name */
    final b f26920g;

    /* renamed from: h, reason: collision with root package name */
    final Paint f26921h;

    c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(V7.b.d(context, H7.b.f3109A, h.class.getCanonicalName()), H7.l.f3795x3);
        this.f26914a = b.a(context, obtainStyledAttributes.getResourceId(H7.l.f3355A3, 0));
        this.f26920g = b.a(context, obtainStyledAttributes.getResourceId(H7.l.f3804y3, 0));
        this.f26915b = b.a(context, obtainStyledAttributes.getResourceId(H7.l.f3813z3, 0));
        this.f26916c = b.a(context, obtainStyledAttributes.getResourceId(H7.l.f3364B3, 0));
        ColorStateList a10 = V7.c.a(context, obtainStyledAttributes, H7.l.f3373C3);
        this.f26917d = b.a(context, obtainStyledAttributes.getResourceId(H7.l.f3391E3, 0));
        this.f26918e = b.a(context, obtainStyledAttributes.getResourceId(H7.l.f3382D3, 0));
        this.f26919f = b.a(context, obtainStyledAttributes.getResourceId(H7.l.f3400F3, 0));
        Paint paint = new Paint();
        this.f26921h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
