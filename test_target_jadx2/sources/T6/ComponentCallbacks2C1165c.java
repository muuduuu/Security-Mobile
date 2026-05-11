package T6;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: T6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ComponentCallbacks2C1165c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    private static final ComponentCallbacks2C1165c f9399e = new ComponentCallbacks2C1165c();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f9400a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f9401b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f9402c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f9403d = false;

    /* renamed from: T6.c$a */
    public interface a {
        void a(boolean z10);
    }

    private ComponentCallbacks2C1165c() {
    }

    public static ComponentCallbacks2C1165c b() {
        return f9399e;
    }

    public static void c(Application application) {
        ComponentCallbacks2C1165c componentCallbacks2C1165c = f9399e;
        synchronized (componentCallbacks2C1165c) {
            try {
                if (!componentCallbacks2C1165c.f9403d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C1165c);
                    application.registerComponentCallbacks(componentCallbacks2C1165c);
                    componentCallbacks2C1165c.f9403d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f(boolean z10) {
        synchronized (f9399e) {
            try {
                Iterator it = this.f9402c.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(a aVar) {
        synchronized (f9399e) {
            this.f9402c.add(aVar);
        }
    }

    public boolean d() {
        return this.f9400a.get();
    }

    public boolean e(boolean z10) {
        AtomicBoolean atomicBoolean = this.f9401b;
        if (!atomicBoolean.get()) {
            if (com.google.android.gms.common.util.p.b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f9400a.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f9401b;
        boolean compareAndSet = this.f9400a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f9401b;
        boolean compareAndSet = this.f9400a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f9400a.compareAndSet(false, true)) {
            this.f9401b.set(true);
            f(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
