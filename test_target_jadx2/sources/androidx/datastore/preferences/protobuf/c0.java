package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class c0 extends AbstractC1536c implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final c0 f16337d = new c0(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private Object[] f16338b;

    /* renamed from: c, reason: collision with root package name */
    private int f16339c;

    private c0(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f16338b = objArr;
        this.f16339c = i10;
    }

    private static Object[] e(int i10) {
        return new Object[i10];
    }

    public static c0 h() {
        return f16337d;
    }

    private void j(int i10) {
        if (i10 < 0 || i10 >= this.f16339c) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    private String k(int i10) {
        return "Index:" + i10 + ", Size:" + this.f16339c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        c();
        int i10 = this.f16339c;
        Object[] objArr = this.f16338b;
        if (i10 == objArr.length) {
            this.f16338b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f16338b;
        int i11 = this.f16339c;
        this.f16339c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        j(i10);
        return this.f16338b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1557y.b
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public c0 y(int i10) {
        if (i10 >= this.f16339c) {
            return new c0(Arrays.copyOf(this.f16338b, i10), this.f16339c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1536c, java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        c();
        j(i10);
        Object[] objArr = this.f16338b;
        Object obj = objArr[i10];
        if (i10 < this.f16339c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f16339c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        c();
        j(i10);
        Object[] objArr = this.f16338b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f16339c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f16339c)) {
            Object[] objArr = this.f16338b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] e10 = e(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f16338b, 0, e10, 0, i10);
                System.arraycopy(this.f16338b, i10, e10, i10 + 1, this.f16339c - i10);
                this.f16338b = e10;
            }
            this.f16338b[i10] = obj;
            this.f16339c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(k(i10));
    }
}
