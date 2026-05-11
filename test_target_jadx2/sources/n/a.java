package N;

/* loaded from: classes.dex */
final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final O.f f6469a;

    /* renamed from: b, reason: collision with root package name */
    private final O.f f6470b;

    a(O.f fVar, O.f fVar2) {
        if (fVar == null) {
            throw new NullPointerException("Null primaryOutConfig");
        }
        this.f6469a = fVar;
        if (fVar2 == null) {
            throw new NullPointerException("Null secondaryOutConfig");
        }
        this.f6470b = fVar2;
    }

    @Override // N.d
    public O.f a() {
        return this.f6469a;
    }

    @Override // N.d
    public O.f b() {
        return this.f6470b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f6469a.equals(dVar.a()) && this.f6470b.equals(dVar.b());
    }

    public int hashCode() {
        return ((this.f6469a.hashCode() ^ 1000003) * 1000003) ^ this.f6470b.hashCode();
    }

    public String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f6469a + ", secondaryOutConfig=" + this.f6470b + "}";
    }
}
