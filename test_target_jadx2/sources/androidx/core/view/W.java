package androidx.core.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import yc.InterfaceC5191a;

/* loaded from: classes.dex */
public final class W implements Iterator, InterfaceC5191a {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f16075a;

    /* renamed from: b, reason: collision with root package name */
    private final List f16076b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private Iterator f16077c;

    public W(Iterator it, Function1 function1) {
        this.f16075a = function1;
        this.f16077c = it;
    }

    private final void a(Object obj) {
        Iterator it = (Iterator) this.f16075a.invoke(obj);
        if (it != null && it.hasNext()) {
            this.f16076b.add(this.f16077c);
            this.f16077c = it;
        } else {
            while (!this.f16077c.hasNext() && !this.f16076b.isEmpty()) {
                this.f16077c = (Iterator) CollectionsKt.n0(this.f16076b);
                CollectionsKt.F(this.f16076b);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f16077c.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        Object next = this.f16077c.next();
        a(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
