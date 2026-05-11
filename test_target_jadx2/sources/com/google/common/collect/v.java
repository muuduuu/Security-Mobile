package com.google.common.collect;

/* loaded from: classes2.dex */
final class v extends k {

    /* renamed from: h, reason: collision with root package name */
    private static final Object[] f27923h;

    /* renamed from: i, reason: collision with root package name */
    static final v f27924i;

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f27925c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f27926d;

    /* renamed from: e, reason: collision with root package name */
    final transient Object[] f27927e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f27928f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f27929g;

    static {
        Object[] objArr = new Object[0];
        f27923h = objArr;
        f27924i = new v(objArr, 0, objArr, 0, 0);
    }

    v(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f27925c = objArr;
        this.f27926d = i10;
        this.f27927e = objArr2;
        this.f27928f = i11;
        this.f27929g = i12;
    }

    @Override // com.google.common.collect.h
    int c(Object[] objArr, int i10) {
        System.arraycopy(this.f27925c, 0, objArr, i10, this.f27929g);
        return i10 + this.f27929g;
    }

    @Override // com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.f27927e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int b10 = g.b(obj);
        while (true) {
            int i10 = b10 & this.f27928f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b10 = i10 + 1;
        }
    }

    @Override // com.google.common.collect.h
    Object[] e() {
        return this.f27925c;
    }

    @Override // com.google.common.collect.h
    int h() {
        return this.f27929g;
    }

    @Override // com.google.common.collect.k, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f27926d;
    }

    @Override // com.google.common.collect.h
    int j() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f27929g;
    }

    @Override // com.google.common.collect.k
    i t() {
        return i.m(this.f27925c, this.f27929g);
    }

    @Override // com.google.common.collect.k
    boolean u() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public z iterator() {
        return k().iterator();
    }
}
