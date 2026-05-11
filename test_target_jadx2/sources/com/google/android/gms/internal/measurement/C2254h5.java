package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.h5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2254h5 extends AbstractC2378v4 implements RandomAccess, InterfaceC2281k5, O5 {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f24523d;

    /* renamed from: e, reason: collision with root package name */
    private static final C2254h5 f24524e;

    /* renamed from: b, reason: collision with root package name */
    private int[] f24525b;

    /* renamed from: c, reason: collision with root package name */
    private int f24526c;

    static {
        int[] iArr = new int[0];
        f24523d = iArr;
        f24524e = new C2254h5(iArr, 0, false);
    }

    private C2254h5(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f24525b = iArr;
        this.f24526c = i10;
    }

    public static C2254h5 e() {
        return f24524e;
    }

    private static int m(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void r(int i10) {
        if (i10 < 0 || i10 >= this.f24526c) {
            throw new IndexOutOfBoundsException(t(i10));
        }
    }

    private final String t(int i10) {
        return C2396x4.a(this.f24526c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f24526c)) {
            throw new IndexOutOfBoundsException(t(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f24525b;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[m(length)];
            System.arraycopy(this.f24525b, 0, iArr2, 0, i10);
            System.arraycopy(this.f24525b, i10, iArr2, i12, this.f24526c - i10);
            this.f24525b = iArr2;
        }
        this.f24525b[i10] = intValue;
        this.f24526c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2378v4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = AbstractC2308n5.f24582b;
        collection.getClass();
        if (!(collection instanceof C2254h5)) {
            return super.addAll(collection);
        }
        C2254h5 c2254h5 = (C2254h5) collection;
        int i10 = c2254h5.f24526c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f24526c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f24525b;
        if (i12 > iArr.length) {
            this.f24525b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c2254h5.f24525b, 0, this.f24525b, this.f24526c, c2254h5.f24526c);
        this.f24526c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2378v4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2254h5)) {
            return super.equals(obj);
        }
        C2254h5 c2254h5 = (C2254h5) obj;
        if (this.f24526c != c2254h5.f24526c) {
            return false;
        }
        int[] iArr = c2254h5.f24525b;
        for (int i10 = 0; i10 < this.f24526c; i10++) {
            if (this.f24525b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        r(i10);
        return Integer.valueOf(this.f24525b[i10]);
    }

    public final int h(int i10) {
        r(i10);
        return this.f24525b[i10];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2378v4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f24526c; i11++) {
            i10 = (i10 * 31) + this.f24525b[i11];
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2299m5
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2281k5 O1(int i10) {
        if (i10 >= this.f24526c) {
            return new C2254h5(i10 == 0 ? f24523d : Arrays.copyOf(this.f24525b, i10), this.f24526c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i10 = this.f24526c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f24525b[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void j(int i10) {
        c();
        int i11 = this.f24526c;
        int length = this.f24525b.length;
        if (i11 == length) {
            int[] iArr = new int[m(length)];
            System.arraycopy(this.f24525b, 0, iArr, 0, this.f24526c);
            this.f24525b = iArr;
        }
        int[] iArr2 = this.f24525b;
        int i12 = this.f24526c;
        this.f24526c = i12 + 1;
        iArr2[i12] = i10;
    }

    final void k(int i10) {
        int length = this.f24525b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f24525b = new int[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = m(length);
        }
        this.f24525b = Arrays.copyOf(this.f24525b, length);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2378v4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        r(i10);
        int[] iArr = this.f24525b;
        int i11 = iArr[i10];
        if (i10 < this.f24526c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f24526c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f24525b;
        System.arraycopy(iArr, i11, iArr, i10, this.f24526c - i11);
        this.f24526c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        r(i10);
        int[] iArr = this.f24525b;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24526c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        j(((Integer) obj).intValue());
        return true;
    }
}
