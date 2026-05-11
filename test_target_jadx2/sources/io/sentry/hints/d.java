package io.sentry.hints;

import io.sentry.ILogger;
import io.sentry.K1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class d implements f, h {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f35144a = new CountDownLatch(1);

    /* renamed from: b, reason: collision with root package name */
    private final long f35145b;

    /* renamed from: c, reason: collision with root package name */
    private final ILogger f35146c;

    public d(long j10, ILogger iLogger) {
        this.f35145b = j10;
        this.f35146c = iLogger;
    }

    @Override // io.sentry.hints.f
    public void b() {
        this.f35144a.countDown();
    }

    @Override // io.sentry.hints.h
    public boolean e() {
        try {
            return this.f35144a.await(this.f35145b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            this.f35146c.b(K1.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e10);
            return false;
        }
    }
}
