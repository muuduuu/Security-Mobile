package r7;

/* loaded from: classes2.dex */
final class G8 extends I8 {

    /* renamed from: a, reason: collision with root package name */
    private final float f39414a;

    /* renamed from: b, reason: collision with root package name */
    private final float f39415b;

    /* renamed from: c, reason: collision with root package name */
    private final float f39416c;

    /* renamed from: d, reason: collision with root package name */
    private final float f39417d;

    G8(float f10, float f11, float f12, float f13, float f14) {
        this.f39414a = f10;
        this.f39415b = f11;
        this.f39416c = f12;
        this.f39417d = f13;
    }

    @Override // r7.I8
    final float a() {
        return 0.0f;
    }

    @Override // r7.I8
    final float b() {
        return this.f39416c;
    }

    @Override // r7.I8
    final float c() {
        return this.f39414a;
    }

    @Override // r7.I8
    final float d() {
        return this.f39417d;
    }

    @Override // r7.I8
    final float e() {
        return this.f39415b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof I8) {
            I8 i82 = (I8) obj;
            if (Float.floatToIntBits(this.f39414a) == Float.floatToIntBits(i82.c()) && Float.floatToIntBits(this.f39415b) == Float.floatToIntBits(i82.e()) && Float.floatToIntBits(this.f39416c) == Float.floatToIntBits(i82.b()) && Float.floatToIntBits(this.f39417d) == Float.floatToIntBits(i82.d())) {
                int floatToIntBits = Float.floatToIntBits(0.0f);
                i82.a();
                if (floatToIntBits == Float.floatToIntBits(0.0f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Float.floatToIntBits(this.f39414a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f39415b)) * 1000003) ^ Float.floatToIntBits(this.f39416c)) * 1000003) ^ Float.floatToIntBits(this.f39417d)) * 1000003) ^ Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "PredictedArea{xMin=" + this.f39414a + ", yMin=" + this.f39415b + ", xMax=" + this.f39416c + ", yMax=" + this.f39417d + ", confidenceScore=0.0}";
    }
}
