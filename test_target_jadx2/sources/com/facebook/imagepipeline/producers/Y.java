package com.facebook.imagepipeline.producers;

import a4.C1349a;
import android.net.Uri;
import c3.AbstractC1721a;
import e3.InterfaceC3074a;
import f3.AbstractC3142a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class Y implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Z3.j f20853a;

    /* renamed from: b, reason: collision with root package name */
    private final Z3.k f20854b;

    /* renamed from: c, reason: collision with root package name */
    private final e3.i f20855c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3074a f20856d;

    /* renamed from: e, reason: collision with root package name */
    private final d0 f20857e;

    class a implements G1.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g0 f20858a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e0 f20859b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC1847n f20860c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ V2.d f20861d;

        a(g0 g0Var, e0 e0Var, InterfaceC1847n interfaceC1847n, V2.d dVar) {
            this.f20858a = g0Var;
            this.f20859b = e0Var;
            this.f20860c = interfaceC1847n;
            this.f20861d = dVar;
        }

        @Override // G1.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(G1.f fVar) {
            if (Y.g(fVar)) {
                this.f20858a.d(this.f20859b, "PartialDiskCacheProducer", null);
                this.f20860c.a();
            } else if (fVar.n()) {
                this.f20858a.k(this.f20859b, "PartialDiskCacheProducer", fVar.i(), null);
                Y.this.i(this.f20860c, this.f20859b, this.f20861d, null);
            } else {
                g4.i iVar = (g4.i) fVar.j();
                if (iVar != null) {
                    g0 g0Var = this.f20858a;
                    e0 e0Var = this.f20859b;
                    g0Var.j(e0Var, "PartialDiskCacheProducer", Y.f(g0Var, e0Var, true, iVar.p()));
                    C1349a e10 = C1349a.e(iVar.p() - 1);
                    iVar.I(e10);
                    int p10 = iVar.p();
                    m4.b c10 = this.f20859b.c();
                    if (e10.b(c10.b())) {
                        this.f20859b.f("disk", "partial");
                        this.f20858a.c(this.f20859b, "PartialDiskCacheProducer", true);
                        this.f20860c.c(iVar, 9);
                    } else {
                        this.f20860c.c(iVar, 8);
                        Y.this.i(this.f20860c, new l0(m4.c.b(c10).y(C1349a.c(p10 - 1)).a(), this.f20859b), this.f20861d, iVar);
                    }
                } else {
                    g0 g0Var2 = this.f20858a;
                    e0 e0Var2 = this.f20859b;
                    g0Var2.j(e0Var2, "PartialDiskCacheProducer", Y.f(g0Var2, e0Var2, false, 0));
                    Y.this.i(this.f20860c, this.f20859b, this.f20861d, iVar);
                }
            }
            return null;
        }
    }

    class b extends AbstractC1839f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f20863a;

        b(AtomicBoolean atomicBoolean) {
            this.f20863a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            this.f20863a.set(true);
        }
    }

    private static class c extends AbstractC1852t {

        /* renamed from: c, reason: collision with root package name */
        private final Z3.j f20865c;

        /* renamed from: d, reason: collision with root package name */
        private final V2.d f20866d;

        /* renamed from: e, reason: collision with root package name */
        private final e3.i f20867e;

        /* renamed from: f, reason: collision with root package name */
        private final InterfaceC3074a f20868f;

        /* renamed from: g, reason: collision with root package name */
        private final g4.i f20869g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f20870h;

        private void p(InputStream inputStream, OutputStream outputStream, int i10) {
            byte[] bArr = (byte[]) this.f20868f.get(16384);
            int i11 = i10;
            while (i11 > 0) {
                try {
                    int read = inputStream.read(bArr, 0, Math.min(16384, i11));
                    if (read < 0) {
                        break;
                    } else if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        i11 -= read;
                    }
                } finally {
                    this.f20868f.a(bArr);
                }
            }
            if (i11 > 0) {
                throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", Integer.valueOf(i10), Integer.valueOf(i11)));
            }
        }

        private e3.k q(g4.i iVar, g4.i iVar2) {
            int i10 = ((C1349a) b3.l.g(iVar2.f())).f12570a;
            e3.k e10 = this.f20867e.e(iVar2.p() + i10);
            p(iVar.n(), e10, i10);
            p(iVar2.n(), e10, iVar2.p());
            return e10;
        }

        private void s(e3.k kVar) {
            g4.i iVar;
            Throwable th;
            AbstractC3142a y10 = AbstractC3142a.y(kVar.a());
            try {
                iVar = new g4.i(y10);
                try {
                    iVar.z();
                    o().c(iVar, 1);
                    g4.i.c(iVar);
                    AbstractC3142a.n(y10);
                } catch (Throwable th2) {
                    th = th2;
                    g4.i.c(iVar);
                    AbstractC3142a.n(y10);
                    throw th;
                }
            } catch (Throwable th3) {
                iVar = null;
                th = th3;
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1836c
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public void h(g4.i iVar, int i10) {
            if (AbstractC1836c.e(i10)) {
                return;
            }
            if (this.f20869g != null && iVar != null && iVar.f() != null) {
                try {
                    try {
                        s(q(this.f20869g, iVar));
                    } catch (IOException e10) {
                        AbstractC1721a.n("PartialDiskCacheProducer", "Error while merging image data", e10);
                        o().onFailure(e10);
                    }
                    this.f20865c.s(this.f20866d);
                    return;
                } finally {
                    iVar.close();
                    this.f20869g.close();
                }
            }
            if (!this.f20870h || !AbstractC1836c.m(i10, 8) || !AbstractC1836c.d(i10) || iVar == null || iVar.j() == S3.c.f8736d) {
                o().c(iVar, i10);
            } else {
                this.f20865c.p(this.f20866d, iVar);
                o().c(iVar, i10);
            }
        }

        private c(InterfaceC1847n interfaceC1847n, Z3.j jVar, V2.d dVar, e3.i iVar, InterfaceC3074a interfaceC3074a, g4.i iVar2, boolean z10) {
            super(interfaceC1847n);
            this.f20865c = jVar;
            this.f20866d = dVar;
            this.f20867e = iVar;
            this.f20868f = interfaceC3074a;
            this.f20869g = iVar2;
            this.f20870h = z10;
        }
    }

    public Y(Z3.j jVar, Z3.k kVar, e3.i iVar, InterfaceC3074a interfaceC3074a, d0 d0Var) {
        this.f20853a = jVar;
        this.f20854b = kVar;
        this.f20855c = iVar;
        this.f20856d = interfaceC3074a;
        this.f20857e = d0Var;
    }

    private static Uri e(m4.b bVar) {
        return bVar.u().buildUpon().appendQueryParameter("fresco_partial", "true").build();
    }

    static Map f(g0 g0Var, e0 e0Var, boolean z10, int i10) {
        if (g0Var.g(e0Var, "PartialDiskCacheProducer")) {
            return z10 ? b3.g.of("cached_value_found", String.valueOf(z10), "encodedImageSize", String.valueOf(i10)) : b3.g.of("cached_value_found", String.valueOf(z10));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(G1.f fVar) {
        return fVar.l() || (fVar.n() && (fVar.i() instanceof CancellationException));
    }

    private G1.d h(InterfaceC1847n interfaceC1847n, e0 e0Var, V2.d dVar) {
        return new a(e0Var.p(), e0Var, interfaceC1847n, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(InterfaceC1847n interfaceC1847n, e0 e0Var, V2.d dVar, g4.i iVar) {
        this.f20857e.a(new c(interfaceC1847n, this.f20853a, dVar, this.f20855c, this.f20856d, iVar, e0Var.c().x(32)), e0Var);
    }

    private void j(AtomicBoolean atomicBoolean, e0 e0Var) {
        e0Var.d(new b(atomicBoolean));
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        m4.b c10 = e0Var.c();
        boolean x10 = e0Var.c().x(16);
        boolean x11 = e0Var.c().x(32);
        if (!x10 && !x11) {
            this.f20857e.a(interfaceC1847n, e0Var);
            return;
        }
        g0 p10 = e0Var.p();
        p10.e(e0Var, "PartialDiskCacheProducer");
        V2.d a10 = this.f20854b.a(c10, e(c10), e0Var.a());
        if (!x10) {
            p10.j(e0Var, "PartialDiskCacheProducer", f(p10, e0Var, false, 0));
            i(interfaceC1847n, e0Var, a10, null);
        } else {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.f20853a.m(a10, atomicBoolean).e(h(interfaceC1847n, e0Var, a10));
            j(atomicBoolean, e0Var);
        }
    }
}
