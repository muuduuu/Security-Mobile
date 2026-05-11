package r7;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: r7.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4030a0 extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4040b0 f39893a;

    C4030a0(C4040b0 c4040b0) {
        this.f39893a = c4040b0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f39893a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C4040b0 c4040b0 = this.f39893a;
        Map j10 = c4040b0.j();
        return j10 != null ? j10.values().iterator() : new U(c4040b0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f39893a.size();
    }
}
