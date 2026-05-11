package W4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class d implements D4.a {

    /* renamed from: i, reason: collision with root package name */
    public static final Executor f11359i = W4.c.f11358c;

    /* renamed from: j, reason: collision with root package name */
    public static final Executor f11360j = W4.c.f11357b;

    /* renamed from: k, reason: collision with root package name */
    private static d f11361k = new d((Object) null);

    /* renamed from: l, reason: collision with root package name */
    private static d f11362l = new d(Boolean.TRUE);

    /* renamed from: m, reason: collision with root package name */
    private static d f11363m = new d(Boolean.FALSE);

    /* renamed from: n, reason: collision with root package name */
    private static d f11364n = new d(true);

    /* renamed from: b, reason: collision with root package name */
    private boolean f11366b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11367c;

    /* renamed from: d, reason: collision with root package name */
    private Object f11368d;

    /* renamed from: e, reason: collision with root package name */
    private Exception f11369e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f11370f;

    /* renamed from: g, reason: collision with root package name */
    private W4.f f11371g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f11365a = new Object();

    /* renamed from: h, reason: collision with root package name */
    private List f11372h = new ArrayList();

    class a implements W4.a {
        a() {
        }

        @Override // W4.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(d dVar) {
            return dVar.q() ? d.e() : dVar.s() ? d.l(dVar.n()) : d.m(null);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ W4.e f11374a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callable f11375b;

        b(W4.e eVar, Callable callable) {
            this.f11374a = eVar;
            this.f11375b = callable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f11374a.d(this.f11375b.call());
            } catch (CancellationException unused) {
                this.f11374a.b();
            } catch (Exception e10) {
                this.f11374a.c(e10);
            }
        }
    }

    class c implements W4.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ W4.e f11376a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ W4.a f11377b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f11378c;

        c(W4.e eVar, W4.a aVar, Executor executor) {
            this.f11376a = eVar;
            this.f11377b = aVar;
            this.f11378c = executor;
        }

        @Override // W4.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(d dVar) {
            d.g(this.f11376a, this.f11377b, dVar, this.f11378c);
            return null;
        }
    }

    /* renamed from: W4.d$d, reason: collision with other inner class name */
    class C0209d implements W4.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ W4.e f11380a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ W4.a f11381b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f11382c;

        C0209d(W4.e eVar, W4.a aVar, Executor executor) {
            this.f11380a = eVar;
            this.f11381b = aVar;
            this.f11382c = executor;
        }

        @Override // W4.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(d dVar) {
            d.f(this.f11380a, this.f11381b, dVar, this.f11382c);
            return null;
        }
    }

    class e implements W4.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ W4.a f11384a;

        e(W4.a aVar) {
            this.f11384a = aVar;
        }

        @Override // W4.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(d dVar) {
            return dVar.s() ? d.l(dVar.n()) : dVar.q() ? d.e() : dVar.h(this.f11384a);
        }
    }

    class f implements W4.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ W4.a f11386a;

        f(W4.a aVar) {
            this.f11386a = aVar;
        }

        @Override // W4.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(d dVar) {
            return dVar.s() ? d.l(dVar.n()) : dVar.q() ? d.e() : dVar.j(this.f11386a);
        }
    }

    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ W4.a f11388a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f11389b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ W4.e f11390c;

        g(W4.a aVar, d dVar, W4.e eVar) {
            this.f11388a = aVar;
            this.f11389b = dVar;
            this.f11390c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f11390c.d(this.f11388a.a(this.f11389b));
            } catch (CancellationException unused) {
                this.f11390c.b();
            } catch (Exception e10) {
                this.f11390c.c(e10);
            }
        }
    }

    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ W4.a f11391a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f11392b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ W4.e f11393c;

        class a implements W4.a {
            a() {
            }

            @Override // W4.a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Void a(d dVar) {
                if (dVar.q()) {
                    h.this.f11393c.b();
                    return null;
                }
                if (dVar.s()) {
                    h.this.f11393c.c(dVar.n());
                    return null;
                }
                h.this.f11393c.d(dVar.o());
                return null;
            }
        }

        h(W4.a aVar, d dVar, W4.e eVar) {
            this.f11391a = aVar;
            this.f11392b = dVar;
            this.f11393c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                d dVar = (d) this.f11391a.a(this.f11392b);
                if (dVar == null) {
                    this.f11393c.d(null);
                } else {
                    dVar.h(new a());
                }
            } catch (CancellationException unused) {
                this.f11393c.b();
            } catch (Exception e10) {
                this.f11393c.c(e10);
            }
        }
    }

    public interface i {
    }

    d() {
    }

    public static d c(Callable callable) {
        return d(callable, f11359i);
    }

    public static d d(Callable callable, Executor executor) {
        W4.e eVar = new W4.e();
        try {
            executor.execute(new b(eVar, callable));
        } catch (Exception e10) {
            eVar.c(new W4.b(e10));
        }
        return eVar.a();
    }

    public static d e() {
        return f11364n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(W4.e eVar, W4.a aVar, d dVar, Executor executor) {
        try {
            executor.execute(new h(aVar, dVar, eVar));
        } catch (Exception e10) {
            eVar.c(new W4.b(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(W4.e eVar, W4.a aVar, d dVar, Executor executor) {
        try {
            executor.execute(new g(aVar, dVar, eVar));
        } catch (Exception e10) {
            eVar.c(new W4.b(e10));
        }
    }

    public static d l(Exception exc) {
        W4.e eVar = new W4.e();
        eVar.c(exc);
        return eVar.a();
    }

    public static d m(Object obj) {
        if (obj == null) {
            return f11361k;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? f11362l : f11363m;
        }
        W4.e eVar = new W4.e();
        eVar.d(obj);
        return eVar.a();
    }

    public static i p() {
        return null;
    }

    private void w() {
        synchronized (this.f11365a) {
            Iterator it = this.f11372h.iterator();
            while (it.hasNext()) {
                try {
                    ((W4.a) it.next()).a(this);
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.f11372h = null;
        }
    }

    public d h(W4.a aVar) {
        return i(aVar, f11359i);
    }

    public d i(W4.a aVar, Executor executor) {
        boolean r10;
        W4.e eVar = new W4.e();
        synchronized (this.f11365a) {
            try {
                r10 = r();
                if (!r10) {
                    this.f11372h.add(new c(eVar, aVar, executor));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (r10) {
            g(eVar, aVar, this, executor);
        }
        return eVar.a();
    }

    public d j(W4.a aVar) {
        return k(aVar, f11359i);
    }

    public d k(W4.a aVar, Executor executor) {
        boolean r10;
        W4.e eVar = new W4.e();
        synchronized (this.f11365a) {
            try {
                r10 = r();
                if (!r10) {
                    this.f11372h.add(new C0209d(eVar, aVar, executor));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (r10) {
            f(eVar, aVar, this, executor);
        }
        return eVar.a();
    }

    public Exception n() {
        Exception exc;
        synchronized (this.f11365a) {
            try {
                if (this.f11369e != null) {
                    this.f11370f = true;
                }
                exc = this.f11369e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return exc;
    }

    public Object o() {
        Object obj;
        synchronized (this.f11365a) {
            obj = this.f11368d;
        }
        return obj;
    }

    public boolean q() {
        boolean z10;
        synchronized (this.f11365a) {
            z10 = this.f11367c;
        }
        return z10;
    }

    public boolean r() {
        boolean z10;
        synchronized (this.f11365a) {
            z10 = this.f11366b;
        }
        return z10;
    }

    public boolean s() {
        boolean z10;
        synchronized (this.f11365a) {
            z10 = n() != null;
        }
        return z10;
    }

    public d t() {
        return j(new a());
    }

    public d u(W4.a aVar, Executor executor) {
        return k(new e(aVar), executor);
    }

    public d v(W4.a aVar, Executor executor) {
        return k(new f(aVar), executor);
    }

    boolean x() {
        synchronized (this.f11365a) {
            try {
                if (this.f11366b) {
                    return false;
                }
                this.f11366b = true;
                this.f11367c = true;
                this.f11365a.notifyAll();
                w();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean y(Exception exc) {
        synchronized (this.f11365a) {
            try {
                if (this.f11366b) {
                    return false;
                }
                this.f11366b = true;
                this.f11369e = exc;
                this.f11370f = false;
                this.f11365a.notifyAll();
                w();
                if (!this.f11370f) {
                    p();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean z(Object obj) {
        synchronized (this.f11365a) {
            try {
                if (this.f11366b) {
                    return false;
                }
                this.f11366b = true;
                this.f11368d = obj;
                this.f11365a.notifyAll();
                w();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private d(Object obj) {
        z(obj);
    }

    private d(boolean z10) {
        if (z10) {
            x();
        } else {
            z(null);
        }
    }
}
