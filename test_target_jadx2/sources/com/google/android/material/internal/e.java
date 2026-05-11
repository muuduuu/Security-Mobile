package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.AbstractC1524v;

/* loaded from: classes2.dex */
public abstract class e extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private int f27249a;

    /* renamed from: b, reason: collision with root package name */
    private int f27250b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27251c;

    /* renamed from: d, reason: collision with root package name */
    private int f27252d;

    public e(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f27251c = false;
        d(context, attributeSet);
    }

    private static int a(int i10, int i11, int i12) {
        return i11 != Integer.MIN_VALUE ? i11 != 1073741824 ? i12 : i10 : Math.min(i12, i10);
    }

    private void d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, H7.l.f3731q2, 0, 0);
        this.f27249a = obtainStyledAttributes.getDimensionPixelSize(H7.l.f3749s2, 0);
        this.f27250b = obtainStyledAttributes.getDimensionPixelSize(H7.l.f3740r2, 0);
        obtainStyledAttributes.recycle();
    }

    public int b(View view) {
        Object tag = view.getTag(H7.f.f3237H);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean c() {
        return this.f27251c;
    }

    protected int getItemSpacing() {
        return this.f27250b;
    }

    protected int getLineSpacing() {
        return this.f27249a;
    }

    protected int getRowCount() {
        return this.f27252d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (getChildCount() == 0) {
            this.f27252d = 0;
            return;
        }
        this.f27252d = 1;
        boolean z11 = AbstractC1484a0.A(this) == 1;
        int paddingRight = z11 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z11 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i16 = (i12 - i10) - paddingLeft;
        int i17 = paddingRight;
        int i18 = paddingTop;
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(H7.f.f3237H, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i15 = AbstractC1524v.b(marginLayoutParams);
                    i14 = AbstractC1524v.a(marginLayoutParams);
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                int measuredWidth = i17 + i15 + childAt.getMeasuredWidth();
                if (!this.f27251c && measuredWidth > i16) {
                    i18 = this.f27249a + paddingTop;
                    this.f27252d++;
                    i17 = paddingRight;
                }
                childAt.setTag(H7.f.f3237H, Integer.valueOf(this.f27252d - 1));
                int i20 = i17 + i15;
                int measuredWidth2 = childAt.getMeasuredWidth() + i20;
                int measuredHeight = childAt.getMeasuredHeight() + i18;
                if (z11) {
                    childAt.layout(i16 - measuredWidth2, i18, (i16 - i17) - i15, measuredHeight);
                } else {
                    childAt.layout(i20, i18, measuredWidth2, measuredHeight);
                }
                i17 += i15 + i14 + childAt.getMeasuredWidth() + this.f27250b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i15 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i15 - getPaddingRight();
        int i16 = paddingTop;
        int i17 = 0;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i12 = marginLayoutParams.leftMargin;
                    i13 = marginLayoutParams.rightMargin;
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                int i19 = paddingLeft;
                if (paddingLeft + i12 + childAt.getMeasuredWidth() <= paddingRight || c()) {
                    i14 = i19;
                } else {
                    i14 = getPaddingLeft();
                    i16 = this.f27249a + paddingTop;
                }
                int measuredWidth = i14 + i12 + childAt.getMeasuredWidth();
                int measuredHeight = i16 + childAt.getMeasuredHeight();
                if (measuredWidth > i17) {
                    i17 = measuredWidth;
                }
                paddingLeft = i14 + i12 + i13 + childAt.getMeasuredWidth() + this.f27250b;
                if (i18 == getChildCount() - 1) {
                    i17 += i13;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i17 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    protected void setItemSpacing(int i10) {
        this.f27250b = i10;
    }

    protected void setLineSpacing(int i10) {
        this.f27249a = i10;
    }

    public void setSingleLine(boolean z10) {
        this.f27251c = z10;
    }
}
