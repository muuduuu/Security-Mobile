package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.g1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2449g1 extends AbstractC2493p0 implements RandomAccess, InterfaceC2474l1, W1 {

    /* renamed from: d, reason: collision with root package name */
    private static final C2449g1 f24865d = new C2449g1(new int[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private int[] f24866b;

    /* renamed from: c, reason: collision with root package name */
    private int f24867c;

    private C2449g1(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f24866b = iArr;
        this.f24867c = i10;
    }

    public static C2449g1 h() {
        return f24865d;
    }

    private final String k(int i10) {
        return "Index:" + i10 + ", Size:" + this.f24867c;
    }

    private final void m(int i10) {
        if (i10 < 0 || i10 >= this.f24867c) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f24867c)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        int[] iArr = this.f24866b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f24866b, i10, iArr2, i10 + 1, this.f24867c - i10);
            this.f24866b = iArr2;
        }
        this.f24866b[i10] = intValue;
        this.f24867c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2493p0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = AbstractC2489o1.f24887d;
        collection.getClass();
        if (!(collection instanceof C2449g1)) {
            return super.addAll(collection);
        }
        C2449g1 c2449g1 = (C2449g1) collection;
        int i10 = c2449g1.f24867c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f24867c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f24866b;
        if (i12 > iArr.length) {
            this.f24866b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c2449g1.f24866b, 0, this.f24866b, this.f24867c, c2449g1.f24867c);
        this.f24867c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i10) {
        m(i10);
        return this.f24866b[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2493p0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2449g1)) {
            return super.equals(obj);
        }
        C2449g1 c2449g1 = (C2449g1) obj;
        if (this.f24867c != c2449g1.f24867c) {
            return false;
        }
        int[] iArr = c2449g1.f24866b;
        for (int i10 = 0; i10 < this.f24867c; i10++) {
            if (this.f24866b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m(i10);
        return Integer.valueOf(this.f24866b[i10]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2493p0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f24867c; i11++) {
            i10 = (i10 * 31) + this.f24866b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i10 = this.f24867c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f24866b[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void j(int i10) {
        c();
        int i11 = this.f24867c;
        int[] iArr = this.f24866b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f24866b = iArr2;
        }
        int[] iArr3 = this.f24866b;
        int i12 = this.f24867c;
        this.f24867c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2484n1
    public final /* bridge */ /* synthetic */ InterfaceC2484n1 l(int i10) {
        if (i10 >= this.f24867c) {
            return new C2449g1(Arrays.copyOf(this.f24866b, i10), this.f24867c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2493p0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        m(i10);
        int[] iArr = this.f24866b;
        int i11 = iArr[i10];
        if (i10 < this.f24867c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f24867c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f24866b;
        System.arraycopy(iArr, i11, iArr, i10, this.f24867c - i11);
        this.f24867c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        m(i10);
        int[] iArr = this.f24866b;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24867c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2493p0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        j(((Integer) obj).intValue());
        return true;
    }
}
