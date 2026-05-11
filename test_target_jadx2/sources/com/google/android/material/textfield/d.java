package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;

/* loaded from: classes2.dex */
class d extends Y7.g {

    /* renamed from: A, reason: collision with root package name */
    private final RectF f27648A;

    /* renamed from: z, reason: collision with root package name */
    private final Paint f27649z;

    d(Y7.k kVar) {
        super(kVar == null ? new Y7.k() : kVar);
        this.f27649z = new Paint(1);
        m0();
        this.f27648A = new RectF();
    }

    private void m0() {
        this.f27649z.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f27649z.setColor(-1);
        this.f27649z.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    boolean i0() {
        return !this.f27648A.isEmpty();
    }

    void j0() {
        k0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void k0(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f27648A;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    void l0(RectF rectF) {
        k0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // Y7.g
    protected void r(Canvas canvas) {
        if (this.f27648A.isEmpty()) {
            super.r(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f27648A);
        } else {
            canvas.clipRect(this.f27648A, Region.Op.DIFFERENCE);
        }
        super.r(canvas);
        canvas.restore();
    }
}
