package p7;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
abstract class r0 extends y0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f38458a;

    /* renamed from: b, reason: collision with root package name */
    private int f38459b;

    protected r0(int i10, int i11) {
        p0.b(i11, i10, "index");
        this.f38458a = i10;
        this.f38459b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f38459b < this.f38458a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f38459b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f38459b;
        this.f38459b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f38459b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f38459b - 1;
        this.f38459b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f38459b - 1;
    }
}
