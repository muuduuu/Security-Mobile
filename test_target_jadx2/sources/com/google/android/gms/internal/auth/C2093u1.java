package com.google.android.gms.internal.auth;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.auth.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2093u1 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    final ListIterator f23775a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f23776b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2099w1 f23777c;

    C2093u1(C2099w1 c2099w1, int i10) {
        J0 j02;
        this.f23777c = c2099w1;
        this.f23776b = i10;
        j02 = c2099w1.f23784a;
        this.f23775a = j02.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f23775a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f23775a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f23775a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f23775a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f23775a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f23775a.previousIndex();
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
