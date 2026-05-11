package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import io.sentry.ILogger;
import io.sentry.K1;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.sentry.android.core.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3373c extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f34819a;

    /* renamed from: b, reason: collision with root package name */
    private final a f34820b;

    /* renamed from: c, reason: collision with root package name */
    private final c0 f34821c;

    /* renamed from: d, reason: collision with root package name */
    private final io.sentry.transport.o f34822d;

    /* renamed from: e, reason: collision with root package name */
    private long f34823e;

    /* renamed from: f, reason: collision with root package name */
    private final long f34824f;

    /* renamed from: g, reason: collision with root package name */
    private final ILogger f34825g;

    /* renamed from: h, reason: collision with root package name */
    private volatile long f34826h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f34827i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f34828j;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f34829k;

    /* renamed from: io.sentry.android.core.c$a */
    public interface a {
        void a(ApplicationNotResponding applicationNotResponding);
    }

    C3373c(long j10, boolean z10, a aVar, ILogger iLogger, Context context) {
        this(new io.sentry.transport.o() { // from class: io.sentry.android.core.a
            @Override // io.sentry.transport.o
            public final long a() {
                long uptimeMillis;
                uptimeMillis = SystemClock.uptimeMillis();
                return uptimeMillis;
            }
        }, j10, 500L, z10, aVar, iLogger, new c0(), context);
    }

    private boolean c() {
        List<ActivityManager.ProcessErrorStateInfo> list;
        ActivityManager activityManager = (ActivityManager) this.f34828j.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        try {
            list = activityManager.getProcessesInErrorState();
        } catch (Throwable th) {
            this.f34825g.b(K1.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th);
            list = null;
        }
        if (list == null) {
            return false;
        }
        Iterator<ActivityManager.ProcessErrorStateInfo> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().condition == 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(io.sentry.transport.o oVar) {
        this.f34826h = oVar.a();
        this.f34827i.set(false);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.f34829k.run();
        while (!isInterrupted()) {
            this.f34821c.b(this.f34829k);
            try {
                Thread.sleep(this.f34823e);
                if (this.f34822d.a() - this.f34826h > this.f34824f) {
                    if (!this.f34819a && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        this.f34825g.c(K1.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.f34827i.set(true);
                    } else if (c() && this.f34827i.compareAndSet(false, true)) {
                        this.f34820b.a(new ApplicationNotResponding("Application Not Responding for at least " + this.f34824f + " ms.", this.f34821c.a()));
                    }
                }
            } catch (InterruptedException e10) {
                try {
                    Thread.currentThread().interrupt();
                    this.f34825g.c(K1.WARNING, "Interrupted: %s", e10.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.f34825g.c(K1.WARNING, "Failed to interrupt due to SecurityException: %s", e10.getMessage());
                    return;
                }
            }
        }
    }

    C3373c(final io.sentry.transport.o oVar, long j10, long j11, boolean z10, a aVar, ILogger iLogger, c0 c0Var, Context context) {
        super("|ANR-WatchDog|");
        this.f34826h = 0L;
        this.f34827i = new AtomicBoolean(false);
        this.f34822d = oVar;
        this.f34824f = j10;
        this.f34823e = j11;
        this.f34819a = z10;
        this.f34820b = aVar;
        this.f34825g = iLogger;
        this.f34821c = c0Var;
        this.f34828j = context;
        this.f34829k = new Runnable() { // from class: io.sentry.android.core.b
            @Override // java.lang.Runnable
            public final void run() {
                C3373c.this.e(oVar);
            }
        };
        if (j10 < this.f34823e * 2) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", Long.valueOf(this.f34823e * 2)));
        }
    }
}
