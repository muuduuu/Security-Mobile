package t7;

import java.util.Set;

/* loaded from: classes2.dex */
public abstract class T extends K implements Set {

    /* renamed from: b, reason: collision with root package name */
    private transient P f42715b;

    T() {
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
        return AbstractC4724m0.a(this);
    }

    public final P k() {
        P p10 = this.f42715b;
        if (p10 != null) {
            return p10;
        }
        P m10 = m();
        this.f42715b = m10;
        return m10;
    }

    P m() {
        return P.m(toArray());
    }
}
