package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1592i;
import androidx.lifecycle.InterfaceC1590g;
import androidx.lifecycle.V;

/* loaded from: classes.dex */
class U implements InterfaceC1590g, k1.f, androidx.lifecycle.X {

    /* renamed from: a, reason: collision with root package name */
    private final ComponentCallbacksC1573o f16856a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.lifecycle.W f16857b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f16858c;

    /* renamed from: d, reason: collision with root package name */
    private V.c f16859d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.lifecycle.r f16860e = null;

    /* renamed from: f, reason: collision with root package name */
    private k1.e f16861f = null;

    U(ComponentCallbacksC1573o componentCallbacksC1573o, androidx.lifecycle.W w10, Runnable runnable) {
        this.f16856a = componentCallbacksC1573o;
        this.f16857b = w10;
        this.f16858c = runnable;
    }

    void a(AbstractC1592i.a aVar) {
        this.f16860e.i(aVar);
    }

    void b() {
        if (this.f16860e == null) {
            this.f16860e = new androidx.lifecycle.r(this);
            k1.e a10 = k1.e.a(this);
            this.f16861f = a10;
            a10.c();
            this.f16858c.run();
        }
    }

    boolean c() {
        return this.f16860e != null;
    }

    void d(Bundle bundle) {
        this.f16861f.d(bundle);
    }

    void e(Bundle bundle) {
        this.f16861f.e(bundle);
    }

    void f(AbstractC1592i.b bVar) {
        this.f16860e.n(bVar);
    }

    @Override // androidx.lifecycle.InterfaceC1590g
    public Z0.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f16856a.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        Z0.b bVar = new Z0.b();
        if (application != null) {
            bVar.c(V.a.f17104h, application);
        }
        bVar.c(androidx.lifecycle.J.f17050a, this.f16856a);
        bVar.c(androidx.lifecycle.J.f17051b, this);
        if (this.f16856a.getArguments() != null) {
            bVar.c(androidx.lifecycle.J.f17052c, this.f16856a.getArguments());
        }
        return bVar;
    }

    @Override // androidx.lifecycle.InterfaceC1590g
    public V.c getDefaultViewModelProviderFactory() {
        Application application;
        V.c defaultViewModelProviderFactory = this.f16856a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f16856a.mDefaultFactory)) {
            this.f16859d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f16859d == null) {
            Context applicationContext = this.f16856a.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            ComponentCallbacksC1573o componentCallbacksC1573o = this.f16856a;
            this.f16859d = new androidx.lifecycle.M(application, componentCallbacksC1573o, componentCallbacksC1573o.getArguments());
        }
        return this.f16859d;
    }

    @Override // androidx.lifecycle.InterfaceC1599p
    public AbstractC1592i getLifecycle() {
        b();
        return this.f16860e;
    }

    @Override // k1.f
    public k1.d getSavedStateRegistry() {
        b();
        return this.f16861f.b();
    }

    @Override // androidx.lifecycle.X
    public androidx.lifecycle.W getViewModelStore() {
        b();
        return this.f16857b;
    }
}
