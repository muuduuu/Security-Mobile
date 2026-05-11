package M;

import A.AbstractC0700h0;
import A.x0;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import y0.InterfaceC5159a;

/* loaded from: classes.dex */
final class O implements x0 {

    /* renamed from: b, reason: collision with root package name */
    private final Surface f5859b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5860c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5861d;

    /* renamed from: e, reason: collision with root package name */
    private final Size f5862e;

    /* renamed from: f, reason: collision with root package name */
    private final x0.a f5863f;

    /* renamed from: g, reason: collision with root package name */
    private final x0.a f5864g;

    /* renamed from: h, reason: collision with root package name */
    private final float[] f5865h;

    /* renamed from: i, reason: collision with root package name */
    private final float[] f5866i;

    /* renamed from: j, reason: collision with root package name */
    private final float[] f5867j;

    /* renamed from: k, reason: collision with root package name */
    private final float[] f5868k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC5159a f5869l;

    /* renamed from: m, reason: collision with root package name */
    private Executor f5870m;

    /* renamed from: p, reason: collision with root package name */
    private final h8.d f5873p;

    /* renamed from: q, reason: collision with root package name */
    private c.a f5874q;

    /* renamed from: r, reason: collision with root package name */
    private Matrix f5875r;

    /* renamed from: a, reason: collision with root package name */
    private final Object f5858a = new Object();

    /* renamed from: n, reason: collision with root package name */
    private boolean f5871n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f5872o = false;

    O(Surface surface, int i10, int i11, Size size, x0.a aVar, x0.a aVar2, Matrix matrix) {
        float[] fArr = new float[16];
        this.f5865h = fArr;
        float[] fArr2 = new float[16];
        this.f5866i = fArr2;
        float[] fArr3 = new float[16];
        this.f5867j = fArr3;
        float[] fArr4 = new float[16];
        this.f5868k = fArr4;
        this.f5859b = surface;
        this.f5860c = i10;
        this.f5861d = i11;
        this.f5862e = size;
        this.f5863f = aVar;
        this.f5864g = aVar2;
        this.f5875r = matrix;
        c(fArr, fArr3, aVar);
        c(fArr2, fArr4, aVar2);
        this.f5873p = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: M.M
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar3) {
                Object f10;
                f10 = O.this.f(aVar3);
                return f10;
            }
        });
    }

    private static void c(float[] fArr, float[] fArr2, x0.a aVar) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (aVar == null) {
            return;
        }
        E.n.d(fArr, 0.5f);
        E.n.c(fArr, aVar.e(), 0.5f, 0.5f);
        if (aVar.d()) {
            android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Matrix e10 = E.r.e(E.r.s(aVar.c()), E.r.s(E.r.p(aVar.c(), aVar.e())), aVar.e(), aVar.d());
        RectF rectF = new RectF(aVar.b());
        e10.mapRect(rectF);
        float width = rectF.left / r1.getWidth();
        float height = ((r1.getHeight() - rectF.height()) - rectF.top) / r1.getHeight();
        float width2 = rectF.width() / r1.getWidth();
        float height2 = rectF.height() / r1.getHeight();
        android.opengl.Matrix.translateM(fArr, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, width2, height2, 1.0f);
        d(fArr2, aVar.a());
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    private static void d(float[] fArr, androidx.camera.core.impl.H h10) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        E.n.d(fArr, 0.5f);
        if (h10 != null) {
            y0.f.j(h10.o(), "Camera has no transform.");
            E.n.c(fArr, h10.c().d(), 0.5f, 0.5f);
            if (h10.e()) {
                android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object f(c.a aVar) {
        this.f5874q = aVar;
        return "SurfaceOutputImpl close future complete";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(AtomicReference atomicReference) {
        ((InterfaceC5159a) atomicReference.get()).accept(x0.b.c(0, this));
    }

    @Override // A.x0
    public void c0(float[] fArr, float[] fArr2, boolean z10) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, z10 ? this.f5865h : this.f5866i, 0);
    }

    @Override // A.x0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f5858a) {
            try {
                if (!this.f5872o) {
                    this.f5872o = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f5874q.c(null);
    }

    @Override // A.x0
    public void d0(float[] fArr, float[] fArr2) {
        c0(fArr, fArr2, true);
    }

    public h8.d e() {
        return this.f5873p;
    }

    @Override // A.x0
    public int getFormat() {
        return this.f5861d;
    }

    public void i() {
        Executor executor;
        InterfaceC5159a interfaceC5159a;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f5858a) {
            try {
                if (this.f5870m != null && (interfaceC5159a = this.f5869l) != null) {
                    if (!this.f5872o) {
                        atomicReference.set(interfaceC5159a);
                        executor = this.f5870m;
                        this.f5871n = false;
                    }
                    executor = null;
                }
                this.f5871n = true;
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: M.N
                    @Override // java.lang.Runnable
                    public final void run() {
                        O.this.g(atomicReference);
                    }
                });
            } catch (RejectedExecutionException e10) {
                AbstractC0700h0.b("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e10);
            }
        }
    }

    @Override // A.x0
    public Size k() {
        return this.f5862e;
    }

    @Override // A.x0
    public Surface v0(Executor executor, InterfaceC5159a interfaceC5159a) {
        boolean z10;
        synchronized (this.f5858a) {
            this.f5870m = executor;
            this.f5869l = interfaceC5159a;
            z10 = this.f5871n;
        }
        if (z10) {
            i();
        }
        return this.f5859b;
    }
}
