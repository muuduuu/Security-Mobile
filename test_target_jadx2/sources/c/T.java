package C;

import A.W;
import C.f0;
import android.graphics.Bitmap;
import androidx.concurrent.futures.c;
import java.util.Objects;

/* loaded from: classes.dex */
public class T implements V {

    /* renamed from: a, reason: collision with root package name */
    private final f0 f626a;

    /* renamed from: b, reason: collision with root package name */
    private final f0.a f627b;

    /* renamed from: e, reason: collision with root package name */
    private c.a f630e;

    /* renamed from: f, reason: collision with root package name */
    private c.a f631f;

    /* renamed from: i, reason: collision with root package name */
    private h8.d f634i;

    /* renamed from: g, reason: collision with root package name */
    private boolean f632g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f633h = false;

    /* renamed from: c, reason: collision with root package name */
    private final h8.d f628c = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: C.Q
        @Override // androidx.concurrent.futures.c.InterfaceC0253c
        public final Object a(c.a aVar) {
            Object o10;
            o10 = T.this.o(aVar);
            return o10;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    private final h8.d f629d = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: C.S
        @Override // androidx.concurrent.futures.c.InterfaceC0253c
        public final Object a(c.a aVar) {
            Object p10;
            p10 = T.this.p(aVar);
            return p10;
        }
    });

    T(f0 f0Var, f0.a aVar) {
        this.f626a = f0Var;
        this.f627b = aVar;
    }

    private void i(A.X x10) {
        E.q.a();
        this.f632g = true;
        h8.d dVar = this.f634i;
        Objects.requireNonNull(dVar);
        dVar.cancel(true);
        this.f630e.f(x10);
        this.f631f.c(null);
    }

    private void l() {
        y0.f.j(this.f628c.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(c.a aVar) {
        this.f630e = aVar;
        return "CaptureCompleteFuture";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p(c.a aVar) {
        this.f631f = aVar;
        return "RequestCompleteFuture";
    }

    private void q() {
        y0.f.j(!this.f629d.isDone(), "The callback can only complete once.");
        this.f631f.c(null);
    }

    private void r(A.X x10) {
        E.q.a();
        this.f626a.x(x10);
    }

    @Override // C.V
    public boolean a() {
        return this.f632g;
    }

    @Override // C.V
    public void b() {
        E.q.a();
        if (this.f632g) {
            return;
        }
        if (!this.f633h) {
            onCaptureStarted();
        }
        this.f630e.c(null);
    }

    @Override // C.V
    public void c(A.X x10) {
        E.q.a();
        if (this.f632g) {
            return;
        }
        l();
        q();
        r(x10);
    }

    @Override // C.V
    public void d(A.X x10) {
        E.q.a();
        if (this.f632g) {
            return;
        }
        boolean f10 = this.f626a.f();
        if (!f10) {
            r(x10);
        }
        q();
        this.f630e.f(x10);
        if (f10) {
            this.f627b.a(this.f626a);
        }
    }

    @Override // C.V
    public void e(androidx.camera.core.n nVar) {
        E.q.a();
        if (this.f632g) {
            nVar.close();
            return;
        }
        l();
        q();
        this.f626a.A(nVar);
    }

    @Override // C.V
    public void f(W.h hVar) {
        E.q.a();
        if (this.f632g) {
            return;
        }
        l();
        q();
        this.f626a.z(hVar);
    }

    void j(A.X x10) {
        E.q.a();
        if (this.f629d.isDone()) {
            return;
        }
        i(x10);
        r(x10);
    }

    void k() {
        E.q.a();
        if (this.f629d.isDone()) {
            return;
        }
        i(new A.X(3, "The request is aborted silently and retried.", null));
        this.f627b.a(this.f626a);
    }

    h8.d m() {
        E.q.a();
        return this.f628c;
    }

    h8.d n() {
        E.q.a();
        return this.f629d;
    }

    @Override // C.V
    public void onCaptureProcessProgressed(int i10) {
        E.q.a();
        if (this.f632g) {
            return;
        }
        this.f626a.w(i10);
    }

    @Override // C.V
    public void onCaptureStarted() {
        E.q.a();
        if (this.f632g || this.f633h) {
            return;
        }
        this.f633h = true;
        W.e j10 = this.f626a.j();
        if (j10 != null) {
            j10.b();
        }
        W.f l10 = this.f626a.l();
        if (l10 != null) {
            l10.onCaptureStarted();
        }
    }

    @Override // C.V
    public void onPostviewBitmapAvailable(Bitmap bitmap) {
        E.q.a();
        if (this.f632g) {
            return;
        }
        this.f626a.y(bitmap);
    }

    public void s(h8.d dVar) {
        E.q.a();
        y0.f.j(this.f634i == null, "CaptureRequestFuture can only be set once.");
        this.f634i = dVar;
    }
}
