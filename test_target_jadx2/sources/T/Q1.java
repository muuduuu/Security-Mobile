package t;

import A.AbstractC0700h0;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.impl.AbstractC1429c0;
import androidx.camera.core.impl.AbstractC1435f0;
import androidx.concurrent.futures.c;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import t.K1;
import u.C4833D;
import u.C4845i;
import v.C4906q;

/* loaded from: classes.dex */
abstract class Q1 extends K1.c implements K1, K1.a {

    /* renamed from: b, reason: collision with root package name */
    final C4539e1 f41885b;

    /* renamed from: c, reason: collision with root package name */
    final Handler f41886c;

    /* renamed from: d, reason: collision with root package name */
    final Executor f41887d;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f41888e;

    /* renamed from: f, reason: collision with root package name */
    K1.c f41889f;

    /* renamed from: g, reason: collision with root package name */
    C4845i f41890g;

    /* renamed from: h, reason: collision with root package name */
    h8.d f41891h;

    /* renamed from: i, reason: collision with root package name */
    c.a f41892i;

    /* renamed from: j, reason: collision with root package name */
    private h8.d f41893j;

    /* renamed from: a, reason: collision with root package name */
    final Object f41884a = new Object();

    /* renamed from: k, reason: collision with root package name */
    private List f41894k = null;

    /* renamed from: l, reason: collision with root package name */
    private boolean f41895l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f41896m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f41897n = false;

