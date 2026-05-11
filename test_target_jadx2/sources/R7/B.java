package r7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class B implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f39274a;

    /* renamed from: b, reason: collision with root package name */
    Collection f39275b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C f39276c;

    B(C c10) {
        this.f39276c = c10;
        this.f39274a = c10.f39299c.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39274a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f39274a.next();
        this.f39275b = (Collection) entry.getValue();
        C c10 = this.f39276c;
        Object key = entry.getKey();
        return new C4100h0(key, c10.f39300d.f(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10;
        AbstractC4248w.e(this.f39275b != null, "no calls to next() since the last call to remove()");
        this.f39274a.remove();
        K k10 = this.f39276c.f39300d;
        i10 = k10.f39466d;
        k10.f39466d = i10 - this.f39275b.size();
        this.f39275b.clear();
        this.f39275b = null;
    }
}
