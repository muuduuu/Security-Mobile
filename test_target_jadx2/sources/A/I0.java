package A;

import A.I0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.AbstractC1429c0;
import androidx.camera.core.impl.Z0;
import androidx.concurrent.futures.c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import y0.InterfaceC5159a;

/* loaded from: classes.dex */
public final class I0 {

    /* renamed from: p, reason: collision with root package name */
    public static final Range f38p = Z0.f14526a;

    /* renamed from: a, reason: collision with root package name */
    private final Object f39a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Size f40b;

    /* renamed from: c, reason: collision with root package name */
    private final B f41c;

    /* renamed from: d, reason: collision with root package name */
    private final Range f42d;

    /* renamed from: e, reason: collision with root package name */
    private final androidx.camera.core.impl.H f43e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f44f;

    /* renamed from: g, reason: collision with root package name */
    final h8.d f45g;

    /* renamed from: h, reason: collision with root package name */
    private final c.a f46h;

    /* renamed from: i, reason: collision with root package name */
    private final h8.d f47i;

    /* renamed from: j, reason: collision with root package name */
    private final c.a f48j;

    /* renamed from: k, reason: collision with root package name */
    private final c.a f49k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC1429c0 f50l;

    /* renamed from: m, reason: collision with root package name */
    private h f51m;

    /* renamed from: n, reason: collision with root package name */
    private i f52n;

    /* renamed from: o, reason: collision with root package name */
    private Executor f53o;

    class a implements G.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f54a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h8.d f55b;

        a(c.a aVar, h8.d dVar) {
            this.f54a = aVar;
            this.f55b = dVar;
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            y0.f.i(this.f54a.c(null));
        }

