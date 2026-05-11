package N;

import M.L;
import N.r;
import java.util.List;

/* loaded from: classes.dex */
final class b extends r.b {

    /* renamed from: a, reason: collision with root package name */
    private final L f6471a;

    /* renamed from: b, reason: collision with root package name */
    private final L f6472b;

    /* renamed from: c, reason: collision with root package name */
    private final List f6473c;

    b(L l10, L l11, List list) {
        if (l10 == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.f6471a = l10;
        if (l11 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.f6472b = l11;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f6473c = list;
    }

    @Override // N.r.b
    public List a() {
        return this.f6473c;
    }

    @Override // N.r.b
    public L b() {
        return this.f6471a;
    }

    @Override // N.r.b
    public L c() {
        return this.f6472b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r.b)) {
            return false;
        }
        r.b bVar = (r.b) obj;
        return this.f6471a.equals(bVar.b()) && this.f6472b.equals(bVar.c()) && this.f6473c.equals(bVar.a());
    }

    public int hashCode() {
        return ((((this.f6471a.hashCode() ^ 1000003) * 1000003) ^ this.f6472b.hashCode()) * 1000003) ^ this.f6473c.hashCode();
    }

    public String toString() {
        return "In{primarySurfaceEdge=" + this.f6471a + ", secondarySurfaceEdge=" + this.f6472b + ", outConfigs=" + this.f6473c + "}";
    }
}
