package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.view.AbstractC1484a0;
import g.AbstractC3179j;

/* renamed from: androidx.appcompat.widget.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1423z extends C1418u {

    /* renamed from: d, reason: collision with root package name */
    private final SeekBar f14270d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f14271e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f14272f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f14273g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14274h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14275i;

    C1423z(SeekBar seekBar) {
        super(seekBar);
        this.f14272f = null;
        this.f14273g = null;
        this.f14274h = false;
        this.f14275i = false;
        this.f14270d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f14271e;
        if (drawable != null) {
            if (this.f14274h || this.f14275i) {
                Drawable l10 = androidx.core.graphics.drawable.a.l(drawable.mutate());
                this.f14271e = l10;
                if (this.f14274h) {
                    androidx.core.graphics.drawable.a.i(l10, this.f14272f);
                }
                if (this.f14275i) {
                    androidx.core.graphics.drawable.a.j(this.f14271e, this.f14273g);
                }
                if (this.f14271e.isStateful()) {
                    this.f14271e.setState(this.f14270d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.C1418u
    void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        h0 v10 = h0.v(this.f14270d.getContext(), attributeSet, AbstractC3179j.f33334T, i10, 0);
        SeekBar seekBar = this.f14270d;
        AbstractC1484a0.o0(seekBar, seekBar.getContext(), AbstractC3179j.f33334T, attributeSet, v10.r(), i10, 0);
        Drawable h10 = v10.h(AbstractC3179j.f33338U);
        if (h10 != null) {
            this.f14270d.setThumb(h10);
        }
        j(v10.g(AbstractC3179j.f33342V));
        if (v10.s(AbstractC3179j.f33350X)) {
            this.f14273g = O.e(v10.k(AbstractC3179j.f33350X, -1), this.f14273g);
            this.f14275i = true;
        }
        if (v10.s(AbstractC3179j.f33346W)) {
            this.f14272f = v10.c(AbstractC3179j.f33346W);
            this.f14274h = true;
        }
        v10.x();
        f();
    }

    void g(Canvas canvas) {
        if (this.f14271e != null) {
            int max = this.f14270d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f14271e.getIntrinsicWidth();
                int intrinsicHeight = this.f14271e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f14271e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f14270d.getWidth() - this.f14270d.getPaddingLeft()) - this.f14270d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f14270d.getPaddingLeft(), this.f14270d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f14271e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    void h() {
        Drawable drawable = this.f14271e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f14270d.getDrawableState())) {
            this.f14270d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f14271e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f14271e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f14271e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f14270d);
            androidx.core.graphics.drawable.a.g(drawable, this.f14270d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f14270d.getDrawableState());
            }
            f();
        }
        this.f14270d.invalidate();
    }
}
