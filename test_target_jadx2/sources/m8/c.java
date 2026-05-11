package M8;

import java.util.Set;

/* loaded from: classes2.dex */
final class c extends e {

    /* renamed from: a, reason: collision with root package name */
    private final Set f6093a;

    c(Set set) {
        if (set == null) {
            throw new NullPointerException("Null rolloutAssignments");
        }
        this.f6093a = set;
    }

    @Override // M8.e
    public Set b() {
        return this.f6093a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.f6093a.equals(((e) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f6093a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f6093a + "}";
    }
}
