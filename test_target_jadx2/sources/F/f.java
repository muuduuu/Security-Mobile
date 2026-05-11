package F;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class f implements Executor {

    /* renamed from: b, reason: collision with root package name */
    private static volatile Executor f2180b;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f2181a = Executors.newSingleThreadExecutor(new a());

    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    f() {
    }

    static Executor a() {
        if (f2180b != null) {
            return f2180b;
        }
        synchronized (f.class) {
            try {
                if (f2180b == null) {
                    f2180b = new f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2180b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f2181a.execute(runnable);
    }
}
