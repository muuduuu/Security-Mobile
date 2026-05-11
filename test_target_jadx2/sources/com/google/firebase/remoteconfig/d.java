package com.google.firebase.remoteconfig;

import D7.AbstractC0789m;
import T6.ComponentCallbacks2C1165c;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.util.f;
import com.google.android.gms.common.util.i;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.p;
import com.google.firebase.remoteconfig.internal.t;
import com.google.firebase.remoteconfig.internal.u;
import com.google.firebase.remoteconfig.internal.y;
import j8.C3511e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import k8.C3554c;
import m8.InterfaceC3657a;

/* loaded from: classes2.dex */
public class d implements L8.a {

    /* renamed from: j, reason: collision with root package name */
    private static final f f28282j = i.d();

    /* renamed from: k, reason: collision with root package name */
    private static final Random f28283k = new Random();

    /* renamed from: l, reason: collision with root package name */
    private static final Map f28284l = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Map f28285a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f28286b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f28287c;

    /* renamed from: d, reason: collision with root package name */
    private final C3511e f28288d;

    /* renamed from: e, reason: collision with root package name */
    private final B8.f f28289e;

    /* renamed from: f, reason: collision with root package name */
    private final C3554c f28290f;

    /* renamed from: g, reason: collision with root package name */
    private final A8.b f28291g;

    /* renamed from: h, reason: collision with root package name */
    private final String f28292h;

    /* renamed from: i, reason: collision with root package name */
    private Map f28293i;

    private static class a implements ComponentCallbacks2C1165c.a {

        /* renamed from: a, reason: collision with root package name */
        private static final AtomicReference f28294a = new AtomicReference();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference = f28294a;
            if (atomicReference.get() == null) {
                a aVar = new a();
                if (androidx.camera.view.i.a(atomicReference, null, aVar)) {
                    ComponentCallbacks2C1165c.c(application);
                    ComponentCallbacks2C1165c.b().a(aVar);
                }
            }
        }

        @Override // T6.ComponentCallbacks2C1165c.a
        public void a(boolean z10) {
            d.q(z10);
        }
    }

    d(Context context, ScheduledExecutorService scheduledExecutorService, C3511e c3511e, B8.f fVar, C3554c c3554c, A8.b bVar) {
        this(context, scheduledExecutorService, c3511e, fVar, c3554c, bVar, true);
    }

    private com.google.firebase.remoteconfig.internal.f e(String str, String str2) {
        return com.google.firebase.remoteconfig.internal.f.h(this.f28287c, u.c(this.f28286b, String.format("%s_%s_%s_%s.json", "frc", this.f28292h, str, str2)));
    }

    private o i(com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.f fVar2) {
        return new o(this.f28287c, fVar, fVar2);
    }

    private static y j(C3511e c3511e, String str, A8.b bVar) {
        if (o(c3511e) && str.equals("firebase")) {
            return new y(bVar);
        }
        return null;
    }

    private K8.c l(com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.f fVar2) {
        return new K8.c(fVar, K8.a.a(fVar, fVar2), this.f28287c);
    }

    static t m(Context context, String str, String str2) {
        return new t(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    private static boolean n(C3511e c3511e, String str) {
        return str.equals("firebase") && o(c3511e);
    }

    private static boolean o(C3511e c3511e) {
        return c3511e.p().equals("[DEFAULT]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC3657a p() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void q(boolean z10) {
        synchronized (d.class) {
            Iterator it = f28284l.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).G(z10);
            }
        }
    }

    synchronized b c(C3511e c3511e, String str, B8.f fVar, C3554c c3554c, Executor executor, com.google.firebase.remoteconfig.internal.f fVar2, com.google.firebase.remoteconfig.internal.f fVar3, com.google.firebase.remoteconfig.internal.f fVar4, m mVar, o oVar, t tVar, K8.c cVar) {
        try {
            if (!this.f28285a.containsKey(str)) {
                b bVar = new b(this.f28286b, c3511e, fVar, n(c3511e, str) ? c3554c : null, executor, fVar2, fVar3, fVar4, mVar, oVar, tVar, k(c3511e, fVar, mVar, fVar3, this.f28286b, str, tVar), cVar);
                bVar.L();
                this.f28285a.put(str, bVar);
                f28284l.put(str, bVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (b) this.f28285a.get(str);
    }

    public synchronized b d(String str) {
        com.google.firebase.remoteconfig.internal.f e10;
        com.google.firebase.remoteconfig.internal.f e11;
        com.google.firebase.remoteconfig.internal.f e12;
        t m10;
        o i10;
        try {
            e10 = e(str, "fetch");
            e11 = e(str, "activate");
            e12 = e(str, "defaults");
            m10 = m(this.f28286b, this.f28292h, str);
            i10 = i(e11, e12);
            final y j10 = j(this.f28288d, str, this.f28291g);
            if (j10 != null) {
                i10.b(new com.google.android.gms.common.util.d() { // from class: J8.w
                    @Override // com.google.android.gms.common.util.d
                    public final void a(Object obj, Object obj2) {
                        com.google.firebase.remoteconfig.internal.y.this.a((String) obj, (com.google.firebase.remoteconfig.internal.g) obj2);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return c(this.f28288d, str, this.f28289e, this.f28290f, this.f28287c, e10, e11, e12, g(str, e10, m10), i10, m10, l(e11, e12));
    }

    b f() {
        return d("firebase");
    }

    synchronized m g(String str, com.google.firebase.remoteconfig.internal.f fVar, t tVar) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new m(this.f28289e, o(this.f28288d) ? this.f28291g : new A8.b() { // from class: J8.x
            @Override // A8.b
            public final Object get() {
                InterfaceC3657a p10;
                p10 = com.google.firebase.remoteconfig.d.p();
                return p10;
            }
        }, this.f28287c, f28282j, f28283k, fVar, h(this.f28288d.q().b(), str, tVar), tVar, this.f28293i);
    }

    ConfigFetchHttpClient h(String str, String str2, t tVar) {
        return new ConfigFetchHttpClient(this.f28286b, this.f28288d.q().c(), str, str2, tVar.d(), tVar.d());
    }

    synchronized p k(C3511e c3511e, B8.f fVar, m mVar, com.google.firebase.remoteconfig.internal.f fVar2, Context context, String str, t tVar) {
        return new p(c3511e, fVar, mVar, fVar2, context, str, tVar, this.f28287c);
    }

    protected d(Context context, ScheduledExecutorService scheduledExecutorService, C3511e c3511e, B8.f fVar, C3554c c3554c, A8.b bVar, boolean z10) {
        this.f28285a = new HashMap();
        this.f28293i = new HashMap();
        this.f28286b = context;
        this.f28287c = scheduledExecutorService;
        this.f28288d = c3511e;
        this.f28289e = fVar;
        this.f28290f = c3554c;
        this.f28291g = bVar;
        this.f28292h = c3511e.q().c();
        a.c(context);
        if (z10) {
            AbstractC0789m.d(scheduledExecutorService, new Callable() { // from class: com.google.firebase.remoteconfig.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return d.this.f();
                }
            });
        }
    }
}
