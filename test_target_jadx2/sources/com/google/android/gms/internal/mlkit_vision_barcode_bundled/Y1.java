package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class Y1 extends AbstractC2493p0 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final Y1 f24837d = new Y1(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private Object[] f24838b;

    /* renamed from: c, reason: collision with root package name */
    private int f24839c;

    private Y1(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f24838b = objArr;
        this.f24839c = i10;
    }

    public static Y1 e() {
        return f24837d;
    }

    private final String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f24839c;
    }

    private final void j(int i10) {
        if (i10 < 0 || i10 >= this.f24839c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f24839c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        Object[] objArr = this.f24838b;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f24838b, i10, objArr2, i10 + 1, this.f24839c - i10);
            this.f24838b = objArr2;
        }
        this.f24838b[i10] = obj;
        this.f24839c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        j(i10);
        return this.f24838b[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2484n1
    public final /* bridge */ /* synthetic */ InterfaceC2484n1 l(int i10) {
        if (i10 >= this.f24839c) {
            return new Y1(Arrays.copyOf(this.f24838b, i10), this.f24839c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2493p0, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        c();
        j(i10);
        Object[] objArr = this.f24838b;
        Object obj = objArr[i10];
        if (i10 < this.f24839c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f24839c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        c();
        j(i10);
        Object[] objArr = this.f24838b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24839c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2493p0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i10 = this.f24839c;
        Object[] objArr = this.f24838b;
        if (i10 == objArr.length) {
            this.f24838b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f24838b;
        int i11 = this.f24839c;
        this.f24839c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
