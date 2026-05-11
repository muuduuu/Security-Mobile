package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public abstract class U implements d0 {

    /* renamed from: a, reason: collision with root package name */
    final Map f20832a;

    /* renamed from: b, reason: collision with root package name */
    private final d0 f20833b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20834c;

    /* renamed from: d, reason: collision with root package name */
    private final String f20835d;

    /* renamed from: e, reason: collision with root package name */
    private final String f20836e;

    class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f20837a;

        /* renamed from: b, reason: collision with root package name */
        private final CopyOnWriteArraySet f20838b = b3.n.a();

        /* renamed from: c, reason: collision with root package name */
        private Closeable f20839c;

        /* renamed from: d, reason: collision with root package name */
        private float f20840d;

        /* renamed from: e, reason: collision with root package name */
        private int f20841e;

        /* renamed from: f, reason: collision with root package name */
        private C1838e f20842f;

        /* renamed from: g, reason: collision with root package name */
        private b f20843g;

        /* renamed from: com.facebook.imagepipeline.producers.U$a$a, reason: collision with other inner class name */
        class C0368a extends AbstractC1839f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Pair f20845a;

            C0368a(Pair pair) {
                this.f20845a = pair;
            }

            @Override // com.facebook.imagepipeline.producers.f0
            public void a() {
                boolean remove;
                List list;
                C1838e c1838e;
                List list2;
                List list3;
                synchronized (a.this) {
                    try {
                        remove = a.this.f20838b.remove(this.f20845a);
                        list = null;
                        if (!remove) {
                            c1838e = null;
                            list2 = null;
                        } else if (a.this.f20838b.isEmpty()) {
                            c1838e = a.this.f20842f;
                            list2 = null;
                        } else {
                            List s10 = a.this.s();
                            list2 = a.this.t();
                            list3 = a.this.r();
                            c1838e = null;
                            list = s10;
                        }
                        list3 = list2;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C1838e.m(list);
                C1838e.s(list2);
                C1838e.k(list3);
                if (c1838e != null) {
                    if (!U.this.f20834c || c1838e.i()) {
                        c1838e.t();
                    } else {
                        C1838e.s(c1838e.x(a4.e.LOW));
                    }
                }
                if (remove) {
                    ((InterfaceC1847n) this.f20845a.first).a();
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC1839f, com.facebook.imagepipeline.producers.f0
            public void b() {
                C1838e.k(a.this.r());
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC1839f, com.facebook.imagepipeline.producers.f0
            public void c() {
                C1838e.s(a.this.t());
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC1839f, com.facebook.imagepipeline.producers.f0
            public void d() {
                C1838e.m(a.this.s());
            }
        }

        private class b extends AbstractC1836c {
            @Override // com.facebook.imagepipeline.producers.AbstractC1836c
            protected void f() {
                try {
                    if (n4.b.d()) {
                        n4.b.a("MultiplexProducer#onCancellation");
                    }
                    a.this.m(this);
                    if (n4.b.d()) {
                        n4.b.b();
                    }
                } catch (Throwable th) {
                    if (n4.b.d()) {
                        n4.b.b();
                    }
                    throw th;
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC1836c
            protected void g(Throwable th) {
                try {
                    if (n4.b.d()) {
                        n4.b.a("MultiplexProducer#onFailure");
                    }
                    a.this.n(this, th);
                    if (n4.b.d()) {
                        n4.b.b();
                    }
                } catch (Throwable th2) {
                    if (n4.b.d()) {
                        n4.b.b();
                    }
                    throw th2;
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC1836c
            protected void i(float f10) {
                try {
                    if (n4.b.d()) {
                        n4.b.a("MultiplexProducer#onProgressUpdate");
                    }
                    a.this.p(this, f10);
                    if (n4.b.d()) {
                        n4.b.b();
                    }
                } catch (Throwable th) {
                    if (n4.b.d()) {
                        n4.b.b();
                    }
                    throw th;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.producers.AbstractC1836c
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public void h(Closeable closeable, int i10) {
                try {
                    if (n4.b.d()) {
                        n4.b.a("MultiplexProducer#onNewResult");
                    }
                    a.this.o(this, closeable, i10);
                    if (n4.b.d()) {
                        n4.b.b();
                    }
                } catch (Throwable th) {
                    if (n4.b.d()) {
                        n4.b.b();
                    }
                    throw th;
                }
            }

            private b() {
            }
        }

        public a(Object obj) {
            this.f20837a = obj;
        }

        private void g(Pair pair, e0 e0Var) {
            e0Var.d(new C0368a(pair));
        }

        private void i(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }

        private synchronized boolean j() {
            Iterator it = this.f20838b.iterator();
            while (it.hasNext()) {
                if (((e0) ((Pair) it.next()).second).q()) {
                    return true;
                }
            }
            return false;
        }

        private synchronized boolean k() {
            Iterator it = this.f20838b.iterator();
            while (it.hasNext()) {
                if (!((e0) ((Pair) it.next()).second).i()) {
                    return false;
                }
            }
            return true;
        }

        private synchronized a4.e l() {
            a4.e eVar;
            eVar = a4.e.LOW;
            Iterator it = this.f20838b.iterator();
            while (it.hasNext()) {
                eVar = a4.e.getHigherPriority(eVar, ((e0) ((Pair) it.next()).second).b());
            }
            return eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(j3.e eVar) {
            synchronized (this) {
                try {
                    b3.l.b(Boolean.valueOf(this.f20842f == null));
                    b3.l.b(Boolean.valueOf(this.f20843g == null));
                    if (this.f20838b.isEmpty()) {
                        U.this.k(this.f20837a, this);
                        return;
                    }
                    e0 e0Var = (e0) ((Pair) this.f20838b.iterator().next()).second;
                    C1838e c1838e = new C1838e(e0Var.c(), e0Var.getId(), e0Var.p(), e0Var.a(), e0Var.r(), k(), j(), l(), e0Var.e());
                    this.f20842f = c1838e;
                    c1838e.g(e0Var.getExtras());
                    if (eVar.isSet()) {
                        this.f20842f.n("started_as_prefetch", Boolean.valueOf(eVar.asBoolean()));
                    }
                    b bVar = new b();
                    this.f20843g = bVar;
                    U.this.f20833b.a(bVar, this.f20842f);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List r() {
            C1838e c1838e = this.f20842f;
            if (c1838e == null) {
                return null;
            }
            return c1838e.v(j());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List s() {
            C1838e c1838e = this.f20842f;
            if (c1838e == null) {
                return null;
            }
            return c1838e.w(k());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List t() {
            C1838e c1838e = this.f20842f;
            if (c1838e == null) {
                return null;
            }
            return c1838e.x(l());
        }

        public boolean h(InterfaceC1847n interfaceC1847n, e0 e0Var) {
            Pair create = Pair.create(interfaceC1847n, e0Var);
            synchronized (this) {
                try {
                    if (U.this.i(this.f20837a) != this) {
                        return false;
                    }
                    this.f20838b.add(create);
                    List s10 = s();
                    List t10 = t();
                    List r10 = r();
                    Closeable closeable = this.f20839c;
                    float f10 = this.f20840d;
                    int i10 = this.f20841e;
                    C1838e.m(s10);
                    C1838e.s(t10);
                    C1838e.k(r10);
                    synchronized (create) {
                        try {
                            synchronized (this) {
                                if (closeable != this.f20839c) {
                                    closeable = null;
                                } else if (closeable != null) {
                                    closeable = U.this.g(closeable);
                                }
                            }
                            if (closeable != null) {
                                if (f10 > 0.0f) {
                                    interfaceC1847n.b(f10);
                                }
                                interfaceC1847n.c(closeable, i10);
                                i(closeable);
                            }
                        } catch (Throwable th) {
                            throw th;
                        } finally {
                        }
                    }
                    g(create, e0Var);
                    return true;
                } finally {
                }
            }
        }

        public void m(b bVar) {
            synchronized (this) {
                try {
                    if (this.f20843g != bVar) {
                        return;
                    }
                    this.f20843g = null;
                    this.f20842f = null;
                    i(this.f20839c);
                    this.f20839c = null;
                    q(j3.e.UNSET);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void n(b bVar, Throwable th) {
            synchronized (this) {
                try {
                    if (this.f20843g != bVar) {
                        return;
                    }
                    Iterator it = this.f20838b.iterator();
                    this.f20838b.clear();
                    U.this.k(this.f20837a, this);
                    i(this.f20839c);
                    this.f20839c = null;
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        synchronized (pair) {
                            ((e0) pair.second).p().k((e0) pair.second, U.this.f20835d, th, null);
                            ((InterfaceC1847n) pair.first).onFailure(th);
                        }
                    }
                } finally {
                }
            }
        }

        public void o(b bVar, Closeable closeable, int i10) {
            synchronized (this) {
                try {
                    if (this.f20843g != bVar) {
                        return;
                    }
                    i(this.f20839c);
                    this.f20839c = null;
                    Iterator it = this.f20838b.iterator();
                    int size = this.f20838b.size();
                    if (AbstractC1836c.e(i10)) {
                        this.f20839c = U.this.g(closeable);
                        this.f20841e = i10;
                    } else {
                        this.f20838b.clear();
                        U.this.k(this.f20837a, this);
                    }
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        synchronized (pair) {
                            try {
                                if (AbstractC1836c.d(i10)) {
                                    ((e0) pair.second).p().j((e0) pair.second, U.this.f20835d, null);
                                    C1838e c1838e = this.f20842f;
                                    if (c1838e != null) {
                                        ((e0) pair.second).g(c1838e.getExtras());
                                    }
                                    ((e0) pair.second).n(U.this.f20836e, Integer.valueOf(size));
                                }
                                ((InterfaceC1847n) pair.first).c(closeable, i10);
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public void p(b bVar, float f10) {
            synchronized (this) {
                try {
                    if (this.f20843g != bVar) {
                        return;
                    }
                    this.f20840d = f10;
                    Iterator it = this.f20838b.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        synchronized (pair) {
                            ((InterfaceC1847n) pair.first).b(f10);
                        }
                    }
                } finally {
                }
            }
        }
    }

    protected U(d0 d0Var, String str, String str2) {
        this(d0Var, str, str2, false);
    }

    private synchronized a h(Object obj) {
        a aVar;
        aVar = new a(obj);
        this.f20832a.put(obj, aVar);
        return aVar;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        a i10;
        boolean z10;
        try {
            if (n4.b.d()) {
                n4.b.a("MultiplexProducer#produceResults");
            }
            e0Var.p().e(e0Var, this.f20835d);
            Object j10 = j(e0Var);
            do {
                synchronized (this) {
                    try {
                        i10 = i(j10);
                        if (i10 == null) {
                            i10 = h(j10);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } finally {
                    }
                }
            } while (!i10.h(interfaceC1847n, e0Var));
            if (z10) {
                i10.q(j3.e.valueOf(e0Var.i()));
            }
            if (n4.b.d()) {
                n4.b.b();
            }
        } catch (Throwable th) {
            if (n4.b.d()) {
                n4.b.b();
            }
            throw th;
        }
    }

    protected abstract Closeable g(Closeable closeable);

    protected synchronized a i(Object obj) {
        return (a) this.f20832a.get(obj);
    }

    protected abstract Object j(e0 e0Var);

    protected synchronized void k(Object obj, a aVar) {
        if (this.f20832a.get(obj) == aVar) {
            this.f20832a.remove(obj);
        }
    }

    protected U(d0 d0Var, String str, String str2, boolean z10) {
        this.f20833b = d0Var;
        this.f20832a = new HashMap();
        this.f20834c = z10;
        this.f20835d = str;
        this.f20836e = str2;
    }
}
