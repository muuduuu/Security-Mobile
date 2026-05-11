package t;

/* loaded from: classes.dex */
class i2 implements A.M0 {

    /* renamed from: a, reason: collision with root package name */
    private float f42112a;

    /* renamed from: b, reason: collision with root package name */
    private final float f42113b;

    /* renamed from: c, reason: collision with root package name */
    private final float f42114c;

    /* renamed from: d, reason: collision with root package name */
    private float f42115d;

    i2(float f10, float f11) {
        this.f42113b = f10;
        this.f42114c = f11;
    }

    private float e(float f10) {
        float f11 = this.f42113b;
        float f12 = this.f42114c;
        if (f11 == f12) {
            return 0.0f;
        }
        if (f10 == f11) {
            return 1.0f;
        }
        if (f10 == f12) {
            return 0.0f;
        }
        float f13 = 1.0f / f12;
        return ((1.0f / f10) - f13) / ((1.0f / f11) - f13);
    }

    @Override // A.M0
    public float a() {
        return this.f42113b;
    }

    @Override // A.M0
    public float b() {
        return this.f42114c;
    }

    @Override // A.M0
    public float c() {
        return this.f42112a;
    }

    @Override // A.M0
    public float d() {
        return this.f42115d;
    }

    void f(float f10) {
        if (f10 <= this.f42113b && f10 >= this.f42114c) {
            this.f42112a = f10;
            this.f42115d = e(f10);
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f10 + " is not within valid range [" + this.f42114c + " , " + this.f42113b + "]");
    }
}
