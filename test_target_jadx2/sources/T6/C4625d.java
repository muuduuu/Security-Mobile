package t6;

import java.util.List;

/* renamed from: t6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4625d extends AbstractC4631j {

    /* renamed from: a, reason: collision with root package name */
    private final List f42366a;

    C4625d(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f42366a = list;
    }

    @Override // t6.AbstractC4631j
    public List c() {
        return this.f42366a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4631j) {
            return this.f42366a.equals(((AbstractC4631j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f42366a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f42366a + "}";
    }
}
