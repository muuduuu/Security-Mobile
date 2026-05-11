package com.google.android.gms.internal.vision;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.vision.e2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2565e2 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    private ListIterator f25123a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f25124b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ f2 f25125c;

    C2565e2(f2 f2Var, int i10) {
        InterfaceC2560d1 interfaceC2560d1;
        this.f25125c = f2Var;
        this.f25124b = i10;
        interfaceC2560d1 = f2Var.f25131a;
        this.f25123a = interfaceC2560d1.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f25123a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f25123a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f25123a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f25123a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ Object previous() {
        return (String) this.f25123a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f25123a.previousIndex();
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
