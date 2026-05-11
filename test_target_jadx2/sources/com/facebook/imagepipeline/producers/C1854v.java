package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.C1853u;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import m4.b;

/* renamed from: com.facebook.imagepipeline.producers.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1854v implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Z3.j f21031a;

    /* renamed from: b, reason: collision with root package name */
    private final Z3.j f21032b;

    /* renamed from: c, reason: collision with root package name */
    private final Z3.k f21033c;

    /* renamed from: d, reason: collision with root package name */
    private final d0 f21034d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f21035e;

    /* renamed from: com.facebook.imagepipeline.producers.v$a */
    class a implements G1.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g0 f21036a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e0 f21037b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC1847n f21038c;

        a(g0 g0Var, e0 e0Var, InterfaceC1847n interfaceC1847n) {
            this.f21036a = g0Var;
            this.f21037b = e0Var;
            this.f21038c = interfaceC1847n;
        }

        @Override // G1.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(G1.f fVar) {
            if (C1854v.f(fVar)) {
                this.f21036a.d(this.f21037b, "DiskCacheProducer", null);
                this.f21038c.a();
            } else if (fVar.n()) {
                this.f21036a.k(this.f21037b, "DiskCacheProducer", fVar.i(), null);
                C1854v.this.f21034d.a(this.f21038c, this.f21037b);
            } else {
                g4.i iVar = (g4.i) fVar.j();
                if (iVar != null) {
                    g0 g0Var = this.f21036a;
                    e0 e0Var = this.f21037b;
                    g0Var.j(e0Var, "DiskCacheProducer", C1854v.e(g0Var, e0Var, true, iVar.p()));
                    this.f21036a.c(this.f21037b, "DiskCacheProducer", true);
                    this.f21037b.o("disk");
                    this.f21038c.b(1.0f);
                    this.f21038c.c(iVar, 1);
                    iVar.close();
                } else {
                    g0 g0Var2 = this.f21036a;
                    e0 e0Var2 = this.f21037b;
                    g0Var2.j(e0Var2, "DiskCacheProducer", C1854v.e(g0Var2, e0Var2, false, 0));
                    C1854v.this.f21034d.a(this.f21038c, this.f21037b);
                }
            }
            return null;
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.v$b */
    class b extends AbstractC1839f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f21040a;

        b(AtomicBoolean atomicBoolean) {
            this.f21040a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            this.f21040a.set(true);
        }
    }

    public C1854v(Z3.j jVar, Z3.j jVar2, Map map, Z3.k kVar, d0 d0Var) {
        this.f21031a = jVar;
        this.f21032b = jVar2;
        this.f21035e = map;
        this.f21033c = kVar;
        this.f21034d = d0Var;
    }

    static Map e(g0 g0Var, e0 e0Var, boolean z10, int i10) {
        if (g0Var.g(e0Var, "DiskCacheProducer")) {
            return z10 ? b3.g.of("cached_value_found", String.valueOf(z10), "encodedImageSize", String.valueOf(i10)) : b3.g.of("cached_value_found", String.valueOf(z10));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f(G1.f fVar) {
        return fVar.l() || (fVar.n() && (fVar.i() instanceof CancellationException));
    }

    private void g(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        if (e0Var.r().getValue() < b.c.DISK_CACHE.getValue()) {
            this.f21034d.a(interfaceC1847n, e0Var);
        } else {
            e0Var.f("disk", "nil-result_read");
            interfaceC1847n.c(null, 1);
        }
    }

    private G1.d h(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        return new a(e0Var.p(), e0Var, interfaceC1847n);
    }

    private void i(AtomicBoolean atomicBoolean, e0 e0Var) {
        e0Var.d(new b(atomicBoolean));
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        m4.b c10 = e0Var.c();
        if (!e0Var.c().x(16)) {
            g(interfaceC1847n, e0Var);
            return;
        }
        e0Var.p().e(e0Var, "DiskCacheProducer");
        V2.d c11 = this.f21033c.c(c10, e0Var.a());
        Z3.j a10 = C1853u.a(c10, this.f21032b, this.f21031a, this.f21035e);
        if (a10 != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            a10.m(c11, atomicBoolean).e(h(interfaceC1847n, e0Var));
            i(atomicBoolean, e0Var);
        } else {
            e0Var.p().k(e0Var, "DiskCacheProducer", new C1853u.a("Got no disk cache for CacheChoice: " + Integer.valueOf(c10.c().ordinal()).toString()), null);
            g(interfaceC1847n, e0Var);
        }
    }
}
