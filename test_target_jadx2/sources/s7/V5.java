package s7;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class V5 extends Q5 {

    /* renamed from: c, reason: collision with root package name */
    private final transient P5 f41077c;

    /* renamed from: d, reason: collision with root package name */
    private final transient N5 f41078d;

    V5(P5 p52, N5 n52) {
        this.f41077c = p52;
        this.f41078d = n52;
    }

    @Override // s7.M4
    final int c(Object[] objArr, int i10) {
        return this.f41078d.c(objArr, 0);
    }

    @Override // s7.M4, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f41077c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f41078d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41077c.size();
    }
}
