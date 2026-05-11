package o2;

import com.bumptech.glide.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o2.n;

/* loaded from: classes.dex */
public class r {

    /* renamed from: e, reason: collision with root package name */
    private static final c f37882e = new c();

    /* renamed from: f, reason: collision with root package name */
    private static final n f37883f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final List f37884a;

    /* renamed from: b, reason: collision with root package name */
    private final c f37885b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f37886c;

    /* renamed from: d, reason: collision with root package name */
    private final y0.d f37887d;

    private static class a implements n {
        a() {
        }

        @Override // o2.n
        public boolean a(Object obj) {
            return false;
        }

        @Override // o2.n
        public n.a b(Object obj, int i10, int i11, i2.h hVar) {
            return null;
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Class f37888a;

        /* renamed from: b, reason: collision with root package name */
        final Class f37889b;

        /* renamed from: c, reason: collision with root package name */
        final o f37890c;

        public b(Class cls, Class cls2, o oVar) {
            this.f37888a = cls;
            this.f37889b = cls2;
            this.f37890c = oVar;
        }

        public boolean a(Class cls) {
            return this.f37888a.isAssignableFrom(cls);
        }

        public boolean b(Class cls, Class cls2) {
            return a(cls) && this.f37889b.isAssignableFrom(cls2);
        }
    }

    static class c {
        c() {
        }

        public q a(List list, y0.d dVar) {
            return new q(list, dVar);
        }
    }

    public r(y0.d dVar) {
        this(dVar, f37882e);
    }

    private void a(Class cls, Class cls2, o oVar, boolean z10) {
        b bVar = new b(cls, cls2, oVar);
        List list = this.f37884a;
        list.add(z10 ? list.size() : 0, bVar);
    }

    private n e(b bVar) {
        return (n) D2.k.d(bVar.f37890c.e(this));
    }

    private static n f() {
        return f37883f;
    }

    private o h(b bVar) {
        return bVar.f37890c;
    }

    synchronized void b(Class cls, Class cls2, o oVar) {
        a(cls, cls2, oVar, true);
    }

    synchronized List c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.f37884a) {
                if (!this.f37886c.contains(bVar) && bVar.a(cls)) {
                    this.f37886c.add(bVar);
                    arrayList.add(e(bVar));
                    this.f37886c.remove(bVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public synchronized n d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b bVar : this.f37884a) {
                if (this.f37886c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f37886c.add(bVar);
                    arrayList.add(e(bVar));
                    this.f37886c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f37885b.a(arrayList, this.f37887d);
            }
            if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            }
            if (!z10) {
                throw new i.c(cls, cls2);
            }
            return f();
        } catch (Throwable th) {
            this.f37886c.clear();
            throw th;
        }
    }

    synchronized List g(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.f37884a) {
            if (!arrayList.contains(bVar.f37889b) && bVar.a(cls)) {
                arrayList.add(bVar.f37889b);
            }
        }
        return arrayList;
    }

    synchronized void i(Class cls, Class cls2, o oVar) {
        a(cls, cls2, oVar, false);
    }

    synchronized List j(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f37884a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.b(cls, cls2)) {
                it.remove();
                arrayList.add(h(bVar));
            }
        }
        return arrayList;
    }

    synchronized List k(Class cls, Class cls2, o oVar) {
        List j10;
        j10 = j(cls, cls2);
        b(cls, cls2, oVar);
        return j10;
    }

    r(y0.d dVar, c cVar) {
        this.f37884a = new ArrayList();
        this.f37886c = new HashSet();
        this.f37887d = dVar;
        this.f37885b = cVar;
    }
}
