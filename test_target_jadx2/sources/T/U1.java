package t;

import A.AbstractC0700h0;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.core.impl.AbstractC1429c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import v.C4906q;
import x.h;

/* loaded from: classes.dex */
class U1 extends Q1 {

    /* renamed from: o, reason: collision with root package name */
    private final ScheduledExecutorService f41923o;

    /* renamed from: p, reason: collision with root package name */
    private final Object f41924p;

    /* renamed from: q, reason: collision with root package name */
    private List f41925q;

    /* renamed from: r, reason: collision with root package name */
    h8.d f41926r;

    /* renamed from: s, reason: collision with root package name */
    private final x.i f41927s;

    /* renamed from: t, reason: collision with root package name */
    private final x.h f41928t;

    /* renamed from: u, reason: collision with root package name */
    private final x.t f41929u;

    /* renamed from: v, reason: collision with root package name */
    private final x.v f41930v;

    /* renamed from: w, reason: collision with root package name */
    private final AtomicBoolean f41931w;

    U1(androidx.camera.core.impl.P0 p02, androidx.camera.core.impl.P0 p03, C4539e1 c4539e1, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(c4539e1, executor, scheduledExecutorService, handler);
        this.f41924p = new Object();
        this.f41931w = new AtomicBoolean(false);
        this.f41927s = new x.i(p02, p03);
        this.f41929u = new x.t(p02.a(CaptureSessionStuckQuirk.class) || p02.a(IncorrectCaptureStateQuirk.class));
        this.f41928t = new x.h(p03);
        this.f41930v = new x.v(p03);
        this.f41923o = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        O("Session call super.close()");
        super.close();
    }

    private void N() {
        Iterator it = this.f41885b.d().iterator();
        while (it.hasNext()) {
            ((K1) it.next()).close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(K1 k12) {
        super.s(k12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ h8.d Q(CameraDevice cameraDevice, C4906q c4906q, List list, List list2) {
        if (this.f41930v.a()) {
            N();
        }
        O("start openCaptureSession");
        return super.l(cameraDevice, c4906q, list);
    }

    void O(String str) {
        AbstractC0700h0.a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    @Override // t.Q1, t.K1
    public void close() {
        if (!this.f41931w.compareAndSet(false, true)) {
            O("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f41930v.a()) {
            try {
                O("Call abortCaptures() before closing session.");
                a();
            } catch (Exception e10) {
                O("Exception when calling abortCaptures()" + e10);
            }
        }
        O("Session call close()");
        this.f41929u.e().e(new Runnable() { // from class: t.S1
            @Override // java.lang.Runnable
            public final void run() {
                U1.this.E();
            }
        }, b());
    }

    @Override // t.Q1, t.K1
    public void e() {
        super.e();
        this.f41929u.i();
    }

    @Override // t.Q1, t.K1
    public int g(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.g(list, this.f41929u.d(captureCallback));
    }

    @Override // t.Q1, t.K1
    public void i(int i10) {
        super.i(i10);
        if (i10 == 5) {
            synchronized (this.f41924p) {
                try {
                    if (D() && this.f41925q != null) {
                        O("Close DeferrableSurfaces for CameraDevice error.");
                        Iterator it = this.f41925q.iterator();
                        while (it.hasNext()) {
                            ((AbstractC1429c0) it.next()).d();
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // t.Q1, t.K1
    public int k(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.k(captureRequest, this.f41929u.d(captureCallback));
    }

    @Override // t.Q1, t.K1.a
    public h8.d l(final CameraDevice cameraDevice, final C4906q c4906q, final List list) {
        h8.d B10;
        synchronized (this.f41924p) {
            try {
                List d10 = this.f41885b.d();
                ArrayList arrayList = new ArrayList();
                Iterator it = d10.iterator();
                while (it.hasNext()) {
                    arrayList.add(((K1) it.next()).n());
                }
                h8.d F10 = G.n.F(arrayList);
                this.f41926r = F10;
                B10 = G.n.B(G.d.a(F10).f(new G.a() { // from class: t.T1
                    @Override // G.a
                    public final h8.d apply(Object obj) {
                        h8.d Q10;
                        Q10 = U1.this.Q(cameraDevice, c4906q, list, (List) obj);
                        return Q10;
                    }
                }, b()));
            } catch (Throwable th) {
                throw th;
            }
        }
        return B10;
    }

    @Override // t.Q1, t.K1.a
    public h8.d m(List list, long j10) {
        h8.d m10;
        synchronized (this.f41924p) {
            this.f41925q = list;
            m10 = super.m(list, j10);
        }
        return m10;
    }

    @Override // t.K1
    public h8.d n() {
        return G.n.z(1500L, this.f41923o, this.f41929u.e());
    }

    @Override // t.Q1, t.K1.c
    public void q(K1 k12) {
        synchronized (this.f41924p) {
            this.f41927s.a(this.f41925q);
        }
        O("onClosed()");
        super.q(k12);
    }

    @Override // t.Q1, t.K1.c
    public void s(K1 k12) {
        O("Session onConfigured()");
        this.f41928t.c(k12, this.f41885b.e(), this.f41885b.d(), new h.a() { // from class: t.R1
            @Override // x.h.a
            public final void a(K1 k13) {
                U1.this.P(k13);
            }
        });
    }

    @Override // t.Q1, t.K1.a
    public boolean stop() {
        boolean stop;
        synchronized (this.f41924p) {
            try {
                if (D()) {
                    this.f41927s.a(this.f41925q);
                } else {
                    h8.d dVar = this.f41926r;
                    if (dVar != null) {
                        dVar.cancel(true);
                    }
                }
                stop = super.stop();
            } catch (Throwable th) {
                throw th;
            }
        }
        return stop;
    }
}
