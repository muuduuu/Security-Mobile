package f3;

import b3.l;
import c3.AbstractC1721a;
import java.util.IdentityHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class i {

    /* renamed from: d, reason: collision with root package name */
    private static final Map f32874d = new IdentityHashMap();

    /* renamed from: a, reason: collision with root package name */
    private Object f32875a;

    /* renamed from: b, reason: collision with root package name */
    private int f32876b = 1;

    /* renamed from: c, reason: collision with root package name */
    private final h f32877c;

    public static class a extends RuntimeException {
        public a() {
            super("Null shared reference");
        }
    }

    public i(Object obj, h hVar, boolean z10) {
        this.f32875a = l.g(obj);
        this.f32877c = hVar;
        if (z10) {
            a(obj);
        }
    }

    private static void a(Object obj) {
        Map map = f32874d;
        synchronized (map) {
            try {
                Integer num = (Integer) map.get(obj);
                if (num == null) {
                    map.put(obj, 1);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() + 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized int c() {
        int i10;
        e();
        l.b(Boolean.valueOf(this.f32876b > 0));
        i10 = this.f32876b - 1;
        this.f32876b = i10;
        return i10;
    }

    private void e() {
        if (!h(this)) {
            throw new a();
        }
    }

    public static boolean h(i iVar) {
        return iVar != null && iVar.g();
    }

    private static void i(Object obj) {
        Map map = f32874d;
        synchronized (map) {
            try {
                Integer num = (Integer) map.get(obj);
                if (num == null) {
                    AbstractC1721a.P("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
                } else if (num.intValue() == 1) {
                    map.remove(obj);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void b() {
        e();
        this.f32876b++;
    }

    public void d() {
        Object obj;
        if (c() == 0) {
            synchronized (this) {
                obj = this.f32875a;
                this.f32875a = null;
            }
            if (obj != null) {
                h hVar = this.f32877c;
                if (hVar != null) {
                    hVar.a(obj);
                }
                i(obj);
            }
        }
    }

    public synchronized Object f() {
        return this.f32875a;
    }

    public synchronized boolean g() {
        return this.f32876b > 0;
    }
}
