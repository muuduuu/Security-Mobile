package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.e;
import androidx.camera.core.impl.InterfaceC1458r0;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class q implements InterfaceC1458r0 {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1458r0 f14748d;

    /* renamed from: e, reason: collision with root package name */
    private final Surface f14749e;

    /* renamed from: f, reason: collision with root package name */
    private e.a f14750f;

    /* renamed from: a, reason: collision with root package name */
    private final Object f14745a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private int f14746b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14747c = false;

    /* renamed from: g, reason: collision with root package name */
    private final e.a f14751g = new e.a() { // from class: A.w0
        @Override // androidx.camera.core.e.a
        public final void b(androidx.camera.core.n nVar) {
            androidx.camera.core.q.this.k(nVar);
        }
    };

    public q(InterfaceC1458r0 interfaceC1458r0) {
        this.f14748d = interfaceC1458r0;
        this.f14749e = interfaceC1458r0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(n nVar) {
        e.a aVar;
        synchronized (this.f14745a) {
            try {
                int i10 = this.f14746b - 1;
                this.f14746b = i10;
                if (this.f14747c && i10 == 0) {
                    close();
                }
                aVar = this.f14750f;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.b(nVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(InterfaceC1458r0.a aVar, InterfaceC1458r0 interfaceC1458r0) {
        aVar.a(this);
    }

    private n o(n nVar) {
        if (nVar == null) {
            return null;
        }
        this.f14746b++;
        s sVar = new s(nVar);
        sVar.a(this.f14751g);
        return sVar;
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public Surface a() {
        Surface a10;
        synchronized (this.f14745a) {
            a10 = this.f14748d.a();
        }
        return a10;
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public n c() {
        n o10;
        synchronized (this.f14745a) {
            o10 = o(this.f14748d.c());
        }
        return o10;
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public void close() {
        synchronized (this.f14745a) {
            try {
                Surface surface = this.f14749e;
                if (surface != null) {
                    surface.release();
                }
                this.f14748d.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public int d() {
        int d10;
        synchronized (this.f14745a) {
            d10 = this.f14748d.d();
        }
        return d10;
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public void e() {
        synchronized (this.f14745a) {
            this.f14748d.e();
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public int f() {
        int f10;
        synchronized (this.f14745a) {
            f10 = this.f14748d.f();
        }
        return f10;
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public n g() {
        n o10;
        synchronized (this.f14745a) {
            o10 = o(this.f14748d.g());
        }
        return o10;
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public int getHeight() {
        int height;
        synchronized (this.f14745a) {
            height = this.f14748d.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public int getWidth() {
        int width;
        synchronized (this.f14745a) {
            width = this.f14748d.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public void h(final InterfaceC1458r0.a aVar, Executor executor) {
        synchronized (this.f14745a) {
            this.f14748d.h(new InterfaceC1458r0.a() { // from class: A.v0
                @Override // androidx.camera.core.impl.InterfaceC1458r0.a
                public final void a(InterfaceC1458r0 interfaceC1458r0) {
                    androidx.camera.core.q.this.l(aVar, interfaceC1458r0);
                }
            }, executor);
        }
    }

    public int j() {
        int f10;
        synchronized (this.f14745a) {
            f10 = this.f14748d.f() - this.f14746b;
        }
        return f10;
    }

    public void m() {
        synchronized (this.f14745a) {
            try {
                this.f14747c = true;
                this.f14748d.e();
                if (this.f14746b == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n(e.a aVar) {
        synchronized (this.f14745a) {
            this.f14750f = aVar;
        }
    }
}
