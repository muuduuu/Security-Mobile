package com.facebook.imagepipeline.producers;

import f3.AbstractC3142a;
import g4.InterfaceC3190e;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class b0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final d0 f20879a;

    /* renamed from: b, reason: collision with root package name */
    private final Y3.d f20880b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f20881c;

    private class a extends AbstractC1852t {

        /* renamed from: c, reason: collision with root package name */
        private final g0 f20882c;

        /* renamed from: d, reason: collision with root package name */
        private final e0 f20883d;

        /* renamed from: e, reason: collision with root package name */
        private final m4.d f20884e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f20885f;

        /* renamed from: g, reason: collision with root package name */
        private AbstractC3142a f20886g;

        /* renamed from: h, reason: collision with root package name */
        private int f20887h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f20888i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f20889j;

        /* renamed from: com.facebook.imagepipeline.producers.b0$a$a, reason: collision with other inner class name */
        class C0369a extends AbstractC1839f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b0 f20891a;

            C0369a(b0 b0Var) {
                this.f20891a = b0Var;
            }

            @Override // com.facebook.imagepipeline.producers.f0
            public void a() {
                a.this.B();
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC3142a abstractC3142a;
                int i10;
                synchronized (a.this) {
                    abstractC3142a = a.this.f20886g;
                    i10 = a.this.f20887h;
                    a.this.f20886g = null;
                    a.this.f20888i = false;
                }
                if (AbstractC3142a.x(abstractC3142a)) {
                    try {
                        a.this.y(abstractC3142a, i10);
                    } finally {
                        AbstractC3142a.n(abstractC3142a);
                    }
                }
                a.this.w();
            }
        }

        public a(InterfaceC1847n interfaceC1847n, g0 g0Var, m4.d dVar, e0 e0Var) {
            super(interfaceC1847n);
            this.f20886g = null;
            this.f20887h = 0;
            this.f20888i = false;
            this.f20889j = false;
            this.f20882c = g0Var;
            this.f20884e = dVar;
            this.f20883d = e0Var;
            e0Var.d(new C0369a(b0.this));
        }

        private synchronized boolean A() {
            return this.f20885f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B() {
            if (x()) {
                o().a();
            }
        }

        private void C(Throwable th) {
            if (x()) {
                o().onFailure(th);
            }
        }

        private void D(AbstractC3142a abstractC3142a, int i10) {
            boolean d10 = AbstractC1836c.d(i10);
            if ((d10 || A()) && !(d10 && x())) {
                return;
            }
            o().c(abstractC3142a, i10);
        }

        private AbstractC3142a F(InterfaceC3190e interfaceC3190e) {
            g4.f fVar = (g4.f) interfaceC3190e;
            AbstractC3142a a10 = this.f20884e.a(fVar.p1(), b0.this.f20880b);
            try {
                g4.f P12 = g4.f.P1(a10, interfaceC3190e.c1(), fVar.t0(), fVar.c2());
                P12.g(fVar.getExtras());
                return AbstractC3142a.y(P12);
            } finally {
                AbstractC3142a.n(a10);
            }
        }

        private synchronized boolean G() {
            if (this.f20885f || !this.f20888i || this.f20889j || !AbstractC3142a.x(this.f20886g)) {
                return false;
            }
            this.f20889j = true;
            return true;
        }

        private boolean H(InterfaceC3190e interfaceC3190e) {
            return interfaceC3190e instanceof g4.f;
        }

        private void I() {
            b0.this.f20881c.execute(new b());
        }

        private void J(AbstractC3142a abstractC3142a, int i10) {
            synchronized (this) {
                try {
                    if (this.f20885f) {
                        return;
                    }
                    AbstractC3142a abstractC3142a2 = this.f20886g;
                    this.f20886g = AbstractC3142a.i(abstractC3142a);
                    this.f20887h = i10;
                    this.f20888i = true;
                    boolean G10 = G();
                    AbstractC3142a.n(abstractC3142a2);
                    if (G10) {
                        I();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w() {
            boolean G10;
            synchronized (this) {
                this.f20889j = false;
                G10 = G();
            }
            if (G10) {
                I();
            }
        }

        private boolean x() {
            synchronized (this) {
                try {
                    if (this.f20885f) {
                        return false;
                    }
                    AbstractC3142a abstractC3142a = this.f20886g;
                    this.f20886g = null;
                    this.f20885f = true;
                    AbstractC3142a.n(abstractC3142a);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y(AbstractC3142a abstractC3142a, int i10) {
            b3.l.b(Boolean.valueOf(AbstractC3142a.x(abstractC3142a)));
            if (!H((InterfaceC3190e) abstractC3142a.p())) {
                D(abstractC3142a, i10);
                return;
            }
            this.f20882c.e(this.f20883d, "PostprocessorProducer");
            try {
                try {
                    AbstractC3142a F10 = F((InterfaceC3190e) abstractC3142a.p());
                    g0 g0Var = this.f20882c;
                    e0 e0Var = this.f20883d;
                    g0Var.j(e0Var, "PostprocessorProducer", z(g0Var, e0Var, this.f20884e));
                    D(F10, i10);
                    AbstractC3142a.n(F10);
                } catch (Exception e10) {
                    g0 g0Var2 = this.f20882c;
                    e0 e0Var2 = this.f20883d;
                    g0Var2.k(e0Var2, "PostprocessorProducer", e10, z(g0Var2, e0Var2, this.f20884e));
                    C(e10);
                    AbstractC3142a.n(null);
                }
            } catch (Throwable th) {
                AbstractC3142a.n(null);
                throw th;
            }
        }

        private Map z(g0 g0Var, e0 e0Var, m4.d dVar) {
            if (g0Var.g(e0Var, "PostprocessorProducer")) {
                return b3.g.of("Postprocessor", dVar.getName());
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC1836c
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public void h(AbstractC3142a abstractC3142a, int i10) {
            if (AbstractC3142a.x(abstractC3142a)) {
                J(abstractC3142a, i10);
            } else if (AbstractC1836c.d(i10)) {
                D(null, i10);
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1852t, com.facebook.imagepipeline.producers.AbstractC1836c
        protected void f() {
            B();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1852t, com.facebook.imagepipeline.producers.AbstractC1836c
        protected void g(Throwable th) {
            C(th);
        }
    }

    class b extends AbstractC1852t {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC1836c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(AbstractC3142a abstractC3142a, int i10) {
            if (AbstractC1836c.e(i10)) {
                return;
            }
            o().c(abstractC3142a, i10);
        }

        private b(a aVar) {
            super(aVar);
        }
    }

    public b0(d0 d0Var, Y3.d dVar, Executor executor) {
        this.f20879a = (d0) b3.l.g(d0Var);
        this.f20880b = dVar;
        this.f20881c = (Executor) b3.l.g(executor);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        g0 p10 = e0Var.p();
        m4.d k10 = e0Var.c().k();
        b3.l.g(k10);
        this.f20879a.a(new b(new a(interfaceC1847n, p10, k10, e0Var)), e0Var);
    }
}
