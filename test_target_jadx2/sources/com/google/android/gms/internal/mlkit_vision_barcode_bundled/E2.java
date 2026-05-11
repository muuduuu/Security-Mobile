package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class E2 extends AbstractList implements RandomAccess, InterfaceC2533x1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2533x1 f24755a;

    public E2(InterfaceC2533x1 interfaceC2533x1) {
        this.f24755a = interfaceC2533x1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2533x1
    public final List d() {
        return this.f24755a.d();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2533x1
    public final InterfaceC2533x1 g() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((C2528w1) this.f24755a).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new D2(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new C2(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24755a.size();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2533x1
    public final Object z(int i10) {
        return this.f24755a.z(i10);
    }
}
