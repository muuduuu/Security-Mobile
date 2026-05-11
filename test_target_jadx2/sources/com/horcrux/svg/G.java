package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* loaded from: classes2.dex */
abstract class G {

    /* renamed from: a, reason: collision with root package name */
    static float f28876a;

    /* renamed from: b, reason: collision with root package name */
    private static int f28877b;

    /* renamed from: c, reason: collision with root package name */
    private static int f28878c;

    /* renamed from: d, reason: collision with root package name */
    private static String f28879d;

    /* renamed from: e, reason: collision with root package name */
    private static Path f28880e;

    /* renamed from: f, reason: collision with root package name */
    static ArrayList f28881f;

    /* renamed from: g, reason: collision with root package name */
    private static float f28882g;

    /* renamed from: h, reason: collision with root package name */
    private static float f28883h;

    /* renamed from: i, reason: collision with root package name */
    private static float f28884i;

    /* renamed from: j, reason: collision with root package name */
    private static float f28885j;

    /* renamed from: k, reason: collision with root package name */
    private static float f28886k;

    /* renamed from: l, reason: collision with root package name */
    private static float f28887l;

    /* renamed from: m, reason: collision with root package name */
    private static boolean f28888m;

    private static void A(float f10, float f11, float f12, float f13) {
        float f14 = (f28882g * 2.0f) - f28884i;
        float f15 = (f28883h * 2.0f) - f28885j;
        f28884i = f10;
        f28885j = f11;
        e(f14, f15, f10, f11, f12, f13);
    }

    private static void B(float f10, float f11) {
        C(f10 + f28882g, f11 + f28883h);
    }

    private static void C(float f10, float f11) {
        u((f28882g * 2.0f) - f28884i, (f28883h * 2.0f) - f28885j, f10, f11);
    }

    private static void a(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        b(f10, f11, f12, z10, z11, f13 + f28882g, f14 + f28883h);
    }

