package r7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
abstract class H extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final Object f39418a;

    /* renamed from: b, reason: collision with root package name */
    Collection f39419b;

    /* renamed from: c, reason: collision with root package name */
    final H f39420c;

    /* renamed from: d, reason: collision with root package name */
    final Collection f39421d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ K f39422e;

    H(K k10, Object obj, Collection collection, H h10) {
        this.f39422e = k10;
        this.f39418a = obj;
        this.f39419b = collection;
        this.f39420c = h10;
        this.f39421d = h10 == null ? null : h10.f39419b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        int i10;
        zzb();
        boolean isEmpty = this.f39419b.isEmpty();
        boolean add = this.f39419b.add(obj);
        if (add) {
            K k10 = this.f39422e;
            i10 = k10.f39466d;
            k10.f39466d = i10 + 1;
            if (isEmpty) {
                c();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i10;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f39419b.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f39419b.size();
        K k10 = this.f39422e;
        i10 = k10.f39466d;
        k10.f39466d = i10 + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        c();
        return true;
    }

    final void c() {
        Map map;
        H h10 = this.f39420c;
        if (h10 != null) {
            h10.c();
        } else {
            map = this.f39422e.f39465c;
            map.put(this.f39418a, this.f39419b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i10;
        int size = size();
        if (size == 0) {
            return;
        }
        this.f39419b.clear();
        K k10 = this.f39422e;
        i10 = k10.f39466d;
        k10.f39466d = i10 - size;
        e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f39419b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f39419b.containsAll(collection);
    }

    final void e() {
        Map map;
        H h10 = this.f39420c;
        if (h10 != null) {
            h10.e();
        } else if (this.f39419b.isEmpty()) {
            map = this.f39422e.f39465c;
            map.remove(this.f39418a);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f39419b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f39419b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new G(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i10;
        zzb();
        boolean remove = this.f39419b.remove(obj);
        if (remove) {
            K k10 = this.f39422e;
            i10 = k10.f39466d;
            k10.f39466d = i10 - 1;
            e();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i10;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f39419b.removeAll(collection);
        if (removeAll) {
            int size2 = this.f39419b.size();
            K k10 = this.f39422e;
            i10 = k10.f39466d;
            k10.f39466d = i10 + (size2 - size);
            e();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i10;
        collection.getClass();
        int size = size();
        boolean retainAll = this.f39419b.retainAll(collection);
        if (retainAll) {
            int size2 = this.f39419b.size();
            K k10 = this.f39422e;
            i10 = k10.f39466d;
            k10.f39466d = i10 + (size2 - size);
            e();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f39419b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f39419b.toString();
    }

    final void zzb() {
        Map map;
        H h10 = this.f39420c;
        if (h10 != null) {
            h10.zzb();
            if (this.f39420c.f39419b != this.f39421d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f39419b.isEmpty()) {
            map = this.f39422e.f39465c;
            Collection collection = (Collection) map.get(this.f39418a);
            if (collection != null) {
                this.f39419b = collection;
            }
        }
    }
}
