package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* renamed from: com.horcrux.svg.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2919v {

    /* renamed from: p, reason: collision with root package name */
    static final C2919v f29064p = new C2919v();

    /* renamed from: a, reason: collision with root package name */
    final double f29065a;

    /* renamed from: b, reason: collision with root package name */
    final String f29066b;

    /* renamed from: c, reason: collision with root package name */
    final c0 f29067c;

    /* renamed from: d, reason: collision with root package name */
    final ReadableMap f29068d;

    /* renamed from: e, reason: collision with root package name */
    e0 f29069e;

    /* renamed from: f, reason: collision with root package name */
    int f29070f;

    /* renamed from: g, reason: collision with root package name */
    final String f29071g;

    /* renamed from: h, reason: collision with root package name */
    final String f29072h;

    /* renamed from: i, reason: collision with root package name */
    final d0 f29073i;

    /* renamed from: j, reason: collision with root package name */
    final f0 f29074j;

    /* renamed from: k, reason: collision with root package name */
    private final g0 f29075k;

    /* renamed from: l, reason: collision with root package name */
    final double f29076l;

    /* renamed from: m, reason: collision with root package name */
    final double f29077m;

    /* renamed from: n, reason: collision with root package name */
    final double f29078n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f29079o;

    /* renamed from: com.horcrux.svg.v$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final e0[] f29080a;

        /* renamed from: b, reason: collision with root package name */
        private static final int[] f29081b;

        static {
            e0 e0Var = e0.w100;
            e0 e0Var2 = e0.w200;
            e0 e0Var3 = e0.w300;
            e0 e0Var4 = e0.Normal;
            e0 e0Var5 = e0.w500;
            e0 e0Var6 = e0.w600;
            e0 e0Var7 = e0.Bold;
            e0 e0Var8 = e0.w800;
            e0 e0Var9 = e0.w900;
            f29080a = new e0[]{e0Var, e0Var, e0Var2, e0Var3, e0Var4, e0Var5, e0Var6, e0Var7, e0Var8, e0Var9, e0Var9};
            f29081b = new int[]{400, 700, 100, 200, 300, 400, 500, 600, 700, 800, 900};
        }

        private static int a(int i10) {
            if (i10 < 350) {
                return 400;
            }
            if (i10 < 550) {
                return 700;
            }
            if (i10 < 900) {
                return 900;
            }
            return i10;
        }

        static int b(e0 e0Var, C2919v c2919v) {
            return e0Var == e0.Bolder ? a(c2919v.f29070f) : e0Var == e0.Lighter ? c(c2919v.f29070f) : f29081b[e0Var.ordinal()];
        }

        private static int c(int i10) {
            if (i10 < 100) {
                return i10;
            }
            if (i10 < 550) {
                return 100;
            }
            return i10 < 750 ? 400 : 700;
        }

        static e0 d(int i10) {
            return f29080a[Math.round(i10 / 100.0f)];
        }
    }

    private C2919v() {
        this.f29068d = null;
        this.f29066b = org.conscrypt.BuildConfig.FLAVOR;
        this.f29067c = c0.normal;
        this.f29069e = e0.Normal;
        this.f29070f = 400;
        this.f29071g = org.conscrypt.BuildConfig.FLAVOR;
        this.f29072h = org.conscrypt.BuildConfig.FLAVOR;
        this.f29073i = d0.normal;
        this.f29074j = f0.start;
        this.f29075k = g0.None;
        this.f29079o = false;
        this.f29076l = 0.0d;
        this.f29065a = 12.0d;
        this.f29077m = 0.0d;
        this.f29078n = 0.0d;
    }

    private void a(C2919v c2919v, double d10) {
        long round = Math.round(d10);
        if (round < 1 || round > 1000) {
            b(c2919v);
            return;
        }
        int i10 = (int) round;
        this.f29070f = i10;
        this.f29069e = a.d(i10);
    }

    private void b(C2919v c2919v) {
        this.f29070f = c2919v.f29070f;
        this.f29069e = c2919v.f29069e;
    }

    private double c(ReadableMap readableMap, String str, double d10, double d11, double d12) {
        return readableMap.getType(str) == ReadableType.Number ? readableMap.getDouble(str) : K.b(readableMap.getString(str), d12, d10, d11);
    }

    C2919v(ReadableMap readableMap, C2919v c2919v, double d10) {
        String str;
        String str2;
        d0 d0Var;
        f0 f0Var;
        g0 g0Var;
        double d11;
        double d12;
        double d13 = c2919v.f29065a;
        if (readableMap.hasKey("fontSize")) {
            this.f29065a = c(readableMap, "fontSize", 1.0d, d13, d13);
        } else {
            this.f29065a = d13;
        }
        if (readableMap.hasKey("fontWeight")) {
            if (readableMap.getType("fontWeight") == ReadableType.Number) {
                a(c2919v, readableMap.getDouble("fontWeight"));
            } else {
                String string = readableMap.getString("fontWeight");
                if (e0.hasEnum(string)) {
                    int b10 = a.b(e0.get(string), c2919v);
                    this.f29070f = b10;
                    this.f29069e = a.d(b10);
                } else if (string != null) {
                    a(c2919v, Double.parseDouble(string));
                } else {
                    b(c2919v);
                }
            }
        } else {
            b(c2919v);
        }
        this.f29068d = readableMap.hasKey("fontData") ? readableMap.getMap("fontData") : c2919v.f29068d;
        this.f29066b = readableMap.hasKey("fontFamily") ? readableMap.getString("fontFamily") : c2919v.f29066b;
        this.f29067c = readableMap.hasKey("fontStyle") ? c0.valueOf(readableMap.getString("fontStyle")) : c2919v.f29067c;
        if (readableMap.hasKey("fontFeatureSettings")) {
            str = readableMap.getString("fontFeatureSettings");
        } else {
            str = c2919v.f29071g;
        }
        this.f29071g = str;
        if (readableMap.hasKey("fontVariationSettings")) {
            str2 = readableMap.getString("fontVariationSettings");
        } else {
            str2 = c2919v.f29072h;
        }
        this.f29072h = str2;
        if (readableMap.hasKey("fontVariantLigatures")) {
            d0Var = d0.valueOf(readableMap.getString("fontVariantLigatures"));
        } else {
            d0Var = c2919v.f29073i;
        }
        this.f29073i = d0Var;
        if (readableMap.hasKey("textAnchor")) {
            f0Var = f0.valueOf(readableMap.getString("textAnchor"));
        } else {
            f0Var = c2919v.f29074j;
        }
        this.f29074j = f0Var;
        if (readableMap.hasKey("textDecoration")) {
            g0Var = g0.getEnum(readableMap.getString("textDecoration"));
        } else {
            g0Var = c2919v.f29075k;
        }
        this.f29075k = g0Var;
        boolean hasKey = readableMap.hasKey("kerning");
        this.f29079o = hasKey || c2919v.f29079o;
        this.f29076l = hasKey ? c(readableMap, "kerning", d10, this.f29065a, 0.0d) : c2919v.f29076l;
        if (readableMap.hasKey("wordSpacing")) {
            d11 = c(readableMap, "wordSpacing", d10, this.f29065a, 0.0d);
        } else {
            d11 = c2919v.f29077m;
        }
        this.f29077m = d11;
        if (readableMap.hasKey("letterSpacing")) {
            d12 = c(readableMap, "letterSpacing", d10, this.f29065a, 0.0d);
        } else {
            d12 = c2919v.f29078n;
        }
        this.f29078n = d12;
    }
}
