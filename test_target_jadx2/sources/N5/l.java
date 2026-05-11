package N5;

import D5.q;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class l extends k {

    /* renamed from: c, reason: collision with root package name */
    protected final F5.l f6558c;

    /* renamed from: d, reason: collision with root package name */
    protected final ConcurrentHashMap f6559d;

    /* renamed from: e, reason: collision with root package name */
    protected final Map f6560e;

    /* renamed from: f, reason: collision with root package name */
    protected final boolean f6561f;

    protected l(F5.l lVar, D5.j jVar, ConcurrentHashMap concurrentHashMap, HashMap hashMap) {
        super(jVar, lVar.z());
        this.f6558c = lVar;
        this.f6559d = concurrentHashMap;
        this.f6560e = hashMap;
        this.f6561f = lVar.D(q.ACCEPT_CASE_INSENSITIVE_VALUES);
    }

    protected static String d(Class cls) {
        String name = cls.getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf < 0 ? name : name.substring(lastIndexOf + 1);
    }

    public static l e(F5.l lVar, D5.j jVar, Collection collection, boolean z10, boolean z11) {
        HashMap hashMap;
        ConcurrentHashMap concurrentHashMap;
        if (z10 == z11) {
            throw new IllegalArgumentException();
        }
        if (z10) {
            concurrentHashMap = new ConcurrentHashMap();
            hashMap = null;
        } else {
            hashMap = new HashMap();
            concurrentHashMap = new ConcurrentHashMap(4);
        }
        boolean D10 = lVar.D(q.ACCEPT_CASE_INSENSITIVE_VALUES);
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                M5.b bVar = (M5.b) it.next();
                Class b10 = bVar.b();
                String a10 = bVar.c() ? bVar.a() : d(b10);
                if (z10) {
                    concurrentHashMap.put(b10.getName(), a10);
                }
                if (z11) {
                    if (D10) {
                        a10 = a10.toLowerCase();
                    }
                    D5.j jVar2 = (D5.j) hashMap.get(a10);
                    if (jVar2 == null || !b10.isAssignableFrom(jVar2.q())) {
                        hashMap.put(a10, lVar.e(b10));
                    }
                }
            }
        }
        return new l(lVar, jVar, concurrentHashMap, hashMap);
    }

    @Override // M5.e
    public String b(Object obj) {
        return f(obj.getClass());
    }

    @Override // M5.e
    public String c(Object obj, Class cls) {
        return obj == null ? f(cls) : b(obj);
    }

    protected String f(Class cls) {
        if (cls == null) {
            return null;
        }
        String name = cls.getName();
        String str = (String) this.f6559d.get(name);
        if (str == null) {
            Class q10 = this.f6556a.C(cls).q();
            if (this.f6558c.C()) {
                str = this.f6558c.g().R(this.f6558c.B(q10).k());
            }
            if (str == null) {
                str = d(q10);
            }
            this.f6559d.put(name, str);
        }
        return str;
    }

    public String toString() {
        return String.format("[%s; id-to-type=%s]", getClass().getName(), this.f6560e);
    }
}
