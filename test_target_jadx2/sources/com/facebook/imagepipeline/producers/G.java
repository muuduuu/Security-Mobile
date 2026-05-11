package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import h4.C3230a;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class G {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f20771a;

    /* renamed from: b, reason: collision with root package name */
    private final d f20772b;

    /* renamed from: e, reason: collision with root package name */
    private final int f20775e;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f20773c = new a();

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f20774d = new b();

    /* renamed from: f, reason: collision with root package name */
    g4.i f20776f = null;

    /* renamed from: g, reason: collision with root package name */
    int f20777g = 0;

    /* renamed from: h, reason: collision with root package name */
    f f20778h = f.IDLE;

    /* renamed from: i, reason: collision with root package name */
    long f20779i = 0;

    /* renamed from: j, reason: collision with root package name */
    long f20780j = 0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            G.this.d();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            G.this.j();
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20783a;

        static {
            int[] iArr = new int[f.values().length];
            f20783a = iArr;
            try {
                iArr[f.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20783a[f.QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20783a[f.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20783a[f.RUNNING_AND_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface d {
        void a(g4.i iVar, int i10);
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        private static ScheduledExecutorService f20784a;

        static ScheduledExecutorService a() {
            if (f20784a == null) {
                f20784a = Executors.newSingleThreadScheduledExecutor();
            }
            return f20784a;
        }
    }

    enum f {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    public G(Executor executor, d dVar, int i10) {
        this.f20771a = executor;
        this.f20772b = dVar;
        this.f20775e = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        g4.i iVar;
        int i10;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            iVar = this.f20776f;
            i10 = this.f20777g;
            this.f20776f = null;
            this.f20777g = 0;
            this.f20778h = f.RUNNING;
            this.f20780j = uptimeMillis;
        }
        try {
            if (i(iVar, i10)) {
                this.f20772b.a(iVar, i10);
            }
        } finally {
            g4.i.c(iVar);
            g();
        }
    }

    private void e(long j10) {
        Runnable a10 = C3230a.a(this.f20774d, "JobScheduler_enqueueJob");
        if (j10 > 0) {
            e.a().schedule(a10, j10, TimeUnit.MILLISECONDS);
        } else {
            a10.run();
        }
    }

    private void g() {
        long j10;
        boolean z10;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (this.f20778h == f.RUNNING_AND_PENDING) {
                    j10 = Math.max(this.f20780j + this.f20775e, uptimeMillis);
                    this.f20779i = uptimeMillis;
                    this.f20778h = f.QUEUED;
                    z10 = true;
                } else {
                    this.f20778h = f.IDLE;
                    j10 = 0;
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            e(j10 - uptimeMillis);
        }
    }

    private static boolean i(g4.i iVar, int i10) {
        return AbstractC1836c.d(i10) || AbstractC1836c.m(i10, 4) || g4.i.y(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f20771a.execute(C3230a.a(this.f20773c, "JobScheduler_submitJob"));
    }

    public void c() {
        g4.i iVar;
        synchronized (this) {
            iVar = this.f20776f;
            this.f20776f = null;
            this.f20777g = 0;
        }
        g4.i.c(iVar);
    }

    public synchronized long f() {
        return this.f20780j - this.f20779i;
    }

    public boolean h() {
        long max;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                boolean z10 = false;
                if (!i(this.f20776f, this.f20777g)) {
                    return false;
                }
                int i10 = c.f20783a[this.f20778h.ordinal()];
                if (i10 != 1) {
                    if (i10 == 3) {
                        this.f20778h = f.RUNNING_AND_PENDING;
                    }
                    max = 0;
                } else {
                    max = Math.max(this.f20780j + this.f20775e, uptimeMillis);
                    this.f20779i = uptimeMillis;
                    this.f20778h = f.QUEUED;
                    z10 = true;
                }
                if (z10) {
                    e(max - uptimeMillis);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean k(g4.i iVar, int i10) {
        g4.i iVar2;
        if (!i(iVar, i10)) {
            return false;
        }
        synchronized (this) {
            iVar2 = this.f20776f;
            this.f20776f = g4.i.b(iVar);
            this.f20777g = i10;
        }
        g4.i.c(iVar2);
        return true;
    }
}
