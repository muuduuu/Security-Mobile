package q7;

import java.util.Set;

/* renamed from: q7.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3943q extends AbstractC3936j implements Set {

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC3939m f38818b;

    AbstractC3943q() {
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
        return AbstractC3950y.a(this);
    }

    public final AbstractC3939m k() {
        AbstractC3939m abstractC3939m = this.f38818b;
        if (abstractC3939m != null) {
            return abstractC3939m;
        }
        AbstractC3939m m10 = m();
        this.f38818b = m10;
        return m10;
    }

    AbstractC3939m m() {
        Object[] array = toArray();
        int i10 = AbstractC3939m.f38808c;
        return AbstractC3939m.m(array, array.length);
    }
}
