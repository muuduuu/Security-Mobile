package androidx.work.impl.utils.futures;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import u5.C4870a;

/* loaded from: classes.dex */
public abstract class a implements h8.d {

    /* renamed from: d, reason: collision with root package name */
    static final boolean f18394d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f18395e = Logger.getLogger(a.class.getName());

    /* renamed from: f, reason: collision with root package name */
    static final b f18396f;

    /* renamed from: g, reason: collision with root package name */
    private static final Object f18397g;

    /* renamed from: a, reason: collision with root package name */
    volatile Object f18398a;

    /* renamed from: b, reason: collision with root package name */
    volatile e f18399b;

    /* renamed from: c, reason: collision with root package name */
    volatile i f18400c;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    private static final class c {

        /* renamed from: c, reason: collision with root package name */
        static final c f18401c;

        /* renamed from: d, reason: collision with root package name */
        static final c f18402d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f18403a;

        /* renamed from: b, reason: collision with root package name */
        final Throwable f18404b;

        static {
            if (a.f18394d) {
                f18402d = null;
                f18401c = null;
            } else {
                f18402d = new c(false, null);
                f18401c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th) {
            this.f18403a = z10;
            this.f18404b = th;
        }
    }

    private static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f18405b = new d(new C0317a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f18406a;

        /* renamed from: androidx.work.impl.utils.futures.a$d$a, reason: collision with other inner class name */
        class C0317a extends Throwable {
            C0317a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f18406a = (Throwable) a.d(th);
        }
    }

    private static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f18407d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f18408a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f18409b;

        /* renamed from: c, reason: collision with root package name */
        e f18410c;

        e(Runnable runnable, Executor executor) {
            this.f18408a = runnable;
            this.f18409b = executor;
        }
    }

