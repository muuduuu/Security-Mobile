package F;

import F.b;
import android.os.Process;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class b implements Executor {

    /* renamed from: b, reason: collision with root package name */
    private static volatile Executor f2163b;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f2164a = Executors.newFixedThreadPool(2, new a());

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f2165a = new AtomicInteger(0);

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void b(Runnable runnable) {
            Process.setThreadPriority(-16);
            runnable.run();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            Thread thread = new Thread(new Runnable() { // from class: F.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.a.b(runnable);
                }
            });
            thread.setName(String.format(Locale.US, "CameraX-camerax_audio_%d", Integer.valueOf(this.f2165a.getAndIncrement())));
            return thread;
        }
    }

    static Executor a() {
        if (f2163b != null) {
            return f2163b;
        }
        synchronized (b.class) {
            try {
                if (f2163b == null) {
                    f2163b = new b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2163b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f2164a.execute(runnable);
    }
}
