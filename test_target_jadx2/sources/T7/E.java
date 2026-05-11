package t7;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class E extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ F f42464a;

    E(F f10) {
        this.f42464a = f10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f42464a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        F f10 = this.f42464a;
        Map o10 = f10.o();
        return o10 != null ? o10.values().iterator() : new C4806y(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f42464a.size();
    }
}
