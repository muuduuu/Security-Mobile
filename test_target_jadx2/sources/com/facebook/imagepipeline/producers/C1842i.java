package com.facebook.imagepipeline.producers;

import f3.AbstractC3142a;
import g4.InterfaceC3190e;
import m4.b;

/* renamed from: com.facebook.imagepipeline.producers.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1842i implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Z3.x f20913a;

    /* renamed from: b, reason: collision with root package name */
    private final Z3.k f20914b;

    /* renamed from: c, reason: collision with root package name */
    private final d0 f20915c;

    /* renamed from: com.facebook.imagepipeline.producers.i$a */
    class a extends AbstractC1852t {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ V2.d f20916c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f20917d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1847n interfaceC1847n, V2.d dVar, boolean z10) {
            super(interfaceC1847n);
            this.f20916c = dVar;
            this.f20917d = z10;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1836c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(AbstractC3142a abstractC3142a, int i10) {
            AbstractC3142a abstractC3142a2;
            try {
                if (n4.b.d()) {
                    n4.b.a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean d10 = AbstractC1836c.d(i10);
                if (abstractC3142a == null) {
                    if (d10) {
                        o().c(null, i10);
                    }
                    if (n4.b.d()) {
                        n4.b.b();
                        return;
                    }
                    return;
                }
                if (!((InterfaceC3190e) abstractC3142a.p()).Y1() && !AbstractC1836c.m(i10, 8)) {
                    if (!d10 && (abstractC3142a2 = C1842i.this.f20913a.get(this.f20916c)) != null) {
                        try {
                            g4.n c12 = ((InterfaceC3190e) abstractC3142a.p()).c1();
                            g4.n c13 = ((InterfaceC3190e) abstractC3142a2.p()).c1();
                            if (c13.a() || c13.c() >= c12.c()) {
                                o().c(abstractC3142a2, i10);
                                if (n4.b.d()) {
                                    n4.b.b();
                                    return;
                                }
                                return;
                            }
                        } finally {
                            AbstractC3142a.n(abstractC3142a2);
                        }
                    }
                    AbstractC3142a e10 = this.f20917d ? C1842i.this.f20913a.e(this.f20916c, abstractC3142a) : null;
                    if (d10) {
                        try {
                            o().b(1.0f);
                        } catch (Throwable th) {
                            AbstractC3142a.n(e10);
                            throw th;
                        }
                    }
                    InterfaceC1847n o10 = o();
                    if (e10 != null) {
                        abstractC3142a = e10;
                    }
                    o10.c(abstractC3142a, i10);
                    AbstractC3142a.n(e10);
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
            } catch (Throwable th2) {
                if (n4.b.d()) {
                    n4.b.b();
                }
                throw th2;
            }
        }
    }

    public C1842i(Z3.x xVar, Z3.k kVar, d0 d0Var) {
        this.f20913a = xVar;
        this.f20914b = kVar;
        this.f20915c = d0Var;
    }

    private static void f(g4.j jVar, e0 e0Var) {
        e0Var.g(jVar.getExtras());
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        try {
            if (n4.b.d()) {
                n4.b.a("BitmapMemoryCacheProducer#produceResults");
            }
            g0 p10 = e0Var.p();
            p10.e(e0Var, e());
            V2.d d10 = this.f20914b.d(e0Var.c(), e0Var.a());
            AbstractC3142a abstractC3142a = e0Var.c().x(1) ? this.f20913a.get(d10) : null;
            if (abstractC3142a != null) {
                f((g4.j) abstractC3142a.p(), e0Var);
                boolean a10 = ((InterfaceC3190e) abstractC3142a.p()).c1().a();
                if (a10) {
                    p10.j(e0Var, e(), p10.g(e0Var, e()) ? b3.g.of("cached_value_found", "true") : null);
                    p10.c(e0Var, e(), true);
                    e0Var.f("memory_bitmap", d());
                    interfaceC1847n.b(1.0f);
                }
                interfaceC1847n.c(abstractC3142a, AbstractC1836c.k(a10));
                abstractC3142a.close();
                if (a10) {
                    if (n4.b.d()) {
                        n4.b.b();
                        return;
                    }
                    return;
                }
            }
            if (e0Var.r().getValue() >= b.c.BITMAP_MEMORY_CACHE.getValue()) {
                p10.j(e0Var, e(), p10.g(e0Var, e()) ? b3.g.of("cached_value_found", "false") : null);
                p10.c(e0Var, e(), false);
                e0Var.f("memory_bitmap", d());
                interfaceC1847n.c(null, 1);
                if (n4.b.d()) {
                    n4.b.b();
                    return;
                }
                return;
            }
            InterfaceC1847n g10 = g(interfaceC1847n, d10, e0Var.c().x(2));
            p10.j(e0Var, e(), p10.g(e0Var, e()) ? b3.g.of("cached_value_found", "false") : null);
            if (n4.b.d()) {
                n4.b.a("mInputProducer.produceResult");
            }
            this.f20915c.a(g10, e0Var);
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

    protected String d() {
        return "pipe_bg";
    }

    protected String e() {
        return "BitmapMemoryCacheProducer";
    }

    protected InterfaceC1847n g(InterfaceC1847n interfaceC1847n, V2.d dVar, boolean z10) {
        return new a(interfaceC1847n, dVar, z10);
    }
}
