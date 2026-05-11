package r7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class E extends AbstractC4219t0 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f39343b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E(K k10, Map map) {
        super(map);
        this.f39343b = k10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        AbstractC4180p0.a(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f40274a.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f40274a.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f40274a.keySet().hashCode();
    }

    @Override // r7.AbstractC4219t0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new D(this, this.f40274a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i10;
        Collection collection = (Collection) this.f40274a.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        K k10 = this.f39343b;
        i10 = k10.f39466d;
        k10.f39466d = i10 - size;
        return size > 0;
    }
}