    private static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f18411a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f18412b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f18413c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f18414d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f18415e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f18411a = atomicReferenceFieldUpdater;
            this.f18412b = atomicReferenceFieldUpdater2;
            this.f18413c = atomicReferenceFieldUpdater3;
            this.f18414d = atomicReferenceFieldUpdater4;
            this.f18415e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f18414d, aVar, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f18415e, aVar, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f18413c, aVar, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            this.f18412b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            this.f18411a.lazySet(iVar, thread);
        }
    }

    private static final class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final a f18416a;

        /* renamed from: b, reason: collision with root package name */
        final h8.d f18417b;

        g(a aVar, h8.d dVar) {
            this.f18416a = aVar;
            this.f18417b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f18416a.f18398a != this) {
                return;
            }
            if (a.f18396f.b(this.f18416a, this, a.j(this.f18417b))) {
                a.g(this.f18416a);
            }
        }
    }

    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f18399b != eVar) {
                        return false;
                    }
                    aVar.f18399b = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f18398a != obj) {
                        return false;
                    }
                    aVar.f18398a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f18400c != iVar) {
                        return false;
                    }
                    aVar.f18400c = iVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f18420b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f18419a = thread;
        }
    }

    private static final class i {

        /* renamed from: c, reason: collision with root package name */
        static final i f18418c = new i(false);

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f18419a;

        /* renamed from: b, reason: collision with root package name */
        volatile i f18420b;

        i(boolean z10) {
        }

        void a(i iVar) {
            a.f18396f.d(this, iVar);
        }

        void b() {
            Thread thread = this.f18419a;
            if (thread != null) {
                this.f18419a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f18396f.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, C4870a.f43493a), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, C4870a.f43493a));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f18396f = hVar;
        if (th != null) {
            f18395e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f18397g = new Object();
    }

    protected a() {
    }

    private void a(StringBuilder sb2) {
        try {
            Object k10 = k(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(s(k10));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    private static CancellationException c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static Object d(Object obj) {
        obj.getClass();
        return obj;
    }

    private e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f18399b;
        } while (!f18396f.a(this, eVar2, e.f18407d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f18410c;
            eVar4.f18410c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void g(a aVar) {
        e eVar = null;
        while (true) {
            aVar.n();
            aVar.b();
            e f10 = aVar.f(eVar);
            while (f10 != null) {
                eVar = f10.f18410c;
                Runnable runnable = f10.f18408a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f18416a;
                    if (aVar.f18398a == gVar) {
                        if (f18396f.b(aVar, gVar, j(gVar.f18417b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    h(runnable, f10.f18409b);
                }
                f10 = eVar;
            }
            return;
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f18395e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    private Object i(Object obj) {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f18404b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f18406a);
        }
        if (obj == f18397g) {
            return null;
        }
        return obj;
    }

    static Object j(h8.d dVar) {
        if (dVar instanceof a) {
            Object obj = ((a) dVar).f18398a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f18403a ? cVar.f18404b != null ? new c(false, cVar.f18404b) : c.f18402d : obj;
        }
        boolean isCancelled = dVar.isCancelled();
        if ((!f18394d) && isCancelled) {
            return c.f18402d;
        }
        try {
            Object k10 = k(dVar);
            return k10 == null ? f18397g : k10;
        } catch (CancellationException e10) {
            if (isCancelled) {
                return new c(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + dVar, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static Object k(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private void n() {
        i iVar;
        do {
            iVar = this.f18400c;
        } while (!f18396f.c(this, iVar, i.f18418c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f18420b;
        }
    }

    private void o(i iVar) {
        iVar.f18419a = null;
        while (true) {
            i iVar2 = this.f18400c;
            if (iVar2 == i.f18418c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f18420b;
                if (iVar2.f18419a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f18420b = iVar4;
                    if (iVar3.f18419a == null) {
                        break;
                    }
                } else if (!f18396f.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    protected void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f18398a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f18394d ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f18401c : c.f18402d;
        a aVar = this;
        boolean z11 = false;
        while (true) {
            if (f18396f.b(aVar, obj, cVar)) {
                if (z10) {
                    aVar.l();
                }
                g(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                h8.d dVar = ((g) obj).f18417b;
                if (!(dVar instanceof a)) {
                    dVar.cancel(z10);
                    return true;
                }
                aVar = (a) dVar;
                obj = aVar.f18398a;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = aVar.f18398a;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    @Override // h8.d
    public final void e(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        e eVar = this.f18399b;
        if (eVar != e.f18407d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f18410c = eVar;
                if (f18396f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f18399b;
                }
            } while (eVar != e.f18407d);
        }
        h(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f18398a;
        if ((obj != null) && (!(obj instanceof g))) {
            return i(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f18400c;
            if (iVar != i.f18418c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f18396f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f18398a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return i(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        o(iVar2);
                    } else {
                        iVar = this.f18400c;
                    }
                } while (iVar != i.f18418c);
            }
            return i(this.f18398a);
        }
        while (nanos > 0) {
            Object obj3 = this.f18398a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return i(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String aVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(convert);
            boolean z10 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z10) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + aVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f18398a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f18398a != null);
    }

    protected void l() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String m() {
        Object obj = this.f18398a;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).f18417b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean p(Object obj) {
        if (obj == null) {
            obj = f18397g;
        }
        if (!f18396f.b(this, null, obj)) {
            return false;
        }
        g(this);
        return true;
    }

    protected boolean q(Throwable th) {
        if (!f18396f.b(this, null, new d((Throwable) d(th)))) {
            return false;
        }
        g(this);
        return true;
    }

    protected boolean r(h8.d dVar) {
        d dVar2;
        d(dVar);
        Object obj = this.f18398a;
        if (obj == null) {
            if (dVar.isDone()) {
                if (!f18396f.b(this, null, j(dVar))) {
                    return false;
                }
                g(this);
                return true;
            }
            g gVar = new g(this, dVar);
            if (f18396f.b(this, null, gVar)) {
                try {
                    dVar.e(gVar, androidx.work.impl.utils.futures.b.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar2 = new d(th);
                    } catch (Throwable unused) {
                        dVar2 = d.f18405b;
                    }
                    f18396f.b(this, gVar, dVar2);
                }
                return true;
            }
            obj = this.f18398a;
        }
        if (obj instanceof c) {
            dVar.cancel(((c) obj).f18403a);
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                str = m();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f18398a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return i(obj2);
            }
            i iVar = this.f18400c;
            if (iVar != i.f18418c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f18396f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f18398a;
                            } else {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return i(obj);
                    }
                    iVar = this.f18400c;
                } while (iVar != i.f18418c);
            }
            return i(this.f18398a);
        }
        throw new InterruptedException();
    }
}
