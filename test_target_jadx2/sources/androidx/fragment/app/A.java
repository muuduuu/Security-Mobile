package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.G;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
class A {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f16679a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final G f16680b;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final G.k f16681a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f16682b;

        a(G.k kVar, boolean z10) {
            this.f16681a = kVar;
            this.f16682b = z10;
        }
    }

    A(G g10) {
        this.f16680b = g10;
    }

    void a(ComponentCallbacksC1573o componentCallbacksC1573o, Bundle bundle, boolean z10) {
        ComponentCallbacksC1573o z02 = this.f16680b.z0();
        if (z02 != null) {
            z02.getParentFragmentManager().y0().a(componentCallbacksC1573o, bundle, true);
        }
        Iterator it = this.f16679a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f16682b) {
                aVar.f16681a.onFragmentActivityCreated(this.f16680b, componentCallbacksC1573o, bundle);
            }
        }
    }

    void b(ComponentCallbacksC1573o componentCallbacksC1573o, boolean z10) {
        Context f10 = this.f16680b.w0().f();
        ComponentCallbacksC1573o z02 = this.f16680b.z0();
        if (z02 != null) {
            z02.getParentFragmentManager().y0().b(componentCallbacksC1573o, true);
        }
        Iterator it = this.f16679a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f16682b) {
                aVar.f16681a.onFragmentAttached(this.f16680b, componentCallbacksC1573o, f10);
            }
        }
    }

    void c(ComponentCallbacksC1573o componentCallbacksC1573o, Bundle bundle, boolean z10) {
        ComponentCallbacksC1573o z02 = this.f16680b.z0();
        if (z02 != null) {
            z02.getParentFragmentManager().y0().c(componentCallbacksC1573o, bundle, true);
        }
        Iterator it = this.f16679a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f16682b) {
                aVar.f16681a.onFragmentCreated(this.f16680b, componentCallbacksC1573o, bundle);
            }
        }
    }

    void d(ComponentCallbacksC1573o componentCallbacksC1573o, boolean z10) {
        ComponentCallbacksC1573o z02 = this.f16680b.z0();
        if (z02 != null) {
            z02.getParentFragmentManager().y0().d(componentCallbacksC1573o, true);
        }
        Iterator it = this.f16679a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f16682b) {
                aVar.f16681a.onFragmentDestroyed(this.f16680b, componentCallbacksC1573o);
            }
        }
    }

    void e(ComponentCallbacksC1573o componentCallbacksC1573o, boolean z10) {
        ComponentCallbacksC1573o z02 = this.f16680b.z0();
        if (z02 != null) {
            z02.getParentFragmentManager().y0().e(componentCallbacksC1573o, true);
        }
        Iterator it = this.f16679a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f16682b) {
                aVar.f16681a.onFragmentDetached(this.f16680b, componentCallbacksC1573o);
            }
        }
    }

    void f(ComponentCallbacksC1573o componentCallbacksC1573o, boolean z10) {
        ComponentCallbacksC1573o z02 = this.f16680b.z0();
        if (z02 != null) {
            z02.getParentFragmentManager().y0().f(componentCallbacksC1573o, true);
        }
        Iterator it = this.f16679a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f16682b) {
                aVar.f16681a.onFragmentPaused(this.f16680b, componentCallbacksC1573o);
            }
        }
    }

    void g(ComponentCallbacksC1573o componentCallbacksC1573o, boolean z10) {
        Context f10 = this.f16680b.w0().f();
        ComponentCallbacksC1573o z02 = this.f16680b.z0();
        if (z02 != null) {
            z02.getParentFragmentManager().y0().g(componentCallbacksC1573o, true);
        }
        Iterator it = this.f16679a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f16682b) {
                aVar.f16681a.onFragmentPreAttached(this.f16680b, componentCallbacksC1573o, f10);
            }
        }
    }

    void h(ComponentCallbacksC1573o componentCallbacksC1573o, Bundle bundle, boolean z10) {
        ComponentCallbacksC1573o z02 = this.f16680b.z0();
        if (z02 != null) {
            z02.getParentFragmentManager().y0().h(componentCallbacksC1573o, bundle, true);
        }
        Iterator it = this.f16679a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f16682b) {
                aVar.f16681a.onFragmentPreCreated(this.f16680b, componentCallbacksC1573o, bundle);
            }
        }
    }

    void i(ComponentCallbacksC1573o componentCallbacksC1573o, boolean z10) {
        ComponentCallbacksC1573o z02 = this.f16680b.z0();
        if (z02 != null) {
            z02.getParentFragmentManager().y0().i(componentCallbacksC1573o, true);
        }
        Iterator it = this.f16679a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f16682b) {
                aVar.f16681a.onFragmentResumed(this.f16680b, componentCallbacksC1573o);
            }
        }
    }

    void j(ComponentCallbacksC1573o componentCallbacksC1573o, Bundle bundle, boolean z10) {
        ComponentCallbacksC1573o z02 = this.f16680b.z0();
        if (z02 != null) {
            z02.getParentFragmentManager().y0().j(componentCallbacksC1573o, bundle, true);
        }
        Iterator it = this.f16679a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f16682b) {
                aVar.f16681a.onFragmentSaveInstanceState(this.f16680b, componentCallbacksC1573o, bundle);
            }
        }
    }

    void k(ComponentCallbacksC1573o componentCallbacksC1573o, boolean z10) {
        ComponentCallbacksC1573o z02 = this.f16680b.z0();
        if (z02 != null) {
            z02.getParentFragmentManager().y0().k(componentCallbacksC1573o, true);
        }
        Iterator it = this.f16679a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f16682b) {
                aVar.f16681a.onFragmentStarted(this.f16680b, componentCallbacksC1573o);
            }
        }
    }

    void l(ComponentCallbacksC1573o componentCallbacksC1573o, boolean z10) {
        ComponentCallbacksC1573o z02 = this.f16680b.z0();
        if (z02 != null) {
            z02.getParentFragmentManager().y0().l(componentCallbacksC1573o, true);
        }
        Iterator it = this.f16679a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f16682b) {
                aVar.f16681a.onFragmentStopped(this.f16680b, componentCallbacksC1573o);
            }
        }
    }

    void m(ComponentCallbacksC1573o componentCallbacksC1573o, View view, Bundle bundle, boolean z10) {
        ComponentCallbacksC1573o z02 = this.f16680b.z0();
        if (z02 != null) {
            z02.getParentFragmentManager().y0().m(componentCallbacksC1573o, view, bundle, true);
        }
        Iterator it = this.f16679a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f16682b) {
                aVar.f16681a.onFragmentViewCreated(this.f16680b, componentCallbacksC1573o, view, bundle);
            }
        }
    }

    void n(ComponentCallbacksC1573o componentCallbacksC1573o, boolean z10) {
        ComponentCallbacksC1573o z02 = this.f16680b.z0();
        if (z02 != null) {
            z02.getParentFragmentManager().y0().n(componentCallbacksC1573o, true);
        }
        Iterator it = this.f16679a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.f16682b) {
                aVar.f16681a.onFragmentViewDestroyed(this.f16680b, componentCallbacksC1573o);
            }
        }
    }

    public void o(G.k kVar, boolean z10) {
        this.f16679a.add(new a(kVar, z10));
    }
}
