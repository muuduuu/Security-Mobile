package io.sentry.android.core.internal.util;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import io.sentry.C3405e;
import io.sentry.K1;

/* loaded from: classes2.dex */
public abstract class c {
    public static C3405e a(String str) {
        C3405e c3405e = new C3405e();
        c3405e.l("session");
        c3405e.i(Keys.STATE, str);
        c3405e.h("app.lifecycle");
        c3405e.j(K1.INFO);
        return c3405e;
    }
}
