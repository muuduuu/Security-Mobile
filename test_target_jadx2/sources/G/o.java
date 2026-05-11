package G;

import A.AbstractC0700h0;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
abstract class o implements h8.d {

    static class a extends o {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f2749a;

        a(Throwable th) {
            this.f2749a = th;
        }

        @Override // G.o, java.util.concurrent.Future
        public Object get() {
            throw new ExecutionException(this.f2749a);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f2749a + "]]";
        }
    }

    static final class b extends a implements ScheduledFuture {
        b(Throwable th) {
            super(th);
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }
    }

    static final class c extends o {

        /* renamed from: b, reason: collision with root package name */
        static final o f2750b = new c(null);

        /* renamed from: a, reason: collision with root package name */
        private final Object f2751a;

        c(Object obj) {
            this.f2751a = obj;
        }

        @Override // G.o, java.util.concurrent.Future
        public Object get() {
            return this.f2751a;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f2751a + "]]";
        }
    }

    o() {
    }

    public static h8.d b() {
        return c.f2750b;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return false;
    }

    @Override // h8.d
    public void e(Runnable runnable, Executor executor) {
        y0.f.g(runnable);
        y0.f.g(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            AbstractC0700h0.d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e10);
        }
    }

    @Override // java.util.concurrent.Future
    public abstract Object get();

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        y0.f.g(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
