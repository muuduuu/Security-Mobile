package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class X0 extends AbstractC2493p0 implements RandomAccess, InterfaceC2469k1, W1 {

    /* renamed from: d, reason: collision with root package name */
    private static final X0 f24830d = new X0(new float[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private float[] f24831b;

    /* renamed from: c, reason: collision with root package name */
    private int f24832c;

    private X0(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f24831b = fArr;
        this.f24832c = i10;
    }

    public static X0 e() {
        return f24830d;
    }

    private final String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f24832c;
    }

    private final void j(int i10) {
        if (i10 < 0 || i10 >= this.f24832c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2469k1
    public final void M1(float f10) {
        c();
        int i10 = this.f24832c;
        float[] fArr = this.f24831b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f24831b = fArr2;
        }
        float[] fArr3 = this.f24831b;
        int i11 = this.f24832c;
        this.f24832c = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f24832c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        float[] fArr = this.f24831b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f24831b, i10, fArr2, i10 + 1, this.f24832c - i10);
            this.f24831b = fArr2;
        }
        this.f24831b[i10] = floatValue;
        this.f24832c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2493p0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = AbstractC2489o1.f24887d;
        collection.getClass();
        if (!(collection instanceof X0)) {
            return super.addAll(collection);
        }
        X0 x02 = (X0) collection;
        int i10 = x02.f24832c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f24832c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f24831b;
        if (i12 > fArr.length) {
            this.f24831b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(x02.f24831b, 0, this.f24831b, this.f24832c, x02.f24832c);
        this.f24832c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2493p0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X0)) {
            return super.equals(obj);
        }
        X0 x02 = (X0) obj;
        if (this.f24832c != x02.f24832c) {
            return false;
        }
        float[] fArr = x02.f24831b;
        for (int i10 = 0; i10 < this.f24832c; i10++) {
            if (Float.floatToIntBits(this.f24831b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        j(i10);
        return Float.valueOf(this.f24831b[i10]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2493p0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f24832c; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f24831b[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i10 = this.f24832c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f24831b[i11] == floatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2493p0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        j(i10);
        float[] fArr = this.f24831b;
        float f10 = fArr[i10];
        if (i10 < this.f24832c - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f24832c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f24831b;
        System.arraycopy(fArr, i11, fArr, i10, this.f24832c - i11);
        this.f24832c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        c();
        j(i10);
        float[] fArr = this.f24831b;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24832c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2484n1
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2469k1 l(int i10) {
        if (i10 >= this.f24832c) {
            return new X0(Arrays.copyOf(this.f24831b, i10), this.f24832c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2493p0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        M1(((Float) obj).floatValue());
        return true;
    }
}
