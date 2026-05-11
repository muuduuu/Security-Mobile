package com.google.android.material.timepicker;

import H7.f;
import H7.h;
import H7.l;
import Y7.g;
import Y7.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.view.AbstractC1484a0;

/* loaded from: classes2.dex */
abstract class b extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f27788a;

    /* renamed from: b, reason: collision with root package name */
    private int f27789b;

    /* renamed from: c, reason: collision with root package name */
    private g f27790c;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.s();
        }
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(h.f3288k, this);
        AbstractC1484a0.u0(this, i());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f3446K4, i10, 0);
        this.f27789b = obtainStyledAttributes.getDimensionPixelSize(l.f3455L4, 0);
        this.f27788a = new a();
        obtainStyledAttributes.recycle();
    }

    private Drawable i() {
        g gVar = new g();
        this.f27790c = gVar;
        gVar.V(new i(0.5f));
        this.f27790c.X(ColorStateList.valueOf(-1));
        return this.f27790c;
    }

    private static boolean r(View view) {
        return "skip".equals(view.getTag());
    }

    private void t() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f27788a);
            handler.post(this.f27788a);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(AbstractC1484a0.k());
        }
        t();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        s();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        t();
    }

    public int p() {
        return this.f27789b;
    }

    public void q(int i10) {
        this.f27789b = i10;
        s();
    }

    protected void s() {
        int childCount = getChildCount();
        int i10 = 1;
        for (int i11 = 0; i11 < childCount; i11++) {
            if (r(getChildAt(i11))) {
                i10++;
            }
        }
        d dVar = new d();
        dVar.g(this);
        float f10 = 0.0f;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getId() != f.f3250b && !r(childAt)) {
                dVar.h(childAt.getId(), f.f3250b, this.f27789b, f10);
                f10 += 360.0f / (childCount - i10);
            }
        }
        dVar.c(this);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f27790c.X(ColorStateList.valueOf(i10));
    }
}
