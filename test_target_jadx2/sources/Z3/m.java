package Z3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private final D f12404a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f12405b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    private int f12406c = 0;

    public m(D d10) {
        this.f12404a = d10;
    }

    private int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return this.f12404a.a(obj);
    }

    public synchronized boolean a(Object obj) {
        return this.f12405b.containsKey(obj);
    }

    public synchronized Object b(Object obj) {
        return this.f12405b.get(obj);
    }

    public synchronized int c() {
        return this.f12405b.size();
    }

    public synchronized Object d() {
        return this.f12405b.isEmpty() ? null : this.f12405b.keySet().iterator().next();
    }

    public synchronized ArrayList e(b3.m mVar) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(this.f12405b.entrySet().size());
            for (Map.Entry entry : this.f12405b.entrySet()) {
                if (mVar != null && !mVar.apply(entry.getKey())) {
                }
                arrayList.add(entry);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized int f() {
        return this.f12406c;
    }

    public synchronized Object h(Object obj, Object obj2) {
        Object remove;
        remove = this.f12405b.remove(obj);
        this.f12406c -= g(remove);
        this.f12405b.put(obj, obj2);
        this.f12406c += g(obj2);
        return remove;
    }

    public synchronized Object i(Object obj) {
        Object remove;
        remove = this.f12405b.remove(obj);
        this.f12406c -= g(remove);
        return remove;
    }

    public synchronized ArrayList j(b3.m mVar) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f12405b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (mVar != null && !mVar.apply(entry.getKey())) {
                }
                arrayList.add(entry.getValue());
                this.f12406c -= g(entry.getValue());
                it.remove();
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized void k() {
        if (this.f12405b.isEmpty()) {
            this.f12406c = 0;
        }
    }
}
