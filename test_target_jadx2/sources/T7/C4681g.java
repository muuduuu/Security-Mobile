package t7;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: t7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4681g extends X {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4695i f42948a;

    C4681g(C4695i c4695i) {
        this.f42948a = c4695i;
    }

    @Override // t7.X
    final Map c() {
        return this.f42948a;
    }

    @Override // t7.X, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.f42948a.f42989c.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C4688h(this.f42948a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        AbstractC4751q.p(this.f42948a.f42990d, entry.getKey());
        return true;
    }
}
