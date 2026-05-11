package t7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class C extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ F f42442a;

    C(F f10) {
        this.f42442a = f10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f42442a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f42442a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        F f10 = this.f42442a;
        Map o10 = f10.o();
        return o10 != null ? o10.keySet().iterator() : new C4792w(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object A10;
        Object obj2;
        Map o10 = this.f42442a.o();
        if (o10 != null) {
            return o10.keySet().remove(obj);
        }
        A10 = this.f42442a.A(obj);
        obj2 = F.f42484j;
        return A10 != obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f42442a.size();
    }
}
