package H;

/* loaded from: classes.dex */
final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    private final float f3032a;

    /* renamed from: b, reason: collision with root package name */
    private final float f3033b;

    /* renamed from: c, reason: collision with root package name */
    private final float f3034c;

    /* renamed from: d, reason: collision with root package name */
    private final float f3035d;

    b(float f10, float f11, float f12, float f13) {
        this.f3032a = f10;
        this.f3033b = f11;
        this.f3034c = f12;
        this.f3035d = f13;
    }

    @Override // H.g, A.M0
    public float a() {
        return this.f3033b;
    }

    @Override // H.g, A.M0
    public float b() {
        return this.f3034c;
    }

    @Override // H.g, A.M0
    public float c() {
        return this.f3032a;
    }

    @Override // H.g, A.M0
    public float d() {
        return this.f3035d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.floatToIntBits(this.f3032a) == Float.floatToIntBits(gVar.c()) && Float.floatToIntBits(this.f3033b) == Float.floatToIntBits(gVar.a()) && Float.floatToIntBits(this.f3034c) == Float.floatToIntBits(gVar.b()) && Float.floatToIntBits(this.f3035d) == Float.floatToIntBits(gVar.d());
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f3032a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f3033b)) * 1000003) ^ Float.floatToIntBits(this.f3034c)) * 1000003) ^ Float.floatToIntBits(this.f3035d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f3032a + ", maxZoomRatio=" + this.f3033b + ", minZoomRatio=" + this.f3034c + ", linearZoom=" + this.f3035d + "}";
    }
}
