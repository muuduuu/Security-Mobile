package com.facebook.imagepipeline.producers;

import f3.AbstractC3142a;
import m4.b;

/* renamed from: com.facebook.imagepipeline.producers.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1858z implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Z3.x f21054a;

    /* renamed from: b, reason: collision with root package name */
    private final Z3.k f21055b;

    /* renamed from: c, reason: collision with root package name */
    private final d0 f21056c;

    /* renamed from: com.facebook.imagepipeline.producers.z$a */
    private static class a extends AbstractC1852t {

        /* renamed from: c, reason: collision with root package name */
        private final Z3.x f21057c;

        /* renamed from: d, reason: collision with root package name */
        private final V2.d f21058d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f21059e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f21060f;

        public a(InterfaceC1847n interfaceC1847n, Z3.x xVar, V2.d dVar, boolean z10, boolean z11) {
            super(interfaceC1847n);
            this.f21057c = xVar;
            this.f21058d = dVar;
            this.f21059e = z10;
            this.f21060f = z11;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1836c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(g4.i iVar, int i10) {
            try {
                if (n4.b.d()) {
                    n4.b.a("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!AbstractC1836c.e(i10) && iVar != null && !AbstractC1836c.l(i10, 10) && iVar.j() != S3.c.f8736d) {
                    AbstractC3142a e10 = iVar.e();
                    if (e10 != null) {
                        try {
                            AbstractC3142a e11 = (this.f21060f && this.f21059e) ? this.f21057c.e(this.f21058d, e10) : null;
                            if (e11 != null) {
                                try {
                                    g4.i iVar2 = new g4.i(e11);
                                    iVar2.d(iVar);
                                    try {
                                        o().b(1.0f);
                                        o().c(iVar2, i10);
                                        if (n4.b.d()) {
                                            n4.b.b();
                                            return;
                                        }
                                        return;
                                    } finally {
                                        g4.i.c(iVar2);
                                    }
                                } finally {
                                    AbstractC3142a.n(e11);
                                }
                            }
                        } finally {
                            AbstractC3142a.n(e10);
                        }
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

    public C1858z(Z3.x xVar, Z3.k kVar, d0 d0Var) {
        this.f21054a = xVar;
        this.f21055b = kVar;
        this.f21056c = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        try {
            if (n4.b.d()) {
                n4.b.a("EncodedMemoryCacheProducer#produceResults");
            }
            g0 p10 = e0Var.p();
            p10.e(e0Var, "EncodedMemoryCacheProducer");
            V2.d c10 = this.f21055b.c(e0Var.c(), e0Var.a());
            AbstractC3142a abstractC3142a = e0Var.c().x(4) ? this.f21054a.get(c10) : null;
            try {
                if (abstractC3142a != null) {
                    g4.i iVar = new g4.i(abstractC3142a);
                    try {
                        p10.j(e0Var, "EncodedMemoryCacheProducer", p10.g(e0Var, "EncodedMemoryCacheProducer") ? b3.g.of("cached_value_found", "true") : null);
                        p10.c(e0Var, "EncodedMemoryCacheProducer", true);
                        e0Var.o("memory_encoded");
                        interfaceC1847n.b(1.0f);
                        interfaceC1847n.c(iVar, 1);
                        g4.i.c(iVar);
                        if (n4.b.d()) {
                            n4.b.b();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        g4.i.c(iVar);
                        throw th;
                    }
                }
                if (e0Var.r().getValue() < b.c.ENCODED_MEMORY_CACHE.getValue()) {
                    a aVar = new a(interfaceC1847n, this.f21054a, c10, e0Var.c().x(8), e0Var.e().F().B());
                    p10.j(e0Var, "EncodedMemoryCacheProducer", p10.g(e0Var, "EncodedMemoryCacheProducer") ? b3.g.of("cached_value_found", "false") : null);
                    this.f21056c.a(aVar, e0Var);
                    if (n4.b.d()) {
                        n4.b.b();
                        return;
                    }
                    return;
                }
                p10.j(e0Var, "EncodedMemoryCacheProducer", p10.g(e0Var, "EncodedMemoryCacheProducer") ? b3.g.of("cached_value_found", "false") : null);
                p10.c(e0Var, "EncodedMemoryCacheProducer", false);
                e0Var.f("memory_encoded", "nil-result");
                interfaceC1847n.c(null, 1);
                if (n4.b.d()) {
                    n4.b.b();
                }
            } finally {
                AbstractC3142a.n(abstractC3142a);
            }
        } catch (Throwable th2) {
            if (n4.b.d()) {
                n4.b.b();
            }
            throw th2;
        }
    }
}
