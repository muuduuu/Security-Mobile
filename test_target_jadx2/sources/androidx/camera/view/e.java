package androidx.camera.view;

import A.AbstractC0700h0;
import A.InterfaceC0713p;
import androidx.camera.core.impl.AbstractC1450n;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.InterfaceC1469x;
import androidx.camera.view.m;
import androidx.concurrent.futures.c;
import androidx.lifecycle.C1607y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.InterfaceC3735a;

/* loaded from: classes.dex */
final class e implements E0.a {

    /* renamed from: a, reason: collision with root package name */
    private final G f14814a;

    /* renamed from: b, reason: collision with root package name */
    private final C1607y f14815b;

    /* renamed from: c, reason: collision with root package name */
    private m.e f14816c;

    /* renamed from: d, reason: collision with root package name */
    private final n f14817d;

    /* renamed from: e, reason: collision with root package name */
    h8.d f14818e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14819f = false;

    class a implements G.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f14820a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0713p f14821b;

        a(List list, InterfaceC0713p interfaceC0713p) {
            this.f14820a = list;
            this.f14821b = interfaceC0713p;
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            e.this.f14818e = null;
        }

        @Override // G.c
        public void onFailure(Throwable th) {
            e.this.f14818e = null;
            if (this.f14820a.isEmpty()) {
                return;
            }
            Iterator it = this.f14820a.iterator();
            while (it.hasNext()) {
                ((G) this.f14821b).s((AbstractC1450n) it.next());
            }
            this.f14820a.clear();
        }
    }

    class b extends AbstractC1450n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f14823a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0713p f14824b;

        b(c.a aVar, InterfaceC0713p interfaceC0713p) {
            this.f14823a = aVar;
            this.f14824b = interfaceC0713p;
        }

        @Override // androidx.camera.core.impl.AbstractC1450n
        public void b(int i10, InterfaceC1469x interfaceC1469x) {
            this.f14823a.c(null);
            ((G) this.f14824b).s(this);
        }
    }

    e(G g10, C1607y c1607y, n nVar) {
        this.f14814a = g10;
        this.f14815b = c1607y;
        this.f14817d = nVar;
        synchronized (this) {
            this.f14816c = (m.e) c1607y.f();
        }
    }

    private void e() {
        h8.d dVar = this.f14818e;
        if (dVar != null) {
            dVar.cancel(false);
            this.f14818e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ h8.d g(Void r12) {
        return this.f14817d.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void h(Void r12) {
        l(m.e.STREAMING);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object i(InterfaceC0713p interfaceC0713p, List list, c.a aVar) {
        b bVar = new b(aVar, interfaceC0713p);
        list.add(bVar);
        ((G) interfaceC0713p).h(F.c.b(), bVar);
        return "waitForCaptureResult";
    }

    private void k(InterfaceC0713p interfaceC0713p) {
        l(m.e.IDLE);
        ArrayList arrayList = new ArrayList();
        G.d d10 = G.d.a(m(interfaceC0713p, arrayList)).f(new G.a() { // from class: androidx.camera.view.b
            @Override // G.a
            public final h8.d apply(Object obj) {
                h8.d g10;
                g10 = e.this.g((Void) obj);
                return g10;
            }
        }, F.c.b()).d(new InterfaceC3735a() { // from class: androidx.camera.view.c
            @Override // o.InterfaceC3735a
            public final Object apply(Object obj) {
                Void h10;
                h10 = e.this.h((Void) obj);
                return h10;
            }
        }, F.c.b());
        this.f14818e = d10;
        G.n.j(d10, new a(arrayList, interfaceC0713p), F.c.b());
    }

    private h8.d m(final InterfaceC0713p interfaceC0713p, final List list) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: androidx.camera.view.d
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object i10;
                i10 = e.this.i(interfaceC0713p, list, aVar);
                return i10;
            }
        });
    }

    void f() {
        e();
    }

    @Override // androidx.camera.core.impl.E0.a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void a(H.a aVar) {
        if (aVar == H.a.CLOSING || aVar == H.a.CLOSED || aVar == H.a.RELEASING || aVar == H.a.RELEASED) {
            l(m.e.IDLE);
            if (this.f14819f) {
                this.f14819f = false;
                e();
                return;
            }
            return;
        }
        if ((aVar == H.a.OPENING || aVar == H.a.OPEN || aVar == H.a.PENDING_OPEN) && !this.f14819f) {
            k(this.f14814a);
            this.f14819f = true;
        }
    }

    void l(m.e eVar) {
        synchronized (this) {
            try {
                if (this.f14816c.equals(eVar)) {
                    return;
                }
                this.f14816c = eVar;
                AbstractC0700h0.a("StreamStateObserver", "Update Preview stream state to " + eVar);
                this.f14815b.m(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.E0.a
    public void onError(Throwable th) {
        f();
        l(m.e.IDLE);
    }
}
