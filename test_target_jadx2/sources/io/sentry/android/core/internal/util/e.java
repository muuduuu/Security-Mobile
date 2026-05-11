package io.sentry.android.core.internal.util;

import android.content.ContentProvider;
import io.sentry.C3446q0;
import io.sentry.android.core.N;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final N f34912a;

    public e() {
        this(new N(C3446q0.e()));
    }

    public void a(ContentProvider contentProvider) {
        int d10 = this.f34912a.d();
        if (d10 < 26 || d10 > 28) {
            return;
        }
        String callingPackage = contentProvider.getCallingPackage();
        String packageName = contentProvider.getContext().getPackageName();
        if (callingPackage == null || !callingPackage.equals(packageName)) {
            throw new SecurityException("Provider does not allow for granting of Uri permissions");
        }
    }

    public e(N n10) {
        this.f34912a = n10;
    }
}
