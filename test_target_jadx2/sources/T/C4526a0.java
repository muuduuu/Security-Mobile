package t;

import A.AbstractC0700h0;
import A.W;
import C.InterfaceC0733k;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import androidx.camera.core.impl.AbstractC1450n;
import androidx.camera.core.impl.AbstractC1471y;
import androidx.camera.core.impl.C1454p;
import androidx.camera.core.impl.InterfaceC1469x;
import androidx.camera.core.impl.T;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC3735a;
import s.C4301a;
import t.C4526a0;
import t.C4584u;
import u.C4832C;
import x.AbstractC5092g;
import x.C5084B;
import x.C5085C;

/* renamed from: t.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C4526a0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4584u f41952a;

    /* renamed from: b, reason: collision with root package name */
    private final C5085C f41953b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f41954c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.camera.core.impl.P0 f41955d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f41956e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f41957f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f41958g;

    /* renamed from: h, reason: collision with root package name */
    private int f41959h = 1;

    /* renamed from: t.a0$a */
    static class a implements e {

        /* renamed from: a, reason: collision with root package name */
        private final C4584u f41960a;

        /* renamed from: b, reason: collision with root package name */
        private final x.o f41961b;

        /* renamed from: c, reason: collision with root package name */
        private final int f41962c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f41963d = false;

        a(C4584u c4584u, int i10, x.o oVar) {
            this.f41960a = c4584u;
            this.f41962c = i10;
            this.f41961b = oVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object f(c.a aVar) {
            this.f41960a.F().Y(aVar);
            this.f41961b.b();
            return "AePreCapture";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Boolean g(Void r02) {
            return Boolean.TRUE;
        }

        @Override // t.C4526a0.e
        public h8.d a(TotalCaptureResult totalCaptureResult) {
            if (!C4526a0.e(this.f41962c, totalCaptureResult)) {
                return G.n.p(Boolean.FALSE);
            }
            AbstractC0700h0.a("Camera2CapturePipeline", "Trigger AE");
            this.f41963d = true;
            return G.d.a(androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: t.Y
                @Override // androidx.concurrent.futures.c.InterfaceC0253c
                public final Object a(c.a aVar) {
                    Object f10;
                    f10 = C4526a0.a.this.f(aVar);
                    return f10;
                }
            })).d(new InterfaceC3735a() { // from class: t.Z
                @Override // o.InterfaceC3735a
                public final Object apply(Object obj) {
                    Boolean g10;
                    g10 = C4526a0.a.g((Void) obj);
                    return g10;
                }
            }, F.c.b());
        }

        @Override // t.C4526a0.e
        public boolean b() {
            return this.f41962c == 0;
        }

        @Override // t.C4526a0.e
        public void c() {
            if (this.f41963d) {
                AbstractC0700h0.a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f41960a.F().q(false, true);
                this.f41961b.a();
            }
        }
    }

    /* renamed from: t.a0$b */
    static class b implements e {

        /* renamed from: a, reason: collision with root package name */
        private final C4584u f41964a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f41965b = false;

        b(C4584u c4584u) {
            this.f41964a = c4584u;
        }

        @Override // t.C4526a0.e
        public h8.d a(TotalCaptureResult totalCaptureResult) {
            h8.d p10 = G.n.p(Boolean.TRUE);
            if (totalCaptureResult == null) {
                return p10;
            }
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE);
            if (num == null) {
                return p10;
            }
            int intValue = num.intValue();
            if (intValue == 1 || intValue == 2) {
                AbstractC0700h0.a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    AbstractC0700h0.a("Camera2CapturePipeline", "Trigger AF");
                    this.f41965b = true;
                    this.f41964a.F().k0(null, false);
                }
            }
            return p10;
        }

        @Override // t.C4526a0.e
        public boolean b() {
            return true;
        }

        @Override // t.C4526a0.e
        public void c() {
            if (this.f41965b) {
                AbstractC0700h0.a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f41964a.F().q(true, false);
            }
        }
    }

    /* renamed from: t.a0$c */
    static class c implements InterfaceC0733k {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f41966a;

        /* renamed from: b, reason: collision with root package name */
        private final d f41967b;

        /* renamed from: c, reason: collision with root package name */
        private int f41968c;

        c(d dVar, Executor executor, int i10) {
            this.f41967b = dVar;
            this.f41966a = executor;
            this.f41968c = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object e(c.a aVar) {
            this.f41967b.j();
            aVar.c(null);
            return "invokePostCaptureFuture";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Void f(TotalCaptureResult totalCaptureResult) {
            return null;
        }

        @Override // C.InterfaceC0733k
        public h8.d a() {
            AbstractC0700h0.a("Camera2CapturePipeline", "invokePreCapture");
            return G.d.a(this.f41967b.k(this.f41968c)).d(new InterfaceC3735a() { // from class: t.c0
                @Override // o.InterfaceC3735a
                public final Object apply(Object obj) {
                    Void f10;
                    f10 = C4526a0.c.f((TotalCaptureResult) obj);
                    return f10;
                }
            }, this.f41966a);
        }

        @Override // C.InterfaceC0733k
        public h8.d b() {
            return androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: t.b0
                @Override // androidx.concurrent.futures.c.InterfaceC0253c
                public final Object a(c.a aVar) {
                    Object e10;
                    e10 = C4526a0.c.this.e(aVar);
                    return e10;
                }
            });
        }
    }

    /* renamed from: t.a0$d */
    static class d {

        /* renamed from: j, reason: collision with root package name */
        private static final long f41969j;

        /* renamed from: k, reason: collision with root package name */
        private static final long f41970k;

        /* renamed from: a, reason: collision with root package name */
        private final int f41971a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f41972b;

        /* renamed from: c, reason: collision with root package name */
        private final ScheduledExecutorService f41973c;

        /* renamed from: d, reason: collision with root package name */
        private final C4584u f41974d;

        /* renamed from: e, reason: collision with root package name */
        private final x.o f41975e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f41976f;

        /* renamed from: g, reason: collision with root package name */
        private long f41977g = f41969j;

        /* renamed from: h, reason: collision with root package name */
        final List f41978h = new ArrayList();

        /* renamed from: i, reason: collision with root package name */
        private final e f41979i = new a();

        /* renamed from: t.a0$d$a */
        class a implements e {
            a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ Boolean e(List list) {
                return Boolean.valueOf(list.contains(Boolean.TRUE));
            }

            @Override // t.C4526a0.e
            public h8.d a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator it = d.this.f41978h.iterator();
                while (it.hasNext()) {
                    arrayList.add(((e) it.next()).a(totalCaptureResult));
                }
                return G.n.G(G.n.k(arrayList), new InterfaceC3735a() { // from class: t.j0
                    @Override // o.InterfaceC3735a
                    public final Object apply(Object obj) {
                        Boolean e10;
                        e10 = C4526a0.d.a.e((List) obj);
                        return e10;
                    }
                }, F.c.b());
            }

            @Override // t.C4526a0.e
            public boolean b() {
                Iterator it = d.this.f41978h.iterator();
                while (it.hasNext()) {
                    if (((e) it.next()).b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // t.C4526a0.e
            public void c() {
                Iterator it = d.this.f41978h.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).c();
                }
            }
        }

        /* renamed from: t.a0$d$b */
        class b extends AbstractC1450n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c.a f41981a;

            b(c.a aVar) {
                this.f41981a = aVar;
            }

            @Override // androidx.camera.core.impl.AbstractC1450n
            public void a(int i10) {
                this.f41981a.f(new A.X(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override // androidx.camera.core.impl.AbstractC1450n
            public void b(int i10, InterfaceC1469x interfaceC1469x) {
                this.f41981a.c(null);
            }

            @Override // androidx.camera.core.impl.AbstractC1450n
            public void c(int i10, C1454p c1454p) {
                this.f41981a.f(new A.X(2, "Capture request failed with reason " + c1454p.b(), null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f41969j = timeUnit.toNanos(1L);
            f41970k = timeUnit.toNanos(5L);
        }

        d(int i10, Executor executor, ScheduledExecutorService scheduledExecutorService, C4584u c4584u, boolean z10, x.o oVar) {
            this.f41971a = i10;
            this.f41972b = executor;
            this.f41973c = scheduledExecutorService;
            this.f41974d = c4584u;
            this.f41976f = z10;
            this.f41975e = oVar;
        }

        private void g(T.a aVar) {
            C4301a.C0609a c0609a = new C4301a.C0609a();
            c0609a.f(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.e(c0609a.a());
        }

        private void h(T.a aVar, androidx.camera.core.impl.T t10) {
            int i10 = (this.f41971a != 3 || this.f41976f) ? (t10.k() == -1 || t10.k() == 5) ? 2 : -1 : 4;
            if (i10 != -1) {
                aVar.v(i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ h8.d l(List list, int i10, TotalCaptureResult totalCaptureResult) {
            return r(list, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ h8.d m(int i10, TotalCaptureResult totalCaptureResult) {
            if (C4526a0.e(i10, totalCaptureResult)) {
                q(f41970k);
            }
            return this.f41979i.a(totalCaptureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean n(TotalCaptureResult totalCaptureResult) {
            return C4526a0.d(totalCaptureResult, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ h8.d o(Boolean bool) {
            return Boolean.TRUE.equals(bool) ? C4526a0.j(this.f41977g, this.f41973c, this.f41974d, new f.a() { // from class: t.d0
                @Override // t.C4526a0.f.a
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    boolean n10;
                    n10 = C4526a0.d.n(totalCaptureResult);
                    return n10;
                }
            }) : G.n.p(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object p(T.a aVar, c.a aVar2) {
            aVar.c(new b(aVar2));
            return "submitStillCapture";
        }

        private void q(long j10) {
            this.f41977g = j10;
        }

        void f(e eVar) {
            this.f41978h.add(eVar);
        }

        h8.d i(final List list, final int i10) {
            G.d f10 = G.d.a(k(i10)).f(new G.a() { // from class: t.e0
                @Override // G.a
                public final h8.d apply(Object obj) {
                    h8.d l10;
                    l10 = C4526a0.d.this.l(list, i10, (TotalCaptureResult) obj);
                    return l10;
                }
            }, this.f41972b);
            f10.e(new Runnable() { // from class: t.f0
                @Override // java.lang.Runnable
                public final void run() {
                    C4526a0.d.this.j();
                }
            }, this.f41972b);
            return f10;
        }

        public void j() {
            this.f41979i.c();
        }

        public h8.d k(final int i10) {
            h8.d p10 = G.n.p(null);
            if (this.f41978h.isEmpty()) {
                return p10;
            }
            return G.d.a(this.f41979i.b() ? C4526a0.k(this.f41974d, null) : G.n.p(null)).f(new G.a() { // from class: t.h0
                @Override // G.a
                public final h8.d apply(Object obj) {
                    h8.d m10;
                    m10 = C4526a0.d.this.m(i10, (TotalCaptureResult) obj);
                    return m10;
                }
            }, this.f41972b).f(new G.a() { // from class: t.i0
                @Override // G.a
                public final h8.d apply(Object obj) {
                    h8.d o10;
                    o10 = C4526a0.d.this.o((Boolean) obj);
                    return o10;
                }
            }, this.f41972b);
        }

        h8.d r(List list, int i10) {
            androidx.camera.core.n f10;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                androidx.camera.core.impl.T t10 = (androidx.camera.core.impl.T) it.next();
                final T.a k10 = T.a.k(t10);
                InterfaceC1469x a10 = (t10.k() != 5 || this.f41974d.T().c() || this.f41974d.T().b() || (f10 = this.f41974d.T().f()) == null || !this.f41974d.T().g(f10)) ? null : AbstractC1471y.a(f10.G());
                if (a10 != null) {
                    k10.p(a10);
                } else {
                    h(k10, t10);
                }
                if (this.f41975e.c(i10)) {
                    g(k10);
                }
                arrayList.add(androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: t.g0
                    @Override // androidx.concurrent.futures.c.InterfaceC0253c
                    public final Object a(c.a aVar) {
                        Object p10;
                        p10 = C4526a0.d.this.p(k10, aVar);
                        return p10;
                    }
                }));
                arrayList2.add(k10.h());
            }
            this.f41974d.r0(arrayList2);
            return G.n.k(arrayList);
        }
    }

    /* renamed from: t.a0$e */
    interface e {
        h8.d a(TotalCaptureResult totalCaptureResult);

        boolean b();

        void c();
    }

    /* renamed from: t.a0$f */
    static class f implements C4584u.c {

        /* renamed from: a, reason: collision with root package name */
        private c.a f41983a;

        /* renamed from: b, reason: collision with root package name */
        private final h8.d f41984b = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: t.k0
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object d10;
                d10 = C4526a0.f.this.d(aVar);
                return d10;
            }
        });

        /* renamed from: c, reason: collision with root package name */
        private final a f41985c;

        /* renamed from: t.a0$f$a */
        interface a {
            boolean a(TotalCaptureResult totalCaptureResult);
        }

        f(a aVar) {
            this.f41985c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object d(c.a aVar) {
            this.f41983a = aVar;
            return "waitFor3AResult";
        }

        @Override // t.C4584u.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            a aVar = this.f41985c;
            if (aVar != null && !aVar.a(totalCaptureResult)) {
                return false;
            }
            this.f41983a.c(totalCaptureResult);
            return true;
        }

        public h8.d c() {
            return this.f41984b;
        }
    }

    /* renamed from: t.a0$g */
    static class g implements e {

        /* renamed from: f, reason: collision with root package name */
        private static final long f41986f = TimeUnit.SECONDS.toNanos(2);

        /* renamed from: a, reason: collision with root package name */
        private final C4584u f41987a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f41988b;

        /* renamed from: c, reason: collision with root package name */
        private final ScheduledExecutorService f41989c;

        /* renamed from: d, reason: collision with root package name */
        private final W.i f41990d;

        /* renamed from: e, reason: collision with root package name */
        private final C5084B f41991e;

        g(C4584u c4584u, Executor executor, ScheduledExecutorService scheduledExecutorService, C5084B c5084b) {
            this.f41987a = c4584u;
            this.f41988b = executor;
            this.f41989c = scheduledExecutorService;
            this.f41991e = c5084b;
            W.i J10 = c4584u.J();
            Objects.requireNonNull(J10);
            this.f41990d = J10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ h8.d A(h8.d dVar, Object obj) {
            return G.n.A(TimeUnit.SECONDS.toMillis(3L), this.f41989c, null, true, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ h8.d B(Void r12) {
            return this.f41987a.F().i0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean C(TotalCaptureResult totalCaptureResult) {
            return C4526a0.d(totalCaptureResult, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void r(c.a aVar) {
            AbstractC0700h0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: UI change applied");
            aVar.c(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object s(AtomicReference atomicReference, final c.a aVar) {
            atomicReference.set(new W.j() { // from class: t.n0
                @Override // A.W.j
                public final void a() {
                    C4526a0.g.r(c.a.this);
                }
            });
            return "OnScreenFlashUiApplied";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ h8.d t(Void r52) {
            return C4526a0.j(f41986f, this.f41989c, this.f41987a, new f.a() { // from class: t.m0
                @Override // t.C4526a0.f.a
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    boolean C10;
                    C10 = C4526a0.g.C(totalCaptureResult);
                    return C10;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Boolean u(TotalCaptureResult totalCaptureResult) {
            return Boolean.FALSE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(AtomicReference atomicReference, c.a aVar) {
            AbstractC0700h0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
            this.f41990d.a(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(3L), (W.j) atomicReference.get());
            aVar.c(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object w(final AtomicReference atomicReference, final c.a aVar) {
            F.c.e().execute(new Runnable() { // from class: t.y0
                @Override // java.lang.Runnable
                public final void run() {
                    C4526a0.g.this.v(atomicReference, aVar);
                }
            });
            return "OnScreenFlashStart";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ h8.d x(Void r22) {
            return this.f41987a.F().y(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object y(c.a aVar) {
            if (!this.f41991e.a()) {
                aVar.c(null);
                return "EnableTorchInternal";
            }
            AbstractC0700h0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: enable torch");
            this.f41987a.C(true);
            aVar.c(null);
            return "EnableTorchInternal";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ h8.d z(Void r12) {
            return androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: t.x0
                @Override // androidx.concurrent.futures.c.InterfaceC0253c
                public final Object a(c.a aVar) {
                    Object y10;
                    y10 = C4526a0.g.this.y(aVar);
                    return y10;
                }
            });
        }

        @Override // t.C4526a0.e
        public h8.d a(TotalCaptureResult totalCaptureResult) {
            AbstractC0700h0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture");
            final AtomicReference atomicReference = new AtomicReference();
            final h8.d a10 = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: t.l0
                @Override // androidx.concurrent.futures.c.InterfaceC0253c
                public final Object a(c.a aVar) {
                    Object s10;
                    s10 = C4526a0.g.s(atomicReference, aVar);
                    return s10;
                }
            });
            return G.d.a(androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: t.q0
                @Override // androidx.concurrent.futures.c.InterfaceC0253c
                public final Object a(c.a aVar) {
                    Object w10;
                    w10 = C4526a0.g.this.w(atomicReference, aVar);
                    return w10;
                }
            })).f(new G.a() { // from class: t.r0
                @Override // G.a
                public final h8.d apply(Object obj) {
                    h8.d x10;
                    x10 = C4526a0.g.this.x((Void) obj);
                    return x10;
                }
            }, this.f41988b).f(new G.a() { // from class: t.s0
                @Override // G.a
                public final h8.d apply(Object obj) {
                    h8.d z10;
                    z10 = C4526a0.g.this.z((Void) obj);
                    return z10;
                }
            }, this.f41988b).f(new G.a() { // from class: t.t0
                @Override // G.a
                public final h8.d apply(Object obj) {
                    h8.d A10;
                    A10 = C4526a0.g.this.A(a10, obj);
                    return A10;
                }
            }, this.f41988b).f(new G.a() { // from class: t.u0
                @Override // G.a
                public final h8.d apply(Object obj) {
                    h8.d B10;
                    B10 = C4526a0.g.this.B((Void) obj);
                    return B10;
                }
            }, this.f41988b).f(new G.a() { // from class: t.v0
                @Override // G.a
                public final h8.d apply(Object obj) {
                    h8.d t10;
                    t10 = C4526a0.g.this.t((Void) obj);
                    return t10;
                }
            }, this.f41988b).d(new InterfaceC3735a() { // from class: t.w0
                @Override // o.InterfaceC3735a
                public final Object apply(Object obj) {
                    Boolean u10;
                    u10 = C4526a0.g.u((TotalCaptureResult) obj);
                    return u10;
                }
            }, F.c.b());
        }

        @Override // t.C4526a0.e
        public boolean b() {
            return false;
        }

        @Override // t.C4526a0.e
        public void c() {
            AbstractC0700h0.a("Camera2CapturePipeline", "ScreenFlashTask#postCapture");
            if (this.f41991e.a()) {
                this.f41987a.C(false);
            }
            this.f41987a.F().y(false).e(new Runnable() { // from class: t.o0
                @Override // java.lang.Runnable
                public final void run() {
                    Log.d("Camera2CapturePipeline", "enableExternalFlashAeMode disabled");
                }
            }, this.f41988b);
            this.f41987a.F().q(false, true);
            ScheduledExecutorService e10 = F.c.e();
            final W.i iVar = this.f41990d;
            Objects.requireNonNull(iVar);
            e10.execute(new Runnable() { // from class: t.p0
                @Override // java.lang.Runnable
                public final void run() {
                    W.i.this.clear();
                }
            });
        }
    }

    /* renamed from: t.a0$h */
    static class h implements e {

        /* renamed from: g, reason: collision with root package name */
        private static final long f41992g = TimeUnit.SECONDS.toNanos(2);

        /* renamed from: a, reason: collision with root package name */
        private final C4584u f41993a;

        /* renamed from: b, reason: collision with root package name */
        private final int f41994b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f41995c = false;

        /* renamed from: d, reason: collision with root package name */
        private final Executor f41996d;

        /* renamed from: e, reason: collision with root package name */
        private final ScheduledExecutorService f41997e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f41998f;

        h(C4584u c4584u, int i10, Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z10) {
            this.f41993a = c4584u;
            this.f41994b = i10;
            this.f41996d = executor;
            this.f41997e = scheduledExecutorService;
            this.f41998f = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object i(c.a aVar) {
            this.f41993a.Q().g(aVar, true);
            return "TorchOn";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ h8.d j(Void r12) {
            return this.f41998f ? this.f41993a.F().i0() : G.n.p(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean k(TotalCaptureResult totalCaptureResult) {
            return C4526a0.d(totalCaptureResult, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ h8.d l(Void r52) {
            return C4526a0.j(f41992g, this.f41997e, this.f41993a, new f.a() { // from class: t.D0
                @Override // t.C4526a0.f.a
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    boolean k10;
                    k10 = C4526a0.h.k(totalCaptureResult);
                    return k10;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Boolean m(TotalCaptureResult totalCaptureResult) {
            return Boolean.FALSE;
        }

        @Override // t.C4526a0.e
        public h8.d a(TotalCaptureResult totalCaptureResult) {
            AbstractC0700h0.a("Camera2CapturePipeline", "TorchTask#preCapture: isFlashRequired = " + C4526a0.e(this.f41994b, totalCaptureResult));
            if (C4526a0.e(this.f41994b, totalCaptureResult)) {
                if (!this.f41993a.Z()) {
                    AbstractC0700h0.a("Camera2CapturePipeline", "Turn on torch");
                    this.f41995c = true;
                    return G.d.a(androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: t.z0
                        @Override // androidx.concurrent.futures.c.InterfaceC0253c
                        public final Object a(c.a aVar) {
                            Object i10;
                            i10 = C4526a0.h.this.i(aVar);
                            return i10;
                        }
                    })).f(new G.a() { // from class: t.A0
                        @Override // G.a
                        public final h8.d apply(Object obj) {
                            h8.d j10;
                            j10 = C4526a0.h.this.j((Void) obj);
                            return j10;
                        }
                    }, this.f41996d).f(new G.a() { // from class: t.B0
                        @Override // G.a
                        public final h8.d apply(Object obj) {
                            h8.d l10;
                            l10 = C4526a0.h.this.l((Void) obj);
                            return l10;
                        }
                    }, this.f41996d).d(new InterfaceC3735a() { // from class: t.C0
                        @Override // o.InterfaceC3735a
                        public final Object apply(Object obj) {
                            Boolean m10;
                            m10 = C4526a0.h.m((TotalCaptureResult) obj);
                            return m10;
                        }
                    }, F.c.b());
                }
                AbstractC0700h0.a("Camera2CapturePipeline", "Torch already on, not turn on");
            }
            return G.n.p(Boolean.FALSE);
        }

        @Override // t.C4526a0.e
        public boolean b() {
            return this.f41994b == 0;
        }

        @Override // t.C4526a0.e
        public void c() {
            if (this.f41995c) {
                this.f41993a.Q().g(null, false);
                AbstractC0700h0.a("Camera2CapturePipeline", "Turning off torch");
                if (this.f41998f) {
                    this.f41993a.F().q(false, true);
                }
            }
        }
    }

    C4526a0(C4584u c4584u, C4832C c4832c, androidx.camera.core.impl.P0 p02, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f41952a = c4584u;
        Integer num = (Integer) c4832c.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f41958g = num != null && num.intValue() == 2;
        this.f41956e = executor;
        this.f41957f = scheduledExecutorService;
        this.f41955d = p02;
        this.f41953b = new C5085C(p02);
        this.f41954c = AbstractC5092g.a(new S(c4832c));
    }

    static boolean d(TotalCaptureResult totalCaptureResult, boolean z10) {
        if (totalCaptureResult == null) {
            return false;
        }
        return androidx.camera.core.impl.Y.a(new C4543g(totalCaptureResult), z10);
    }

    static boolean e(int i10, TotalCaptureResult totalCaptureResult) {
        AbstractC0700h0.a("Camera2CapturePipeline", "isFlashRequired: flashMode = " + i10);
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return false;
                }
                if (i10 != 3) {
                    throw new AssertionError(i10);
                }
            }
            return true;
        }
        Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
        AbstractC0700h0.a("Camera2CapturePipeline", "isFlashRequired: aeState = " + num);
        return num != null && num.intValue() == 4;
    }

    private boolean f(int i10) {
        return this.f41953b.a() || this.f41959h == 3 || i10 == 1;
    }

    static h8.d j(long j10, ScheduledExecutorService scheduledExecutorService, C4584u c4584u, f.a aVar) {
        return G.n.A(TimeUnit.NANOSECONDS.toMillis(j10), scheduledExecutorService, null, true, k(c4584u, aVar));
    }

    static h8.d k(final C4584u c4584u, f.a aVar) {
        final f fVar = new f(aVar);
        c4584u.z(fVar);
        h8.d c10 = fVar.c();
        c10.e(new Runnable() { // from class: t.X
            @Override // java.lang.Runnable
            public final void run() {
                C4584u.this.k0(fVar);
            }
        }, c4584u.f42189c);
        return c10;
    }

    d b(int i10, int i11, int i12) {
        x.o oVar = new x.o(this.f41955d);
        d dVar = new d(this.f41959h, this.f41956e, this.f41957f, this.f41952a, this.f41958g, oVar);
        if (i10 == 0) {
            dVar.f(new b(this.f41952a));
        }
        if (i11 == 3) {
            dVar.f(new g(this.f41952a, this.f41956e, this.f41957f, new C5084B(this.f41955d)));
        } else if (this.f41954c) {
            if (f(i12)) {
                dVar.f(new h(this.f41952a, i11, this.f41956e, this.f41957f, (this.f41953b.a() || this.f41952a.W()) ? false : true));
            } else {
                dVar.f(new a(this.f41952a, i11, oVar));
            }
        }
        AbstractC0700h0.a("Camera2CapturePipeline", "createPipeline: captureMode = " + i10 + ", flashMode = " + i11 + ", flashType = " + i12 + ", pipeline tasks = " + dVar.f41978h);
        return dVar;
    }

    InterfaceC0733k c(int i10, int i11, int i12) {
        return new c(b(i10, i11, i12), this.f41956e, i11);
    }

    public void h(int i10) {
        this.f41959h = i10;
    }

    public h8.d i(List list, int i10, int i11, int i12) {
        return G.n.B(b(i10, i11, i12).i(list, i11));
    }
}
