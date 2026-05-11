package Z2;

import c3.AbstractC1721a;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class c extends AbstractExecutorService {

    /* renamed from: h, reason: collision with root package name */
    private static final Class f12350h = c.class;

    /* renamed from: a, reason: collision with root package name */
    private final String f12351a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f12352b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f12353c;

    /* renamed from: d, reason: collision with root package name */
    private final BlockingQueue f12354d;

    /* renamed from: e, reason: collision with root package name */
    private final a f12355e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicInteger f12356f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicInteger f12357g;

    private class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                Runnable runnable = (Runnable) c.this.f12354d.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    AbstractC1721a.z(c.f12350h, "%s: Worker has nothing to run", c.this.f12351a);
                }
                int decrementAndGet = c.this.f12356f.decrementAndGet();
                if (c.this.f12354d.isEmpty()) {
                    AbstractC1721a.A(c.f12350h, "%s: worker finished; %d workers left", c.this.f12351a, Integer.valueOf(decrementAndGet));
                } else {
                    c.this.g();
                }
            } catch (Throwable th) {
                int decrementAndGet2 = c.this.f12356f.decrementAndGet();
                if (c.this.f12354d.isEmpty()) {
                    AbstractC1721a.A(c.f12350h, "%s: worker finished; %d workers left", c.this.f12351a, Integer.valueOf(decrementAndGet2));
                } else {
                    c.this.g();
                }
                throw th;
            }
        }

        private a() {
        }
    }

    public c(String str, int i10, Executor executor, BlockingQueue blockingQueue) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("max concurrency must be > 0");
        }
        this.f12351a = str;
        this.f12352b = executor;
        this.f12353c = i10;
        this.f12354d = blockingQueue;
        this.f12355e = new a();
        this.f12356f = new AtomicInteger(0);
        this.f12357g = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        int i10 = this.f12356f.get();
        while (i10 < this.f12353c) {
            int i11 = i10 + 1;
            if (this.f12356f.compareAndSet(i10, i11)) {
                AbstractC1721a.B(f12350h, "%s: starting worker %d of %d", this.f12351a, Integer.valueOf(i11), Integer.valueOf(this.f12353c));
                this.f12352b.execute(this.f12355e);
                return;
            } else {
                AbstractC1721a.z(f12350h, "%s: race in startWorkerIfNeeded; retrying", this.f12351a);
                i10 = this.f12356f.get();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable parameter is null");
        }
        if (!this.f12354d.offer(runnable)) {
            throw new RejectedExecutionException(this.f12351a + " queue is full, size=" + this.f12354d.size());
        }
        int size = this.f12354d.size();
        int i10 = this.f12357g.get();
        if (size > i10 && this.f12357g.compareAndSet(i10, size)) {
            AbstractC1721a.A(f12350h, "%s: max pending work in queue = %d", this.f12351a, Integer.valueOf(size));
        }
        g();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
