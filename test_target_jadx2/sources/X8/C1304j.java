package X8;

import V6.AbstractC1287s;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q7.AbstractExecutorServiceC3926B;

/* renamed from: X8.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1304j extends AbstractExecutorServiceC3926B {

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f11793b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f11794a;

    public C1304j() {
        final ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: X8.v
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return defaultThreadFactory.newThread(new Runnable() { // from class: X8.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1304j.d(runnable);
                    }
                });
            }
        });
        this.f11794a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    static /* synthetic */ void d(Runnable runnable) {
        f11793b.set(new ArrayDeque());
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Deque deque, Runnable runnable) {
        AbstractC1287s.m(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // q7.AbstractC3933g
    protected final /* synthetic */ Object a() {
        return this.f11794a;
    }

    @Override // q7.AbstractExecutorServiceC3926B
    protected final ExecutorService b() {
        return this.f11794a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Deque deque = (Deque) f11793b.get();
        if (deque == null || deque.size() > 1) {
            this.f11794a.execute(new Runnable() { // from class: X8.w
                @Override // java.lang.Runnable
                public final void run() {
                    C1304j.f((Deque) C1304j.f11793b.get(), runnable);
                }
            });
        } else {
            f(deque, runnable);
        }
    }
}
