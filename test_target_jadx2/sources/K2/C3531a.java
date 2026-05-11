package k2;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import k2.p;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3531a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f35980a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f35981b;

    /* renamed from: c, reason: collision with root package name */
    final Map f35982c;

    /* renamed from: d, reason: collision with root package name */
    private final ReferenceQueue f35983d;

    /* renamed from: e, reason: collision with root package name */
    private p.a f35984e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f35985f;

    /* renamed from: k2.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0519a implements ThreadFactory {

        /* renamed from: k2.a$a$a, reason: collision with other inner class name */
        class RunnableC0520a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f35986a;

            RunnableC0520a(Runnable runnable) {
                this.f35986a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f35986a.run();
            }
        }

        ThreadFactoryC0519a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0520a(runnable), "glide-active-resources");
        }
    }

    /* renamed from: k2.a$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3531a.this.b();
        }
    }

    /* renamed from: k2.a$c */
    static final class c extends WeakReference {

        /* renamed from: a, reason: collision with root package name */
        final i2.f f35989a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f35990b;

        /* renamed from: c, reason: collision with root package name */
        v f35991c;

        c(i2.f fVar, p pVar, ReferenceQueue referenceQueue, boolean z10) {
            super(pVar, referenceQueue);
            this.f35989a = (i2.f) D2.k.d(fVar);
            this.f35991c = (pVar.d() && z10) ? (v) D2.k.d(pVar.c()) : null;
            this.f35990b = pVar.d();
        }

        void a() {
            this.f35991c = null;
            clear();
        }
    }

    C3531a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new ThreadFactoryC0519a()));
    }

    synchronized void a(i2.f fVar, p pVar) {
        c cVar = (c) this.f35982c.put(fVar, new c(fVar, pVar, this.f35983d, this.f35980a));
        if (cVar != null) {
            cVar.a();
        }
    }

    void b() {
        while (!this.f35985f) {
            try {
                c((c) this.f35983d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(c cVar) {
        v vVar;
        synchronized (this) {
            this.f35982c.remove(cVar.f35989a);
            if (cVar.f35990b && (vVar = cVar.f35991c) != null) {
                this.f35984e.a(cVar.f35989a, new p(vVar, true, false, cVar.f35989a, this.f35984e));
            }
        }
    }

    synchronized void d(i2.f fVar) {
        c cVar = (c) this.f35982c.remove(fVar);
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    synchronized p e(i2.f fVar) {
        c cVar = (c) this.f35982c.get(fVar);
        if (cVar == null) {
            return null;
        }
        p pVar = (p) cVar.get();
        if (pVar == null) {
            c(cVar);
        }
        return pVar;
    }

    void f(p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f35984e = aVar;
            }
        }
    }

    C3531a(boolean z10, Executor executor) {
        this.f35982c = new HashMap();
        this.f35983d = new ReferenceQueue();
        this.f35980a = z10;
        this.f35981b = executor;
        executor.execute(new b());
    }
}
