package androidx.camera.core;

import A.B;
import A.J0;
import P.c;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.f;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.AbstractC1429c0;
import androidx.camera.core.impl.B0;
import androidx.camera.core.impl.C1451n0;
import androidx.camera.core.impl.C1460s0;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.G0;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.InterfaceC1455p0;
import androidx.camera.core.impl.InterfaceC1457q0;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.V0;
import androidx.camera.core.impl.Z0;
import androidx.camera.core.impl.l1;
import androidx.camera.core.impl.m1;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f extends J0 {

    /* renamed from: v, reason: collision with root package name */
    public static final d f14359v = new d();

    /* renamed from: w, reason: collision with root package name */
    private static final Boolean f14360w = null;

    /* renamed from: p, reason: collision with root package name */
    final i f14361p;

    /* renamed from: q, reason: collision with root package name */
    private final Object f14362q;

    /* renamed from: r, reason: collision with root package name */
    private a f14363r;

    /* renamed from: s, reason: collision with root package name */
    V0.b f14364s;

    /* renamed from: t, reason: collision with root package name */
    private AbstractC1429c0 f14365t;

    /* renamed from: u, reason: collision with root package name */
    private V0.c f14366u;

    public interface a {
        void analyze(n nVar);

        default Size getDefaultTargetResolution() {
            return null;
        }

        default int getTargetCoordinateSystem() {
            return 0;
        }

        default void updateTransform(Matrix matrix) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class c implements InterfaceC1457q0.a, l1.a {

        /* renamed from: a, reason: collision with root package name */
        private final B0 f14367a;

        public c() {
            this(B0.d0());
        }

        static c f(V v10) {
            return new c(B0.e0(v10));
        }

        @Override // A.C
        public A0 b() {
            return this.f14367a;
        }

        public f e() {
            C1451n0 c10 = c();
            InterfaceC1457q0.E(c10);
            return new f(c10);
        }

        @Override // androidx.camera.core.impl.l1.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C1451n0 c() {
            return new C1451n0(G0.b0(this.f14367a));
        }

        public c h(int i10) {
            b().x(C1451n0.f14650J, Integer.valueOf(i10));
            return this;
        }

        public c i(m1.b bVar) {
            b().x(l1.f14636F, bVar);
            return this;
        }

        public c j(Size size) {
            b().x(InterfaceC1457q0.f14680s, size);
            return this;
        }

        public c k(B b10) {
            if (!Objects.equals(B.f7d, b10)) {
                throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
            }
            b().x(InterfaceC1455p0.f14674m, b10);
            return this;
        }

        public c l(P.c cVar) {
            b().x(InterfaceC1457q0.f14683v, cVar);
            return this;
        }

        public c m(int i10) {
            b().x(l1.f14632B, Integer.valueOf(i10));
            return this;
        }

        public c n(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            b().x(InterfaceC1457q0.f14675n, Integer.valueOf(i10));
            return this;
        }

        public c o(Class cls) {
            b().x(H.m.f3079c, cls);
            if (b().f(H.m.f3078b, null) == null) {
                p(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public c p(String str) {
            b().x(H.m.f3078b, str);
            return this;
        }

        @Override // androidx.camera.core.impl.InterfaceC1457q0.a
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public c a(Size size) {
            b().x(InterfaceC1457q0.f14679r, size);
            return this;
        }

        @Override // androidx.camera.core.impl.InterfaceC1457q0.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public c d(int i10) {
            b().x(InterfaceC1457q0.f14676o, Integer.valueOf(i10));
            return this;
        }

        private c(B0 b02) {
            this.f14367a = b02;
            Class cls = (Class) b02.f(H.m.f3079c, null);
            if (cls == null || cls.equals(f.class)) {
                i(m1.b.IMAGE_ANALYSIS);
                o(f.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private static final Size f14368a;

        /* renamed from: b, reason: collision with root package name */
        private static final B f14369b;

        /* renamed from: c, reason: collision with root package name */
        private static final P.c f14370c;

        /* renamed from: d, reason: collision with root package name */
        private static final C1451n0 f14371d;

        static {
            Size size = new Size(HVFrameRecorder.VIDEO_HEIGHT, HVFrameRecorder.VIDEO_WIDTH);
            f14368a = size;
            B b10 = B.f7d;
            f14369b = b10;
            P.c a10 = new c.a().d(P.a.f7357c).f(new P.d(L.d.f5619c, 1)).a();
            f14370c = a10;
            f14371d = new c().j(size).m(1).n(0).l(a10).k(b10).c();
        }

        public C1451n0 a() {
            return f14371d;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    f(C1451n0 c1451n0) {
        super(c1451n0);
        this.f14362q = new Object();
        if (((C1451n0) j()).Z(0) == 1) {
            this.f14361p = new j();
        } else {
            this.f14361p = new k(c1451n0.T(F.c.c()));
        }
        this.f14361p.t(j0());
        this.f14361p.u(l0());
    }

    private boolean k0(H h10) {
        return l0() && q(h10) % 180 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m0(q qVar, q qVar2) {
        qVar.m();
        if (qVar2 != null) {
            qVar2.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(V0 v02, V0.g gVar) {
        List a10;
        if (g() == null) {
            return;
        }
        e0();
        this.f14361p.g();
        V0.b f02 = f0(i(), (C1451n0) j(), (Z0) y0.f.g(e()));
        this.f14364s = f02;
        a10 = A.H.a(new Object[]{f02.o()});
        X(a10);
        G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List o0(Size size, List list, int i10) {
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.contains(size)) {
            arrayList.remove(size);
            arrayList.add(0, size);
        }
        return arrayList;
    }

    private void s0() {
        H g10 = g();
        if (g10 != null) {
            this.f14361p.w(q(g10));
        }
    }

    @Override // A.J0
    public void J() {
        this.f14361p.f();
    }

    @Override // A.J0
    protected l1 L(G g10, l1.a aVar) {
        final Size defaultTargetResolution;
        Boolean i02 = i0();
        boolean a10 = g10.p().a(OnePixelShiftQuirk.class);
        i iVar = this.f14361p;
        if (i02 != null) {
            a10 = i02.booleanValue();
        }
        iVar.s(a10);
        synchronized (this.f14362q) {
            try {
                a aVar2 = this.f14363r;
                defaultTargetResolution = aVar2 != null ? aVar2.getDefaultTargetResolution() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (defaultTargetResolution == null) {
            return aVar.c();
        }
        if (g10.m(((Integer) aVar.b().f(InterfaceC1457q0.f14676o, 0)).intValue()) % 180 == 90) {
            defaultTargetResolution = new Size(defaultTargetResolution.getHeight(), defaultTargetResolution.getWidth());
        }
        l1 c10 = aVar.c();
        V.a aVar3 = InterfaceC1457q0.f14679r;
        if (!c10.b(aVar3)) {
            aVar.b().x(aVar3, defaultTargetResolution);
        }
        l1 c11 = aVar.c();
        V.a aVar4 = InterfaceC1457q0.f14683v;
        if (c11.b(aVar4)) {
            P.c cVar = (P.c) c().f(aVar4, null);
            c.a aVar5 = cVar == null ? new c.a() : c.a.b(cVar);
            if (cVar == null || cVar.d() == null) {
                aVar5.f(new P.d(defaultTargetResolution, 1));
            }
            if (cVar == null) {
                aVar5.e(new P.b() { // from class: A.K
                    @Override // P.b
                    public final List a(List list, int i10) {
                        List o02;
                        o02 = androidx.camera.core.f.o0(defaultTargetResolution, list, i10);
                        return o02;
                    }
                });
            }
            aVar.b().x(aVar4, aVar5.a());
        }
        return aVar.c();
    }

    @Override // A.J0
    protected Z0 O(V v10) {
        List a10;
        this.f14364s.g(v10);
        a10 = A.H.a(new Object[]{this.f14364s.o()});
        X(a10);
        return e().g().d(v10).a();
    }

    @Override // A.J0
    protected Z0 P(Z0 z02, Z0 z03) {
        List a10;
        V0.b f02 = f0(i(), (C1451n0) j(), z02);
        this.f14364s = f02;
        a10 = A.H.a(new Object[]{f02.o()});
        X(a10);
        return z02;
    }

    @Override // A.J0
    public void Q() {
        e0();
        this.f14361p.j();
    }

    @Override // A.J0
    public void T(Matrix matrix) {
        super.T(matrix);
        this.f14361p.x(matrix);
    }

    @Override // A.J0
    public void V(Rect rect) {
        super.V(rect);
        this.f14361p.y(rect);
    }

    void e0() {
        E.q.a();
        V0.c cVar = this.f14366u;
        if (cVar != null) {
            cVar.b();
            this.f14366u = null;
        }
        AbstractC1429c0 abstractC1429c0 = this.f14365t;
        if (abstractC1429c0 != null) {
            abstractC1429c0.d();
            this.f14365t = null;
        }
    }

    V0.b f0(String str, C1451n0 c1451n0, Z0 z02) {
        E.q.a();
        Size e10 = z02.e();
        Executor executor = (Executor) y0.f.g(c1451n0.T(F.c.c()));
        boolean z10 = true;
        int h02 = g0() == 1 ? h0() : 4;
        c1451n0.b0();
        final q qVar = new q(o.a(e10.getWidth(), e10.getHeight(), m(), h02));
        boolean k02 = g() != null ? k0(g()) : false;
        int height = k02 ? e10.getHeight() : e10.getWidth();
        int width = k02 ? e10.getWidth() : e10.getHeight();
        int i10 = j0() == 2 ? 1 : 35;
        boolean z11 = m() == 35 && j0() == 2;
        if (m() != 35 || ((g() == null || q(g()) == 0) && !Boolean.TRUE.equals(i0()))) {
            z10 = false;
        }
        final q qVar2 = (z11 || z10) ? new q(o.a(height, width, i10, qVar.f())) : null;
        if (qVar2 != null) {
            this.f14361p.v(qVar2);
        }
        s0();
        qVar.h(this.f14361p, executor);
        V0.b q10 = V0.b.q(c1451n0, z02.e());
        if (z02.d() != null) {
            q10.g(z02.d());
        }
        AbstractC1429c0 abstractC1429c0 = this.f14365t;
        if (abstractC1429c0 != null) {
            abstractC1429c0.d();
        }
        C1460s0 c1460s0 = new C1460s0(qVar.a(), e10, m());
        this.f14365t = c1460s0;
        c1460s0.k().e(new Runnable() { // from class: A.L
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.f.m0(androidx.camera.core.q.this, qVar2);
            }
        }, F.c.e());
        q10.u(z02.c());
        q10.m(this.f14365t, z02.b(), null, -1);
        V0.c cVar = this.f14366u;
        if (cVar != null) {
            cVar.b();
        }
        V0.c cVar2 = new V0.c(new V0.d() { // from class: A.M
            @Override // androidx.camera.core.impl.V0.d
            public final void a(V0 v02, V0.g gVar) {
                androidx.camera.core.f.this.n0(v02, gVar);
            }
        });
        this.f14366u = cVar2;
        q10.t(cVar2);
        return q10;
    }

    public int g0() {
        return ((C1451n0) j()).Z(0);
    }

    public int h0() {
        return ((C1451n0) j()).a0(6);
    }

    public Boolean i0() {
        return ((C1451n0) j()).c0(f14360w);
    }

    public int j0() {
        return ((C1451n0) j()).d0(1);
    }

    @Override // A.J0
    public l1 k(boolean z10, m1 m1Var) {
        d dVar = f14359v;
        V a10 = m1Var.a(dVar.a().F(), 1);
        if (z10) {
            a10 = V.H(a10, dVar.a());
        }
        if (a10 == null) {
            return null;
        }
        return z(a10).c();
    }

    public boolean l0() {
        return ((C1451n0) j()).e0(Boolean.FALSE).booleanValue();
    }

    public void q0(Executor executor, final a aVar) {
        synchronized (this.f14362q) {
            try {
                this.f14361p.r(executor, new a() { // from class: A.J
                    @Override // androidx.camera.core.f.a
                    public final void analyze(androidx.camera.core.n nVar) {
                        f.a.this.analyze(nVar);
                    }
                });
                if (this.f14363r == null) {
                    E();
                }
                this.f14363r = aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void r0(int i10) {
        if (U(i10)) {
            s0();
        }
    }

    public String toString() {
        return "ImageAnalysis:" + o();
    }

    @Override // A.J0
    public l1.a z(V v10) {
        return c.f(v10);
    }
}
