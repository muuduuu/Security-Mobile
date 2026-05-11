package F;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class g implements Executor {

    /* renamed from: b, reason: collision with root package name */
    private static volatile Executor f2183b;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f2184a = Executors.newFixedThreadPool(2, new a());

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f2185a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f2185a.getAndIncrement())));
            return thread;
        }
    }

    g() {
    }

    static Executor a() {
        if (f2183b != null) {
            return f2183b;
        }
        synchronized (g.class) {
            try {
                if (f2183b == null) {
                    f2183b = new g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2183b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f2184a.execute(runnable);
    }
}
