package C;

import A.W;
import C.A;

/* renamed from: C.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0726d extends A.a {

    /* renamed from: a, reason: collision with root package name */
    private final M.z f677a;

    /* renamed from: b, reason: collision with root package name */
    private final W.g f678b;

    C0726d(M.z zVar, W.g gVar) {
        if (zVar == null) {
            throw new NullPointerException("Null packet");
        }
        this.f677a = zVar;
        if (gVar == null) {
            throw new NullPointerException("Null outputFileOptions");
        }
        this.f678b = gVar;
    }

    @Override // C.A.a
    W.g a() {
        return this.f678b;
    }

    @Override // C.A.a
    M.z b() {
        return this.f677a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof A.a)) {
            return false;
        }
        A.a aVar = (A.a) obj;
        return this.f677a.equals(aVar.b()) && this.f678b.equals(aVar.a());
    }

    public int hashCode() {
        return ((this.f677a.hashCode() ^ 1000003) * 1000003) ^ this.f678b.hashCode();
    }

    public String toString() {
        return "In{packet=" + this.f677a + ", outputFileOptions=" + this.f678b + "}";
    }
}
