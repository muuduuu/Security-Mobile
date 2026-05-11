package V;

import A.AbstractC0700h0;
import A.I0;
import A.InterfaceC0713p;
import A.J0;
import M.C0972t;
import M.U;
import V.AbstractC1237a0;
import V.o0;
import V.z0;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.SystemClock;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.AbstractC1429c0;
import androidx.camera.core.impl.AbstractC1450n;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.G0;
import androidx.camera.core.impl.InterfaceC1441i0;
import androidx.camera.core.impl.InterfaceC1455p0;
import androidx.camera.core.impl.InterfaceC1457q0;
import androidx.camera.core.impl.InterfaceC1469x;
import androidx.camera.core.impl.V0;
import androidx.camera.core.impl.Z0;
import androidx.camera.core.impl.e1;
import androidx.camera.core.impl.l1;
import androidx.camera.core.impl.m1;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import androidx.concurrent.futures.c;
import d0.AbstractC2971b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC3735a;

/* loaded from: classes.dex */
public final class o0 extends J0 {

    /* renamed from: D, reason: collision with root package name */
    private static final e f10672D = new e();

    /* renamed from: A, reason: collision with root package name */
    private f f10673A;

    /* renamed from: B, reason: collision with root package name */
    private V0.c f10674B;

    /* renamed from: C, reason: collision with root package name */
    private final E0.a f10675C;

    /* renamed from: p, reason: collision with root package name */
    AbstractC1429c0 f10676p;

    /* renamed from: q, reason: collision with root package name */
    private M.L f10677q;

    /* renamed from: r, reason: collision with root package name */
    AbstractC1237a0 f10678r;

    /* renamed from: s, reason: collision with root package name */
    V0.b f10679s;

    /* renamed from: t, reason: collision with root package name */
    h8.d f10680t;

    /* renamed from: u, reason: collision with root package name */
    private I0 f10681u;

    /* renamed from: v, reason: collision with root package name */
    z0.a f10682v;

    /* renamed from: w, reason: collision with root package name */
    private M.U f10683w;

    /* renamed from: x, reason: collision with root package name */
    private Rect f10684x;

    /* renamed from: y, reason: collision with root package name */
    private int f10685y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f10686z;

    class a implements E0.a {
        a() {
        }

        @Override // androidx.camera.core.impl.E0.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC1237a0 abstractC1237a0) {
            List a10;
            List a11;
            if (abstractC1237a0 == null) {
                throw new IllegalArgumentException("StreamInfo can't be null");
            }
            if (o0.this.f10682v == z0.a.INACTIVE) {
                return;
            }
            AbstractC0700h0.a("VideoCapture", "Stream info update: old: " + o0.this.f10678r + " new: " + abstractC1237a0);
            o0 o0Var = o0.this;
            AbstractC1237a0 abstractC1237a02 = o0Var.f10678r;
            o0Var.f10678r = abstractC1237a0;
            Z0 z02 = (Z0) y0.f.g(o0Var.e());
            if (o0.this.H0(abstractC1237a02.a(), abstractC1237a0.a()) || o0.this.c1(abstractC1237a02, abstractC1237a0)) {
                o0.this.Q0();
                return;
            }
            if ((abstractC1237a02.a() != -1 && abstractC1237a0.a() == -1) || (abstractC1237a02.a() == -1 && abstractC1237a0.a() != -1)) {
                o0 o0Var2 = o0.this;
                o0Var2.t0(o0Var2.f10679s, abstractC1237a0, z02);
                o0 o0Var3 = o0.this;
                a11 = A.H.a(new Object[]{o0Var3.f10679s.o()});
                o0Var3.X(a11);
                o0.this.G();
                return;
            }
            if (abstractC1237a02.c() != abstractC1237a0.c()) {
                o0 o0Var4 = o0.this;
                o0Var4.t0(o0Var4.f10679s, abstractC1237a0, z02);
                o0 o0Var5 = o0.this;
                a10 = A.H.a(new Object[]{o0Var5.f10679s.o()});
                o0Var5.X(a10);
                o0.this.I();
            }
        }

