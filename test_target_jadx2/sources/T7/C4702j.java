package t7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: t7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4702j implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    Map.Entry f43009a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Iterator f43010b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4709k f43011c;

    C4702j(C4709k c4709k, Iterator it) {
        this.f43011c = c4709k;
        this.f43010b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f43010b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f43010b.next();
        this.f43009a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC4653c.d(this.f43009a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f43009a.getValue();
        this.f43010b.remove();
        AbstractC4751q.l(this.f43011c.f43026b, collection.size());
        collection.clear();
        this.f43009a = null;
    }
}
