package kotlin.collections;

import java.util.Iterator;
import yc.InterfaceC5191a;

/* loaded from: classes.dex */
public abstract class D implements Iterator, InterfaceC5191a {
    public abstract int a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
