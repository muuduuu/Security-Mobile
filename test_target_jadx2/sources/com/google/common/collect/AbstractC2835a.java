package com.google.common.collect;

import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2835a extends A {

    /* renamed from: a, reason: collision with root package name */
    private final int f27874a;

    /* renamed from: b, reason: collision with root package name */
    private int f27875b;

    protected AbstractC2835a(int i10, int i11) {
        g8.h.j(i11, i10);
        this.f27874a = i10;
        this.f27875b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f27875b < this.f27874a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f27875b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f27875b;
        this.f27875b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f27875b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f27875b - 1;
        this.f27875b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f27875b - 1;
    }
}
