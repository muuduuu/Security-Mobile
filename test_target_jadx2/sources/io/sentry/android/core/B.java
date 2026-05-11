package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.C3411g;
import io.sentry.C3433n0;
import io.sentry.F0;
import io.sentry.I0;
import io.sentry.J0;
import io.sentry.K1;
import io.sentry.android.core.internal.util.s;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
final class B implements io.sentry.U {

    /* renamed from: a, reason: collision with root package name */
    private int f34680a;

    /* renamed from: b, reason: collision with root package name */
    private File f34681b;

    /* renamed from: c, reason: collision with root package name */
    private File f34682c;

    /* renamed from: d, reason: collision with root package name */
    private Future f34683d;

    /* renamed from: e, reason: collision with root package name */
    private volatile I0 f34684e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f34685f;

    /* renamed from: g, reason: collision with root package name */
    private final SentryAndroidOptions f34686g;

    /* renamed from: h, reason: collision with root package name */
    private final io.sentry.L f34687h;

    /* renamed from: i, reason: collision with root package name */
    private final N f34688i;

    /* renamed from: j, reason: collision with root package name */
    private long f34689j;

    /* renamed from: k, reason: collision with root package name */
    private long f34690k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f34691l;

    /* renamed from: m, reason: collision with root package name */
    private int f34692m;

    /* renamed from: n, reason: collision with root package name */
    private String f34693n;

    /* renamed from: o, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.s f34694o;

    /* renamed from: p, reason: collision with root package name */
    private J0 f34695p;

    /* renamed from: q, reason: collision with root package name */
    private final ArrayDeque f34696q;

    /* renamed from: r, reason: collision with root package name */
    private final ArrayDeque f34697r;

    /* renamed from: s, reason: collision with root package name */
    private final ArrayDeque f34698s;

    /* renamed from: t, reason: collision with root package name */
    private final Map f34699t;

    /* renamed from: u, reason: collision with root package name */
    private io.sentry.T f34700u;

    class a implements s.b {

        /* renamed from: a, reason: collision with root package name */
        final long f34701a = TimeUnit.SECONDS.toNanos(1);

        /* renamed from: b, reason: collision with root package name */
        final long f34702b = TimeUnit.MILLISECONDS.toNanos(700);

        /* renamed from: c, reason: collision with root package name */
        float f34703c = 0.0f;

        a() {
        }

