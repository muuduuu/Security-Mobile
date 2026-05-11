package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
abstract class i2 implements Collection, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Collection f35154a;

    /* renamed from: b, reason: collision with root package name */
    final Object f35155b;

    i2(Collection collection) {
        if (collection == null) {
            throw new NullPointerException("Collection must not be null.");
        }
        this.f35154a = collection;
        this.f35155b = this;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        boolean add;
        synchronized (this.f35155b) {
            add = c().add(obj);
        }
        return add;
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        boolean addAll;
        synchronized (this.f35155b) {
            addAll = c().addAll(collection);
        }
        return addAll;
    }

    protected Collection c() {
        return this.f35154a;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.f35155b) {
            c().clear();
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        boolean contains;
        synchronized (this.f35155b) {
            contains = c().contains(obj);
        }
        return contains;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        boolean containsAll;
        synchronized (this.f35155b) {
            containsAll = c().containsAll(collection);
        }
        return containsAll;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f35155b) {
            isEmpty = c().isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return c().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        boolean remove;
        synchronized (this.f35155b) {
            remove = c().remove(obj);
        }
        return remove;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        boolean removeAll;
        synchronized (this.f35155b) {
            removeAll = c().removeAll(collection);
        }
        return removeAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean retainAll;
        synchronized (this.f35155b) {
            retainAll = c().retainAll(collection);
        }
        return retainAll;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.f35155b) {
            size = c().size();
        }
        return size;
    }

    public String toString() {
        String obj;
        synchronized (this.f35155b) {
            obj = c().toString();
        }
        return obj;
    }
}
