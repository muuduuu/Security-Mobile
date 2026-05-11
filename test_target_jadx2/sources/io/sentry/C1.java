package io.sentry;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class C1 implements P {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f34435a;

    private static final class b implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private int f34436a;

        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryExecutorServiceThreadFactory-");
            int i10 = this.f34436a;
            this.f34436a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    C1(ScheduledExecutorService scheduledExecutorService) {
        this.f34435a = scheduledExecutorService;
    }

    @Override // io.sentry.P
    public void a(long j10) {
        synchronized (this.f34435a) {
            if (!this.f34435a.isShutdown()) {
                this.f34435a.shutdown();
                try {
                    if (!this.f34435a.awaitTermination(j10, TimeUnit.MILLISECONDS)) {
                        this.f34435a.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    this.f34435a.shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // io.sentry.P
    public Future b(Runnable runnable, long j10) {
        return this.f34435a.schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.P
    public boolean isClosed() {
        boolean isShutdown;
        synchronized (this.f34435a) {
            isShutdown = this.f34435a.isShutdown();
        }
        return isShutdown;
    }

    @Override // io.sentry.P
    public Future submit(Runnable runnable) {
        return this.f34435a.submit(runnable);
    }

    C1() {
        this(Executors.newSingleThreadScheduledExecutor(new b()));
    }
}
