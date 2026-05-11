package com.webengage.sdk.android;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;
import com.webengage.sdk.android.j3;

/* loaded from: classes2.dex */
public class e1 implements LineBackgroundSpan {

    /* renamed from: a, reason: collision with root package name */
    private final int f30507a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30508b;

    /* renamed from: c, reason: collision with root package name */
    private final f3 f30509c;

    public e1(f3 f3Var, int i10, int i11) {
        this.f30507a = i10;
        this.f30508b = i11;
        this.f30509c = f3Var;
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, int i17) {
        int i18 = 0;
        if (this.f30509c.m() != null) {
            j3 m10 = this.f30509c.m();
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
        paint.setColor(Color.parseColor("#000000"));
        if (this.f30509c.b() != null) {
            paint.setColor(this.f30509c.b().intValue());
        }
        paint.setStrokeWidth((this.f30509c.d() == null || this.f30509c.d().c() != j3.a.PX) ? 1 : this.f30509c.d().b());
        paint.setStyle(Paint.Style.STROKE);
        float f10 = (i14 + i12) / 2;
        canvas.drawLine(i19, f10, i11 - r5, f10, paint);
        paint.setColor(color);
        paint.setStrokeWidth(strokeWidth);
    }
}
