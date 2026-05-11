package c0;

/* renamed from: c0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1694e extends q0 {

    /* renamed from: e, reason: collision with root package name */
    private final int f19231e;

    /* renamed from: f, reason: collision with root package name */
    private final int f19232f;

    /* renamed from: g, reason: collision with root package name */
    private final int f19233g;

    C1694e(int i10, int i11, int i12) {
        this.f19231e = i10;
        this.f19232f = i11;
        this.f19233g = i12;
    }

    @Override // c0.q0
    public int b() {
        return this.f19233g;
    }

    @Override // c0.q0
    public int c() {
        return this.f19231e;
    }

    @Override // c0.q0
    public int d() {
        return this.f19232f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f19231e == q0Var.c() && this.f19232f == q0Var.d() && this.f19233g == q0Var.b();
    }

    public int hashCode() {
        return ((((this.f19231e ^ 1000003) * 1000003) ^ this.f19232f) * 1000003) ^ this.f19233g;
    }

    public String toString() {
        return "VideoEncoderDataSpace{standard=" + this.f19231e + ", transfer=" + this.f19232f + ", range=" + this.f19233g + "}";
    }
}
