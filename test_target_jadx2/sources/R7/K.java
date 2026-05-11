package r7;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes2.dex */
abstract class K extends M implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    private final transient Map f39465c;

    /* renamed from: d, reason: collision with root package name */
    private transient int f39466d;

    protected K(Map map) {
        AbstractC4248w.c(map.isEmpty());
        this.f39465c = map;
    }

    static /* bridge */ /* synthetic */ void l(K k10, Object obj) {
        Object obj2;
        try {
            obj2 = k10.f39465c.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            k10.f39466d -= size;
        }
    }

    @Override // r7.InterfaceC4259x0
    public final boolean a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f39465c.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f39466d++;
            return true;
        }
        Collection e10 = e();
        if (!e10.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f39466d++;
        this.f39465c.put(obj, e10);
        return true;
    }

    @Override // r7.M
    final Map b() {
        return new C(this, this.f39465c);
    }

    @Override // r7.M
    final Set d() {
        return new E(this, this.f39465c);
    }

    abstract Collection e();

    abstract Collection f(Object obj, Collection collection);

    public final Collection h(Object obj) {
        Collection collection = (Collection) this.f39465c.get(obj);
        if (collection == null) {
            collection = e();
        }
        return f(obj, collection);
    }

    final List i(Object obj, List list, H h10) {
        return list instanceof RandomAccess ? new F(this, obj, list, h10) : new J(this, obj, list, h10);
    }

    public final void m() {
        Iterator it = this.f39465c.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f39465c.clear();
        this.f39466d = 0;
    }
}
