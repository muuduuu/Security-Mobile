package J8;

import java.util.Set;

/* loaded from: classes2.dex */
final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    private final Set f4847a;

    a(Set set) {
        if (set == null) {
            throw new NullPointerException("Null updatedKeys");
        }
        this.f4847a = set;
    }

    @Override // J8.b
    public Set b() {
        return this.f4847a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return this.f4847a.equals(((b) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f4847a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f4847a + "}";
    }
}
