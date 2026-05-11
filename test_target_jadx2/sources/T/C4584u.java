package t;

import A.AbstractC0700h0;
import A.InterfaceC0705k;
import A.W;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.camera.core.impl.AbstractC1450n;
import androidx.camera.core.impl.C1454p;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.InterfaceC1469x;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.V0;
import androidx.concurrent.futures.c;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import s.C4301a;
import t.C4584u;
import u.C4832C;
import x.C5086a;
import x.C5087b;
import z.j;

/* renamed from: t.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4584u implements androidx.camera.core.impl.D {

    /* renamed from: b, reason: collision with root package name */
    final b f42188b;

    /* renamed from: c, reason: collision with root package name */
    final Executor f42189c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f42190d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final C4832C f42191e;

    /* renamed from: f, reason: collision with root package name */
    private final D.d f42192f;

    /* renamed from: g, reason: collision with root package name */
    private final V0.b f42193g;

    /* renamed from: h, reason: collision with root package name */
    private final C4601z1 f42194h;

    /* renamed from: i, reason: collision with root package name */
    private final h2 f42195i;

    /* renamed from: j, reason: collision with root package name */
    private final a2 f42196j;

    /* renamed from: k, reason: collision with root package name */
    private final C4551i1 f42197k;

    /* renamed from: l, reason: collision with root package name */
    j2 f42198l;

    /* renamed from: m, reason: collision with root package name */
    private final z.g f42199m;

    /* renamed from: n, reason: collision with root package name */
    private final C4526a0 f42200n;

    /* renamed from: o, reason: collision with root package name */
    private final e2 f42201o;

    /* renamed from: p, reason: collision with root package name */
    private int f42202p;

    /* renamed from: q, reason: collision with root package name */
    private W.i f42203q;

    /* renamed from: r, reason: collision with root package name */
    private volatile boolean f42204r;

    /* renamed from: s, reason: collision with root package name */
    private volatile int f42205s;

    /* renamed from: t, reason: collision with root package name */
    private final C5086a f42206t;

    /* renamed from: u, reason: collision with root package name */
    private final C5087b f42207u;

    /* renamed from: v, reason: collision with root package name */
    private final AtomicLong f42208v;

    /* renamed from: w, reason: collision with root package name */
    private volatile h8.d f42209w;

    /* renamed from: x, reason: collision with root package name */
    private int f42210x;

    /* renamed from: y, reason: collision with root package name */
    private long f42211y;

    /* renamed from: z, reason: collision with root package name */
    private final a f42212z;

    /* renamed from: t.u$a */
    static final class a extends AbstractC1450n {

        /* renamed from: a, reason: collision with root package name */
        Set f42213a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        Map f42214b = new ArrayMap();

        a() {
        }

        @Override // androidx.camera.core.impl.AbstractC1450n
        public void a(final int i10) {
            for (final AbstractC1450n abstractC1450n : this.f42213a) {
                try {
                    ((Executor) this.f42214b.get(abstractC1450n)).execute(new Runnable() { // from class: t.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC1450n.this.a(i10);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    AbstractC0700h0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e10);
                }
            }
        }

        @Override // androidx.camera.core.impl.AbstractC1450n
        public void b(final int i10, final InterfaceC1469x interfaceC1469x) {
            for (final AbstractC1450n abstractC1450n : this.f42213a) {
                try {
                    ((Executor) this.f42214b.get(abstractC1450n)).execute(new Runnable() { // from class: t.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC1450n.this.b(i10, interfaceC1469x);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    AbstractC0700h0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e10);
                }
            }
        }

        @Override // androidx.camera.core.impl.AbstractC1450n
        public void c(final int i10, final C1454p c1454p) {
            for (final AbstractC1450n abstractC1450n : this.f42213a) {
                try {
                    ((Executor) this.f42214b.get(abstractC1450n)).execute(new Runnable() { // from class: t.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC1450n.this.c(i10, c1454p);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    AbstractC0700h0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e10);
                }
            }
        }

        void h(Executor executor, AbstractC1450n abstractC1450n) {
            this.f42213a.add(abstractC1450n);
            this.f42214b.put(abstractC1450n, executor);
        }

        void l(AbstractC1450n abstractC1450n) {
            this.f42213a.remove(abstractC1450n);
            this.f42214b.remove(abstractC1450n);
        }
    }

    /* renamed from: t.u$b */
    static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        final Set f42215a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        private final Executor f42216b;

        b(Executor executor) {
            this.f42216b = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (c cVar : this.f42215a) {
                if (cVar.a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            this.f42215a.removeAll(hashSet);
        }

        void b(c cVar) {
            this.f42215a.add(cVar);
        }

        void d(c cVar) {
            this.f42215a.remove(cVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f42216b.execute(new Runnable() { // from class: t.v
                @Override // java.lang.Runnable
                public final void run() {
                    C4584u.b.this.c(totalCaptureResult);
                }
            });
        }
    }

    /* renamed from: t.u$c */
    public interface c {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    C4584u(C4832C c4832c, ScheduledExecutorService scheduledExecutorService, Executor executor, D.d dVar, androidx.camera.core.impl.P0 p02) {
        V0.b bVar = new V0.b();
        this.f42193g = bVar;
        this.f42202p = 0;
        this.f42204r = false;
        this.f42205s = 2;
        this.f42208v = new AtomicLong(0L);
        this.f42209w = G.n.p(null);
        this.f42210x = 1;
        this.f42211y = 0L;
        a aVar = new a();
        this.f42212z = aVar;
        this.f42191e = c4832c;
        this.f42192f = dVar;
        this.f42189c = executor;
        this.f42201o = new e2(executor);
        b bVar2 = new b(executor);
        this.f42188b = bVar2;
        bVar.z(this.f42210x);
        bVar.j(R0.e(bVar2));
        bVar.j(aVar);
        this.f42197k = new C4551i1(this, c4832c, executor);
        this.f42194h = new C4601z1(this, scheduledExecutorService, executor, p02);
        this.f42195i = new h2(this, c4832c, executor);
        this.f42196j = new a2(this, c4832c, executor);
        this.f42198l = new n2(c4832c);
        this.f42206t = new C5086a(p02);
        this.f42207u = new C5087b(p02);
        this.f42199m = new z.g(this, executor);
        this.f42200n = new C4526a0(this, c4832c, p02, executor, scheduledExecutorService);
    }

    public static int N(C4832C c4832c, int i10) {
        int[] iArr = (int[]) c4832c.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return X(i10, iArr) ? i10 : X(1, iArr) ? 1 : 0;
    }

    private int P(int i10) {
        int[] iArr = (int[]) this.f42191e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return X(i10, iArr) ? i10 : X(1, iArr) ? 1 : 0;
    }

    private boolean V() {
        return R() > 0;
    }

    private static boolean X(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }

    static boolean Y(TotalCaptureResult totalCaptureResult, long j10) {
        Long l10;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof androidx.camera.core.impl.d1) && (l10 = (Long) ((androidx.camera.core.impl.d1) tag).d("CameraControlSessionUpdateId")) != null && l10.longValue() >= j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(Executor executor, AbstractC1450n abstractC1450n) {
        this.f42212z.h(executor, abstractC1450n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ h8.d d0(int i10, int i11, int i12, Void r42) {
        return G.n.p(this.f42200n.c(i10, i11, i12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e0(AbstractC1450n abstractC1450n) {
        this.f42212z.l(abstractC1450n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ h8.d f0(List list, int i10, int i11, int i12, Void r52) {
        return this.f42200n.i(list, i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0(c.a aVar) {
        G.n.C(u0(t0()), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object h0(final c.a aVar) {
        this.f42189c.execute(new Runnable() { // from class: t.p
            @Override // java.lang.Runnable
            public final void run() {
                C4584u.this.g0(aVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean i0(long j10, c.a aVar, TotalCaptureResult totalCaptureResult) {
        if (!Y(totalCaptureResult, j10)) {
            return false;
        }
        aVar.c(null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object j0(final long j10, final c.a aVar) {
        z(new c() { // from class: t.h
            @Override // t.C4584u.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                boolean i02;
                i02 = C4584u.i0(j10, aVar, totalCaptureResult);
                return i02;
            }
        });
        return "waitForSessionUpdateId:" + j10;
    }

    private h8.d u0(final long j10) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: t.q
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object j02;
                j02 = C4584u.this.j0(j10, aVar);
                return j02;
            }
        });
    }

    void A(final Executor executor, final AbstractC1450n abstractC1450n) {
        this.f42189c.execute(new Runnable() { // from class: t.j
            @Override // java.lang.Runnable
            public final void run() {
                C4584u.this.b0(executor, abstractC1450n);
            }
        });
    }

    void B() {
        synchronized (this.f42190d) {
            try {
                int i10 = this.f42202p;
                if (i10 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f42202p = i10 - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void C(boolean z10) {
        this.f42204r = z10;
        if (!z10) {
            T.a aVar = new T.a();
            aVar.v(this.f42210x);
            aVar.w(true);
            C4301a.C0609a c0609a = new C4301a.C0609a();
            c0609a.f(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(M(1)));
            c0609a.f(CaptureRequest.FLASH_MODE, 0);
            aVar.e(c0609a.a());
            r0(Collections.singletonList(aVar.h()));
        }
        t0();
    }

    Rect D() {
        return this.f42195i.e();
    }

    public int E() {
        return this.f42205s;
    }

    public C4601z1 F() {
        return this.f42194h;
    }

    int G() {
        Integer num = (Integer) this.f42191e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    int H() {
        Integer num = (Integer) this.f42191e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    int I() {
        Integer num = (Integer) this.f42191e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public W.i J() {
        return this.f42203q;
    }

    public androidx.camera.core.impl.V0 K() {
        this.f42193g.z(this.f42210x);
        this.f42193g.v(L());
        this.f42193g.n("CameraControlSessionUpdateId", Long.valueOf(this.f42211y));
        return this.f42193g.o();
    }

    androidx.camera.core.impl.V L() {
        C4301a.C0609a c0609a = new C4301a.C0609a();
        CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
        V.c cVar = V.c.REQUIRED;
        c0609a.g(key, 1, cVar);
        this.f42194h.p(c0609a);
        this.f42206t.a(c0609a);
        this.f42195i.c(c0609a);
        int i10 = this.f42194h.J() ? 5 : 1;
        if (this.f42204r) {
            c0609a.g(CaptureRequest.FLASH_MODE, 2, cVar);
        } else {
            int i11 = this.f42205s;
            if (i11 == 0) {
                i10 = this.f42207u.a(2);
            } else if (i11 == 1) {
                i10 = 3;
            } else if (i11 == 2) {
                i10 = 1;
            }
        }
        c0609a.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(M(i10)), cVar);
        c0609a.g(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(P(1)), cVar);
        this.f42197k.c(c0609a);
        this.f42199m.i(c0609a);
        return c0609a.a();
    }

    int M(int i10) {
        return N(this.f42191e, i10);
    }

    int O(int i10) {
        int[] iArr = (int[]) this.f42191e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (X(i10, iArr)) {
            return i10;
        }
        if (X(4, iArr)) {
            return 4;
        }
        return X(1, iArr) ? 1 : 0;
    }

    public a2 Q() {
        return this.f42196j;
    }

    int R() {
        int i10;
        synchronized (this.f42190d) {
            i10 = this.f42202p;
        }
        return i10;
    }

    public h2 S() {
        return this.f42195i;
    }

    public j2 T() {
        return this.f42198l;
    }

    void U() {
        synchronized (this.f42190d) {
            this.f42202p++;
        }
    }

    public boolean W() {
        int e10 = this.f42201o.e();
        AbstractC0700h0.a("Camera2CameraControlImp", "isInVideoUsage: mVideoUsageControl value = " + e10);
        return e10 > 0;
    }

    boolean Z() {
        return this.f42204r;
    }

    @Override // androidx.camera.core.impl.D
    public void a(V0.b bVar) {
        this.f42198l.a(bVar);
    }

    @Override // androidx.camera.core.impl.D
    public void b() {
        this.f42201o.c();
    }

    @Override // androidx.camera.core.impl.D
    public h8.d c(final List list, final int i10, final int i11) {
        if (V()) {
            final int E10 = E();
            return G.d.a(G.n.B(this.f42209w)).f(new G.a() { // from class: t.i
                @Override // G.a
                public final h8.d apply(Object obj) {
                    h8.d f02;
                    f02 = C4584u.this.f0(list, i10, E10, i11, (Void) obj);
                    return f02;
                }
            }, this.f42189c);
        }
        AbstractC0700h0.l("Camera2CameraControlImp", "Camera is not active.");
        return G.n.n(new InterfaceC0705k.a("Camera is not active."));
    }

    @Override // A.InterfaceC0705k
    public h8.d d() {
        return !V() ? G.n.n(new InterfaceC0705k.a("Camera is not active.")) : G.n.B(this.f42194h.r());
    }

    @Override // androidx.camera.core.impl.D
    public void e(androidx.camera.core.impl.V v10) {
        this.f42199m.g(j.a.e(v10).d()).e(new Runnable() { // from class: t.k
            @Override // java.lang.Runnable
            public final void run() {
                C4584u.a0();
            }
        }, F.c.b());
    }

    @Override // A.InterfaceC0705k
    public h8.d f(float f10) {
        return !V() ? G.n.n(new InterfaceC0705k.a("Camera is not active.")) : G.n.B(this.f42195i.m(f10));
    }

    @Override // androidx.camera.core.impl.D
    public Rect g() {
        Rect rect = (Rect) this.f42191e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return ("robolectric".equals(Build.FINGERPRINT) && rect == null) ? new Rect(0, 0, 4000, 3000) : (Rect) y0.f.g(rect);
    }

    @Override // androidx.camera.core.impl.D
    public void h(int i10) {
        if (!V()) {
            AbstractC0700h0.l("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f42205s = i10;
        AbstractC0700h0.a("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f42205s);
        j2 j2Var = this.f42198l;
        boolean z10 = true;
        if (this.f42205s != 1 && this.f42205s != 0) {
            z10 = false;
        }
        j2Var.d(z10);
        this.f42209w = s0();
    }

    @Override // A.InterfaceC0705k
    public h8.d i(boolean z10) {
        return !V() ? G.n.n(new InterfaceC0705k.a("Camera is not active.")) : G.n.B(this.f42196j.d(z10));
    }

    @Override // androidx.camera.core.impl.D
    public h8.d j(final int i10, final int i11) {
        if (V()) {
            final int E10 = E();
            return G.d.a(G.n.B(this.f42209w)).f(new G.a() { // from class: t.l
                @Override // G.a
                public final h8.d apply(Object obj) {
                    h8.d d02;
                    d02 = C4584u.this.d0(i10, E10, i11, (Void) obj);
                    return d02;
                }
            }, this.f42189c);
        }
        AbstractC0700h0.l("Camera2CameraControlImp", "Camera is not active.");
        return G.n.n(new InterfaceC0705k.a("Camera is not active."));
    }

    @Override // androidx.camera.core.impl.D
    public androidx.camera.core.impl.V k() {
        return this.f42199m.n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k0(c cVar) {
        this.f42188b.d(cVar);
    }

    @Override // A.InterfaceC0705k
    public h8.d l(A.D d10) {
        return !V() ? G.n.n(new InterfaceC0705k.a("Camera is not active.")) : G.n.B(this.f42194h.f0(d10));
    }

    void l0(final AbstractC1450n abstractC1450n) {
        this.f42189c.execute(new Runnable() { // from class: t.m
            @Override // java.lang.Runnable
            public final void run() {
                C4584u.this.e0(abstractC1450n);
            }
        });
    }

    @Override // androidx.camera.core.impl.D
    public void m(W.i iVar) {
        this.f42203q = iVar;
    }

    void m0() {
        p0(1);
    }

    @Override // androidx.camera.core.impl.D
    public void n() {
        this.f42199m.j().e(new Runnable() { // from class: t.o
            @Override // java.lang.Runnable
            public final void run() {
                C4584u.c0();
            }
        }, F.c.b());
    }

    void n0(boolean z10) {
        AbstractC0700h0.a("Camera2CameraControlImp", "setActive: isActive = " + z10);
        this.f42194h.b0(z10);
        this.f42195i.l(z10);
        this.f42196j.j(z10);
        this.f42197k.b(z10);
        this.f42199m.t(z10);
        if (z10) {
            return;
        }
        this.f42203q = null;
        this.f42201o.h();
    }

    @Override // androidx.camera.core.impl.D
    public void o() {
        this.f42201o.f();
    }

    public void o0(Rational rational) {
        this.f42194h.c0(rational);
    }

    void p0(int i10) {
        this.f42210x = i10;
        this.f42194h.d0(i10);
        this.f42200n.h(this.f42210x);
    }

    public void q0(boolean z10) {
        this.f42198l.e(z10);
    }

    void r0(List list) {
        this.f42192f.b(list);
    }

    public h8.d s0() {
        return G.n.B(androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: t.n
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object h02;
                h02 = C4584u.this.h0(aVar);
                return h02;
            }
        }));
    }

    long t0() {
        this.f42211y = this.f42208v.getAndIncrement();
        this.f42192f.a();
        return this.f42211y;
    }

    void z(c cVar) {
        this.f42188b.b(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c0() {
    }
}
