package io.sentry;

import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
final class D {

    /* renamed from: g, reason: collision with root package name */
    private static final long f34437g = TimeUnit.HOURS.toMillis(5);

    /* renamed from: h, reason: collision with root package name */
    private static final long f34438h = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: i, reason: collision with root package name */
    private static D f34439i;

    /* renamed from: a, reason: collision with root package name */
    private final long f34440a;

    /* renamed from: b, reason: collision with root package name */
    private volatile String f34441b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f34442c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f34443d;

    /* renamed from: e, reason: collision with root package name */
    private final Callable f34444e;

    /* renamed from: f, reason: collision with root package name */
    private final ExecutorService f34445f;

    private static final class b implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private int f34446a;

        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryHostnameCache-");
            int i10 = this.f34446a;
            this.f34446a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    private D() {
        this(f34437g);
    }

    static D e() {
        if (f34439i == null) {
            f34439i = new D();
        }
        return f34439i;
    }

    private void f() {
        this.f34442c = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void h() {
        try {
            this.f34441b = ((InetAddress) this.f34444e.call()).getCanonicalHostName();
            this.f34442c = System.currentTimeMillis() + this.f34440a;
            this.f34443d.set(false);
            return null;
        } catch (Throwable th) {
            this.f34443d.set(false);
            throw th;
        }
    }

    private void i() {
        try {
            this.f34445f.submit(new Callable() { // from class: io.sentry.C
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void h10;
                    h10 = D.this.h();
                    return h10;
                }
            }).get(f34438h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            f();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            f();
        }
    }

    void c() {
        this.f34445f.shutdown();
    }

    String d() {
        if (this.f34442c < System.currentTimeMillis() && this.f34443d.compareAndSet(false, true)) {
            i();
        }
        return this.f34441b;
    }

    D(long j10) {
        this(j10, new Callable() { // from class: io.sentry.B
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InetAddress localHost;
                localHost = InetAddress.getLocalHost();
                return localHost;
            }
        });
    }

    D(long j10, Callable callable) {
        this.f34443d = new AtomicBoolean(false);
        this.f34445f = Executors.newSingleThreadExecutor(new b());
        this.f34440a = j10;
        this.f34444e = (Callable) io.sentry.util.n.c(callable, "getLocalhost is required");
        i();
    }
}
