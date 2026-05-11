package Ua;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import lc.t;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f10392a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap f10393b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final HashMap f10394c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private static final Map f10395d;

    static {
        List m10 = CollectionsKt.m('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '#', '$', '%', '*', '+', ',', '-', '.', ':', ';', '=', '?', '@', '[', ']', '^', '_', '{', '|', '}', '~');
        ArrayList arrayList = new ArrayList(CollectionsKt.u(m10, 10));
        int i10 = 0;
        for (Object obj : m10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.t();
            }
            Character ch = (Character) obj;
            ch.charValue();
            arrayList.add(t.a(ch, Integer.valueOf(i10)));
            i10 = i11;
        }
        f10395d = G.r(arrayList);
    }

    private b() {
    }

    private final Bitmap b(int i10, int i11, int i12, int i13, float[][] fArr, boolean z10) {
        int[] iArr = new int[i10 * i11];
        boolean z11 = (z10 && f10393b.containsKey(Integer.valueOf(i10 * i12))) ? false : true;
        double[] h10 = h(z11, i10, i12);
        boolean z12 = (z10 && f10394c.containsKey(Integer.valueOf(i11 * i13))) ? false : true;
        double[] i14 = i(z12, i11, i13);
        int i15 = 0;
        while (i15 < i11) {
            int i16 = 0;
            while (i16 < i10) {
                float f10 = 0.0f;
                float f11 = 0.0f;
                float f12 = 0.0f;
                int i17 = 0;
                while (i17 < i13) {
                    float f13 = f10;
                    float f14 = f11;
                    float f15 = f12;
                    int i18 = 0;
                    while (i18 < i12) {
                        int i19 = i18;
                        int i20 = i17;
                        int i21 = i16;
                        boolean z13 = z12;
                        i15 = i15;
                        float j10 = (float) (j(i14, z13, i20, i13, i15, i11) * j(h10, z11, i19, i12, i21, i10));
                        float[] fArr2 = fArr[(i20 * i12) + i19];
                        f13 += fArr2[0] * j10;
                        f14 += fArr2[1] * j10;
                        f15 += fArr2[2] * j10;
                        i18 = i19 + 1;
                        i17 = i20;
                        i16 = i21;
                        z12 = z13;
                    }
                    i17++;
                    f10 = f13;
                    f11 = f14;
                    f12 = f15;
                }
                int i22 = i16;
                iArr[i22 + (i10 * i15)] = Color.rgb(k(f10), k(f11), k(f12));
                i16 = i22 + 1;
            }
            i15++;
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, i10, i11, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    public static /* synthetic */ Bitmap d(b bVar, String str, int i10, int i11, float f10, boolean z10, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i12 & 16) != 0) {
            z10 = true;
        }
        return bVar.c(str, i10, i11, f11, z10);
    }

    private final int e(String str, int i10, int i11) {
        int i12 = 0;
        while (i10 < i11) {
            Integer num = (Integer) f10395d.get(Character.valueOf(str.charAt(i10)));
            int intValue = num != null ? num.intValue() : -1;
            if (intValue != -1) {
                i12 = (i12 * 83) + intValue;
            }
            i10++;
        }
        return i12;
    }

    private final float[] f(int i10, float f10) {
        return new float[]{l(((i10 / 361) - 9) / 9.0f) * f10, l((((i10 / 19) % 19) - 9) / 9.0f) * f10, l(((i10 % 19) - 9) / 9.0f) * f10};
    }

    private final float[] g(int i10) {
        return new float[]{m(i10 >> 16), m((i10 >> 8) & 255), m(i10 & 255)};
    }

    private final double[] h(boolean z10, int i10, int i11) {
        if (!z10) {
            Object obj = f10393b.get(Integer.valueOf(i10 * i11));
            Intrinsics.d(obj);
            return (double[]) obj;
        }
        int i12 = i10 * i11;
        double[] dArr = new double[i12];
        f10393b.put(Integer.valueOf(i12), dArr);
        return dArr;
    }

    private final double[] i(boolean z10, int i10, int i11) {
        if (z10) {
            int i12 = i10 * i11;
            double[] dArr = new double[i12];
            f10394c.put(Integer.valueOf(i12), dArr);
            return dArr;
        }
        Object obj = f10394c.get(Integer.valueOf(i10 * i11));
        Intrinsics.d(obj);
        Intrinsics.d(obj);
        return (double[]) obj;
    }

    private final double j(double[] dArr, boolean z10, int i10, int i11, int i12, int i13) {
        if (z10) {
            dArr[(i11 * i12) + i10] = Math.cos(((i12 * 3.141592653589793d) * i10) / i13);
        }
        return dArr[i10 + (i11 * i12)];
    }

    private final int k(float f10) {
        float pow;
        float f11;
        float j10 = kotlin.ranges.d.j(f10, 0.0f, 1.0f);
        if (j10 <= 0.0031308f) {
            pow = j10 * 12.92f;
            f11 = 255.0f;
        } else {
            pow = (((float) Math.pow(j10, 0.41666666f)) * 1.055f) - 0.055f;
            f11 = 255;
        }
        return (int) ((pow * f11) + 0.5f);
    }

    private final float l(float f10) {
        return Math.copySign((float) Math.pow(f10, 2.0f), f10);
    }

    private final float m(int i10) {
        float f10 = i10 / 255.0f;
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4f);
    }

    public final void a() {
        f10393b.clear();
        f10394c.clear();
    }

    public final Bitmap c(String str, int i10, int i11, float f10, boolean z10) {
        float[] f11;
        if (str == null || str.length() < 6) {
            return null;
        }
        int e10 = e(str, 0, 1);
        int i12 = (e10 % 9) + 1;
        int i13 = (e10 / 9) + 1;
        if (str.length() != (i12 * 2 * i13) + 4) {
            return null;
        }
        float e11 = (e(str, 1, 2) + 1) / 166.0f;
        int i14 = i12 * i13;
        float[][] fArr = new float[i14][];
        for (int i15 = 0; i15 < i14; i15++) {
            if (i15 == 0) {
                b bVar = f10392a;
                f11 = bVar.g(bVar.e(str, 2, 6));
            } else {
                int i16 = i15 * 2;
                b bVar2 = f10392a;
                f11 = bVar2.f(bVar2.e(str, i16 + 4, i16 + 6), e11 * f10);
            }
            fArr[i15] = f11;
        }
        return b(i10, i11, i12, i13, fArr, z10);
    }
}
