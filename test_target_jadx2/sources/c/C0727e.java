package C;

import C.O;
import M.C0973u;

/* renamed from: C.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0727e extends O.a {

    /* renamed from: a, reason: collision with root package name */
    private final C0973u f681a;

    /* renamed from: b, reason: collision with root package name */
    private final C0973u f682b;

    /* renamed from: c, reason: collision with root package name */
    private final int f683c;

    /* renamed from: d, reason: collision with root package name */
    private final int f684d;

    C0727e(C0973u c0973u, C0973u c0973u2, int i10, int i11) {
        if (c0973u == null) {
            throw new NullPointerException("Null edge");
        }
        this.f681a = c0973u;
        if (c0973u2 == null) {
            throw new NullPointerException("Null postviewEdge");
        }
        this.f682b = c0973u2;
        this.f683c = i10;
        this.f684d = i11;
    }

    @Override // C.O.a
    C0973u a() {
        return this.f681a;
    }

    @Override // C.O.a
    int b() {
        return this.f683c;
    }

    @Override // C.O.a
    int c() {
        return this.f684d;
    }

    @Override // C.O.a
    C0973u d() {
        return this.f682b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O.a)) {
            return false;
        }
        O.a aVar = (O.a) obj;
        return this.f681a.equals(aVar.a()) && this.f682b.equals(aVar.d()) && this.f683c == aVar.b() && this.f684d == aVar.c();
    }

    public int hashCode() {
        return ((((((this.f681a.hashCode() ^ 1000003) * 1000003) ^ this.f682b.hashCode()) * 1000003) ^ this.f683c) * 1000003) ^ this.f684d;
    }

    public String toString() {
        return "In{edge=" + this.f681a + ", postviewEdge=" + this.f682b + ", inputFormat=" + this.f683c + ", outputFormat=" + this.f684d + "}";
    }
}
