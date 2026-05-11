package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class Q5 extends AbstractC2378v4 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final Object[] f24341d;

    /* renamed from: e, reason: collision with root package name */
    private static final Q5 f24342e;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f24343b;

    /* renamed from: c, reason: collision with root package name */
    private int f24344c;

    static {
        Object[] objArr = new Object[0];
        f24341d = objArr;
        f24342e = new Q5(objArr, 0, false);
    }

    private Q5(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f24343b = objArr;
        this.f24344c = i10;
    }

    public static Q5 e() {
        return f24342e;
    }

    private static int j(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f24344c) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    private final String m(int i10) {
        return C2396x4.a(this.f24344c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2299m5
    public final /* bridge */ /* synthetic */ InterfaceC2299m5 O1(int i10) {
        if (i10 >= this.f24344c) {
            return new Q5(i10 == 0 ? f24341d : Arrays.copyOf(this.f24343b, i10), this.f24344c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f24344c)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f24343b;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[j(length)];
            System.arraycopy(this.f24343b, 0, objArr2, 0, i10);
            System.arraycopy(this.f24343b, i10, objArr2, i12, this.f24344c - i10);
            this.f24343b = objArr2;
        }
        this.f24343b[i10] = obj;
        this.f24344c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        k(i10);
        return this.f24343b[i10];
    }

    final void h(int i10) {
        int length = this.f24343b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f24343b = new Object[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = j(length);
        }
        this.f24343b = Arrays.copyOf(this.f24343b, length);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2378v4, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        c();
        k(i10);
        Object[] objArr = this.f24343b;
        Object obj = objArr[i10];
        if (i10 < this.f24344c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f24344c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        c();
        k(i10);
        Object[] objArr = this.f24343b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24344c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i10 = this.f24344c;
        int length = this.f24343b.length;
        if (i10 == length) {
            this.f24343b = Arrays.copyOf(this.f24343b, j(length));
        }
        Object[] objArr = this.f24343b;
        int i11 = this.f24344c;
        this.f24344c = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
