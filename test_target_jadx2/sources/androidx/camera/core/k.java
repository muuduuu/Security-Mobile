package androidx.camera.core;

import androidx.camera.core.e;
import androidx.camera.core.impl.InterfaceC1458r0;
import androidx.camera.core.k;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class k extends i {

    /* renamed from: t, reason: collision with root package name */
    final Executor f14722t;

    /* renamed from: u, reason: collision with root package name */
    private final Object f14723u = new Object();

    /* renamed from: v, reason: collision with root package name */
    n f14724v;

    /* renamed from: w, reason: collision with root package name */
    private b f14725w;

    class a implements G.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f14726a;

        a(b bVar) {
            this.f14726a = bVar;
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }

        @Override // G.c
        public void onFailure(Throwable th) {
            this.f14726a.close();
        }
    }

    static class b extends e {

        /* renamed from: d, reason: collision with root package name */
        final WeakReference f14728d;

        b(n nVar, k kVar) {
            super(nVar);
            this.f14728d = new WeakReference(kVar);
            a(new e.a() { // from class: androidx.camera.core.l
                @Override // androidx.camera.core.e.a
                public final void b(n nVar2) {
                    k.b.this.f(nVar2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(n nVar) {
            final k kVar = (k) this.f14728d.get();
            if (kVar != null) {
                kVar.f14722t.execute(new Runnable() { // from class: androidx.camera.core.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.this.z();
                    }
                });
            }
        }
    }

    k(Executor executor) {
        this.f14722t = executor;
    }

    @Override // androidx.camera.core.i
    n d(InterfaceC1458r0 interfaceC1458r0) {
        return interfaceC1458r0.c();
    }

    @Override // androidx.camera.core.i
    void g() {
        synchronized (this.f14723u) {
            try {
                n nVar = this.f14724v;
                if (nVar != null) {
                    nVar.close();
                    this.f14724v = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.i
    void o(n nVar) {
        synchronized (this.f14723u) {
            try {
                if (!this.f14404s) {
                    nVar.close();
                    return;
                }
                if (this.f14725w == null) {
                    b bVar = new b(nVar, this);
                    this.f14725w = bVar;
                    G.n.j(e(bVar), new a(bVar), F.c.b());
                } else {
                    if (nVar.G().a() <= this.f14725w.G().a()) {
                        nVar.close();
                    } else {
                        n nVar2 = this.f14724v;
                        if (nVar2 != null) {
                            nVar2.close();
                        }
                        this.f14724v = nVar;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z() {
        synchronized (this.f14723u) {
            try {
                this.f14725w = null;
                n nVar = this.f14724v;
                if (nVar != null) {
                    this.f14724v = null;
                    o(nVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
