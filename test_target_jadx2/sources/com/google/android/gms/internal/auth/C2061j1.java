package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.auth.j1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2061j1 extends AbstractC2039c0 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final C2061j1 f23720d = new C2061j1(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private Object[] f23721b;

    /* renamed from: c, reason: collision with root package name */
    private int f23722c;

    private C2061j1(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f23721b = objArr;
        this.f23722c = i10;
    }

    public static C2061j1 e() {
        return f23720d;
    }

    private final String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f23722c;
    }

    private final void j(int i10) {
        if (i10 < 0 || i10 >= this.f23722c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f23722c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        Object[] objArr = this.f23721b;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f23721b, i10, objArr2, i10 + 1, this.f23722c - i10);
            this.f23721b = objArr2;
        }
        this.f23721b[i10] = obj;
        this.f23722c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        j(i10);
        return this.f23721b[i10];
    }

    @Override // com.google.android.gms.internal.auth.E0
    public final /* bridge */ /* synthetic */ E0 l(int i10) {
        if (i10 >= this.f23722c) {
            return new C2061j1(Arrays.copyOf(this.f23721b, i10), this.f23722c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2039c0, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        c();
        j(i10);
        Object[] objArr = this.f23721b;
        Object obj = objArr[i10];
        if (i10 < this.f23722c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f23722c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        c();
        j(i10);
        Object[] objArr = this.f23721b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23722c;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2039c0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i10 = this.f23722c;
        Object[] objArr = this.f23721b;
        if (i10 == objArr.length) {
            this.f23721b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f23721b;
        int i11 = this.f23722c;
        this.f23722c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
