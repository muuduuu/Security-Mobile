package A;

import A.C0721y;
import A.u0;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.F;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.N0;
import androidx.camera.core.impl.Q;
import androidx.camera.core.impl.m1;
import androidx.concurrent.futures.c;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import o.InterfaceC3735a;
import q1.AbstractC3901a;

/* renamed from: A.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0720x {

    /* renamed from: o, reason: collision with root package name */
    private static final Object f260o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private static final SparseArray f261p = new SparseArray();

    /* renamed from: a, reason: collision with root package name */
    final androidx.camera.core.impl.L f262a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f263b;

    /* renamed from: c, reason: collision with root package name */
    private final C0721y f264c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f265d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f266e;

    /* renamed from: f, reason: collision with root package name */
    private final HandlerThread f267f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.camera.core.impl.F f268g;

    /* renamed from: h, reason: collision with root package name */
    private androidx.camera.core.impl.E f269h;

    /* renamed from: i, reason: collision with root package name */
    private m1 f270i;

    /* renamed from: j, reason: collision with root package name */
    private final u0 f271j;

    /* renamed from: k, reason: collision with root package name */
    private final h8.d f272k;

    /* renamed from: l, reason: collision with root package name */
    private a f273l;

    /* renamed from: m, reason: collision with root package name */
    private h8.d f274m;

    /* renamed from: n, reason: collision with root package name */
    private final Integer f275n;

    /* renamed from: A.x$a */
    private enum a {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public C0720x(Context context, C0721y.b bVar) {
        this(context, bVar, new N0());
    }

    private static C0721y.b g(Context context) {
        ComponentCallbacks2 b10 = E.f.b(context);
        if (b10 instanceof C0721y.b) {
            return (C0721y.b) b10;
        }
        try {
            Context a10 = E.f.a(context);
            Bundle bundle = a10.getPackageManager().getServiceInfo(new ComponentName(a10, (Class<?>) MetadataHolderService.class), HVFrameRecorder.VIDEO_HEIGHT).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (C0721y.b) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
            }
            AbstractC0700h0.c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            e = e10;
            AbstractC0700h0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (ClassNotFoundException e11) {
            e = e11;
            AbstractC0700h0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (IllegalAccessException e12) {
            e = e12;
            AbstractC0700h0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InstantiationException e13) {
            e = e13;
            AbstractC0700h0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NoSuchMethodException e14) {
            e = e14;
            AbstractC0700h0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NullPointerException e15) {
            e = e15;
            AbstractC0700h0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InvocationTargetException e16) {
            e = e16;
            AbstractC0700h0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    private static void j(Integer num) {
        synchronized (f260o) {
            try {
                if (num == null) {
                    return;
                }
                y0.f.c(num.intValue(), 3, 6, "minLogLevel");
                SparseArray sparseArray = f261p;
                sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + ((Integer) sparseArray.get(num.intValue())).intValue() : 1));
                r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void k(final Executor executor, final long j10, final int i10, final Context context, final c.a aVar) {
        executor.execute(new Runnable() { // from class: A.v
            @Override // java.lang.Runnable
            public final void run() {
                C0720x.this.n(context, executor, i10, aVar, j10);
            }
        });
    }

    private h8.d l(final Context context) {
        h8.d a10;
        synchronized (this.f263b) {
            y0.f.j(this.f273l == a.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.f273l = a.INITIALIZING;
            a10 = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: A.u
                @Override // androidx.concurrent.futures.c.InterfaceC0253c
                public final Object a(c.a aVar) {
                    Object o10;
                    o10 = C0720x.this.o(context, aVar);
                    return o10;
                }
            });
        }
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(Executor executor, long j10, int i10, Context context, c.a aVar) {
        k(executor, j10, i10 + 1, context, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void n(Context context, final Executor executor, final int i10, final c.a aVar, final long j10) {
        u0.c f10;
        F.a b02;
        AbstractC3901a.c("CX:initAndRetryRecursively");
        final Context a10 = E.f.a(context);
        try {
            try {
                b02 = this.f264c.b0(null);
            } catch (Throwable th) {
                AbstractC3901a.f();
                throw th;
            }
        } catch (C0696f0 e10) {
            e = e10;
            androidx.camera.core.impl.J j11 = new androidx.camera.core.impl.J(j10, i10, e);
            f10 = this.f271j.f(j11);
            q(j11);
            if (f10.d() || i10 >= Integer.MAX_VALUE) {
                synchronized (this.f263b) {
                    this.f273l = a.INITIALIZING_ERROR;
                }
                if (f10.c()) {
                    p();
                    aVar.c(null);
                } else if (e instanceof Q.b) {
                    String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((Q.b) e).a();
                    AbstractC0700h0.d("CameraX", str, e);
                    aVar.f(new C0696f0(new C0716t(3, str)));
                } else if (e instanceof C0696f0) {
                    aVar.f(e);
                } else {
                    aVar.f(new C0696f0(e));
                }
            } else {
                AbstractC0700h0.m("CameraX", "Retry init. Start time " + j10 + " current time " + SystemClock.elapsedRealtime(), e);
                androidx.core.os.h.b(this.f266e, new Runnable() { // from class: A.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0720x.this.m(executor, j10, i10, a10, aVar);
                    }
                }, "retry_token", f10.b());
            }
            AbstractC3901a.f();
        } catch (Q.b e11) {
            e = e11;
            androidx.camera.core.impl.J j112 = new androidx.camera.core.impl.J(j10, i10, e);
            f10 = this.f271j.f(j112);
            q(j112);
            if (f10.d()) {
            }
            synchronized (this.f263b) {
            }
        } catch (RuntimeException e12) {
            e = e12;
            androidx.camera.core.impl.J j1122 = new androidx.camera.core.impl.J(j10, i10, e);
            f10 = this.f271j.f(j1122);
            q(j1122);
            if (f10.d()) {
            }
            synchronized (this.f263b) {
            }
        }
        if (b02 == null) {
            throw new C0696f0(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
        }
        androidx.camera.core.impl.P a11 = androidx.camera.core.impl.P.a(this.f265d, this.f266e);
        r Z10 = this.f264c.Z(null);
        this.f268g = b02.a(a10, a11, Z10, this.f264c.c0());
        E.a e02 = this.f264c.e0(null);
        if (e02 == null) {
            throw new C0696f0(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
        }
        this.f269h = e02.a(a10, this.f268g.c(), this.f268g.a());
        m1.c h02 = this.f264c.h0(null);
        if (h02 == null) {
            throw new C0696f0(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
        }
        this.f270i = h02.a(a10);
        if (executor instanceof ExecutorC0711n) {
            ((ExecutorC0711n) executor).c(this.f268g);
        }
        this.f262a.b(this.f268g);
        androidx.camera.core.impl.Q.a(a10, this.f262a, Z10);
        if (i10 > 1) {
            q(null);
        }
        p();
        aVar.c(null);
        AbstractC3901a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Context context, c.a aVar) {
        k(this.f265d, SystemClock.elapsedRealtime(), 1, context, aVar);
        return "CameraX initInternal";
    }

    private void p() {
        synchronized (this.f263b) {
            this.f273l = a.INITIALIZED;
        }
    }

    private void q(u0.b bVar) {
        if (AbstractC3901a.h()) {
            AbstractC3901a.j("CX:CameraProvider-RetryStatus", bVar != null ? bVar.c() : -1);
        }
    }

    private static void r() {
        SparseArray sparseArray = f261p;
        if (sparseArray.size() == 0) {
            AbstractC0700h0.i();
            return;
        }
        if (sparseArray.get(3) != null) {
            AbstractC0700h0.j(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            AbstractC0700h0.j(4);
        } else if (sparseArray.get(5) != null) {
            AbstractC0700h0.j(5);
        } else if (sparseArray.get(6) != null) {
            AbstractC0700h0.j(6);
        }
    }

    private static void s(Context context, androidx.camera.core.impl.L0 l02, InterfaceC3735a interfaceC3735a) {
        if (l02 != null) {
            AbstractC0700h0.a("CameraX", "QuirkSettings from CameraXConfig: " + l02);
        } else {
            l02 = (androidx.camera.core.impl.L0) interfaceC3735a.apply(context);
            AbstractC0700h0.a("CameraX", "QuirkSettings from app metadata: " + l02);
        }
        if (l02 == null) {
            l02 = androidx.camera.core.impl.M0.f14434b;
            AbstractC0700h0.a("CameraX", "QuirkSettings by default: " + l02);
        }
        androidx.camera.core.impl.M0.b().d(l02);
    }

    public androidx.camera.core.impl.E d() {
        androidx.camera.core.impl.E e10 = this.f269h;
        if (e10 != null) {
            return e10;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public androidx.camera.core.impl.F e() {
        androidx.camera.core.impl.F f10 = this.f268g;
        if (f10 != null) {
            return f10;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public androidx.camera.core.impl.L f() {
        return this.f262a;
    }

    public m1 h() {
        m1 m1Var = this.f270i;
        if (m1Var != null) {
            return m1Var;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public h8.d i() {
        return this.f272k;
    }

    C0720x(Context context, C0721y.b bVar, InterfaceC3735a interfaceC3735a) {
        this.f262a = new androidx.camera.core.impl.L();
        this.f263b = new Object();
        this.f273l = a.UNINITIALIZED;
        this.f274m = G.n.p(null);
        if (bVar != null) {
            this.f264c = bVar.getCameraXConfig();
        } else {
            C0721y.b g10 = g(context);
            if (g10 == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            this.f264c = g10.getCameraXConfig();
        }
        s(context, this.f264c.f0(), interfaceC3735a);
        Executor a02 = this.f264c.a0(null);
        Handler g02 = this.f264c.g0(null);
        this.f265d = a02 == null ? new ExecutorC0711n() : a02;
        if (g02 == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f267f = handlerThread;
            handlerThread.start();
            this.f266e = androidx.core.os.h.a(handlerThread.getLooper());
        } else {
            this.f267f = null;
            this.f266e = g02;
        }
        Integer num = (Integer) this.f264c.f(C0721y.f281O, null);
        this.f275n = num;
        j(num);
        this.f271j = new u0.a(this.f264c.d0()).a();
        this.f272k = l(context);
    }
}
