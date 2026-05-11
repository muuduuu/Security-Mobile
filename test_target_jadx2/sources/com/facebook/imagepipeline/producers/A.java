package com.facebook.imagepipeline.producers;

import Z3.C1327d;
import m4.b;

/* loaded from: classes.dex */
public class A implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Z3.j f20735a;

    /* renamed from: b, reason: collision with root package name */
    private final Z3.j f20736b;

    /* renamed from: c, reason: collision with root package name */
    private final Z3.k f20737c;

    /* renamed from: d, reason: collision with root package name */
    private final d0 f20738d;

    /* renamed from: e, reason: collision with root package name */
    private final C1327d f20739e;

    /* renamed from: f, reason: collision with root package name */
    private final C1327d f20740f;

    private static class a extends AbstractC1852t {

        /* renamed from: c, reason: collision with root package name */
        private final e0 f20741c;

        /* renamed from: d, reason: collision with root package name */
        private final Z3.j f20742d;

        /* renamed from: e, reason: collision with root package name */
        private final Z3.j f20743e;

        /* renamed from: f, reason: collision with root package name */
        private final Z3.k f20744f;

        /* renamed from: g, reason: collision with root package name */
        private final C1327d f20745g;

        /* renamed from: h, reason: collision with root package name */
        private final C1327d f20746h;

        public a(InterfaceC1847n interfaceC1847n, e0 e0Var, Z3.j jVar, Z3.j jVar2, Z3.k kVar, C1327d c1327d, C1327d c1327d2) {
            super(interfaceC1847n);
            this.f20741c = e0Var;
            this.f20742d = jVar;
            this.f20743e = jVar2;
            this.f20744f = kVar;
            this.f20745g = c1327d;
            this.f20746h = c1327d2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1836c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(g4.i iVar, int i10) {
            try {
                if (n4.b.d()) {
                    n4.b.a("EncodedProbeProducer#onNewResultImpl");
                }
                if (!AbstractC1836c.e(i10) && iVar != null && !AbstractC1836c.l(i10, 10) && iVar.j() != S3.c.f8736d) {
                    m4.b c10 = this.f20741c.c();
                    V2.d c11 = this.f20744f.c(c10, this.f20741c.a());
                    this.f20745g.a(c11);
                    if ("memory_encoded".equals(this.f20741c.j("origin"))) {
                        if (!this.f20746h.b(c11)) {
                            (c10.c() == b.EnumC0557b.SMALL ? this.f20743e : this.f20742d).f(c11);
                            this.f20746h.a(c11);
                        }
                    } else if ("disk".equals(this.f20741c.j("origin"))) {
                        this.f20746h.a(c11);
                    }
                    o().c(iVar, i10);
                    if (n4.b.d()) {
                        n4.b.b();
                        return;
                    }
                    return;
                }
                o().c(iVar, i10);
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

    public A(Z3.j jVar, Z3.j jVar2, Z3.k kVar, C1327d c1327d, C1327d c1327d2, d0 d0Var) {
        this.f20735a = jVar;
        this.f20736b = jVar2;
        this.f20737c = kVar;
        this.f20739e = c1327d;
        this.f20740f = c1327d2;
        this.f20738d = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        try {
            if (n4.b.d()) {
                n4.b.a("EncodedProbeProducer#produceResults");
            }
            g0 p10 = e0Var.p();
            p10.e(e0Var, c());
            a aVar = new a(interfaceC1847n, e0Var, this.f20735a, this.f20736b, this.f20737c, this.f20739e, this.f20740f);
            p10.j(e0Var, "EncodedProbeProducer", null);
            if (n4.b.d()) {
                n4.b.a("mInputProducer.produceResult");
            }
            this.f20738d.a(aVar, e0Var);
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
        return "EncodedProbeProducer";
    }
}
