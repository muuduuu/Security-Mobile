package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.T;

/* loaded from: classes2.dex */
public abstract class f extends T {

    /* renamed from: p, reason: collision with root package name */
    private Drawable f27253p;

    /* renamed from: q, reason: collision with root package name */
    private final Rect f27254q;

    /* renamed from: r, reason: collision with root package name */
    private final Rect f27255r;

    /* renamed from: s, reason: collision with root package name */
    private int f27256s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f27257t;

    /* renamed from: u, reason: collision with root package name */
    boolean f27258u;

    public f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f27254q = new Rect();
        this.f27255r = new Rect();
        this.f27256s = 119;
        this.f27257t = true;
        this.f27258u = false;
        TypedArray h10 = m.h(context, attributeSet, H7.l.f3776v2, i10, 0, new int[0]);
        this.f27256s = h10.getInt(H7.l.f3794x2, this.f27256s);
        Drawable drawable = h10.getDrawable(H7.l.f3785w2);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f27257t = h10.getBoolean(H7.l.f3803y2, true);
        h10.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f27253p;
        if (drawable != null) {
            if (this.f27258u) {
                this.f27258u = false;
                Rect rect = this.f27254q;
                Rect rect2 = this.f27255r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f27257t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f27256s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f27253p;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f27253p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f27253p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f27253p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f27256s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f27253p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.T, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f27258u = z10 | this.f27258u;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f27258u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f27253p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f27253p);
            }
            this.f27253p = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f27256s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f27256s != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f27256s = i10;
            if (i10 == 119 && this.f27253p != null) {
                this.f27253p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f27253p;
    }
}
