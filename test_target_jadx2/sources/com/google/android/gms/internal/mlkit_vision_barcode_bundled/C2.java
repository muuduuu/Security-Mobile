package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ListIterator;

/* loaded from: classes2.dex */
final class C2 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    final ListIterator f24741a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f24742b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ E2 f24743c;

    C2(E2 e22, int i10) {
        InterfaceC2533x1 interfaceC2533x1;
        this.f24743c = e22;
        this.f24742b = i10;
        interfaceC2533x1 = e22.f24755a;
        this.f24741a = interfaceC2533x1.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f24741a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f24741a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f24741a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f24741a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f24741a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f24741a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