        @Override // G.c
        public void onFailure(Throwable th) {
            if (th instanceof f) {
                y0.f.i(this.f55b.cancel(false));
            } else {
                y0.f.i(this.f54a.c(null));
            }
        }
    }

    class b extends AbstractC1429c0 {
        b(Size size, int i10) {
            super(size, i10);
        }

        @Override // androidx.camera.core.impl.AbstractC1429c0
        protected h8.d r() {
            return I0.this.f45g;
        }
    }

    class c implements G.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h8.d f58a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.a f59b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f60c;

        c(h8.d dVar, c.a aVar, String str) {
            this.f58a = dVar;
            this.f59b = aVar;
            this.f60c = str;
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Surface surface) {
            G.n.C(this.f58a, this.f59b);
        }

        @Override // G.c
        public void onFailure(Throwable th) {
            if (!(th instanceof CancellationException)) {
                this.f59b.c(null);
                return;
            }
            y0.f.i(this.f59b.f(new f(this.f60c + " cancelled.", th)));
        }
    }

    class d implements G.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5159a f62a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Surface f63b;

        d(InterfaceC5159a interfaceC5159a, Surface surface) {
            this.f62a = interfaceC5159a;
            this.f63b = surface;
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r32) {
            this.f62a.accept(g.c(0, this.f63b));
        }

        @Override // G.c
        public void onFailure(Throwable th) {
            y0.f.j(th instanceof f, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th);
            this.f62a.accept(g.c(1, this.f63b));
        }
    }

    private static final class f extends RuntimeException {
        f(String str, Throwable th) {
            super(str, th);
        }
    }

    public static abstract class g {
        g() {
        }

        static g c(int i10, Surface surface) {
            return new C0699h(i10, surface);
        }

        public abstract int a();

        public abstract Surface b();
    }

    public static abstract class h {
        h() {
        }

        public static h g(Rect rect, int i10, int i11, boolean z10, Matrix matrix, boolean z11) {
            return new C0701i(rect, i10, i11, z10, matrix, z11);
        }

        public abstract Rect a();

        public abstract int b();

        public abstract Matrix c();

        public abstract int d();

        public abstract boolean e();

        public abstract boolean f();
    }

    public interface i {
        void a(h hVar);
    }

    public I0(Size size, androidx.camera.core.impl.H h10, boolean z10, B b10, Range range, Runnable runnable) {
        this.f40b = size;
        this.f43e = h10;
        this.f44f = z10;
        this.f41c = b10;
        this.f42d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        h8.d a10 = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: A.A0
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object v10;
                v10 = I0.v(atomicReference, str, aVar);
                return v10;
            }
        });
        c.a aVar = (c.a) y0.f.g((c.a) atomicReference.get());
        this.f49k = aVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        h8.d a11 = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: A.B0
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar2) {
                Object w10;
                w10 = I0.w(atomicReference2, str, aVar2);
                return w10;
            }
        });
        this.f47i = a11;
        G.n.j(a11, new a(aVar, a10), F.c.b());
        c.a aVar2 = (c.a) y0.f.g((c.a) atomicReference2.get());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        h8.d a12 = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: A.C0
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar3) {
                Object x10;
                x10 = I0.x(atomicReference3, str, aVar3);
                return x10;
            }
        });
        this.f45g = a12;
        this.f46h = (c.a) y0.f.g((c.a) atomicReference3.get());
        b bVar = new b(size, 34);
        this.f50l = bVar;
        h8.d k10 = bVar.k();
        G.n.j(a12, new c(k10, aVar2, str), F.c.b());
        k10.e(new Runnable() { // from class: A.D0
            @Override // java.lang.Runnable
            public final void run() {
                I0.this.y();
            }
        }, F.c.b());
        this.f48j = q(F.c.b(), runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A(InterfaceC5159a interfaceC5159a, Surface surface) {
        interfaceC5159a.accept(g.c(4, surface));
    }

    private c.a q(Executor executor, Runnable runnable) {
        final AtomicReference atomicReference = new AtomicReference(null);
        G.n.j(androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: A.H0
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object u10;
                u10 = I0.this.u(atomicReference, aVar);
                return u10;
            }
        }), new e(runnable), executor);
        return (c.a) y0.f.g((c.a) atomicReference.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object u(AtomicReference atomicReference, c.a aVar) {
        atomicReference.set(aVar);
        return "SurfaceRequest-surface-recreation(" + hashCode() + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object v(AtomicReference atomicReference, String str, c.a aVar) {
        atomicReference.set(aVar);
        return str + "-cancellation";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object w(AtomicReference atomicReference, String str, c.a aVar) {
        atomicReference.set(aVar);
        return str + "-status";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object x(AtomicReference atomicReference, String str, c.a aVar) {
        atomicReference.set(aVar);
        return str + "-Surface";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y() {
        this.f45g.cancel(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z(InterfaceC5159a interfaceC5159a, Surface surface) {
        interfaceC5159a.accept(g.c(3, surface));
    }

    public void D(final Surface surface, Executor executor, final InterfaceC5159a interfaceC5159a) {
        if (this.f46h.c(surface) || this.f45g.isCancelled()) {
            G.n.j(this.f47i, new d(interfaceC5159a, surface), executor);
            return;
        }
        y0.f.i(this.f45g.isDone());
        try {
            this.f45g.get();
            executor.execute(new Runnable() { // from class: A.F0
                @Override // java.lang.Runnable
                public final void run() {
                    I0.z(InterfaceC5159a.this, surface);
                }
            });
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new Runnable() { // from class: A.G0
                @Override // java.lang.Runnable
                public final void run() {
                    I0.A(InterfaceC5159a.this, surface);
                }
            });
        }
    }

    public void E(Executor executor, final i iVar) {
        final h hVar;
        synchronized (this.f39a) {
            this.f52n = iVar;
            this.f53o = executor;
            hVar = this.f51m;
        }
        if (hVar != null) {
            executor.execute(new Runnable() { // from class: A.E0
                @Override // java.lang.Runnable
                public final void run() {
                    I0.i.this.a(hVar);
                }
            });
        }
    }

    public void F(final h hVar) {
        final i iVar;
        Executor executor;
        synchronized (this.f39a) {
            this.f51m = hVar;
            iVar = this.f52n;
            executor = this.f53o;
        }
        if (iVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: A.z0
            @Override // java.lang.Runnable
            public final void run() {
                I0.i.this.a(hVar);
            }
        });
    }

    public boolean G() {
        return this.f46h.f(new AbstractC1429c0.b("Surface request will not complete."));
    }

    public void j(Executor executor, Runnable runnable) {
        this.f49k.a(runnable, executor);
    }

    public void k() {
        synchronized (this.f39a) {
            this.f52n = null;
            this.f53o = null;
        }
    }

    public androidx.camera.core.impl.H l() {
        return this.f43e;
    }

    public AbstractC1429c0 m() {
        return this.f50l;
    }

    public B n() {
        return this.f41c;
    }

    public Range o() {
        return this.f42d;
    }

    public Size p() {
        return this.f40b;
    }

    public boolean r() {
        G();
        return this.f48j.c(null);
    }

    public boolean s() {
        return this.f44f;
    }

    public boolean t() {
        return this.f45g.isDone();
    }

    class e implements G.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f65a;

        e(Runnable runnable) {
            this.f65a = runnable;
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            this.f65a.run();
        }

        @Override // G.c
        public void onFailure(Throwable th) {
        }
    }
}
