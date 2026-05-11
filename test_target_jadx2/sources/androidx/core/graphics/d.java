package androidx.core.graphics;

import android.graphics.Color;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f15911a = new ThreadLocal();

    public static void a(int i10, int i11, int i12, float[] fArr) {
        float f10;
        float abs;
        float f11 = i10 / 255.0f;
        float f12 = i11 / 255.0f;
        float f13 = i12 / 255.0f;
        float max = Math.max(f11, Math.max(f12, f13));
        float min = Math.min(f11, Math.min(f12, f13));
        float f14 = max - min;
        float f15 = (max + min) / 2.0f;
        if (max == min) {
            f10 = 0.0f;
            abs = 0.0f;
        } else {
            f10 = max == f11 ? ((f12 - f13) / f14) % 6.0f : max == f12 ? ((f13 - f11) / f14) + 2.0f : 4.0f + ((f11 - f12) / f14);
            abs = f14 / (1.0f - Math.abs((2.0f * f15) - 1.0f));
        }
        float f16 = (f10 * 60.0f) % 360.0f;
        if (f16 < 0.0f) {
            f16 += 360.0f;
        }
        fArr[0] = m(f16, 0.0f, 360.0f);
        fArr[1] = m(abs, 0.0f, 1.0f);
        fArr[2] = m(f15, 0.0f, 1.0f);
    }

    public static void b(int i10, int i11, int i12, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d10 = i10 / 255.0d;
        double pow = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = i11 / 255.0d;
        double pow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        double d12 = i12 / 255.0d;
        double pow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
        dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
        dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
    }

    public static int c(double d10, double d11, double d12) {
        double d13 = (((3.2406d * d10) + ((-1.5372d) * d11)) + ((-0.4986d) * d12)) / 100.0d;
        double d14 = ((((-0.9689d) * d10) + (1.8758d * d11)) + (0.0415d * d12)) / 100.0d;
        double d15 = (((0.0557d * d10) + ((-0.204d) * d11)) + (1.057d * d12)) / 100.0d;
        return Color.rgb(n((int) Math.round((d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d) * 255.0d), 0, 255), n((int) Math.round((d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d) * 255.0d), 0, 255), n((int) Math.round((d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : d15 * 12.92d) * 255.0d), 0, 255));
    }

    public static int d(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), (int) ((Color.red(i10) * f11) + (Color.red(i11) * f10)), (int) ((Color.green(i10) * f11) + (Color.green(i11) * f10)), (int) ((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    public static double e(int i10, int i11) {
        if (Color.alpha(i11) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i11));
        }
        if (Color.alpha(i10) < 255) {
            i10 = k(i10, i11);
        }
        double f10 = f(i10) + 0.05d;
        double f11 = f(i11) + 0.05d;
        return Math.max(f10, f11) / Math.min(f10, f11);
    }

    public static double f(int i10) {
        double[] o10 = o();
        i(i10, o10);
        return o10[1] / 100.0d;
    }

    public static int g(int i10, int i11, float f10) {
        int i12 = 255;
        if (Color.alpha(i11) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i11));
        }
        double d10 = f10;
        if (e(p(i10, 255), i11) < d10) {
            return -1;
        }
        int i13 = 0;
        for (int i14 = 0; i14 <= 10 && i12 - i13 > 1; i14++) {
            int i15 = (i13 + i12) / 2;
            if (e(p(i10, i15), i11) < d10) {
                i13 = i15;
            } else {
                i12 = i15;
            }
        }
        return i12;
    }

    public static void h(int i10, float[] fArr) {
        a(Color.red(i10), Color.green(i10), Color.blue(i10), fArr);
    }

    public static void i(int i10, double[] dArr) {
        b(Color.red(i10), Color.green(i10), Color.blue(i10), dArr);
    }

    private static int j(int i10, int i11) {
        return 255 - (((255 - i11) * (255 - i10)) / 255);
    }

    public static int k(int i10, int i11) {
        int alpha = Color.alpha(i11);
        int alpha2 = Color.alpha(i10);
        int j10 = j(alpha2, alpha);
        return Color.argb(j10, l(Color.red(i10), alpha2, Color.red(i11), alpha, j10), l(Color.green(i10), alpha2, Color.green(i11), alpha, j10), l(Color.blue(i10), alpha2, Color.blue(i11), alpha, j10));
    }

    private static int l(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        return (((i10 * 255) * i11) + ((i12 * i13) * (255 - i11))) / (i14 * 255);
    }

    private static float m(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : Math.min(f10, f12);
    }

    private static int n(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : Math.min(i10, i12);
    }

    private static double[] o() {
        ThreadLocal threadLocal = f15911a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    public static int p(int i10, int i11) {
        if (i11 < 0 || i11 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i10 & 16777215) | (i11 << 24);
    }
}
