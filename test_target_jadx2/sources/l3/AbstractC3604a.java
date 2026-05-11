package l3;

import android.util.Pair;
import b3.l;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: l3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3604a implements InterfaceC3606c {

    /* renamed from: a, reason: collision with root package name */
    private Map f37052a;

    /* renamed from: d, reason: collision with root package name */
    private Object f37055d = null;

    /* renamed from: e, reason: collision with root package name */
    private Throwable f37056e = null;

    /* renamed from: f, reason: collision with root package name */
    private float f37057f = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37054c = false;

    /* renamed from: b, reason: collision with root package name */
    private d f37053b = d.IN_PROGRESS;

    /* renamed from: g, reason: collision with root package name */
    private final ConcurrentLinkedQueue f37058g = new ConcurrentLinkedQueue();

    /* renamed from: l3.a$a, reason: collision with other inner class name */
    class RunnableC0547a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f37059a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f37060b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f37061c;

        RunnableC0547a(boolean z10, e eVar, boolean z11) {
            this.f37059a = z10;
            this.f37060b = eVar;
            this.f37061c = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f37059a) {
                this.f37060b.c(AbstractC3604a.this);
            } else if (this.f37061c) {
                this.f37060b.a(AbstractC3604a.this);
            } else {
                this.f37060b.b(AbstractC3604a.this);
            }
        }
    }

    /* renamed from: l3.a$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f37063a;

        b(e eVar) {
            this.f37063a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f37063a.d(AbstractC3604a.this);
        }
    }

    /* renamed from: l3.a$c */
    public interface c {
    }

    /* renamed from: l3.a$d */
    private enum d {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    protected AbstractC3604a() {
    }

    public static c i() {
        return null;
    }

    private void m() {
        boolean j10 = j();
        boolean w10 = w();
        Iterator it = this.f37058g.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            l((e) pair.first, (Executor) pair.second, j10, w10);
        }
    }

    private synchronized boolean r(Throwable th, Map map) {
        if (!this.f37054c && this.f37053b == d.IN_PROGRESS) {
            this.f37053b = d.FAILURE;
            this.f37056e = th;
            this.f37052a = map;
            return true;
        }
        return false;
    }

    private synchronized boolean t(float f10) {
        if (!this.f37054c && this.f37053b == d.IN_PROGRESS) {
            if (f10 < this.f37057f) {
                return false;
            }
            this.f37057f = f10;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0033, code lost:
    
        if (r4 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0035, code lost:
    
        h(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0038, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return false;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0019 -> B:28:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean v(Object obj, boolean z10) {
        Object obj2;
        Object obj3 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (!this.f37054c && this.f37053b == d.IN_PROGRESS) {
                            if (z10) {
                                this.f37053b = d.SUCCESS;
                                this.f37057f = 1.0f;
                            }
                            Object obj4 = this.f37055d;
                            if (obj4 != obj) {
                                try {
                                    this.f37055d = obj;
                                    obj2 = obj4;
                                } catch (Throwable th) {
                                    th = th;
                                    obj3 = obj4;
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                    } catch (Throwable th2) {
                        obj3 = obj;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            throw th;
        } finally {
            if (obj3 != null) {
                h(obj3);
            }
        }
    }

    private synchronized boolean w() {
        boolean z10;
        if (k()) {
            z10 = a() ? false : true;
        }
        return z10;
    }

    @Override // l3.InterfaceC3606c
    public synchronized boolean a() {
        return this.f37053b != d.IN_PROGRESS;
    }

    @Override // l3.InterfaceC3606c
    public synchronized Object b() {
        return this.f37055d;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // l3.InterfaceC3606c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(e eVar, Executor executor) {
        boolean z10;
        l.g(eVar);
        l.g(executor);
        synchronized (this) {
            try {
                if (this.f37054c) {
                    return;
                }
                if (this.f37053b == d.IN_PROGRESS) {
                    this.f37058g.add(Pair.create(eVar, executor));
                }
                if (!d() && !a() && !w()) {
                    z10 = false;
                    if (z10) {
                        return;
                    }
                    l(eVar, executor, j(), w());
                    return;
                }
                z10 = true;
                if (z10) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // l3.InterfaceC3606c
    public boolean close() {
        synchronized (this) {
            try {
                if (this.f37054c) {
                    return false;
                }
                this.f37054c = true;
                Object obj = this.f37055d;
                this.f37055d = null;
                if (obj != null) {
                    h(obj);
                }
                if (!a()) {
                    m();
                }
                synchronized (this) {
                    this.f37058g.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // l3.InterfaceC3606c
    public synchronized boolean d() {
        return this.f37055d != null;
    }

    @Override // l3.InterfaceC3606c
    public synchronized Throwable e() {
        return this.f37056e;
    }

    @Override // l3.InterfaceC3606c
    public synchronized float f() {
        return this.f37057f;
    }

    @Override // l3.InterfaceC3606c
    public boolean g() {
        return false;
    }

    @Override // l3.InterfaceC3606c
    public Map getExtras() {
        return this.f37052a;
    }

    public synchronized boolean j() {
        return this.f37053b == d.FAILURE;
    }

    public synchronized boolean k() {
        return this.f37054c;
    }

    protected void l(e eVar, Executor executor, boolean z10, boolean z11) {
        RunnableC0547a runnableC0547a = new RunnableC0547a(z10, eVar, z11);
        i();
        executor.execute(runnableC0547a);
    }

    protected void n() {
        Iterator it = this.f37058g.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ((Executor) pair.second).execute(new b((e) pair.first));
        }
    }

    protected void o(Map map) {
        this.f37052a = map;
    }

    protected boolean p(Throwable th) {
        return q(th, null);
    }

    protected boolean q(Throwable th, Map map) {
        boolean r10 = r(th, map);
        if (r10) {
            m();
        }
        return r10;
    }

    protected boolean s(float f10) {
        boolean t10 = t(f10);
        if (t10) {
            n();
        }
        return t10;
    }

    protected boolean u(Object obj, boolean z10, Map map) {
        o(map);
        boolean v10 = v(obj, z10);
        if (v10) {
            m();
        }
        return v10;
    }

    protected void h(Object obj) {
    }
}
