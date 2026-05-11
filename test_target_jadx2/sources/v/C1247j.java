package V;

import V.AbstractC1258v;
import java.util.List;

/* renamed from: V.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1247j extends AbstractC1258v.b {

    /* renamed from: j, reason: collision with root package name */
    private final int f10640j;

    /* renamed from: k, reason: collision with root package name */
    private final String f10641k;

    /* renamed from: l, reason: collision with root package name */
    private final List f10642l;

    C1247j(int i10, String str, List list) {
        this.f10640j = i10;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f10641k = str;
        if (list == null) {
            throw new NullPointerException("Null typicalSizes");
        }
        this.f10642l = list;
    }

    @Override // V.AbstractC1258v.b
    public String c() {
        return this.f10641k;
    }

    @Override // V.AbstractC1258v.b
    public List d() {
        return this.f10642l;
    }

    @Override // V.AbstractC1258v.b
    public int e() {
        return this.f10640j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1258v.b)) {
            return false;
        }
        AbstractC1258v.b bVar = (AbstractC1258v.b) obj;
        return this.f10640j == bVar.e() && this.f10641k.equals(bVar.c()) && this.f10642l.equals(bVar.d());
    }

    public int hashCode() {
        return ((((this.f10640j ^ 1000003) * 1000003) ^ this.f10641k.hashCode()) * 1000003) ^ this.f10642l.hashCode();
    }

    public String toString() {
        return "ConstantQuality{value=" + this.f10640j + ", name=" + this.f10641k + ", typicalSizes=" + this.f10642l + "}";
    }
}
