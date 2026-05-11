package com.webengage.sdk.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* loaded from: classes2.dex */
public class q1 implements LeadingMarginSpan {

    /* renamed from: b, reason: collision with root package name */
    private static final int f30772b = f1.f30522l;

    /* renamed from: c, reason: collision with root package name */
    private static final int f30773c = f1.f30521k;

    /* renamed from: d, reason: collision with root package name */
    public static final int f30774d = f1.f30523m;

    /* renamed from: a, reason: collision with root package name */
    private final int f30775a;

    public q1() {
        this.f30775a = -1;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        if (((Spanned) charSequence).getSpanStart(this) == i15) {
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            if (this.f30775a != -1) {
                canvas.drawText(this.f30775a + ".", i10 + i11, i13, paint);
            } else {
                canvas.drawText("•", i10 + i11, i13, paint);
            }
            paint.setStyle(style);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return (this.f30775a != -1 ? f30773c : f30772b) + f30774d;
    }

    public q1(int i10) {
        this.f30775a = i10;
    }
}
