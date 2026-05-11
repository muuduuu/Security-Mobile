package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class w {

    class a extends b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f27930a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f27931b;

        /* renamed from: com.google.common.collect.w$a$a, reason: collision with other inner class name */
        class C0413a extends com.google.common.collect.b {

            /* renamed from: c, reason: collision with root package name */
            final Iterator f27932c;

            /* renamed from: d, reason: collision with root package name */
            final Iterator f27933d;

            C0413a() {
                this.f27932c = a.this.f27930a.iterator();
                this.f27933d = a.this.f27931b.iterator();
            }

            @Override // com.google.common.collect.b
            protected Object a() {
                if (this.f27932c.hasNext()) {
                    return this.f27932c.next();
                }
                while (this.f27933d.hasNext()) {
                    Object next = this.f27933d.next();
                    if (!a.this.f27930a.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f27930a = set;
            this.f27931b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public z iterator() {
            return new C0413a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f27930a.contains(obj) || this.f27931b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f27930a.isEmpty() && this.f27931b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f27930a.size();
            Iterator it = this.f27931b.iterator();
            while (it.hasNext()) {
                if (!this.f27930a.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    public static abstract class b extends AbstractSet {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public abstract z iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        private b() {
        }
    }

    static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static int b(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static b c(Set set, Set set2) {
        g8.h.i(set, "set1");
        g8.h.i(set2, "set2");
        return new a(set, set2);
    }
}
