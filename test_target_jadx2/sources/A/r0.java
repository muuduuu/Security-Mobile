package A;

import A.r0;
import P.c;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.AbstractC1429c0;
import androidx.camera.core.impl.InterfaceC1455p0;
import androidx.camera.core.impl.InterfaceC1457q0;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.V0;
import androidx.camera.core.impl.Z0;
import androidx.camera.core.impl.l1;
import androidx.camera.core.impl.m1;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class r0 extends J0 {

    /* renamed from: x, reason: collision with root package name */
    public static final b f215x = new b();

    /* renamed from: y, reason: collision with root package name */
    private static final Executor f216y = F.c.e();

    /* renamed from: p, reason: collision with root package name */
    private c f217p;

    /* renamed from: q, reason: collision with root package name */
    private Executor f218q;

    /* renamed from: r, reason: collision with root package name */
    V0.b f219r;

    /* renamed from: s, reason: collision with root package name */
    private AbstractC1429c0 f220s;

    /* renamed from: t, reason: collision with root package name */
    private M.L f221t;

    /* renamed from: u, reason: collision with root package name */
    I0 f222u;

    /* renamed from: v, reason: collision with root package name */
    private M.U f223v;

    /* renamed from: w, reason: collision with root package name */
    private V0.c f224w;

    public static final class a implements l1.a, InterfaceC1457q0.a {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.camera.core.impl.B0 f225a;

        public a() {
            this(androidx.camera.core.impl.B0.d0());
        }

        static a f(androidx.camera.core.impl.V v10) {
            return new a(androidx.camera.core.impl.B0.e0(v10));
        }

        @Override // A.C
        public androidx.camera.core.impl.A0 b() {
            return this.f225a;
        }

        public r0 e() {
            androidx.camera.core.impl.J0 c10 = c();
            InterfaceC1457q0.E(c10);
            return new r0(c10);
        }

        @Override // androidx.camera.core.impl.l1.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public androidx.camera.core.impl.J0 c() {
            return new androidx.camera.core.impl.J0(androidx.camera.core.impl.G0.b0(this.f225a));
        }

        public a h(m1.b bVar) {
            b().x(l1.f14636F, bVar);
            return this;
        }

        public a i(B b10) {
            b().x(InterfaceC1455p0.f14674m, b10);
            return this;
        }

        public a j(P.c cVar) {
            b().x(InterfaceC1457q0.f14683v, cVar);
            return this;
        }

        public a k(int i10) {
            b().x(l1.f14632B, Integer.valueOf(i10));
            return this;
        }

        public a l(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            b().x(InterfaceC1457q0.f14675n, Integer.valueOf(i10));
            return this;
        }

        public a m(Class cls) {
            b().x(H.m.f3079c, cls);
            if (b().f(H.m.f3078b, null) == null) {
                n(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a n(String str) {
            b().x(H.m.f3078b, str);
            return this;
        }

        @Override // androidx.camera.core.impl.InterfaceC1457q0.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public a a(Size size) {
            b().x(InterfaceC1457q0.f14679r, size);
            return this;
        }

        @Override // androidx.camera.core.impl.InterfaceC1457q0.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public a d(int i10) {
            b().x(InterfaceC1457q0.f14676o, Integer.valueOf(i10));
            b().x(InterfaceC1457q0.f14677p, Integer.valueOf(i10));
            return this;
        }

        private a(androidx.camera.core.impl.B0 b02) {
            this.f225a = b02;
            Class cls = (Class) b02.f(H.m.f3079c, null);
            if (cls != null && !cls.equals(r0.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            h(m1.b.PREVIEW);
            m(r0.class);
            V.a aVar = InterfaceC1457q0.f14678q;
            if (((Integer) b02.f(aVar, -1)).intValue() == -1) {
                b02.x(aVar, 2);
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final P.c f226a;

        /* renamed from: b, reason: collision with root package name */
        private static final androidx.camera.core.impl.J0 f227b;

        /* renamed from: c, reason: collision with root package name */
        private static final B f228c;

        static {
            P.c a10 = new c.a().d(P.a.f7357c).f(P.d.f7369c).a();
            f226a = a10;
            B b10 = B.f6c;
            f228c = b10;
            f227b = new a().k(2).l(0).j(a10).i(b10).c();
        }

        public androidx.camera.core.impl.J0 a() {
            return f227b;
        }
    }

    public interface c {
        void a(I0 i02);
    }

    r0(androidx.camera.core.impl.J0 j02) {
        super(j02);
        this.f218q = f216y;
    }

    private void c0(V0.b bVar, Z0 z02) {
        if (this.f217p != null) {
            bVar.m(this.f220s, z02.b(), p(), n());
        }
        V0.c cVar = this.f224w;
        if (cVar != null) {
            cVar.b();
        }
        V0.c cVar2 = new V0.c(new V0.d() { // from class: A.q0
            @Override // androidx.camera.core.impl.V0.d
            public final void a(V0 v02, V0.g gVar) {
                r0.this.g0(v02, gVar);
            }
        });
        this.f224w = cVar2;
        bVar.t(cVar2);
    }

    private void d0() {
        V0.c cVar = this.f224w;
        if (cVar != null) {
            cVar.b();
            this.f224w = null;
        }
        AbstractC1429c0 abstractC1429c0 = this.f220s;
        if (abstractC1429c0 != null) {
            abstractC1429c0.d();
            this.f220s = null;
        }
        M.U u10 = this.f223v;
        if (u10 != null) {
            u10.i();
            this.f223v = null;
        }
        M.L l10 = this.f221t;
        if (l10 != null) {
            l10.i();
            this.f221t = null;
        }
        this.f222u = null;
    }

    private V0.b e0(androidx.camera.core.impl.J0 j02, Z0 z02) {
        E.q.a();
        androidx.camera.core.impl.H g10 = g();
        Objects.requireNonNull(g10);
        androidx.camera.core.impl.H h10 = g10;
        d0();
        y0.f.i(this.f221t == null);
        Matrix v10 = v();
        boolean o10 = h10.o();
        Rect f02 = f0(z02.e());
        Objects.requireNonNull(f02);
        this.f221t = new M.L(1, 34, z02, v10, o10, f02, r(h10, C(h10)), d(), m0(h10));
        l();
        this.f221t.e(new Runnable() { // from class: A.o0
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.G();
            }
        });
        I0 k10 = this.f221t.k(h10);
        this.f222u = k10;
        this.f220s = k10.m();
        if (this.f217p != null) {
            i0();
        }
        V0.b q10 = V0.b.q(j02, z02.e());
        q10.u(z02.c());
        q10.y(j02.O());
        if (z02.d() != null) {
            q10.g(z02.d());
        }
        c0(q10, z02);
        return q10;
    }

    private Rect f0(Size size) {
        if (A() != null) {
            return A();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0(V0 v02, V0.g gVar) {
        if (g() == null) {
            return;
        }
        n0((androidx.camera.core.impl.J0) j(), e());
        G();
    }

    private void i0() {
        j0();
        final c cVar = (c) y0.f.g(this.f217p);
        final I0 i02 = (I0) y0.f.g(this.f222u);
        this.f218q.execute(new Runnable() { // from class: A.p0
            @Override // java.lang.Runnable
            public final void run() {
                r0.c.this.a(i02);
            }
        });
    }

    private void j0() {
        androidx.camera.core.impl.H g10 = g();
        M.L l10 = this.f221t;
        if (g10 == null || l10 == null) {
            return;
        }
        l10.D(r(g10, C(g10)), d());
    }

    private boolean m0(androidx.camera.core.impl.H h10) {
        return h10.o() && C(h10);
    }

    private void n0(androidx.camera.core.impl.J0 j02, Z0 z02) {
        List a10;
        V0.b e02 = e0(j02, z02);
        this.f219r = e02;
        a10 = H.a(new Object[]{e02.o()});
        X(a10);
    }

    @Override // A.J0
    protected l1 L(androidx.camera.core.impl.G g10, l1.a aVar) {
        aVar.b().x(InterfaceC1455p0.f14673l, 34);
        return aVar.c();
    }

    @Override // A.J0
    protected Z0 O(androidx.camera.core.impl.V v10) {
        List a10;
        this.f219r.g(v10);
        a10 = H.a(new Object[]{this.f219r.o()});
        X(a10);
        return e().g().d(v10).a();
    }

    @Override // A.J0
    protected Z0 P(Z0 z02, Z0 z03) {
        n0((androidx.camera.core.impl.J0) j(), z02);
        return z02;
    }

    @Override // A.J0
    public void Q() {
        d0();
    }

    @Override // A.J0
    public void V(Rect rect) {
        super.V(rect);
        j0();
    }

    @Override // A.J0
    public l1 k(boolean z10, m1 m1Var) {
        b bVar = f215x;
        androidx.camera.core.impl.V a10 = m1Var.a(bVar.a().F(), 1);
        if (z10) {
            a10 = androidx.camera.core.impl.V.H(a10, bVar.a());
        }
        if (a10 == null) {
            return null;
        }
        return z(a10).c();
    }

    public void k0(c cVar) {
        l0(f216y, cVar);
    }

    public void l0(Executor executor, c cVar) {
        E.q.a();
        if (cVar == null) {
            this.f217p = null;
            F();
            return;
        }
        this.f217p = cVar;
        this.f218q = executor;
        if (f() != null) {
            n0((androidx.camera.core.impl.J0) j(), e());
            G();
        }
        E();
    }

    public String toString() {
        return "Preview:" + o();
    }

    @Override // A.J0
    public Set x() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // A.J0
    public l1.a z(androidx.camera.core.impl.V v10) {
        return a.f(v10);
    }
}
