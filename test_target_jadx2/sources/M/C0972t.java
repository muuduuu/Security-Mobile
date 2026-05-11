package M;

import A.AbstractC0700h0;
import A.I0;
import A.x0;
import O.d;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import androidx.concurrent.futures.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC3735a;
import y0.InterfaceC5159a;

/* renamed from: M.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0972t implements P, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    private final x f5931a;

    /* renamed from: b, reason: collision with root package name */
    final HandlerThread f5932b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f5933c;

    /* renamed from: d, reason: collision with root package name */
    final Handler f5934d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f5935e;

    /* renamed from: f, reason: collision with root package name */
    private final float[] f5936f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f5937g;

    /* renamed from: h, reason: collision with root package name */
    final Map f5938h;

    /* renamed from: i, reason: collision with root package name */
    private int f5939i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f5940j;

    /* renamed from: k, reason: collision with root package name */
    private final List f5941k;

    /* renamed from: M.t$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static InterfaceC3735a f5942a = new InterfaceC3735a() { // from class: M.s
            @Override // o.InterfaceC3735a
            public final Object apply(Object obj) {
                return new C0972t((A.B) obj);
            }
        };

        public static P a(A.B b10) {
            return (P) f5942a.apply(b10);
        }
    }

    /* renamed from: M.t$b */
    static abstract class b {
        b() {
        }

        static C0954a d(int i10, int i11, c.a aVar) {
            return new C0954a(i10, i11, aVar);
        }

        abstract c.a a();

        abstract int b();

        abstract int c();
    }

    C0972t(A.B b10) {
        this(b10, Collections.emptyMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(A.B b10, Map map, c.a aVar) {
        try {
            this.f5931a.h(b10, map);
            aVar.c(null);
        } catch (RuntimeException e10) {
            aVar.f(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(I0 i02, I0.h hVar) {
        d.e eVar = d.e.DEFAULT;
        if (i02.n().d() && hVar.e()) {
            eVar = d.e.YUV;
        }
        this.f5931a.o(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(I0 i02, SurfaceTexture surfaceTexture, Surface surface, I0.g gVar) {
        i02.k();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        this.f5939i--;
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(final I0 i02) {
        this.f5939i++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(this.f5931a.g());
        surfaceTexture.setDefaultBufferSize(i02.p().getWidth(), i02.p().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        i02.E(this.f5933c, new I0.i() { // from class: M.p
            @Override // A.I0.i
            public final void a(I0.h hVar) {
                C0972t.this.B(i02, hVar);
            }
        });
        i02.D(surface, this.f5933c, new InterfaceC5159a() { // from class: M.q
            @Override // y0.InterfaceC5159a
            public final void accept(Object obj) {
                C0972t.this.C(i02, surfaceTexture, surface, (I0.g) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(this, this.f5934d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(x0 x0Var, x0.b bVar) {
        x0Var.close();
        Surface surface = (Surface) this.f5938h.remove(x0Var);
        if (surface != null) {
            this.f5931a.r(surface);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(final x0 x0Var) {
        Surface v02 = x0Var.v0(this.f5933c, new InterfaceC5159a() { // from class: M.o
            @Override // y0.InterfaceC5159a
            public final void accept(Object obj) {
                C0972t.this.E(x0Var, (x0.b) obj);
            }
        });
        this.f5931a.j(v02);
        this.f5938h.put(x0Var, v02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        this.f5940j = true;
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(b bVar) {
        this.f5941k.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I(c.a aVar) {
        aVar.f(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object J(int i10, int i11, final c.a aVar) {
        final C0954a d10 = b.d(i10, i11, aVar);
        t(new Runnable() { // from class: M.h
            @Override // java.lang.Runnable
            public final void run() {
                C0972t.this.H(d10);
            }
        }, new Runnable() { // from class: M.i
            @Override // java.lang.Runnable
            public final void run() {
                C0972t.I(c.a.this);
            }
        });
        return "DefaultSurfaceProcessor#snapshot";
    }

    private void K(lc.s sVar) {
        if (this.f5941k.isEmpty()) {
            return;
        }
        if (sVar == null) {
            u(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = this.f5941k.iterator();
                int i10 = -1;
                int i11 = -1;
                Bitmap bitmap = null;
                byte[] bArr = null;
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (i10 != bVar.c() || bitmap == null) {
                        i10 = bVar.c();
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        bitmap = v((Size) sVar.e(), (float[]) sVar.f(), i10);
                        i11 = -1;
                    }
                    if (i11 != bVar.b()) {
                        byteArrayOutputStream.reset();
                        i11 = bVar.b();
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i11, byteArrayOutputStream);
                        bArr = byteArrayOutputStream.toByteArray();
                    }
                    Surface surface = (Surface) sVar.d();
                    Objects.requireNonNull(bArr);
                    ImageProcessingUtil.q(surface, bArr);
                    bVar.a().c(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e10) {
            u(e10);
        }
    }

    private void r() {
        if (this.f5940j && this.f5939i == 0) {
            Iterator it = this.f5938h.keySet().iterator();
            while (it.hasNext()) {
                ((x0) it.next()).close();
            }
            Iterator it2 = this.f5941k.iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).a().f(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.f5938h.clear();
            this.f5931a.k();
            this.f5932b.quit();
        }
    }

    private void s(Runnable runnable) {
        t(runnable, new Runnable() { // from class: M.e
            @Override // java.lang.Runnable
            public final void run() {
                C0972t.x();
            }
        });
    }

    private void t(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f5933c.execute(new Runnable() { // from class: M.f
                @Override // java.lang.Runnable
                public final void run() {
                    C0972t.this.y(runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e10) {
            AbstractC0700h0.m("DefaultSurfaceProcessor", "Unable to executor runnable", e10);
            runnable2.run();
        }
    }

    private void u(Throwable th) {
        Iterator it = this.f5941k.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a().f(th);
        }
        this.f5941k.clear();
    }

    private Bitmap v(Size size, float[] fArr, int i10) {
        float[] fArr2 = (float[]) fArr.clone();
        E.n.c(fArr2, i10, 0.5f, 0.5f);
        E.n.d(fArr2, 0.5f);
        return this.f5931a.p(E.r.p(size, i10), fArr2);
    }

    private void w(final A.B b10, final Map map) {
        try {
            androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: M.d
                @Override // androidx.concurrent.futures.c.InterfaceC0253c
                public final Object a(c.a aVar) {
                    Object z10;
                    z10 = C0972t.this.z(b10, map, aVar);
                    return z10;
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
    public /* synthetic */ void y(Runnable runnable, Runnable runnable2) {
        if (this.f5940j) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object z(final A.B b10, final Map map, final c.a aVar) {
        s(new Runnable() { // from class: M.r
            @Override // java.lang.Runnable
            public final void run() {
                C0972t.this.A(b10, map, aVar);
            }
        });
        return "Init GlRenderer";
    }

    @Override // M.P
    public void a() {
        if (this.f5935e.getAndSet(true)) {
            return;
        }
        s(new Runnable() { // from class: M.n
            @Override // java.lang.Runnable
            public final void run() {
                C0972t.this.G();
            }
        });
    }

    @Override // A.y0
    public void b(final x0 x0Var) {
        if (this.f5935e.get()) {
            x0Var.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: M.j
            @Override // java.lang.Runnable
            public final void run() {
                C0972t.this.F(x0Var);
            }
        };
        Objects.requireNonNull(x0Var);
        t(runnable, new RunnableC0964k(x0Var));
    }

    @Override // M.P
    public h8.d c(final int i10, final int i11) {
        return G.n.B(androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: M.g
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object J10;
                J10 = C0972t.this.J(i10, i11, aVar);
                return J10;
            }
        }));
    }

    @Override // A.y0
    public void d(final I0 i02) {
        if (this.f5935e.get()) {
            i02.G();
            return;
        }
        Runnable runnable = new Runnable() { // from class: M.l
            @Override // java.lang.Runnable
            public final void run() {
                C0972t.this.D(i02);
            }
        };
        Objects.requireNonNull(i02);
        t(runnable, new RunnableC0966m(i02));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.f5935e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.f5936f);
        lc.s sVar = null;
        for (Map.Entry entry : this.f5938h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            x0 x0Var = (x0) entry.getKey();
            x0Var.d0(this.f5937g, this.f5936f);
            if (x0Var.getFormat() == 34) {
                try {
                    this.f5931a.n(surfaceTexture.getTimestamp(), this.f5937g, surface);
                } catch (RuntimeException e10) {
                    AbstractC0700h0.d("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e10);
                }
            } else {
                y0.f.j(x0Var.getFormat() == 256, "Unsupported format: " + x0Var.getFormat());
                y0.f.j(sVar == null, "Only one JPEG output is supported.");
                sVar = new lc.s(surface, x0Var.k(), (float[]) this.f5937g.clone());
            }
        }
        try {
            K(sVar);
        } catch (RuntimeException e11) {
            u(e11);
        }
    }

    C0972t(A.B b10, Map map) {
        this.f5935e = new AtomicBoolean(false);
        this.f5936f = new float[16];
        this.f5937g = new float[16];
        this.f5938h = new LinkedHashMap();
        this.f5939i = 0;
        this.f5940j = false;
        this.f5941k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f5932b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f5934d = handler;
        this.f5933c = F.c.f(handler);
        this.f5931a = new x();
        try {
            w(b10, map);
        } catch (RuntimeException e10) {
            a();
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x() {
    }
}
