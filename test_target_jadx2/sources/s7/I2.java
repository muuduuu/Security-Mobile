package s7;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
abstract class I2 extends AbstractC4347d {

    /* renamed from: a, reason: collision with root package name */
    private final int f40908a;

    /* renamed from: b, reason: collision with root package name */
    private int f40909b;

    protected I2(int i10, int i11) {
        G1.b(i11, i10, "index");
        this.f40908a = i10;
        this.f40909b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f40909b < this.f40908a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f40909b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f40909b;
        this.f40909b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f40909b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f40909b - 1;
        this.f40909b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f40909b - 1;
    }
}
