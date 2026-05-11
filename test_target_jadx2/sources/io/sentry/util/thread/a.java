package io.sentry.util.thread;

import io.sentry.protocol.x;

/* loaded from: classes2.dex */
public interface a {
    boolean a(long j10);

    default boolean b(x xVar) {
        Long l10 = xVar.l();
        return l10 != null && a(l10.longValue());
    }

    default boolean c(Thread thread) {
        return a(thread.getId());
    }

    default boolean d() {
        return c(Thread.currentThread());
    }
}
