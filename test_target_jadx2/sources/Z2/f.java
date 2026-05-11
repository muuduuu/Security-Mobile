package Z2;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class f implements RunnableFuture, ScheduledFuture {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f12360a;

    /* renamed from: b, reason: collision with root package name */
    private final FutureTask f12361b;

    public f(Handler handler, Callable callable) {
        this.f12360a = handler;
        this.f12361b = new FutureTask(callable);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f12361b.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f12361b.get();
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f12361b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f12361b.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.f12361b.run();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return this.f12361b.get(j10, timeUnit);
    }

    public f(Handler handler, Runnable runnable, Object obj) {
        this.f12360a = handler;
        this.f12361b = new FutureTask(runnable, obj);
    }
}
