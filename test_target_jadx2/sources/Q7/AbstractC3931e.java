package q7;

import java.util.NoSuchElementException;

/* renamed from: q7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3931e extends AbstractC3925A {

    /* renamed from: a, reason: collision with root package name */
    private final int f38800a;

    /* renamed from: b, reason: collision with root package name */
    private int f38801b;

    protected AbstractC3931e(int i10, int i11) {
        AbstractC3929c.b(i11, i10, "index");
        this.f38800a = i10;
        this.f38801b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f38801b < this.f38800a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f38801b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f38801b;
        this.f38801b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f38801b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f38801b - 1;
        this.f38801b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f38801b - 1;
    }
}
