package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.RectF;

/* loaded from: classes2.dex */
abstract class o0 {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Matrix a(RectF rectF, RectF rectF2, String str, int i10) {
        double d10;
        double d11;
        double d12 = rectF.left;
        double d13 = rectF.top;
        double width = rectF.width();
        double height = rectF.height();
        double d14 = rectF2.left;
        double d15 = rectF2.top;
        double width2 = rectF2.width();
        double height2 = rectF2.height();
        double d16 = width2 / width;
        double d17 = height2 / height;
        double d18 = d14 - (d12 * d16);
        double d19 = d15 - (d13 * d17);
        if (i10 == 2) {
            d10 = Math.min(d16, d17);
            if (d10 > 1.0d) {
                d18 -= ((width2 / d10) - width) / 2.0d;
                d11 = (height2 / d10) - height;
            } else {
                d18 -= (width2 - (width * d10)) / 2.0d;
                d11 = height2 - (height * d10);
            }
            d19 -= d11 / 2.0d;
            d17 = d10;
        } else {
            if (str.equals("none") || i10 != 0) {
                if (!str.equals("none") && i10 == 1) {
                    d16 = Math.max(d16, d17);
                }
                if (str.contains("xMid")) {
                    d18 += (width2 - (width * d16)) / 2.0d;
                }
                if (str.contains("xMax")) {
                    d18 += width2 - (width * d16);
                }
                if (str.contains("YMid")) {
                    d19 += (height2 - (height * d17)) / 2.0d;
                }
                if (str.contains("YMax")) {
                    d19 += height2 - (height * d17);
                }
                d10 = d16;
            } else {
                d16 = Math.min(d16, d17);
            }
            d17 = d16;
            if (str.contains("xMid")) {
            }
            if (str.contains("xMax")) {
            }
            if (str.contains("YMid")) {
            }
            if (str.contains("YMax")) {
            }
            d10 = d16;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((float) d18, (float) d19);
        matrix.preScale((float) d10, (float) d17);
        return matrix;
    }
}
