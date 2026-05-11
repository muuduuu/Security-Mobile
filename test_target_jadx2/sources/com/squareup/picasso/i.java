package com.squareup.picasso;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.appsflyer.attribution.RequestError;
import com.squareup.picasso.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    final b f29581a;

    /* renamed from: b, reason: collision with root package name */
    final Context f29582b;

    /* renamed from: c, reason: collision with root package name */
    final ExecutorService f29583c;

    /* renamed from: d, reason: collision with root package name */
    final j f29584d;

    /* renamed from: e, reason: collision with root package name */
    final Map f29585e;

    /* renamed from: f, reason: collision with root package name */
    final Map f29586f;

    /* renamed from: g, reason: collision with root package name */
    final Map f29587g;

    /* renamed from: h, reason: collision with root package name */
    final Set f29588h;

    /* renamed from: i, reason: collision with root package name */
    final Handler f29589i;

    /* renamed from: j, reason: collision with root package name */
    final Handler f29590j;

    /* renamed from: k, reason: collision with root package name */
    final InterfaceC2927d f29591k;

    /* renamed from: l, reason: collision with root package name */
    final B f29592l;

    /* renamed from: m, reason: collision with root package name */
    final List f29593m;

    /* renamed from: n, reason: collision with root package name */
    final c f29594n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f29595o;

    /* renamed from: p, reason: collision with root package name */
    boolean f29596p;

    private static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final i f29597a;

        /* renamed from: com.squareup.picasso.i$a$a, reason: collision with other inner class name */
        class RunnableC0437a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Message f29598a;

            RunnableC0437a(Message message) {
                this.f29598a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f29598a.what);
            }
        }

        a(Looper looper, i iVar) {
            super(looper);
            this.f29597a = iVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f29597a.v((AbstractC2924a) message.obj);
                    break;
                case 2:
                    this.f29597a.o((AbstractC2924a) message.obj);
                    break;
                case 3:
                case 8:
                default:
                    u.f29623o.post(new RunnableC0437a(message));
                    break;
                case 4:
                    this.f29597a.p((RunnableC2926c) message.obj);
                    break;
                case 5:
                    this.f29597a.u((RunnableC2926c) message.obj);
                    break;
                case 6:
                    this.f29597a.q((RunnableC2926c) message.obj, false);
                    break;
                case 7:
                    this.f29597a.n();
                    break;
                case 9:
                    this.f29597a.r((NetworkInfo) message.obj);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    this.f29597a.m(message.arg1 == 1);
                    break;
                case 11:
                    this.f29597a.s(message.obj);
                    break;
                case 12:
                    this.f29597a.t(message.obj);
                    break;
            }
        }
    }

    static class b extends HandlerThread {
        b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    static class c extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private final i f29600a;

        c(i iVar) {
            this.f29600a = iVar;
        }

        void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f29600a.f29595o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f29600a.f29582b.registerReceiver(this, intentFilter);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (intent.hasExtra(Keys.STATE)) {
                    this.f29600a.b(intent.getBooleanExtra(Keys.STATE, false));
                }
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                this.f29600a.f(((ConnectivityManager) G.n(context, "connectivity")).getActiveNetworkInfo());
            }
        }
    }

    i(Context context, ExecutorService executorService, Handler handler, j jVar, InterfaceC2927d interfaceC2927d, B b10) {
        b bVar = new b();
        this.f29581a = bVar;
        bVar.start();
        G.h(bVar.getLooper());
        this.f29582b = context;
        this.f29583c = executorService;
        this.f29585e = new LinkedHashMap();
        this.f29586f = new WeakHashMap();
        this.f29587g = new WeakHashMap();
        this.f29588h = new LinkedHashSet();
        this.f29589i = new a(bVar.getLooper(), this);
        this.f29584d = jVar;
        this.f29590j = handler;
        this.f29591k = interfaceC2927d;
        this.f29592l = b10;
        this.f29593m = new ArrayList(4);
        this.f29596p = G.p(context);
        this.f29595o = G.o(context, "android.permission.ACCESS_NETWORK_STATE");
        c cVar = new c(this);
        this.f29594n = cVar;
        cVar.a();
    }

    private void a(RunnableC2926c runnableC2926c) {
        if (runnableC2926c.u()) {
            return;
        }
        Bitmap bitmap = runnableC2926c.f29567m;
        if (bitmap != null) {
            bitmap.prepareToDraw();
        }
        this.f29593m.add(runnableC2926c);
        if (this.f29589i.hasMessages(7)) {
            return;
        }
        this.f29589i.sendEmptyMessageDelayed(7, 200L);
    }

    private void i() {
        if (this.f29586f.isEmpty()) {
            return;
        }
        Iterator it = this.f29586f.values().iterator();
        while (it.hasNext()) {
            AbstractC2924a abstractC2924a = (AbstractC2924a) it.next();
            it.remove();
            if (abstractC2924a.g().f29637m) {
                G.s("Dispatcher", "replaying", abstractC2924a.i().d());
            }
            w(abstractC2924a, false);
        }
    }

    private void j(List list) {
        if (list == null || list.isEmpty() || !((RunnableC2926c) list.get(0)).q().f29637m) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RunnableC2926c runnableC2926c = (RunnableC2926c) it.next();
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(G.j(runnableC2926c));
        }
        G.s("Dispatcher", "delivered", sb2.toString());
    }

    private void k(AbstractC2924a abstractC2924a) {
        Object k10 = abstractC2924a.k();
        if (k10 != null) {
            abstractC2924a.f29544k = true;
            this.f29586f.put(k10, abstractC2924a);
        }
    }

    private void l(RunnableC2926c runnableC2926c) {
        AbstractC2924a h10 = runnableC2926c.h();
        if (h10 != null) {
            k(h10);
        }
        List i10 = runnableC2926c.i();
        if (i10 != null) {
            int size = i10.size();
            for (int i11 = 0; i11 < size; i11++) {
                k((AbstractC2924a) i10.get(i11));
            }
        }
    }

    void b(boolean z10) {
        Handler handler = this.f29589i;
        handler.sendMessage(handler.obtainMessage(10, z10 ? 1 : 0, 0));
    }

    void c(AbstractC2924a abstractC2924a) {
        Handler handler = this.f29589i;
        handler.sendMessage(handler.obtainMessage(2, abstractC2924a));
    }

    void d(RunnableC2926c runnableC2926c) {
        Handler handler = this.f29589i;
        handler.sendMessage(handler.obtainMessage(4, runnableC2926c));
    }

    void e(RunnableC2926c runnableC2926c) {
        Handler handler = this.f29589i;
        handler.sendMessage(handler.obtainMessage(6, runnableC2926c));
    }

    void f(NetworkInfo networkInfo) {
        Handler handler = this.f29589i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    void g(RunnableC2926c runnableC2926c) {
        Handler handler = this.f29589i;
        handler.sendMessageDelayed(handler.obtainMessage(5, runnableC2926c), 500L);
    }

    void h(AbstractC2924a abstractC2924a) {
        Handler handler = this.f29589i;
        handler.sendMessage(handler.obtainMessage(1, abstractC2924a));
    }

    void m(boolean z10) {
        this.f29596p = z10;
    }

    void n() {
        ArrayList arrayList = new ArrayList(this.f29593m);
        this.f29593m.clear();
        Handler handler = this.f29590j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        j(arrayList);
    }

    void o(AbstractC2924a abstractC2924a) {
        String d10 = abstractC2924a.d();
        RunnableC2926c runnableC2926c = (RunnableC2926c) this.f29585e.get(d10);
        if (runnableC2926c != null) {
            runnableC2926c.f(abstractC2924a);
            if (runnableC2926c.c()) {
                this.f29585e.remove(d10);
                if (abstractC2924a.g().f29637m) {
                    G.s("Dispatcher", "canceled", abstractC2924a.i().d());
                }
            }
        }
        if (this.f29588h.contains(abstractC2924a.j())) {
            this.f29587g.remove(abstractC2924a.k());
            if (abstractC2924a.g().f29637m) {
                G.t("Dispatcher", "canceled", abstractC2924a.i().d(), "because paused request got canceled");
            }
        }
        AbstractC2924a abstractC2924a2 = (AbstractC2924a) this.f29586f.remove(abstractC2924a.k());
        if (abstractC2924a2 == null || !abstractC2924a2.g().f29637m) {
            return;
        }
        G.t("Dispatcher", "canceled", abstractC2924a2.i().d(), "from replaying");
    }

    void p(RunnableC2926c runnableC2926c) {
        if (q.shouldWriteToMemoryCache(runnableC2926c.p())) {
            this.f29591k.c(runnableC2926c.n(), runnableC2926c.s());
        }
        this.f29585e.remove(runnableC2926c.n());
        a(runnableC2926c);
        if (runnableC2926c.q().f29637m) {
            G.t("Dispatcher", "batched", G.j(runnableC2926c), "for completion");
        }
    }

    void q(RunnableC2926c runnableC2926c, boolean z10) {
        if (runnableC2926c.q().f29637m) {
            String j10 = G.j(runnableC2926c);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("for error");
            sb2.append(z10 ? " (will replay)" : BuildConfig.FLAVOR);
            G.t("Dispatcher", "batched", j10, sb2.toString());
        }
        this.f29585e.remove(runnableC2926c.n());
        a(runnableC2926c);
    }

    void r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f29583c;
        if (executorService instanceof w) {
            ((w) executorService).a(networkInfo);
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return;
        }
        i();
    }

    void s(Object obj) {
        if (this.f29588h.add(obj)) {
            Iterator it = this.f29585e.values().iterator();
            while (it.hasNext()) {
                RunnableC2926c runnableC2926c = (RunnableC2926c) it.next();
                boolean z10 = runnableC2926c.q().f29637m;
                AbstractC2924a h10 = runnableC2926c.h();
                List i10 = runnableC2926c.i();
                boolean z11 = (i10 == null || i10.isEmpty()) ? false : true;
                if (h10 != null || z11) {
                    if (h10 != null && h10.j().equals(obj)) {
                        runnableC2926c.f(h10);
                        this.f29587g.put(h10.k(), h10);
                        if (z10) {
                            G.t("Dispatcher", "paused", h10.f29535b.d(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z11) {
                        for (int size = i10.size() - 1; size >= 0; size--) {
                            AbstractC2924a abstractC2924a = (AbstractC2924a) i10.get(size);
                            if (abstractC2924a.j().equals(obj)) {
                                runnableC2926c.f(abstractC2924a);
                                this.f29587g.put(abstractC2924a.k(), abstractC2924a);
                                if (z10) {
                                    G.t("Dispatcher", "paused", abstractC2924a.f29535b.d(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (runnableC2926c.c()) {
                        it.remove();
                        if (z10) {
                            G.t("Dispatcher", "canceled", G.j(runnableC2926c), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    void t(Object obj) {
        if (this.f29588h.remove(obj)) {
            Iterator it = this.f29587g.values().iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                AbstractC2924a abstractC2924a = (AbstractC2924a) it.next();
                if (abstractC2924a.j().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractC2924a);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f29590j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    void u(RunnableC2926c runnableC2926c) {
        if (runnableC2926c.u()) {
            return;
        }
        boolean z10 = false;
        if (this.f29583c.isShutdown()) {
            q(runnableC2926c, false);
            return;
        }
        if (runnableC2926c.w(this.f29596p, this.f29595o ? ((ConnectivityManager) G.n(this.f29582b, "connectivity")).getActiveNetworkInfo() : null)) {
            if (runnableC2926c.q().f29637m) {
                G.s("Dispatcher", "retrying", G.j(runnableC2926c));
            }
            if (runnableC2926c.k() instanceof s.a) {
                runnableC2926c.f29563i |= r.NO_CACHE.index;
            }
            runnableC2926c.f29568n = this.f29583c.submit(runnableC2926c);
            return;
        }
        if (this.f29595o && runnableC2926c.x()) {
            z10 = true;
        }
        q(runnableC2926c, z10);
        if (z10) {
            l(runnableC2926c);
        }
    }

    void v(AbstractC2924a abstractC2924a) {
        w(abstractC2924a, true);
    }

    void w(AbstractC2924a abstractC2924a, boolean z10) {
        if (this.f29588h.contains(abstractC2924a.j())) {
            this.f29587g.put(abstractC2924a.k(), abstractC2924a);
            if (abstractC2924a.g().f29637m) {
                G.t("Dispatcher", "paused", abstractC2924a.f29535b.d(), "because tag '" + abstractC2924a.j() + "' is paused");
                return;
            }
            return;
        }
        RunnableC2926c runnableC2926c = (RunnableC2926c) this.f29585e.get(abstractC2924a.d());
        if (runnableC2926c != null) {
            runnableC2926c.b(abstractC2924a);
            return;
        }
        if (this.f29583c.isShutdown()) {
            if (abstractC2924a.g().f29637m) {
                G.t("Dispatcher", "ignored", abstractC2924a.f29535b.d(), "because shut down");
                return;
            }
            return;
        }
        RunnableC2926c g10 = RunnableC2926c.g(abstractC2924a.g(), this, this.f29591k, this.f29592l, abstractC2924a);
        g10.f29568n = this.f29583c.submit(g10);
        this.f29585e.put(abstractC2924a.d(), g10);
        if (z10) {
            this.f29586f.remove(abstractC2924a.k());
        }
        if (abstractC2924a.g().f29637m) {
            G.s("Dispatcher", "enqueued", abstractC2924a.f29535b.d());
        }
    }
}
