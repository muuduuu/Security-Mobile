package m;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: m.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3633d extends AbstractC3634e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f37254a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f37255b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c, reason: collision with root package name */
    private volatile Handler f37256c;

    /* renamed from: m.d$a */
    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f37257a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f37257a.getAndIncrement());
            return thread;
        }
    }

    /* renamed from: m.d$b */
    private static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    private static Handler e(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // m.AbstractC3634e
    public void a(Runnable runnable) {
        this.f37255b.execute(runnable);
    }

    @Override // m.AbstractC3634e
    public boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // m.AbstractC3634e
    public void d(Runnable runnable) {
        if (this.f37256c == null) {
            synchronized (this.f37254a) {
                try {
                    if (this.f37256c == null) {
                        this.f37256c = e(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f37256c.post(runnable);
    }
}
