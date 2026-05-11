package r7;

import java.util.NoSuchElementException;

/* renamed from: r7.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4268y extends K0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f40494a;

    /* renamed from: b, reason: collision with root package name */
    private int f40495b;

    protected AbstractC4268y(int i10, int i11) {
        AbstractC4248w.b(i11, i10, "index");
        this.f40494a = i10;
        this.f40495b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f40495b < this.f40494a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f40495b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f40495b;
        this.f40495b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f40495b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f40495b - 1;
        this.f40495b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f40495b - 1;
    }
}
