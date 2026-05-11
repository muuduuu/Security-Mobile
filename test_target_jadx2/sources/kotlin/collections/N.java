package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import yc.InterfaceC5191a;

/* loaded from: classes.dex */
class N extends AbstractC3568c {

    /* renamed from: b, reason: collision with root package name */
    private final List f36336b;

    public static final class a implements ListIterator, InterfaceC5191a {

        /* renamed from: a, reason: collision with root package name */
        private final ListIterator f36337a;

        a(int i10) {
            int Q10;
            List list = N.this.f36336b;
            Q10 = v.Q(N.this, i10);
            this.f36337a = list.listIterator(Q10);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f36337a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f36337a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f36337a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            int P10;
            P10 = v.P(N.this, this.f36337a.previousIndex());
            return P10;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f36337a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int P10;
            P10 = v.P(N.this, this.f36337a.nextIndex());
            return P10;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public N(List delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f36336b = delegate;
    }

    @Override // kotlin.collections.AbstractC3566a
    public int c() {
        return this.f36336b.size();
    }

    @Override // kotlin.collections.AbstractC3568c, java.util.List
    public Object get(int i10) {
        int O10;
        List list = this.f36336b;
        O10 = v.O(this, i10);
        return list.get(O10);
    }

    @Override // kotlin.collections.AbstractC3568c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractC3568c, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractC3568c, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }
}
