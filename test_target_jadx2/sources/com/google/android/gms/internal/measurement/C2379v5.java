package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.v5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2379v5 extends AbstractC2378v4 implements RandomAccess, InterfaceC2290l5, O5 {

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f24672d;

    /* renamed from: e, reason: collision with root package name */
    private static final C2379v5 f24673e;

    /* renamed from: b, reason: collision with root package name */
    private long[] f24674b;

    /* renamed from: c, reason: collision with root package name */
    private int f24675c;

    static {
        long[] jArr = new long[0];
        f24672d = jArr;
        f24673e = new C2379v5(jArr, 0, false);
    }

    private C2379v5(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f24674b = jArr;
        this.f24675c = i10;
    }

    public static C2379v5 e() {
        return f24673e;
    }

    private static int k(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void m(int i10) {
        if (i10 < 0 || i10 >= this.f24675c) {
            throw new IndexOutOfBoundsException(r(i10));
        }
    }

    private final String r(int i10) {
        return C2396x4.a(this.f24675c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2290l5
    public final long O0(int i10) {
        m(i10);
        return this.f24674b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f24675c)) {
            throw new IndexOutOfBoundsException(r(i10));
        }
        int i12 = i10 + 1;
        long[] jArr = this.f24674b;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[k(length)];
            System.arraycopy(this.f24674b, 0, jArr2, 0, i10);
            System.arraycopy(this.f24674b, i10, jArr2, i12, this.f24675c - i10);
            this.f24674b = jArr2;
        }
        this.f24674b[i10] = longValue;
        this.f24675c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2378v4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = AbstractC2308n5.f24582b;
        collection.getClass();
        if (!(collection instanceof C2379v5)) {
            return super.addAll(collection);
        }
        C2379v5 c2379v5 = (C2379v5) collection;
        int i10 = c2379v5.f24675c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f24675c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f24674b;
        if (i12 > jArr.length) {
            this.f24674b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c2379v5.f24674b, 0, this.f24674b, this.f24675c, c2379v5.f24675c);
        this.f24675c = i12;
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
        if (!(obj instanceof C2379v5)) {
            return super.equals(obj);
        }
        C2379v5 c2379v5 = (C2379v5) obj;
        if (this.f24675c != c2379v5.f24675c) {
            return false;
        }
        long[] jArr = c2379v5.f24674b;
        for (int i10 = 0; i10 < this.f24675c; i10++) {
            if (this.f24674b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m(i10);
        return Long.valueOf(this.f24674b[i10]);
    }

    public final void h(long j10) {
        c();
        int i10 = this.f24675c;
        int length = this.f24674b.length;
        if (i10 == length) {
            long[] jArr = new long[k(length)];
            System.arraycopy(this.f24674b, 0, jArr, 0, this.f24675c);
            this.f24674b = jArr;
        }
        long[] jArr2 = this.f24674b;
        int i11 = this.f24675c;
        this.f24675c = i11 + 1;
        jArr2[i11] = j10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2378v4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f24675c; i11++) {
            long j10 = this.f24674b[i11];
            byte[] bArr = AbstractC2308n5.f24582b;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i10 = this.f24675c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f24674b[i11] == longValue) {
                return i11;
            }
        }
        return -1;
    }

    final void j(int i10) {
        int length = this.f24674b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f24674b = new long[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = k(length);
        }
        this.f24674b = Arrays.copyOf(this.f24674b, length);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2299m5
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2290l5 O1(int i10) {
        if (i10 >= this.f24675c) {
            return new C2379v5(i10 == 0 ? f24672d : Arrays.copyOf(this.f24674b, i10), this.f24675c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2378v4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        m(i10);
        long[] jArr = this.f24674b;
        long j10 = jArr[i10];
        if (i10 < this.f24675c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f24675c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f24674b;
        System.arraycopy(jArr, i11, jArr, i10, this.f24675c - i11);
        this.f24675c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        c();
        m(i10);
        long[] jArr = this.f24674b;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24675c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Long) obj).longValue());
        return true;
    }
}
