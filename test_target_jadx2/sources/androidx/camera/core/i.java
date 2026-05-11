package androidx.camera.core;

import A.AbstractC0694e0;
import A.AbstractC0700h0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.f;
import androidx.camera.core.impl.InterfaceC1458r0;
import androidx.concurrent.futures.c;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
abstract class i implements InterfaceC1458r0.a {

    /* renamed from: a, reason: collision with root package name */
    private f.a f14386a;

    /* renamed from: b, reason: collision with root package name */
    private volatile int f14387b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f14388c;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f14390e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f14391f;

    /* renamed from: g, reason: collision with root package name */
    private Executor f14392g;

    /* renamed from: h, reason: collision with root package name */
    private q f14393h;

    /* renamed from: i, reason: collision with root package name */
    private ImageWriter f14394i;

    /* renamed from: n, reason: collision with root package name */
    ByteBuffer f14399n;

    /* renamed from: o, reason: collision with root package name */
    ByteBuffer f14400o;

    /* renamed from: p, reason: collision with root package name */
    ByteBuffer f14401p;

    /* renamed from: q, reason: collision with root package name */
    ByteBuffer f14402q;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f14389d = 1;

    /* renamed from: j, reason: collision with root package name */
    private Rect f14395j = new Rect();

    /* renamed from: k, reason: collision with root package name */
    private Rect f14396k = new Rect();

    /* renamed from: l, reason: collision with root package name */
    private Matrix f14397l = new Matrix();

    /* renamed from: m, reason: collision with root package name */
    private Matrix f14398m = new Matrix();

    /* renamed from: r, reason: collision with root package name */
    private final Object f14403r = new Object();

    /* renamed from: s, reason: collision with root package name */
    protected boolean f14404s = true;

    i() {
    }

    private void h(n nVar) {
        if (this.f14389d != 1) {
            if (this.f14389d == 2 && this.f14399n == null) {
                this.f14399n = ByteBuffer.allocateDirect(nVar.getWidth() * nVar.getHeight() * 4);
                return;
            }
            return;
        }
        if (this.f14400o == null) {
            this.f14400o = ByteBuffer.allocateDirect(nVar.getWidth() * nVar.getHeight());
        }
        this.f14400o.position(0);
        if (this.f14401p == null) {
            this.f14401p = ByteBuffer.allocateDirect((nVar.getWidth() * nVar.getHeight()) / 4);
        }
        this.f14401p.position(0);
        if (this.f14402q == null) {
            this.f14402q = ByteBuffer.allocateDirect((nVar.getWidth() * nVar.getHeight()) / 4);
        }
        this.f14402q.position(0);
    }

    private static q i(int i10, int i11, int i12, int i13, int i14) {
        boolean z10 = i12 == 90 || i12 == 270;
        int i15 = z10 ? i11 : i10;
        if (!z10) {
            i10 = i11;
        }
        return new q(o.a(i15, i10, i13, i14));
    }

