package t7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: t7.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4730n extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final Object f43078a;

    /* renamed from: b, reason: collision with root package name */
    Collection f43079b;

    /* renamed from: c, reason: collision with root package name */
    final AbstractC4730n f43080c;

    /* renamed from: d, reason: collision with root package name */
    final Collection f43081d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC4751q f43082e;

    AbstractC4730n(AbstractC4751q abstractC4751q, Object obj, Collection collection, AbstractC4730n abstractC4730n) {
        this.f43082e = abstractC4751q;
        this.f43078a = obj;
        this.f43079b = collection;
        this.f43080c = abstractC4730n;
        this.f43081d = abstractC4730n == null ? null : abstractC4730n.f43079b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.f43079b.isEmpty();
        boolean add = this.f43079b.add(obj);
        if (!add) {
            return add;
        }
        AbstractC4751q.h(this.f43082e);
        if (!isEmpty) {
            return add;
        }
        c();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f43079b.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        AbstractC4751q.j(this.f43082e, this.f43079b.size() - size);
        if (size != 0) {
            return addAll;
        }
        c();
        return true;
    }

    final void c() {
        Map map;
        AbstractC4730n abstractC4730n = this.f43080c;
        if (abstractC4730n != null) {
            abstractC4730n.c();
        } else {
            map = this.f43082e.f43196c;
            map.put(this.f43078a, this.f43079b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f43079b.clear();
        AbstractC4751q.l(this.f43082e, size);
        e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f43079b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f43079b.containsAll(collection);
    }

    final void e() {
        Map map;
        AbstractC4730n abstractC4730n = this.f43080c;
        if (abstractC4730n != null) {
            abstractC4730n.e();
        } else if (this.f43079b.isEmpty()) {
            map = this.f43082e.f43196c;
            map.remove(this.f43078a);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f43079b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f43079b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new C4723m(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean remove = this.f43079b.remove(obj);
        if (remove) {
            AbstractC4751q.i(this.f43082e);
            e();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f43079b.removeAll(collection);
        if (removeAll) {
            AbstractC4751q.j(this.f43082e, this.f43079b.size() - size);
            e();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f43079b.retainAll(collection);
        if (retainAll) {
            AbstractC4751q.j(this.f43082e, this.f43079b.size() - size);
            e();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f43079b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f43079b.toString();
    }

    final void zzb() {
        Map map;
        AbstractC4730n abstractC4730n = this.f43080c;
        if (abstractC4730n != null) {
            abstractC4730n.zzb();
            if (this.f43080c.f43079b != this.f43081d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f43079b.isEmpty()) {
            map = this.f43082e.f43196c;
            Collection collection = (Collection) map.get(this.f43078a);
            if (collection != null) {
                this.f43079b = collection;
            }
        }
    }
}
