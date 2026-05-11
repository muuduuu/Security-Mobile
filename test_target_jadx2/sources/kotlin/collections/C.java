package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import yc.InterfaceC5191a;

/* loaded from: classes.dex */
public final class C implements Iterator, InterfaceC5191a {

    /* renamed from: a, reason: collision with root package name */
    private final Iterator f36327a;

    /* renamed from: b, reason: collision with root package name */
    private int f36328b;

    public C(Iterator iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f36327a = iterator;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IndexedValue next() {
        int i10 = this.f36328b;
        this.f36328b = i10 + 1;
        if (i10 < 0) {
            CollectionsKt.t();
        }
        return new IndexedValue(i10, this.f36327a.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36327a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
