package k2;

import E2.a;
import i2.EnumC3313a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import k2.h;
import k2.p;
import n2.ExecutorServiceC3704a;

/* loaded from: classes.dex */
class l implements h.b, a.f {

    /* renamed from: z, reason: collision with root package name */
    private static final c f36103z = new c();

    /* renamed from: a, reason: collision with root package name */
    final e f36104a;

    /* renamed from: b, reason: collision with root package name */
    private final E2.c f36105b;

    /* renamed from: c, reason: collision with root package name */
    private final p.a f36106c;

    /* renamed from: d, reason: collision with root package name */
    private final y0.d f36107d;

    /* renamed from: e, reason: collision with root package name */
    private final c f36108e;

    /* renamed from: f, reason: collision with root package name */
    private final m f36109f;

    /* renamed from: g, reason: collision with root package name */
    private final ExecutorServiceC3704a f36110g;

    /* renamed from: h, reason: collision with root package name */
    private final ExecutorServiceC3704a f36111h;

    /* renamed from: i, reason: collision with root package name */
    private final ExecutorServiceC3704a f36112i;

    /* renamed from: j, reason: collision with root package name */
    private final ExecutorServiceC3704a f36113j;

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f36114k;

    /* renamed from: l, reason: collision with root package name */
    private i2.f f36115l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f36116m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f36117n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f36118o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f36119p;

    /* renamed from: q, reason: collision with root package name */
    private v f36120q;

    /* renamed from: r, reason: collision with root package name */
    EnumC3313a f36121r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f36122s;

    /* renamed from: t, reason: collision with root package name */
    q f36123t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f36124u;

    /* renamed from: v, reason: collision with root package name */
    p f36125v;

    /* renamed from: w, reason: collision with root package name */
    private h f36126w;

    /* renamed from: x, reason: collision with root package name */
    private volatile boolean f36127x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f36128y;

    private class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.request.i f36129a;

        a(com.bumptech.glide.request.i iVar) {
            this.f36129a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f36129a.d()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f36104a.e(this.f36129a)) {
                            l.this.f(this.f36129a);
                        }
                        l.this.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    private class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.request.i f36131a;

        b(com.bumptech.glide.request.i iVar) {
            this.f36131a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f36131a.d()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f36104a.e(this.f36131a)) {
                            l.this.f36125v.b();
                            l.this.g(this.f36131a);
                            l.this.r(this.f36131a);
                        }
                        l.this.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    static class c {
        c() {
        }

        public p a(v vVar, boolean z10, i2.f fVar, p.a aVar) {
            return new p(vVar, z10, true, fVar, aVar);
        }
    }

    static final class d {

        /* renamed from: a, reason: collision with root package name */
        final com.bumptech.glide.request.i f36133a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f36134b;

        d(com.bumptech.glide.request.i iVar, Executor executor) {
            this.f36133a = iVar;
            this.f36134b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f36133a.equals(((d) obj).f36133a);
            }
            return false;
        }

