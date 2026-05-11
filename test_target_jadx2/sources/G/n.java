package G;

import G.o;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.InterfaceC3735a;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC3735a f2742a = new b();

    class a implements G.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3735a f2743a;

        a(InterfaceC3735a interfaceC3735a) {
            this.f2743a = interfaceC3735a;
        }

        @Override // G.a
        public h8.d apply(Object obj) {
            return n.p(this.f2743a.apply(obj));
        }
    }

    class c implements G.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f2744a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3735a f2745b;

        c(c.a aVar, InterfaceC3735a interfaceC3735a) {
            this.f2744a = aVar;
            this.f2745b = interfaceC3735a;
        }

        @Override // G.c
        public void onFailure(Throwable th) {
            this.f2744a.f(th);
        }

        @Override // G.c
        public void onSuccess(Object obj) {
            try {
                this.f2744a.c(this.f2745b.apply(obj));
            } catch (Throwable th) {
                this.f2744a.f(th);
            }
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h8.d f2746a;

        d(h8.d dVar) {
            this.f2746a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2746a.cancel(true);
        }
    }

    private static final class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Future f2747a;

        /* renamed from: b, reason: collision with root package name */
        final G.c f2748b;

        e(Future future, G.c cVar) {
            this.f2747a = future;
            this.f2748b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f2748b.onSuccess(n.l(this.f2747a));
            } catch (Error e10) {
                e = e10;
                this.f2748b.onFailure(e);
            } catch (RuntimeException e11) {
                e = e11;
                this.f2748b.onFailure(e);
            } catch (ExecutionException e12) {
                Throwable cause = e12.getCause();
                if (cause == null) {
                    this.f2748b.onFailure(e12);
                } else {
                    this.f2748b.onFailure(cause);
                }
            }
        }

        public String toString() {
            return e.class.getSimpleName() + "," + this.f2748b;
        }
    }

    public static h8.d A(final long j10, final ScheduledExecutorService scheduledExecutorService, final Object obj, final boolean z10, final h8.d dVar) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: G.h
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object v10;
                v10 = n.v(h8.d.this, scheduledExecutorService, obj, z10, j10, aVar);
                return v10;
            }
        });
    }

    public static h8.d B(final h8.d dVar) {
        y0.f.g(dVar);
        return dVar.isDone() ? dVar : androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: G.l
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object w10;
                w10 = n.w(h8.d.this, aVar);
                return w10;
            }
        });
    }

    public static void C(h8.d dVar, c.a aVar) {
        D(dVar, f2742a, aVar, F.c.b());
    }

    public static void D(h8.d dVar, InterfaceC3735a interfaceC3735a, c.a aVar, Executor executor) {
        E(true, dVar, interfaceC3735a, aVar, executor);
    }

    private static void E(boolean z10, h8.d dVar, InterfaceC3735a interfaceC3735a, c.a aVar, Executor executor) {
        y0.f.g(dVar);
        y0.f.g(interfaceC3735a);
        y0.f.g(aVar);
        y0.f.g(executor);
        j(dVar, new c(aVar, interfaceC3735a), executor);
        if (z10) {
            aVar.a(new d(dVar), F.c.b());
        }
    }

    public static h8.d F(Collection collection) {
        return new p(new ArrayList(collection), false, F.c.b());
    }

    public static h8.d G(h8.d dVar, InterfaceC3735a interfaceC3735a, Executor executor) {
        y0.f.g(interfaceC3735a);
        return H(dVar, new a(interfaceC3735a), executor);
    }

    public static h8.d H(h8.d dVar, G.a aVar, Executor executor) {
        G.b bVar = new G.b(aVar, dVar);
        dVar.e(bVar, executor);
        return bVar;
    }

    public static h8.d I(final h8.d dVar) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: G.g
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object y10;
                y10 = n.y(h8.d.this, aVar);
                return y10;
            }
        });
    }

    public static void j(h8.d dVar, G.c cVar, Executor executor) {
        y0.f.g(cVar);
        dVar.e(new e(dVar, cVar), executor);
    }

    public static h8.d k(Collection collection) {
        return new p(new ArrayList(collection), true, F.c.b());
    }

    public static Object l(Future future) {
        y0.f.j(future.isDone(), "Future was expected to be done, " + future);
        return m(future);
    }

    public static Object m(Future future) {
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

    public static h8.d n(Throwable th) {
        return new o.a(th);
    }

    public static ScheduledFuture o(Throwable th) {
        return new o.b(th);
    }

    public static h8.d p(Object obj) {
        return obj == null ? o.b() : new o.c(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean q(c.a aVar, h8.d dVar, long j10) {
        return Boolean.valueOf(aVar.f(new TimeoutException("Future[" + dVar + "] is not done within " + j10 + " ms.")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object s(final h8.d dVar, ScheduledExecutorService scheduledExecutorService, final long j10, final c.a aVar) {
        C(dVar, aVar);
        if (!dVar.isDone()) {
            final ScheduledFuture schedule = scheduledExecutorService.schedule(new Callable() { // from class: G.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Boolean q10;
                    q10 = n.q(c.a.this, dVar, j10);
                    return q10;
                }
            }, j10, TimeUnit.MILLISECONDS);
            dVar.e(new Runnable() { // from class: G.f
                @Override // java.lang.Runnable
                public final void run() {
                    schedule.cancel(true);
                }
            }, F.c.b());
        }
        return "TimeoutFuture[" + dVar + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(c.a aVar, Object obj, boolean z10, h8.d dVar) {
        aVar.c(obj);
        if (z10) {
            dVar.cancel(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object v(final h8.d dVar, ScheduledExecutorService scheduledExecutorService, final Object obj, final boolean z10, long j10, final c.a aVar) {
        C(dVar, aVar);
        if (!dVar.isDone()) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: G.j
                @Override // java.lang.Runnable
                public final void run() {
                    n.t(c.a.this, obj, z10, dVar);
                }
            }, j10, TimeUnit.MILLISECONDS);
            dVar.e(new Runnable() { // from class: G.k
                @Override // java.lang.Runnable
                public final void run() {
                    schedule.cancel(true);
                }
            }, F.c.b());
        }
        return "TimeoutFuture[" + dVar + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object w(h8.d dVar, c.a aVar) {
        E(false, dVar, f2742a, aVar, F.c.b());
        return "nonCancellationPropagating[" + dVar + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object y(h8.d dVar, final c.a aVar) {
        dVar.e(new Runnable() { // from class: G.i
            @Override // java.lang.Runnable
            public final void run() {
                c.a.this.c(null);
            }
        }, F.c.b());
        return "transformVoidFuture [" + dVar + "]";
    }

    public static h8.d z(final long j10, final ScheduledExecutorService scheduledExecutorService, final h8.d dVar) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: G.m
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object s10;
                s10 = n.s(h8.d.this, scheduledExecutorService, j10, aVar);
                return s10;
            }
        });
    }

    class b implements InterfaceC3735a {
        b() {
        }

        @Override // o.InterfaceC3735a
        public Object apply(Object obj) {
            return obj;
        }
    }
}
