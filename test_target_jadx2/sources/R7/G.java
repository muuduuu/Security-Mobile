package r7;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
class G implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f39393a;

    /* renamed from: b, reason: collision with root package name */
    final Collection f39394b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ H f39395c;

    G(H h10, Iterator it) {
        this.f39395c = h10;
        this.f39394b = h10.f39419b;
        this.f39393a = it;
    }

    final void a() {
        this.f39395c.zzb();
        if (this.f39395c.f39419b != this.f39394b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f39393a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.f39393a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10;
        this.f39393a.remove();
        K k10 = this.f39395c.f39422e;
        i10 = k10.f39466d;
        k10.f39466d = i10 - 1;
        this.f39395c.e();
    }

    G(H h10) {
        this.f39395c = h10;
        Collection collection = h10.f39419b;
        this.f39394b = collection;
        this.f39393a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
