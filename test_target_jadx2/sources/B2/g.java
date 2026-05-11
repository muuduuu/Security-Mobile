package b2;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class g implements ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicInteger f18514d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    private final ThreadGroup f18515a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f18516b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    private final String f18517c;

    public g() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f18515a = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f18517c = "lottie-" + f18514d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f18515a, runnable, this.f18517c + this.f18516b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
