package r7;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: r7.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4028A extends AbstractC4209s0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C f39258a;

    C4028A(C c10) {
        this.f39258a = c10;
    }

    @Override // r7.AbstractC4209s0
    final Map c() {
        return this.f39258a;
    }

    @Override // r7.AbstractC4209s0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.f39258a.f39299c.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new B(this.f39258a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        K.l(this.f39258a.f39300d, entry.getKey());
        return true;
    }
}
