package t;

import A.AbstractC0700h0;
import A.AbstractC0715s;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.CamcorderProfile;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.core.impl.AbstractC1424a;
import androidx.camera.core.impl.AbstractC1429c0;
import androidx.camera.core.impl.C1460s0;
import androidx.camera.core.impl.C1474z0;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.InterfaceC1473z;
import androidx.camera.core.impl.O;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.V0;
import androidx.camera.core.impl.k1;
import androidx.camera.core.impl.m1;
import androidx.concurrent.futures.c;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import q1.AbstractC3901a;
import t.F1;
import t.K1;
import t.M;
import u.AbstractC4837a;
import u.C4832C;
import u.C4844h;
import v.C4896g;

/* loaded from: classes.dex */
final class M implements androidx.camera.core.impl.H {

    /* renamed from: A, reason: collision with root package name */
    private F1 f41800A;

    /* renamed from: B, reason: collision with root package name */
    private final C4539e1 f41801B;

    /* renamed from: C, reason: collision with root package name */
    private final K1.b f41802C;

    /* renamed from: D, reason: collision with root package name */
    private final Set f41803D;

    /* renamed from: E, reason: collision with root package name */
    private InterfaceC1473z f41804E;

    /* renamed from: F, reason: collision with root package name */
    final Object f41805F;

    /* renamed from: G, reason: collision with root package name */
    boolean f41806G;

    /* renamed from: H, reason: collision with root package name */
    private final C4545g1 f41807H;

    /* renamed from: I, reason: collision with root package name */
    private final C4832C f41808I;

    /* renamed from: J, reason: collision with root package name */
    private final C4896g f41809J;

    /* renamed from: K, reason: collision with root package name */
    private final J1 f41810K;

    /* renamed from: X, reason: collision with root package name */
    private final h f41811X;

    /* renamed from: a, reason: collision with root package name */
    private final androidx.camera.core.impl.k1 f41812a;

    /* renamed from: b, reason: collision with root package name */
    private final u.P f41813b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f41814c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f41815d;

    /* renamed from: e, reason: collision with root package name */
    volatile i f41816e = i.INITIALIZED;

    /* renamed from: f, reason: collision with root package name */
    private final C1474z0 f41817f;

    /* renamed from: g, reason: collision with root package name */
    private final O0 f41818g;

    /* renamed from: h, reason: collision with root package name */
    private final C4584u f41819h;

    /* renamed from: i, reason: collision with root package name */
    private final j f41820i;

    /* renamed from: j, reason: collision with root package name */
    final U f41821j;

    /* renamed from: k, reason: collision with root package name */
    CameraDevice f41822k;

    /* renamed from: l, reason: collision with root package name */
    int f41823l;

    /* renamed from: m, reason: collision with root package name */
    InterfaceC4530b1 f41824m;

    /* renamed from: n, reason: collision with root package name */
    final AtomicInteger f41825n;

    /* renamed from: o, reason: collision with root package name */
    c.a f41826o;

    /* renamed from: p, reason: collision with root package name */
    final Map f41827p;

    /* renamed from: q, reason: collision with root package name */
    private int f41828q;

    /* renamed from: r, reason: collision with root package name */
    final e f41829r;

    /* renamed from: s, reason: collision with root package name */
    final f f41830s;

    /* renamed from: t, reason: collision with root package name */
    final B.a f41831t;

    /* renamed from: u, reason: collision with root package name */
    final androidx.camera.core.impl.O f41832u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f41833v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f41834w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f41835x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f41836y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f41837z;

    class a implements InterfaceC4540f {
        a() {
        }

        @Override // t.InterfaceC4540f
        public CamcorderProfile a(int i10, int i11) {
            return CamcorderProfile.get(i10, i11);
        }

        @Override // t.InterfaceC4540f
        public boolean b(int i10, int i11) {
            return CamcorderProfile.hasProfile(i10, i11);
        }
    }

    class b extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f41839a;

