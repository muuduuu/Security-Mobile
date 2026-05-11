package androidx.work.impl.background.systemalarm;

import C1.m;
import D1.D;
import D1.x;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.B;
import androidx.work.impl.C1634u;
import androidx.work.impl.InterfaceC1620f;
import androidx.work.impl.N;
import androidx.work.impl.O;
import androidx.work.impl.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import x1.n;

/* loaded from: classes.dex */
public class g implements InterfaceC1620f {

    /* renamed from: l, reason: collision with root package name */
    static final String f18291l = n.i("SystemAlarmDispatcher");

    /* renamed from: a, reason: collision with root package name */
    final Context f18292a;

    /* renamed from: b, reason: collision with root package name */
    final E1.b f18293b;

    /* renamed from: c, reason: collision with root package name */
    private final D f18294c;

    /* renamed from: d, reason: collision with root package name */
    private final C1634u f18295d;

    /* renamed from: e, reason: collision with root package name */
    private final P f18296e;

    /* renamed from: f, reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f18297f;

    /* renamed from: g, reason: collision with root package name */
    final List f18298g;

    /* renamed from: h, reason: collision with root package name */
    Intent f18299h;

    /* renamed from: i, reason: collision with root package name */
    private c f18300i;

    /* renamed from: j, reason: collision with root package name */
    private B f18301j;

    /* renamed from: k, reason: collision with root package name */
    private final N f18302k;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor b10;
            d dVar;
            synchronized (g.this.f18298g) {
                g gVar = g.this;
                gVar.f18299h = (Intent) gVar.f18298g.get(0);
            }
            Intent intent = g.this.f18299h;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = g.this.f18299h.getIntExtra("KEY_START_ID", 0);
                n e10 = n.e();
                String str = g.f18291l;
                e10.a(str, "Processing command " + g.this.f18299h + ", " + intExtra);
                PowerManager.WakeLock b11 = x.b(g.this.f18292a, action + " (" + intExtra + ")");
                try {
                    n.e().a(str, "Acquiring operation wake lock (" + action + ") " + b11);
                    b11.acquire();
                    g gVar2 = g.this;
                    gVar2.f18297f.o(gVar2.f18299h, intExtra, gVar2);
                    n.e().a(str, "Releasing operation wake lock (" + action + ") " + b11);
                    b11.release();
                    b10 = g.this.f18293b.b();
                    dVar = new d(g.this);
                } catch (Throwable th) {
                    try {
                        n e11 = n.e();
                        String str2 = g.f18291l;
                        e11.d(str2, "Unexpected error in onHandleIntent", th);
                        n.e().a(str2, "Releasing operation wake lock (" + action + ") " + b11);
                        b11.release();
                        b10 = g.this.f18293b.b();
                        dVar = new d(g.this);
                    } catch (Throwable th2) {
                        n.e().a(g.f18291l, "Releasing operation wake lock (" + action + ") " + b11);
                        b11.release();
                        g.this.f18293b.b().execute(new d(g.this));
                        throw th2;
                    }
                }
                b10.execute(dVar);
            }
        }
    }

    static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final g f18304a;

        /* renamed from: b, reason: collision with root package name */
        private final Intent f18305b;

        /* renamed from: c, reason: collision with root package name */
        private final int f18306c;

        b(g gVar, Intent intent, int i10) {
            this.f18304a = gVar;
            this.f18305b = intent;
            this.f18306c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18304a.a(this.f18305b, this.f18306c);
        }
    }

    interface c {
        void a();
    }

    static class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final g f18307a;

        d(g gVar) {
            this.f18307a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18307a.c();
        }
    }

    g(Context context) {
        this(context, null, null, null);
    }

    private void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean j(String str) {
        b();
        synchronized (this.f18298g) {
            try {
                Iterator it = this.f18298g.iterator();
                while (it.hasNext()) {
                    if (str.equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void l() {
        b();
        PowerManager.WakeLock b10 = x.b(this.f18292a, "ProcessCommand");
        try {
            b10.acquire();
            this.f18296e.t().d(new a());
        } finally {
            b10.release();
        }
    }

    public boolean a(Intent intent, int i10) {
        n e10 = n.e();
        String str = f18291l;
        e10.a(str, "Adding command " + intent + " (" + i10 + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            n.e().k(str, "Unknown command. Ignoring");
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && j("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f18298g) {
            try {
                boolean isEmpty = this.f18298g.isEmpty();
                this.f18298g.add(intent);
                if (isEmpty) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    void c() {
        n e10 = n.e();
        String str = f18291l;
        e10.a(str, "Checking if commands are complete.");
        b();
        synchronized (this.f18298g) {
            try {
                if (this.f18299h != null) {
                    n.e().a(str, "Removing command " + this.f18299h);
                    if (!((Intent) this.f18298g.remove(0)).equals(this.f18299h)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.f18299h = null;
                }
                E1.a c10 = this.f18293b.c();
                if (!this.f18297f.n() && this.f18298g.isEmpty() && !c10.o()) {
                    n.e().a(str, "No more commands & intents.");
                    c cVar = this.f18300i;
                    if (cVar != null) {
                        cVar.a();
                    }
                } else if (!this.f18298g.isEmpty()) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    C1634u d() {
        return this.f18295d;
    }

    @Override // androidx.work.impl.InterfaceC1620f
    public void e(m mVar, boolean z10) {
        this.f18293b.b().execute(new b(this, androidx.work.impl.background.systemalarm.b.c(this.f18292a, mVar, z10), 0));
    }

    E1.b f() {
        return this.f18293b;
    }

    P g() {
        return this.f18296e;
    }

    D h() {
        return this.f18294c;
    }

    N i() {
        return this.f18302k;
    }

    void k() {
        n.e().a(f18291l, "Destroying SystemAlarmDispatcher");
        this.f18295d.p(this);
        this.f18300i = null;
    }

    void m(c cVar) {
        if (this.f18300i != null) {
            n.e().c(f18291l, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f18300i = cVar;
        }
    }

    g(Context context, C1634u c1634u, P p10, N n10) {
        Context applicationContext = context.getApplicationContext();
        this.f18292a = applicationContext;
        this.f18301j = new B();
        p10 = p10 == null ? P.n(context) : p10;
        this.f18296e = p10;
        this.f18297f = new androidx.work.impl.background.systemalarm.b(applicationContext, p10.l().a(), this.f18301j);
        this.f18294c = new D(p10.l().k());
        c1634u = c1634u == null ? p10.p() : c1634u;
        this.f18295d = c1634u;
        E1.b t10 = p10.t();
        this.f18293b = t10;
        this.f18302k = n10 == null ? new O(c1634u, t10) : n10;
        c1634u.e(this);
        this.f18298g = new ArrayList();
        this.f18299h = null;
    }
}
