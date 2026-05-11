package T6;

import D7.C0787k;
import T6.C1181k;
import V6.AbstractC1278i;
import V6.AbstractC1292x;
import V6.C1285p;
import V6.C1288t;
import V6.C1289u;
import V6.C1291w;
import V6.InterfaceC1293y;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.common.C2010b;
import com.google.android.gms.common.C2017i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC2006a;
import com.google.android.gms.tasks.Task;
import j0.C3477b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: T6.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1171f implements Handler.Callback {

    /* renamed from: p, reason: collision with root package name */
    public static final Status f9414p = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: q, reason: collision with root package name */
    private static final Status f9415q = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: r, reason: collision with root package name */
    private static final Object f9416r = new Object();

    /* renamed from: s, reason: collision with root package name */
    private static C1171f f9417s;

    /* renamed from: c, reason: collision with root package name */
    private C1291w f9420c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC1293y f9421d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f9422e;

    /* renamed from: f, reason: collision with root package name */
    private final C2017i f9423f;

    /* renamed from: g, reason: collision with root package name */
    private final V6.N f9424g;

    /* renamed from: n, reason: collision with root package name */
    private final Handler f9431n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f9432o;

    /* renamed from: a, reason: collision with root package name */
    private long f9418a = 10000;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9419b = false;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicInteger f9425h = new AtomicInteger(1);

    /* renamed from: i, reason: collision with root package name */
    private final AtomicInteger f9426i = new AtomicInteger(0);

    /* renamed from: j, reason: collision with root package name */
    private final Map f9427j = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: k, reason: collision with root package name */
    private B f9428k = null;

    /* renamed from: l, reason: collision with root package name */
    private final Set f9429l = new C3477b();

    /* renamed from: m, reason: collision with root package name */
    private final Set f9430m = new C3477b();

    private C1171f(Context context, Looper looper, C2017i c2017i) {
        this.f9432o = true;
        this.f9422e = context;
        l7.l lVar = new l7.l(looper, this);
        this.f9431n = lVar;
        this.f9423f = c2017i;
        this.f9424g = new V6.N(c2017i);
        if (com.google.android.gms.common.util.j.a(context)) {
            this.f9432o = false;
        }
        lVar.sendMessage(lVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (f9416r) {
            try {
                C1171f c1171f = f9417s;
                if (c1171f != null) {
                    c1171f.f9426i.incrementAndGet();
                    Handler handler = c1171f.f9431n;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status g(C1163b c1163b, C2010b c2010b) {
        return new Status(c2010b, "API: " + c1163b.b() + " is not available on this device. Connection failed with: " + String.valueOf(c2010b));
    }

    private final N h(S6.g gVar) {
        Map map = this.f9427j;
        C1163b C10 = gVar.C();
        N n10 = (N) map.get(C10);
        if (n10 == null) {
            n10 = new N(this, gVar);
            this.f9427j.put(C10, n10);
        }
        if (n10.a()) {
            this.f9430m.add(C10);
        }
        n10.C();
        return n10;
    }

    private final InterfaceC1293y i() {
        if (this.f9421d == null) {
            this.f9421d = AbstractC1292x.a(this.f9422e);
        }
        return this.f9421d;
    }

    private final void j() {
        C1291w c1291w = this.f9420c;
        if (c1291w != null) {
            if (c1291w.j() > 0 || e()) {
                i().h(c1291w);
            }
            this.f9420c = null;
        }
    }

    private final void k(C0787k c0787k, int i10, S6.g gVar) {
        C1164b0 a10;
        if (i10 == 0 || (a10 = C1164b0.a(this, i10, gVar.C())) == null) {
            return;
        }
        Task a11 = c0787k.a();
        final Handler handler = this.f9431n;
        handler.getClass();
        a11.c(new Executor() { // from class: T6.H
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, a10);
    }

    public static C1171f u(Context context) {
        C1171f c1171f;
        synchronized (f9416r) {
            try {
                if (f9417s == null) {
                    f9417s = new C1171f(context.getApplicationContext(), AbstractC1278i.c().getLooper(), C2017i.q());
                }
                c1171f = f9417s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1171f;
    }

    public final void C(S6.g gVar, int i10, AbstractC2006a abstractC2006a) {
        this.f9431n.sendMessage(this.f9431n.obtainMessage(4, new C1168d0(new r0(i10, abstractC2006a), this.f9426i.get(), gVar)));
    }

    public final void D(S6.g gVar, int i10, AbstractC1191v abstractC1191v, C0787k c0787k, InterfaceC1189t interfaceC1189t) {
        k(c0787k, abstractC1191v.d(), gVar);
        this.f9431n.sendMessage(this.f9431n.obtainMessage(4, new C1168d0(new t0(i10, abstractC1191v, c0787k, interfaceC1189t), this.f9426i.get(), gVar)));
    }

    final void E(C1285p c1285p, int i10, long j10, int i11) {
        this.f9431n.sendMessage(this.f9431n.obtainMessage(18, new C1166c0(c1285p, i10, j10, i11)));
    }

    public final void F(C2010b c2010b, int i10) {
        if (f(c2010b, i10)) {
            return;
        }
        Handler handler = this.f9431n;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, c2010b));
    }

    public final void G() {
        Handler handler = this.f9431n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void H(S6.g gVar) {
        Handler handler = this.f9431n;
        handler.sendMessage(handler.obtainMessage(7, gVar));
    }

    public final void b(B b10) {
        synchronized (f9416r) {
            try {
                if (this.f9428k != b10) {
                    this.f9428k = b10;
                    this.f9429l.clear();
                }
                this.f9429l.addAll(b10.t());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final void c(B b10) {
        synchronized (f9416r) {
            try {
                if (this.f9428k == b10) {
                    this.f9428k = null;
                    this.f9429l.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final boolean e() {
        if (this.f9419b) {
            return false;
        }
        C1289u a10 = C1288t.b().a();
        if (a10 != null && !a10.F()) {
            return false;
        }
        int a11 = this.f9424g.a(this.f9422e, 203400000);
        return a11 == -1 || a11 == 0;
    }

    final boolean f(C2010b c2010b, int i10) {
        return this.f9423f.B(this.f9422e, c2010b, i10);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C1163b c1163b;
        C1163b c1163b2;
        C1163b c1163b3;
        C1163b c1163b4;
        C1163b c1163b5;
        int i10 = message.what;
        N n10 = null;
        switch (i10) {
            case 1:
                this.f9418a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f9431n.removeMessages(12);
                for (C1163b c1163b6 : this.f9427j.keySet()) {
                    Handler handler = this.f9431n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c1163b6), this.f9418a);
                }
                return true;
            case 2:
                android.support.v4.media.session.b.a(message.obj);
                throw null;
            case 3:
                for (N n11 : this.f9427j.values()) {
                    n11.B();
                    n11.C();
                }
                return true;
            case 4:
            case 8:
            case 13:
                C1168d0 c1168d0 = (C1168d0) message.obj;
                N n12 = (N) this.f9427j.get(c1168d0.f9410c.C());
                if (n12 == null) {
                    n12 = h(c1168d0.f9410c);
                }
                if (!n12.a() || this.f9426i.get() == c1168d0.f9409b) {
                    n12.D(c1168d0.f9408a);
                } else {
                    c1168d0.f9408a.a(f9414p);
                    n12.I();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                C2010b c2010b = (C2010b) message.obj;
                Iterator it = this.f9427j.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        N n13 = (N) it.next();
                        if (n13.q() == i11) {
                            n10 = n13;
                        }
                    }
                }
                if (n10 == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                } else if (c2010b.u() == 13) {
                    n10.e(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f9423f.g(c2010b.u()) + ": " + c2010b.F()));
                } else {
                    c1163b = n10.f9363h;
                    n10.e(g(c1163b, c2010b));
                }
                return true;
            case 6:
                if (this.f9422e.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C1165c.c((Application) this.f9422e.getApplicationContext());
                    ComponentCallbacks2C1165c.b().a(new I(this));
                    if (!ComponentCallbacks2C1165c.b().e(true)) {
                        this.f9418a = 300000L;
                    }
                }
                return true;
            case 7:
                h((S6.g) message.obj);
                return true;
            case 9:
                if (this.f9427j.containsKey(message.obj)) {
                    ((N) this.f9427j.get(message.obj)).H();
                }
                return true;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                Iterator it2 = this.f9430m.iterator();
                while (it2.hasNext()) {
                    N n14 = (N) this.f9427j.remove((C1163b) it2.next());
                    if (n14 != null) {
                        n14.I();
                    }
                }
                this.f9430m.clear();
                return true;
            case 11:
                if (this.f9427j.containsKey(message.obj)) {
                    ((N) this.f9427j.get(message.obj)).J();
                }
                return true;
            case 12:
                if (this.f9427j.containsKey(message.obj)) {
                    ((N) this.f9427j.get(message.obj)).b();
                }
                return true;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                android.support.v4.media.session.b.a(message.obj);
                throw null;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                P p10 = (P) message.obj;
                Map map = this.f9427j;
                c1163b2 = p10.f9374a;
                if (map.containsKey(c1163b2)) {
                    Map map2 = this.f9427j;
                    c1163b3 = p10.f9374a;
                    N.z((N) map2.get(c1163b3), p10);
                }
                return true;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                P p11 = (P) message.obj;
                Map map3 = this.f9427j;
                c1163b4 = p11.f9374a;
                if (map3.containsKey(c1163b4)) {
                    Map map4 = this.f9427j;
                    c1163b5 = p11.f9374a;
                    N.A((N) map4.get(c1163b5), p11);
                }
                return true;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                j();
                return true;
            case 18:
                C1166c0 c1166c0 = (C1166c0) message.obj;
                if (c1166c0.f9406c == 0) {
                    i().h(new C1291w(c1166c0.f9405b, Arrays.asList(c1166c0.f9404a)));
                } else {
                    C1291w c1291w = this.f9420c;
                    if (c1291w != null) {
                        List u10 = c1291w.u();
                        if (c1291w.j() != c1166c0.f9405b || (u10 != null && u10.size() >= c1166c0.f9407d)) {
                            this.f9431n.removeMessages(17);
                            j();
                        } else {
                            this.f9420c.F(c1166c0.f9404a);
                        }
                    }
                    if (this.f9420c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c1166c0.f9404a);
                        this.f9420c = new C1291w(c1166c0.f9405b, arrayList);
                        Handler handler2 = this.f9431n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), c1166c0.f9406c);
                    }
                }
                return true;
            case 19:
                this.f9419b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
    }

    public final int l() {
        return this.f9425h.getAndIncrement();
    }

    final N t(C1163b c1163b) {
        return (N) this.f9427j.get(c1163b);
    }

    public final Task w(S6.g gVar, AbstractC1186p abstractC1186p, AbstractC1193x abstractC1193x, Runnable runnable) {
        C0787k c0787k = new C0787k();
        k(c0787k, abstractC1186p.e(), gVar);
        this.f9431n.sendMessage(this.f9431n.obtainMessage(8, new C1168d0(new s0(new C1170e0(abstractC1186p, abstractC1193x, runnable), c0787k), this.f9426i.get(), gVar)));
        return c0787k.a();
    }

    public final Task x(S6.g gVar, C1181k.a aVar, int i10) {
        C0787k c0787k = new C0787k();
        k(c0787k, i10, gVar);
        this.f9431n.sendMessage(this.f9431n.obtainMessage(13, new C1168d0(new u0(aVar, c0787k), this.f9426i.get(), gVar)));
        return c0787k.a();
    }
}
