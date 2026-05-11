package s7;

import java.util.Set;

/* loaded from: classes2.dex */
public abstract class Q5 extends M4 implements Set {

    /* renamed from: b, reason: collision with root package name */
    private transient N5 f41025b;

    Q5() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC4333b.a(this);
    }

    public final N5 k() {
        N5 n52 = this.f41025b;
        if (n52 != null) {
            return n52;
        }
        N5 m10 = m();
        this.f41025b = m10;
        return m10;
    }

    N5 m() {
        return N5.m(toArray());
    }
}
