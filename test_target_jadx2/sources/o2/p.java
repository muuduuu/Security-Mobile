package o2;

import com.bumptech.glide.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final r f37869a;

    /* renamed from: b, reason: collision with root package name */
    private final a f37870b;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map f37871a = new HashMap();

        /* renamed from: o2.p$a$a, reason: collision with other inner class name */
        private static class C0580a {

            /* renamed from: a, reason: collision with root package name */
            final List f37872a;

            public C0580a(List list) {
                this.f37872a = list;
            }
        }

        a() {
        }

        public void a() {
            this.f37871a.clear();
        }

        public List b(Class cls) {
            C0580a c0580a = (C0580a) this.f37871a.get(cls);
            if (c0580a == null) {
                return null;
            }
            return c0580a.f37872a;
        }

        public void c(Class cls, List list) {
            if (((C0580a) this.f37871a.put(cls, new C0580a(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public p(y0.d dVar) {
        this(new r(dVar));
    }

    private static Class b(Object obj) {
        return obj.getClass();
    }

    private synchronized List e(Class cls) {
        List b10;
        b10 = this.f37870b.b(cls);
        if (b10 == null) {
            b10 = Collections.unmodifiableList(this.f37869a.c(cls));
            this.f37870b.c(cls, b10);
        }
        return b10;
    }

    private void h(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((o) it.next()).d();
        }
    }

    public synchronized void a(Class cls, Class cls2, o oVar) {
        this.f37869a.b(cls, cls2, oVar);
        this.f37870b.a();
    }

    public synchronized List c(Class cls) {
        return this.f37869a.g(cls);
    }

    public List d(Object obj) {
        List e10 = e(b(obj));
        if (e10.isEmpty()) {
            throw new i.c(obj);
        }
        int size = e10.size();
        List emptyList = Collections.emptyList();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) e10.get(i10);
            if (nVar.a(obj)) {
                if (z10) {
                    emptyList = new ArrayList(size - i10);
                    z10 = false;
                }
                emptyList.add(nVar);
            }
        }
        if (emptyList.isEmpty()) {
            throw new i.c(obj, e10);
        }
        return emptyList;
    }

    public synchronized void f(Class cls, Class cls2, o oVar) {
        this.f37869a.i(cls, cls2, oVar);
        this.f37870b.a();
    }

    public synchronized void g(Class cls, Class cls2, o oVar) {
        h(this.f37869a.k(cls, cls2, oVar));
        this.f37870b.a();
    }

    private p(r rVar) {
        this.f37870b = new a();
        this.f37869a = rVar;
    }
}
