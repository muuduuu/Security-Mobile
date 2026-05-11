package com.google.common.collect;

import com.google.common.collect.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class i extends h implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private static final A f27886b = new b(t.f27906e, 0);

    public static final class a extends h.a {
        public a() {
            this(4);
        }

        public a e(Object... objArr) {
            super.b(objArr);
            return this;
        }

        public i f() {
            this.f27885c = true;
            return i.m(this.f27883a, this.f27884b);
        }

        a(int i10) {
            super(i10);
        }
    }

    static class b extends AbstractC2835a {

        /* renamed from: c, reason: collision with root package name */
        private final i f27887c;

        b(i iVar, int i10) {
            super(iVar.size(), i10);
            this.f27887c = iVar;
        }

        @Override // com.google.common.collect.AbstractC2835a
        protected Object a(int i10) {
            return this.f27887c.get(i10);
        }
    }

    class c extends i {

        /* renamed from: c, reason: collision with root package name */
        final transient int f27888c;

        /* renamed from: d, reason: collision with root package name */
        final transient int f27889d;

        c(int i10, int i11) {
            this.f27888c = i10;
            this.f27889d = i11;
        }

        @Override // com.google.common.collect.i, java.util.List
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public i subList(int i10, int i11) {
            g8.h.l(i10, i11, this.f27889d);
            i iVar = i.this;
            int i12 = this.f27888c;
            return iVar.subList(i10 + i12, i11 + i12);
        }

        @Override // com.google.common.collect.h
        Object[] e() {
            return i.this.e();
        }

        @Override // java.util.List
        public Object get(int i10) {
            g8.h.f(i10, this.f27889d);
            return i.this.get(i10 + this.f27888c);
        }

        @Override // com.google.common.collect.h
        int h() {
            return i.this.j() + this.f27888c + this.f27889d;
        }

        @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.h
        int j() {
            return i.this.j() + this.f27888c;
        }

        @Override // com.google.common.collect.i, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f27889d;
        }

        @Override // com.google.common.collect.i, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    i() {
    }

    public static i A(Object obj, Object obj2) {
        return r(obj, obj2);
    }

    public static i B(Object obj, Object obj2, Object obj3) {
        return r(obj, obj2, obj3);
    }

    public static i D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return r(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static i E(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        g8.h.e(objArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr2 = new Object[objArr.length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        return r(objArr2);
    }

    static i k(Object[] objArr) {
        return m(objArr, objArr.length);
    }

    static i m(Object[] objArr, int i10) {
        return i10 == 0 ? w() : new t(objArr, i10);
    }

    private static i r(Object... objArr) {
        return k(q.b(objArr));
    }

    public static i w() {
        return t.f27906e;
    }

    @Override // java.util.List
    /* renamed from: F */
    public i subList(int i10, int i11) {
        g8.h.l(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? w() : G(i10, i11);
    }

    i G(int i10, int i11) {
        return new c(i10, i11 - i10);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.h
    int c(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return m.a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return m.b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return m.d(this, obj);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public z iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public A listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public A listIterator(int i10) {
        g8.h.j(i10, size());
        return isEmpty() ? f27886b : new b(this, i10);
    }
}