    static Matrix k(int i10, int i11, int i12, int i13, int i14) {
        Matrix matrix = new Matrix();
        if (i14 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i10, i11), E.r.f1866a, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i14);
            matrix.postConcat(E.r.c(new RectF(0.0f, 0.0f, i12, i13)));
        }
        return matrix;
    }

    static Rect l(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(n nVar, Matrix matrix, n nVar2, Rect rect, f.a aVar, c.a aVar2) {
        if (!this.f14404s) {
            aVar2.f(new androidx.core.os.l("ImageAnalysis is detached"));
            return;
        }
        r rVar = new r(nVar2, AbstractC0694e0.e(nVar.G().c(), nVar.G().a(), this.f14390e ? 0 : this.f14387b, matrix));
        if (!rect.isEmpty()) {
            rVar.j1(rect);
        }
        aVar.analyze(rVar);
        aVar2.c(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Executor executor, final n nVar, final Matrix matrix, final n nVar2, final Rect rect, final f.a aVar, final c.a aVar2) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.h
            @Override // java.lang.Runnable
            public final void run() {
                i.this.m(nVar, matrix, nVar2, rect, aVar, aVar2);
            }
        });
        return "analyzeImage";
    }

    private void p(int i10, int i11, int i12, int i13) {
        Matrix k10 = k(i10, i11, i12, i13, this.f14387b);
        this.f14396k = l(this.f14395j, k10);
        this.f14398m.setConcat(this.f14397l, k10);
    }

    private void q(n nVar, int i10) {
        q qVar = this.f14393h;
        if (qVar == null) {
            return;
        }
        qVar.m();
        this.f14393h = i(nVar.getWidth(), nVar.getHeight(), i10, this.f14393h.d(), this.f14393h.f());
        if (this.f14389d == 1) {
            ImageWriter imageWriter = this.f14394i;
            if (imageWriter != null) {
                I.a.a(imageWriter);
            }
            this.f14394i = I.a.c(this.f14393h.a(), this.f14393h.f());
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0.a
    public void a(InterfaceC1458r0 interfaceC1458r0) {
        try {
            n d10 = d(interfaceC1458r0);
            if (d10 != null) {
                o(d10);
            }
        } catch (IllegalStateException e10) {
            AbstractC0700h0.d("ImageAnalysisAnalyzer", "Failed to acquire image.", e10);
        }
    }

    abstract n d(InterfaceC1458r0 interfaceC1458r0);

    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    h8.d e(final n nVar) {
        final Executor executor;
        final f.a aVar;
        boolean z10;
        q qVar;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        n nVar2;
        int i10 = this.f14390e ? this.f14387b : 0;
        synchronized (this.f14403r) {
            try {
                executor = this.f14392g;
                aVar = this.f14386a;
                z10 = this.f14390e && i10 != this.f14388c;
                if (z10) {
                    q(nVar, i10);
                }
                if (this.f14390e) {
                    h(nVar);
                }
                qVar = this.f14393h;
                imageWriter = this.f14394i;
                byteBuffer = this.f14399n;
                byteBuffer2 = this.f14400o;
                byteBuffer3 = this.f14401p;
                byteBuffer4 = this.f14402q;
            } finally {
            }
        }
        if (aVar == null || executor == null || !this.f14404s) {
            return G.n.n(new androidx.core.os.l("No analyzer or executor currently set."));
        }
        if (qVar != null) {
            if (this.f14389d == 2) {
                nVar2 = ImageProcessingUtil.g(nVar, qVar, byteBuffer, i10, this.f14391f);
            } else if (this.f14389d == 1) {
                if (this.f14391f) {
                    ImageProcessingUtil.c(nVar);
                }
                if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                    nVar2 = ImageProcessingUtil.o(nVar, qVar, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i10);
                }
            }
            boolean z11 = nVar2 == null;
            final n nVar3 = !z11 ? nVar : nVar2;
            final Rect rect = new Rect();
            final Matrix matrix = new Matrix();
            synchronized (this.f14403r) {
                if (z10 && !z11) {
                    try {
                        p(nVar.getWidth(), nVar.getHeight(), nVar3.getWidth(), nVar3.getHeight());
                    } finally {
                    }
                }
                this.f14388c = i10;
                rect.set(this.f14396k);
                matrix.set(this.f14398m);
            }
            return androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: androidx.camera.core.g
                @Override // androidx.concurrent.futures.c.InterfaceC0253c
                public final Object a(c.a aVar2) {
                    Object n10;
                    n10 = i.this.n(executor, nVar, matrix, nVar3, rect, aVar, aVar2);
                    return n10;
                }
            });
        }
        nVar2 = null;
        if (nVar2 == null) {
        }
        if (!z11) {
        }
        final Rect rect2 = new Rect();
        final Matrix matrix2 = new Matrix();
        synchronized (this.f14403r) {
        }
    }

    void f() {
        this.f14404s = true;
    }

    abstract void g();

    void j() {
        this.f14404s = false;
        g();
    }

    abstract void o(n nVar);

    void r(Executor executor, f.a aVar) {
        if (aVar == null) {
            g();
        }
        synchronized (this.f14403r) {
            this.f14386a = aVar;
            this.f14392g = executor;
        }
    }

    void s(boolean z10) {
        this.f14391f = z10;
    }

    void t(int i10) {
        this.f14389d = i10;
    }

    void u(boolean z10) {
        this.f14390e = z10;
    }

    void v(q qVar) {
        synchronized (this.f14403r) {
            this.f14393h = qVar;
        }
    }

    void w(int i10) {
        this.f14387b = i10;
    }

    void x(Matrix matrix) {
        synchronized (this.f14403r) {
            this.f14397l = matrix;
            this.f14398m = new Matrix(this.f14397l);
        }
    }

    void y(Rect rect) {
        synchronized (this.f14403r) {
            this.f14395j = rect;
            this.f14396k = new Rect(this.f14395j);
        }
    }
}
