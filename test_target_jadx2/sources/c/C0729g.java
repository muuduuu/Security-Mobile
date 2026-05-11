package C;

import C.Z;

/* renamed from: C.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0729g extends Z.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f690a;

    /* renamed from: b, reason: collision with root package name */
    private final A.X f691b;

    C0729g(int i10, A.X x10) {
        this.f690a = i10;
        if (x10 == null) {
            throw new NullPointerException("Null imageCaptureException");
        }
        this.f691b = x10;
    }

    @Override // C.Z.b
    A.X a() {
        return this.f691b;
    }

    @Override // C.Z.b
    int b() {
        return this.f690a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Z.b)) {
            return false;
        }
        Z.b bVar = (Z.b) obj;
        return this.f690a == bVar.b() && this.f691b.equals(bVar.a());
    }

    public int hashCode() {
        return ((this.f690a ^ 1000003) * 1000003) ^ this.f691b.hashCode();
    }

    public String toString() {
        return "CaptureError{requestId=" + this.f690a + ", imageCaptureException=" + this.f691b + "}";
    }
}
