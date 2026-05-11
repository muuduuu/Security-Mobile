package t7;

import java.util.Iterator;

/* renamed from: t7.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4731n0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f43083a;

    AbstractC4731n0(Iterator it) {
        it.getClass();
        this.f43083a = it;
    }

    abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f43083a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f43083a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f43083a.remove();
    }
}
