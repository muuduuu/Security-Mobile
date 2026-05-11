package r7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class Y extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4040b0 f39852a;

    Y(C4040b0 c4040b0) {
        this.f39852a = c4040b0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f39852a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f39852a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C4040b0 c4040b0 = this.f39852a;
        Map j10 = c4040b0.j();
        return j10 != null ? j10.keySet().iterator() : new S(c4040b0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object t10;
        Object obj2;
        Map j10 = this.f39852a.j();
        if (j10 != null) {
            return j10.keySet().remove(obj);
        }
        t10 = this.f39852a.t(obj);
        obj2 = C4040b0.f39909j;
        return t10 != obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f39852a.size();
    }
}
