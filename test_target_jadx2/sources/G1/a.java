package G1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f2806b = new a();

    /* renamed from: c, reason: collision with root package name */
    private static final int f2807c;

    /* renamed from: d, reason: collision with root package name */
    static final int f2808d;

    /* renamed from: e, reason: collision with root package name */
    static final int f2809e;

    /* renamed from: a, reason: collision with root package name */
    private final Executor f2810a = new b();

    private static class b implements Executor {
        private b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f2807c = availableProcessors;
        f2808d = availableProcessors + 1;
        f2809e = (availableProcessors * 2) + 1;
    }

    private a() {
    }

    public static void a(ThreadPoolExecutor threadPoolExecutor, boolean z10) {
        threadPoolExecutor.allowCoreThreadTimeOut(z10);
    }

    public static ExecutorService b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f2808d, f2809e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    public static Executor c() {
        return f2806b.f2810a;
    }
}
