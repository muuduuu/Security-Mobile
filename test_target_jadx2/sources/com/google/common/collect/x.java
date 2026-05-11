package com.google.common.collect;

/* loaded from: classes2.dex */
final class x extends k {

    /* renamed from: c, reason: collision with root package name */
    final transient Object f27935c;

    x(Object obj) {
        this.f27935c = g8.h.h(obj);
    }

    @Override // com.google.common.collect.h
    int c(Object[] objArr, int i10) {
        objArr[i10] = this.f27935c;
        return i10 + 1;
    }

    @Override // com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f27935c.equals(obj);
    }

    @Override // com.google.common.collect.k, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f27935c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String obj = this.f27935c.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2);
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: v */
    public z iterator() {
        return l.b(this.f27935c);
    }
}
