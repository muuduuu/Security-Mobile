package C;

import C.C0731i;

/* renamed from: C.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0723a extends C0731i.b {

    /* renamed from: a, reason: collision with root package name */
    private final M.z f659a;

    /* renamed from: b, reason: collision with root package name */
    private final int f660b;

    C0723a(M.z zVar, int i10) {
        if (zVar == null) {
            throw new NullPointerException("Null packet");
        }
        this.f659a = zVar;
        this.f660b = i10;
    }

    @Override // C.C0731i.b
    int a() {
        return this.f660b;
    }

    @Override // C.C0731i.b
    M.z b() {
        return this.f659a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0731i.b)) {
            return false;
        }
        C0731i.b bVar = (C0731i.b) obj;
        return this.f659a.equals(bVar.b()) && this.f660b == bVar.a();
    }

    public int hashCode() {
        return ((this.f659a.hashCode() ^ 1000003) * 1000003) ^ this.f660b;
    }

    public String toString() {
        return "In{packet=" + this.f659a + ", jpegQuality=" + this.f660b + "}";
    }
}
