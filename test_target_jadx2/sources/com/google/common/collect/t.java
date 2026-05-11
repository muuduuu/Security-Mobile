package com.google.common.collect;

import java.util.Objects;

/* loaded from: classes2.dex */
class t extends i {

    /* renamed from: e, reason: collision with root package name */
    static final i f27906e = new t(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f27907c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f27908d;

    t(Object[] objArr, int i10) {
        this.f27907c = objArr;
        this.f27908d = i10;
    }

    @Override // com.google.common.collect.i, com.google.common.collect.h
    int c(Object[] objArr, int i10) {
        System.arraycopy(this.f27907c, 0, objArr, i10, this.f27908d);
        return i10 + this.f27908d;
    }

    @Override // com.google.common.collect.h
    Object[] e() {
        return this.f27907c;
    }

    @Override // java.util.List
    public Object get(int i10) {
        g8.h.f(i10, this.f27908d);
        Object obj = this.f27907c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.common.collect.h
    int h() {
        return this.f27908d;
    }

    @Override // com.google.common.collect.h
    int j() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f27908d;
    }
}
