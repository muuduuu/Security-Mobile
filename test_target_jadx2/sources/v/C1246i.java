package V;

import V.C1260x;

/* renamed from: V.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1246i extends C1260x.a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1258v f10636a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10637b;

    C1246i(AbstractC1258v abstractC1258v, int i10) {
        if (abstractC1258v == null) {
            throw new NullPointerException("Null quality");
        }
        this.f10636a = abstractC1258v;
        this.f10637b = i10;
    }

    @Override // V.C1260x.a
    int a() {
        return this.f10637b;
    }

    @Override // V.C1260x.a
    AbstractC1258v b() {
        return this.f10636a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1260x.a)) {
            return false;
        }
        C1260x.a aVar = (C1260x.a) obj;
        return this.f10636a.equals(aVar.b()) && this.f10637b == aVar.a();
    }

    public int hashCode() {
        return ((this.f10636a.hashCode() ^ 1000003) * 1000003) ^ this.f10637b;
    }

    public String toString() {
        return "QualityRatio{quality=" + this.f10636a + ", aspectRatio=" + this.f10637b + "}";
    }
}
