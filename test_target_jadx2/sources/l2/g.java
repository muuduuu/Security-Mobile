package l2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private final a f37014a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Map f37015b = new HashMap();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final Object f37016a;

        /* renamed from: b, reason: collision with root package name */
        private List f37017b;

        /* renamed from: c, reason: collision with root package name */
        a f37018c;

        /* renamed from: d, reason: collision with root package name */
        a f37019d;

        a() {
            this(null);
        }

        public void a(Object obj) {
            if (this.f37017b == null) {
                this.f37017b = new ArrayList();
            }
            this.f37017b.add(obj);
        }

        public Object b() {
            int c10 = c();
            if (c10 > 0) {
                return this.f37017b.remove(c10 - 1);
            }
            return null;
        }

        public int c() {
            List list = this.f37017b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(Object obj) {
            this.f37019d = this;
            this.f37018c = this;
            this.f37016a = obj;
        }
    }

    g() {
    }

    private void b(a aVar) {
        e(aVar);
        a aVar2 = this.f37014a;
        aVar.f37019d = aVar2;
        aVar.f37018c = aVar2.f37018c;
        g(aVar);
    }

    private void c(a aVar) {
        e(aVar);
        a aVar2 = this.f37014a;
        aVar.f37019d = aVar2.f37019d;
        aVar.f37018c = aVar2;
        g(aVar);
    }

    private static void e(a aVar) {
        a aVar2 = aVar.f37019d;
        aVar2.f37018c = aVar.f37018c;
        aVar.f37018c.f37019d = aVar2;
    }

    private static void g(a aVar) {
        aVar.f37018c.f37019d = aVar;
        aVar.f37019d.f37018c = aVar;
    }

    public Object a(m mVar) {
        a aVar = (a) this.f37015b.get(mVar);
        if (aVar == null) {
            aVar = new a(mVar);
            this.f37015b.put(mVar, aVar);
        } else {
            mVar.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(m mVar, Object obj) {
        a aVar = (a) this.f37015b.get(mVar);
        if (aVar == null) {
            aVar = new a(mVar);
            c(aVar);
            this.f37015b.put(mVar, aVar);
        } else {
            mVar.a();
        }
        aVar.a(obj);
    }

    public Object f() {
        for (a aVar = this.f37014a.f37019d; !aVar.equals(this.f37014a); aVar = aVar.f37019d) {
            Object b10 = aVar.b();
            if (b10 != null) {
                return b10;
            }
            e(aVar);
            this.f37015b.remove(aVar.f37016a);
            ((m) aVar.f37016a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f37014a.f37018c;
        boolean z10 = false;
        while (!aVar.equals(this.f37014a)) {
            sb2.append('{');
            sb2.append(aVar.f37016a);
            sb2.append(':');
            sb2.append(aVar.c());
            sb2.append("}, ");
            aVar = aVar.f37018c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
