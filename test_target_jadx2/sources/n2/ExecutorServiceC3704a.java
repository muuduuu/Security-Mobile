package n2;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorServiceC3704a implements ExecutorService {

    /* renamed from: b, reason: collision with root package name */
    private static final long f37541b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c, reason: collision with root package name */
    private static volatile int f37542c;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f37543a;

    /* renamed from: n2.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f37544a;

        /* renamed from: b, reason: collision with root package name */
        private int f37545b;

        /* renamed from: c, reason: collision with root package name */
        private int f37546c;

        /* renamed from: d, reason: collision with root package name */
        private ThreadFactory f37547d = new c();

        /* renamed from: e, reason: collision with root package name */
        private e f37548e = e.f37562d;

        /* renamed from: f, reason: collision with root package name */
        private String f37549f;

        /* renamed from: g, reason: collision with root package name */
        private long f37550g;

        b(boolean z10) {
            this.f37544a = z10;
        }

        public ExecutorServiceC3704a a() {
            if (TextUtils.isEmpty(this.f37549f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f37549f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f37545b, this.f37546c, this.f37550g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f37547d, this.f37549f, this.f37548e, this.f37544a));
            if (this.f37550g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new ExecutorServiceC3704a(threadPoolExecutor);
        }

        public b b(String str) {
            this.f37549f = str;
            return this;
        }

        public b c(int i10) {
            this.f37545b = i10;
            this.f37546c = i10;
            return this;
        }
    }

    /* renamed from: n2.a$c */
    private static final class c implements ThreadFactory {

        /* renamed from: n2.a$c$a, reason: collision with other inner class name */
        class C0570a extends Thread {
            C0570a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0570a(runnable);
        }
    }

    /* renamed from: n2.a$d */
    private static final class d implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final ThreadFactory f37552a;

        /* renamed from: b, reason: collision with root package name */
        private final String f37553b;

        /* renamed from: c, reason: collision with root package name */
        final e f37554c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f37555d;

        /* renamed from: e, reason: collision with root package name */
        private final AtomicInteger f37556e = new AtomicInteger();

        /* renamed from: n2.a$d$a, reason: collision with other inner class name */
        class RunnableC0571a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f37557a;

            RunnableC0571a(Runnable runnable) {
                this.f37557a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f37555d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f37557a.run();
                } catch (Throwable th) {
                    d.this.f37554c.a(th);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z10) {
            this.f37552a = threadFactory;
            this.f37553b = str;
            this.f37554c = eVar;
            this.f37555d = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f37552a.newThread(new RunnableC0571a(runnable));
            newThread.setName("glide-" + this.f37553b + "-thread-" + this.f37556e.getAndIncrement());
            return newThread;
        }
    }

    ExecutorServiceC3704a(ExecutorService executorService) {
        this.f37543a = executorService;
    }

    static int a() {
        return b() >= 4 ? 2 : 1;
    }

    public static int b() {
        if (f37542c == 0) {
            f37542c = Math.min(4, n2.b.a());
        }
        return f37542c;
    }

    public static b c() {
        return new b(true).c(a()).b("animation");
    }

    public static ExecutorServiceC3704a d() {
        return c().a();
    }

    public static b f() {
        return new b(true).c(1).b("disk-cache");
    }

    public static ExecutorServiceC3704a g() {
        return f().a();
    }

    public static b h() {
        return new b(false).c(b()).b("source");
    }

    public static ExecutorServiceC3704a i() {
        return h().a();
    }

    public static ExecutorServiceC3704a j() {
        return new ExecutorServiceC3704a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f37541b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f37562d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f37543a.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f37543a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f37543a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f37543a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f37543a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f37543a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f37543a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f37543a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f37543a.submit(runnable);
    }

    public String toString() {
        return this.f37543a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f37543a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f37543a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f37543a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f37543a.submit(callable);
    }

    /* renamed from: n2.a$e */
    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f37559a = new C0572a();

        /* renamed from: b, reason: collision with root package name */
        public static final e f37560b;

        /* renamed from: c, reason: collision with root package name */
        public static final e f37561c;

        /* renamed from: d, reason: collision with root package name */
        public static final e f37562d;

        /* renamed from: n2.a$e$b */
        class b implements e {
            b() {
            }

            @Override // n2.ExecutorServiceC3704a.e
            public void a(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        /* renamed from: n2.a$e$c */
        class c implements e {
            c() {
            }

            @Override // n2.ExecutorServiceC3704a.e
            public void a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f37560b = bVar;
            f37561c = new c();
            f37562d = bVar;
        }

        void a(Throwable th);

        /* renamed from: n2.a$e$a, reason: collision with other inner class name */
        class C0572a implements e {
            C0572a() {
            }

            @Override // n2.ExecutorServiceC3704a.e
            public void a(Throwable th) {
            }
        }
    }
}
