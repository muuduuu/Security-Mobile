package Jd;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class T extends AbstractC0884g0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: i, reason: collision with root package name */
    public static final T f5012i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f5013j;

    static {
        Long l10;
        T t10 = new T();
        f5012i = t10;
        AbstractC0882f0.g1(t10, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f5013j = timeUnit.toNanos(l10.longValue());
    }

    private T() {
    }

    private final synchronized void j2() {
        if (m2()) {
            debugStatus = 3;
            h2();
            Intrinsics.e(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread k2() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f5012i.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean l2() {
        return debugStatus == 4;
    }

    private final boolean m2() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean n2() {
        if (m2()) {
            return false;
        }
        debugStatus = 1;
        Intrinsics.e(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void o2() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // Jd.AbstractC0884g0
    public void A1(Runnable runnable) {
        if (l2()) {
            o2();
        }
        super.A1(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean f22;
        Q0.f5006a.d(this);
        AbstractC0875c.a();
        try {
            if (!n2()) {
                if (f22) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long m12 = m1();
                if (m12 == Long.MAX_VALUE) {
                    AbstractC0875c.a();
                    long nanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f5013j + nanoTime;
                    }
                    long j11 = j10 - nanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        j2();
                        AbstractC0875c.a();
                        if (f2()) {
                            return;
                        }
                        v1();
                        return;
                    }
                    m12 = kotlin.ranges.d.i(m12, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (m12 > 0) {
                    if (m2()) {
                        _thread = null;
                        j2();
                        AbstractC0875c.a();
                        if (f2()) {
                            return;
                        }
                        v1();
                        return;
                    }
                    AbstractC0875c.a();
                    LockSupport.parkNanos(this, m12);
                }
            }
        } finally {
            _thread = null;
            j2();
            AbstractC0875c.a();
            if (!f2()) {
                v1();
            }
        }
    }

    @Override // Jd.AbstractC0884g0, Jd.AbstractC0882f0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // Jd.J
    public String toString() {
        return "DefaultExecutor";
    }

    @Override // Jd.AbstractC0886h0
    protected Thread v1() {
        Thread thread = _thread;
        return thread == null ? k2() : thread;
    }
}
