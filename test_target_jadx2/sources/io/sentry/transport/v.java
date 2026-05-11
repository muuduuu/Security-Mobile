package io.sentry.transport;

import io.sentry.ILogger;
import io.sentry.K1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class v extends ThreadPoolExecutor {

    /* renamed from: a, reason: collision with root package name */
    private final int f35538a;

    /* renamed from: b, reason: collision with root package name */
    private final ILogger f35539b;

    /* renamed from: c, reason: collision with root package name */
    private final z f35540c;

    static final class a implements Future {
        a() {
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            return true;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            throw new CancellationException();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public Object get(long j10, TimeUnit timeUnit) {
            throw new CancellationException();
        }
    }

    public v(int i10, int i11, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, ILogger iLogger) {
        super(i10, i10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler);
        this.f35540c = new z();
        this.f35538a = i11;
        this.f35539b = iLogger;
    }

    private boolean a() {
        return this.f35540c.b() < this.f35538a;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        try {
            super.afterExecute(runnable, th);
        } finally {
            this.f35540c.a();
        }
    }

    void b(long j10) {
        try {
            this.f35540c.d(j10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            this.f35539b.b(K1.ERROR, "Failed to wait till idle", e10);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        if (a()) {
            this.f35540c.c();
            return super.submit(runnable);
        }
        this.f35539b.c(K1.WARNING, "Submit cancelled", new Object[0]);
        return new a();
    }
}
