package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class f2 extends AbstractList implements InterfaceC2560d1, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2560d1 f25131a;

    public f2(InterfaceC2560d1 interfaceC2560d1) {
        this.f25131a = interfaceC2560d1;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2560d1
    public final List f() {
        return this.f25131a.f();
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2560d1
    public final InterfaceC2560d1 g() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return (String) this.f25131a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new i2(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new C2565e2(this, i10);
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2560d1
    public final Object n(int i10) {
        return this.f25131a.n(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25131a.size();
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2560d1
    public final void z1(AbstractC2570g0 abstractC2570g0) {
        throw new UnsupportedOperationException();
    }
}
