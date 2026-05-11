package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class a0 extends AbstractC2872c implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final a0 f28708d;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f28709b;

    /* renamed from: c, reason: collision with root package name */
    private int f28710c;

    static {
        a0 a0Var = new a0(new Object[0], 0);
        f28708d = a0Var;
        a0Var.x();
    }

    private a0(Object[] objArr, int i10) {
        this.f28709b = objArr;
        this.f28710c = i10;
    }

    private static Object[] e(int i10) {
        return new Object[i10];
    }

    public static a0 h() {
        return f28708d;
    }

    private void j(int i10) {
        if (i10 < 0 || i10 >= this.f28710c) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    private String k(int i10) {
        return "Index:" + i10 + ", Size:" + this.f28710c;
    }

    @Override // com.google.protobuf.AbstractC2872c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        c();
        int i10 = this.f28710c;
        Object[] objArr = this.f28709b;
        if (i10 == objArr.length) {
            this.f28709b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f28709b;
        int i11 = this.f28710c;
        this.f28710c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        j(i10);
        return this.f28709b[i10];
    }

    @Override // com.google.protobuf.AbstractC2893y.b
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public a0 y(int i10) {
        if (i10 >= this.f28710c) {
            return new a0(Arrays.copyOf(this.f28709b, i10), this.f28710c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC2872c, java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        c();
        j(i10);
        Object[] objArr = this.f28709b;
        Object obj = objArr[i10];
        if (i10 < this.f28710c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f28710c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        c();
        j(i10);
        Object[] objArr = this.f28709b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f28710c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f28710c)) {
            Object[] objArr = this.f28709b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] e10 = e(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f28709b, 0, e10, 0, i10);
                System.arraycopy(this.f28709b, i10, e10, i10 + 1, this.f28710c - i10);
                this.f28709b = e10;
            }
            this.f28709b[i10] = obj;
            this.f28710c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(k(i10));
    }
}
