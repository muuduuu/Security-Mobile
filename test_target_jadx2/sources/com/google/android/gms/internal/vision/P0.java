package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class P0 extends AbstractC2547a0 implements X0, D1, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final P0 f25069d;

    /* renamed from: b, reason: collision with root package name */
    private int[] f25070b;

    /* renamed from: c, reason: collision with root package name */
    private int f25071c;

    static {
        P0 p02 = new P0(new int[0], 0);
        f25069d = p02;
        p02.zzb();
    }

    private P0(int[] iArr, int i10) {
        this.f25070b = iArr;
        this.f25071c = i10;
    }

    public static P0 j() {
        return f25069d;
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f25071c) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    private final String m(int i10) {
        int i11 = this.f25071c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f25071c)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        int[] iArr = this.f25070b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f25070b, i10, iArr2, i10 + 1, this.f25071c - i10);
            this.f25070b = iArr2;
        }
        this.f25070b[i10] = intValue;
        this.f25071c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2547a0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        R0.d(collection);
        if (!(collection instanceof P0)) {
            return super.addAll(collection);
        }
        P0 p02 = (P0) collection;
        int i10 = p02.f25071c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f25071c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f25070b;
        if (i12 > iArr.length) {
            this.f25070b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(p02.f25070b, 0, this.f25070b, this.f25071c, p02.f25071c);
        this.f25071c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.vision.X0
    public final /* synthetic */ X0 b(int i10) {
        if (i10 >= this.f25071c) {
            return new P0(Arrays.copyOf(this.f25070b, i10), this.f25071c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i10) {
        k(i10);
        return this.f25070b[i10];
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2547a0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P0)) {
            return super.equals(obj);
        }
        P0 p02 = (P0) obj;
        if (this.f25071c != p02.f25071c) {
            return false;
        }
        int[] iArr = p02.f25070b;
        for (int i10 = 0; i10 < this.f25071c; i10++) {
            if (this.f25070b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return Integer.valueOf(e(i10));
    }

    public final void h(int i10) {
        c();
        int i11 = this.f25071c;
        int[] iArr = this.f25070b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f25070b = iArr2;
        }
        int[] iArr3 = this.f25070b;
        int i12 = this.f25071c;
        this.f25071c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2547a0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f25071c; i11++) {
            i10 = (i10 * 31) + this.f25070b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f25070b[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2547a0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        c();
        k(i10);
        int[] iArr = this.f25070b;
        int i11 = iArr[i10];
        if (i10 < this.f25071c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f25071c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f25070b;
        System.arraycopy(iArr, i11, iArr, i10, this.f25071c - i11);
        this.f25071c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        k(i10);
        int[] iArr = this.f25070b;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25071c;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2547a0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        h(((Integer) obj).intValue());
        return true;
    }
}
