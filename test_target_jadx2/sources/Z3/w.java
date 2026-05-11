package Z3;

import Z3.n;
import Z3.x;
import android.os.SystemClock;
import f3.AbstractC3142a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class w implements n, x {

    /* renamed from: a, reason: collision with root package name */
    private final n.b f12422a;

    /* renamed from: b, reason: collision with root package name */
    final m f12423b;

    /* renamed from: c, reason: collision with root package name */
    final m f12424c;

    /* renamed from: e, reason: collision with root package name */
    private final D f12426e;

    /* renamed from: f, reason: collision with root package name */
    private final x.a f12427f;

    /* renamed from: g, reason: collision with root package name */
    private final b3.o f12428g;

    /* renamed from: h, reason: collision with root package name */
    protected y f12429h;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f12431j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f12432k;

    /* renamed from: d, reason: collision with root package name */
    final Map f12425d = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    private long f12430i = SystemClock.uptimeMillis();

    class a implements D {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ D f12433a;

        a(D d10) {
            this.f12433a = d10;
        }

        @Override // Z3.D
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(n.a aVar) {
            return w.this.f12431j ? aVar.f12413g : this.f12433a.a(aVar.f12408b.p());
        }
    }

    class b implements f3.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n.a f12435a;

        b(n.a aVar) {
            this.f12435a = aVar;
        }

        @Override // f3.h
        public void a(Object obj) {
            w.this.z(this.f12435a);
        }
    }

    public w(D d10, x.a aVar, b3.o oVar, n.b bVar, boolean z10, boolean z11) {
        this.f12426e = d10;
        this.f12423b = new m(B(d10));
        this.f12424c = new m(B(d10));
        this.f12427f = aVar;
        this.f12428g = oVar;
        this.f12429h = (y) b3.l.h((y) oVar.get(), "mMemoryCacheParamsSupplier returned null");
        this.f12422a = bVar;
        this.f12431j = z10;
        this.f12432k = z11;
    }

    private synchronized ArrayList A(int i10, int i11) {
        int max = Math.max(i10, 0);
        int max2 = Math.max(i11, 0);
        if (this.f12423b.c() <= max && this.f12423b.f() <= max2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (this.f12423b.c() <= max && this.f12423b.f() <= max2) {
                break;
            }
            Object d10 = this.f12423b.d();
            if (d10 != null) {
                this.f12423b.i(d10);
                arrayList.add((n.a) this.f12424c.i(d10));
            } else {
                if (!this.f12432k) {
                    throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", Integer.valueOf(this.f12423b.c()), Integer.valueOf(this.f12423b.f())));
                }
                this.f12423b.k();
            }
        }
        return arrayList;
    }

    private D B(D d10) {
        return new a(d10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (m() <= (r3.f12429h.f12437a - r4)) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized boolean j(int i10) {
        boolean z10;
        if (i10 <= this.f12429h.f12441e) {
            z10 = true;
            if (l() <= this.f12429h.f12438b - 1) {
            }
        }
        z10 = false;
        return z10;
    }

    private synchronized void k(n.a aVar) {
        b3.l.g(aVar);
        b3.l.i(aVar.f12409c > 0);
        aVar.f12409c--;
    }

    private synchronized void n(n.a aVar) {
        b3.l.g(aVar);
        b3.l.i(!aVar.f12410d);
        aVar.f12409c++;
    }

    private synchronized void o(n.a aVar) {
        b3.l.g(aVar);
        b3.l.i(!aVar.f12410d);
        aVar.f12410d = true;
    }

    private synchronized void p(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                o((n.a) it.next());
            }
        }
    }

    private synchronized boolean q(n.a aVar) {
        if (aVar.f12410d || aVar.f12409c != 0) {
            return false;
        }
        this.f12423b.h(aVar.f12407a, aVar);
        return true;
    }

    private void r(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC3142a.n(y((n.a) it.next()));
            }
        }
    }

    private static void t(n.a aVar) {
        n.b bVar;
        if (aVar == null || (bVar = aVar.f12411e) == null) {
            return;
        }
        bVar.a(aVar.f12407a, true);
    }

    private static void u(n.a aVar) {
        n.b bVar;
        if (aVar == null || (bVar = aVar.f12411e) == null) {
            return;
        }
        bVar.a(aVar.f12407a, false);
    }

    private void v(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                u((n.a) it.next());
            }
        }
    }

    private synchronized void w() {
        if (this.f12430i + this.f12429h.f12442f > SystemClock.uptimeMillis()) {
            return;
        }
        this.f12430i = SystemClock.uptimeMillis();
        this.f12429h = (y) b3.l.h((y) this.f12428g.get(), "mMemoryCacheParamsSupplier returned null");
    }

    private synchronized AbstractC3142a x(n.a aVar) {
        n(aVar);
        return AbstractC3142a.C(aVar.f12408b.p(), new b(aVar));
    }

    private synchronized AbstractC3142a y(n.a aVar) {
        b3.l.g(aVar);
        return (aVar.f12410d && aVar.f12409c == 0) ? aVar.f12408b : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(n.a aVar) {
        boolean q10;
        AbstractC3142a y10;
        b3.l.g(aVar);
        synchronized (this) {
            k(aVar);
            q10 = q(aVar);
            y10 = y(aVar);
        }
        AbstractC3142a.n(y10);
        if (!q10) {
            aVar = null;
        }
        t(aVar);
        w();
        s();
    }

    @Override // Z3.n
    public AbstractC3142a b(Object obj, AbstractC3142a abstractC3142a, n.b bVar) {
        n.a aVar;
        AbstractC3142a abstractC3142a2;
        AbstractC3142a abstractC3142a3;
        b3.l.g(obj);
        b3.l.g(abstractC3142a);
        w();
        synchronized (this) {
            try {
                aVar = (n.a) this.f12423b.i(obj);
                n.a aVar2 = (n.a) this.f12424c.i(obj);
                abstractC3142a2 = null;
                if (aVar2 != null) {
                    o(aVar2);
                    abstractC3142a3 = y(aVar2);
                } else {
                    abstractC3142a3 = null;
                }
                int a10 = this.f12426e.a(abstractC3142a.p());
                if (j(a10)) {
                    n.a a11 = this.f12431j ? n.a.a(obj, abstractC3142a, a10, bVar) : n.a.b(obj, abstractC3142a, bVar);
                    this.f12424c.h(obj, a11);
                    abstractC3142a2 = x(a11);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC3142a.n(abstractC3142a3);
        u(aVar);
        s();
        return abstractC3142a2;
    }

    @Override // Z3.x
    public void c(Object obj) {
        b3.l.g(obj);
        synchronized (this) {
            try {
                n.a aVar = (n.a) this.f12423b.i(obj);
                if (aVar != null) {
                    this.f12423b.h(obj, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Z3.x
    public synchronized boolean contains(Object obj) {
        return this.f12424c.a(obj);
    }

    @Override // Z3.n
    public AbstractC3142a d(Object obj) {
        n.a aVar;
        boolean z10;
        AbstractC3142a abstractC3142a;
        b3.l.g(obj);
        synchronized (this) {
            try {
                aVar = (n.a) this.f12423b.i(obj);
                if (aVar != null) {
                    n.a aVar2 = (n.a) this.f12424c.i(obj);
                    b3.l.g(aVar2);
                    b3.l.i(aVar2.f12409c == 0);
                    abstractC3142a = aVar2.f12408b;
                    z10 = true;
                } else {
                    abstractC3142a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            u(aVar);
        }
        return abstractC3142a;
    }

    @Override // Z3.x
    public AbstractC3142a e(Object obj, AbstractC3142a abstractC3142a) {
        return b(obj, abstractC3142a, this.f12422a);
    }

    @Override // Z3.x
    public int f(b3.m mVar) {
        ArrayList j10;
        ArrayList j11;
        synchronized (this) {
            j10 = this.f12423b.j(mVar);
            j11 = this.f12424c.j(mVar);
            p(j11);
        }
        r(j11);
        v(j10);
        w();
        s();
        return j11.size();
    }

    @Override // Z3.x
    public synchronized boolean g(b3.m mVar) {
        return !this.f12424c.e(mVar).isEmpty();
    }

    @Override // Z3.x
    public AbstractC3142a get(Object obj) {
        n.a aVar;
        AbstractC3142a x10;
        b3.l.g(obj);
        synchronized (this) {
            try {
                aVar = (n.a) this.f12423b.i(obj);
                n.a aVar2 = (n.a) this.f12424c.b(obj);
                x10 = aVar2 != null ? x(aVar2) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        u(aVar);
        w();
        s();
        return x10;
    }

    public synchronized int l() {
        return this.f12424c.c() - this.f12423b.c();
    }

    public synchronized int m() {
        return this.f12424c.f() - this.f12423b.f();
    }

    public void s() {
        ArrayList A10;
        synchronized (this) {
            y yVar = this.f12429h;
            int min = Math.min(yVar.f12440d, yVar.f12438b - l());
            y yVar2 = this.f12429h;
            A10 = A(min, Math.min(yVar2.f12439c, yVar2.f12437a - m()));
            p(A10);
        }
        r(A10);
        v(A10);
    }
}
