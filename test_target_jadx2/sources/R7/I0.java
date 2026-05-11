package r7;

import java.util.Iterator;

/* loaded from: classes2.dex */
abstract class I0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f39437a;

    I0(Iterator it) {
        it.getClass();
        this.f39437a = it;
    }

    abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39437a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f39437a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f39437a.remove();
    }
}
