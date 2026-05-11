package t7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: t7.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4688h implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f42972a;

    /* renamed from: b, reason: collision with root package name */
    Collection f42973b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4695i f42974c;

    C4688h(C4695i c4695i) {
        this.f42974c = c4695i;
        this.f42972a = c4695i.f42989c.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f42972a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f42972a.next();
        this.f42973b = (Collection) entry.getValue();
        C4695i c4695i = this.f42974c;
        Object key = entry.getKey();
        return new L(key, c4695i.f42990d.g(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC4653c.d(this.f42973b != null, "no calls to next() since the last call to remove()");
        this.f42972a.remove();
        AbstractC4751q.l(this.f42974c.f42990d, this.f42973b.size());
        this.f42973b.clear();
        this.f42973b = null;
    }
}
