package xc;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import yc.InterfaceC5191a;

/* renamed from: xc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5148a implements Iterator, InterfaceC5191a {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f44976a;

    /* renamed from: b, reason: collision with root package name */
    private int f44977b;

    public C5148a(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f44976a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f44977b < this.f44976a.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f44976a;
            int i10 = this.f44977b;
            this.f44977b = i10 + 1;
            return objArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f44977b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