    private static void b(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        float f15;
        float f16;
        float f17;
        float f18 = f28882g;
        float f19 = f28883h;
        float abs = Math.abs(f11 == 0.0f ? f10 == 0.0f ? f14 - f19 : f10 : f11);
        float abs2 = Math.abs(f10 == 0.0f ? f13 - f18 : f10);
        if (abs2 == 0.0f || abs == 0.0f || (f13 == f18 && f14 == f19)) {
            l(f13, f14);
            return;
        }
        float radians = (float) Math.toRadians(f12);
        double d10 = radians;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        float f20 = f13 - f18;
        float f21 = f14 - f19;
        float f22 = ((cos * f20) / 2.0f) + ((sin * f21) / 2.0f);
        float f23 = -sin;
        float f24 = ((f23 * f20) / 2.0f) + ((cos * f21) / 2.0f);
        float f25 = abs2 * abs2;
        float f26 = f25 * abs * abs;
        float f27 = (f26 - ((f25 * f24) * f24)) - (((abs * abs) * f22) * f22);
        if (f27 < 0.0f) {
            float f28 = 1.0f - (f27 / f26);
            f15 = f23;
            float sqrt = (float) Math.sqrt(f28);
            abs2 *= sqrt;
            abs *= sqrt;
            f16 = f20 / 2.0f;
            f17 = f21 / 2.0f;
        } else {
            f15 = f23;
            float sqrt2 = (float) Math.sqrt(f27 / (r16 + r18));
            if (z10 == z11) {
                sqrt2 = -sqrt2;
            }
            float f29 = (((-sqrt2) * f24) * abs2) / abs;
            float f30 = ((sqrt2 * f22) * abs) / abs2;
            float f31 = ((cos * f29) - (sin * f30)) + (f20 / 2.0f);
            float f32 = (f21 / 2.0f) + (f29 * sin) + (f30 * cos);
            f16 = f31;
            f17 = f32;
        }
        float f33 = cos / abs2;
        float f34 = sin / abs2;
        float f35 = f15 / abs;
        float f36 = cos / abs;
        float f37 = -f16;
        float f38 = -f17;
        float f39 = abs;
        float f40 = abs2;
        float atan2 = (float) Math.atan2((f35 * f37) + (f36 * f38), (f37 * f33) + (f38 * f34));
        float f41 = f20 - f16;
        float f42 = f21 - f17;
        float atan22 = (float) Math.atan2((f35 * f41) + (f36 * f42), (f33 * f41) + (f34 * f42));
        float f43 = f16 + f18;
        float f44 = f17 + f19;
        float f45 = f20 + f18;
        float f46 = f21 + f19;
        w();
        f28884i = f45;
        f28882g = f45;
        f28885j = f46;
        f28883h = f46;
        if (f40 != f39 || radians != 0.0f) {
            c(f43, f44, f40, f39, atan2, atan22, z11, radians);
            return;
        }
        float degrees = (float) Math.toDegrees(atan2);
        float abs3 = Math.abs((degrees - ((float) Math.toDegrees(atan22))) % 360.0f);
        if (!z10 ? abs3 > 180.0f : abs3 < 180.0f) {
            abs3 = 360.0f - abs3;
        }
        if (!z11) {
            abs3 = -abs3;
        }
        float f47 = f28876a;
        f28880e.arcTo(new RectF((f43 - f40) * f47, (f44 - f40) * f47, (f43 + f40) * f47, (f44 + f40) * f47), degrees, abs3);
        f28881f.add(new F(EnumC2904g.kCGPathElementAddCurveToPoint, new J[]{new J(f45, f46)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0067 A[LOOP:0: B:7:0x0065->B:8:0x0067, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, float f16) {
        double d10;
        int ceil;
        int i10;
        float f17 = f14;
        double d11 = f16;
        float cos = (float) Math.cos(d11);
        float sin = (float) Math.sin(d11);
        float f18 = cos * f12;
        float f19 = (-sin) * f13;
        float f20 = sin * f12;
        float f21 = cos * f13;
        float f22 = f15 - f17;
        if (f22 >= 0.0f || !z10) {
            if (f22 > 0.0f && !z10) {
                d10 = f22 - 6.283185307179586d;
            }
            ceil = (int) Math.ceil(Math.abs(v(f22 / 1.5707963267948966d)));
            float f23 = f22 / ceil;
            float tan = (float) (Math.tan(f23 / 4.0f) * 1.3333333333333333d);
            double d12 = f17;
            float cos2 = (float) Math.cos(d12);
            float sin2 = (float) Math.sin(d12);
            i10 = 0;
            while (i10 < ceil) {
                float f24 = cos2 - (tan * sin2);
                float f25 = sin2 + (cos2 * tan);
                float f26 = f17 + f23;
                double d13 = f26;
                float cos3 = (float) Math.cos(d13);
                float sin3 = (float) Math.sin(d13);
                float f27 = (tan * sin3) + cos3;
                float f28 = sin3 - (tan * cos3);
                float f29 = f10 + (f18 * f24) + (f19 * f25);
                float f30 = f11 + (f24 * f20) + (f25 * f21);
                float f31 = f10 + (f18 * f27) + (f19 * f28);
                float f32 = f11 + (f27 * f20) + (f28 * f21);
                float f33 = f10 + (f18 * cos3) + (f19 * sin3);
                float f34 = f11 + (f20 * cos3) + (f21 * sin3);
                Path path = f28880e;
                float f35 = f28876a;
                path.cubicTo(f29 * f35, f30 * f35, f31 * f35, f32 * f35, f33 * f35, f34 * f35);
                f28881f.add(new F(EnumC2904g.kCGPathElementAddCurveToPoint, new J[]{new J(f29, f30), new J(f31, f32), new J(f33, f34)}));
                i10++;
                f17 = f26;
                f21 = f21;
                f23 = f23;
                f20 = f20;
                tan = tan;
                sin2 = sin3;
                cos2 = cos3;
                f18 = f18;
                f19 = f19;
                ceil = ceil;
            }
        }
        d10 = f22 + 6.283185307179586d;
        f22 = (float) d10;
        ceil = (int) Math.ceil(Math.abs(v(f22 / 1.5707963267948966d)));
        float f232 = f22 / ceil;
        float tan2 = (float) (Math.tan(f232 / 4.0f) * 1.3333333333333333d);
        double d122 = f17;
        float cos22 = (float) Math.cos(d122);
        float sin22 = (float) Math.sin(d122);
        i10 = 0;
        while (i10 < ceil) {
        }
    }

    private static void d() {
        if (f28888m) {
            f28882g = f28886k;
            f28883h = f28887l;
            f28888m = false;
            f28880e.close();
            f28881f.add(new F(EnumC2904g.kCGPathElementCloseSubpath, new J[]{new J(f28882g, f28883h)}));
        }
    }

    private static void e(float f10, float f11, float f12, float f13, float f14, float f15) {
        w();
        f28882g = f14;
        f28883h = f15;
        Path path = f28880e;
        float f16 = f28876a;
        path.cubicTo(f10 * f16, f11 * f16, f12 * f16, f13 * f16, f14 * f16, f15 * f16);
        f28881f.add(new F(EnumC2904g.kCGPathElementAddCurveToPoint, new J[]{new J(f10, f11), new J(f12, f13), new J(f14, f15)}));
    }

    private static void f(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f28882g;
        float f17 = f28883h;
        g(f10 + f16, f11 + f17, f12 + f16, f13 + f17, f14 + f16, f15 + f17);
    }

    private static void g(float f10, float f11, float f12, float f13, float f14, float f15) {
        f28884i = f12;
        f28885j = f13;
        e(f10, f11, f12, f13, f14, f15);
    }

    private static boolean h(char c10) {
        return Character.isUpperCase(c10);
    }

    private static boolean i(char c10) {
        switch (c10) {
            case 'A':
            case 'C':
            case 'H':
            case com.swmansion.reanimated.BuildConfig.REACT_NATIVE_MINOR_VERSION /* 76 */:
            case 'M':
            case 'Q':
            case 'S':
            case 'T':
            case 'V':
            case 'Z':
            case 'a':
            case 'c':
            case 'h':
            case 'l':
            case 'm':
            case 'q':
            case 's':
            case 't':
            case 'v':
            case 'z':
                return true;
            default:
                return false;
        }
    }

    private static boolean j(char c10) {
        return (c10 >= '0' && c10 <= '9') || c10 == '.' || c10 == '-' || c10 == '+';
    }

    private static void k(float f10, float f11) {
        l(f10 + f28882g, f11 + f28883h);
    }

    private static void l(float f10, float f11) {
        w();
        f28882g = f10;
        f28884i = f10;
        f28883h = f11;
        f28885j = f11;
        Path path = f28880e;
        float f12 = f28876a;
        path.lineTo(f10 * f12, f12 * f11);
        f28881f.add(new F(EnumC2904g.kCGPathElementAddLineToPoint, new J[]{new J(f10, f11)}));
    }

    private static void m(float f10, float f11) {
        n(f10 + f28882g, f11 + f28883h);
    }

    private static void n(float f10, float f11) {
        f28882g = f10;
        f28884i = f10;
        f28886k = f10;
        f28883h = f11;
        f28885j = f11;
        f28887l = f11;
        Path path = f28880e;
        float f12 = f28876a;
        path.moveTo(f10 * f12, f12 * f11);
        f28881f.add(new F(EnumC2904g.kCGPathElementMoveToPoint, new J[]{new J(f10, f11)}));
    }

    static Path o(String str) {
        f28881f = new ArrayList();
        Path path = new Path();
        f28880e = path;
        if (str == null) {
            return path;
        }
        f28878c = str.length();
        f28879d = str;
        f28877b = 0;
        f28882g = 0.0f;
        f28883h = 0.0f;
        f28884i = 0.0f;
        f28885j = 0.0f;
        f28886k = 0.0f;
        f28887l = 0.0f;
        f28888m = false;
        char c10 = ' ';
        while (f28877b < f28878c) {
            y();
            int i10 = f28877b;
            if (i10 >= f28878c) {
                return f28880e;
            }
            boolean z10 = true;
            boolean z11 = c10 != ' ';
            char charAt = f28879d.charAt(i10);
            if (!z11 && charAt != 'M' && charAt != 'm') {
                throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", Character.valueOf(charAt), Integer.valueOf(f28877b), f28879d));
            }
            if (i(charAt)) {
                f28877b++;
                z10 = false;
                c10 = charAt;
            } else {
                if (!j(charAt) || !z11) {
                    throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", Character.valueOf(charAt), Integer.valueOf(f28877b), f28879d));
                }
                if (c10 == 'Z' || c10 == 'z') {
                    throw new IllegalArgumentException(String.format("Unexpected number after 'z' (s=%s)", f28879d));
                }
                if (c10 == 'M' || c10 == 'm') {
                    c10 = h(c10) ? 'L' : 'l';
                } else {
                    z10 = false;
                }
            }
            boolean h10 = h(c10);
            switch (c10) {
                case 'A':
                    b(q(), q(), q(), p(), p(), q(), q());
                    break;
                case 'C':
                    g(q(), q(), q(), q(), q(), q());
                    break;
                case 'H':
                    l(q(), f28883h);
                    break;
                case com.swmansion.reanimated.BuildConfig.REACT_NATIVE_MINOR_VERSION /* 76 */:
                    l(q(), q());
                    break;
                case 'M':
                    n(q(), q());
                    break;
                case 'Q':
                    u(q(), q(), q(), q());
                    break;
                case 'S':
                    A(q(), q(), q(), q());
                    break;
                case 'T':
                    C(q(), q());
                    break;
                case 'V':
                    l(f28882g, q());
                    break;
                case 'Z':
                case 'z':
                    d();
                    break;
                case 'a':
                    a(q(), q(), q(), p(), p(), q(), q());
                    break;
                case 'c':
                    f(q(), q(), q(), q(), q(), q());
                    break;
                case 'h':
                    k(q(), 0.0f);
                    break;
                case 'l':
                    k(q(), q());
                    break;
                case 'm':
                    m(q(), q());
                    break;
                case 'q':
                    t(q(), q(), q(), q());
                    break;
                case 's':
                    z(q(), q(), q(), q());
                    break;
                case 't':
                    B(q(), q());
                    break;
                case 'v':
                    k(0.0f, q());
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Unexpected comand '%c' (s=%s)", Character.valueOf(c10), f28879d));
            }
            if (z10) {
                c10 = h10 ? 'M' : 'm';
            }
        }
        return f28880e;
    }

    private static boolean p() {
        y();
        char charAt = f28879d.charAt(f28877b);
        if (charAt != '0' && charAt != '1') {
            throw new Error(String.format("Unexpected flag '%c' (i=%d, s=%s)", Character.valueOf(charAt), Integer.valueOf(f28877b), f28879d));
        }
        int i10 = f28877b + 1;
        f28877b = i10;
        if (i10 < f28878c && f28879d.charAt(i10) == ',') {
            f28877b++;
        }
        y();
        return charAt == '1';
    }

    private static float q() {
        if (f28877b == f28878c) {
            throw new Error(String.format("Unexpected end (s=%s)", f28879d));
        }
        float s10 = s();
        y();
        r();
        return s10;
    }

    private static void r() {
        int i10 = f28877b;
        if (i10 >= f28878c || f28879d.charAt(i10) != ',') {
            return;
        }
        f28877b++;
    }

    private static float s() {
        char charAt;
        y();
        int i10 = f28877b;
        if (i10 == f28878c) {
            throw new Error(String.format("Unexpected end (s=%s)", f28879d));
        }
        char charAt2 = f28879d.charAt(i10);
        if (charAt2 == '-' || charAt2 == '+') {
            int i11 = f28877b + 1;
            f28877b = i11;
            charAt2 = f28879d.charAt(i11);
        }
        if (charAt2 >= '0' && charAt2 <= '9') {
            x();
            int i12 = f28877b;
            if (i12 < f28878c) {
                charAt2 = f28879d.charAt(i12);
            }
        } else if (charAt2 != '.') {
            throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(charAt2), Integer.valueOf(f28877b), f28879d));
        }
        if (charAt2 == '.') {
            f28877b++;
            x();
            int i13 = f28877b;
            if (i13 < f28878c) {
                charAt2 = f28879d.charAt(i13);
            }
        }
        if (charAt2 == 'e' || charAt2 == 'E') {
            int i14 = f28877b;
            if (i14 + 1 < f28878c && (charAt = f28879d.charAt(i14 + 1)) != 'm' && charAt != 'x') {
                int i15 = f28877b + 1;
                f28877b = i15;
                char charAt3 = f28879d.charAt(i15);
                if (charAt3 == '+' || charAt3 == '-') {
                    f28877b++;
                    x();
                } else {
                    if (charAt3 < '0' || charAt3 > '9') {
                        throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(charAt3), Integer.valueOf(f28877b), f28879d));
                    }
                    x();
                }
            }
        }
        String substring = f28879d.substring(i10, f28877b);
        float parseFloat = Float.parseFloat(substring);
        if (Float.isInfinite(parseFloat) || Float.isNaN(parseFloat)) {
            throw new IllegalArgumentException(String.format("Invalid number '%s' (start=%d, i=%d, s=%s)", substring, Integer.valueOf(i10), Integer.valueOf(f28877b), f28879d));
        }
        return parseFloat;
    }

