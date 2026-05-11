package io.sentry;

import io.sentry.O0;
import io.sentry.protocol.C3443c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class X1 implements T {

    /* renamed from: b, reason: collision with root package name */
    private final b2 f34574b;

    /* renamed from: d, reason: collision with root package name */
    private final L f34576d;

    /* renamed from: e, reason: collision with root package name */
    private String f34577e;

    /* renamed from: g, reason: collision with root package name */
    private volatile TimerTask f34579g;

    /* renamed from: h, reason: collision with root package name */
    private volatile Timer f34580h;

    /* renamed from: k, reason: collision with root package name */
    private final C3402d f34583k;

    /* renamed from: l, reason: collision with root package name */
    private io.sentry.protocol.A f34584l;

    /* renamed from: m, reason: collision with root package name */
    private final Map f34585m;

    /* renamed from: n, reason: collision with root package name */
    private final W f34586n;

    /* renamed from: p, reason: collision with root package name */
    private final r2 f34588p;

    /* renamed from: q, reason: collision with root package name */
    private final q2 f34589q;

    /* renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.r f34573a = new io.sentry.protocol.r();

    /* renamed from: c, reason: collision with root package name */
    private final List f34575c = new CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    private b f34578f = b.f34591c;

    /* renamed from: i, reason: collision with root package name */
    private final Object f34581i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f34582j = new AtomicBoolean(false);

    /* renamed from: o, reason: collision with root package name */
    private final C3443c f34587o = new C3443c();

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            X1.this.B();
        }
    }

    private static final class b {

        /* renamed from: c, reason: collision with root package name */
        static final b f34591c = d();

        /* renamed from: a, reason: collision with root package name */
        private final boolean f34592a;

        /* renamed from: b, reason: collision with root package name */
        private final g2 f34593b;

        private b(boolean z10, g2 g2Var) {
            this.f34592a = z10;
            this.f34593b = g2Var;
        }

        static b c(g2 g2Var) {
            return new b(true, g2Var);
        }

        private static b d() {
            return new b(false, null);
        }
    }

    X1(o2 o2Var, L l10, q2 q2Var, r2 r2Var) {
        this.f34580h = null;
        io.sentry.util.n.c(o2Var, "context is required");
        io.sentry.util.n.c(l10, "hub is required");
        this.f34585m = new ConcurrentHashMap();
        this.f34574b = new b2(o2Var, this, l10, q2Var.g(), q2Var);
        this.f34577e = o2Var.t();
        this.f34586n = o2Var.s();
        this.f34576d = l10;
        this.f34588p = r2Var;
        this.f34584l = o2Var.v();
        this.f34589q = q2Var;
        if (o2Var.r() != null) {
            this.f34583k = o2Var.r();
        } else {
            this.f34583k = new C3402d(l10.D().getLogger());
        }
        if (r2Var != null && Boolean.TRUE.equals(J())) {
            r2Var.b(this);
        }
        if (q2Var.f() != null) {
            this.f34580h = new Timer(true);
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        g2 c10 = c();
        if (c10 == null) {
            c10 = g2.OK;
        }
        e(c10);
        this.f34582j.set(false);
    }

    private boolean I() {
        ArrayList arrayList = new ArrayList(this.f34575c);
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((b2) it.next()).a()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(b2 b2Var) {
        b bVar = this.f34578f;
        if (this.f34589q.f() == null) {
            if (bVar.f34592a) {
                e(bVar.f34593b);
            }
        } else if (!this.f34589q.j() || I()) {
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(O0 o02, T t10) {
        if (t10 == this) {
            o02.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(final O0 o02) {
        o02.B(new O0.c() { // from class: io.sentry.W1
            @Override // io.sentry.O0.c
            public final void a(T t10) {
                X1.this.M(o02, t10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O(AtomicReference atomicReference, O0 o02) {
        atomicReference.set(o02.v());
    }

    private void R() {
        synchronized (this) {
            try {
                if (this.f34583k.q()) {
                    final AtomicReference atomicReference = new AtomicReference();
                    this.f34576d.B(new P0() { // from class: io.sentry.U1
                        @Override // io.sentry.P0
                        public final void a(O0 o02) {
                            X1.O(atomicReference, o02);
                        }
                    });
                    this.f34583k.E(this, (io.sentry.protocol.B) atomicReference.get(), this.f34576d.D(), G());
                    this.f34583k.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void x() {
        synchronized (this.f34581i) {
            try {
                if (this.f34579g != null) {
                    this.f34579g.cancel();
                    this.f34582j.set(false);
                    this.f34579g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private S y(e2 e2Var, String str, String str2, AbstractC3410f1 abstractC3410f1, W w10, f2 f2Var) {
        if (this.f34574b.a()) {
            return C3461v0.s();
        }
        if (!this.f34586n.equals(w10)) {
            return C3461v0.s();
        }
        io.sentry.util.n.c(e2Var, "parentSpanId is required");
        io.sentry.util.n.c(str, "operation is required");
        x();
        b2 b2Var = new b2(this.f34574b.A(), e2Var, this, str, this.f34576d, abstractC3410f1, f2Var, new d2() { // from class: io.sentry.T1
            @Override // io.sentry.d2
            public final void a(b2 b2Var2) {
                X1.this.L(b2Var2);
            }
        });
        b2Var.k(str2);
        this.f34575c.add(b2Var);
        return b2Var;
    }

    private S z(String str, String str2, AbstractC3410f1 abstractC3410f1, W w10, f2 f2Var) {
        if (this.f34574b.a()) {
            return C3461v0.s();
        }
        if (!this.f34586n.equals(w10)) {
            return C3461v0.s();
        }
        if (this.f34575c.size() < this.f34576d.D().getMaxSpans()) {
            return this.f34574b.E(str, str2, abstractC3410f1, w10, f2Var);
        }
        this.f34576d.D().getLogger().c(K1.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return C3461v0.s();
    }

    public void A(g2 g2Var, AbstractC3410f1 abstractC3410f1, boolean z10) {
        AbstractC3410f1 o10 = this.f34574b.o();
        if (abstractC3410f1 == null) {
            abstractC3410f1 = o10;
        }
        if (abstractC3410f1 == null) {
            abstractC3410f1 = this.f34576d.D().getDateProvider().now();
        }
        for (b2 b2Var : this.f34575c) {
            if (b2Var.v().a()) {
                b2Var.p(g2Var != null ? g2Var : n().f35029g, abstractC3410f1);
            }
        }
        this.f34578f = b.c(g2Var);
        if (this.f34574b.a()) {
            return;
        }
        if (!this.f34589q.j() || I()) {
            r2 r2Var = this.f34588p;
            List f10 = r2Var != null ? r2Var.f(this) : null;
            Boolean bool = Boolean.TRUE;
            I0 a10 = (bool.equals(K()) && bool.equals(J())) ? this.f34576d.D().getTransactionProfiler().a(this, f10) : null;
            if (f10 != null) {
                f10.clear();
            }
            for (b2 b2Var2 : this.f34575c) {
                if (!b2Var2.a()) {
                    b2Var2.D(null);
                    b2Var2.p(g2.DEADLINE_EXCEEDED, abstractC3410f1);
                }
            }
            this.f34574b.p(this.f34578f.f34593b, abstractC3410f1);
            this.f34576d.B(new P0() { // from class: io.sentry.V1
                @Override // io.sentry.P0
                public final void a(O0 o02) {
                    X1.this.N(o02);
                }
            });
            io.sentry.protocol.y yVar = new io.sentry.protocol.y(this);
            p2 h10 = this.f34589q.h();
            if (h10 != null) {
                h10.a(this);
            }
            if (this.f34580h != null) {
                synchronized (this.f34581i) {
                    try {
                        if (this.f34580h != null) {
                            this.f34580h.cancel();
                            this.f34580h = null;
                        }
                    } finally {
                    }
                }
            }
            if (z10 && this.f34575c.isEmpty() && this.f34589q.f() != null) {
                this.f34576d.D().getLogger().c(K1.DEBUG, "Dropping idle transaction %s because it has no child spans", this.f34577e);
            } else {
                yVar.m0().putAll(this.f34585m);
                this.f34576d.I(yVar, b(), null, a10);
            }
        }
    }

    public List C() {
        return this.f34575c;
    }

    public C3443c D() {
        return this.f34587o;
    }

    public Map E() {
        return this.f34574b.s();
    }

    b2 F() {
        return this.f34574b;
    }

    public n2 G() {
        return this.f34574b.x();
    }

    public List H() {
        return this.f34575c;
    }

    public Boolean J() {
        return this.f34574b.B();
    }

    public Boolean K() {
        return this.f34574b.C();
    }

    S P(e2 e2Var, String str, String str2, AbstractC3410f1 abstractC3410f1, W w10, f2 f2Var) {
        return y(e2Var, str, str2, abstractC3410f1, w10, f2Var);
    }

    public S Q(String str, String str2, AbstractC3410f1 abstractC3410f1, W w10, f2 f2Var) {
        return z(str, str2, abstractC3410f1, w10, f2Var);
    }

    @Override // io.sentry.S
    public boolean a() {
        return this.f34574b.a();
    }

    @Override // io.sentry.S
    public l2 b() {
        if (!this.f34576d.D().isTraceSampling()) {
            return null;
        }
        R();
        return this.f34583k.F();
    }

    @Override // io.sentry.S
    public g2 c() {
        return this.f34574b.c();
    }

    @Override // io.sentry.S
    public boolean d(AbstractC3410f1 abstractC3410f1) {
        return this.f34574b.d(abstractC3410f1);
    }

    @Override // io.sentry.S
    public void e(g2 g2Var) {
        p(g2Var, null);
    }

    @Override // io.sentry.T
    public void f(g2 g2Var, boolean z10) {
        if (a()) {
            return;
        }
        AbstractC3410f1 now = this.f34576d.D().getDateProvider().now();
        List list = this.f34575c;
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            b2 b2Var = (b2) listIterator.previous();
            b2Var.D(null);
            b2Var.p(g2Var, now);
        }
        A(g2Var, now, z10);
    }

    @Override // io.sentry.S
    public S g(String str, String str2, AbstractC3410f1 abstractC3410f1, W w10) {
        return Q(str, str2, abstractC3410f1, w10, new f2());
    }

    @Override // io.sentry.S
    public String getDescription() {
        return this.f34574b.getDescription();
    }

    @Override // io.sentry.T
    public String getName() {
        return this.f34577e;
    }

    @Override // io.sentry.S
    public void h() {
        e(c());
    }

    @Override // io.sentry.S
    public void i(String str, Number number, InterfaceC3430m0 interfaceC3430m0) {
        if (this.f34574b.a()) {
            return;
        }
        this.f34585m.put(str, new io.sentry.protocol.i(number, interfaceC3430m0.apiName()));
    }

    @Override // io.sentry.T
    public b2 j() {
        ArrayList arrayList = new ArrayList(this.f34575c);
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((b2) arrayList.get(size)).a()) {
                return (b2) arrayList.get(size);
            }
        }
        return null;
    }

    @Override // io.sentry.S
    public void k(String str) {
        if (this.f34574b.a()) {
            return;
        }
        this.f34574b.k(str);
    }

    @Override // io.sentry.T
    public io.sentry.protocol.r l() {
        return this.f34573a;
    }

    @Override // io.sentry.T
    public void m() {
        synchronized (this.f34581i) {
            try {
                x();
                if (this.f34580h != null) {
                    this.f34582j.set(true);
                    this.f34579g = new a();
                    try {
                        this.f34580h.schedule(this.f34579g, this.f34589q.f().longValue());
                    } catch (Throwable th) {
                        this.f34576d.D().getLogger().b(K1.WARNING, "Failed to schedule finish timer", th);
                        B();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.sentry.S
    public c2 n() {
        return this.f34574b.n();
    }

    @Override // io.sentry.S
    public AbstractC3410f1 o() {
        return this.f34574b.o();
    }

    @Override // io.sentry.S
    public void p(g2 g2Var, AbstractC3410f1 abstractC3410f1) {
        A(g2Var, abstractC3410f1, true);
    }

    @Override // io.sentry.T
    public io.sentry.protocol.A q() {
        return this.f34584l;
    }

    @Override // io.sentry.S
    public AbstractC3410f1 r() {
        return this.f34574b.r();
    }
}
