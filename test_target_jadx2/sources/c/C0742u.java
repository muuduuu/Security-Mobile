package C;

import A.AbstractC0700h0;
import A.InterfaceC0692d0;
import C.C0742u;
import C.O;
import C.Z;
import M.C0973u;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.e;
import androidx.camera.core.impl.AbstractC1429c0;
import androidx.camera.core.impl.AbstractC1450n;
import androidx.camera.core.impl.AbstractC1452o;
import androidx.camera.core.impl.C1460s0;
import androidx.camera.core.impl.InterfaceC1458r0;
import java.util.Objects;
import y0.InterfaceC5159a;

/* renamed from: C.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0742u {

    /* renamed from: b, reason: collision with root package name */
    androidx.camera.core.q f714b;

    /* renamed from: c, reason: collision with root package name */
    androidx.camera.core.q f715c;

    /* renamed from: d, reason: collision with root package name */
    private O.a f716d;

    /* renamed from: e, reason: collision with root package name */
    private c f717e;

    /* renamed from: a, reason: collision with root package name */
    P f713a = null;

    /* renamed from: f, reason: collision with root package name */
    private E f718f = null;

    /* renamed from: C.u$a */
    class a extends AbstractC1450n {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            P p10 = C0742u.this.f713a;
            if (p10 != null) {
                p10.n();
            }
        }

        @Override // androidx.camera.core.impl.AbstractC1450n
        public void d(int i10) {
            F.c.e().execute(new Runnable() { // from class: C.t
                @Override // java.lang.Runnable
                public final void run() {
                    C0742u.a.this.f();
                }
            });
        }
    }

    /* renamed from: C.u$c */
    static abstract class c {

        /* renamed from: b, reason: collision with root package name */
        private AbstractC1429c0 f723b;

        /* renamed from: a, reason: collision with root package name */
        private AbstractC1450n f722a = new a();

        /* renamed from: c, reason: collision with root package name */
        private AbstractC1429c0 f724c = null;

        /* renamed from: C.u$c$a */
        class a extends AbstractC1450n {
            a() {
            }
        }

        c() {
        }

        static c m(Size size, int i10, int i11, boolean z10, InterfaceC0692d0 interfaceC0692d0, Size size2, int i12) {
            return new C0724b(size, i10, i11, z10, interfaceC0692d0, size2, i12, new C0973u(), new C0973u());
        }

        AbstractC1450n a() {
            return this.f722a;
        }

        abstract C0973u b();

        abstract InterfaceC0692d0 c();

        abstract int d();

        abstract int e();

        abstract int f();

        abstract Size g();

        AbstractC1429c0 h() {
            return this.f724c;
        }

        abstract C0973u i();

        abstract Size j();

        AbstractC1429c0 k() {
            AbstractC1429c0 abstractC1429c0 = this.f723b;
            Objects.requireNonNull(abstractC1429c0);
            return abstractC1429c0;
        }

        abstract boolean l();

        void n(AbstractC1450n abstractC1450n) {
            this.f722a = abstractC1450n;
        }

        void o(Surface surface, Size size, int i10) {
            this.f724c = new C1460s0(surface, size, i10);
        }

        void p(Surface surface) {
            y0.f.j(this.f723b == null, "The surface is already set.");
            this.f723b = new C1460s0(surface, j(), d());
        }
    }

    C0742u() {
    }

    private static InterfaceC1458r0 g(InterfaceC0692d0 interfaceC0692d0, int i10, int i11, int i12) {
        return interfaceC0692d0 != null ? interfaceC0692d0.a(i10, i11, i12, 4, 0L) : androidx.camera.core.o.a(i10, i11, i12, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(androidx.camera.core.q qVar) {
        if (qVar != null) {
            qVar.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(P p10) {
        p(p10);
        this.f718f.i(p10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(InterfaceC1458r0 interfaceC1458r0) {
        try {
            androidx.camera.core.n c10 = interfaceC1458r0.c();
            if (c10 != null) {
                o(c10);
            } else {
                P p10 = this.f713a;
                if (p10 != null) {
                    t(Z.b.c(p10.e(), new A.X(2, "Failed to acquire latest image", null)));
                }
            }
        } catch (IllegalStateException e10) {
            P p11 = this.f713a;
            if (p11 != null) {
                t(Z.b.c(p11.e(), new A.X(2, "Failed to acquire latest image", e10)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(InterfaceC1458r0 interfaceC1458r0) {
        try {
            androidx.camera.core.n c10 = interfaceC1458r0.c();
            if (c10 != null) {
                q(c10);
            }
        } catch (IllegalStateException e10) {
            AbstractC0700h0.d("CaptureNode", "Failed to acquire latest image of postview", e10);
        }
    }

    private void n(androidx.camera.core.n nVar) {
        E.q.a();
        O.a aVar = this.f716d;
        Objects.requireNonNull(aVar);
        aVar.a().accept(O.b.c(this.f713a, nVar));
        P p10 = this.f713a;
        this.f713a = null;
        p10.q();
    }

    private void q(androidx.camera.core.n nVar) {
        if (this.f713a == null) {
            AbstractC0700h0.l("CaptureNode", "Postview image is closed due to request completed or aborted");
            nVar.close();
        } else {
            O.a aVar = this.f716d;
            Objects.requireNonNull(aVar);
            aVar.d().accept(O.b.c(this.f713a, nVar));
        }
    }

    private void s(c cVar, final androidx.camera.core.q qVar, final androidx.camera.core.q qVar2) {
        cVar.k().d();
        cVar.k().k().e(new Runnable() { // from class: C.r
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.q.this.m();
            }
        }, F.c.e());
        if (cVar.h() != null) {
            cVar.h().d();
            cVar.h().k().e(new Runnable() { // from class: C.s
                @Override // java.lang.Runnable
                public final void run() {
                    C0742u.j(androidx.camera.core.q.this);
                }
            }, F.c.e());
        }
    }

    public int h() {
        E.q.a();
        y0.f.j(this.f714b != null, "The ImageReader is not initialized.");
        return this.f714b.j();
    }

    void o(androidx.camera.core.n nVar) {
        E.q.a();
        if (this.f713a == null) {
            AbstractC0700h0.l("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + nVar);
            nVar.close();
            return;
        }
        if (((Integer) nVar.G().c().d(this.f713a.i())) != null) {
            n(nVar);
        } else {
            AbstractC0700h0.l("CaptureNode", "Discarding ImageProxy which was acquired for aborted request");
            nVar.close();
        }
    }

    void p(P p10) {
        E.q.a();
        y0.f.j(p10.h().size() == 1, "only one capture stage is supported.");
        y0.f.j(h() > 0, "Too many acquire images. Close image to be able to process next.");
        this.f713a = p10;
        G.n.j(p10.a(), new b(p10), F.c.b());
    }

    public void r() {
        E.q.a();
        c cVar = this.f717e;
        Objects.requireNonNull(cVar);
        androidx.camera.core.q qVar = this.f714b;
        Objects.requireNonNull(qVar);
        s(cVar, qVar, this.f715c);
    }

    void t(Z.b bVar) {
        E.q.a();
        P p10 = this.f713a;
        if (p10 == null || p10.e() != bVar.b()) {
            return;
        }
        this.f713a.l(bVar.a());
    }

    public void u(e.a aVar) {
        E.q.a();
        y0.f.j(this.f714b != null, "The ImageReader is not initialized.");
        this.f714b.n(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public O.a v(c cVar) {
        InterfaceC5159a interfaceC5159a;
        E e10;
        y0.f.j(this.f717e == null && this.f714b == null, "CaptureNode does not support recreation yet.");
        this.f717e = cVar;
        Size j10 = cVar.j();
        int d10 = cVar.d();
        boolean l10 = cVar.l();
        AbstractC1450n aVar = new a();
        if (l10) {
            cVar.c();
            E e11 = new E(g(null, j10.getWidth(), j10.getHeight(), d10));
            this.f718f = e11;
            interfaceC5159a = new InterfaceC5159a() { // from class: C.n
                @Override // y0.InterfaceC5159a
                public final void accept(Object obj) {
                    C0742u.this.k((P) obj);
                }
            };
            e10 = e11;
        } else {
            cVar.c();
            androidx.camera.core.p pVar = new androidx.camera.core.p(j10.getWidth(), j10.getHeight(), d10, 4);
            aVar = AbstractC1452o.b(aVar, pVar.n());
            interfaceC5159a = new InterfaceC5159a() { // from class: C.m
                @Override // y0.InterfaceC5159a
                public final void accept(Object obj) {
                    C0742u.this.p((P) obj);
                }
            };
            e10 = pVar;
        }
        cVar.n(aVar);
        Surface a10 = e10.a();
        Objects.requireNonNull(a10);
        cVar.p(a10);
        this.f714b = new androidx.camera.core.q(e10);
        e10.h(new InterfaceC1458r0.a() { // from class: C.o
            @Override // androidx.camera.core.impl.InterfaceC1458r0.a
            public final void a(InterfaceC1458r0 interfaceC1458r0) {
                C0742u.this.l(interfaceC1458r0);
            }
        }, F.c.e());
        if (cVar.g() != null) {
            cVar.c();
            InterfaceC1458r0 g10 = g(null, cVar.g().getWidth(), cVar.g().getHeight(), cVar.f());
            g10.h(new InterfaceC1458r0.a() { // from class: C.p
                @Override // androidx.camera.core.impl.InterfaceC1458r0.a
                public final void a(InterfaceC1458r0 interfaceC1458r0) {
                    C0742u.this.m(interfaceC1458r0);
                }
            }, F.c.e());
            this.f715c = new androidx.camera.core.q(g10);
            cVar.o(g10.a(), cVar.g(), cVar.f());
        }
        cVar.i().a(interfaceC5159a);
        cVar.b().a(new InterfaceC5159a() { // from class: C.q
            @Override // y0.InterfaceC5159a
            public final void accept(Object obj) {
                C0742u.this.t((Z.b) obj);
            }
        });
        O.a e12 = O.a.e(cVar.d(), cVar.e());
        this.f716d = e12;
        return e12;
    }

    /* renamed from: C.u$b */
    class b implements G.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ P f720a;

        b(P p10) {
            this.f720a = p10;
        }

        @Override // G.c
        public void onFailure(Throwable th) {
            E.q.a();
            if (this.f720a == C0742u.this.f713a) {
                AbstractC0700h0.l("CaptureNode", "request aborted, id=" + C0742u.this.f713a.e());
                if (C0742u.this.f718f != null) {
                    C0742u.this.f718f.j();
                }
                C0742u.this.f713a = null;
            }
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }
}
