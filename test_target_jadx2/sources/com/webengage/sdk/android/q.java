package com.webengage.sdk.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;
import com.webengage.sdk.android.j3;

/* loaded from: classes2.dex */
public class q implements LineBackgroundSpan {

    /* renamed from: a, reason: collision with root package name */
    private final int f30767a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30768b;

    /* renamed from: c, reason: collision with root package name */
    private final f3 f30769c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f30770d;

    public q(f3 f3Var, int i10, int i11, boolean z10) {
        this.f30767a = i10;
        this.f30768b = i11;
        this.f30769c = f3Var;
        this.f30770d = z10;
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, int i17) {
        int i18 = 0;
        if (this.f30769c.m() != null) {
            j3 m10 = this.f30769c.m();
            if (m10.c() == j3.a.PX) {
                if (m10.b() > 0) {
                    i18 = m10.b();
                }
            } else if (m10.a() > 0.0f) {
                i18 = (int) (m10.a() * 10.0f);
            }
            i18--;
        }
        int i19 = i18 > 0 ? i10 + i18 : i10;
        int color = paint.getColor();
        float strokeWidth = paint.getStrokeWidth();
        if (this.f30770d && this.f30769c.a() != null) {
            paint.setColor(this.f30769c.a().intValue());
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(i19, i12, i11, i14, paint);
        }
        if (this.f30770d && this.f30769c.b() != null) {
            paint.setColor(this.f30769c.b().intValue());
        }
        int b10 = (this.f30769c.d() == null || this.f30769c.d().c() != j3.a.PX) ? 1 : this.f30769c.d().b();
        paint.setStrokeWidth(b10);
        int i20 = i11 - b10;
        if (i15 <= this.f30767a) {
            float f10 = i12;
            canvas.drawLine(i19, f10, i20, f10, paint);
        }
        if (i16 >= this.f30768b) {
            float f11 = i14;
            canvas.drawLine(i19, f11, i20, f11, paint);
        }
        float f12 = i19;
        float f13 = i12;
        float f14 = i14;
        canvas.drawLine(f12, f13, f12, f14, paint);
        float f15 = i20;
        canvas.drawLine(f15, f13, f15, f14, paint);
        paint.setColor(color);
        paint.setStrokeWidth(strokeWidth);
    }
}
