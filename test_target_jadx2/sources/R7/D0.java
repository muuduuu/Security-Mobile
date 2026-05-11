package r7;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class D0 extends AbstractC4170o0 {

    /* renamed from: c, reason: collision with root package name */
    private final transient AbstractC4160n0 f39316c;

    /* renamed from: d, reason: collision with root package name */
    private final transient AbstractC4140l0 f39317d;

    D0(AbstractC4160n0 abstractC4160n0, AbstractC4140l0 abstractC4140l0) {
        this.f39316c = abstractC4160n0;
        this.f39317d = abstractC4140l0;
    }

    @Override // r7.AbstractC4090g0
    final int c(Object[] objArr, int i10) {
        return this.f39317d.c(objArr, i10);
    }

    @Override // r7.AbstractC4090g0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f39316c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f39317d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f39316c.size();
    }
}