        public int hashCode() {
            return this.f36133a.hashCode();
        }
    }

    static final class e implements Iterable {

        /* renamed from: a, reason: collision with root package name */
        private final List f36135a;

        e() {
            this(new ArrayList(2));
        }

        private static d j(com.bumptech.glide.request.i iVar) {
            return new d(iVar, D2.e.a());
        }

        void c(com.bumptech.glide.request.i iVar, Executor executor) {
            this.f36135a.add(new d(iVar, executor));
        }

        void clear() {
            this.f36135a.clear();
        }

        boolean e(com.bumptech.glide.request.i iVar) {
            return this.f36135a.contains(j(iVar));
        }

        e h() {
            return new e(new ArrayList(this.f36135a));
        }

        boolean isEmpty() {
            return this.f36135a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f36135a.iterator();
        }

        void k(com.bumptech.glide.request.i iVar) {
            this.f36135a.remove(j(iVar));
        }

        int size() {
            return this.f36135a.size();
        }

        e(List list) {
            this.f36135a = list;
        }
    }

    l(ExecutorServiceC3704a executorServiceC3704a, ExecutorServiceC3704a executorServiceC3704a2, ExecutorServiceC3704a executorServiceC3704a3, ExecutorServiceC3704a executorServiceC3704a4, m mVar, p.a aVar, y0.d dVar) {
        this(executorServiceC3704a, executorServiceC3704a2, executorServiceC3704a3, executorServiceC3704a4, mVar, aVar, dVar, f36103z);
    }

    private ExecutorServiceC3704a j() {
        return this.f36117n ? this.f36112i : this.f36118o ? this.f36113j : this.f36111h;
    }

    private boolean m() {
        return this.f36124u || this.f36122s || this.f36127x;
    }

    private synchronized void q() {
        if (this.f36115l == null) {
            throw new IllegalArgumentException();
        }
        this.f36104a.clear();
        this.f36115l = null;
        this.f36125v = null;
        this.f36120q = null;
        this.f36124u = false;
        this.f36127x = false;
        this.f36122s = false;
        this.f36128y = false;
        this.f36126w.F(false);
        this.f36126w = null;
        this.f36123t = null;
        this.f36121r = null;
        this.f36107d.a(this);
    }

    @Override // k2.h.b
    public void a(q qVar) {
        synchronized (this) {
            this.f36123t = qVar;
        }
        n();
    }

    @Override // k2.h.b
    public void b(v vVar, EnumC3313a enumC3313a, boolean z10) {
        synchronized (this) {
            this.f36120q = vVar;
            this.f36121r = enumC3313a;
            this.f36128y = z10;
        }
        o();
    }

    @Override // k2.h.b
    public void c(h hVar) {
        j().execute(hVar);
    }

    synchronized void d(com.bumptech.glide.request.i iVar, Executor executor) {
        try {
            this.f36105b.c();
            this.f36104a.c(iVar, executor);
            if (this.f36122s) {
                k(1);
                executor.execute(new b(iVar));
            } else if (this.f36124u) {
                k(1);
                executor.execute(new a(iVar));
            } else {
                D2.k.a(!this.f36127x, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // E2.a.f
    public E2.c e() {
        return this.f36105b;
    }

    void f(com.bumptech.glide.request.i iVar) {
        try {
            iVar.a(this.f36123t);
        } catch (Throwable th) {
            throw new C3532b(th);
        }
    }

    void g(com.bumptech.glide.request.i iVar) {
        try {
            iVar.b(this.f36125v, this.f36121r, this.f36128y);
        } catch (Throwable th) {
            throw new C3532b(th);
        }
    }

    void h() {
        if (m()) {
            return;
        }
        this.f36127x = true;
        this.f36126w.n();
        this.f36109f.c(this, this.f36115l);
    }

    void i() {
        p pVar;
        synchronized (this) {
            try {
                this.f36105b.c();
                D2.k.a(m(), "Not yet complete!");
                int decrementAndGet = this.f36114k.decrementAndGet();
                D2.k.a(decrementAndGet >= 0, "Can't decrement below 0");
                if (decrementAndGet == 0) {
                    pVar = this.f36125v;
                    q();
                } else {
                    pVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (pVar != null) {
            pVar.e();
        }
    }

    synchronized void k(int i10) {
        p pVar;
        D2.k.a(m(), "Not yet complete!");
        if (this.f36114k.getAndAdd(i10) == 0 && (pVar = this.f36125v) != null) {
            pVar.b();
        }
    }

    synchronized l l(i2.f fVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f36115l = fVar;
        this.f36116m = z10;
        this.f36117n = z11;
        this.f36118o = z12;
        this.f36119p = z13;
        return this;
    }

    void n() {
        synchronized (this) {
            try {
                this.f36105b.c();
                if (this.f36127x) {
                    q();
                    return;
                }
                if (this.f36104a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f36124u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f36124u = true;
                i2.f fVar = this.f36115l;
                e h10 = this.f36104a.h();
                k(h10.size() + 1);
                this.f36109f.b(this, fVar, null);
                Iterator it = h10.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    dVar.f36134b.execute(new a(dVar.f36133a));
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void o() {
        synchronized (this) {
            try {
                this.f36105b.c();
                if (this.f36127x) {
                    this.f36120q.recycle();
                    q();
                    return;
                }
                if (this.f36104a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f36122s) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f36125v = this.f36108e.a(this.f36120q, this.f36116m, this.f36115l, this.f36106c);
                this.f36122s = true;
                e h10 = this.f36104a.h();
                k(h10.size() + 1);
                this.f36109f.b(this, this.f36115l, this.f36125v);
                Iterator it = h10.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    dVar.f36134b.execute(new b(dVar.f36133a));
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean p() {
        return this.f36119p;
    }

    synchronized void r(com.bumptech.glide.request.i iVar) {
        try {
            this.f36105b.c();
            this.f36104a.k(iVar);
            if (this.f36104a.isEmpty()) {
                h();
                if (!this.f36122s) {
                    if (this.f36124u) {
                    }
                }
                if (this.f36114k.get() == 0) {
                    q();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void s(h hVar) {
        try {
            this.f36126w = hVar;
            (hVar.M() ? this.f36110g : j()).execute(hVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    l(ExecutorServiceC3704a executorServiceC3704a, ExecutorServiceC3704a executorServiceC3704a2, ExecutorServiceC3704a executorServiceC3704a3, ExecutorServiceC3704a executorServiceC3704a4, m mVar, p.a aVar, y0.d dVar, c cVar) {
        this.f36104a = new e();
        this.f36105b = E2.c.a();
        this.f36114k = new AtomicInteger();
        this.f36110g = executorServiceC3704a;
        this.f36111h = executorServiceC3704a2;
        this.f36112i = executorServiceC3704a3;
        this.f36113j = executorServiceC3704a4;
        this.f36109f = mVar;
        this.f36106c = aVar;
        this.f36107d = dVar;
        this.f36108e = cVar;
    }
}
