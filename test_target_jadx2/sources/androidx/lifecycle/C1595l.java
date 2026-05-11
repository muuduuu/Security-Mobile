package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1595l {

    /* renamed from: a, reason: collision with root package name */
    public static final C1595l f17136a = new C1595l();

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f17137b = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.l$a */
    public static final class a extends AbstractC1588e {
        @Override // androidx.lifecycle.AbstractC1588e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            D.f17036b.c(activity);
        }
    }

    private C1595l() {
    }

    public static final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f17137b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
