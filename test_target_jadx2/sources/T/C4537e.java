package t;

import t.J1;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4537e extends J1.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f42046a;

    /* renamed from: b, reason: collision with root package name */
    private final int f42047b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f42048c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f42049d;

    C4537e(int i10, int i11, boolean z10, boolean z11) {
        this.f42046a = i10;
        this.f42047b = i11;
        this.f42048c = z10;
        this.f42049d = z11;
    }

    @Override // t.J1.b
    int a() {
        return this.f42046a;
    }

    @Override // t.J1.b
    int b() {
        return this.f42047b;
    }

    @Override // t.J1.b
    boolean c() {
        return this.f42048c;
    }

    @Override // t.J1.b
    boolean d() {
        return this.f42049d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof J1.b)) {
            return false;
        }
        J1.b bVar = (J1.b) obj;
        return this.f42046a == bVar.a() && this.f42047b == bVar.b() && this.f42048c == bVar.c() && this.f42049d == bVar.d();
    }

    public int hashCode() {
        return ((((((this.f42046a ^ 1000003) * 1000003) ^ this.f42047b) * 1000003) ^ (this.f42048c ? 1231 : 1237)) * 1000003) ^ (this.f42049d ? 1231 : 1237);
    }

    public String toString() {
        return "FeatureSettings{cameraMode=" + this.f42046a + ", requiredMaxBitDepth=" + this.f42047b + ", previewStabilizationOn=" + this.f42048c + ", ultraHdrOn=" + this.f42049d + "}";
    }
}