        @Override // io.sentry.android.core.internal.util.s.b
        public void a(long j10, long j11, float f10) {
            long nanoTime = ((j10 - System.nanoTime()) + SystemClock.elapsedRealtimeNanos()) - B.this.f34689j;
            if (nanoTime < 0) {
                return;
            }
            boolean z10 = ((float) j11) > ((float) this.f34701a) / (f10 - 1.0f);
            float f11 = ((int) (f10 * 100.0f)) / 100.0f;
            if (j11 > this.f34702b) {
                B.this.f34698s.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(nanoTime), Long.valueOf(j11)));
            } else if (z10) {
                B.this.f34697r.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(nanoTime), Long.valueOf(j11)));
            }
            if (f11 != this.f34703c) {
                this.f34703c = f11;
                B.this.f34696q.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(nanoTime), Float.valueOf(f11)));
            }
        }
    }

    public B(Context context, SentryAndroidOptions sentryAndroidOptions, N n10, io.sentry.android.core.internal.util.s sVar) {
        this(context, sentryAndroidOptions, n10, sVar, io.sentry.H.a());
    }

    private ActivityManager.MemoryInfo i() {
        try {
            ActivityManager activityManager = (ActivityManager) this.f34685f.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            this.f34686g.getLogger().c(K1.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th) {
            this.f34686g.getLogger().b(K1.ERROR, "Error getting MemoryInfo.", th);
            return null;
        }
    }

    private void j() {
        if (this.f34691l) {
            return;
        }
        this.f34691l = true;
        String profilingTracesDirPath = this.f34686g.getProfilingTracesDirPath();
        if (!this.f34686g.isProfilingEnabled()) {
            this.f34686g.getLogger().c(K1.INFO, "Profiling is disabled in options.", new Object[0]);
            return;
        }
        if (profilingTracesDirPath == null) {
            this.f34686g.getLogger().c(K1.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int profilingTracesHz = this.f34686g.getProfilingTracesHz();
        if (profilingTracesHz <= 0) {
            this.f34686g.getLogger().c(K1.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(profilingTracesHz));
        } else {
            this.f34680a = ((int) TimeUnit.SECONDS.toMicros(1L)) / profilingTracesHz;
            this.f34682c = new File(profilingTracesDirPath);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(io.sentry.T t10) {
        this.f34684e = n(t10, true, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List l() {
        return io.sentry.android.core.internal.util.f.a().c();
    }

    private boolean m(final io.sentry.T t10) {
        this.f34681b = new File(this.f34682c, UUID.randomUUID() + ".trace");
        this.f34699t.clear();
        this.f34696q.clear();
        this.f34697r.clear();
        this.f34698s.clear();
        this.f34693n = this.f34694o.j(new a());
        this.f34700u = t10;
        try {
            this.f34683d = this.f34686g.getExecutorService().b(new Runnable() { // from class: io.sentry.android.core.A
                @Override // java.lang.Runnable
                public final void run() {
                    B.this.k(t10);
                }
            }, 30000L);
        } catch (RejectedExecutionException e10) {
            this.f34686g.getLogger().b(K1.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e10);
        }
        this.f34689j = SystemClock.elapsedRealtimeNanos();
        this.f34690k = Process.getElapsedCpuTime();
        this.f34695p = new J0(t10, Long.valueOf(this.f34689j), Long.valueOf(this.f34690k));
        try {
            Debug.startMethodTracingSampling(this.f34681b.getPath(), 3000000, this.f34680a);
            return true;
        } catch (Throwable th) {
            a(t10, null);
            this.f34686g.getLogger().b(K1.ERROR, "Unable to start a profile: ", th);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d6, code lost:
    
        if (r0.C().equals(r29.l().toString()) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d8, code lost:
    
        r28.f34684e = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01db, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01dc, code lost:
    
        r28.f34686g.getLogger().c(io.sentry.K1.INFO, "A timed out profiling data exists, but the finishing transaction %s (%s) is not part of it", r29.getName(), r29.n().k().toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01fe, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized I0 n(io.sentry.T t10, boolean z10, List list) {
        try {
            if (this.f34688i.d() < 21) {
                return null;
            }
            I0 i02 = this.f34684e;
            J0 j02 = this.f34695p;
            if (j02 != null && j02.h().equals(t10.l().toString())) {
                int i10 = this.f34692m;
                if (i10 > 0) {
                    this.f34692m = i10 - 1;
                }
                this.f34686g.getLogger().c(K1.DEBUG, "Transaction %s (%s) finished.", t10.getName(), t10.n().k().toString());
                if (this.f34692m != 0 && !z10) {
                    J0 j03 = this.f34695p;
                    if (j03 != null) {
                        j03.i(Long.valueOf(SystemClock.elapsedRealtimeNanos()), Long.valueOf(this.f34689j), Long.valueOf(Process.getElapsedCpuTime()), Long.valueOf(this.f34690k));
                    }
                    return null;
                }
                try {
                    Debug.stopMethodTracing();
                } catch (Throwable th) {
                    this.f34686g.getLogger().b(K1.ERROR, "Error while stopping profiling: ", th);
                }
                this.f34694o.k(this.f34693n);
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long elapsedCpuTime = Process.getElapsedCpuTime();
                long j10 = elapsedRealtimeNanos - this.f34689j;
                ArrayList arrayList = new ArrayList(1);
                J0 j04 = this.f34695p;
                if (j04 != null) {
                    arrayList.add(j04);
                }
                this.f34695p = null;
                this.f34692m = 0;
                this.f34700u = null;
                Future future = this.f34683d;
                if (future != null) {
                    future.cancel(true);
                    this.f34683d = null;
                }
                if (this.f34681b == null) {
                    this.f34686g.getLogger().c(K1.ERROR, "Trace file does not exists", new Object[0]);
                    return null;
                }
                ActivityManager.MemoryInfo i11 = i();
                String l10 = i11 != null ? Long.toString(i11.totalMem) : "0";
                String[] strArr = Build.SUPPORTED_ABIS;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((J0) it.next()).i(Long.valueOf(elapsedRealtimeNanos), Long.valueOf(this.f34689j), Long.valueOf(elapsedCpuTime), Long.valueOf(this.f34690k));
                    it = it;
                    elapsedRealtimeNanos = elapsedRealtimeNanos;
                }
                if (!this.f34697r.isEmpty()) {
                    this.f34699t.put("slow_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.f34697r));
                }
                if (!this.f34698s.isEmpty()) {
                    this.f34699t.put("frozen_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.f34698s));
                }
                if (!this.f34696q.isEmpty()) {
                    this.f34699t.put("screen_frame_rates", new io.sentry.profilemeasurements.a("hz", this.f34696q));
                }
                o(list);
                return new I0(this.f34681b, arrayList, t10, Long.toString(j10), this.f34688i.d(), (strArr == null || strArr.length <= 0) ? BuildConfig.FLAVOR : strArr[0], new Callable() { // from class: io.sentry.android.core.z
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        List l11;
                        l11 = B.l();
                        return l11;
                    }
                }, this.f34688i.b(), this.f34688i.c(), this.f34688i.e(), this.f34688i.f(), l10, this.f34686g.getProguardUuid(), this.f34686g.getRelease(), this.f34686g.getEnvironment(), z10 ? "timeout" : "normal", this.f34699t);
            }
            this.f34686g.getLogger().c(K1.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", t10.getName(), t10.n().k().toString());
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void o(List list) {
        if (this.f34688i.d() < 21) {
            return;
        }
        long elapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.f34689j) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                F0 f02 = (F0) it.next();
                C3411g c10 = f02.c();
                C3433n0 d10 = f02.d();
                if (c10 != null) {
                    arrayDeque3.add(new io.sentry.profilemeasurements.b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(c10.b()) + elapsedRealtimeNanos), Double.valueOf(c10.a())));
                }
                if (d10 != null && d10.b() > -1) {
                    arrayDeque.add(new io.sentry.profilemeasurements.b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(d10.a()) + elapsedRealtimeNanos), Long.valueOf(d10.b())));
                }
                if (d10 != null && d10.c() > -1) {
                    arrayDeque2.add(new io.sentry.profilemeasurements.b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(d10.a()) + elapsedRealtimeNanos), Long.valueOf(d10.c())));
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.f34699t.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.f34699t.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.f34699t.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
        }
    }

    @Override // io.sentry.U
    public synchronized I0 a(io.sentry.T t10, List list) {
        return n(t10, false, list);
    }

    @Override // io.sentry.U
    public synchronized void b(io.sentry.T t10) {
        try {
            if (this.f34688i.d() < 21) {
                return;
            }
            j();
            if (this.f34682c != null && this.f34680a != 0) {
                int i10 = this.f34692m;
                int i11 = i10 + 1;
                this.f34692m = i11;
                if (i11 != 1) {
                    this.f34692m = i10;
                    this.f34686g.getLogger().c(K1.WARNING, "A transaction is already being profiled. Transaction %s (%s) will be ignored.", t10.getName(), t10.n().k().toString());
                } else if (m(t10)) {
                    this.f34686g.getLogger().c(K1.DEBUG, "Transaction %s (%s) started and being profiled.", t10.getName(), t10.n().k().toString());
                }
            }
        } finally {
        }
    }

    @Override // io.sentry.U
    public void close() {
        Future future = this.f34683d;
        if (future != null) {
            future.cancel(true);
            this.f34683d = null;
        }
        io.sentry.T t10 = this.f34700u;
        if (t10 != null) {
            n(t10, true, null);
        }
    }

    public B(Context context, SentryAndroidOptions sentryAndroidOptions, N n10, io.sentry.android.core.internal.util.s sVar, io.sentry.L l10) {
        this.f34681b = null;
        this.f34682c = null;
        this.f34683d = null;
        this.f34684e = null;
        this.f34689j = 0L;
        this.f34690k = 0L;
        this.f34691l = false;
        this.f34692m = 0;
        this.f34696q = new ArrayDeque();
        this.f34697r = new ArrayDeque();
        this.f34698s = new ArrayDeque();
        this.f34699t = new HashMap();
        this.f34700u = null;
        this.f34685f = (Context) io.sentry.util.n.c(context, "The application context is required");
        this.f34686g = (SentryAndroidOptions) io.sentry.util.n.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f34687h = (io.sentry.L) io.sentry.util.n.c(l10, "Hub is required");
        this.f34694o = (io.sentry.android.core.internal.util.s) io.sentry.util.n.c(sVar, "SentryFrameMetricsCollector is required");
        this.f34688i = (N) io.sentry.util.n.c(n10, "The BuildInfoProvider is required.");
    }
}
