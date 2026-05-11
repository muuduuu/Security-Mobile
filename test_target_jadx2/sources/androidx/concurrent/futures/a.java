package androidx.concurrent.futures;

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
    static final boolean f14926d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f14927e = Logger.getLogger(a.class.getName());

    /* renamed from: f, reason: collision with root package name */
    static final b f14928f;

    /* renamed from: g, reason: collision with root package name */
    private static final Object f14929g;

    /* renamed from: a, reason: collision with root package name */
    volatile Object f14930a;

    /* renamed from: b, reason: collision with root package name */
    volatile e f14931b;

    /* renamed from: c, reason: collision with root package name */
    volatile h f14932c;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, h hVar, h hVar2);

        abstract void d(h hVar, h hVar2);

        abstract void e(h hVar, Thread thread);
    }

    private static final class c {

        /* renamed from: c, reason: collision with root package name */
        static final c f14933c;

        /* renamed from: d, reason: collision with root package name */
        static final c f14934d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f14935a;

        /* renamed from: b, reason: collision with root package name */
        final Throwable f14936b;

        static {
            if (a.f14926d) {
                f14934d = null;
                f14933c = null;
            } else {
                f14934d = new c(false, null);
                f14933c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th) {
            this.f14935a = z10;
            this.f14936b = th;
        }
    }

    private static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f14937b = new d(new C0252a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f14938a;

        /* renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        class C0252a extends Throwable {
            C0252a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f14938a = (Throwable) a.n(th);
        }
    }

    private static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f14939d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f14940a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f14941b;

        /* renamed from: c, reason: collision with root package name */
        e f14942c;

        e(Runnable runnable, Executor executor) {
            this.f14940a = runnable;
            this.f14941b = executor;
        }
    }

    private static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f14943a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f14944b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f14945c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f14946d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f14947e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f14943a = atomicReferenceFieldUpdater;
            this.f14944b = atomicReferenceFieldUpdater2;
            this.f14945c = atomicReferenceFieldUpdater3;
            this.f14946d = atomicReferenceFieldUpdater4;
            this.f14947e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f14946d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f14947e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, h hVar, h hVar2) {
            return androidx.concurrent.futures.b.a(this.f14945c, aVar, hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(h hVar, h hVar2) {
            this.f14944b.lazySet(hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(h hVar, Thread thread) {
            this.f14943a.lazySet(hVar, thread);
        }
    }

    private static final class g extends b {
        g() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f14931b != eVar) {
                        return false;
                    }
                    aVar.f14931b = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f14930a != obj) {
                        return false;
                    }
                    aVar.f14930a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f14932c != hVar) {
                        return false;
                    }
                    aVar.f14932c = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(h hVar, h hVar2) {
            hVar.f14950b = hVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(h hVar, Thread thread) {
            hVar.f14949a = thread;
        }
    }

    private static final class h {

        /* renamed from: c, reason: collision with root package name */
        static final h f14948c = new h(false);

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f14949a;

        /* renamed from: b, reason: collision with root package name */
        volatile h f14950b;

        h(boolean z10) {
        }

        void a(h hVar) {
            a.f14928f.d(this, hVar);
        }

        void b() {
            Thread thread = this.f14949a;
            if (thread != null) {
                this.f14949a = null;
                LockSupport.unpark(thread);
            }
        }

        h() {
            a.f14928f.e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, C4870a.f43493a), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, C4870a.f43493a));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f14928f = gVar;
        if (th != null) {
            f14927e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f14929g = new Object();
    }

    protected a() {
    }

    private void b(StringBuilder sb2) {
        try {
            Object s10 = s(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(z(s10));
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

    private static CancellationException d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static Object n(Object obj) {
        obj.getClass();
        return obj;
    }

    private e o(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f14931b;
        } while (!f14928f.a(this, eVar2, e.f14939d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f14942c;
            eVar4.f14942c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void p(a aVar) {
        aVar.v();
        aVar.c();
        e o10 = aVar.o(null);
        while (o10 != null) {
            e eVar = o10.f14942c;
            q(o10.f14940a, o10.f14941b);
            o10 = eVar;
        }
    }

    private static void q(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f14927e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    private Object r(Object obj) {
        if (obj instanceof c) {
            throw d("Task was cancelled.", ((c) obj).f14936b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f14938a);
        }
        if (obj == f14929g) {
            return null;
        }
        return obj;
    }

    static Object s(Future future) {
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

    private void v() {
        h hVar;
        do {
            hVar = this.f14932c;
        } while (!f14928f.c(this, hVar, h.f14948c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f14950b;
        }
    }

    private void w(h hVar) {
        hVar.f14949a = null;
        while (true) {
            h hVar2 = this.f14932c;
            if (hVar2 == h.f14948c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f14950b;
                if (hVar2.f14949a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f14950b = hVar4;
                    if (hVar3.f14949a == null) {
                        break;
                    }
                } else if (!f14928f.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    private String z(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    protected final boolean A() {
        Object obj = this.f14930a;
        return (obj instanceof c) && ((c) obj).f14935a;
    }

    protected void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f14930a;
        if (obj == null) {
            if (f14928f.b(this, obj, f14926d ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f14933c : c.f14934d)) {
                if (z10) {
                    t();
                }
                p(this);
                return true;
            }
        }
        return false;
    }

    @Override // h8.d
    public final void e(Runnable runnable, Executor executor) {
        n(runnable);
        n(executor);
        e eVar = this.f14931b;
        if (eVar != e.f14939d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f14942c = eVar;
                if (f14928f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f14931b;
                }
            } while (eVar != e.f14939d);
        }
        q(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f14930a;
        if (obj != null) {
            return r(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f14932c;
            if (hVar != h.f14948c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f14928f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                w(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f14930a;
                            if (obj2 != null) {
                                return r(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        w(hVar2);
                    } else {
                        hVar = this.f14932c;
                    }
                } while (hVar != h.f14948c);
            }
            return r(this.f14930a);
        }
        while (nanos > 0) {
            Object obj3 = this.f14930a;
            if (obj3 != null) {
                return r(obj3);
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
        return this.f14930a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14930a != null;
    }

    protected void t() {
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                str = u();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String u() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean x(Object obj) {
        if (obj == null) {
            obj = f14929g;
        }
        if (!f14928f.b(this, null, obj)) {
            return false;
        }
        p(this);
        return true;
    }

    protected boolean y(Throwable th) {
        if (!f14928f.b(this, null, new d((Throwable) n(th)))) {
            return false;
        }
        p(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f14930a;
            if (obj2 != null) {
                return r(obj2);
            }
            h hVar = this.f14932c;
            if (hVar != h.f14948c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f14928f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f14930a;
                            } else {
                                w(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return r(obj);
                    }
                    hVar = this.f14932c;
                } while (hVar != h.f14948c);
            }
            return r(this.f14930a);
        }
        throw new InterruptedException();
    }
}
