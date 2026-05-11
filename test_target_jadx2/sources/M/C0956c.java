package M;

import M.U;
import java.util.List;

/* renamed from: M.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0956c extends U.b {

    /* renamed from: a, reason: collision with root package name */
    private final L f5898a;

    /* renamed from: b, reason: collision with root package name */
    private final List f5899b;

    C0956c(L l10, List list) {
        if (l10 == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.f5898a = l10;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f5899b = list;
    }

    @Override // M.U.b
    public List a() {
        return this.f5899b;
    }

    @Override // M.U.b
    public L b() {
        return this.f5898a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof U.b)) {
            return false;
        }
        U.b bVar = (U.b) obj;
        return this.f5898a.equals(bVar.b()) && this.f5899b.equals(bVar.a());
    }

    public int hashCode() {
        return ((this.f5898a.hashCode() ^ 1000003) * 1000003) ^ this.f5899b.hashCode();
    }

    public String toString() {
        return "In{surfaceEdge=" + this.f5898a + ", outConfigs=" + this.f5899b + "}";
    }
}
