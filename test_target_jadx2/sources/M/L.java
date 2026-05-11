package M;

import A.I0;
import A.x0;
import M.L;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.AbstractC1429c0;
import androidx.camera.core.impl.Z0;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import y0.InterfaceC5159a;

/* loaded from: classes.dex */
public class L {

    /* renamed from: a, reason: collision with root package name */
    private final int f5836a;

    /* renamed from: b, reason: collision with root package name */
    private final Matrix f5837b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5838c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f5839d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f5840e;

    /* renamed from: f, reason: collision with root package name */
    private final int f5841f;

    /* renamed from: g, reason: collision with root package name */
    private final Z0 f5842g;

    /* renamed from: h, reason: collision with root package name */
    private int f5843h;

    /* renamed from: i, reason: collision with root package name */
    private int f5844i;

    /* renamed from: k, reason: collision with root package name */
    private I0 f5846k;

    /* renamed from: l, reason: collision with root package name */
    private a f5847l;

    /* renamed from: j, reason: collision with root package name */
    private boolean f5845j = false;

    /* renamed from: m, reason: collision with root package name */
    private final Set f5848m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    private boolean f5849n = false;

    /* renamed from: o, reason: collision with root package name */
    private final List f5850o = new ArrayList();

    static class a extends AbstractC1429c0 {

        /* renamed from: o, reason: collision with root package name */
        final h8.d f5851o;

        /* renamed from: p, reason: collision with root package name */
        c.a f5852p;

        /* renamed from: q, reason: collision with root package name */
        private AbstractC1429c0 f5853q;

        /* renamed from: r, reason: collision with root package name */
        private O f5854r;

