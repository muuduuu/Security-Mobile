package r7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class D implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    Map.Entry f39313a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Iterator f39314b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ E f39315c;

    D(E e10, Iterator it) {
        this.f39315c = e10;
        this.f39314b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39314b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f39314b.next();
        this.f39313a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10;
        AbstractC4248w.e(this.f39313a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f39313a.getValue();
        this.f39314b.remove();
        K k10 = this.f39315c.f39343b;
        i10 = k10.f39466d;
        k10.f39466d = i10 - collection.size();
        collection.clear();
        this.f39313a = null;
    }
}
