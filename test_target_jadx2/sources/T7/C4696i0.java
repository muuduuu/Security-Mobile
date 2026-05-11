package t7;

import java.util.Iterator;

/* renamed from: t7.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4696i0 extends T {

    /* renamed from: c, reason: collision with root package name */
    private final transient S f42991c;

    /* renamed from: d, reason: collision with root package name */
    private final transient P f42992d;

    C4696i0(S s10, P p10) {
        this.f42991c = s10;
        this.f42992d = p10;
    }

    @Override // t7.K
    final int c(Object[] objArr, int i10) {
        return this.f42992d.c(objArr, 0);
    }

    @Override // t7.K, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f42991c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f42992d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f42991c.size();
    }
}