        b(c.a aVar) {
            this.f41839a = aVar;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            M.this.U("openCameraConfigAndClose camera closed");
            this.f41839a.c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            M.this.U("openCameraConfigAndClose camera disconnected");
            this.f41839a.c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            M.this.U("openCameraConfigAndClose camera error " + i10);
            this.f41839a.c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            M.this.U("openCameraConfigAndClose camera opened");
            h8.d R10 = M.this.R(cameraDevice);
            Objects.requireNonNull(cameraDevice);
            R10.e(new Runnable() { // from class: t.N
                @Override // java.lang.Runnable
                public final void run() {
                    cameraDevice.close();
                }
            }, M.this.f41814c);
        }
    }

    class d implements G.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4530b1 f41843a;

        d(InterfaceC4530b1 interfaceC4530b1) {
            this.f41843a = interfaceC4530b1;
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            if (M.this.f41831t.a() == 2 && M.this.f41816e == i.OPENED) {
                M.this.H0(i.CONFIGURED);
            }
        }

        @Override // G.c
        public void onFailure(Throwable th) {
            if (th instanceof AbstractC1429c0.a) {
                androidx.camera.core.impl.V0 W10 = M.this.W(((AbstractC1429c0.a) th).a());
                if (W10 != null) {
                    M.this.C0(W10);
                    return;
                }
                return;
            }
            if (th instanceof CancellationException) {
                M.this.U("Unable to configure camera cancelled");
                return;
            }
            i iVar = M.this.f41816e;
            i iVar2 = i.OPENED;
            if (iVar == iVar2) {
                M.this.I0(iVar2, AbstractC0715s.a.b(4, th));
            }
            AbstractC0700h0.d("Camera2CameraImpl", "Unable to configure camera " + M.this, th);
            M m10 = M.this;
            if (m10.f41824m == this.f41843a) {
                m10.F0(false);
            }
        }
    }

    final class e extends CameraManager.AvailabilityCallback implements O.c {

        /* renamed from: a, reason: collision with root package name */
        private final String f41845a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f41846b = true;

        e(String str) {
            this.f41845a = str;
        }

        @Override // androidx.camera.core.impl.O.c
        public void a() {
            if (M.this.f41816e == i.PENDING_OPEN) {
                M.this.Q0(false);
            }
        }

        boolean b() {
            return this.f41846b;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            if (this.f41845a.equals(str)) {
                this.f41846b = true;
                if (M.this.f41816e == i.PENDING_OPEN) {
                    M.this.Q0(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (this.f41845a.equals(str)) {
                this.f41846b = false;
            }
        }
    }

    final class f implements O.b {
        f() {
        }

        @Override // androidx.camera.core.impl.O.b
        public void a() {
            if (M.this.f41816e == i.OPENED) {
                M.this.A0();
            }
        }
    }

    final class g implements D.d {
        g() {
        }

        @Override // androidx.camera.core.impl.D.d
        public void a() {
            M.this.R0();
        }

        @Override // androidx.camera.core.impl.D.d
        public void b(List list) {
            M.this.K0((List) y0.f.g(list));
        }
    }

    enum i {
        RELEASED,
        RELEASING,
        INITIALIZED,
        PENDING_OPEN,
        CLOSING,
        REOPENING_QUIRK,
        REOPENING,
        OPENING,
        OPENED,
        CONFIGURED
    }

    final class j extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f41855a;

        /* renamed from: b, reason: collision with root package name */
        private final ScheduledExecutorService f41856b;

        /* renamed from: c, reason: collision with root package name */
        private b f41857c;

        /* renamed from: d, reason: collision with root package name */
        ScheduledFuture f41858d;

        /* renamed from: e, reason: collision with root package name */
        private final a f41859e;

        class a {

            /* renamed from: a, reason: collision with root package name */
            private final long f41861a;

            /* renamed from: b, reason: collision with root package name */
            private long f41862b = -1;

            a(long j10) {
                this.f41861a = j10;
            }

            boolean a() {
                if (b() < d()) {
                    return true;
                }
                e();
                return false;
            }

            long b() {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f41862b == -1) {
                    this.f41862b = uptimeMillis;
                }
                return uptimeMillis - this.f41862b;
            }

            int c() {
                if (!j.this.f()) {
                    return 700;
                }
                long b10 = b();
                if (b10 <= 120000) {
                    return 1000;
                }
                return b10 <= 300000 ? 2000 : 4000;
            }

            int d() {
                if (!j.this.f()) {
                    long j10 = this.f41861a;
                    return j10 > 0 ? Math.min((int) j10, ModuleDescriptor.MODULE_VERSION) : ModuleDescriptor.MODULE_VERSION;
                }
                long j11 = this.f41861a;
                if (j11 > 0) {
                    return Math.min((int) j11, 1800000);
                }
                return 1800000;
            }

            void e() {
                this.f41862b = -1L;
            }
        }

        class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private Executor f41864a;

            /* renamed from: b, reason: collision with root package name */
            private boolean f41865b = false;

            b(Executor executor) {
                this.f41864a = executor;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void c() {
                if (this.f41865b) {
                    return;
                }
                y0.f.i(M.this.f41816e == i.REOPENING || M.this.f41816e == i.REOPENING_QUIRK);
                if (j.this.f()) {
                    M.this.P0(true);
                } else {
                    M.this.Q0(true);
                }
            }

            void b() {
                this.f41865b = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f41864a.execute(new Runnable() { // from class: t.Q
                    @Override // java.lang.Runnable
                    public final void run() {
                        M.j.b.this.c();
                    }
                });
            }
        }

        j(Executor executor, ScheduledExecutorService scheduledExecutorService, long j10) {
            this.f41855a = executor;
            this.f41856b = scheduledExecutorService;
            this.f41859e = new a(j10);
        }

        private void b(CameraDevice cameraDevice, int i10) {
            y0.f.j(M.this.f41816e == i.OPENING || M.this.f41816e == i.OPENED || M.this.f41816e == i.CONFIGURED || M.this.f41816e == i.REOPENING || M.this.f41816e == i.REOPENING_QUIRK, "Attempt to handle open error from non open state: " + M.this.f41816e);
            if (i10 == 1 || i10 == 2 || i10 == 4) {
                AbstractC0700h0.a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), M.a0(i10)));
                c(i10);
                return;
            }
            AbstractC0700h0.c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + M.a0(i10) + " closing camera.");
            M.this.I0(i.CLOSING, AbstractC0715s.a.a(i10 == 3 ? 5 : 6));
            M.this.P(false);
        }

        private void c(int i10) {
            int i11 = 1;
            y0.f.j(M.this.f41823l != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i10 == 1) {
                i11 = 2;
            } else if (i10 != 2) {
                i11 = 3;
            }
            M.this.I0(i.REOPENING, AbstractC0715s.a.a(i11));
            M.this.P(false);
        }

        boolean a() {
            if (this.f41858d == null) {
                return false;
            }
            M.this.U("Cancelling scheduled re-open: " + this.f41857c);
            this.f41857c.b();
            this.f41857c = null;
            this.f41858d.cancel(false);
            this.f41858d = null;
            return true;
        }

        void d() {
            this.f41859e.e();
        }

        void e() {
            y0.f.i(this.f41857c == null);
            y0.f.i(this.f41858d == null);
            if (!this.f41859e.a()) {
                AbstractC0700h0.c("Camera2CameraImpl", "Camera reopening attempted for " + this.f41859e.d() + "ms without success.");
                M.this.J0(i.PENDING_OPEN, null, false);
                return;
            }
            this.f41857c = new b(this.f41855a);
            M.this.U("Attempting camera re-open in " + this.f41859e.c() + "ms: " + this.f41857c + " activeResuming = " + M.this.f41806G);
            this.f41858d = this.f41856b.schedule(this.f41857c, (long) this.f41859e.c(), TimeUnit.MILLISECONDS);
        }

        boolean f() {
            int i10;
            M m10 = M.this;
            return m10.f41806G && ((i10 = m10.f41823l) == 1 || i10 == 2);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            M.this.U("CameraDevice.onClosed()");
            y0.f.j(M.this.f41822k == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int ordinal = M.this.f41816e.ordinal();
            if (ordinal == 1 || ordinal == 4) {
                y0.f.i(M.this.e0());
                M.this.S();
                return;
            }
            if (ordinal != 5 && ordinal != 6) {
                throw new IllegalStateException("Camera closed while in state: " + M.this.f41816e);
            }
            M m10 = M.this;
            if (m10.f41823l == 0) {
                m10.Q0(false);
                return;
            }
            m10.U("Camera closed due to error: " + M.a0(M.this.f41823l));
            e();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            M.this.U("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            M m10 = M.this;
            m10.f41822k = cameraDevice;
            m10.f41823l = i10;
            m10.f41811X.b();
            int ordinal = M.this.f41816e.ordinal();
            if (ordinal != 1) {
                switch (ordinal) {
                    case 4:
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        AbstractC0700h0.a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), M.a0(i10), M.this.f41816e.name()));
                        b(cameraDevice, i10);
                        return;
                    default:
                        throw new IllegalStateException("onError() should not be possible from state: " + M.this.f41816e);
                }
            }
            AbstractC0700h0.c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), M.a0(i10), M.this.f41816e.name()));
            M.this.P(false);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            M.this.U("CameraDevice.onOpened()");
            M m10 = M.this;
            m10.f41822k = cameraDevice;
            m10.f41823l = 0;
            d();
            int ordinal = M.this.f41816e.ordinal();
            if (ordinal == 1 || ordinal == 4) {
                y0.f.i(M.this.e0());
                M.this.f41822k.close();
                M.this.f41822k = null;
            } else {
                if (ordinal != 5 && ordinal != 6 && ordinal != 7) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + M.this.f41816e);
                }
                M.this.H0(i.OPENED);
                androidx.camera.core.impl.O o10 = M.this.f41832u;
                String id2 = cameraDevice.getId();
                M m11 = M.this;
                if (o10.j(id2, m11.f41831t.c(m11.f41822k.getId()))) {
                    M.this.A0();
                }
            }
        }
    }

    static abstract class k {
        k() {
        }

        static k a(String str, Class cls, androidx.camera.core.impl.V0 v02, androidx.camera.core.impl.l1 l1Var, Size size, androidx.camera.core.impl.Z0 z02, List list) {
            return new C4534d(str, cls, v02, l1Var, size, z02, list);
        }

        static k b(A.J0 j02, boolean z10) {
            return a(M.c0(j02), j02.getClass(), z10 ? j02.w() : j02.u(), j02.j(), j02.f(), j02.e(), M.Z(j02));
        }

        abstract List c();

        abstract androidx.camera.core.impl.V0 d();

        abstract androidx.camera.core.impl.Z0 e();

        abstract Size f();

        abstract androidx.camera.core.impl.l1 g();

        abstract String h();

        abstract Class i();
    }

    M(Context context, u.P p10, String str, U u10, B.a aVar, androidx.camera.core.impl.O o10, Executor executor, Handler handler, C4545g1 c4545g1, long j10) {
        C1474z0 c1474z0 = new C1474z0();
        this.f41817f = c1474z0;
        this.f41823l = 0;
        this.f41825n = new AtomicInteger(0);
        this.f41827p = new LinkedHashMap();
        this.f41828q = 0;
        this.f41835x = false;
        this.f41836y = false;
        this.f41837z = true;
        this.f41803D = new HashSet();
        this.f41804E = androidx.camera.core.impl.C.a();
        this.f41805F = new Object();
        this.f41806G = false;
        this.f41811X = new h(this, null);
        this.f41813b = p10;
        this.f41831t = aVar;
        this.f41832u = o10;
        ScheduledExecutorService f10 = F.c.f(handler);
        this.f41815d = f10;
        Executor g10 = F.c.g(executor);
        this.f41814c = g10;
        this.f41820i = new j(g10, f10, j10);
        this.f41812a = new androidx.camera.core.impl.k1(str);
        c1474z0.m(H.a.CLOSED);
        O0 o02 = new O0(o10);
        this.f41818g = o02;
        C4539e1 c4539e1 = new C4539e1(g10);
        this.f41801B = c4539e1;
        this.f41807H = c4545g1;
        try {
            C4832C c10 = p10.c(str);
            this.f41808I = c10;
            C4584u c4584u = new C4584u(c10, f10, g10, new g(), u10.p());
            this.f41819h = c4584u;
            this.f41821j = u10;
            u10.w(c4584u);
            u10.z(o02.a());
            this.f41809J = C4896g.a(c10);
            this.f41824m = v0();
            this.f41802C = new K1.b(g10, f10, handler, c4539e1, u10.p(), androidx.camera.camera2.internal.compat.quirk.b.c());
            this.f41833v = u10.p().a(LegacyCameraOutputConfigNullPointerQuirk.class);
            this.f41834w = u10.p().a(LegacyCameraSurfaceCleanupQuirk.class);
            e eVar = new e(str);
            this.f41829r = eVar;
            f fVar = new f();
            this.f41830s = fVar;
            o10.g(this, g10, fVar, eVar);
            p10.g(g10, eVar);
            this.f41810K = new J1(context, str, p10, new a());
        } catch (C4844h e10) {
            throw P0.a(e10);
        }
    }

    private void B0() {
        int ordinal = this.f41816e.ordinal();
        if (ordinal == 2 || ordinal == 3) {
            P0(false);
            return;
        }
        if (ordinal != 4) {
            U("open() ignored due to being in state: " + this.f41816e);
            return;
        }
        H0(i.REOPENING);
        if (e0() || this.f41836y || this.f41823l != 0) {
            return;
        }
        y0.f.j(this.f41822k != null, "Camera Device should be open if session close is not complete");
        H0(i.OPENED);
        A0();
    }

    private void E0() {
        if (this.f41800A != null) {
            this.f41812a.w(this.f41800A.f() + this.f41800A.hashCode());
            this.f41812a.x(this.f41800A.f() + this.f41800A.hashCode());
            this.f41800A.c();
            this.f41800A = null;
        }
    }

    private void G0(final String str, final androidx.camera.core.impl.V0 v02, final androidx.camera.core.impl.l1 l1Var, final androidx.camera.core.impl.Z0 z02, final List list) {
        this.f41814c.execute(new Runnable() { // from class: t.z
            @Override // java.lang.Runnable
            public final void run() {
                M.this.t0(str, v02, l1Var, z02, list);
            }
        });
    }

    private Collection L0(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(k.b((A.J0) it.next(), this.f41837z));
        }
        return arrayList;
    }

    private void M() {
        F1 f12 = this.f41800A;
        if (f12 != null) {
            String b02 = b0(f12);
            androidx.camera.core.impl.k1 k1Var = this.f41812a;
            androidx.camera.core.impl.V0 h10 = this.f41800A.h();
            androidx.camera.core.impl.l1 i10 = this.f41800A.i();
            m1.b bVar = m1.b.METERING_REPEATING;
            k1Var.v(b02, h10, i10, null, Collections.singletonList(bVar));
            this.f41812a.u(b02, this.f41800A.h(), this.f41800A.i(), null, Collections.singletonList(bVar));
        }
    }

    private void N() {
        androidx.camera.core.impl.V0 c10 = this.f41812a.g().c();
        androidx.camera.core.impl.T j10 = c10.j();
        int size = j10.i().size();
        int size2 = c10.n().size();
        if (c10.n().isEmpty()) {
            return;
        }
        if (j10.i().isEmpty()) {
            if (this.f41800A == null) {
                this.f41800A = new F1(this.f41821j.t(), this.f41807H, new F1.c() { // from class: t.C
                    @Override // t.F1.c
                    public final void a() {
                        M.this.g0();
                    }
                });
            }
            if (f0()) {
                M();
                return;
            } else {
                AbstractC0700h0.c("Camera2CameraImpl", "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
                return;
            }
        }
        if (size2 == 1 && size == 1) {
            E0();
            return;
        }
        if (size >= 2) {
            E0();
            return;
        }
        if (this.f41800A != null && !f0()) {
            E0();
            return;
        }
        AbstractC0700h0.a("Camera2CameraImpl", "No need to remove a previous mMeteringRepeating, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
    }

    private void N0(Collection collection) {
        Size f10;
        boolean isEmpty = this.f41812a.h().isEmpty();
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        Rational rational = null;
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (!this.f41812a.o(kVar.h())) {
                this.f41812a.v(kVar.h(), kVar.d(), kVar.g(), kVar.e(), kVar.c());
                arrayList.add(kVar.h());
                if (kVar.i() == A.r0.class && (f10 = kVar.f()) != null) {
                    rational = new Rational(f10.getWidth(), f10.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        U("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (isEmpty) {
            this.f41819h.n0(true);
            this.f41819h.U();
        }
        N();
        S0();
        R0();
        F0(false);
        if (this.f41816e == i.OPENED) {
            A0();
        } else {
            B0();
        }
        if (rational != null) {
            this.f41819h.o0(rational);
        }
    }

    private boolean O(T.a aVar) {
        if (!aVar.m().isEmpty()) {
            AbstractC0700h0.l("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        Iterator it = this.f41812a.f().iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.T j10 = ((androidx.camera.core.impl.V0) it.next()).j();
            List i10 = j10.i();
            if (!i10.isEmpty()) {
                if (j10.h() != 0) {
                    aVar.u(j10.h());
                }
                if (j10.l() != 0) {
                    aVar.x(j10.l());
                }
                Iterator it2 = i10.iterator();
                while (it2.hasNext()) {
                    aVar.f((AbstractC1429c0) it2.next());
                }
            }
        }
        if (!aVar.m().isEmpty()) {
            return true;
        }
        AbstractC0700h0.l("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public void l0(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (this.f41812a.o(kVar.h())) {
                this.f41812a.t(kVar.h());
                arrayList.add(kVar.h());
                if (kVar.i() == A.r0.class) {
                    z10 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        U("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z10) {
            this.f41819h.o0(null);
        }
        N();
        if (this.f41812a.i().isEmpty()) {
            this.f41819h.q0(false);
        } else {
            S0();
        }
        if (this.f41812a.h().isEmpty()) {
            this.f41819h.B();
            F0(false);
            this.f41819h.n0(false);
            this.f41824m = v0();
            Q();
            return;
        }
        R0();
        F0(false);
        if (this.f41816e == i.OPENED) {
            A0();
        }
    }

    private void Q() {
        U("Closing camera.");
        switch (this.f41816e.ordinal()) {
            case 3:
                y0.f.i(this.f41822k == null);
                H0(i.INITIALIZED);
                break;
            case 4:
            default:
                U("close() ignored due to being in state: " + this.f41816e);
                break;
            case 5:
            case 6:
            case 7:
                if (!this.f41820i.a() && !this.f41811X.c()) {
                    r1 = false;
                }
                this.f41811X.a();
                H0(i.CLOSING);
                if (r1) {
                    y0.f.i(e0());
                    S();
                    break;
                }
                break;
            case 8:
            case 9:
                H0(i.CLOSING);
                P(false);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h8.d R(CameraDevice cameraDevice) {
        final C4527a1 c4527a1 = new C4527a1(this.f41809J);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(HVFrameRecorder.VIDEO_HEIGHT, HVFrameRecorder.VIDEO_WIDTH);
        final Surface surface = new Surface(surfaceTexture);
        final C1460s0 c1460s0 = new C1460s0(surface);
        c1460s0.k().e(new Runnable() { // from class: t.D
            @Override // java.lang.Runnable
            public final void run() {
                M.i0(surface, surfaceTexture);
            }
        }, F.c.b());
        V0.b bVar = new V0.b();
        bVar.h(c1460s0);
        bVar.z(1);
        U("Start configAndClose.");
        return G.d.a(G.n.I(c4527a1.d(bVar.o(), cameraDevice, this.f41802C.a()))).f(new G.a() { // from class: t.E
            @Override // G.a
            public final h8.d apply(Object obj) {
                h8.d j02;
                j02 = M.j0(C4527a1.this, c1460s0, (Void) obj);
                return j02;
            }
        }, this.f41814c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        y0.f.i(this.f41816e == i.RELEASING || this.f41816e == i.CLOSING);
        y0.f.i(this.f41827p.isEmpty());
        if (!this.f41835x) {
            X();
            return;
        }
        if (this.f41836y) {
            U("Ignored since configAndClose is processing");
            return;
        }
        if (!this.f41829r.b()) {
            this.f41835x = false;
            X();
            U("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            U("Open camera to configAndClose");
            h8.d y02 = y0();
            this.f41836y = true;
            y02.e(new Runnable() { // from class: t.G
                @Override // java.lang.Runnable
                public final void run() {
                    M.this.k0();
                }
            }, this.f41814c);
        }
    }

    private void S0() {
        Iterator it = this.f41812a.i().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= ((androidx.camera.core.impl.l1) it.next()).w(false);
        }
        this.f41819h.q0(z10);
    }

    private CameraDevice.StateCallback T() {
        ArrayList arrayList = new ArrayList(this.f41812a.g().c().c());
        arrayList.add(this.f41801B.c());
        arrayList.add(this.f41820i);
        return L0.a(arrayList);
    }

    private void V(String str, Throwable th) {
        AbstractC0700h0.b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th);
    }

    private int Y() {
        synchronized (this.f41805F) {
            try {
                return this.f41831t.a() == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static List Z(A.J0 j02) {
        if (j02.g() == null) {
            return null;
        }
        return Q.h.i0(j02);
    }

    static String a0(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    static String b0(F1 f12) {
        return f12.f() + f12.hashCode();
    }

    static String c0(A.J0 j02) {
        return j02.o() + j02.hashCode();
    }

    private boolean f0() {
        ArrayList arrayList = new ArrayList();
        int Y10 = Y();
        for (k1.b bVar : this.f41812a.j()) {
            if (bVar.c() == null || bVar.c().get(0) != m1.b.METERING_REPEATING) {
                if (bVar.e() == null || bVar.c() == null) {
                    AbstractC0700h0.l("Camera2CameraImpl", "Invalid stream spec or capture types in " + bVar);
                    return false;
                }
                androidx.camera.core.impl.V0 d10 = bVar.d();
                androidx.camera.core.impl.l1 f10 = bVar.f();
                for (AbstractC1429c0 abstractC1429c0 : d10.n()) {
                    arrayList.add(AbstractC1424a.a(this.f41810K.M(Y10, f10.p(), abstractC1429c0.h()), f10.p(), abstractC1429c0.h(), bVar.e().b(), bVar.c(), bVar.e().d(), f10.I(null)));
                }
            }
        }
        y0.f.g(this.f41800A);
        HashMap hashMap = new HashMap();
        hashMap.put(this.f41800A.i(), Collections.singletonList(this.f41800A.e()));
        try {
            this.f41810K.A(Y10, arrayList, hashMap, false, false);
            U("Surface combination with metering repeating supported!");
            return true;
        } catch (IllegalArgumentException e10) {
            V("Surface combination with metering repeating  not supported!", e10);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0() {
        if (d0()) {
            G0(b0(this.f41800A), this.f41800A.h(), this.f41800A.i(), null, Collections.singletonList(m1.b.METERING_REPEATING));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h0(List list) {
        try {
            N0(list);
        } finally {
            this.f41819h.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i0(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h8.d j0(C4527a1 c4527a1, AbstractC1429c0 abstractC1429c0, Void r22) {
        c4527a1.close();
        abstractC1429c0.d();
        return c4527a1.b(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0() {
        this.f41836y = false;
        this.f41835x = false;
        U("OpenCameraConfigAndClose is done, state: " + this.f41816e);
        int ordinal = this.f41816e.ordinal();
        if (ordinal == 1 || ordinal == 4) {
            y0.f.i(e0());
            X();
            return;
        }
        if (ordinal != 6) {
            U("OpenCameraConfigAndClose finished while in state: " + this.f41816e);
            return;
        }
        if (this.f41823l == 0) {
            Q0(false);
            return;
        }
        U("OpenCameraConfigAndClose in error: " + a0(this.f41823l));
        this.f41820i.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0(c.a aVar) {
        F1 f12 = this.f41800A;
        if (f12 == null) {
            aVar.c(Boolean.FALSE);
        } else {
            aVar.c(Boolean.valueOf(this.f41812a.o(b0(f12))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n0(final c.a aVar) {
        try {
            this.f41814c.execute(new Runnable() { // from class: t.F
                @Override // java.lang.Runnable
                public final void run() {
                    M.this.m0(aVar);
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            aVar.f(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0(String str, androidx.camera.core.impl.V0 v02, androidx.camera.core.impl.l1 l1Var, androidx.camera.core.impl.Z0 z02, List list) {
        U("Use case " + str + " ACTIVE");
        this.f41812a.u(str, v02, l1Var, z02, list);
        this.f41812a.y(str, v02, l1Var, z02, list);
        R0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0(String str) {
        U("Use case " + str + " INACTIVE");
        this.f41812a.x(str);
        R0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(String str, androidx.camera.core.impl.V0 v02, androidx.camera.core.impl.l1 l1Var, androidx.camera.core.impl.Z0 z02, List list) {
        U("Use case " + str + " UPDATED");
        this.f41812a.y(str, v02, l1Var, z02, list);
        R0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r0(c.a aVar) {
        try {
            ArrayList arrayList = new ArrayList(this.f41812a.g().c().c());
            arrayList.add(this.f41801B.c());
            arrayList.add(new b(aVar));
            this.f41813b.f(this.f41821j.f(), this.f41814c, L0.a(arrayList));
            return "configAndCloseTask";
        } catch (SecurityException | C4844h e10) {
            V("Unable to open camera for configAndClose: " + e10.getMessage(), e10);
            aVar.f(e10);
            return "configAndCloseTask";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s0(V0.d dVar, androidx.camera.core.impl.V0 v02) {
        dVar.a(v02, V0.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(String str, androidx.camera.core.impl.V0 v02, androidx.camera.core.impl.l1 l1Var, androidx.camera.core.impl.Z0 z02, List list) {
        U("Use case " + str + " RESET");
        this.f41812a.y(str, v02, l1Var, z02, list);
        N();
        F0(false);
        R0();
        if (this.f41816e == i.OPENED) {
            A0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0(boolean z10) {
        this.f41806G = z10;
        if (z10 && this.f41816e == i.PENDING_OPEN) {
            P0(false);
        }
    }

    private InterfaceC4530b1 v0() {
        C4527a1 c4527a1;
        synchronized (this.f41805F) {
            c4527a1 = new C4527a1(this.f41809J, this.f41821j.p());
        }
        return c4527a1;
    }

    private void w0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A.J0 j02 = (A.J0) it.next();
            String c02 = c0(j02);
            if (!this.f41803D.contains(c02)) {
                this.f41803D.add(c02);
                j02.M();
                j02.K();
            }
        }
    }

    private void x0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A.J0 j02 = (A.J0) it.next();
            String c02 = c0(j02);
            if (this.f41803D.contains(c02)) {
                j02.N();
                this.f41803D.remove(c02);
            }
        }
    }

    private h8.d y0() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: t.B
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object r02;
                r02 = M.this.r0(aVar);
                return r02;
            }
        });
    }

    private void z0(boolean z10) {
        if (!z10) {
            this.f41820i.d();
        }
        this.f41820i.a();
        this.f41811X.a();
        U("Opening camera.");
        H0(i.OPENING);
        try {
            this.f41813b.f(this.f41821j.f(), this.f41814c, T());
        } catch (SecurityException e10) {
            U("Unable to open camera due to " + e10.getMessage());
            H0(i.REOPENING);
            this.f41820i.e();
        } catch (C4844h e11) {
            U("Unable to open camera due to " + e11.getMessage());
            if (e11.d() != 10001) {
                this.f41811X.d();
            } else {
                I0(i.INITIALIZED, AbstractC0715s.a.b(7, e11));
            }
        }
    }

    void A0() {
        y0.f.i(this.f41816e == i.OPENED);
        V0.h g10 = this.f41812a.g();
        if (!g10.e()) {
            U("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.f41832u.j(this.f41822k.getId(), this.f41831t.c(this.f41822k.getId()))) {
            U("Unable to create capture session in camera operating mode = " + this.f41831t.a());
            return;
        }
        HashMap hashMap = new HashMap();
        H1.m(this.f41812a.h(), this.f41812a.i(), hashMap);
        this.f41824m.i(hashMap);
        InterfaceC4530b1 interfaceC4530b1 = this.f41824m;
        G.n.j(interfaceC4530b1.d(g10.c(), (CameraDevice) y0.f.g(this.f41822k), this.f41802C.a()), new d(interfaceC4530b1), this.f41814c);
    }

    void C0(final androidx.camera.core.impl.V0 v02) {
        ScheduledExecutorService e10 = F.c.e();
        final V0.d d10 = v02.d();
        if (d10 != null) {
            V("Posting surface closed", new Throwable());
            e10.execute(new Runnable() { // from class: t.L
                @Override // java.lang.Runnable
                public final void run() {
                    M.s0(V0.d.this, v02);
                }
            });
        }
    }

    h8.d D0(InterfaceC4530b1 interfaceC4530b1, boolean z10) {
        interfaceC4530b1.close();
        h8.d b10 = interfaceC4530b1.b(z10);
        U("Releasing session in state " + this.f41816e.name());
        this.f41827p.put(interfaceC4530b1, b10);
        G.n.j(b10, new c(interfaceC4530b1), F.c.b());
        return b10;
    }

    void F0(boolean z10) {
        y0.f.i(this.f41824m != null);
        U("Resetting Capture Session");
        InterfaceC4530b1 interfaceC4530b1 = this.f41824m;
        androidx.camera.core.impl.V0 f10 = interfaceC4530b1.f();
        List c10 = interfaceC4530b1.c();
        InterfaceC4530b1 v02 = v0();
        this.f41824m = v02;
        v02.g(f10);
        this.f41824m.e(c10);
        if (this.f41816e.ordinal() != 8) {
            U("Skipping Capture Session state check due to current camera state: " + this.f41816e + " and previous session status: " + interfaceC4530b1.h());
        } else if (this.f41833v && interfaceC4530b1.h()) {
            U("Close camera before creating new session");
            H0(i.REOPENING_QUIRK);
        }
        if (this.f41834w && interfaceC4530b1.h()) {
            U("ConfigAndClose is required when close the camera.");
            this.f41835x = true;
        }
        D0(interfaceC4530b1, z10);
    }

    void H0(i iVar) {
        I0(iVar, null);
    }

    void I0(i iVar, AbstractC0715s.a aVar) {
        J0(iVar, aVar, true);
    }

    void J0(i iVar, AbstractC0715s.a aVar, boolean z10) {
        H.a aVar2;
        U("Transitioning camera internal state: " + this.f41816e + " --> " + iVar);
        M0(iVar, aVar);
        this.f41816e = iVar;
        switch (iVar) {
            case RELEASED:
                aVar2 = H.a.RELEASED;
                break;
            case RELEASING:
                aVar2 = H.a.RELEASING;
                break;
            case INITIALIZED:
                aVar2 = H.a.CLOSED;
                break;
            case PENDING_OPEN:
                aVar2 = H.a.PENDING_OPEN;
                break;
            case CLOSING:
            case REOPENING_QUIRK:
                aVar2 = H.a.CLOSING;
                break;
            case REOPENING:
            case OPENING:
                aVar2 = H.a.OPENING;
                break;
            case OPENED:
                aVar2 = H.a.OPEN;
                break;
            case CONFIGURED:
                aVar2 = H.a.CONFIGURED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + iVar);
        }
        this.f41832u.e(this, aVar2, z10);
        this.f41817f.m(aVar2);
        this.f41818g.c(aVar2, aVar);
    }

    void K0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.T t10 = (androidx.camera.core.impl.T) it.next();
            T.a k10 = T.a.k(t10);
            if (t10.k() == 5 && t10.d() != null) {
                k10.p(t10.d());
            }
            if (!t10.i().isEmpty() || !t10.m() || O(k10)) {
                arrayList.add(k10.h());
            }
        }
        U("Issue capture request");
        this.f41824m.e(arrayList);
    }

    void M0(i iVar, AbstractC0715s.a aVar) {
        if (AbstractC3901a.h()) {
            AbstractC3901a.j("CX:C2State[" + this + "]", iVar.ordinal());
            if (aVar != null) {
                this.f41828q++;
            }
            if (this.f41828q > 0) {
                AbstractC3901a.j("CX:C2StateErrorCode[" + this + "]", aVar != null ? aVar.d() : 0);
            }
        }
    }

    void P(boolean z10) {
        y0.f.j(this.f41816e == i.CLOSING || this.f41816e == i.RELEASING || (this.f41816e == i.REOPENING && this.f41823l != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f41816e + " (error: " + a0(this.f41823l) + ")");
        F0(z10);
        this.f41824m.a();
    }

    void P0(boolean z10) {
        U("Attempting to force open the camera.");
        if (this.f41832u.i(this)) {
            z0(z10);
        } else {
            U("No cameras available. Waiting for available camera before opening camera.");
            H0(i.PENDING_OPEN);
        }
    }

    void Q0(boolean z10) {
        U("Attempting to open the camera.");
        if (this.f41829r.b() && this.f41832u.i(this)) {
            z0(z10);
        } else {
            U("No cameras available. Waiting for available camera before opening camera.");
            H0(i.PENDING_OPEN);
        }
    }

    void R0() {
        V0.h e10 = this.f41812a.e();
        if (!e10.e()) {
            this.f41819h.m0();
            this.f41824m.g(this.f41819h.K());
            return;
        }
        this.f41819h.p0(e10.c().o());
        e10.b(this.f41819h.K());
        this.f41824m.g(e10.c());
    }

    void U(String str) {
        V(str, null);
    }

    androidx.camera.core.impl.V0 W(AbstractC1429c0 abstractC1429c0) {
        for (androidx.camera.core.impl.V0 v02 : this.f41812a.h()) {
            if (v02.n().contains(abstractC1429c0)) {
                return v02;
            }
        }
        return null;
    }

    void X() {
        y0.f.i(this.f41816e == i.RELEASING || this.f41816e == i.CLOSING);
        y0.f.i(this.f41827p.isEmpty());
        this.f41822k = null;
        if (this.f41816e == i.CLOSING) {
            H0(i.INITIALIZED);
            return;
        }
        this.f41813b.h(this.f41829r);
        H0(i.RELEASED);
        c.a aVar = this.f41826o;
        if (aVar != null) {
            aVar.c(null);
            this.f41826o = null;
        }
    }

    @Override // androidx.camera.core.impl.H
    public androidx.camera.core.impl.E0 b() {
        return this.f41817f;
    }

    @Override // A.J0.b
    public void d(A.J0 j02) {
        y0.f.g(j02);
        final String c02 = c0(j02);
        this.f41814c.execute(new Runnable() { // from class: t.J
            @Override // java.lang.Runnable
            public final void run() {
                M.this.p0(c02);
            }
        });
    }

    boolean d0() {
        try {
            return ((Boolean) androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: t.x
                @Override // androidx.concurrent.futures.c.InterfaceC0253c
                public final Object a(c.a aVar) {
                    Object n02;
                    n02 = M.this.n0(aVar);
                    return n02;
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e10);
        }
    }

    boolean e0() {
        return this.f41827p.isEmpty();
    }

    @Override // A.J0.b
    public void f(A.J0 j02) {
        y0.f.g(j02);
        G0(c0(j02), this.f41837z ? j02.w() : j02.u(), j02.j(), j02.e(), Z(j02));
    }

    @Override // androidx.camera.core.impl.H
    public void g(InterfaceC1473z interfaceC1473z) {
        if (interfaceC1473z == null) {
            interfaceC1473z = androidx.camera.core.impl.C.a();
        }
        interfaceC1473z.Y(null);
        this.f41804E = interfaceC1473z;
        synchronized (this.f41805F) {
        }
    }

    @Override // androidx.camera.core.impl.H
    public androidx.camera.core.impl.D h() {
        return this.f41819h;
    }

    @Override // androidx.camera.core.impl.H
    public InterfaceC1473z i() {
        return this.f41804E;
    }

    @Override // A.J0.b
    public void j(A.J0 j02) {
        y0.f.g(j02);
        final String c02 = c0(j02);
        final androidx.camera.core.impl.V0 w10 = this.f41837z ? j02.w() : j02.u();
        final androidx.camera.core.impl.l1 j10 = j02.j();
        final androidx.camera.core.impl.Z0 e10 = j02.e();
        final List Z10 = Z(j02);
        this.f41814c.execute(new Runnable() { // from class: t.I
            @Override // java.lang.Runnable
            public final void run() {
                M.this.q0(c02, w10, j10, e10, Z10);
            }
        });
    }

    @Override // A.J0.b
    public void k(A.J0 j02) {
        y0.f.g(j02);
        final String c02 = c0(j02);
        final androidx.camera.core.impl.V0 w10 = this.f41837z ? j02.w() : j02.u();
        final androidx.camera.core.impl.l1 j10 = j02.j();
        final androidx.camera.core.impl.Z0 e10 = j02.e();
        final List Z10 = Z(j02);
        this.f41814c.execute(new Runnable() { // from class: t.K
            @Override // java.lang.Runnable
            public final void run() {
                M.this.o0(c02, w10, j10, e10, Z10);
            }
        });
    }

    @Override // androidx.camera.core.impl.H
    public void l(final boolean z10) {
        this.f41814c.execute(new Runnable() { // from class: t.A
            @Override // java.lang.Runnable
            public final void run() {
                M.this.u0(z10);
            }
        });
    }

    @Override // androidx.camera.core.impl.H
    public void m(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f41819h.U();
        w0(new ArrayList(arrayList));
        final ArrayList arrayList2 = new ArrayList(L0(arrayList));
        try {
            this.f41814c.execute(new Runnable() { // from class: t.H
                @Override // java.lang.Runnable
                public final void run() {
                    M.this.h0(arrayList2);
                }
            });
        } catch (RejectedExecutionException e10) {
            V("Unable to attach use cases.", e10);
            this.f41819h.B();
        }
    }

    @Override // androidx.camera.core.impl.H
    public void n(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(L0(arrayList));
        x0(new ArrayList(arrayList));
        this.f41814c.execute(new Runnable() { // from class: t.y
            @Override // java.lang.Runnable
            public final void run() {
                M.this.l0(arrayList2);
            }
        });
    }

    @Override // androidx.camera.core.impl.H
    public void p(boolean z10) {
        this.f41837z = z10;
    }

    @Override // androidx.camera.core.impl.H
    public androidx.camera.core.impl.G q() {
        return this.f41821j;
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f41821j.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    class h {

        /* renamed from: a, reason: collision with root package name */
        private a f41850a;

        /* JADX INFO: Access modifiers changed from: private */
        class a {

            /* renamed from: a, reason: collision with root package name */
            private final ScheduledFuture f41852a;

            /* renamed from: b, reason: collision with root package name */
            private final AtomicBoolean f41853b = new AtomicBoolean(false);

            a() {
                this.f41852a = M.this.f41815d.schedule(new Runnable() { // from class: t.O
                    @Override // java.lang.Runnable
                    public final void run() {
                        M.h.a.this.d();
                    }
                }, 2000L, TimeUnit.MILLISECONDS);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void d() {
                if (this.f41853b.getAndSet(true)) {
                    return;
                }
                M.this.f41814c.execute(new Runnable() { // from class: t.P
                    @Override // java.lang.Runnable
                    public final void run() {
                        M.h.a.this.e();
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void e() {
                if (M.this.f41816e == i.OPENING) {
                    M.this.U("Camera onError timeout, reopen it.");
                    M.this.H0(i.REOPENING);
                    M.this.f41820i.e();
                } else {
                    M.this.U("Camera skip reopen at state: " + M.this.f41816e);
                }
            }

            public void c() {
                this.f41853b.set(true);
                this.f41852a.cancel(true);
            }

            public boolean f() {
                return this.f41853b.get();
            }
        }

        private h() {
            this.f41850a = null;
        }

        public void a() {
            a aVar = this.f41850a;
            if (aVar != null) {
                aVar.c();
            }
            this.f41850a = null;
        }

        public void b() {
            M.this.U("Camera receive onErrorCallback");
            a();
        }

        public boolean c() {
            a aVar = this.f41850a;
            return (aVar == null || aVar.f()) ? false : true;
        }

        public void d() {
            if (M.this.f41816e != i.OPENING) {
                M.this.U("Don't need the onError timeout handler.");
                return;
            }
            M.this.U("Camera waiting for onError.");
            a();
            this.f41850a = new a();
        }

        /* synthetic */ h(M m10, a aVar) {
            this();
        }
    }

    class c implements G.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4530b1 f41841a;

        c(InterfaceC4530b1 interfaceC4530b1) {
            this.f41841a = interfaceC4530b1;
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            M.this.f41827p.remove(this.f41841a);
            int ordinal = M.this.f41816e.ordinal();
            if (ordinal != 1 && ordinal != 4) {
                if (ordinal != 5 && (ordinal != 6 || M.this.f41823l == 0)) {
                    return;
                } else {
                    M.this.U("Camera reopen required. Checking if the current camera can be closed safely.");
                }
            }
            if (M.this.e0()) {
                M m10 = M.this;
                if (m10.f41822k != null) {
                    m10.U("closing camera");
                    AbstractC4837a.a(M.this.f41822k);
                    M.this.f41822k = null;
                }
            }
        }

        @Override // G.c
        public void onFailure(Throwable th) {
        }
    }
}
