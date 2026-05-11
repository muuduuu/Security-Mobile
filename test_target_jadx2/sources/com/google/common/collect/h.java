package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes2.dex */
public abstract class h extends AbstractCollection implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[] f27882a = new Object[0];

    static abstract class a extends b {

        /* renamed from: a, reason: collision with root package name */
        Object[] f27883a;

        /* renamed from: b, reason: collision with root package name */
        int f27884b;

        /* renamed from: c, reason: collision with root package name */
        boolean f27885c;

        a(int i10) {
            d.b(i10, "initialCapacity");
            this.f27883a = new Object[i10];
            this.f27884b = 0;
        }

        private void d(int i10) {
            Object[] objArr = this.f27883a;
            if (objArr.length < i10) {
                this.f27883a = Arrays.copyOf(objArr, b.a(objArr.length, i10));
                this.f27885c = false;
            } else if (this.f27885c) {
                this.f27883a = (Object[]) objArr.clone();
                this.f27885c = false;
            }
        }

        public b b(Object... objArr) {
            c(objArr, objArr.length);
            return this;
        }

        final void c(Object[] objArr, int i10) {
            q.c(objArr, i10);
            d(this.f27884b + i10);
            System.arraycopy(objArr, 0, this.f27883a, this.f27884b, i10);
            this.f27884b += i10;
        }
    }

    public static abstract class b {
        b() {
        }

        static int a(int i10, int i11) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i12 = i10 + (i10 >> 1) + 1;
            if (i12 < i11) {
                i12 = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (i12 < 0) {
                return Integer.MAX_VALUE;
            }
            return i12;
        }
    }

    h() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    abstract int c(Object[] objArr, int i10);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    Object[] e() {
        return null;
    }

    int h() {
        throw new UnsupportedOperationException();
    }

    int j() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f27882a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        g8.h.h(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] e10 = e();
            if (e10 != null) {
                return s.a(e10, j(), h(), objArr);
            }
            objArr = q.d(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        c(objArr, 0);
        return objArr;
    }
}
