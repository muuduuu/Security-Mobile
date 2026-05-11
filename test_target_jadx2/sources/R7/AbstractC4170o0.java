package r7;

import java.util.Set;

/* renamed from: r7.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4170o0 extends AbstractC4090g0 implements Set {

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC4140l0 f40169b;

    AbstractC4170o0() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return H0.b(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return H0.a(this);
    }

    public final AbstractC4140l0 k() {
        AbstractC4140l0 abstractC4140l0 = this.f40169b;
        if (abstractC4140l0 != null) {
            return abstractC4140l0;
        }
        AbstractC4140l0 m10 = m();
        this.f40169b = m10;
        return m10;
    }

    AbstractC4140l0 m() {
        Object[] array = toArray();
        int i10 = AbstractC4140l0.f40113c;
        return AbstractC4140l0.m(array, array.length);
    }
}
