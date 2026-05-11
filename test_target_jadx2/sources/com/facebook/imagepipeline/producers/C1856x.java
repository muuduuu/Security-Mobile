package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.C1853u;
import java.util.Map;
import m4.b;

/* renamed from: com.facebook.imagepipeline.producers.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1856x implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Z3.j f21043a;

    /* renamed from: b, reason: collision with root package name */
    private final Z3.j f21044b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f21045c;

    /* renamed from: d, reason: collision with root package name */
    private final Z3.k f21046d;

    /* renamed from: e, reason: collision with root package name */
    private final d0 f21047e;

    /* renamed from: com.facebook.imagepipeline.producers.x$a */
    private static class a extends AbstractC1852t {

        /* renamed from: c, reason: collision with root package name */
        private final e0 f21048c;

        /* renamed from: d, reason: collision with root package name */
        private final Z3.j f21049d;

        /* renamed from: e, reason: collision with root package name */
        private final Z3.j f21050e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f21051f;

        /* renamed from: g, reason: collision with root package name */
        private final Z3.k f21052g;

        @Override // com.facebook.imagepipeline.producers.AbstractC1836c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(g4.i iVar, int i10) {
            this.f21048c.p().e(this.f21048c, "DiskCacheWriteProducer");
            if (AbstractC1836c.e(i10) || iVar == null || AbstractC1836c.l(i10, 10) || iVar.j() == S3.c.f8736d) {
                this.f21048c.p().j(this.f21048c, "DiskCacheWriteProducer", null);
                o().c(iVar, i10);
                return;
            }
            m4.b c10 = this.f21048c.c();
            V2.d c11 = this.f21052g.c(c10, this.f21048c.a());
            Z3.j a10 = C1853u.a(c10, this.f21050e, this.f21049d, this.f21051f);
            if (a10 != null) {
                a10.p(c11, iVar);
                this.f21048c.p().j(this.f21048c, "DiskCacheWriteProducer", null);
                o().c(iVar, i10);
                return;
            }
            this.f21048c.p().k(this.f21048c, "DiskCacheWriteProducer", new C1853u.a("Got no disk cache for CacheChoice: " + Integer.valueOf(c10.c().ordinal()).toString()), null);
            o().c(iVar, i10);
        }

        private a(InterfaceC1847n interfaceC1847n, e0 e0Var, Z3.j jVar, Z3.j jVar2, Map map, Z3.k kVar) {
            super(interfaceC1847n);
            this.f21048c = e0Var;
            this.f21049d = jVar;
            this.f21050e = jVar2;
            this.f21051f = map;
            this.f21052g = kVar;
        }
    }

    public C1856x(Z3.j jVar, Z3.j jVar2, Map map, Z3.k kVar, d0 d0Var) {
        this.f21043a = jVar;
        this.f21044b = jVar2;
        this.f21045c = map;
        this.f21046d = kVar;
        this.f21047e = d0Var;
    }

    private void c(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        if (e0Var.r().getValue() >= b.c.DISK_CACHE.getValue()) {
            e0Var.f("disk", "nil-result_write");
            interfaceC1847n.c(null, 1);
        } else {
            if (e0Var.c().x(32)) {
                interfaceC1847n = new a(interfaceC1847n, e0Var, this.f21043a, this.f21044b, this.f21045c, this.f21046d);
            }
            this.f21047e.a(interfaceC1847n, e0Var);
        }
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        c(interfaceC1847n, e0Var);
    }
}
