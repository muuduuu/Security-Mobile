package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class w extends AbstractList implements RandomAccess, n {

    /* renamed from: a, reason: collision with root package name */
    private final n f36565a;

    class a implements ListIterator {

        /* renamed from: a, reason: collision with root package name */
        ListIterator f36566a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f36567b;

        a(int i10) {
            this.f36567b = i10;
            this.f36566a = w.this.f36565a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f36566a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f36566a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f36566a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f36566a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f36566a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f36566a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        Iterator f36569a;

        b() {
            this.f36569a = w.this.f36565a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f36569a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36569a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public w(n nVar) {
        this.f36565a = nVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public n K() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public void U1(d dVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f36565a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public List o() {
        return this.f36565a.o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f36565a.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public d y1(int i10) {
        return this.f36565a.y1(i10);
    }
}
