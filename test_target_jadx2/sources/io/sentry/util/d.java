package io.sentry.util;

/* loaded from: classes2.dex */
public abstract class d {
    public static Throwable a(Throwable th) {
        n.c(th, "throwable cannot be null");
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
        }
        return th;
    }
}
