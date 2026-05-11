package N;

import A.AbstractC0700h0;
import A.B;
import A.C0698g0;
import A.I0;
import A.x0;
import M.P;
import M.RunnableC0964k;
import M.RunnableC0966m;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import wc.InterfaceC5068n;
import y0.InterfaceC5159a;

/* loaded from: classes.dex */
public class o implements P, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    private final c f6498a;

    /* renamed from: b, reason: collision with root package name */
    final HandlerThread f6499b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f6500c;

    /* renamed from: d, reason: collision with root package name */
    final Handler f6501d;

    /* renamed from: e, reason: collision with root package name */
    private int f6502e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6503f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f6504g;

    /* renamed from: h, reason: collision with root package name */
    final Map f6505h;

    /* renamed from: i, reason: collision with root package name */
    private SurfaceTexture f6506i;

    /* renamed from: j, reason: collision with root package name */
    private SurfaceTexture f6507j;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static InterfaceC5068n f6508a = new InterfaceC5068n() { // from class: N.n
            @Override // wc.InterfaceC5068n
            public final Object n(Object obj, Object obj2, Object obj3) {
                return new o((B) obj, (C0698g0) obj2, (C0698g0) obj3);
            }
        };

        public static P a(B b10, C0698g0 c0698g0, C0698g0 c0698g02) {
            return (P) f6508a.n(b10, c0698g0, c0698g02);
        }
    }

    o(B b10, C0698g0 c0698g0, C0698g0 c0698g02) {
        this(b10, Collections.emptyMap(), c0698g0, c0698g02);
    }

    private void n() {
        if (this.f6503f && this.f6502e == 0) {
            Iterator it = this.f6505h.keySet().iterator();
            while (it.hasNext()) {
                ((x0) it.next()).close();
            }
            this.f6505h.clear();
            this.f6498a.k();
            this.f6499b.quit();
        }
    }

    private void o(Runnable runnable) {
        p(runnable, new Runnable() { // from class: N.l
            @Override // java.lang.Runnable
            public final void run() {
                o.r();
            }
        });
    }

    private void p(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f6500c.execute(new Runnable() { // from class: N.k
                @Override // java.lang.Runnable
                public final void run() {
                    o.this.s(runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e10) {
            AbstractC0700h0.m("DualSurfaceProcessor", "Unable to executor runnable", e10);
            runnable2.run();
        }
    }

    private void q(final B b10, final Map map) {
        try {
            androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: N.g
                @Override // androidx.concurrent.futures.c.InterfaceC0253c
                public final Object a(c.a aVar) {
                    Object u10;
                    u10 = o.this.u(b10, map, aVar);
                    return u10;
                }
            }).get();
        } catch (InterruptedException | ExecutionException e10) {
            e = e10;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (!(e instanceof RuntimeException)) {
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
            throw ((RuntimeException) e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(Runnable runnable, Runnable runnable2) {
        if (this.f6503f) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(B b10, Map map, c.a aVar) {
        try {
            this.f6498a.h(b10, map);
            aVar.c(null);
        } catch (RuntimeException e10) {
            aVar.f(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object u(final B b10, final Map map, final c.a aVar) {
        o(new Runnable() { // from class: N.i
            @Override // java.lang.Runnable
            public final void run() {
                o.this.t(b10, map, aVar);
            }
        });
        return "Init GlRenderer";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(SurfaceTexture surfaceTexture, Surface surface, I0.g gVar) {
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        this.f6502e--;
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(I0 i02) {
        this.f6502e++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(this.f6498a.t(i02.s()));
        surfaceTexture.setDefaultBufferSize(i02.p().getWidth(), i02.p().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        i02.D(surface, this.f6500c, new InterfaceC5159a() { // from class: N.m
            @Override // y0.InterfaceC5159a
            public final void accept(Object obj) {
                o.this.v(surfaceTexture, surface, (I0.g) obj);
            }
        });
        if (i02.s()) {
            this.f6506i = surfaceTexture;
        } else {
            this.f6507j = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this, this.f6501d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(x0 x0Var, x0.b bVar) {
        x0Var.close();
        Surface surface = (Surface) this.f6505h.remove(x0Var);
        if (surface != null) {
            this.f6498a.r(surface);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(final x0 x0Var) {
        Surface v02 = x0Var.v0(this.f6500c, new InterfaceC5159a() { // from class: N.j
            @Override // y0.InterfaceC5159a
            public final void accept(Object obj) {
                o.this.x(x0Var, (x0.b) obj);
            }
        });
        this.f6498a.j(v02);
        this.f6505h.put(x0Var, v02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        this.f6503f = true;
        n();
    }

    @Override // M.P
    public void a() {
        if (this.f6504g.getAndSet(true)) {
            return;
        }
        o(new Runnable() { // from class: N.e
            @Override // java.lang.Runnable
            public final void run() {
                o.this.z();
            }
        });
    }

    @Override // A.y0
    public void b(final x0 x0Var) {
        if (this.f6504g.get()) {
            x0Var.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: N.h
            @Override // java.lang.Runnable
            public final void run() {
                o.this.y(x0Var);
            }
        };
        Objects.requireNonNull(x0Var);
        p(runnable, new RunnableC0964k(x0Var));
    }

    @Override // A.y0
    public void d(final I0 i02) {
        if (this.f6504g.get()) {
            i02.G();
            return;
        }
        Runnable runnable = new Runnable() { // from class: N.f
            @Override // java.lang.Runnable
            public final void run() {
                o.this.w(i02);
            }
        };
        Objects.requireNonNull(i02);
        p(runnable, new RunnableC0966m(i02));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f6504g.get() || (surfaceTexture2 = this.f6506i) == null || this.f6507j == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f6507j.updateTexImage();
        for (Map.Entry entry : this.f6505h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            x0 x0Var = (x0) entry.getKey();
            if (x0Var.getFormat() == 34) {
                try {
                    this.f6498a.v(surfaceTexture.getTimestamp(), surface, x0Var, this.f6506i, this.f6507j);
                } catch (RuntimeException e10) {
                    AbstractC0700h0.d("DualSurfaceProcessor", "Failed to render with OpenGL.", e10);
                }
            }
        }
    }

    o(B b10, Map map, C0698g0 c0698g0, C0698g0 c0698g02) {
        this.f6502e = 0;
        this.f6503f = false;
        this.f6504g = new AtomicBoolean(false);
        this.f6505h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f6499b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f6501d = handler;
        this.f6500c = F.c.f(handler);
        this.f6498a = new c(c0698g0, c0698g02);
        try {
            q(b10, map);
        } catch (RuntimeException e10) {
            a();
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r() {
    }
}
