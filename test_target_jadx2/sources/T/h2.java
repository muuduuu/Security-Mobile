package t;

import A.AbstractC0700h0;
import A.InterfaceC0705k;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.concurrent.futures.c;
import androidx.lifecycle.AbstractC1604v;
import androidx.lifecycle.C1607y;
import java.util.concurrent.Executor;
import s.C4301a;
import t.C4584u;
import u.C4832C;

/* loaded from: classes.dex */
final class h2 {

    /* renamed from: a, reason: collision with root package name */
    private final C4584u f42092a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f42093b;

    /* renamed from: c, reason: collision with root package name */
    private final i2 f42094c;

    /* renamed from: d, reason: collision with root package name */
    private final C1607y f42095d;

    /* renamed from: e, reason: collision with root package name */
    final b f42096e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f42097f = false;

    /* renamed from: g, reason: collision with root package name */
    private C4584u.c f42098g = new a();

    class a implements C4584u.c {
        a() {
        }

        @Override // t.C4584u.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            h2.this.f42096e.a(totalCaptureResult);
            return false;
        }
    }

    interface b {
        void a(TotalCaptureResult totalCaptureResult);

        void b(float f10, c.a aVar);

        float c();

        float d();

        void e(C4301a.C0609a c0609a);

        Rect f();

        void g();
    }

    h2(C4584u c4584u, C4832C c4832c, Executor executor) {
        this.f42092a = c4584u;
        this.f42093b = executor;
        b d10 = d(c4832c);
        this.f42096e = d10;
        i2 i2Var = new i2(d10.c(), d10.d());
        this.f42094c = i2Var;
        i2Var.f(1.0f);
        this.f42095d = new C1607y(H.g.f(i2Var));
        c4584u.z(this.f42098g);
    }

    private static b d(C4832C c4832c) {
        return i(c4832c) ? new C4531c(c4832c) : new C4542f1(c4832c);
    }

    static A.M0 f(C4832C c4832c) {
        b d10 = d(c4832c);
        i2 i2Var = new i2(d10.c(), d10.d());
        i2Var.f(1.0f);
        return H.g.f(i2Var);
    }

    private static Range g(C4832C c4832c) {
        CameraCharacteristics.Key key;
        try {
            key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            return (Range) c4832c.a(key);
        } catch (AssertionError e10) {
            AbstractC0700h0.m("ZoomControl", "AssertionError, fail to get camera characteristic.", e10);
            return null;
        }
    }

    static boolean i(C4832C c4832c) {
        return Build.VERSION.SDK_INT >= 30 && g(c4832c) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object k(final A.M0 m02, final c.a aVar) {
        this.f42093b.execute(new Runnable() { // from class: t.g2
            @Override // java.lang.Runnable
            public final void run() {
                h2.this.j(aVar, m02);
            }
        });
        return "setZoomRatio";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(c.a aVar, A.M0 m02) {
        A.M0 f10;
        if (this.f42097f) {
            this.f42096e.b(m02.c(), aVar);
            this.f42092a.t0();
            return;
        }
        synchronized (this.f42094c) {
            this.f42094c.f(1.0f);
            f10 = H.g.f(this.f42094c);
        }
        o(f10);
        aVar.f(new InterfaceC0705k.a("Camera is not active."));
    }

    private void o(A.M0 m02) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f42095d.o(m02);
        } else {
            this.f42095d.m(m02);
        }
    }

    void c(C4301a.C0609a c0609a) {
        this.f42096e.e(c0609a);
    }

    Rect e() {
        return this.f42096e.f();
    }

    AbstractC1604v h() {
        return this.f42095d;
    }

    void l(boolean z10) {
        A.M0 f10;
        if (this.f42097f == z10) {
            return;
        }
        this.f42097f = z10;
        if (z10) {
            return;
        }
        synchronized (this.f42094c) {
            this.f42094c.f(1.0f);
            f10 = H.g.f(this.f42094c);
        }
        o(f10);
        this.f42096e.g();
        this.f42092a.t0();
    }

    h8.d m(float f10) {
        final A.M0 f11;
        synchronized (this.f42094c) {
            try {
                this.f42094c.f(f10);
                f11 = H.g.f(this.f42094c);
            } catch (IllegalArgumentException e10) {
                return G.n.n(e10);
            }
        }
        o(f11);
        return androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: t.f2
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object k10;
                k10 = h2.this.k(f11, aVar);
                return k10;
            }
        });
    }
}