    class b extends CameraCaptureSession.StateCallback {
        b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            Q1.this.B(cameraCaptureSession);
            Q1 q12 = Q1.this;
            q12.o(q12);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            Q1.this.B(cameraCaptureSession);
            Q1 q12 = Q1.this;
            q12.p(q12);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            Q1.this.B(cameraCaptureSession);
            Q1 q12 = Q1.this;
            q12.q(q12);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            c.a aVar;
            try {
                Q1.this.B(cameraCaptureSession);
                Q1 q12 = Q1.this;
                q12.r(q12);
                synchronized (Q1.this.f41884a) {
                    y0.f.h(Q1.this.f41892i, "OpenCaptureSession completer should not null");
                    Q1 q13 = Q1.this;
                    aVar = q13.f41892i;
                    q13.f41892i = null;
                }
                aVar.f(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th) {
                synchronized (Q1.this.f41884a) {
                    y0.f.h(Q1.this.f41892i, "OpenCaptureSession completer should not null");
                    Q1 q14 = Q1.this;
                    c.a aVar2 = q14.f41892i;
                    q14.f41892i = null;
                    aVar2.f(new IllegalStateException("onConfigureFailed"));
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            c.a aVar;
            try {
                Q1.this.B(cameraCaptureSession);
                Q1 q12 = Q1.this;
                q12.s(q12);
                synchronized (Q1.this.f41884a) {
                    y0.f.h(Q1.this.f41892i, "OpenCaptureSession completer should not null");
                    Q1 q13 = Q1.this;
                    aVar = q13.f41892i;
                    q13.f41892i = null;
                }
                aVar.c(null);
            } catch (Throwable th) {
                synchronized (Q1.this.f41884a) {
                    y0.f.h(Q1.this.f41892i, "OpenCaptureSession completer should not null");
                    Q1 q14 = Q1.this;
                    c.a aVar2 = q14.f41892i;
                    q14.f41892i = null;
                    aVar2.c(null);
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            Q1.this.B(cameraCaptureSession);
            Q1 q12 = Q1.this;
            q12.t(q12);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            Q1.this.B(cameraCaptureSession);
            Q1 q12 = Q1.this;
            q12.v(q12, surface);
        }
    }

    Q1(C4539e1 c4539e1, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f41885b = c4539e1;
        this.f41886c = handler;
        this.f41887d = executor;
        this.f41888e = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        u(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(K1 k12) {
        this.f41885b.g(this);
        u(k12);
        if (this.f41890g != null) {
            Objects.requireNonNull(this.f41889f);
            this.f41889f.q(k12);
            return;
        }
        AbstractC0700h0.l("SyncCaptureSessionBase", "[" + this + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(K1 k12) {
        Objects.requireNonNull(this.f41889f);
        this.f41889f.u(k12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object H(List list, C4833D c4833d, C4906q c4906q, c.a aVar) {
        String str;
        synchronized (this.f41884a) {
            C(list);
            y0.f.j(this.f41892i == null, "The openCaptureSessionCompleter can only set once!");
            this.f41892i = aVar;
            c4833d.a(c4906q);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ h8.d I(List list, List list2) {
        AbstractC0700h0.a("SyncCaptureSessionBase", "[" + this + "] getSurface done with results: " + list2);
        return list2.isEmpty() ? G.n.n(new IllegalArgumentException("Unable to open capture session without surfaces")) : list2.contains(null) ? G.n.n(new AbstractC1429c0.a("Surface closed", (AbstractC1429c0) list.get(list2.indexOf(null)))) : G.n.p(list2);
    }

    void B(CameraCaptureSession cameraCaptureSession) {
        if (this.f41890g == null) {
            this.f41890g = C4845i.d(cameraCaptureSession, this.f41886c);
        }
    }

    void C(List list) {
        synchronized (this.f41884a) {
            J();
            AbstractC1435f0.d(list);
            this.f41894k = list;
        }
    }

    boolean D() {
        boolean z10;
        synchronized (this.f41884a) {
            z10 = this.f41891h != null;
        }
        return z10;
    }

    void J() {
        synchronized (this.f41884a) {
            try {
                List list = this.f41894k;
                if (list != null) {
                    AbstractC1435f0.c(list);
                    this.f41894k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t.K1
    public void a() {
        y0.f.h(this.f41890g, "Need to call openCaptureSession before using this API.");
        this.f41890g.c().abortCaptures();
    }

    @Override // t.K1.a
    public Executor b() {
        return this.f41887d;
    }

    @Override // t.K1
    public void close() {
        y0.f.h(this.f41890g, "Need to call openCaptureSession before using this API.");
        this.f41885b.h(this);
        this.f41890g.c().close();
        b().execute(new Runnable() { // from class: t.O1
            @Override // java.lang.Runnable
            public final void run() {
                Q1.this.E();
            }
        });
    }

    @Override // t.K1
    public void d() {
        y0.f.h(this.f41890g, "Need to call openCaptureSession before using this API.");
        this.f41890g.c().stopRepeating();
    }

    @Override // t.K1
    public void e() {
        J();
    }

    @Override // t.K1.a
    public C4906q f(int i10, List list, K1.c cVar) {
        this.f41889f = cVar;
        return new C4906q(i10, list, b(), new b());
    }

    @Override // t.K1
    public int g(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        y0.f.h(this.f41890g, "Need to call openCaptureSession before using this API.");
        return this.f41890g.a(list, b(), captureCallback);
    }

    @Override // t.K1
    public C4845i h() {
        y0.f.g(this.f41890g);
        return this.f41890g;
    }

    @Override // t.K1
    public CameraDevice j() {
        y0.f.g(this.f41890g);
        return this.f41890g.c().getDevice();
    }

    @Override // t.K1
    public int k(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        y0.f.h(this.f41890g, "Need to call openCaptureSession before using this API.");
        return this.f41890g.b(captureRequest, b(), captureCallback);
    }

    @Override // t.K1.a
    public h8.d l(CameraDevice cameraDevice, final C4906q c4906q, final List list) {
        synchronized (this.f41884a) {
            try {
                if (this.f41896m) {
                    return G.n.n(new CancellationException("Opener is disabled"));
                }
                this.f41885b.k(this);
                final C4833D b10 = C4833D.b(cameraDevice, this.f41886c);
                h8.d a10 = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: t.P1
                    @Override // androidx.concurrent.futures.c.InterfaceC0253c
                    public final Object a(c.a aVar) {
                        Object H10;
                        H10 = Q1.this.H(list, b10, c4906q, aVar);
                        return H10;
                    }
                });
                this.f41891h = a10;
                G.n.j(a10, new a(), F.c.b());
                return G.n.B(this.f41891h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t.K1.a
    public h8.d m(final List list, long j10) {
        synchronized (this.f41884a) {
            try {
                if (this.f41896m) {
                    return G.n.n(new CancellationException("Opener is disabled"));
                }
                G.d f10 = G.d.a(AbstractC1435f0.g(list, false, j10, b(), this.f41888e)).f(new G.a() { // from class: t.M1
                    @Override // G.a
                    public final h8.d apply(Object obj) {
                        h8.d I10;
                        I10 = Q1.this.I(list, (List) obj);
                        return I10;
                    }
                }, b());
                this.f41893j = f10;
                return G.n.B(f10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t.K1.c
    public void o(K1 k12) {
        Objects.requireNonNull(this.f41889f);
        this.f41889f.o(k12);
    }

    @Override // t.K1.c
    public void p(K1 k12) {
        Objects.requireNonNull(this.f41889f);
        this.f41889f.p(k12);
    }

    @Override // t.K1.c
    public void q(final K1 k12) {
        h8.d dVar;
        synchronized (this.f41884a) {
            try {
                if (this.f41895l) {
                    dVar = null;
                } else {
                    this.f41895l = true;
                    y0.f.h(this.f41891h, "Need to call openCaptureSession before using this API.");
                    dVar = this.f41891h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e();
        if (dVar != null) {
            dVar.e(new Runnable() { // from class: t.L1
                @Override // java.lang.Runnable
                public final void run() {
                    Q1.this.F(k12);
                }
            }, F.c.b());
        }
    }

    @Override // t.K1.c
    public void r(K1 k12) {
        Objects.requireNonNull(this.f41889f);
        e();
        this.f41885b.i(this);
        this.f41889f.r(k12);
    }

    @Override // t.K1.c
    public void s(K1 k12) {
        Objects.requireNonNull(this.f41889f);
        this.f41885b.j(this);
        this.f41889f.s(k12);
    }

    @Override // t.K1.a
    public boolean stop() {
        boolean z10;
        try {
            synchronized (this.f41884a) {
                try {
                    if (!this.f41896m) {
                        h8.d dVar = this.f41893j;
                        r1 = dVar != null ? dVar : null;
                        this.f41896m = true;
                    }
                    z10 = !D();
                } finally {
                }
            }
            return z10;
        } finally {
            if (r1 != null) {
                r1.cancel(true);
            }
        }
    }

    @Override // t.K1.c
    public void t(K1 k12) {
        Objects.requireNonNull(this.f41889f);
        this.f41889f.t(k12);
    }

    @Override // t.K1.c
    void u(final K1 k12) {
        h8.d dVar;
        synchronized (this.f41884a) {
            try {
                if (this.f41897n) {
                    dVar = null;
                } else {
                    this.f41897n = true;
                    y0.f.h(this.f41891h, "Need to call openCaptureSession before using this API.");
                    dVar = this.f41891h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (dVar != null) {
            dVar.e(new Runnable() { // from class: t.N1
                @Override // java.lang.Runnable
                public final void run() {
                    Q1.this.G(k12);
                }
            }, F.c.b());
        }
    }

    @Override // t.K1.c
    public void v(K1 k12, Surface surface) {
        Objects.requireNonNull(this.f41889f);
        this.f41889f.v(k12, surface);
    }

    @Override // t.K1
    public K1.c c() {
        return this;
    }

    class a implements G.c {
        a() {
        }

        @Override // G.c
        public void onFailure(Throwable th) {
            Q1.this.e();
            Q1 q12 = Q1.this;
            q12.f41885b.i(q12);
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }

    @Override // t.K1
    public void i(int i10) {
    }
}
