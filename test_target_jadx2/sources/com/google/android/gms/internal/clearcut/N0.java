package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class N0 extends AbstractC2161s {

    /* renamed from: c, reason: collision with root package name */
    private static final N0 f23891c;

    /* renamed from: b, reason: collision with root package name */
    private final List f23892b;

    static {
        N0 n02 = new N0();
        f23891c = n02;
        n02.q();
    }

    N0() {
        this(new ArrayList(10));
    }

    public static N0 e() {
        return f23891c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        c();
        this.f23892b.add(i10, obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.f23892b.get(i10);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2124f0
    public final /* synthetic */ InterfaceC2124f0 l1(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f23892b);
        return new N0(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        c();
        Object remove = this.f23892b.remove(i10);
        ((AbstractList) this).modCount++;
        return remove;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        c();
        Object obj2 = this.f23892b.set(i10, obj);
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23892b.size();
    }

    private N0(List list) {
        this.f23892b = list;
    }
}
