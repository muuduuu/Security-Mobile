package z;

import A.InterfaceC0705k;
import G.n;
import androidx.camera.core.impl.V;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import s.C4301a;
import t.C4584u;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    private final C4584u f45587c;

    /* renamed from: d, reason: collision with root package name */
    final Executor f45588d;

    /* renamed from: g, reason: collision with root package name */
    c.a f45591g;

    /* renamed from: a, reason: collision with root package name */
    private boolean f45585a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f45586b = false;

    /* renamed from: e, reason: collision with root package name */
    final Object f45589e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private C4301a.C0609a f45590f = new C4301a.C0609a();

    public g(C4584u c4584u, Executor executor) {
        this.f45587c = c4584u;
        this.f45588d = executor;
    }

    private void h(j jVar) {
        synchronized (this.f45589e) {
            this.f45590f.d(jVar);
        }
    }

    private void k() {
        synchronized (this.f45589e) {
            this.f45590f = new C4301a.C0609a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        c.a aVar = this.f45591g;
        if (aVar != null) {
            aVar.c(null);
            this.f45591g = null;
        }
    }

    private void m(Exception exc) {
        c.a aVar = this.f45591g;
        if (aVar != null) {
            if (exc == null) {
                exc = new Exception("Camera2CameraControl failed with unknown error.");
            }
            aVar.f(exc);
            this.f45591g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p(final c.a aVar) {
        this.f45588d.execute(new Runnable() { // from class: z.f
            @Override // java.lang.Runnable
            public final void run() {
                g.this.o(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(final c.a aVar) {
        this.f45588d.execute(new Runnable() { // from class: z.d
            @Override // java.lang.Runnable
            public final void run() {
                g.this.q(aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void s(boolean z10) {
        if (this.f45585a == z10) {
            return;
        }
        this.f45585a = z10;
        if (!z10) {
            m(new InterfaceC0705k.a("The camera control has became inactive."));
        } else if (this.f45586b) {
            w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void q(c.a aVar) {
        this.f45586b = true;
        m(new InterfaceC0705k.a("Camera2CameraControl was updated with new options."));
        this.f45591g = aVar;
        if (this.f45585a) {
            w();
        }
    }

    private void w() {
        this.f45587c.s0().e(new Runnable() { // from class: z.e
            @Override // java.lang.Runnable
            public final void run() {
                g.this.l();
            }
        }, this.f45588d);
        this.f45586b = false;
    }

    public h8.d g(j jVar) {
        h(jVar);
        return n.B(androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: z.a
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object p10;
                p10 = g.this.p(aVar);
                return p10;
            }
        }));
    }

    public void i(C4301a.C0609a c0609a) {
        synchronized (this.f45589e) {
            c0609a.e(this.f45590f.b(), V.c.ALWAYS_OVERRIDE);
        }
    }

    public h8.d j() {
        k();
        return n.B(androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: z.c
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object r10;
                r10 = g.this.r(aVar);
                return r10;
            }
        }));
    }

    public C4301a n() {
        C4301a a10;
        synchronized (this.f45589e) {
            a10 = this.f45590f.a();
        }
        return a10;
    }

    public void t(final boolean z10) {
        this.f45588d.execute(new Runnable() { // from class: z.b
            @Override // java.lang.Runnable
            public final void run() {
                g.this.s(z10);
            }
        });
    }
}
