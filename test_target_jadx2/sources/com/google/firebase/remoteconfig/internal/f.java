package com.google.firebase.remoteconfig.internal;

import D7.AbstractC0789m;
import D7.InterfaceC0781e;
import D7.InterfaceC0782f;
import D7.InterfaceC0783g;
import D7.InterfaceC0786j;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: d, reason: collision with root package name */
    private static final Map f28327d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private static final Executor f28328e = new androidx.privacysandbox.ads.adservices.measurement.k();

    /* renamed from: a, reason: collision with root package name */
    private final Executor f28329a;

    /* renamed from: b, reason: collision with root package name */
    private final u f28330b;

    /* renamed from: c, reason: collision with root package name */
    private Task f28331c = null;

    private static class b implements InterfaceC0783g, InterfaceC0782f, InterfaceC0781e {

        /* renamed from: a, reason: collision with root package name */
        private final CountDownLatch f28332a;

        private b() {
            this.f28332a = new CountDownLatch(1);
        }

        @Override // D7.InterfaceC0781e
        public void a() {
            this.f28332a.countDown();
        }

        @Override // D7.InterfaceC0782f
        public void b(Exception exc) {
            this.f28332a.countDown();
        }

        public boolean c(long j10, TimeUnit timeUnit) {
            return this.f28332a.await(j10, timeUnit);
        }

        @Override // D7.InterfaceC0783g
        public void onSuccess(Object obj) {
            this.f28332a.countDown();
        }
    }

    private f(Executor executor, u uVar) {
        this.f28329a = executor;
        this.f28330b = uVar;
    }

    private static Object c(Task task, long j10, TimeUnit timeUnit) {
        b bVar = new b();
        Executor executor = f28328e;
        task.g(executor, bVar);
        task.e(executor, bVar);
        task.b(executor, bVar);
        if (!bVar.c(j10, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public static synchronized f h(Executor executor, u uVar) {
        f fVar;
        synchronized (f.class) {
            try {
                String b10 = uVar.b();
                Map map = f28327d;
                if (!map.containsKey(b10)) {
                    map.put(b10, new f(executor, uVar));
                }
                fVar = (f) map.get(b10);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void i(g gVar) {
        return this.f28330b.e(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task j(boolean z10, g gVar, Void r32) {
        if (z10) {
            m(gVar);
        }
        return AbstractC0789m.g(gVar);
    }

    private synchronized void m(g gVar) {
        this.f28331c = AbstractC0789m.g(gVar);
    }

    public void d() {
        synchronized (this) {
            this.f28331c = AbstractC0789m.g(null);
        }
        this.f28330b.a();
    }

    public synchronized Task e() {
        try {
            Task task = this.f28331c;
            if (task != null) {
                if (task.m() && !this.f28331c.isSuccessful()) {
                }
            }
            Executor executor = this.f28329a;
            final u uVar = this.f28330b;
            Objects.requireNonNull(uVar);
            this.f28331c = AbstractC0789m.d(executor, new Callable() { // from class: com.google.firebase.remoteconfig.internal.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return u.this.d();
                }
            });
        } catch (Throwable th) {
            throw th;
        }
        return this.f28331c;
    }

    public g f() {
        return g(5L);
    }

    g g(long j10) {
        synchronized (this) {
            try {
                Task task = this.f28331c;
                if (task != null && task.isSuccessful()) {
                    return (g) this.f28331c.getResult();
                }
                try {
                    return (g) c(e(), j10, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e10);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Task k(g gVar) {
        return l(gVar, true);
    }

    public Task l(final g gVar, final boolean z10) {
        return AbstractC0789m.d(this.f28329a, new Callable() { // from class: com.google.firebase.remoteconfig.internal.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void i10;
                i10 = f.this.i(gVar);
                return i10;
            }
        }).o(this.f28329a, new InterfaceC0786j() { // from class: com.google.firebase.remoteconfig.internal.e
            @Override // D7.InterfaceC0786j
            public final Task a(Object obj) {
                Task j10;
                j10 = f.this.j(z10, gVar, (Void) obj);
                return j10;
            }
        });
    }
}
