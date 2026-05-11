package androidx.core.content.res;

/* loaded from: classes.dex */
final class i {

    /* renamed from: k, reason: collision with root package name */
    static final i f15899k = k(b.f15870c, (float) ((b.h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a, reason: collision with root package name */
    private final float f15900a;

    /* renamed from: b, reason: collision with root package name */
    private final float f15901b;

    /* renamed from: c, reason: collision with root package name */
    private final float f15902c;

    /* renamed from: d, reason: collision with root package name */
    private final float f15903d;

    /* renamed from: e, reason: collision with root package name */
    private final float f15904e;

    /* renamed from: f, reason: collision with root package name */
    private final float f15905f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f15906g;

    /* renamed from: h, reason: collision with root package name */
    private final float f15907h;

    /* renamed from: i, reason: collision with root package name */
    private final float f15908i;

    /* renamed from: j, reason: collision with root package name */
    private final float f15909j;

    private i(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f15905f = f10;
        this.f15900a = f11;
        this.f15901b = f12;
        this.f15902c = f13;
        this.f15903d = f14;
        this.f15904e = f15;
        this.f15906g = fArr;
        this.f15907h = f16;
        this.f15908i = f17;
        this.f15909j = f18;
    }

    static i k(float[] fArr, float f10, float f11, float f12, boolean z10) {
        float[][] fArr2 = b.f15868a;
        float f13 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f14 = fArr3[0] * f13;
        float f15 = fArr[1];
        float f16 = f14 + (fArr3[1] * f15);
        float f17 = fArr[2];
        float f18 = f16 + (fArr3[2] * f17);
        float[] fArr4 = fArr2[1];
        float f19 = (fArr4[0] * f13) + (fArr4[1] * f15) + (fArr4[2] * f17);
        float[] fArr5 = fArr2[2];
        float f20 = (f13 * fArr5[0]) + (f15 * fArr5[1]) + (f17 * fArr5[2]);
        float f21 = (f12 / 10.0f) + 0.8f;
        float d10 = ((double) f21) >= 0.9d ? b.d(0.59f, 0.69f, (f21 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f21 - 0.8f) * 10.0f);
        float exp = z10 ? 1.0f : (1.0f - (((float) Math.exp(((-f10) - 42.0f) / 92.0f)) * 0.2777778f)) * f21;
        double d11 = exp;
        if (d11 > 1.0d) {
            exp = 1.0f;
        } else if (d11 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f18) * exp) + 1.0f) - exp, (((100.0f / f19) * exp) + 1.0f) - exp, (((100.0f / f20) * exp) + 1.0f) - exp};
        float f22 = 1.0f / ((5.0f * f10) + 1.0f);
        float f23 = f22 * f22 * f22 * f22;
        float f24 = 1.0f - f23;
        float cbrt = (f23 * f10) + (0.1f * f24 * f24 * ((float) Math.cbrt(f10 * 5.0d)));
        float h10 = b.h(f11) / fArr[1];
        double d12 = h10;
        float sqrt = ((float) Math.sqrt(d12)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d12, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f18) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f19) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f20) / 100.0d, 0.42d)};
        float f25 = fArr7[0];
        float f26 = (f25 * 400.0f) / (f25 + 27.13f);
        float f27 = fArr7[1];
        float f28 = (f27 * 400.0f) / (f27 + 27.13f);
        float f29 = fArr7[2];
        float[] fArr8 = {f26, f28, (400.0f * f29) / (f29 + 27.13f)};
        return new i(h10, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * pow, pow, pow, d10, f21, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    float a() {
        return this.f15900a;
    }

    float b() {
        return this.f15903d;
    }

    float c() {
        return this.f15907h;
    }

    float d() {
        return this.f15908i;
    }

    float e() {
        return this.f15905f;
    }

    float f() {
        return this.f15901b;
    }

    float g() {
        return this.f15904e;
    }

    float h() {
        return this.f15902c;
    }

    float[] i() {
        return this.f15906g;
    }

    float j() {
        return this.f15909j;
    }
}
