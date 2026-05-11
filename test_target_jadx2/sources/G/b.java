package G;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
class b extends d implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    private G.a f2712c;

    /* renamed from: d, reason: collision with root package name */
    private final BlockingQueue f2713d = new LinkedBlockingQueue(1);

    /* renamed from: e, reason: collision with root package name */
    private final CountDownLatch f2714e = new CountDownLatch(1);

    /* renamed from: f, reason: collision with root package name */
    private h8.d f2715f;

    /* renamed from: g, reason: collision with root package name */
    volatile h8.d f2716g;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h8.d f2717a;

        a(h8.d dVar) {
            this.f2717a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    b.this.b(n.m(this.f2717a));
                } catch (CancellationException unused) {
                    b.this.cancel(false);
                    b.this.f2716g = null;
                    return;
                } catch (ExecutionException e10) {
                    b.this.c(e10.getCause());
                }
                b.this.f2716g = null;
            } catch (Throwable th) {
                b.this.f2716g = null;
                throw th;
            }
        }
    }

    b(G.a aVar, h8.d dVar) {
        this.f2712c = (G.a) y0.f.g(aVar);
        this.f2715f = (h8.d) y0.f.g(dVar);
    }

    private void g(Future future, boolean z10) {
        if (future != null) {
            future.cancel(z10);
        }
    }

    private void h(BlockingQueue blockingQueue, Object obj) {
        boolean z10 = false;
        while (true) {
            try {
                blockingQueue.put(obj);
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private Object i(BlockingQueue blockingQueue) {
        Object take;
        boolean z10 = false;
        while (true) {
            try {
                take = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    @Override // G.d, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        if (!super.cancel(z10)) {
            return false;
        }
        h(this.f2713d, Boolean.valueOf(z10));
        g(this.f2715f, z10);
        g(this.f2716g, z10);
        return true;
    }

    @Override // G.d, java.util.concurrent.Future
    public Object get() {
        if (!isDone()) {
            h8.d dVar = this.f2715f;
            if (dVar != null) {
                dVar.get();
            }
            this.f2714e.await();
            h8.d dVar2 = this.f2716g;
            if (dVar2 != null) {
                dVar2.get();
            }
        }
        return super.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        h8.d apply;
        try {
            try {
                try {
                    try {
                        try {
                            apply = this.f2712c.apply(n.m(this.f2715f));
                            this.f2716g = apply;
                        } catch (Exception e10) {
                            c(e10);
                        }
                    } catch (Error e11) {
                        c(e11);
                    }
                } finally {
                    this.f2712c = null;
                    this.f2715f = null;
                    this.f2714e.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e12) {
                c(e12.getCause());
            }
        } catch (UndeclaredThrowableException e13) {
            c(e13.getCause());
        }
        if (!isCancelled()) {
            apply.e(new a(apply), F.c.b());
        } else {
            apply.cancel(((Boolean) i(this.f2713d)).booleanValue());
            this.f2716g = null;
        }
    }

    @Override // G.d, java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j10 = timeUnit2.convert(j10, timeUnit);
                timeUnit = timeUnit2;
            }
            h8.d dVar = this.f2715f;
            if (dVar != null) {
                long nanoTime = System.nanoTime();
                dVar.get(j10, timeUnit);
                j10 -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.f2714e.await(j10, timeUnit)) {
                j10 -= Math.max(0L, System.nanoTime() - nanoTime2);
                h8.d dVar2 = this.f2716g;
                if (dVar2 != null) {
                    dVar2.get(j10, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return super.get(j10, timeUnit);
    }
}
