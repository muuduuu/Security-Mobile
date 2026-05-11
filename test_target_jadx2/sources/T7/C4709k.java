package t7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: t7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4709k extends Y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC4751q f43026b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4709k(AbstractC4751q abstractC4751q, Map map) {
        super(map);
        this.f43026b = abstractC4751q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        U.a(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f42770a.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f42770a.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f42770a.keySet().hashCode();
    }

    @Override // t7.Y, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C4702j(this, this.f42770a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f42770a.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        AbstractC4751q.l(this.f43026b, size);
        return size > 0;
    }
}
