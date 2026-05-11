package com.facebook.react.common.futures;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SimpleSettableFuture implements Future {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f21400a = new CountDownLatch(1);

    /* renamed from: b, reason: collision with root package name */
    private Object f21401b;

    /* renamed from: c, reason: collision with root package name */
    private Exception f21402c;

    private final void a() {
        if (this.f21400a.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }

    public final Object b() {
        try {
            return get();
        } catch (InterruptedException e10) {
            throw new RuntimeException(e10);
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final void c(Object obj) {
        a();
        this.f21401b = obj;
        this.f21400a.countDown();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        throw new UnsupportedOperationException();
    }

    public final void d(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        a();
        this.f21402c = exception;
        this.f21400a.countDown();
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        this.f21400a.await();
        if (this.f21402c == null) {
            return this.f21401b;
        }
        throw new ExecutionException(this.f21402c);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f21400a.getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (this.f21400a.await(j10, unit)) {
            if (this.f21402c == null) {
                return this.f21401b;
            }
            throw new ExecutionException(this.f21402c);
        }
        throw new TimeoutException("Timed out waiting for result");
    }
}
