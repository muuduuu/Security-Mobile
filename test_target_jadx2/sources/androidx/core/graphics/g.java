package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.swmansion.reanimated.BuildConfig;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class g {

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        int f15929a;

        /* renamed from: b, reason: collision with root package name */
        boolean f15930b;

        a() {
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private char f15931a;

        /* renamed from: b, reason: collision with root package name */
        private final float[] f15932b;

        b(char c10, float[] fArr) {
            this.f15931a = c10;
            this.f15932b = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void d(Path path, float[] fArr, char c10, char c11, float[] fArr2) {
            int i10;
            int i11;
            int i12;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            char c12 = c11;
            boolean z10 = false;
            float f18 = fArr[0];
            float f19 = fArr[1];
            float f20 = fArr[2];
            float f21 = fArr[3];
            float f22 = fArr[4];
            float f23 = fArr[5];
            switch (c12) {
                case 'A':
                case 'a':
                    i10 = 7;
                    i11 = i10;
                    break;
                case 'C':
                case 'c':
                    i10 = 6;
                    i11 = i10;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i11 = 1;
                    break;
                case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 76 */:
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i11 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i11 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f22, f23);
                    f18 = f22;
                    f20 = f18;
                    f19 = f23;
                    f21 = f19;
                    i11 = 2;
                    break;
            }
            float f24 = f18;
            float f25 = f19;
            float f26 = f22;
            float f27 = f23;
            int i13 = 0;
            char c13 = c10;
            while (i13 < fArr2.length) {
                if (c12 != 'A') {
                    if (c12 == 'C') {
                        i12 = i13;
                        int i14 = i12 + 2;
                        int i15 = i12 + 3;
                        int i16 = i12 + 4;
                        int i17 = i12 + 5;
                        path.cubicTo(fArr2[i12], fArr2[i12 + 1], fArr2[i14], fArr2[i15], fArr2[i16], fArr2[i17]);
                        f24 = fArr2[i16];
                        float f28 = fArr2[i17];
                        float f29 = fArr2[i14];
                        float f30 = fArr2[i15];
                        f25 = f28;
                        f21 = f30;
                        f20 = f29;
                    } else if (c12 == 'H') {
                        i12 = i13;
                        path.lineTo(fArr2[i12], f25);
                        f24 = fArr2[i12];
                    } else if (c12 == 'Q') {
                        i12 = i13;
                        int i18 = i12 + 1;
                        int i19 = i12 + 2;
                        int i20 = i12 + 3;
                        path.quadTo(fArr2[i12], fArr2[i18], fArr2[i19], fArr2[i20]);
                        float f31 = fArr2[i12];
                        float f32 = fArr2[i18];
                        f24 = fArr2[i19];
                        f25 = fArr2[i20];
                        f20 = f31;
                        f21 = f32;
                    } else if (c12 == 'V') {
                        i12 = i13;
                        path.lineTo(f24, fArr2[i12]);
                        f25 = fArr2[i12];
                    } else if (c12 != 'a') {
                        if (c12 != 'c') {
                            if (c12 == 'h') {
                                path.rLineTo(fArr2[i13], 0.0f);
                                f24 += fArr2[i13];
                            } else if (c12 != 'q') {
                                if (c12 == 'v') {
                                    path.rLineTo(0.0f, fArr2[i13]);
                                    f13 = fArr2[i13];
                                } else if (c12 == 'L') {
                                    int i21 = i13 + 1;
                                    path.lineTo(fArr2[i13], fArr2[i21]);
                                    f24 = fArr2[i13];
                                    f25 = fArr2[i21];
                                } else if (c12 == 'M') {
                                    f24 = fArr2[i13];
                                    f25 = fArr2[i13 + 1];
                                    if (i13 > 0) {
                                        path.lineTo(f24, f25);
                                    } else {
                                        path.moveTo(f24, f25);
                                        i12 = i13;
                                        f27 = f25;
                                        f26 = f24;
                                    }
                                } else if (c12 == 'S') {
                                    if (c13 == 'c' || c13 == 's' || c13 == 'C' || c13 == 'S') {
                                        f24 = (f24 * 2.0f) - f20;
                                        f25 = (f25 * 2.0f) - f21;
                                    }
                                    float f33 = f25;
                                    float f34 = f24;
                                    int i22 = i13 + 1;
                                    int i23 = i13 + 2;
                                    int i24 = i13 + 3;
                                    path.cubicTo(f34, f33, fArr2[i13], fArr2[i22], fArr2[i23], fArr2[i24]);
                                    f10 = fArr2[i13];
                                    f11 = fArr2[i22];
                                    f24 = fArr2[i23];
                                    f25 = fArr2[i24];
                                    f20 = f10;
                                    f21 = f11;
                                } else if (c12 == 'T') {
                                    if (c13 == 'q' || c13 == 't' || c13 == 'Q' || c13 == 'T') {
                                        f24 = (f24 * 2.0f) - f20;
                                        f25 = (f25 * 2.0f) - f21;
                                    }
                                    int i25 = i13 + 1;
                                    path.quadTo(f24, f25, fArr2[i13], fArr2[i25]);
                                    i12 = i13;
                                    f21 = f25;
                                    f20 = f24;
                                    f24 = fArr2[i13];
                                    f25 = fArr2[i25];
                                } else if (c12 == 'l') {
                                    int i26 = i13 + 1;
                                    path.rLineTo(fArr2[i13], fArr2[i26]);
                                    f24 += fArr2[i13];
                                    f13 = fArr2[i26];
                                } else if (c12 == 'm') {
                                    float f35 = fArr2[i13];
                                    f24 += f35;
                                    float f36 = fArr2[i13 + 1];
                                    f25 += f36;
                                    if (i13 > 0) {
                                        path.rLineTo(f35, f36);
                                    } else {
                                        path.rMoveTo(f35, f36);
                                        i12 = i13;
                                        f27 = f25;
                                        f26 = f24;
                                    }
                                } else if (c12 == 's') {
                                    if (c13 == 'c' || c13 == 's' || c13 == 'C' || c13 == 'S') {
                                        float f37 = f24 - f20;
                                        f14 = f25 - f21;
                                        f15 = f37;
                                    } else {
                                        f15 = 0.0f;
                                        f14 = 0.0f;
                                    }
                                    int i27 = i13 + 1;
                                    int i28 = i13 + 2;
                                    int i29 = i13 + 3;
                                    path.rCubicTo(f15, f14, fArr2[i13], fArr2[i27], fArr2[i28], fArr2[i29]);
                                    f10 = fArr2[i13] + f24;
                                    f11 = fArr2[i27] + f25;
                                    f24 += fArr2[i28];
                                    f12 = fArr2[i29];
                                } else if (c12 == 't') {
                                    if (c13 == 'q' || c13 == 't' || c13 == 'Q' || c13 == 'T') {
                                        f16 = f24 - f20;
                                        f17 = f25 - f21;
                                    } else {
                                        f17 = 0.0f;
                                        f16 = 0.0f;
                                    }
                                    int i30 = i13 + 1;
                                    path.rQuadTo(f16, f17, fArr2[i13], fArr2[i30]);
                                    float f38 = f16 + f24;
                                    float f39 = f17 + f25;
                                    f24 += fArr2[i13];
                                    f25 += fArr2[i30];
                                    f21 = f39;
                                    f20 = f38;
                                }
                                f25 += f13;
                            } else {
                                int i31 = i13 + 1;
                                int i32 = i13 + 2;
                                int i33 = i13 + 3;
                                path.rQuadTo(fArr2[i13], fArr2[i31], fArr2[i32], fArr2[i33]);
                                f10 = fArr2[i13] + f24;
                                f11 = fArr2[i31] + f25;
                                f24 += fArr2[i32];
                                f12 = fArr2[i33];
                            }
                            i12 = i13;
                        } else {
                            int i34 = i13 + 2;
                            int i35 = i13 + 3;
                            int i36 = i13 + 4;
                            int i37 = i13 + 5;
                            path.rCubicTo(fArr2[i13], fArr2[i13 + 1], fArr2[i34], fArr2[i35], fArr2[i36], fArr2[i37]);
                            f10 = fArr2[i34] + f24;
                            f11 = fArr2[i35] + f25;
                            f24 += fArr2[i36];
                            f12 = fArr2[i37];
                        }
                        f25 += f12;
                        f20 = f10;
                        f21 = f11;
                        i12 = i13;
                    } else {
                        int i38 = i13 + 5;
                        int i39 = i13 + 6;
                        i12 = i13;
                        f(path, f24, f25, fArr2[i38] + f24, fArr2[i39] + f25, fArr2[i13], fArr2[i13 + 1], fArr2[i13 + 2], fArr2[i13 + 3] != 0.0f, fArr2[i13 + 4] != 0.0f);
                        f24 += fArr2[i38];
                        f25 += fArr2[i39];
                    }
                    i13 = i12 + i11;
                    c13 = c11;
                    c12 = c13;
                    z10 = false;
                } else {
                    i12 = i13;
                    int i40 = i12 + 5;
                    int i41 = i12 + 6;
                    f(path, f24, f25, fArr2[i40], fArr2[i41], fArr2[i12], fArr2[i12 + 1], fArr2[i12 + 2], fArr2[i12 + 3] != 0.0f, fArr2[i12 + 4] != 0.0f);
                    f24 = fArr2[i40];
                    f25 = fArr2[i41];
                }
                f21 = f25;
                f20 = f24;
                i13 = i12 + i11;
                c13 = c11;
                c12 = c13;
                z10 = false;
            }
            fArr[z10 ? 1 : 0] = f24;
            fArr[1] = f25;
            fArr[2] = f20;
            fArr[3] = f21;
            fArr[4] = f26;
            fArr[5] = f27;
        }

        private static void e(Path path, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
            double d19 = d12;
            int ceil = (int) Math.ceil(Math.abs((d18 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d16);
            double sin = Math.sin(d16);
            double cos2 = Math.cos(d17);
            double sin2 = Math.sin(d17);
            double d20 = -d19;
            double d21 = d20 * cos;
            double d22 = d13 * sin;
            double d23 = (d21 * sin2) - (d22 * cos2);
            double d24 = d20 * sin;
            double d25 = d13 * cos;
            double d26 = (sin2 * d24) + (cos2 * d25);
            double d27 = d18 / ceil;
            double d28 = d26;
            double d29 = d23;
            int i10 = 0;
            double d30 = d14;
            double d31 = d15;
            double d32 = d17;
            while (i10 < ceil) {
                double d33 = d32 + d27;
                double sin3 = Math.sin(d33);
                double cos3 = Math.cos(d33);
                double d34 = (d10 + ((d19 * cos) * cos3)) - (d22 * sin3);
                double d35 = d11 + (d19 * sin * cos3) + (d25 * sin3);
                double d36 = (d21 * sin3) - (d22 * cos3);
                double d37 = (sin3 * d24) + (cos3 * d25);
                double d38 = d33 - d32;
                double tan = Math.tan(d38 / 2.0d);
                double sin4 = (Math.sin(d38) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                double d39 = d30 + (d29 * sin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d39, (float) (d31 + (d28 * sin4)), (float) (d34 - (sin4 * d36)), (float) (d35 - (sin4 * d37)), (float) d34, (float) d35);
                i10++;
                d27 = d27;
                sin = sin;
                d30 = d34;
                d24 = d24;
                cos = cos;
                d32 = d33;
                d28 = d37;
                d29 = d36;
                ceil = ceil;
                d31 = d35;
                d19 = d12;
            }
        }

        private static void f(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
            double d10;
            double d11;
            double radians = Math.toRadians(f16);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d12 = f10;
            double d13 = d12 * cos;
            double d14 = f11;
            double d15 = f14;
            double d16 = (d13 + (d14 * sin)) / d15;
            double d17 = ((-f10) * sin) + (d14 * cos);
            double d18 = f15;
            double d19 = d17 / d18;
            double d20 = f13;
            double d21 = ((f12 * cos) + (d20 * sin)) / d15;
            double d22 = (((-f12) * sin) + (d20 * cos)) / d18;
            double d23 = d16 - d21;
            double d24 = d19 - d22;
            double d25 = (d16 + d21) / 2.0d;
            double d26 = (d19 + d22) / 2.0d;
            double d27 = (d23 * d23) + (d24 * d24);
            if (d27 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d28 = (1.0d / d27) - 0.25d;
            if (d28 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d27);
                float sqrt = (float) (Math.sqrt(d27) / 1.99999d);
                f(path, f10, f11, f12, f13, f14 * sqrt, f15 * sqrt, f16, z10, z11);
                return;
            }
            double sqrt2 = Math.sqrt(d28);
            double d29 = d23 * sqrt2;
            double d30 = sqrt2 * d24;
            if (z10 == z11) {
                d10 = d25 - d30;
                d11 = d26 + d29;
            } else {
                d10 = d25 + d30;
                d11 = d26 - d29;
            }
            double atan2 = Math.atan2(d19 - d11, d16 - d10);
            double atan22 = Math.atan2(d22 - d11, d21 - d10) - atan2;
            if (z11 != (atan22 >= 0.0d)) {
                atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d31 = d10 * d15;
            double d32 = d11 * d18;
            e(path, (d31 * cos) - (d32 * sin), (d31 * sin) + (d32 * cos), d15, d18, d12, d14, radians, atan2, atan22);
        }

        public static void g(b[] bVarArr, Path path) {
            g.h(bVarArr, path);
        }
    }

    private static void a(ArrayList arrayList, char c10, float[] fArr) {
        arrayList.add(new b(c10, fArr));
    }

    static float[] b(float[] fArr, int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i10 < 0 || i10 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = i11 - i10;
        int min = Math.min(i12, length - i10);
        float[] fArr2 = new float[i12];
        System.arraycopy(fArr, i10, fArr2, 0, min);
        return fArr2;
    }

    public static b[] c(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 1;
        while (i11 < str.length()) {
            int g10 = g(str, i11);
            String trim = str.substring(i10, g10).trim();
            if (!trim.isEmpty()) {
                a(arrayList, trim.charAt(0), f(trim));
            }
            i10 = g10;
            i11 = g10 + 1;
        }
        if (i11 - i10 == 1 && i10 < str.length()) {
            a(arrayList, str.charAt(i10), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[0]);
    }

    public static Path d(String str) {
        Path path = new Path();
        try {
            b.g(c(str), path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException("Error in parsing " + str, e10);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039 A[LOOP:0: B:2:0x0007->B:14:0x0039, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(String str, int i10, a aVar) {
        aVar.f15930b = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        for (int i11 = i10; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt != ' ') {
                if (charAt != 'E' && charAt != 'e') {
                    switch (charAt) {
                        case HVError.SDK_CLOSE_ERROR /* 44 */:
                            break;
                        case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                            if (i11 != i10 && !z10) {
                                aVar.f15930b = true;
                                break;
                            }
                            z10 = false;
                            break;
                        case '.':
                            if (z11) {
                                aVar.f15930b = true;
                                break;
                            } else {
                                z10 = false;
                                z11 = true;
                                break;
                            }
                        default:
                            z10 = false;
                            break;
                    }
                } else {
                    z10 = true;
                }
                if (!z12) {
                    aVar.f15929a = i11;
                }
            }
            z10 = false;
            z12 = true;
            if (!z12) {
            }
        }
        aVar.f15929a = i11;
    }

    private static float[] f(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i10 = 1;
            int i11 = 0;
            while (i10 < length) {
                e(str, i10, aVar);
                int i12 = aVar.f15929a;
                if (i10 < i12) {
                    fArr[i11] = Float.parseFloat(str.substring(i10, i12));
                    i11++;
                }
                i10 = aVar.f15930b ? i12 : i12 + 1;
            }
            return b(fArr, 0, i11);
        } catch (NumberFormatException e10) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e10);
        }
    }

    private static int g(String str, int i10) {
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i10;
            }
            i10++;
        }
        return i10;
    }

    public static void h(b[] bVarArr, Path path) {
        float[] fArr = new float[6];
        char c10 = 'm';
        for (b bVar : bVarArr) {
            b.d(path, fArr, c10, bVar.f15931a, bVar.f15932b);
            c10 = bVar.f15931a;
        }
    }
}
