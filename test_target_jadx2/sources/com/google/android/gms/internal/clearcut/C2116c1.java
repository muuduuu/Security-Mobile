package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2116c1 extends AbstractList implements InterfaceC2139k0, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2139k0 f24023a;

    public C2116c1(InterfaceC2139k0 interfaceC2139k0) {
        this.f24023a = interfaceC2139k0;
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2139k0
    public final InterfaceC2139k0 N1() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return (String) this.f24023a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C2122e1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new C2119d1(this, i10);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2139k0
    public final List o0() {
        return this.f24023a.o0();
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2139k0
    public final Object s(int i10) {
        return this.f24023a.s(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24023a.size();
    }
}