    private static void t(float f10, float f11, float f12, float f13) {
        float f14 = f28882g;
        float f15 = f28883h;
        u(f10 + f14, f11 + f15, f12 + f14, f13 + f15);
    }

    private static void u(float f10, float f11, float f12, float f13) {
        f28884i = f10;
        f28885j = f11;
        float f14 = f10 * 2.0f;
        float f15 = f11 * 2.0f;
        e((f28882g + f14) / 3.0f, (f28883h + f15) / 3.0f, (f12 + f14) / 3.0f, (f13 + f15) / 3.0f, f12, f13);
    }

    private static double v(double d10) {
        return Math.round(d10 * r0) / Math.pow(10.0d, 4.0d);
    }

    private static void w() {
        if (f28888m) {
            return;
        }
        f28886k = f28882g;
        f28887l = f28883h;
        f28888m = true;
    }

    private static void x() {
        while (true) {
            int i10 = f28877b;
            if (i10 >= f28878c || !Character.isDigit(f28879d.charAt(i10))) {
                return;
            } else {
                f28877b++;
            }
        }
    }

    private static void y() {
        while (true) {
            int i10 = f28877b;
            if (i10 >= f28878c || !Character.isWhitespace(f28879d.charAt(i10))) {
                return;
            } else {
                f28877b++;
            }
        }
    }

    private static void z(float f10, float f11, float f12, float f13) {
        float f14 = f28882g;
        float f15 = f28883h;
        A(f10 + f14, f11 + f15, f12 + f14, f13 + f15);
    }
}
