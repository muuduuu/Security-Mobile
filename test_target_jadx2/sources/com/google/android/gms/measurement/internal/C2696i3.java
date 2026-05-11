package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.i3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2696i3 extends U3 {

    /* renamed from: k, reason: collision with root package name */
    private static final AtomicLong f26115k = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    private C2688h3 f26116c;

    /* renamed from: d, reason: collision with root package name */
    private C2688h3 f26117d;

    /* renamed from: e, reason: collision with root package name */
    private final PriorityBlockingQueue f26118e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue f26119f;

    /* renamed from: g, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f26120g;

    /* renamed from: h, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f26121h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f26122i;

    /* renamed from: j, reason: collision with root package name */
    private final Semaphore f26123j;

    C2696i3(C2760q3 c2760q3) {
        super(c2760q3);
        this.f26122i = new Object();
        this.f26123j = new Semaphore(2);
        this.f26118e = new PriorityBlockingQueue();
        this.f26119f = new LinkedBlockingQueue();
        this.f26120g = new C2672f3(this, "Thread death: Uncaught exception on worker thread");
        this.f26121h = new C2672f3(this, "Thread death: Uncaught exception on network thread");
    }

    private final void F(C2680g3 c2680g3) {
        synchronized (this.f26122i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f26118e;
                priorityBlockingQueue.add(c2680g3);
                C2688h3 c2688h3 = this.f26116c;
                if (c2688h3 == null) {
                    C2688h3 c2688h32 = new C2688h3(this, "Measurement Worker", priorityBlockingQueue);
                    this.f26116c = c2688h32;
                    c2688h32.setUncaughtExceptionHandler(this.f26120g);
                    this.f26116c.start();
                } else {
                    c2688h3.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void A(C2688h3 c2688h3) {
        this.f26117d = null;
    }

    final /* synthetic */ Object B() {
        return this.f26122i;
    }

    final /* synthetic */ Semaphore C() {
        return this.f26123j;
    }

    final /* synthetic */ boolean D() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.T3
    public final void g() {
        if (Thread.currentThread() != this.f26117d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.T3
    public final void h() {
        if (Thread.currentThread() != this.f26116c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.U3
    protected final boolean i() {
        return false;
    }

    public final void o() {
        if (Thread.currentThread() == this.f26116c) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean p() {
        return Thread.currentThread() == this.f26116c;
    }

    public final boolean q() {
        return Thread.currentThread() == this.f26117d;
    }

    public final Future r(Callable callable) {
        l();
        AbstractC1287s.m(callable);
        C2680g3 c2680g3 = new C2680g3(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f26116c) {
            if (!this.f26118e.isEmpty()) {
                this.f25694a.a().r().a("Callable skipped the worker queue.");
            }
            c2680g3.run();
        } else {
            F(c2680g3);
        }
        return c2680g3;
    }

    public final Future s(Callable callable) {
        l();
        AbstractC1287s.m(callable);
        C2680g3 c2680g3 = new C2680g3(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f26116c) {
            c2680g3.run();
        } else {
            F(c2680g3);
        }
        return c2680g3;
    }

    public final void t(Runnable runnable) {
        l();
        AbstractC1287s.m(runnable);
        F(new C2680g3(this, runnable, false, "Task exception on worker thread"));
    }

    final Object u(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f25694a.b().t(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                A2 r10 = this.f25694a.a().r();
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append("Interrupted waiting for ");
                sb2.append(str);
                r10.a(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f25694a.a().r().a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void v(Runnable runnable) {
        l();
        AbstractC1287s.m(runnable);
        F(new C2680g3(this, runnable, true, "Task exception on worker thread"));
    }

    public final void w(Runnable runnable) {
        l();
        AbstractC1287s.m(runnable);
        C2680g3 c2680g3 = new C2680g3(this, runnable, false, "Task exception on network thread");
        synchronized (this.f26122i) {
            try {
                BlockingQueue blockingQueue = this.f26119f;
                blockingQueue.add(c2680g3);
                C2688h3 c2688h3 = this.f26117d;
                if (c2688h3 == null) {
                    C2688h3 c2688h32 = new C2688h3(this, "Measurement Network", blockingQueue);
                    this.f26117d = c2688h32;
                    c2688h32.setUncaughtExceptionHandler(this.f26121h);
                    this.f26117d.start();
                } else {
                    c2688h3.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ C2688h3 x() {
        return this.f26116c;
    }

    final /* synthetic */ void y(C2688h3 c2688h3) {
        this.f26116c = null;
    }

    final /* synthetic */ C2688h3 z() {
        return this.f26117d;
    }
}
