package io.sentry;

import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public interface P {
    void a(long j10);

    Future b(Runnable runnable, long j10);

    boolean isClosed();

    Future submit(Runnable runnable);
}
