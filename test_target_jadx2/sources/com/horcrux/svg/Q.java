package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes2.dex */
class Q extends C2923z {

    /* renamed from: f, reason: collision with root package name */
    private float f28938f;

    /* renamed from: g, reason: collision with root package name */
    private float f28939g;

    /* renamed from: h, reason: collision with root package name */
    private float f28940h;

    /* renamed from: i, reason: collision with root package name */
    private float f28941i;

    /* renamed from: j, reason: collision with root package name */
    private String f28942j;

    /* renamed from: k, reason: collision with root package name */
    private int f28943k;

    public Q(ReactContext reactContext) {
        super(reactContext);
    }

    void C(Canvas canvas, Paint paint, float f10, float f11, float f12) {
        if (this.f28942j != null) {
            float f13 = this.f28938f;
            float f14 = this.mScale;
            float f15 = this.f28939g;
            canvas.concat(o0.a(new RectF(f13 * f14, f15 * f14, (f13 + this.f28940h) * f14, (f15 + this.f28941i) * f14), new RectF(0.0f, 0.0f, f11, f12), this.f28942j, this.f28943k));
            super.draw(canvas, paint, f10);
        }
    }

    @Override // com.horcrux.svg.C2923z, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        saveDefinition();
    }

    public void setAlign(String str) {
        this.f28942j = str;
        invalidate();
    }

    public void setMeetOrSlice(int i10) {
        this.f28943k = i10;
        invalidate();
    }

    public void setMinX(float f10) {
        this.f28938f = f10;
        invalidate();
    }

    public void setMinY(float f10) {
        this.f28939g = f10;
        invalidate();
    }

    public void setVbHeight(float f10) {
        this.f28941i = f10;
        invalidate();
    }

    public void setVbWidth(float f10) {
        this.f28940h = f10;
        invalidate();
    }
}
