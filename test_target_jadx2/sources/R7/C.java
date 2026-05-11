package r7;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
final class C extends AbstractC4239v0 {

    /* renamed from: c, reason: collision with root package name */
    final transient Map f39299c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ K f39300d;

    C(K k10, Map map) {
        this.f39300d = k10;
        this.f39299c = map;
    }

    @Override // r7.AbstractC4239v0
    protected final Set a() {
        return new C4028A(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Collection get(Object obj) {
        Collection collection = (Collection) AbstractC4249w0.a(this.f39299c, obj);
        if (collection == null) {
            return null;
        }
        return this.f39300d.f(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        Map map2 = this.f39299c;
        K k10 = this.f39300d;
        map = k10.f39465c;
        if (map2 == map) {
            k10.m();
        } else {
            AbstractC4180p0.a(new B(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return AbstractC4249w0.b(this.f39299c, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f39299c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f39299c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f39300d.w();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        int i10;
        Collection collection = (Collection) this.f39299c.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection e10 = this.f39300d.e();
        e10.addAll(collection);
        K k10 = this.f39300d;
        i10 = k10.f39466d;
        k10.f39466d = i10 - collection.size();
        collection.clear();
        return e10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f39299c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f39299c.toString();
    }
}
