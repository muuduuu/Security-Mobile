package androidx.lifecycle;

import androidx.lifecycle.AbstractC1592i;
import java.util.Map;
import m.C3632c;
import n.C3701b;

/* renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1604v {

    /* renamed from: k, reason: collision with root package name */
    static final Object f17154k = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Object f17155a;

    /* renamed from: b, reason: collision with root package name */
    private C3701b f17156b;

    /* renamed from: c, reason: collision with root package name */
    int f17157c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f17158d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f17159e;

    /* renamed from: f, reason: collision with root package name */
    volatile Object f17160f;

    /* renamed from: g, reason: collision with root package name */
    private int f17161g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f17162h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17163i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f17164j;

    /* renamed from: androidx.lifecycle.v$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (AbstractC1604v.this.f17155a) {
                obj = AbstractC1604v.this.f17160f;
                AbstractC1604v.this.f17160f = AbstractC1604v.f17154k;
            }
            AbstractC1604v.this.o(obj);
        }
    }

    /* renamed from: androidx.lifecycle.v$b */
    private class b extends d {
        b(InterfaceC1608z interfaceC1608z) {
            super(interfaceC1608z);
        }

        @Override // androidx.lifecycle.AbstractC1604v.d
        boolean e() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.v$c */
    class c extends d implements InterfaceC1596m {

        /* renamed from: e, reason: collision with root package name */
        final InterfaceC1599p f17167e;

        c(InterfaceC1599p interfaceC1599p, InterfaceC1608z interfaceC1608z) {
            super(interfaceC1608z);
            this.f17167e = interfaceC1599p;
        }

        @Override // androidx.lifecycle.AbstractC1604v.d
        void b() {
            this.f17167e.getLifecycle().d(this);
        }

        @Override // androidx.lifecycle.AbstractC1604v.d
        boolean c(InterfaceC1599p interfaceC1599p) {
            return this.f17167e == interfaceC1599p;
        }

        @Override // androidx.lifecycle.InterfaceC1596m
        public void d(InterfaceC1599p interfaceC1599p, AbstractC1592i.a aVar) {
            AbstractC1592i.b b10 = this.f17167e.getLifecycle().b();
            if (b10 == AbstractC1592i.b.DESTROYED) {
                AbstractC1604v.this.n(this.f17169a);
                return;
            }
            AbstractC1592i.b bVar = null;
            while (bVar != b10) {
                a(e());
                bVar = b10;
                b10 = this.f17167e.getLifecycle().b();
            }
        }

        @Override // androidx.lifecycle.AbstractC1604v.d
        boolean e() {
            return this.f17167e.getLifecycle().b().isAtLeast(AbstractC1592i.b.STARTED);
        }
    }

    /* renamed from: androidx.lifecycle.v$d */
    private abstract class d {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC1608z f17169a;

        /* renamed from: b, reason: collision with root package name */
        boolean f17170b;

        /* renamed from: c, reason: collision with root package name */
        int f17171c = -1;

        d(InterfaceC1608z interfaceC1608z) {
            this.f17169a = interfaceC1608z;
        }

        void a(boolean z10) {
            if (z10 == this.f17170b) {
                return;
            }
            this.f17170b = z10;
            AbstractC1604v.this.c(z10 ? 1 : -1);
            if (this.f17170b) {
                AbstractC1604v.this.e(this);
            }
        }

        void b() {
        }

        boolean c(InterfaceC1599p interfaceC1599p) {
            return false;
        }

        abstract boolean e();
    }

    public AbstractC1604v(Object obj) {
        this.f17155a = new Object();
        this.f17156b = new C3701b();
        this.f17157c = 0;
        this.f17160f = f17154k;
        this.f17164j = new a();
        this.f17159e = obj;
        this.f17161g = 0;
    }

    static void b(String str) {
        if (C3632c.h().c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(d dVar) {
        if (dVar.f17170b) {
            if (!dVar.e()) {
                dVar.a(false);
                return;
            }
            int i10 = dVar.f17171c;
            int i11 = this.f17161g;
            if (i10 >= i11) {
                return;
            }
            dVar.f17171c = i11;
            dVar.f17169a.b(this.f17159e);
        }
    }

    void c(int i10) {
        int i11 = this.f17157c;
        this.f17157c = i10 + i11;
        if (this.f17158d) {
            return;
        }
        this.f17158d = true;
        while (true) {
            try {
                int i12 = this.f17157c;
                if (i11 == i12) {
                    this.f17158d = false;
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    k();
                } else if (z11) {
                    l();
                }
                i11 = i12;
            } catch (Throwable th) {
                this.f17158d = false;
                throw th;
            }
        }
    }

    void e(d dVar) {
        if (this.f17162h) {
            this.f17163i = true;
            return;
        }
        this.f17162h = true;
        do {
            this.f17163i = false;
            if (dVar != null) {
                d(dVar);
                dVar = null;
            } else {
                C3701b.d j10 = this.f17156b.j();
                while (j10.hasNext()) {
                    d((d) ((Map.Entry) j10.next()).getValue());
                    if (this.f17163i) {
                        break;
                    }
                }
            }
        } while (this.f17163i);
        this.f17162h = false;
    }

    public Object f() {
        Object obj = this.f17159e;
        if (obj != f17154k) {
            return obj;
        }
        return null;
    }

    int g() {
        return this.f17161g;
    }

    public boolean h() {
        return this.f17157c > 0;
    }

    public void i(InterfaceC1599p interfaceC1599p, InterfaceC1608z interfaceC1608z) {
        b("observe");
        if (interfaceC1599p.getLifecycle().b() == AbstractC1592i.b.DESTROYED) {
            return;
        }
        c cVar = new c(interfaceC1599p, interfaceC1608z);
        d dVar = (d) this.f17156b.r(interfaceC1608z, cVar);
        if (dVar != null && !dVar.c(interfaceC1599p)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        interfaceC1599p.getLifecycle().a(cVar);
    }

    public void j(InterfaceC1608z interfaceC1608z) {
        b("observeForever");
        b bVar = new b(interfaceC1608z);
        d dVar = (d) this.f17156b.r(interfaceC1608z, bVar);
        if (dVar instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        bVar.a(true);
    }

    protected void k() {
    }

    protected void l() {
    }

    protected void m(Object obj) {
        boolean z10;
        synchronized (this.f17155a) {
            z10 = this.f17160f == f17154k;
            this.f17160f = obj;
        }
        if (z10) {
            C3632c.h().d(this.f17164j);
        }
    }

    public void n(InterfaceC1608z interfaceC1608z) {
        b("removeObserver");
        d dVar = (d) this.f17156b.t(interfaceC1608z);
        if (dVar == null) {
            return;
        }
        dVar.b();
        dVar.a(false);
    }

    protected void o(Object obj) {
        b("setValue");
        this.f17161g++;
        this.f17159e = obj;
        e(null);
    }

    public AbstractC1604v() {
        this.f17155a = new Object();
        this.f17156b = new C3701b();
        this.f17157c = 0;
        Object obj = f17154k;
        this.f17160f = obj;
        this.f17164j = new a();
        this.f17159e = obj;
        this.f17161g = -1;
    }
}
