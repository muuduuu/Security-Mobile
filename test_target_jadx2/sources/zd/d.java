package Zd;

import Wd.m;
import Wd.p;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: k, reason: collision with root package name */
    public static final b f12523k = new b(null);

    /* renamed from: l, reason: collision with root package name */
    private static final Logger f12524l;

    /* renamed from: m, reason: collision with root package name */
    public static final d f12525m;

    /* renamed from: a, reason: collision with root package name */
    private final a f12526a;

    /* renamed from: b, reason: collision with root package name */
    private final Logger f12527b;

    /* renamed from: c, reason: collision with root package name */
    private final ReentrantLock f12528c;

    /* renamed from: d, reason: collision with root package name */
    private final Condition f12529d;

    /* renamed from: e, reason: collision with root package name */
    private int f12530e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12531f;

    /* renamed from: g, reason: collision with root package name */
    private long f12532g;

    /* renamed from: h, reason: collision with root package name */
    private final List f12533h;

    /* renamed from: i, reason: collision with root package name */
    private final List f12534i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f12535j;

    public interface a {
        long b();

        BlockingQueue c(BlockingQueue blockingQueue);

        void d(d dVar);

        void e(d dVar, long j10);

        void f(d dVar, Runnable runnable);
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f12536a;

        public c(ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.f12536a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // Zd.d.a
        public long b() {
            return System.nanoTime();
        }

        @Override // Zd.d.a
        public BlockingQueue c(BlockingQueue queue) {
            Intrinsics.checkNotNullParameter(queue, "queue");
            return queue;
        }

        @Override // Zd.d.a
        public void d(d taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.g().signal();
        }

        @Override // Zd.d.a
        public void e(d taskRunner, long j10) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            ReentrantLock h10 = taskRunner.h();
            if (!p.f11601e || h10.isHeldByCurrentThread()) {
                if (j10 > 0) {
                    taskRunner.g().awaitNanos(j10);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + h10);
            }
        }

        @Override // Zd.d.a
        public void f(d taskRunner, Runnable runnable) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f12536a.execute(runnable);
        }
    }

    /* renamed from: Zd.d$d, reason: collision with other inner class name */
    public static final class RunnableC0232d implements Runnable {
        RunnableC0232d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long j10;
            while (true) {
                ReentrantLock h10 = d.this.h();
                d dVar = d.this;
                h10.lock();
                try {
                    Zd.a c10 = dVar.c();
                    if (c10 == null) {
                        return;
                    }
                    Logger i10 = d.this.i();
                    Zd.c d10 = c10.d();
                    Intrinsics.d(d10);
                    d dVar2 = d.this;
                    boolean isLoggable = i10.isLoggable(Level.FINE);
                    if (isLoggable) {
                        j10 = d10.j().f().b();
                        Zd.b.c(i10, c10, d10, "starting");
                    } else {
                        j10 = -1;
                    }
                    try {
                        try {
                            dVar2.l(c10);
                            Unit unit = Unit.f36324a;
                            if (isLoggable) {
                                Zd.b.c(i10, c10, d10, "finished run in " + Zd.b.b(d10.j().f().b() - j10));
                            }
                        } catch (Throwable th) {
                            dVar2.h().lock();
                            try {
                                dVar2.f().f(dVar2, this);
                                Unit unit2 = Unit.f36324a;
                                throw th;
                            } finally {
                            }
                        }
                    } catch (Throwable th2) {
                        if (isLoggable) {
                            Zd.b.c(i10, c10, d10, "failed a run in " + Zd.b.b(d10.j().f().b() - j10));
                        }
                        throw th2;
                    }
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Logger logger = Logger.getLogger(d.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        f12524l = logger;
        f12525m = new d(new c(p.o(p.f11602f + " TaskRunner", true)), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    }

    public d(a backend, Logger logger) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f12526a = backend;
        this.f12527b = logger;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f12528c = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(newCondition, "newCondition(...)");
        this.f12529d = newCondition;
        this.f12530e = ModuleDescriptor.MODULE_VERSION;
        this.f12533h = new ArrayList();
        this.f12534i = new ArrayList();
        this.f12535j = new RunnableC0232d();
    }

    private final void b(Zd.a aVar, long j10) {
        ReentrantLock reentrantLock = this.f12528c;
        if (p.f11601e && !reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + reentrantLock);
        }
        Zd.c d10 = aVar.d();
        Intrinsics.d(d10);
        if (d10.e() != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean f10 = d10.f();
        d10.p(false);
        d10.o(null);
        this.f12533h.remove(d10);
        if (j10 != -1 && !f10 && !d10.i()) {
            d10.n(aVar, j10, true);
        }
        if (d10.g().isEmpty()) {
            return;
        }
        this.f12534i.add(d10);
    }

    private final void d(Zd.a aVar) {
        ReentrantLock reentrantLock = this.f12528c;
        if (p.f11601e && !reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + reentrantLock);
        }
        aVar.g(-1L);
        Zd.c d10 = aVar.d();
        Intrinsics.d(d10);
        d10.g().remove(aVar);
        this.f12534i.remove(d10);
        d10.o(aVar);
        this.f12533h.add(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(Zd.a aVar) {
        ReentrantLock reentrantLock;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.b());
        try {
            long f10 = aVar.f();
            reentrantLock = this.f12528c;
            reentrantLock.lock();
            try {
                b(aVar, f10);
                Unit unit = Unit.f36324a;
                reentrantLock.unlock();
                currentThread.setName(name);
            } finally {
            }
        } catch (Throwable th) {
            reentrantLock = this.f12528c;
            reentrantLock.lock();
            try {
                b(aVar, -1L);
                Unit unit2 = Unit.f36324a;
                reentrantLock.unlock();
                currentThread.setName(name);
                throw th;
            } finally {
            }
        }
    }

    public final Zd.a c() {
        boolean z10;
        ReentrantLock reentrantLock = this.f12528c;
        if (p.f11601e && !reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + reentrantLock);
        }
        while (!this.f12534i.isEmpty()) {
            long b10 = this.f12526a.b();
            Iterator it = this.f12534i.iterator();
            long j10 = Long.MAX_VALUE;
            Zd.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                Zd.a aVar2 = (Zd.a) ((Zd.c) it.next()).g().get(0);
                long max = Math.max(0L, aVar2.c() - b10);
                if (max > 0) {
                    j10 = Math.min(max, j10);
                } else {
                    if (aVar != null) {
                        z10 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                d(aVar);
                if (z10 || (!this.f12531f && !this.f12534i.isEmpty())) {
                    this.f12526a.f(this, this.f12535j);
                }
                return aVar;
            }
            if (this.f12531f) {
                if (j10 < this.f12532g - b10) {
                    this.f12526a.d(this);
                }
                return null;
            }
            this.f12531f = true;
            this.f12532g = b10 + j10;
            try {
                try {
                    this.f12526a.e(this, j10);
                } catch (InterruptedException unused) {
                    e();
                }
            } finally {
                this.f12531f = false;
            }
        }
        return null;
    }

    public final void e() {
        ReentrantLock reentrantLock = this.f12528c;
        if (p.f11601e && !reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + reentrantLock);
        }
        int size = this.f12533h.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((Zd.c) this.f12533h.get(size)).b();
            }
        }
        for (int size2 = this.f12534i.size() - 1; -1 < size2; size2--) {
            Zd.c cVar = (Zd.c) this.f12534i.get(size2);
            cVar.b();
            if (cVar.g().isEmpty()) {
                this.f12534i.remove(size2);
            }
        }
    }

    public final a f() {
        return this.f12526a;
    }

    public final Condition g() {
        return this.f12529d;
    }

    public final ReentrantLock h() {
        return this.f12528c;
    }

    public final Logger i() {
        return this.f12527b;
    }

    public final void j(Zd.c taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        ReentrantLock reentrantLock = this.f12528c;
        if (p.f11601e && !reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + reentrantLock);
        }
        if (taskQueue.e() == null) {
            if (taskQueue.g().isEmpty()) {
                this.f12534i.remove(taskQueue);
            } else {
                m.a(this.f12534i, taskQueue);
            }
        }
        if (this.f12531f) {
            this.f12526a.d(this);
        } else {
            this.f12526a.f(this, this.f12535j);
        }
    }

    public final Zd.c k() {
        ReentrantLock reentrantLock = this.f12528c;
        reentrantLock.lock();
        try {
            int i10 = this.f12530e;
            this.f12530e = i10 + 1;
            reentrantLock.unlock();
            StringBuilder sb2 = new StringBuilder();
            sb2.append('Q');
            sb2.append(i10);
            return new Zd.c(this, sb2.toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public /* synthetic */ d(a aVar, Logger logger, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i10 & 2) != 0 ? f12524l : logger);
    }
}
