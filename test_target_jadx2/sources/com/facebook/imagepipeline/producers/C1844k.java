package com.facebook.imagepipeline.producers;

import Z3.C1327d;
import f3.AbstractC3142a;
import m4.b;

/* renamed from: com.facebook.imagepipeline.producers.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1844k implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Z3.x f20929a;

    /* renamed from: b, reason: collision with root package name */
    private final Z3.j f20930b;

    /* renamed from: c, reason: collision with root package name */
    private final Z3.j f20931c;

    /* renamed from: d, reason: collision with root package name */
    private final Z3.k f20932d;

    /* renamed from: e, reason: collision with root package name */
    private final d0 f20933e;

    /* renamed from: f, reason: collision with root package name */
    private final C1327d f20934f;

    /* renamed from: g, reason: collision with root package name */
    private final C1327d f20935g;

    /* renamed from: com.facebook.imagepipeline.producers.k$a */
    private static class a extends AbstractC1852t {

        /* renamed from: c, reason: collision with root package name */
        private final e0 f20936c;

        /* renamed from: d, reason: collision with root package name */
        private final Z3.x f20937d;

        /* renamed from: e, reason: collision with root package name */
        private final Z3.j f20938e;

        /* renamed from: f, reason: collision with root package name */
        private final Z3.j f20939f;

        /* renamed from: g, reason: collision with root package name */
        private final Z3.k f20940g;

        /* renamed from: h, reason: collision with root package name */
        private final C1327d f20941h;

        /* renamed from: i, reason: collision with root package name */
        private final C1327d f20942i;

        public a(InterfaceC1847n interfaceC1847n, e0 e0Var, Z3.x xVar, Z3.j jVar, Z3.j jVar2, Z3.k kVar, C1327d c1327d, C1327d c1327d2) {
            super(interfaceC1847n);
            this.f20936c = e0Var;
            this.f20937d = xVar;
            this.f20938e = jVar;
            this.f20939f = jVar2;
            this.f20940g = kVar;
            this.f20941h = c1327d;
            this.f20942i = c1327d2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1836c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(AbstractC3142a abstractC3142a, int i10) {
            try {
                if (n4.b.d()) {
                    n4.b.a("BitmapProbeProducer#onNewResultImpl");
                }
                if (!AbstractC1836c.e(i10) && abstractC3142a != null && !AbstractC1836c.l(i10, 8)) {
                    m4.b c10 = this.f20936c.c();
                    V2.d c11 = this.f20940g.c(c10, this.f20936c.a());
                    String str = (String) this.f20936c.j("origin");
                    if (str != null && str.equals("memory_bitmap")) {
                        if (this.f20936c.e().F().C() && !this.f20941h.b(c11)) {
                            this.f20937d.c(c11);
                            this.f20941h.a(c11);
                        }
                        if (this.f20936c.e().F().A() && !this.f20942i.b(c11)) {
                            (c10.c() == b.EnumC0557b.SMALL ? this.f20939f : this.f20938e).f(c11);
                            this.f20942i.a(c11);
                        }
                    }
                    o().c(abstractC3142a, i10);
                    if (n4.b.d()) {
                        n4.b.b();
                        return;
                    }
                    return;
                }
                o().c(abstractC3142a, i10);
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
    }

    public C1844k(Z3.x xVar, Z3.j jVar, Z3.j jVar2, Z3.k kVar, C1327d c1327d, C1327d c1327d2, d0 d0Var) {
        this.f20929a = xVar;
        this.f20930b = jVar;
        this.f20931c = jVar2;
        this.f20932d = kVar;
        this.f20934f = c1327d;
        this.f20935g = c1327d2;
        this.f20933e = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        try {
            if (n4.b.d()) {
                n4.b.a("BitmapProbeProducer#produceResults");
            }
            g0 p10 = e0Var.p();
            p10.e(e0Var, c());
            a aVar = new a(interfaceC1847n, e0Var, this.f20929a, this.f20930b, this.f20931c, this.f20932d, this.f20934f, this.f20935g);
            p10.j(e0Var, "BitmapProbeProducer", null);
            if (n4.b.d()) {
                n4.b.a("mInputProducer.produceResult");
            }
            this.f20933e.a(aVar, e0Var);
            if (n4.b.d()) {
                n4.b.b();
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

    protected String c() {
        return "BitmapProbeProducer";
    }
}
