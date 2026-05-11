package v9;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v9.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4975d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public static final C4975d f44033a = new C4975d();

    /* renamed from: b, reason: collision with root package name */
    private static final String f44034b = "Gobbler.AppLifecycleObserver";

    /* renamed from: c, reason: collision with root package name */
    private static AtomicInteger f44035c = new AtomicInteger(0);

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f44036d;

    private C4975d() {
    }

    public final EnumC4972a a() {
        boolean z10 = f44035c.get() > 0;
        return z10 ? EnumC4972a.INTERACTIVE : (z10 || !f44036d) ? (z10 || f44036d) ? EnumC4972a.UNKNOWN : EnumC4972a.BACKGROUND : EnumC4972a.PROCESSING;
    }

    public final void b(boolean z10) {
        f44036d = z10;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity p02, Bundle bundle) {
        Intrinsics.checkNotNullParameter(p02, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity p02, Bundle p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        f44035c.incrementAndGet();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (f44035c.get() <= 0 || f44035c.decrementAndGet() != 0) {
            return;
        }
        B9.a.f540a.g();
    }
}
