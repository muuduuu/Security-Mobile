package n7;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
abstract class v extends m {

    /* renamed from: a, reason: collision with root package name */
    private final int f37587a;

    /* renamed from: b, reason: collision with root package name */
    private int f37588b;

    protected v(int i10, int i11) {
        s.c(i11, i10, "index");
        this.f37587a = i10;
        this.f37588b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f37588b < this.f37587a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f37588b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f37588b;
        this.f37588b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f37588b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f37588b - 1;
        this.f37588b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f37588b - 1;
    }
}
