package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import yc.InterfaceC5191a;

/* loaded from: classes.dex */
final class M extends AbstractC3570e {

    /* renamed from: a, reason: collision with root package name */
    private final List f36333a;

    public static final class a implements ListIterator, InterfaceC5191a {

        /* renamed from: a, reason: collision with root package name */
        private final ListIterator f36334a;

        a(int i10) {
            int Q10;
            List list = M.this.f36333a;
            Q10 = v.Q(M.this, i10);
            this.f36334a = list.listIterator(Q10);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f36334a.add(obj);
            this.f36334a.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f36334a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f36334a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f36334a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            int P10;
            P10 = v.P(M.this, this.f36334a.previousIndex());
            return P10;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f36334a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int P10;
            P10 = v.P(M.this, this.f36334a.nextIndex());
            return P10;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f36334a.remove();
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f36334a.set(obj);
        }
    }

    public M(List delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f36333a = delegate;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int Q10;
        List list = this.f36333a;
        Q10 = v.Q(this, i10);
        list.add(Q10, obj);
    }

    @Override // kotlin.collections.AbstractC3570e
    public int c() {
        return this.f36333a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f36333a.clear();
    }

    @Override // kotlin.collections.AbstractC3570e
    public Object e(int i10) {
        int O10;
        List list = this.f36333a;
        O10 = v.O(this, i10);
        return list.remove(O10);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        int O10;
        List list = this.f36333a;
        O10 = v.O(this, i10);
        return list.get(O10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        int O10;
        List list = this.f36333a;
        O10 = v.O(this, i10);
        return list.set(O10, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }
}
