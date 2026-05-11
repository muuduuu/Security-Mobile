package D2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final Map f1192a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private final long f1193b;

    /* renamed from: c, reason: collision with root package name */
    private long f1194c;

    /* renamed from: d, reason: collision with root package name */
    private long f1195d;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Object f1196a;

        /* renamed from: b, reason: collision with root package name */
        final int f1197b;

        a(Object obj, int i10) {
            this.f1196a = obj;
            this.f1197b = i10;
        }
    }

    public h(long j10) {
        this.f1193b = j10;
        this.f1194c = j10;
    }

    private void f() {
        m(this.f1194c);
    }

    public void b() {
        m(0L);
    }

    public synchronized Object g(Object obj) {
        a aVar;
        aVar = (a) this.f1192a.get(obj);
        return aVar != null ? aVar.f1196a : null;
    }

    public synchronized long h() {
        return this.f1194c;
    }

    protected int i(Object obj) {
        return 1;
    }

    public synchronized Object k(Object obj, Object obj2) {
        int i10 = i(obj2);
        long j10 = i10;
        if (j10 >= this.f1194c) {
            j(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f1195d += j10;
        }
        a aVar = (a) this.f1192a.put(obj, obj2 == null ? null : new a(obj2, i10));
        if (aVar != null) {
            this.f1195d -= aVar.f1197b;
            if (!aVar.f1196a.equals(obj2)) {
                j(obj, aVar.f1196a);
            }
        }
        f();
        return aVar != null ? aVar.f1196a : null;
    }

    public synchronized Object l(Object obj) {
        a aVar = (a) this.f1192a.remove(obj);
        if (aVar == null) {
            return null;
        }
        this.f1195d -= aVar.f1197b;
        return aVar.f1196a;
    }

    protected synchronized void m(long j10) {
        while (this.f1195d > j10) {
            Iterator it = this.f1192a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f1195d -= aVar.f1197b;
            Object key = entry.getKey();
            it.remove();
            j(key, aVar.f1196a);
        }
    }

    protected void j(Object obj, Object obj2) {
    }
}
