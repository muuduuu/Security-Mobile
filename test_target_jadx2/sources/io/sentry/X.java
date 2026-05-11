package io.sentry;

import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public interface X {
    default void a() {
        I1.c().a(d());
    }

    default String d() {
        return getClass().getSimpleName().replace("Sentry", BuildConfig.FLAVOR).replace("Integration", BuildConfig.FLAVOR).replace("Interceptor", BuildConfig.FLAVOR).replace("EventProcessor", BuildConfig.FLAVOR);
    }
}