        a(Size size, int i10) {
            super(size, i10);
            this.f5851o = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: M.J
                @Override // androidx.concurrent.futures.c.InterfaceC0253c
                public final Object a(c.a aVar) {
                    Object n10;
                    n10 = L.a.this.n(aVar);
                    return n10;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object n(c.a aVar) {
            this.f5852p = aVar;
            return "SettableFuture hashCode: " + hashCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w() {
            O o10 = this.f5854r;
            if (o10 != null) {
                o10.i();
            }
            if (this.f5853q == null) {
                this.f5852p.d();
            }
        }

        @Override // androidx.camera.core.impl.AbstractC1429c0
        public void d() {
            super.d();
            E.q.d(new Runnable() { // from class: M.I
                @Override // java.lang.Runnable
                public final void run() {
                    L.a.this.w();
                }
            });
        }

        @Override // androidx.camera.core.impl.AbstractC1429c0
        protected h8.d r() {
            return this.f5851o;
        }

        boolean v() {
            E.q.a();
            return this.f5853q == null && !m();
        }

        public void x(O o10) {
            y0.f.j(this.f5854r == null, "Consumer can only be linked once.");
            this.f5854r = o10;
        }

        public boolean y(final AbstractC1429c0 abstractC1429c0, Runnable runnable) {
            E.q.a();
            y0.f.g(abstractC1429c0);
            AbstractC1429c0 abstractC1429c02 = this.f5853q;
            if (abstractC1429c02 == abstractC1429c0) {
                return false;
            }
            y0.f.j(abstractC1429c02 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            y0.f.b(h().equals(abstractC1429c0.h()), String.format("The provider's size(%s) must match the parent(%s)", h(), abstractC1429c0.h()));
            y0.f.b(i() == abstractC1429c0.i(), String.format("The provider's format(%s) must match the parent(%s)", Integer.valueOf(i()), Integer.valueOf(abstractC1429c0.i())));
            y0.f.j(!m(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.f5853q = abstractC1429c0;
            G.n.C(abstractC1429c0.j(), this.f5852p);
            abstractC1429c0.l();
            k().e(new Runnable() { // from class: M.K
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1429c0.this.e();
                }
            }, F.c.b());
            abstractC1429c0.f().e(runnable, F.c.e());
            return true;
        }
    }

    public L(int i10, int i11, Z0 z02, Matrix matrix, boolean z10, Rect rect, int i12, int i13, boolean z11) {
        this.f5841f = i10;
        this.f5836a = i11;
        this.f5842g = z02;
        this.f5837b = matrix;
        this.f5838c = z10;
        this.f5839d = rect;
        this.f5844i = i12;
        this.f5843h = i13;
        this.f5840e = z11;
        this.f5847l = new a(z02.e(), i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(int i10, int i11) {
        boolean z10;
        boolean z11 = true;
        if (this.f5844i != i10) {
            this.f5844i = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f5843h != i11) {
            this.f5843h = i11;
        } else {
            z11 = z10;
        }
        if (z11) {
            B();
        }
    }

    private void B() {
        E.q.a();
        I0.h g10 = I0.h.g(this.f5839d, this.f5844i, this.f5843h, u(), this.f5837b, this.f5840e);
        I0 i02 = this.f5846k;
        if (i02 != null) {
            i02.F(g10);
        }
        Iterator it = this.f5850o.iterator();
        while (it.hasNext()) {
            ((InterfaceC5159a) it.next()).accept(g10);
        }
    }

    private void g() {
        y0.f.j(!this.f5845j, "Consumer can only be linked once.");
        this.f5845j = true;
    }

    private void h() {
        y0.f.j(!this.f5849n, "Edge is already closed.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ h8.d x(final a aVar, int i10, x0.a aVar2, x0.a aVar3, Surface surface) {
        y0.f.g(surface);
        try {
            aVar.l();
            O o10 = new O(surface, t(), i10, this.f5842g.e(), aVar2, aVar3, this.f5837b);
            o10.e().e(new Runnable() { // from class: M.H
                @Override // java.lang.Runnable
                public final void run() {
                    L.a.this.e();
                }
            }, F.c.b());
            aVar.x(o10);
            return G.n.p(o10);
        } catch (AbstractC1429c0.a e10) {
            return G.n.n(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y() {
        if (this.f5849n) {
            return;
        }
        v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        F.c.e().execute(new Runnable() { // from class: M.G
            @Override // java.lang.Runnable
            public final void run() {
                L.this.y();
            }
        });
    }

    public void C(AbstractC1429c0 abstractC1429c0) {
        E.q.a();
        h();
        a aVar = this.f5847l;
        Objects.requireNonNull(aVar);
        aVar.y(abstractC1429c0, new C(aVar));
    }

    public void D(final int i10, final int i11) {
        E.q.d(new Runnable() { // from class: M.E
            @Override // java.lang.Runnable
            public final void run() {
                L.this.A(i10, i11);
            }
        });
    }

    public void e(Runnable runnable) {
        E.q.a();
        h();
        this.f5848m.add(runnable);
    }

    public void f(InterfaceC5159a interfaceC5159a) {
        y0.f.g(interfaceC5159a);
        this.f5850o.add(interfaceC5159a);
    }

    public final void i() {
        E.q.a();
        this.f5847l.d();
        this.f5849n = true;
    }

    public h8.d j(final int i10, final x0.a aVar, final x0.a aVar2) {
        E.q.a();
        h();
        g();
        final a aVar3 = this.f5847l;
        return G.n.H(aVar3.j(), new G.a() { // from class: M.F
            @Override // G.a
            public final h8.d apply(Object obj) {
                h8.d x10;
                x10 = L.this.x(aVar3, i10, aVar, aVar2, (Surface) obj);
                return x10;
            }
        }, F.c.e());
    }

    public I0 k(androidx.camera.core.impl.H h10) {
        return l(h10, true);
    }

    public I0 l(androidx.camera.core.impl.H h10, boolean z10) {
        E.q.a();
        h();
        I0 i02 = new I0(this.f5842g.e(), h10, z10, this.f5842g.b(), this.f5842g.c(), new Runnable() { // from class: M.B
            @Override // java.lang.Runnable
            public final void run() {
                L.this.z();
            }
        });
        try {
            final AbstractC1429c0 m10 = i02.m();
            a aVar = this.f5847l;
            Objects.requireNonNull(aVar);
            if (aVar.y(m10, new C(aVar))) {
                h8.d k10 = aVar.k();
                Objects.requireNonNull(m10);
                k10.e(new Runnable() { // from class: M.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC1429c0.this.d();
                    }
                }, F.c.b());
            }
            this.f5846k = i02;
            B();
            return i02;
        } catch (AbstractC1429c0.a e10) {
            throw new AssertionError("Surface is somehow already closed", e10);
        } catch (RuntimeException e11) {
            i02.G();
            throw e11;
        }
    }

    public final void m() {
        E.q.a();
        h();
        this.f5847l.d();
    }

    public Rect n() {
        return this.f5839d;
    }

    public AbstractC1429c0 o() {
        E.q.a();
        h();
        g();
        return this.f5847l;
    }

    public int p() {
        return this.f5836a;
    }

    public int q() {
        return this.f5844i;
    }

    public Matrix r() {
        return this.f5837b;
    }

    public Z0 s() {
        return this.f5842g;
    }

    public int t() {
        return this.f5841f;
    }

    public boolean u() {
        return this.f5838c;
    }

    public void v() {
        E.q.a();
        h();
        if (this.f5847l.v()) {
            return;
        }
        this.f5845j = false;
        this.f5847l.d();
        this.f5847l = new a(this.f5842g.e(), this.f5836a);
        Iterator it = this.f5848m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public boolean w() {
        return this.f5840e;
    }
}
