package com.google.firebase.messaging;

import D7.AbstractC0789m;
import D7.C0787k;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import j0.C3476a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
class j0 {

    /* renamed from: i, reason: collision with root package name */
    private static final long f28204i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a, reason: collision with root package name */
    private final Context f28205a;

    /* renamed from: b, reason: collision with root package name */
    private final M f28206b;

    /* renamed from: c, reason: collision with root package name */
    private final H f28207c;

    /* renamed from: d, reason: collision with root package name */
    private final FirebaseMessaging f28208d;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f28210f;

    /* renamed from: h, reason: collision with root package name */
    private final h0 f28212h;

    /* renamed from: e, reason: collision with root package name */
    private final Map f28209e = new C3476a();

    /* renamed from: g, reason: collision with root package name */
    private boolean f28211g = false;

    private j0(FirebaseMessaging firebaseMessaging, M m10, h0 h0Var, H h10, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f28208d = firebaseMessaging;
        this.f28206b = m10;
        this.f28212h = h0Var;
        this.f28207c = h10;
        this.f28205a = context;
        this.f28210f = scheduledExecutorService;
    }

    private void b(g0 g0Var, C0787k c0787k) {
        ArrayDeque arrayDeque;
        synchronized (this.f28209e) {
            try {
                String e10 = g0Var.e();
                if (this.f28209e.containsKey(e10)) {
                    arrayDeque = (ArrayDeque) this.f28209e.get(e10);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f28209e.put(e10, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(c0787k);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void c(Task task) {
        try {
            AbstractC0789m.b(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e12) {
            e = e12;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    private void d(String str) {
        c(this.f28207c.n(this.f28208d.o(), str));
    }

    private void e(String str) {
        c(this.f28207c.o(this.f28208d.o(), str));
    }

    static Task f(final FirebaseMessaging firebaseMessaging, final M m10, final H h10, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return AbstractC0789m.d(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.i0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                j0 j10;
                j10 = j0.j(context, scheduledExecutorService, firebaseMessaging, m10, h10);
                return j10;
            }
        });
    }

    static boolean h() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j0 j(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, M m10, H h10) {
        return new j0(firebaseMessaging, m10, h0.b(context, scheduledExecutorService), h10, context, scheduledExecutorService);
    }

    private void k(g0 g0Var) {
        synchronized (this.f28209e) {
            try {
                String e10 = g0Var.e();
                if (this.f28209e.containsKey(e10)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f28209e.get(e10);
                    C0787k c0787k = (C0787k) arrayDeque.poll();
                    if (c0787k != null) {
                        c0787k.c(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f28209e.remove(e10);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void p() {
        if (i()) {
            return;
        }
        t(0L);
    }

    boolean g() {
        return this.f28212h.c() != null;
    }

    synchronized boolean i() {
        return this.f28211g;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c A[Catch: IOException -> 0x001f, TryCatch #0 {IOException -> 0x001f, blocks: (B:3:0x0003, B:12:0x0033, B:14:0x0039, B:17:0x0053, B:19:0x0060, B:20:0x007c, B:22:0x0089, B:23:0x0015, B:26:0x0022), top: B:2:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean l(g0 g0Var) {
        char c10;
        try {
            String b10 = g0Var.b();
            int hashCode = b10.hashCode();
            if (hashCode == 83) {
                if (b10.equals("S")) {
                    c10 = 0;
                    if (c10 != 0) {
                    }
                    return true;
                }
                c10 = 65535;
                if (c10 != 0) {
                }
                return true;
            }
            if (hashCode == 85 && b10.equals("U")) {
                c10 = 1;
                if (c10 != 0) {
                    d(g0Var.c());
                    if (h()) {
                        Log.d("FirebaseMessaging", "Subscribe to topic: " + g0Var.c() + " succeeded.");
                    }
                } else if (c10 == 1) {
                    e(g0Var.c());
                    if (h()) {
                        Log.d("FirebaseMessaging", "Unsubscribe from topic: " + g0Var.c() + " succeeded.");
                    }
                } else if (h()) {
                    Log.d("FirebaseMessaging", "Unknown topic operation" + g0Var + ".");
                }
                return true;
            }
            c10 = 65535;
            if (c10 != 0) {
            }
            return true;
        } catch (IOException e10) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e10.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e10.getMessage())) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            }
            Log.e("FirebaseMessaging", "Topic operation failed: " + e10.getMessage() + ". Will retry Topic operation.");
            return false;
        }
    }

    void m(Runnable runnable, long j10) {
        this.f28210f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    Task n(g0 g0Var) {
        this.f28212h.a(g0Var);
        C0787k c0787k = new C0787k();
        b(g0Var, c0787k);
        return c0787k.a();
    }

    synchronized void o(boolean z10) {
        this.f28211g = z10;
    }

    void q() {
        if (g()) {
            p();
        }
    }

    Task r(String str) {
        Task n10 = n(g0.f(str));
        q();
        return n10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000d, code lost:
    
        if (h() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x000f, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001a, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean s() {
        while (true) {
            synchronized (this) {
                try {
                    g0 c10 = this.f28212h.c();
                    if (c10 == null) {
                        break;
                    }
                    if (!l(c10)) {
                        return false;
                    }
                    this.f28212h.e(c10);
                    k(c10);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    void t(long j10) {
        m(new k0(this, this.f28205a, this.f28206b, Math.min(Math.max(30L, 2 * j10), f28204i)), j10);
        o(true);
    }

    Task u(String str) {
        Task n10 = n(g0.g(str));
        q();
        return n10;
    }
}
