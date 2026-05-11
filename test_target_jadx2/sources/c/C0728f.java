package C;

import C.O;

/* renamed from: C.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0728f extends O.b {

    /* renamed from: a, reason: collision with root package name */
    private final P f687a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.camera.core.n f688b;

    C0728f(P p10, androidx.camera.core.n nVar) {
        if (p10 == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.f687a = p10;
        if (nVar == null) {
            throw new NullPointerException("Null imageProxy");
        }
        this.f688b = nVar;
    }

    @Override // C.O.b
    androidx.camera.core.n a() {
        return this.f688b;
    }

    @Override // C.O.b
    P b() {
        return this.f687a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O.b)) {
            return false;
        }
        O.b bVar = (O.b) obj;
        return this.f687a.equals(bVar.b()) && this.f688b.equals(bVar.a());
    }

    public int hashCode() {
        return ((this.f687a.hashCode() ^ 1000003) * 1000003) ^ this.f688b.hashCode();
    }

    public String toString() {
        return "InputPacket{processingRequest=" + this.f687a + ", imageProxy=" + this.f688b + "}";
    }
}
