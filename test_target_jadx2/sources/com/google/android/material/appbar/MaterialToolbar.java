package com.google.android.material.appbar;

import H7.k;
import H7.l;
import Y7.g;
import Y7.h;
import a8.AbstractC1367a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.AbstractC1484a0;
import com.google.android.material.internal.m;
import com.google.android.material.internal.n;

/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: v0, reason: collision with root package name */
    private static final int f26578v0 = k.f3324A;

    /* renamed from: w0, reason: collision with root package name */
    private static final ImageView.ScaleType[] f26579w0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: q0, reason: collision with root package name */
    private Integer f26580q0;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f26581r0;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f26582s0;

    /* renamed from: t0, reason: collision with root package name */
    private ImageView.ScaleType f26583t0;

    /* renamed from: u0, reason: collision with root package name */
    private Boolean f26584u0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, H7.b.f3127S);
    }

    private Pair S(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void T(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.X(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.M(context);
            gVar.W(AbstractC1484a0.v(this));
            AbstractC1484a0.u0(this, gVar);
        }
    }

    private void U(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i10 += max;
            i11 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    private void V() {
        if (this.f26581r0 || this.f26582s0) {
            TextView e10 = n.e(this);
            TextView c10 = n.c(this);
            if (e10 == null && c10 == null) {
                return;
            }
            Pair S10 = S(e10, c10);
            if (this.f26581r0 && e10 != null) {
                U(e10, S10);
            }
            if (!this.f26582s0 || c10 == null) {
                return;
            }
            U(c10, S10);
        }
    }

    private Drawable W(Drawable drawable) {
        if (drawable == null || this.f26580q0 == null) {
            return drawable;
        }
        Drawable l10 = androidx.core.graphics.drawable.a.l(drawable.mutate());
        androidx.core.graphics.drawable.a.h(l10, this.f26580q0.intValue());
        return l10;
    }

    private void X() {
        ImageView b10 = n.b(this);
        if (b10 != null) {
            Boolean bool = this.f26584u0;
            if (bool != null) {
                b10.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f26583t0;
            if (scaleType != null) {
                b10.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f26583t0;
    }

    public Integer getNavigationIconTint() {
        return this.f26580q0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        V();
        X();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f26584u0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f26584u0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f26583t0 != scaleType) {
            this.f26583t0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(W(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f26580q0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f26582s0 != z10) {
            this.f26582s0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f26581r0 != z10) {
            this.f26581r0 = z10;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i10) {
        super(AbstractC1367a.c(context, attributeSet, i10, r4), attributeSet, i10);
        int i11 = f26578v0;
        Context context2 = getContext();
        TypedArray h10 = m.h(context2, attributeSet, l.f3697m4, i10, i11, new int[0]);
        if (h10.hasValue(l.f3724p4)) {
            setNavigationIconTint(h10.getColor(l.f3724p4, -1));
        }
        this.f26581r0 = h10.getBoolean(l.f3742r4, false);
        this.f26582s0 = h10.getBoolean(l.f3733q4, false);
        int i12 = h10.getInt(l.f3715o4, -1);
        if (i12 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f26579w0;
            if (i12 < scaleTypeArr.length) {
                this.f26583t0 = scaleTypeArr[i12];
            }
        }
        if (h10.hasValue(l.f3706n4)) {
            this.f26584u0 = Boolean.valueOf(h10.getBoolean(l.f3706n4, false));
        }
        h10.recycle();
        T(context2);
    }
}
