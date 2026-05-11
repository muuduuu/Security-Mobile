package T5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class c implements Iterator, Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f9275a;

    /* renamed from: b, reason: collision with root package name */
    private int f9276b = 0;

    public c(Object[] objArr) {
        this.f9275a = objArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f9276b < this.f9275a.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f9276b;
        Object[] objArr = this.f9275a;
        if (i10 >= objArr.length) {
            throw new NoSuchElementException();
        }
        this.f9276b = i10 + 1;
        return objArr[i10];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this;
    }
}
