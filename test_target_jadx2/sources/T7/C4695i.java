package t7;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: t7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4695i extends AbstractC4640a0 {

    /* renamed from: c, reason: collision with root package name */
    final transient Map f42989c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC4751q f42990d;

    C4695i(AbstractC4751q abstractC4751q, Map map) {
        this.f42990d = abstractC4751q;
        this.f42989c = map;
    }

    @Override // t7.AbstractC4640a0
    protected final Set a() {
        return new C4681g(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        Map map2 = this.f42989c;
        AbstractC4751q abstractC4751q = this.f42990d;
        map = abstractC4751q.f43196c;
        if (map2 == map) {
            abstractC4751q.q();
        } else {
            U.a(new C4688h(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return AbstractC4647b0.b(this.f42989c, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f42989c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) AbstractC4647b0.a(this.f42989c, obj);
        if (collection == null) {
            return null;
        }
        return this.f42990d.g(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f42989c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f42990d.k();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f42989c.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection f10 = this.f42990d.f();
        f10.addAll(collection);
        AbstractC4751q.l(this.f42990d, collection.size());
        collection.clear();
        return f10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f42989c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f42989c.toString();
    }
}
