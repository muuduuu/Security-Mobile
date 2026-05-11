package com.facebook.imagepipeline.producers;

import a4.C1349a;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.X;
import e3.InterfaceC3074a;
import f3.AbstractC3142a;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public class W implements d0 {

    /* renamed from: a, reason: collision with root package name */
    protected final e3.i f20848a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3074a f20849b;

    /* renamed from: c, reason: collision with root package name */
    private final X f20850c;

    class a implements X.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f20851a;

        a(C c10) {
            this.f20851a = c10;
        }

        @Override // com.facebook.imagepipeline.producers.X.a
        public void a() {
            W.this.k(this.f20851a);
        }

        @Override // com.facebook.imagepipeline.producers.X.a
        public void b(InputStream inputStream, int i10) {
            if (n4.b.d()) {
                n4.b.a("NetworkFetcher->onResponse");
            }
            W.this.m(this.f20851a, inputStream, i10);
            if (n4.b.d()) {
                n4.b.b();
            }
        }

        @Override // com.facebook.imagepipeline.producers.X.a
        public void onFailure(Throwable th) {
            W.this.l(this.f20851a, th);
        }
    }

    public W(e3.i iVar, InterfaceC3074a interfaceC3074a, X x10) {
        this.f20848a = iVar;
        this.f20849b = interfaceC3074a;
        this.f20850c = x10;
    }

    protected static float e(int i10, int i11) {
        return i11 > 0 ? i10 / i11 : 1.0f - ((float) Math.exp((-i10) / 50000.0d));
    }

    private Map f(C c10, int i10) {
        if (c10.d().g(c10.b(), "NetworkFetchProducer")) {
            return this.f20850c.c(c10, i10);
        }
        return null;
    }

    protected static void j(e3.k kVar, int i10, C1349a c1349a, InterfaceC1847n interfaceC1847n, e0 e0Var) {
        g4.i iVar;
        AbstractC3142a y10 = AbstractC3142a.y(kVar.a());
        g4.i iVar2 = null;
        try {
            iVar = new g4.i(y10);
        } catch (Throwable th) {
            th = th;
        }
        try {
            iVar.I(c1349a);
            iVar.z();
            interfaceC1847n.c(iVar, i10);
            g4.i.c(iVar);
            AbstractC3142a.n(y10);
        } catch (Throwable th2) {
            th = th2;
            iVar2 = iVar;
            g4.i.c(iVar2);
            AbstractC3142a.n(y10);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(C c10) {
        c10.d().d(c10.b(), "NetworkFetchProducer", null);
        c10.a().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(C c10, Throwable th) {
        c10.d().k(c10.b(), "NetworkFetchProducer", th, null);
        c10.d().c(c10.b(), "NetworkFetchProducer", false);
        c10.b().o("network");
        c10.a().onFailure(th);
    }

    private boolean n(C c10, e0 e0Var) {
        e4.e p10 = e0Var.e().p();
        if (p10 != null && p10.c() && c10.b().q()) {
            return this.f20850c.b(c10);
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        e0Var.p().e(e0Var, "NetworkFetchProducer");
        C e10 = this.f20850c.e(interfaceC1847n, e0Var);
        this.f20850c.d(e10, new a(e10));
    }

    protected long g() {
        return SystemClock.uptimeMillis();
    }

    protected void h(e3.k kVar, C c10) {
        Map f10 = f(c10, kVar.size());
        g0 d10 = c10.d();
        d10.j(c10.b(), "NetworkFetchProducer", f10);
        d10.c(c10.b(), "NetworkFetchProducer", true);
        c10.b().o("network");
        j(kVar, c10.e() | 1, c10.f(), c10.a(), c10.b());
    }

    protected void i(e3.k kVar, C c10) {
        if (n(c10, c10.b())) {
            long g10 = g();
            if (g10 - c10.c() >= 100) {
                c10.h(g10);
                c10.d().a(c10.b(), "NetworkFetchProducer", "intermediate_result");
                j(kVar, c10.e(), c10.f(), c10.a(), c10.b());
            }
        }
    }

    protected void m(C c10, InputStream inputStream, int i10) {
        e3.k e10 = i10 > 0 ? this.f20848a.e(i10) : this.f20848a.a();
        byte[] bArr = (byte[]) this.f20849b.get(16384);
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    this.f20850c.a(c10, e10.size());
                    h(e10, c10);
                    this.f20849b.a(bArr);
                    e10.close();
                    return;
                }
                if (read > 0) {
                    e10.write(bArr, 0, read);
                    i(e10, c10);
                    c10.a().b(e(e10.size(), i10));
                }
            } catch (Throwable th) {
                this.f20849b.a(bArr);
                e10.close();
                throw th;
            }
        }
    }
}
