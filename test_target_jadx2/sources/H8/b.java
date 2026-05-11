package H8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final H8.a f3818a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile H8.a f3819b;

    /* renamed from: H8.b$b, reason: collision with other inner class name */
    private static class C0077b implements H8.a {
        private C0077b() {
        }

        @Override // H8.a
        public ExecutorService a(ThreadFactory threadFactory, c cVar) {
            return b(1, threadFactory, cVar);
        }

        public ExecutorService b(int i10, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0077b c0077b = new C0077b();
        f3818a = c0077b;
        f3819b = c0077b;
    }

    public static H8.a a() {
        return f3819b;
    }
}
