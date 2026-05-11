package io.sentry;

import java.io.File;

/* loaded from: classes2.dex */
public interface T0 {
    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void c(ILogger iLogger, String str, AbstractC3438p abstractC3438p, File file) {
        K1 k12 = K1.DEBUG;
        iLogger.c(k12, "Started processing cached files from %s", str);
        abstractC3438p.e(file);
        iLogger.c(k12, "Finished processing cached files from %s", str);
    }

    default Q0 a(final AbstractC3438p abstractC3438p, final String str, final ILogger iLogger) {
        final File file = new File(str);
        return new Q0() { // from class: io.sentry.S0
            @Override // io.sentry.Q0
            public final void a() {
                T0.c(ILogger.this, str, abstractC3438p, file);
            }
        };
    }

    Q0 d(L l10, P1 p12);

    default boolean e(String str, ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        iLogger.c(K1.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }
}
