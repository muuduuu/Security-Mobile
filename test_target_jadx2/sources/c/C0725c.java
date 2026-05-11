package C;

import C.C0744w;

/* renamed from: C.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0725c extends C0744w.a {

    /* renamed from: a, reason: collision with root package name */
    private final M.z f673a;

    /* renamed from: b, reason: collision with root package name */
    private final int f674b;

    C0725c(M.z zVar, int i10) {
        if (zVar == null) {
            throw new NullPointerException("Null packet");
        }
        this.f673a = zVar;
        this.f674b = i10;
    }

    @Override // C.C0744w.a
    int a() {
        return this.f674b;
    }

    @Override // C.C0744w.a
    M.z b() {
        return this.f673a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0744w.a)) {
            return false;
        }
        C0744w.a aVar = (C0744w.a) obj;
        return this.f673a.equals(aVar.b()) && this.f674b == aVar.a();
    }

    public int hashCode() {
        return ((this.f673a.hashCode() ^ 1000003) * 1000003) ^ this.f674b;
    }

    public String toString() {
        return "In{packet=" + this.f673a + ", jpegQuality=" + this.f674b + "}";
    }
}
