package Ba;

import Ea.k;
import Ea.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Map f551a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f552b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final List f553c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f554d = false;

    public b(Collection collection, Collection collection2) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            e((Ea.d) it.next());
        }
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            android.support.v4.media.session.b.a(it2.next());
            f(null);
        }
    }

    public synchronized void a() {
        if (!this.f554d) {
            c();
            this.f554d = true;
        }
    }

    public Object b(Class cls) {
        return this.f551a.get(cls);
    }

    public void c() {
        ArrayList arrayList = new ArrayList(this.f551a.values());
        Iterator it = this.f553c.iterator();
        while (it.hasNext()) {
            k kVar = (k) ((WeakReference) it.next()).get();
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((k) it2.next()).i(this);
        }
    }

    public void d() {
        ArrayList arrayList = new ArrayList(this.f551a.values());
        Iterator it = this.f553c.iterator();
        while (it.hasNext()) {
            k kVar = (k) ((WeakReference) it.next()).get();
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((k) it2.next()).c();
        }
    }

    public void e(Ea.d dVar) {
        Iterator it = dVar.e().iterator();
        while (it.hasNext()) {
            this.f551a.put((Class) it.next(), dVar);
        }
    }

    public void f(l lVar) {
        this.f552b.put(lVar.getName(), lVar);
    }
}