        @Override // androidx.camera.core.impl.E0.a
        public void onError(Throwable th) {
            AbstractC0700h0.m("VideoCapture", "Receive onError from StreamState observer", th);
        }
    }

    class b extends AbstractC1450n {

        /* renamed from: a, reason: collision with root package name */
        private boolean f10688a = true;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f10689b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c.a f10690c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ V0.b f10691d;

        b(AtomicBoolean atomicBoolean, c.a aVar, V0.b bVar) {
            this.f10689b = atomicBoolean;
            this.f10690c = aVar;
            this.f10691d = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(V0.b bVar) {
            bVar.s(this);
        }

        @Override // androidx.camera.core.impl.AbstractC1450n
        public void b(int i10, InterfaceC1469x interfaceC1469x) {
            Object d10;
            super.b(i10, interfaceC1469x);
            if (this.f10688a) {
                this.f10688a = false;
                AbstractC0700h0.a("VideoCapture", "cameraCaptureResult timestampNs = " + interfaceC1469x.a() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
            }
            if (this.f10689b.get() || (d10 = interfaceC1469x.c().d("androidx.camera.video.VideoCapture.streamUpdate")) == null || ((Integer) d10).intValue() != this.f10690c.hashCode() || !this.f10690c.c(null) || this.f10689b.getAndSet(true)) {
                return;
            }
            ScheduledExecutorService e10 = F.c.e();
            final V0.b bVar = this.f10691d;
            e10.execute(new Runnable() { // from class: V.p0
                @Override // java.lang.Runnable
                public final void run() {
                    o0.b.this.f(bVar);
                }
            });
        }
    }

    class c implements G.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h8.d f10693a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f10694b;

        c(h8.d dVar, boolean z10) {
            this.f10693a = dVar;
            this.f10694b = z10;
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r32) {
            h8.d dVar = this.f10693a;
            o0 o0Var = o0.this;
            if (dVar != o0Var.f10680t || o0Var.f10682v == z0.a.INACTIVE) {
                return;
            }
            o0Var.V0(this.f10694b ? z0.a.ACTIVE_STREAMING : z0.a.ACTIVE_NON_STREAMING);
        }

        @Override // G.c
        public void onFailure(Throwable th) {
            if (th instanceof CancellationException) {
                return;
            }
            AbstractC0700h0.d("VideoCapture", "Surface update completed with unexpected exception", th);
        }
    }

    public static final class d implements l1.a, InterfaceC1457q0.a {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.camera.core.impl.B0 f10696a;

        public d(z0 z0Var) {
            this(f(z0Var));
        }

        private static androidx.camera.core.impl.B0 f(z0 z0Var) {
            androidx.camera.core.impl.B0 d02 = androidx.camera.core.impl.B0.d0();
            d02.x(W.a.f11158J, z0Var);
            return d02;
        }

        static d g(androidx.camera.core.impl.V v10) {
            return new d(androidx.camera.core.impl.B0.e0(v10));
        }

        @Override // A.C
        public androidx.camera.core.impl.A0 b() {
            return this.f10696a;
        }

        public o0 e() {
            return new o0(c());
        }

        @Override // androidx.camera.core.impl.l1.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public W.a c() {
            return new W.a(G0.b0(this.f10696a));
        }

        public d i(m1.b bVar) {
            b().x(l1.f14636F, bVar);
            return this;
        }

        public d j(A.B b10) {
            b().x(InterfaceC1455p0.f14674m, b10);
            return this;
        }

        public d k(int i10) {
            b().x(InterfaceC1457q0.f14678q, Integer.valueOf(i10));
            return this;
        }

        public d l(int i10) {
            b().x(l1.f14632B, Integer.valueOf(i10));
            return this;
        }

        public d m(Class cls) {
            b().x(H.m.f3079c, cls);
            if (b().f(H.m.f3078b, null) == null) {
                n(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public d n(String str) {
            b().x(H.m.f3078b, str);
            return this;
        }

        @Override // androidx.camera.core.impl.InterfaceC1457q0.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public d a(Size size) {
            throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }

        @Override // androidx.camera.core.impl.InterfaceC1457q0.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public d d(int i10) {
            b().x(InterfaceC1457q0.f14676o, Integer.valueOf(i10));
            return this;
        }

        d q(InterfaceC3735a interfaceC3735a) {
            b().x(W.a.f11159K, interfaceC3735a);
            return this;
        }

        public d r(boolean z10) {
            b().x(l1.f14638H, Integer.valueOf(z10 ? 2 : 1));
            return this;
        }

        private d(androidx.camera.core.impl.B0 b02) {
            this.f10696a = b02;
            if (!b02.b(W.a.f11158J)) {
                throw new IllegalArgumentException("VideoOutput is required");
            }
            Class cls = (Class) b02.f(H.m.f3079c, null);
            if (cls == null || cls.equals(o0.class)) {
                i(m1.b.VIDEO_CAPTURE);
                m(o0.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private static final z0 f10697a;

        /* renamed from: b, reason: collision with root package name */
        private static final W.a f10698b;

        /* renamed from: c, reason: collision with root package name */
        private static final InterfaceC3735a f10699c;

        /* renamed from: d, reason: collision with root package name */
        static final Range f10700d;

        /* renamed from: e, reason: collision with root package name */
        static final A.B f10701e;

        static {
            z0 z0Var = new z0() { // from class: V.q0
                @Override // V.z0
                public final void a(I0 i02) {
                    i02.G();
                }
            };
            f10697a = z0Var;
            InterfaceC3735a interfaceC3735a = c0.t0.f19273d;
            f10699c = interfaceC3735a;
            f10700d = new Range(30, 30);
            A.B b10 = A.B.f7d;
            f10701e = b10;
            f10698b = new d(z0Var).l(5).q(interfaceC3735a).j(b10).c();
        }

        public W.a a() {
            return f10698b;
        }
    }

    static class f implements E0.a {

        /* renamed from: a, reason: collision with root package name */
        private androidx.camera.core.impl.D f10702a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f10703b = false;

        f(androidx.camera.core.impl.D d10) {
            this.f10702a = d10;
        }

        private void d(boolean z10) {
            if (this.f10703b == z10) {
                return;
            }
            this.f10703b = z10;
            androidx.camera.core.impl.D d10 = this.f10702a;
            if (d10 == null) {
                AbstractC0700h0.a("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
            } else if (z10) {
                d10.o();
            } else {
                d10.b();
            }
        }

        public void b() {
            y0.f.j(E.q.c(), "SourceStreamRequirementObserver can be closed from main thread only");
            AbstractC0700h0.a("VideoCapture", "SourceStreamRequirementObserver#close: mIsSourceStreamRequired = " + this.f10703b);
            if (this.f10702a == null) {
                AbstractC0700h0.a("VideoCapture", "SourceStreamRequirementObserver#close: Already closed!");
            } else {
                d(false);
                this.f10702a = null;
            }
        }

        @Override // androidx.camera.core.impl.E0.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            y0.f.j(E.q.c(), "SourceStreamRequirementObserver can be updated from main thread only");
            d(Boolean.TRUE.equals(bool));
        }

        @Override // androidx.camera.core.impl.E0.a
        public void onError(Throwable th) {
            AbstractC0700h0.m("VideoCapture", "SourceStreamRequirementObserver#onError", th);
        }
    }

    o0(W.a aVar) {
        super(aVar);
        this.f10678r = AbstractC1237a0.f10593a;
        this.f10679s = new V0.b();
        this.f10680t = null;
        this.f10682v = z0.a.INACTIVE;
        this.f10686z = false;
        this.f10675C = new a();
    }

    private static c0.r0 A0(InterfaceC3735a interfaceC3735a, X.g gVar, A.B b10, r rVar, Size size, Range range) {
        c0.r0 T02;
        int b11;
        if (b10.e()) {
            return T0(interfaceC3735a, gVar, rVar, size, b10, range);
        }
        c0.r0 r0Var = null;
        int i10 = Integer.MIN_VALUE;
        for (InterfaceC1441i0.c cVar : gVar.d()) {
            if (AbstractC2971b.f(cVar, b10) && (T02 = T0(interfaceC3735a, gVar, rVar, size, new A.B(AbstractC2971b.h(cVar.g()), AbstractC2971b.g(cVar.b())), range)) != null && (b11 = L.d.b(((Integer) T02.h().getUpper()).intValue(), ((Integer) T02.j().getUpper()).intValue())) > i10) {
                r0Var = T02;
                i10 = b11;
            }
        }
        return r0Var;
    }

    private int B0(androidx.camera.core.impl.H h10) {
        boolean C10 = C(h10);
        int r10 = r(h10, C10);
        if (!X0()) {
            return r10;
        }
        I0.h b10 = this.f10678r.b();
        Objects.requireNonNull(b10);
        int b11 = b10.b();
        if (C10 != b10.f()) {
            b11 = -b11;
        }
        return E.r.v(r10 - b11);
    }

    private r D0() {
        return (r) y0(E0().d(), null);
    }

    private InterfaceC1239b0 F0(InterfaceC0713p interfaceC0713p) {
        return E0().b(interfaceC0713p);
    }

    private boolean G0(androidx.camera.core.impl.H h10, W.a aVar, Rect rect, Size size) {
        l();
        return Z0(h10, aVar) || a1(h10) || Y0(rect, size) || b1(h10) || X0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int I0(Rect rect, Size size, Size size2) {
        return (Math.abs(size.getWidth() - rect.width()) + Math.abs(size.getHeight() - rect.height())) - (Math.abs(size2.getWidth() - rect.width()) + Math.abs(size2.getHeight() - rect.height()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0(AbstractC1429c0 abstractC1429c0) {
        if (abstractC1429c0 == this.f10676p) {
            v0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0(V0 v02, V0.g gVar) {
        Q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void N0(AtomicBoolean atomicBoolean, V0.b bVar, AbstractC1450n abstractC1450n) {
        y0.f.j(E.q.c(), "Surface update cancellation should only occur on main thread.");
        atomicBoolean.set(true);
        bVar.s(abstractC1450n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object O0(final V0.b bVar, c.a aVar) {
        bVar.n("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(aVar.hashCode()));
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final b bVar2 = new b(atomicBoolean, aVar, bVar);
        aVar.a(new Runnable() { // from class: V.k0
            @Override // java.lang.Runnable
            public final void run() {
                o0.N0(atomicBoolean, bVar, bVar2);
            }
        }, F.c.b());
        bVar.j(bVar2);
        return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(aVar.hashCode()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public void K0(M.L l10, androidx.camera.core.impl.H h10, W.a aVar, e1 e1Var) {
        if (h10 == g()) {
            this.f10681u = l10.k(h10);
            aVar.a0().e(this.f10681u, e1Var);
            U0();
        }
    }

    private static Range R0(Z0 z02) {
        Range c10 = z02.c();
        return Objects.equals(c10, Z0.f14526a) ? e.f10700d : c10;
    }

    private static e1 S0(androidx.camera.core.impl.H h10, M.U u10) {
        return (u10 == null && h10.o()) ? e1.UPTIME : h10.q().j();
    }

    private static c0.r0 T0(InterfaceC3735a interfaceC3735a, X.g gVar, r rVar, Size size, A.B b10, Range range) {
        c0.r0 r0Var = (c0.r0) interfaceC3735a.apply(b0.k.c(b0.k.d(rVar, b10, gVar), e1.UPTIME, rVar.d(), size, b10, range));
        if (r0Var != null) {
            return e0.e.l(r0Var, gVar != null ? new Size(gVar.k().k(), gVar.k().h()) : null);
        }
        AbstractC0700h0.l("VideoCapture", "Can't find videoEncoderInfo");
        return null;
    }

    private void U0() {
        androidx.camera.core.impl.H g10 = g();
        M.L l10 = this.f10677q;
        if (g10 == null || l10 == null) {
            return;
        }
        int B02 = B0(g10);
        this.f10685y = B02;
        l10.D(B02, d());
    }

    private void W0(final V0.b bVar, boolean z10) {
        h8.d dVar = this.f10680t;
        if (dVar != null && dVar.cancel(false)) {
            AbstractC0700h0.a("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        h8.d a10 = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: V.f0
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object O02;
                O02 = o0.this.O0(bVar, aVar);
                return O02;
            }
        });
        this.f10680t = a10;
        G.n.j(a10, new c(a10, z10), F.c.e());
    }

    private boolean X0() {
        return this.f10678r.b() != null;
    }

    private static boolean Y0(Rect rect, Size size) {
        return (size.getWidth() == rect.width() && size.getHeight() == rect.height()) ? false : true;
    }

    private static boolean Z0(androidx.camera.core.impl.H h10, W.a aVar) {
        return h10.o() && aVar.b0();
    }

    private static boolean a1(androidx.camera.core.impl.H h10) {
        return h10.o() && (SurfaceProcessingQuirk.b(androidx.camera.video.internal.compat.quirk.a.c()) || SurfaceProcessingQuirk.b(h10.q().p()));
    }

    private boolean b1(androidx.camera.core.impl.H h10) {
        return h10.o() && C(h10);
    }

    private void d1(androidx.camera.core.impl.G g10, l1.a aVar) {
        r D02 = D0();
        y0.f.b(D02 != null, "Unable to update target resolution by null MediaSpec.");
        A.B C02 = C0();
        InterfaceC1239b0 F02 = F0(g10);
        List b10 = F02.b(C02);
        if (b10.isEmpty()) {
            AbstractC0700h0.l("VideoCapture", "Can't find any supported quality on the device.");
            return;
        }
        B0 d10 = D02.d();
        C1261y e10 = d10.e();
        List f10 = e10.f(b10);
        AbstractC0700h0.a("VideoCapture", "Found selectedQualities " + f10 + " by " + e10);
        if (f10.isEmpty()) {
            throw new IllegalArgumentException("Unable to find supported quality by QualitySelector");
        }
        int b11 = d10.b();
        Map h10 = C1261y.h(F02, C02);
        C1260x c1260x = new C1260x(g10.q(m()), h10);
        ArrayList arrayList = new ArrayList();
        Iterator it = f10.iterator();
        while (it.hasNext()) {
            arrayList.addAll(c1260x.g((AbstractC1258v) it.next(), b11));
        }
        List z02 = z0((W.a) aVar.c(), D02, C02, F02, arrayList, h10);
        AbstractC0700h0.a("VideoCapture", "Set custom ordered resolutions = " + z02);
        aVar.b().x(InterfaceC1457q0.f14684w, z02);
    }

    private static void l0(Set set, int i10, int i11, Size size, c0.r0 r0Var) {
        if (i10 > size.getWidth() || i11 > size.getHeight()) {
            return;
        }
        try {
            set.add(new Size(i10, ((Integer) r0Var.f(i10).clamp(Integer.valueOf(i11))).intValue()));
        } catch (IllegalArgumentException e10) {
            AbstractC0700h0.m("VideoCapture", "No supportedHeights for width: " + i10, e10);
        }
        try {
            set.add(new Size(((Integer) r0Var.e(i11).clamp(Integer.valueOf(i10))).intValue(), i11));
        } catch (IllegalArgumentException e11) {
            AbstractC0700h0.m("VideoCapture", "No supportedWidths for height: " + i11, e11);
        }
    }

    private static Rect m0(Rect rect, int i10, boolean z10, c0.r0 r0Var) {
        SizeCannotEncodeVideoQuirk sizeCannotEncodeVideoQuirk = (SizeCannotEncodeVideoQuirk) androidx.camera.video.internal.compat.quirk.a.b(SizeCannotEncodeVideoQuirk.class);
        if (sizeCannotEncodeVideoQuirk == null) {
            return rect;
        }
        if (!z10) {
            i10 = 0;
        }
        return sizeCannotEncodeVideoQuirk.f(rect, i10, r0Var);
    }

    private static Rect n0(final Rect rect, Size size, c0.r0 r0Var) {
        AbstractC0700h0.a("VideoCapture", String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", E.r.n(rect), Integer.valueOf(r0Var.b()), Integer.valueOf(r0Var.g()), r0Var.h(), r0Var.j()));
        if ((!r0Var.h().contains((Range) Integer.valueOf(rect.width())) || !r0Var.j().contains((Range) Integer.valueOf(rect.height()))) && r0Var.d() && r0Var.j().contains((Range) Integer.valueOf(rect.width())) && r0Var.h().contains((Range) Integer.valueOf(rect.height()))) {
            r0Var = new c0.m0(r0Var);
        }
        int b10 = r0Var.b();
        int g10 = r0Var.g();
        Range h10 = r0Var.h();
        Range j10 = r0Var.j();
        int r02 = r0(rect.width(), b10, h10);
        int s02 = s0(rect.width(), b10, h10);
        int r03 = r0(rect.height(), g10, j10);
        int s03 = s0(rect.height(), g10, j10);
        HashSet hashSet = new HashSet();
        l0(hashSet, r02, r03, size, r0Var);
        l0(hashSet, r02, s03, size, r0Var);
        l0(hashSet, s02, r03, size, r0Var);
        l0(hashSet, s02, s03, size, r0Var);
        if (hashSet.isEmpty()) {
            AbstractC0700h0.l("VideoCapture", "Can't find valid cropped size");
            return rect;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        AbstractC0700h0.a("VideoCapture", "candidatesList = " + arrayList);
        Collections.sort(arrayList, new Comparator() { // from class: V.l0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int I02;
                I02 = o0.I0(rect, (Size) obj, (Size) obj2);
                return I02;
            }
        });
        AbstractC0700h0.a("VideoCapture", "sorted candidatesList = " + arrayList);
        Size size2 = (Size) arrayList.get(0);
        int width = size2.getWidth();
        int height = size2.getHeight();
        if (width == rect.width() && height == rect.height()) {
            AbstractC0700h0.a("VideoCapture", "No need to adjust cropRect because crop size is valid.");
            return rect;
        }
        y0.f.i(width % 2 == 0 && height % 2 == 0 && width <= size.getWidth() && height <= size.getHeight());
        Rect rect2 = new Rect(rect);
        if (width != rect.width()) {
            int max = Math.max(0, rect.centerX() - (width / 2));
            rect2.left = max;
            int i10 = max + width;
            rect2.right = i10;
            if (i10 > size.getWidth()) {
                int width2 = size.getWidth();
                rect2.right = width2;
                rect2.left = width2 - width;
            }
        }
        if (height != rect.height()) {
            int max2 = Math.max(0, rect.centerY() - (height / 2));
            rect2.top = max2;
            int i11 = max2 + height;
            rect2.bottom = i11;
            if (i11 > size.getHeight()) {
                int height2 = size.getHeight();
                rect2.bottom = height2;
                rect2.top = height2 - height;
            }
        }
        AbstractC0700h0.a("VideoCapture", String.format("Adjust cropRect from %s to %s", E.r.n(rect), E.r.n(rect2)));
        return rect2;
    }

    private Rect o0(Rect rect, int i10) {
        return X0() ? E.r.q(E.r.f(((I0.h) y0.f.g(this.f10678r.b())).a(), i10)) : rect;
    }

    private Size p0(Size size, Rect rect, Rect rect2) {
        if (!X0() || rect2.equals(rect)) {
            return size;
        }
        float height = rect2.height() / rect.height();
        return new Size((int) Math.ceil(size.getWidth() * height), (int) Math.ceil(size.getHeight() * height));
    }

    private static int q0(boolean z10, int i10, int i11, Range range) {
        int i12 = i10 % i11;
        if (i12 != 0) {
            i10 = z10 ? i10 - i12 : i10 + (i11 - i12);
        }
        return ((Integer) range.clamp(Integer.valueOf(i10))).intValue();
    }

    private static int r0(int i10, int i11, Range range) {
        return q0(true, i10, i11, range);
    }

    private static int s0(int i10, int i11, Range range) {
        return q0(false, i10, i11, range);
    }

    private Rect u0(Size size, c0.r0 r0Var) {
        Rect A10 = A() != null ? A() : new Rect(0, 0, size.getWidth(), size.getHeight());
        return (r0Var == null || r0Var.a(A10.width(), A10.height())) ? A10 : n0(A10, size, r0Var);
    }

    private void v0() {
        E.q.a();
        V0.c cVar = this.f10674B;
        if (cVar != null) {
            cVar.b();
            this.f10674B = null;
        }
        AbstractC1429c0 abstractC1429c0 = this.f10676p;
        if (abstractC1429c0 != null) {
            abstractC1429c0.d();
            this.f10676p = null;
        }
        M.U u10 = this.f10683w;
        if (u10 != null) {
            u10.i();
            this.f10683w = null;
        }
        M.L l10 = this.f10677q;
        if (l10 != null) {
            l10.i();
            this.f10677q = null;
        }
        this.f10684x = null;
        this.f10681u = null;
        this.f10678r = AbstractC1237a0.f10593a;
        this.f10685y = 0;
        this.f10686z = false;
    }

    private M.U w0(androidx.camera.core.impl.H h10, W.a aVar, Rect rect, Size size, A.B b10) {
        if (!G0(h10, aVar, rect, size)) {
            return null;
        }
        AbstractC0700h0.a("VideoCapture", "Surface processing is enabled.");
        androidx.camera.core.impl.H g10 = g();
        Objects.requireNonNull(g10);
        l();
        return new M.U(g10, C0972t.a.a(b10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V0.b x0(final W.a aVar, Z0 z02) {
        E.q.a();
        final androidx.camera.core.impl.H h10 = (androidx.camera.core.impl.H) y0.f.g(g());
        Size e10 = z02.e();
        Runnable runnable = new Runnable() { // from class: V.g0
            @Override // java.lang.Runnable
            public final void run() {
                o0.this.G();
            }
        };
        Range R02 = R0(z02);
        r D02 = D0();
        Objects.requireNonNull(D02);
        InterfaceC1239b0 F02 = F0(h10.c());
        A.B b10 = z02.b();
        c0.r0 T02 = T0(aVar.Z(), F02.d(e10, b10), D02, e10, b10, R02);
        this.f10685y = B0(h10);
        Rect u02 = u0(e10, T02);
        Rect o02 = o0(u02, this.f10685y);
        this.f10684x = o02;
        Size p02 = p0(e10, u02, o02);
        if (X0()) {
            this.f10686z = true;
        }
        Rect rect = this.f10684x;
        Rect m02 = m0(rect, this.f10685y, G0(h10, aVar, rect, e10), T02);
        this.f10684x = m02;
        M.U w02 = w0(h10, aVar, m02, e10, b10);
        this.f10683w = w02;
        final e1 S02 = S0(h10, w02);
        AbstractC0700h0.a("VideoCapture", "camera timebase = " + h10.q().j() + ", processing timebase = " + S02);
        Z0 a10 = z02.g().e(p02).c(R02).a();
        y0.f.i(this.f10677q == null);
        M.L l10 = new M.L(2, 34, a10, v(), h10.o(), this.f10684x, this.f10685y, d(), b1(h10));
        this.f10677q = l10;
        l10.e(runnable);
        if (this.f10683w != null) {
            O.f j10 = O.f.j(this.f10677q);
            final M.L l11 = (M.L) this.f10683w.m(U.b.c(this.f10677q, Collections.singletonList(j10))).get(j10);
            Objects.requireNonNull(l11);
            l11.e(new Runnable() { // from class: V.h0
                @Override // java.lang.Runnable
                public final void run() {
                    o0.this.K0(l11, h10, aVar, S02);
                }
            });
            this.f10681u = l11.k(h10);
            final AbstractC1429c0 o10 = this.f10677q.o();
            this.f10676p = o10;
            o10.k().e(new Runnable() { // from class: V.i0
                @Override // java.lang.Runnable
                public final void run() {
                    o0.this.L0(o10);
                }
            }, F.c.e());
        } else {
            I0 k10 = this.f10677q.k(h10);
            this.f10681u = k10;
            this.f10676p = k10.m();
        }
        aVar.a0().e(this.f10681u, S02);
        U0();
        this.f10676p.s(MediaCodec.class);
        V0.b q10 = V0.b.q(aVar, z02.e());
        q10.u(z02.c());
        q10.A(aVar.G());
        V0.c cVar = this.f10674B;
        if (cVar != null) {
            cVar.b();
        }
        V0.c cVar2 = new V0.c(new V0.d() { // from class: V.j0
            @Override // androidx.camera.core.impl.V0.d
            public final void a(V0 v02, V0.g gVar) {
                o0.this.M0(v02, gVar);
            }
        });
        this.f10674B = cVar2;
        q10.t(cVar2);
        if (z02.d() != null) {
            q10.g(z02.d());
        }
        return q10;
    }

    private static Object y0(E0 e02, Object obj) {
        h8.d c10 = e02.c();
        if (!c10.isDone()) {
            return obj;
        }
        try {
            return c10.get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static List z0(W.a aVar, r rVar, A.B b10, InterfaceC1239b0 interfaceC1239b0, List list, Map map) {
        X.g d10;
        if (list.isEmpty()) {
            return list;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (!map.containsValue(size) && (d10 = interfaceC1239b0.d(size, b10)) != null) {
                InterfaceC3735a Z10 = aVar.Z();
                Range I10 = aVar.I(e.f10700d);
                Objects.requireNonNull(I10);
                c0.r0 A02 = A0(Z10, d10, b10, rVar, size, I10);
                if (A02 != null && !A02.a(size.getWidth(), size.getHeight())) {
                    it.remove();
                }
            }
        }
        return list;
    }

    public A.B C0() {
        return j().t() ? j().k() : e.f10701e;
    }

    public z0 E0() {
        return ((W.a) j()).a0();
    }

    boolean H0(int i10, int i11) {
        Set set = AbstractC1237a0.f10594b;
        return (set.contains(Integer.valueOf(i10)) || set.contains(Integer.valueOf(i11)) || i10 == i11) ? false : true;
    }

    @Override // A.J0
    protected l1 L(androidx.camera.core.impl.G g10, l1.a aVar) {
        d1(g10, aVar);
        return aVar.c();
    }

    @Override // A.J0
    public void M() {
        List a10;
        super.M();
        AbstractC0700h0.a("VideoCapture", "VideoCapture#onStateAttached: cameraID = " + i());
        if (e() == null || this.f10681u != null) {
            return;
        }
        Z0 z02 = (Z0) y0.f.g(e());
        this.f10678r = (AbstractC1237a0) y0(E0().f(), AbstractC1237a0.f10593a);
        V0.b x02 = x0((W.a) j(), z02);
        this.f10679s = x02;
        t0(x02, this.f10678r, z02);
        a10 = A.H.a(new Object[]{this.f10679s.o()});
        X(a10);
        E();
        E0().f().e(F.c.e(), this.f10675C);
        f fVar = this.f10673A;
        if (fVar != null) {
            fVar.b();
        }
        this.f10673A = new f(h());
        E0().g().e(F.c.e(), this.f10673A);
        V0(z0.a.ACTIVE_NON_STREAMING);
    }

    @Override // A.J0
    public void N() {
        AbstractC0700h0.a("VideoCapture", "VideoCapture#onStateDetached");
        y0.f.j(E.q.c(), "VideoCapture can only be detached on the main thread.");
        if (this.f10673A != null) {
            E0().g().a(this.f10673A);
            this.f10673A.b();
            this.f10673A = null;
        }
        V0(z0.a.INACTIVE);
        E0().f().a(this.f10675C);
        h8.d dVar = this.f10680t;
        if (dVar != null && dVar.cancel(false)) {
            AbstractC0700h0.a("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        v0();
    }

    @Override // A.J0
    protected Z0 O(androidx.camera.core.impl.V v10) {
        List a10;
        this.f10679s.g(v10);
        a10 = A.H.a(new Object[]{this.f10679s.o()});
        X(a10);
        Z0 e10 = e();
        Objects.requireNonNull(e10);
        return e10.g().d(v10).a();
    }

    @Override // A.J0
    protected Z0 P(Z0 z02, Z0 z03) {
        AbstractC0700h0.a("VideoCapture", "onSuggestedStreamSpecUpdated: " + z02);
        List o10 = ((W.a) j()).o(null);
        if (o10 != null && !o10.contains(z02.e())) {
            AbstractC0700h0.l("VideoCapture", "suggested resolution " + z02.e() + " is not in custom ordered resolutions " + o10);
        }
        return z02;
    }

    void Q0() {
        List a10;
        if (g() == null) {
            return;
        }
        v0();
        V0.b x02 = x0((W.a) j(), (Z0) y0.f.g(e()));
        this.f10679s = x02;
        t0(x02, this.f10678r, e());
        a10 = A.H.a(new Object[]{this.f10679s.o()});
        X(a10);
        G();
    }

    @Override // A.J0
    public void V(Rect rect) {
        super.V(rect);
        U0();
    }

    void V0(z0.a aVar) {
        if (aVar != this.f10682v) {
            this.f10682v = aVar;
            E0().c(aVar);
        }
    }

    boolean c1(AbstractC1237a0 abstractC1237a0, AbstractC1237a0 abstractC1237a02) {
        return this.f10686z && abstractC1237a0.b() != null && abstractC1237a02.b() == null;
    }

    @Override // A.J0
    public l1 k(boolean z10, m1 m1Var) {
        e eVar = f10672D;
        androidx.camera.core.impl.V a10 = m1Var.a(eVar.a().F(), 1);
        if (z10) {
            a10 = androidx.camera.core.impl.V.H(a10, eVar.a());
        }
        if (a10 == null) {
            return null;
        }
        return z(a10).c();
    }

    void t0(V0.b bVar, AbstractC1237a0 abstractC1237a0, Z0 z02) {
        AbstractC1429c0 abstractC1429c0;
        boolean z10 = abstractC1237a0.a() == -1;
        boolean z11 = abstractC1237a0.c() == AbstractC1237a0.a.ACTIVE;
        if (z10 && z11) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        bVar.p();
        A.B b10 = z02.b();
        if (!z10 && (abstractC1429c0 = this.f10676p) != null) {
            if (z11) {
                bVar.m(abstractC1429c0, b10, null, -1);
            } else {
                bVar.i(abstractC1429c0, b10);
            }
        }
        W0(bVar, z11);
    }

    public String toString() {
        return "VideoCapture:" + o();
    }

    @Override // A.J0
    public Set x() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    @Override // A.J0
    public l1.a z(androidx.camera.core.impl.V v10) {
        return d.g(v10);
    }
}
