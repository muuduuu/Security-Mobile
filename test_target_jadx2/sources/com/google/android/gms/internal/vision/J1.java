package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class J1 extends AbstractC2547a0 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final J1 f25038d;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f25039b;

    /* renamed from: c, reason: collision with root package name */
    private int f25040c;

    static {
        J1 j12 = new J1(new Object[0], 0);
        f25038d = j12;
        j12.zzb();
    }

    private J1(Object[] objArr, int i10) {
        this.f25039b = objArr;
        this.f25040c = i10;
    }

    private final void e(int i10) {
        if (i10 < 0 || i10 >= this.f25040c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    private final String h(int i10) {
        int i11 = this.f25040c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    public static J1 j() {
        return f25038d;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2547a0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i10 = this.f25040c;
        Object[] objArr = this.f25039b;
        if (i10 == objArr.length) {
            this.f25039b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f25039b;
        int i11 = this.f25040c;
        this.f25040c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.vision.X0
    public final /* synthetic */ X0 b(int i10) {
        if (i10 >= this.f25040c) {
            return new J1(Arrays.copyOf(this.f25039b, i10), this.f25040c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        e(i10);
        return this.f25039b[i10];
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2547a0, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        c();
        e(i10);
        Object[] objArr = this.f25039b;
        Object obj = objArr[i10];
        if (i10 < this.f25040c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f25040c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        c();
        e(i10);
        Object[] objArr = this.f25039b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25040c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f25040c)) {
            Object[] objArr = this.f25039b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f25039b, i10, objArr2, i10 + 1, this.f25040c - i10);
                this.f25039b = objArr2;
            }
            this.f25039b[i10] = obj;
            this.f25040c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(h(i10));
    }
}
