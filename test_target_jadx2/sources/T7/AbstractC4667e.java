package t7;

import java.util.NoSuchElementException;

/* renamed from: t7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4667e extends AbstractC4745p0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f42892a;

    /* renamed from: b, reason: collision with root package name */
    private int f42893b;

    protected AbstractC4667e(int i10, int i11) {
        AbstractC4653c.b(i11, i10, "index");
        this.f42892a = i10;
        this.f42893b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f42893b < this.f42892a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f42893b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f42893b;
        this.f42893b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f42893b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f42893b - 1;
        this.f42893b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f42893b - 1;
    }
}
