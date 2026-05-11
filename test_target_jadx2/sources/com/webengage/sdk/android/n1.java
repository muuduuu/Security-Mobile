package com.webengage.sdk.android;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.webengage.sdk.android.j3;

/* loaded from: classes2.dex */
public class n1 implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    private int f30728a;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30729a;

        static {
            int[] iArr = new int[j3.a.values().length];
            f30729a = iArr;
            try {
                iArr[j3.a.PT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30729a[j3.a.PX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30729a[j3.a.PERCENTAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30729a[j3.a.EM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public n1(float f10, j3.a aVar, Float f11) {
        int i10;
        int i11 = a.f30729a[aVar.ordinal()];
        if (i11 == 1 || i11 == 2) {
            i10 = (int) f10;
        } else if ((i11 != 3 && i11 != 4) || f11 == null || f11.floatValue() <= 0.0f) {
            return;
        } else {
            i10 = (int) (f11.floatValue() * f10);
        }
        this.f30728a = i10;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int i14;
        int i15 = fontMetricsInt.descent;
        int i16 = this.f30728a;
        if (i15 > i16) {
            int min = Math.min(i16, i15);
            fontMetricsInt.descent = min;
            fontMetricsInt.bottom = min;
            i14 = 0;
            fontMetricsInt.ascent = 0;
        } else {
            int i17 = fontMetricsInt.ascent;
            int i18 = -i17;
            if (i18 + i15 > i16) {
                fontMetricsInt.bottom = i15;
                int i19 = (-i16) + i15;
                fontMetricsInt.ascent = i19;
                fontMetricsInt.top = i19;
                return;
            }
            int i20 = fontMetricsInt.bottom;
            if (i18 + i20 > i16) {
                fontMetricsInt.top = i17;
                fontMetricsInt.bottom = i17 + i16;
                return;
            }
            int i21 = fontMetricsInt.top;
            if ((-i21) + i20 <= i16) {
                double d10 = (i16 - r6) / 2.0f;
                fontMetricsInt.top = (int) (i21 - Math.ceil(d10));
                int floor = (int) (fontMetricsInt.bottom + Math.floor(d10));
                fontMetricsInt.bottom = floor;
                fontMetricsInt.ascent = fontMetricsInt.top;
                fontMetricsInt.descent = floor;
                return;
            }
            i14 = i20 - i16;
        }
        fontMetricsInt.top = i14;
    }

    public n1(int i10) {
        this.f30728a = i10;
    }
}
