package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* loaded from: classes2.dex */
final class c extends h {

    /* renamed from: c, reason: collision with root package name */
    private int f27324c;

    /* renamed from: d, reason: collision with root package name */
    private float f27325d;

    /* renamed from: e, reason: collision with root package name */
    private float f27326e;

    /* renamed from: f, reason: collision with root package name */
    private float f27327f;

    public c(e eVar) {
        super(eVar);
        this.f27324c = 1;
    }

    private void h(Canvas canvas, Paint paint, float f10, float f11, float f12) {
        canvas.save();
        canvas.rotate(f12);
        float f13 = this.f27327f;
        float f14 = f10 / 2.0f;
        canvas.drawRoundRect(new RectF(f13 - f14, f11, f13 + f14, -f11), f11, f11, paint);
        canvas.restore();
    }

    private int i() {
        b bVar = this.f27369a;
        return ((e) bVar).f27343g + (((e) bVar).f27344h * 2);
    }

    @Override // com.google.android.material.progressindicator.h
    public void a(Canvas canvas, float f10) {
        b bVar = this.f27369a;
        float f11 = (((e) bVar).f27343g / 2.0f) + ((e) bVar).f27344h;
        canvas.translate(f11, f11);
        canvas.rotate(-90.0f);
        float f12 = -f11;
        canvas.clipRect(f12, f12, f11, f11);
        this.f27324c = ((e) this.f27369a).f27345i == 0 ? 1 : -1;
        this.f27325d = ((e) r5).f27318a * f10;
        this.f27326e = ((e) r5).f27319b * f10;
        this.f27327f = (((e) r5).f27343g - ((e) r5).f27318a) / 2.0f;
        if ((this.f27370b.j() && ((e) this.f27369a).f27322e == 2) || (this.f27370b.i() && ((e) this.f27369a).f27323f == 1)) {
            this.f27327f += ((1.0f - f10) * ((e) this.f27369a).f27318a) / 2.0f;
        } else if ((this.f27370b.j() && ((e) this.f27369a).f27322e == 1) || (this.f27370b.i() && ((e) this.f27369a).f27323f == 2)) {
            this.f27327f -= ((1.0f - f10) * ((e) this.f27369a).f27318a) / 2.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.h
    void b(Canvas canvas, Paint paint, float f10, float f11, int i10) {
        if (f10 == f11) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i10);
        paint.setStrokeWidth(this.f27325d);
        int i11 = this.f27324c;
        float f12 = f10 * 360.0f * i11;
        float f13 = (f11 >= f10 ? f11 - f10 : (1.0f + f11) - f10) * 360.0f * i11;
        float f14 = this.f27327f;
        canvas.drawArc(new RectF(-f14, -f14, f14, f14), f12, f13, false, paint);
        if (this.f27326e <= 0.0f || Math.abs(f13) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        h(canvas, paint, this.f27325d, this.f27326e, f12);
        h(canvas, paint, this.f27325d, this.f27326e, f12 + f13);
    }

    @Override // com.google.android.material.progressindicator.h
    void c(Canvas canvas, Paint paint) {
        int a10 = M7.a.a(((e) this.f27369a).f27321d, this.f27370b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(a10);
        paint.setStrokeWidth(this.f27325d);
        float f10 = this.f27327f;
        canvas.drawArc(new RectF(-f10, -f10, f10, f10), 0.0f, 360.0f, false, paint);
    }

    @Override // com.google.android.material.progressindicator.h
    public int d() {
        return i();
    }

    @Override // com.google.android.material.progressindicator.h
    public int e() {
        return i();
    }
}
