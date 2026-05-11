package com.google.android.gms.internal.clearcut;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.clearcut.d1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2119d1 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    private ListIterator f24025a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f24026b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C2116c1 f24027c;

    C2119d1(C2116c1 c2116c1, int i10) {
        InterfaceC2139k0 interfaceC2139k0;
        this.f24027c = c2116c1;
        this.f24026b = i10;
        interfaceC2139k0 = c2116c1.f24023a;
        this.f24025a = interfaceC2139k0.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f24025a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f24025a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f24025a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f24025a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ Object previous() {
        return (String) this.f24025a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f24025a.previousIndex();
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
