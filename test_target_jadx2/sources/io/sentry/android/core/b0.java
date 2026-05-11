package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.K1;
import io.sentry.P1;

/* loaded from: classes2.dex */
public final class b0 {
    public boolean a(String str, ILogger iLogger) {
        return c(str, iLogger) != null;
    }

    public boolean b(String str, P1 p12) {
        return a(str, p12 != null ? p12.getLogger() : null);
    }

    public Class c(String str, ILogger iLogger) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            if (iLogger == null) {
                return null;
            }
            iLogger.b(K1.DEBUG, "Class not available:" + str, e10);
            return null;
        } catch (UnsatisfiedLinkError e11) {
            if (iLogger == null) {
                return null;
            }
            iLogger.b(K1.ERROR, "Failed to load (UnsatisfiedLinkError) " + str, e11);
            return null;
        } catch (Throwable th) {
            if (iLogger == null) {
                return null;
            }
            iLogger.b(K1.ERROR, "Failed to initialize " + str, th);
            return null;
        }
    }
}
