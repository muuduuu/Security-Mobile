package io.sentry.android.core;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class Q {

    /* renamed from: b, reason: collision with root package name */
    private static final Q f34751b = new Q();

    /* renamed from: a, reason: collision with root package name */
    private WeakReference f34752a;

    private Q() {
    }

    public static Q c() {
        return f34751b;
    }

    public void a() {
        this.f34752a = null;
    }

    public Activity b() {
        WeakReference weakReference = this.f34752a;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public void d(Activity activity) {
        WeakReference weakReference = this.f34752a;
        if (weakReference == null || weakReference.get() != activity) {
            this.f34752a = new WeakReference(activity);
        }
    }
}
