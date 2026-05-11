package pb;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import yc.InterfaceC5191a;

/* renamed from: pb.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3863b implements Iterator, InterfaceC5191a {

    /* renamed from: a, reason: collision with root package name */
    private final Iterator f38548a;

    /* renamed from: b, reason: collision with root package name */
    private final Iterator f38549b;

    public C3863b(Iterator first, Iterator second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        this.f38548a = first;
        this.f38549b = second;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38548a.hasNext() || this.f38549b.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.f38548a.hasNext() ? this.f38548a.next() : this.f38549b.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
