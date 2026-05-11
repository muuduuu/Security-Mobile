package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.X;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import x1.C5104h;

/* renamed from: androidx.work.impl.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1634u implements androidx.work.impl.foreground.a {

    /* renamed from: l, reason: collision with root package name */
    private static final String f18375l = x1.n.i("Processor");

    /* renamed from: b, reason: collision with root package name */
    private Context f18377b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.work.a f18378c;

    /* renamed from: d, reason: collision with root package name */
    private E1.b f18379d;

    /* renamed from: e, reason: collision with root package name */
    private WorkDatabase f18380e;

    /* renamed from: g, reason: collision with root package name */
    private Map f18382g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private Map f18381f = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private Set f18384i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    private final List f18385j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    private PowerManager.WakeLock f18376a = null;

    /* renamed from: k, reason: collision with root package name */
    private final Object f18386k = new Object();

    /* renamed from: h, reason: collision with root package name */
    private Map f18383h = new HashMap();

    public C1634u(Context context, androidx.work.a aVar, E1.b bVar, WorkDatabase workDatabase) {
        this.f18377b = context;
        this.f18378c = aVar;
        this.f18379d = bVar;
        this.f18380e = workDatabase;
    }

    private X f(String str) {
        X x10 = (X) this.f18381f.remove(str);
        boolean z10 = x10 != null;
        if (!z10) {
            x10 = (X) this.f18382g.remove(str);
        }
        this.f18383h.remove(str);
        if (z10) {
            u();
        }
        return x10;
    }

    private X h(String str) {
        X x10 = (X) this.f18381f.get(str);
        return x10 == null ? (X) this.f18382g.get(str) : x10;
    }

    private static boolean i(String str, X x10, int i10) {
        if (x10 == null) {
            x1.n.e().a(f18375l, "WorkerWrapper could not be found for " + str);
            return false;
        }
        x10.g(i10);
        x1.n.e().a(f18375l, "WorkerWrapper interrupted for " + str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(C1.m mVar, boolean z10) {
        synchronized (this.f18386k) {
            try {
                Iterator it = this.f18385j.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1620f) it.next()).e(mVar, z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C1.u m(ArrayList arrayList, String str) {
        arrayList.addAll(this.f18380e.L().b(str));
        return this.f18380e.K().s(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(h8.d dVar, X x10) {
        boolean z10;
        try {
            z10 = ((Boolean) dVar.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            z10 = true;
        }
        o(x10, z10);
    }

    private void o(X x10, boolean z10) {
        synchronized (this.f18386k) {
            try {
                C1.m d10 = x10.d();
                String b10 = d10.b();
                if (h(b10) == x10) {
                    f(b10);
                }
                x1.n.e().a(f18375l, getClass().getSimpleName() + " " + b10 + " executed; reschedule = " + z10);
                Iterator it = this.f18385j.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1620f) it.next()).e(d10, z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void q(final C1.m mVar, final boolean z10) {
        this.f18379d.b().execute(new Runnable() { // from class: androidx.work.impl.t
            @Override // java.lang.Runnable
            public final void run() {
                C1634u.this.l(mVar, z10);
            }
        });
    }

    private void u() {
        synchronized (this.f18386k) {
            try {
                if (this.f18381f.isEmpty()) {
                    try {
                        this.f18377b.startService(androidx.work.impl.foreground.b.g(this.f18377b));
                    } catch (Throwable th) {
                        x1.n.e().d(f18375l, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f18376a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f18376a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.work.impl.foreground.a
    public void a(String str, C5104h c5104h) {
        synchronized (this.f18386k) {
            try {
                x1.n.e().f(f18375l, "Moving WorkSpec (" + str + ") to the foreground");
                X x10 = (X) this.f18382g.remove(str);
                if (x10 != null) {
                    if (this.f18376a == null) {
                        PowerManager.WakeLock b10 = D1.x.b(this.f18377b, "ProcessorForegroundLck");
                        this.f18376a = b10;
                        b10.acquire();
                    }
                    this.f18381f.put(str, x10);
                    androidx.core.content.a.o(this.f18377b, androidx.work.impl.foreground.b.f(this.f18377b, x10.d(), c5104h));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(InterfaceC1620f interfaceC1620f) {
        synchronized (this.f18386k) {
            this.f18385j.add(interfaceC1620f);
        }
    }

    public C1.u g(String str) {
        synchronized (this.f18386k) {
            try {
                X h10 = h(str);
                if (h10 == null) {
                    return null;
                }
                return h10.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean j(String str) {
        boolean contains;
        synchronized (this.f18386k) {
            contains = this.f18384i.contains(str);
        }
        return contains;
    }

    public boolean k(String str) {
        boolean z10;
        synchronized (this.f18386k) {
            z10 = h(str) != null;
        }
        return z10;
    }

    public void p(InterfaceC1620f interfaceC1620f) {
        synchronized (this.f18386k) {
            this.f18385j.remove(interfaceC1620f);
        }
    }

    public boolean r(A a10) {
        return s(a10, null);
    }

    public boolean s(A a10, WorkerParameters.a aVar) {
        C1.m a11 = a10.a();
        final String b10 = a11.b();
        final ArrayList arrayList = new ArrayList();
        C1.u uVar = (C1.u) this.f18380e.B(new Callable() { // from class: androidx.work.impl.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1.u m10;
                m10 = C1634u.this.m(arrayList, b10);
                return m10;
            }
        });
        if (uVar == null) {
            x1.n.e().k(f18375l, "Didn't find WorkSpec for id " + a11);
            q(a11, false);
            return false;
        }
        synchronized (this.f18386k) {
            try {
                if (k(b10)) {
                    Set set = (Set) this.f18383h.get(b10);
                    if (((A) set.iterator().next()).a().a() == a11.a()) {
                        set.add(a10);
                        x1.n.e().a(f18375l, "Work " + a11 + " is already enqueued for processing");
                    } else {
                        q(a11, false);
                    }
                    return false;
                }
                if (uVar.f() != a11.a()) {
                    q(a11, false);
                    return false;
                }
                final X b11 = new X.c(this.f18377b, this.f18378c, this.f18379d, this, this.f18380e, uVar, arrayList).c(aVar).b();
                final h8.d c10 = b11.c();
                c10.e(new Runnable() { // from class: androidx.work.impl.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1634u.this.n(c10, b11);
                    }
                }, this.f18379d.b());
                this.f18382g.put(b10, b11);
                HashSet hashSet = new HashSet();
                hashSet.add(a10);
                this.f18383h.put(b10, hashSet);
                this.f18379d.c().execute(b11);
                x1.n.e().a(f18375l, getClass().getSimpleName() + ": processing " + a11);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean t(String str, int i10) {
        X f10;
        synchronized (this.f18386k) {
            x1.n.e().a(f18375l, "Processor cancelling " + str);
            this.f18384i.add(str);
            f10 = f(str);
        }
        return i(str, f10, i10);
    }

    public boolean v(A a10, int i10) {
        X f10;
        String b10 = a10.a().b();
        synchronized (this.f18386k) {
            f10 = f(b10);
        }
        return i(b10, f10, i10);
    }

    public boolean w(A a10, int i10) {
        String b10 = a10.a().b();
        synchronized (this.f18386k) {
            try {
                if (this.f18381f.get(b10) == null) {
                    Set set = (Set) this.f18383h.get(b10);
                    if (set != null && set.contains(a10)) {
                        return i(b10, f(b10), i10);
                    }
                    return false;
                }
                x1.n.e().a(f18375l, "Ignored stopWork. WorkerWrapper " + b10 + " is in foreground");
                return false;
            } finally {
            }
        }
    }
}
