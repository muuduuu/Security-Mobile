package t7;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: t7.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4751q extends AbstractC4764s implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    private transient Map f43196c;

    /* renamed from: d, reason: collision with root package name */
    private transient int f43197d;

    protected AbstractC4751q(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f43196c = map;
    }

    static /* synthetic */ int h(AbstractC4751q abstractC4751q) {
        int i10 = abstractC4751q.f43197d;
        abstractC4751q.f43197d = i10 + 1;
        return i10;
    }

    static /* synthetic */ int i(AbstractC4751q abstractC4751q) {
        int i10 = abstractC4751q.f43197d;
        abstractC4751q.f43197d = i10 - 1;
        return i10;
    }

    static /* synthetic */ int j(AbstractC4751q abstractC4751q, int i10) {
        int i11 = abstractC4751q.f43197d + i10;
        abstractC4751q.f43197d = i11;
        return i11;
    }

    static /* synthetic */ int l(AbstractC4751q abstractC4751q, int i10) {
        int i11 = abstractC4751q.f43197d - i10;
        abstractC4751q.f43197d = i11;
        return i11;
    }

    static /* synthetic */ void p(AbstractC4751q abstractC4751q, Object obj) {
        Object obj2;
        Map map = abstractC4751q.f43196c;
        map.getClass();
        try {
            obj2 = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            abstractC4751q.f43197d -= size;
        }
    }

    @Override // t7.InterfaceC4661d0
    public final boolean c(Object obj, Object obj2) {
        Collection collection = (Collection) this.f43196c.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f43197d++;
            return true;
        }
        Collection f10 = f();
        if (!f10.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f43197d++;
        this.f43196c.put(obj, f10);
        return true;
    }

    @Override // t7.AbstractC4764s
    final Map d() {
        return new C4695i(this, this.f43196c);
    }

    @Override // t7.AbstractC4764s
    final Set e() {
        return new C4709k(this, this.f43196c);
    }

    abstract Collection f();

    abstract Collection g(Object obj, Collection collection);

    public final Collection m(Object obj) {
        Collection collection = (Collection) this.f43196c.get(obj);
        if (collection == null) {
            collection = f();
        }
        return g(obj, collection);
    }

    final List n(Object obj, List list, AbstractC4730n abstractC4730n) {
        return list instanceof RandomAccess ? new C4716l(this, obj, list, abstractC4730n) : new C4744p(this, obj, list, abstractC4730n);
    }

    public final void q() {
        Iterator it = this.f43196c.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f43196c.clear();
        this.f43197d = 0;
    }
}
