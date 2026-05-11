package G1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class f {

    /* renamed from: i, reason: collision with root package name */
    public static final ExecutorService f2816i = G1.b.a();

    /* renamed from: j, reason: collision with root package name */
    private static final Executor f2817j = G1.b.b();

    /* renamed from: k, reason: collision with root package name */
    public static final Executor f2818k = G1.a.c();

    /* renamed from: l, reason: collision with root package name */
    private static f f2819l = new f((Object) null);

    /* renamed from: m, reason: collision with root package name */
    private static f f2820m = new f(Boolean.TRUE);

    /* renamed from: n, reason: collision with root package name */
    private static f f2821n = new f(Boolean.FALSE);

    /* renamed from: o, reason: collision with root package name */
    private static f f2822o = new f(true);

    /* renamed from: b, reason: collision with root package name */
    private boolean f2824b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2825c;

    /* renamed from: d, reason: collision with root package name */
    private Object f2826d;

    /* renamed from: e, reason: collision with root package name */
    private Exception f2827e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2828f;

    /* renamed from: g, reason: collision with root package name */
    private h f2829g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f2823a = new Object();

    /* renamed from: h, reason: collision with root package name */
    private List f2830h = new ArrayList();

    class a implements G1.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f2831a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ G1.d f2832b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f2833c;

        a(g gVar, G1.d dVar, Executor executor, G1.c cVar) {
            this.f2831a = gVar;
            this.f2832b = dVar;
            this.f2833c = executor;
        }

        @Override // G1.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(f fVar) {
            f.d(this.f2831a, this.f2832b, fVar, this.f2833c, null);
            return null;
        }
    }

    static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f2835a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ G1.d f2836b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f2837c;

        b(G1.c cVar, g gVar, G1.d dVar, f fVar) {
            this.f2835a = gVar;
            this.f2836b = dVar;
            this.f2837c = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f2835a.d(this.f2836b.a(this.f2837c));
            } catch (CancellationException unused) {
                this.f2835a.b();
            } catch (Exception e10) {
                this.f2835a.c(e10);
            }
        }
    }

    static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f2838a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callable f2839b;

        c(G1.c cVar, g gVar, Callable callable) {
            this.f2838a = gVar;
            this.f2839b = callable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f2838a.d(this.f2839b.call());
            } catch (CancellationException unused) {
                this.f2838a.b();
            } catch (Exception e10) {
                this.f2838a.c(e10);
            }
        }
    }

    public interface d {
    }

    f() {
    }

    public static f b(Callable callable, Executor executor) {
        return c(callable, executor, null);
    }

    public static f c(Callable callable, Executor executor, G1.c cVar) {
        g gVar = new g();
        try {
            executor.execute(new c(cVar, gVar, callable));
        } catch (Exception e10) {
            gVar.c(new e(e10));
        }
        return gVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(g gVar, G1.d dVar, f fVar, Executor executor, G1.c cVar) {
        try {
            executor.execute(new b(cVar, gVar, dVar, fVar));
        } catch (Exception e10) {
            gVar.c(new e(e10));
        }
    }

    public static f g(Exception exc) {
        g gVar = new g();
        gVar.c(exc);
        return gVar.a();
    }

    public static f h(Object obj) {
        if (obj == null) {
            return f2819l;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? f2820m : f2821n;
        }
        g gVar = new g();
        gVar.d(obj);
        return gVar.a();
    }

    public static d k() {
        return null;
    }

    private void o() {
        synchronized (this.f2823a) {
            Iterator it = this.f2830h.iterator();
            while (it.hasNext()) {
                try {
                    ((G1.d) it.next()).a(this);
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.f2830h = null;
        }
    }

    public f e(G1.d dVar) {
        return f(dVar, f2817j, null);
    }

    public f f(G1.d dVar, Executor executor, G1.c cVar) {
        boolean m10;
        g gVar = new g();
        synchronized (this.f2823a) {
            try {
                m10 = m();
                if (!m10) {
                    this.f2830h.add(new a(gVar, dVar, executor, cVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (m10) {
            d(gVar, dVar, this, executor, cVar);
        }
        return gVar.a();
    }

    public Exception i() {
        Exception exc;
        synchronized (this.f2823a) {
            try {
                if (this.f2827e != null) {
                    this.f2828f = true;
                }
                exc = this.f2827e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return exc;
    }

    public Object j() {
        Object obj;
        synchronized (this.f2823a) {
            obj = this.f2826d;
        }
        return obj;
    }

    public boolean l() {
        boolean z10;
        synchronized (this.f2823a) {
            z10 = this.f2825c;
        }
        return z10;
    }

    public boolean m() {
        boolean z10;
        synchronized (this.f2823a) {
            z10 = this.f2824b;
        }
        return z10;
    }

    public boolean n() {
        boolean z10;
        synchronized (this.f2823a) {
            z10 = i() != null;
        }
        return z10;
    }

    boolean p() {
        synchronized (this.f2823a) {
            try {
                if (this.f2824b) {
                    return false;
                }
                this.f2824b = true;
                this.f2825c = true;
                this.f2823a.notifyAll();
                o();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean q(Exception exc) {
        synchronized (this.f2823a) {
            try {
                if (this.f2824b) {
                    return false;
                }
                this.f2824b = true;
                this.f2827e = exc;
                this.f2828f = false;
                this.f2823a.notifyAll();
                o();
                if (!this.f2828f) {
                    k();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean r(Object obj) {
        synchronized (this.f2823a) {
            try {
                if (this.f2824b) {
                    return false;
                }
                this.f2824b = true;
                this.f2826d = obj;
                this.f2823a.notifyAll();
                o();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private f(Object obj) {
        r(obj);
    }

    private f(boolean z10) {
        if (z10) {
            p();
        } else {
            r(null);
        }
    }
}
