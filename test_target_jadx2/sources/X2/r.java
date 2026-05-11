package x2;

import D2.f;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import x2.b;

/* loaded from: classes.dex */
final class r {

    /* renamed from: d, reason: collision with root package name */
    private static volatile r f44756d;

    /* renamed from: a, reason: collision with root package name */
    private final c f44757a;

    /* renamed from: b, reason: collision with root package name */
    final Set f44758b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private boolean f44759c;

    class a implements f.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f44760a;

        a(Context context) {
            this.f44760a = context;
        }

        @Override // D2.f.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f44760a.getSystemService("connectivity");
        }
    }

    class b implements b.a {
        b() {
        }

        @Override // x2.b.a
        public void a(boolean z10) {
            ArrayList arrayList;
            D2.l.b();
            synchronized (r.this) {
                arrayList = new ArrayList(r.this.f44758b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b.a) it.next()).a(z10);
            }
        }
    }

    private interface c {
        boolean a();

        void unregister();
    }

    private static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        boolean f44763a;

        /* renamed from: b, reason: collision with root package name */
        final b.a f44764b;

        /* renamed from: c, reason: collision with root package name */
        private final f.b f44765c;

        /* renamed from: d, reason: collision with root package name */
        private final ConnectivityManager.NetworkCallback f44766d = new a();

        class a extends ConnectivityManager.NetworkCallback {

            /* renamed from: x2.r$d$a$a, reason: collision with other inner class name */
            class RunnableC0652a implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ boolean f44768a;

                RunnableC0652a(boolean z10) {
                    this.f44768a = z10;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.f44768a);
                }
            }

            a() {
            }

            private void b(boolean z10) {
                D2.l.v(new RunnableC0652a(z10));
            }

            void a(boolean z10) {
                D2.l.b();
                d dVar = d.this;
                boolean z11 = dVar.f44763a;
                dVar.f44763a = z10;
                if (z11 != z10) {
                    dVar.f44764b.a(z10);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                b(false);
            }
        }

        d(f.b bVar, b.a aVar) {
            this.f44765c = bVar;
            this.f44764b = aVar;
        }

        @Override // x2.r.c
        public boolean a() {
            this.f44763a = ((ConnectivityManager) this.f44765c.get()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) this.f44765c.get()).registerDefaultNetworkCallback(this.f44766d);
                return true;
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                return false;
            }
        }

        @Override // x2.r.c
        public void unregister() {
            ((ConnectivityManager) this.f44765c.get()).unregisterNetworkCallback(this.f44766d);
        }
    }

    private r(Context context) {
        this.f44757a = new d(D2.f.a(new a(context)), new b());
    }

    static r a(Context context) {
        if (f44756d == null) {
            synchronized (r.class) {
                try {
                    if (f44756d == null) {
                        f44756d = new r(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f44756d;
    }

    private void b() {
        if (this.f44759c || this.f44758b.isEmpty()) {
            return;
        }
        this.f44759c = this.f44757a.a();
    }

    private void c() {
        if (this.f44759c && this.f44758b.isEmpty()) {
            this.f44757a.unregister();
            this.f44759c = false;
        }
    }

    synchronized void d(b.a aVar) {
        this.f44758b.add(aVar);
        b();
    }

    synchronized void e(b.a aVar) {
        this.f44758b.remove(aVar);
        c();
    }
}
