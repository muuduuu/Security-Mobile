package Z2;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class e extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f12359a;

    public e(Handler handler) {
        this.f12359a = handler;
    }

    public boolean a() {
        return Thread.currentThread() == this.f12359a.getLooper().getThread();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f newTaskFor(Runnable runnable, Object obj) {
        return new f(this.f12359a, runnable, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public f newTaskFor(Callable callable) {
        return new f(this.f12359a, callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ScheduledFuture submit(Runnable runnable) {
        return submit(runnable, null);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f12359a.post(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public ScheduledFuture submit(Runnable runnable, Object obj) {
        runnable.getClass();
        f newTaskFor = newTaskFor(runnable, obj);
        execute(newTaskFor);
        return newTaskFor;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ScheduledFuture submit(Callable callable) {
        callable.getClass();
        f newTaskFor = newTaskFor(callable);
        execute(newTaskFor);
        return newTaskFor;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        f newTaskFor = newTaskFor(runnable, null);
        this.f12359a.postDelayed(newTaskFor, timeUnit.toMillis(j10));
        return newTaskFor;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        f newTaskFor = newTaskFor(callable);
        this.f12359a.postDelayed(newTaskFor, timeUnit.toMillis(j10));
        return newTaskFor;
    }
}
