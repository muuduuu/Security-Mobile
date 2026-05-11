package kotlin.collections;

import java.util.Iterator;
import yc.InterfaceC5191a;

/* loaded from: classes.dex */
public abstract class E implements Iterator, InterfaceC5191a {
    public abstract long a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
