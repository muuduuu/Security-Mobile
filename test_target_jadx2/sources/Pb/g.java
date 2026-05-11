package pb;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import yc.InterfaceC5191a;

/* loaded from: classes2.dex */
public final class g implements Iterator, InterfaceC5191a {

    /* renamed from: a, reason: collision with root package name */
    private final Iterator f38555a;

    /* renamed from: b, reason: collision with root package name */
    private final f f38556b;

    /* renamed from: c, reason: collision with root package name */
    private Object f38557c;

    public g(Iterator iterator, f filter) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f38555a = iterator;
        this.f38556b = filter;
        a();
    }

    private final void a() {
        while (this.f38555a.hasNext()) {
            Object next = this.f38555a.next();
            this.f38557c = next;
            if (this.f38556b.apply(next)) {
                return;
            }
        }
        this.f38557c = null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38557c != null;
    }

    @Override // java.util.Iterator
    public Object next() {
        Object obj = this.f38557c;
        Intrinsics.d(obj);
        a();
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
