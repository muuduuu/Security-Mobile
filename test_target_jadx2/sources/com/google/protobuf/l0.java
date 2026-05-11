package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class l0 extends AbstractList implements C, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final C f28767a;

    class a implements ListIterator {

        /* renamed from: a, reason: collision with root package name */
        ListIterator f28768a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f28769b;

        a(int i10) {
            this.f28769b = i10;
            this.f28768a = l0.this.f28767a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f28768a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f28768a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f28768a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f28768a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f28768a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f28768a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        Iterator f28771a;

        b() {
            this.f28771a = l0.this.f28767a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f28771a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f28771a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public l0(C c10) {
        this.f28767a = c10;
    }

    @Override // com.google.protobuf.C
    public C K() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f28767a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }

    @Override // com.google.protobuf.C
    public List o() {
        return this.f28767a.o();
    }

    @Override // com.google.protobuf.C
    public Object s(int i10) {
        return this.f28767a.s(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f28767a.size();
    }
}
