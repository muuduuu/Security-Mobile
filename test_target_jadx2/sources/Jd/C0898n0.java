package Jd;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.coroutines.CoroutineContext;

/* renamed from: Jd.n0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0898n0 extends AbstractC0896m0 implements X {

    /* renamed from: d, reason: collision with root package name */
    private final Executor f5051d;

    public C0898n0(Executor executor) {
        this.f5051d = executor;
        if (z0() instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) z0()).setRemoveOnCancelPolicy(true);
        }
    }

    private final void y0(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        z0.c(coroutineContext, AbstractC0892k0.a("The task was rejected", rejectedExecutionException));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor z02 = z0();
        ExecutorService executorService = z02 instanceof ExecutorService ? (ExecutorService) z02 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0898n0) && ((C0898n0) obj).z0() == z0();
    }

    public int hashCode() {
        return System.identityHashCode(z0());
    }

    @Override // Jd.J
    public void s(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            Executor z02 = z0();
            AbstractC0875c.a();
            z02.execute(runnable);
        } catch (RejectedExecutionException e10) {
            AbstractC0875c.a();
            y0(coroutineContext, e10);
            C0874b0.b().s(coroutineContext, runnable);
        }
    }

    @Override // Jd.J
    public String toString() {
        return z0().toString();
    }

    public Executor z0() {
        return this.f5051d;
    }
}
