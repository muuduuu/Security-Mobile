package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.K1;

/* loaded from: classes2.dex */
public abstract class m {
    public static void a(Class cls, Object obj, ILogger iLogger) {
        iLogger.c(K1.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }
}
