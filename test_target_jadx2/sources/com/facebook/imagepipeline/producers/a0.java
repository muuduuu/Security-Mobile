package com.facebook.imagepipeline.producers;

import f3.AbstractC3142a;

/* loaded from: classes.dex */
public class a0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Z3.x f20871a;

    /* renamed from: b, reason: collision with root package name */
    private final Z3.k f20872b;

    /* renamed from: c, reason: collision with root package name */
    private final d0 f20873c;

    public static class a extends AbstractC1852t {

        /* renamed from: c, reason: collision with root package name */
        private final V2.d f20874c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f20875d;

        /* renamed from: e, reason: collision with root package name */
        private final Z3.x f20876e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f20877f;

        public a(InterfaceC1847n interfaceC1847n, V2.d dVar, boolean z10, Z3.x xVar, boolean z11) {
            super(interfaceC1847n);
            this.f20874c = dVar;
            this.f20875d = z10;
            this.f20876e = xVar;
            this.f20877f = z11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC1836c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(AbstractC3142a abstractC3142a, int i10) {
            if (abstractC3142a == null) {
                if (AbstractC1836c.d(i10)) {
                    o().c(null, i10);
                }
            } else if (!AbstractC1836c.e(i10) || this.f20875d) {
                AbstractC3142a e10 = this.f20877f ? this.f20876e.e(this.f20874c, abstractC3142a) : null;
                try {
                    o().b(1.0f);
                    InterfaceC1847n o10 = o();
                    if (e10 != null) {
                        abstractC3142a = e10;
                    }
                    o10.c(abstractC3142a, i10);
                } finally {
                    AbstractC3142a.n(e10);
                }
            }
        }
    }

    public a0(Z3.x xVar, Z3.k kVar, d0 d0Var) {
        this.f20871a = xVar;
        this.f20872b = kVar;
        this.f20873c = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        g0 p10 = e0Var.p();
        m4.b c10 = e0Var.c();
        Object a10 = e0Var.a();
        m4.d k10 = c10.k();
        if (k10 == null || k10.b() == null) {
            this.f20873c.a(interfaceC1847n, e0Var);
            return;
        }
        p10.e(e0Var, c());
        V2.d b10 = this.f20872b.b(c10, a10);
        AbstractC3142a abstractC3142a = e0Var.c().x(1) ? this.f20871a.get(b10) : null;
        if (abstractC3142a == null) {
            a aVar = new a(interfaceC1847n, b10, false, this.f20871a, e0Var.c().x(2));
            p10.j(e0Var, c(), p10.g(e0Var, c()) ? b3.g.of("cached_value_found", "false") : null);
            this.f20873c.a(aVar, e0Var);
        } else {
            p10.j(e0Var, c(), p10.g(e0Var, c()) ? b3.g.of("cached_value_found", "true") : null);
            p10.c(e0Var, "PostprocessedBitmapMemoryCacheProducer", true);
            e0Var.f("memory_bitmap", "postprocessed");
            interfaceC1847n.b(1.0f);
            interfaceC1847n.c(abstractC3142a, 1);
            abstractC3142a.close();
        }
    }

    protected String c() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }
}
