package F;

import G.n;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.concurrent.futures.c;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class e extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: b, reason: collision with root package name */
    private static ThreadLocal f2168b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Handler f2169a;

    class a extends ThreadLocal {
        a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return F.c.e();
            }
            if (Looper.myLooper() != null) {
                return new e(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    class b implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f2170a;

        b(Runnable runnable) {
            this.f2170a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.f2170a.run();
            return null;
        }
    }

    private static class c implements RunnableScheduledFuture {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReference f2172a = new AtomicReference(null);

        /* renamed from: b, reason: collision with root package name */
        private final long f2173b;

        /* renamed from: c, reason: collision with root package name */
        private final Callable f2174c;

        /* renamed from: d, reason: collision with root package name */
        private final h8.d f2175d;

        class a implements c.InterfaceC0253c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Handler f2176a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Callable f2177b;

            /* renamed from: F.e$c$a$a, reason: collision with other inner class name */
            class RunnableC0049a implements Runnable {
                RunnableC0049a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (c.this.f2172a.getAndSet(null) != null) {
                        a aVar = a.this;
                        aVar.f2176a.removeCallbacks(c.this);
                    }
                }
            }

            a(Handler handler, Callable callable) {
                this.f2176a = handler;
                this.f2177b = callable;
            }

            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public Object a(c.a aVar) {
                aVar.a(new RunnableC0049a(), F.c.b());
                c.this.f2172a.set(aVar);
                return "HandlerScheduledFuture-" + this.f2177b.toString();
            }
        }

        c(Handler handler, long j10, Callable callable) {
            this.f2173b = j10;
            this.f2174c = callable;
            this.f2175d = androidx.concurrent.futures.c.a(new a(handler, callable));
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            return this.f2175d.cancel(z10);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f2175d.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f2173b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f2175d.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f2175d.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            c.a aVar = (c.a) this.f2172a.getAndSet(null);
            if (aVar != null) {
                try {
                    aVar.c(this.f2174c.call());
                } catch (Exception e10) {
                    aVar.f(e10);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public Object get(long j10, TimeUnit timeUnit) {
            return this.f2175d.get(j10, timeUnit);
        }
    }

    e(Handler handler) {
        this.f2169a = handler;
    }

    private RejectedExecutionException a() {
        return new RejectedExecutionException(this.f2169a + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(e.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!this.f2169a.post(runnable)) {
            throw a();
        }
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
        return schedule(new b(runnable), j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(e.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(e.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(e.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException(e.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        long uptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j10, timeUnit);
        c cVar = new c(this.f2169a, uptimeMillis, callable);
        return this.f2169a.postAtTime(cVar, uptimeMillis) ? cVar : n.o(a());
    }
}
