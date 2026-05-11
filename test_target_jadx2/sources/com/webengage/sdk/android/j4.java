package com.webengage.sdk.android;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes2.dex */
public class j4 implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    private final Float f30676a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f30677b;

    public j4(Float f10) {
        this.f30676a = f10;
        this.f30677b = null;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int abs = Math.abs(fontMetricsInt.descent - fontMetricsInt.ascent);
        Float f10 = this.f30676a;
        if (f10 != null) {
            abs = (int) (abs * f10.floatValue());
        } else {
            Integer num = this.f30677b;
            if (num != null) {
                abs = num.intValue();
            }
        }
        fontMetricsInt.descent = fontMetricsInt.ascent + abs;
    }

    public j4(Integer num) {
        this.f30677b = num;
        this.f30676a = null;
    }
}
