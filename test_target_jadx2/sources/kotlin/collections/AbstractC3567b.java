package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import yc.InterfaceC5191a;

/* renamed from: kotlin.collections.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3567b implements Iterator, InterfaceC5191a {

    /* renamed from: a, reason: collision with root package name */
    private int f36340a;

    /* renamed from: b, reason: collision with root package name */
    private Object f36341b;

    private final boolean d() {
        this.f36340a = 3;
        a();
        return this.f36340a == 1;
    }

    protected abstract void a();

    protected final void b() {
        this.f36340a = 2;
    }

    protected final void c(Object obj) {
        this.f36341b = obj;
        this.f36340a = 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.f36340a;
        if (i10 == 0) {
            return d();
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f36340a;
        if (i10 == 1) {
            this.f36340a = 0;
            return this.f36341b;
        }
        if (i10 == 2 || !d()) {
            throw new NoSuchElementException();
        }
        this.f36340a = 0;
        return this.f36341b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
