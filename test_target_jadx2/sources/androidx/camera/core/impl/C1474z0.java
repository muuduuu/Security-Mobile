package androidx.camera.core.impl;

import android.os.SystemClock;
import androidx.camera.core.impl.C1474z0;
import androidx.camera.core.impl.E0;
import androidx.concurrent.futures.c;
import androidx.lifecycle.C1607y;
import androidx.lifecycle.InterfaceC1608z;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.camera.core.impl.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1474z0 implements E0 {

    /* renamed from: a, reason: collision with root package name */
    final C1607y f14707a = new C1607y();

    /* renamed from: b, reason: collision with root package name */
    private final Map f14708b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.camera.core.impl.z0$a */
    static final class a implements InterfaceC1608z {

        /* renamed from: a, reason: collision with root package name */
        final AtomicBoolean f14709a = new AtomicBoolean(true);

        /* renamed from: b, reason: collision with root package name */
        final E0.a f14710b;

        /* renamed from: c, reason: collision with root package name */
        final Executor f14711c;

        a(Executor executor, E0.a aVar) {
            this.f14711c = executor;
            this.f14710b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(b bVar) {
            if (this.f14709a.get()) {
                if (bVar.a()) {
                    this.f14710b.a(bVar.d());
                } else {
                    y0.f.g(bVar.c());
                    this.f14710b.onError(bVar.c());
                }
            }
        }

        void c() {
            this.f14709a.set(false);
        }

        @Override // androidx.lifecycle.InterfaceC1608z
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(final b bVar) {
            this.f14711c.execute(new Runnable() { // from class: androidx.camera.core.impl.y0
                @Override // java.lang.Runnable
                public final void run() {
                    C1474z0.a.this.d(bVar);
                }
            });
        }
    }

    /* renamed from: androidx.camera.core.impl.z0$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Object f14712a;

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f14713b;

        private b(Object obj, Throwable th) {
            this.f14712a = obj;
            this.f14713b = th;
        }

        static b b(Object obj) {
            return new b(obj, null);
        }

        public boolean a() {
            return this.f14713b == null;
        }

        public Throwable c() {
            return this.f14713b;
        }

        public Object d() {
            if (a()) {
                return this.f14712a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[Result: <");
            if (a()) {
                str = "Value: " + this.f14712a;
            } else {
                str = "Error: " + this.f14713b;
            }
            sb2.append(str);
            sb2.append(">]");
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(a aVar, a aVar2) {
        if (aVar != null) {
            this.f14707a.n(aVar);
        }
        this.f14707a.j(aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(c.a aVar) {
        b bVar = (b) this.f14707a.f();
        if (bVar == null) {
            aVar.f(new IllegalStateException("Observable has not yet been initialized with a value."));
        } else if (bVar.a()) {
            aVar.c(bVar.d());
        } else {
            y0.f.g(bVar.c());
            aVar.f(bVar.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object k(final c.a aVar) {
        F.c.e().execute(new Runnable() { // from class: androidx.camera.core.impl.x0
            @Override // java.lang.Runnable
            public final void run() {
                C1474z0.this.j(aVar);
            }
        });
        return this + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(a aVar) {
        this.f14707a.n(aVar);
    }

    @Override // androidx.camera.core.impl.E0
    public void a(E0.a aVar) {
        synchronized (this.f14708b) {
            try {
                final a aVar2 = (a) this.f14708b.remove(aVar);
                if (aVar2 != null) {
                    aVar2.c();
                    F.c.e().execute(new Runnable() { // from class: androidx.camera.core.impl.u0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1474z0.this.l(aVar2);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.E0
    public h8.d c() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: androidx.camera.core.impl.w0
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object k10;
                k10 = C1474z0.this.k(aVar);
                return k10;
            }
        });
    }

    @Override // androidx.camera.core.impl.E0
    public void e(Executor executor, E0.a aVar) {
        synchronized (this.f14708b) {
            try {
                final a aVar2 = (a) this.f14708b.get(aVar);
                if (aVar2 != null) {
                    aVar2.c();
                }
                final a aVar3 = new a(executor, aVar);
                this.f14708b.put(aVar, aVar3);
                F.c.e().execute(new Runnable() { // from class: androidx.camera.core.impl.v0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1474z0.this.i(aVar2, aVar3);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m(Object obj) {
        this.f14707a.m(b.b(obj));
    }
}
