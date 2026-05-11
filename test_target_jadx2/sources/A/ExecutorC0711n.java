package A;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: A.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ExecutorC0711n implements Executor {

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadFactory f200c = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Object f201a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private ThreadPoolExecutor f202b = b();

    /* renamed from: A.n$a */
    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f203a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f203a.getAndIncrement())));
            return thread;
        }
    }

    private static ThreadPoolExecutor b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f200c);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: A.m
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                AbstractC0700h0.c("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
            }
        });
        return threadPoolExecutor;
    }

    void c(androidx.camera.core.impl.F f10) {
        ThreadPoolExecutor threadPoolExecutor;
        y0.f.g(f10);
        synchronized (this.f201a) {
            try {
                if (this.f202b.isShutdown()) {
                    this.f202b = b();
                }
                threadPoolExecutor = this.f202b;
            } catch (Throwable th) {
                throw th;
            }
        }
        int max = Math.max(1, f10.a().size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        y0.f.g(runnable);
        synchronized (this.f201a) {
            this.f202b.execute(runnable);
        }
    }
}
