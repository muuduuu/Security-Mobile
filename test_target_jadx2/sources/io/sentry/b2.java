package io.sentry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class b2 implements S {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC3410f1 f35009a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC3410f1 f35010b;

    /* renamed from: c, reason: collision with root package name */
    private final c2 f35011c;

    /* renamed from: d, reason: collision with root package name */
    private final X1 f35012d;

    /* renamed from: e, reason: collision with root package name */
    private Throwable f35013e;

    /* renamed from: f, reason: collision with root package name */
    private final L f35014f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f35015g;

    /* renamed from: h, reason: collision with root package name */
    private final f2 f35016h;

    /* renamed from: i, reason: collision with root package name */
    private d2 f35017i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f35018j;

    b2(io.sentry.protocol.r rVar, e2 e2Var, X1 x12, String str, L l10, AbstractC3410f1 abstractC3410f1, f2 f2Var, d2 d2Var) {
        this.f35015g = new AtomicBoolean(false);
        this.f35018j = new ConcurrentHashMap();
        this.f35011c = new c2(rVar, new e2(), str, e2Var, x12.G());
        this.f35012d = (X1) io.sentry.util.n.c(x12, "transaction is required");
        this.f35014f = (L) io.sentry.util.n.c(l10, "hub is required");
        this.f35016h = f2Var;
        this.f35017i = d2Var;
        if (abstractC3410f1 != null) {
            this.f35009a = abstractC3410f1;
        } else {
            this.f35009a = l10.D().getDateProvider().now();
        }
    }

    private void F(AbstractC3410f1 abstractC3410f1) {
        this.f35009a = abstractC3410f1;
    }

    private List t() {
        ArrayList arrayList = new ArrayList();
        for (b2 b2Var : this.f35012d.H()) {
            if (b2Var.w() != null && b2Var.w().equals(y())) {
                arrayList.add(b2Var);
            }
        }
        return arrayList;
    }

    public io.sentry.protocol.r A() {
        return this.f35011c.k();
    }

    public Boolean B() {
        return this.f35011c.e();
    }

    public Boolean C() {
        return this.f35011c.f();
    }

    void D(d2 d2Var) {
        this.f35017i = d2Var;
    }

    public S E(String str, String str2, AbstractC3410f1 abstractC3410f1, W w10, f2 f2Var) {
        return this.f35015g.get() ? C3461v0.s() : this.f35012d.P(this.f35011c.h(), str, str2, abstractC3410f1, w10, f2Var);
    }

    @Override // io.sentry.S
    public boolean a() {
        return this.f35015g.get();
    }

    @Override // io.sentry.S
    public g2 c() {
        return this.f35011c.i();
    }

    @Override // io.sentry.S
    public boolean d(AbstractC3410f1 abstractC3410f1) {
        if (this.f35010b == null) {
            return false;
        }
        this.f35010b = abstractC3410f1;
        return true;
    }

    @Override // io.sentry.S
    public void e(g2 g2Var) {
        p(g2Var, this.f35014f.D().getDateProvider().now());
    }

    @Override // io.sentry.S
    public String getDescription() {
        return this.f35011c.a();
    }

    @Override // io.sentry.S
    public void h() {
        e(this.f35011c.i());
    }

    @Override // io.sentry.S
    public void i(String str, Number number, InterfaceC3430m0 interfaceC3430m0) {
        this.f35012d.i(str, number, interfaceC3430m0);
    }

    @Override // io.sentry.S
    public void k(String str) {
        if (this.f35015g.get()) {
            return;
        }
        this.f35011c.l(str);
    }

    @Override // io.sentry.S
    public c2 n() {
        return this.f35011c;
    }

    @Override // io.sentry.S
    public AbstractC3410f1 o() {
        return this.f35010b;
    }

    @Override // io.sentry.S
    public void p(g2 g2Var, AbstractC3410f1 abstractC3410f1) {
        AbstractC3410f1 abstractC3410f12;
        if (this.f35015g.compareAndSet(false, true)) {
            this.f35011c.o(g2Var);
            if (abstractC3410f1 == null) {
                abstractC3410f1 = this.f35014f.D().getDateProvider().now();
            }
            this.f35010b = abstractC3410f1;
            if (this.f35016h.c() || this.f35016h.b()) {
                AbstractC3410f1 abstractC3410f13 = null;
                AbstractC3410f1 abstractC3410f14 = null;
                for (b2 b2Var : this.f35012d.F().y().equals(y()) ? this.f35012d.C() : t()) {
                    if (abstractC3410f13 == null || b2Var.r().e(abstractC3410f13)) {
                        abstractC3410f13 = b2Var.r();
                    }
                    if (abstractC3410f14 == null || (b2Var.o() != null && b2Var.o().d(abstractC3410f14))) {
                        abstractC3410f14 = b2Var.o();
                    }
                }
                if (this.f35016h.c() && abstractC3410f13 != null && this.f35009a.e(abstractC3410f13)) {
                    F(abstractC3410f13);
                }
                if (this.f35016h.b() && abstractC3410f14 != null && ((abstractC3410f12 = this.f35010b) == null || abstractC3410f12.d(abstractC3410f14))) {
                    d(abstractC3410f14);
                }
            }
            Throwable th = this.f35013e;
            if (th != null) {
                this.f35014f.C(th, this, this.f35012d.getName());
            }
            d2 d2Var = this.f35017i;
            if (d2Var != null) {
                d2Var.a(this);
            }
        }
    }

    @Override // io.sentry.S
    public AbstractC3410f1 r() {
        return this.f35009a;
    }

    public Map s() {
        return this.f35018j;
    }

    public String u() {
        return this.f35011c.b();
    }

    f2 v() {
        return this.f35016h;
    }

    public e2 w() {
        return this.f35011c.d();
    }

    public n2 x() {
        return this.f35011c.g();
    }

    public e2 y() {
        return this.f35011c.h();
    }

    public Map z() {
        return this.f35011c.j();
    }

    public b2(o2 o2Var, X1 x12, L l10, AbstractC3410f1 abstractC3410f1, f2 f2Var) {
        this.f35015g = new AtomicBoolean(false);
        this.f35018j = new ConcurrentHashMap();
        this.f35011c = (c2) io.sentry.util.n.c(o2Var, "context is required");
        this.f35012d = (X1) io.sentry.util.n.c(x12, "sentryTracer is required");
        this.f35014f = (L) io.sentry.util.n.c(l10, "hub is required");
        this.f35017i = null;
        if (abstractC3410f1 != null) {
            this.f35009a = abstractC3410f1;
        } else {
            this.f35009a = l10.D().getDateProvider().now();
        }
        this.f35016h = f2Var;
    }
}
