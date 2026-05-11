package t;

import A.AbstractC0700h0;
import A.InterfaceC0705k;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.concurrent.futures.c;
import androidx.lifecycle.AbstractC1604v;
import androidx.lifecycle.C1607y;
import java.util.Objects;
import java.util.concurrent.Executor;
import t.C4584u;
import u.C4832C;
import x.AbstractC5092g;

/* loaded from: classes.dex */
final class a2 {

    /* renamed from: a, reason: collision with root package name */
    private final C4584u f42020a;

    /* renamed from: b, reason: collision with root package name */
    private final C1607y f42021b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f42022c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f42023d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f42024e;

    /* renamed from: f, reason: collision with root package name */
    c.a f42025f;

    /* renamed from: g, reason: collision with root package name */
    boolean f42026g;

    a2(C4584u c4584u, C4832C c4832c, Executor executor) {
        this.f42020a = c4584u;
        this.f42023d = executor;
        Objects.requireNonNull(c4832c);
        this.f42022c = AbstractC5092g.a(new S(c4832c));
        this.f42021b = new C1607y(0);
        c4584u.z(new C4584u.c() { // from class: t.Y1
            @Override // t.C4584u.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                boolean i10;
                i10 = a2.this.i(totalCaptureResult);
                return i10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object h(final boolean z10, final c.a aVar) {
        this.f42023d.execute(new Runnable() { // from class: t.Z1
            @Override // java.lang.Runnable
            public final void run() {
                a2.this.g(aVar, z10);
            }
        });
        return "enableTorch: " + z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean i(TotalCaptureResult totalCaptureResult) {
        if (this.f42025f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == this.f42026g) {
                this.f42025f.c(null);
                this.f42025f = null;
            }
        }
        return false;
    }

    private void k(C1607y c1607y, Object obj) {
        if (E.q.c()) {
            c1607y.o(obj);
        } else {
            c1607y.m(obj);
        }
    }

    h8.d d(final boolean z10) {
        if (this.f42022c) {
            k(this.f42021b, Integer.valueOf(z10 ? 1 : 0));
            return androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: t.X1
                @Override // androidx.concurrent.futures.c.InterfaceC0253c
                public final Object a(c.a aVar) {
                    Object h10;
                    h10 = a2.this.h(z10, aVar);
                    return h10;
                }
            });
        }
        AbstractC0700h0.a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
        return G.n.n(new IllegalStateException("No flash unit"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void g(c.a aVar, boolean z10) {
        if (!this.f42022c) {
            if (aVar != null) {
                aVar.f(new IllegalStateException("No flash unit"));
            }
        } else {
            if (!this.f42024e) {
                k(this.f42021b, 0);
                if (aVar != null) {
                    aVar.f(new InterfaceC0705k.a("Camera is not active."));
                    return;
                }
                return;
            }
            this.f42026g = z10;
            this.f42020a.C(z10);
            k(this.f42021b, Integer.valueOf(z10 ? 1 : 0));
            c.a aVar2 = this.f42025f;
            if (aVar2 != null) {
                aVar2.f(new InterfaceC0705k.a("There is a new enableTorch being set"));
            }
            this.f42025f = aVar;
        }
    }

    AbstractC1604v f() {
        return this.f42021b;
    }

    void j(boolean z10) {
        if (this.f42024e == z10) {
            return;
        }
        this.f42024e = z10;
        if (z10) {
            return;
        }
        if (this.f42026g) {
            this.f42026g = false;
            this.f42020a.C(false);
            k(this.f42021b, 0);
        }
        c.a aVar = this.f42025f;
        if (aVar != null) {
            aVar.f(new InterfaceC0705k.a("Camera is not active."));
            this.f42025f = null;
        }
    }
}
