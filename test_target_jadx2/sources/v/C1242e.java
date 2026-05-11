package V;

import V.AbstractC1253p;

/* renamed from: V.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1242e extends AbstractC1253p.b {

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC1258v f10611b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10612c;

    C1242e(AbstractC1258v abstractC1258v, int i10) {
        if (abstractC1258v == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.f10611b = abstractC1258v;
        this.f10612c = i10;
    }

    @Override // V.AbstractC1253p.b
    AbstractC1258v b() {
        return this.f10611b;
    }

    @Override // V.AbstractC1253p.b
    int c() {
        return this.f10612c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1253p.b)) {
            return false;
        }
        AbstractC1253p.b bVar = (AbstractC1253p.b) obj;
        return this.f10611b.equals(bVar.b()) && this.f10612c == bVar.c();
    }

    public int hashCode() {
        return ((this.f10611b.hashCode() ^ 1000003) * 1000003) ^ this.f10612c;
    }

    public String toString() {
        return "RuleStrategy{fallbackQuality=" + this.f10611b + ", fallbackRule=" + this.f10612c + "}";
    }
}
