package com.google.firebase.messaging;

import D7.AbstractC0789m;
import D7.C0787k;
import D7.InterfaceC0783g;
import D7.InterfaceC0786j;
import R6.C1143a;
import V6.AbstractC1287s;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import c7.ThreadFactoryC1738b;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Z;
import com.google.firebase.messaging.e0;
import j8.C3508b;
import j8.C3511e;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m8.InterfaceC3657a;
import org.conscrypt.BuildConfig;
import s6.InterfaceC4323i;
import x8.C5133a;
import x8.InterfaceC5134b;
import x8.InterfaceC5136d;
import z8.InterfaceC5263a;

/* loaded from: classes2.dex */
public class FirebaseMessaging {

    /* renamed from: m, reason: collision with root package name */
    private static e0 f28050m;

    /* renamed from: o, reason: collision with root package name */
    static ScheduledExecutorService f28052o;

    /* renamed from: a, reason: collision with root package name */
    private final C3511e f28053a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f28054b;

    /* renamed from: c, reason: collision with root package name */
    private final H f28055c;

    /* renamed from: d, reason: collision with root package name */
    private final Z f28056d;

    /* renamed from: e, reason: collision with root package name */
    private final a f28057e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f28058f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f28059g;

    /* renamed from: h, reason: collision with root package name */
    private final Task f28060h;

    /* renamed from: i, reason: collision with root package name */
    private final M f28061i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f28062j;

    /* renamed from: k, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f28063k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f28049l = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: n, reason: collision with root package name */
    static A8.b f28051n = new A8.b() { // from class: com.google.firebase.messaging.r
        @Override // A8.b
        public final Object get() {
            InterfaceC4323i O10;
            O10 = FirebaseMessaging.O();
            return O10;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC5136d f28064a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f28065b;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC5134b f28066c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f28067d;

        a(InterfaceC5136d interfaceC5136d) {
            this.f28064a = interfaceC5136d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(C5133a c5133a) {
            if (c()) {
                FirebaseMessaging.this.Y();
            }
        }

        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context l10 = FirebaseMessaging.this.f28053a.l();
            SharedPreferences sharedPreferences = l10.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = l10.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(l10.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            try {
                if (this.f28065b) {
                    return;
                }
                Boolean e10 = e();
                this.f28067d = e10;
                if (e10 == null) {
                    InterfaceC5134b interfaceC5134b = new InterfaceC5134b() { // from class: com.google.firebase.messaging.E
                        @Override // x8.InterfaceC5134b
                        public final void a(C5133a c5133a) {
                            FirebaseMessaging.a.this.d(c5133a);
                        }
                    };
                    this.f28066c = interfaceC5134b;
                    this.f28064a.b(C3508b.class, interfaceC5134b);
                }
                this.f28065b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        synchronized boolean c() {
            Boolean bool;
            try {
                b();
                bool = this.f28067d;
            } catch (Throwable th) {
                throw th;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f28053a.w();
        }

        synchronized void f(boolean z10) {
            try {
                b();
                InterfaceC5134b interfaceC5134b = this.f28066c;
                if (interfaceC5134b != null) {
                    this.f28064a.a(C3508b.class, interfaceC5134b);
                    this.f28066c = null;
                }
                SharedPreferences.Editor edit = FirebaseMessaging.this.f28053a.l().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                edit.putBoolean("auto_init", z10);
                edit.apply();
                if (z10) {
                    FirebaseMessaging.this.Y();
                }
                this.f28067d = Boolean.valueOf(z10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    FirebaseMessaging(C3511e c3511e, InterfaceC5263a interfaceC5263a, A8.b bVar, A8.b bVar2, B8.f fVar, A8.b bVar3, InterfaceC5136d interfaceC5136d) {
        this(c3511e, interfaceC5263a, bVar, bVar2, fVar, bVar3, interfaceC5136d, new M(c3511e.l()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void M() {
        T.c(this.f28054b);
        V.g(this.f28054b, this.f28055c, W());
        if (W()) {
            z();
        }
    }

    private void B(String str) {
        if ("[DEFAULT]".equals(this.f28053a.p())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f28053a.p());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C2849n(this.f28054b).k(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task F(String str, e0.a aVar, String str2) {
        u(this.f28054b).g(v(), str, str2, this.f28061i.a());
        if (aVar == null || !str2.equals(aVar.f28171a)) {
            B(str2);
        }
        return AbstractC0789m.g(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task G(final String str, final e0.a aVar) {
        return this.f28055c.g().o(this.f28059g, new InterfaceC0786j() { // from class: com.google.firebase.messaging.u
            @Override // D7.InterfaceC0786j
            public final Task a(Object obj) {
                Task F10;
                F10 = FirebaseMessaging.this.F(str, aVar, (String) obj);
                return F10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(C0787k c0787k) {
        try {
            AbstractC0789m.a(this.f28055c.c());
            u(this.f28054b).d(v(), M.c(this.f28053a));
            c0787k.c(null);
        } catch (Exception e10) {
            c0787k.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(C0787k c0787k) {
        try {
            c0787k.c(o());
        } catch (Exception e10) {
            c0787k.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(C1143a c1143a) {
        if (c1143a != null) {
            L.y(c1143a.j());
            z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K() {
        if (C()) {
            Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(j0 j0Var) {
        if (C()) {
            j0Var.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(Void r32) {
        V.g(this.f28054b, this.f28055c, W());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC4323i O() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task P(String str, j0 j0Var) {
        return j0Var.r(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task Q(String str, j0 j0Var) {
        return j0Var.u(str);
    }

    private boolean W() {
        T.c(this.f28054b);
        if (!T.d(this.f28054b)) {
            return false;
        }
        if (this.f28053a.j(InterfaceC3657a.class) != null) {
            return true;
        }
        return L.a() && f28051n != null;
    }

    private synchronized void X() {
        if (!this.f28062j) {
            a0(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        if (b0(x())) {
            X();
        }
    }

    static synchronized FirebaseMessaging getInstance(C3511e c3511e) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) c3511e.j(FirebaseMessaging.class);
            AbstractC1287s.n(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static synchronized FirebaseMessaging t() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(C3511e.n());
        }
        return firebaseMessaging;
    }

    private static synchronized e0 u(Context context) {
        e0 e0Var;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f28050m == null) {
                    f28050m = new e0(context);
                }
                e0Var = f28050m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return e0Var;
    }

    private String v() {
        return "[DEFAULT]".equals(this.f28053a.p()) ? BuildConfig.FLAVOR : this.f28053a.r();
    }

    public static InterfaceC4323i y() {
        return (InterfaceC4323i) f28051n.get();
    }

    private void z() {
        this.f28055c.f().g(this.f28058f, new InterfaceC0783g() { // from class: com.google.firebase.messaging.D
            @Override // D7.InterfaceC0783g
            public final void onSuccess(Object obj) {
                FirebaseMessaging.this.J((C1143a) obj);
            }
        });
    }

    public boolean C() {
        return this.f28057e.c();
    }

    boolean D() {
        return this.f28061i.g();
    }

    public boolean E() {
        return T.d(this.f28054b);
    }

    public void R(W w10) {
        if (TextUtils.isEmpty(w10.o1())) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        intent.putExtra("app", PendingIntent.getBroadcast(this.f28054b, 0, intent2, 67108864));
        intent.setPackage("com.google.android.gms");
        w10.v1(intent);
        this.f28054b.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void S(boolean z10) {
        this.f28057e.f(z10);
    }

    public void T(boolean z10) {
        L.B(z10);
        V.g(this.f28054b, this.f28055c, W());
    }

    public Task U(boolean z10) {
        return T.f(this.f28058f, this.f28054b, z10).g(new androidx.privacysandbox.ads.adservices.measurement.k(), new InterfaceC0783g() { // from class: com.google.firebase.messaging.v
            @Override // D7.InterfaceC0783g
            public final void onSuccess(Object obj) {
                FirebaseMessaging.this.N((Void) obj);
            }
        });
    }

    synchronized void V(boolean z10) {
        this.f28062j = z10;
    }

    public Task Z(final String str) {
        return this.f28060h.n(new InterfaceC0786j() { // from class: com.google.firebase.messaging.C
            @Override // D7.InterfaceC0786j
            public final Task a(Object obj) {
                Task P10;
                P10 = FirebaseMessaging.P(str, (j0) obj);
                return P10;
            }
        });
    }

    synchronized void a0(long j10) {
        r(new f0(this, Math.min(Math.max(30L, 2 * j10), f28049l)), j10);
        this.f28062j = true;
    }

    boolean b0(e0.a aVar) {
        return aVar == null || aVar.b(this.f28061i.a());
    }

    public Task c0(final String str) {
        return this.f28060h.n(new InterfaceC0786j() { // from class: com.google.firebase.messaging.s
            @Override // D7.InterfaceC0786j
            public final Task a(Object obj) {
                Task Q10;
                Q10 = FirebaseMessaging.Q(str, (j0) obj);
                return Q10;
            }
        });
    }

    String o() {
        final e0.a x10 = x();
        if (!b0(x10)) {
            return x10.f28171a;
        }
        final String c10 = M.c(this.f28053a);
        try {
            return (String) AbstractC0789m.a(this.f28056d.b(c10, new Z.a() { // from class: com.google.firebase.messaging.t
                @Override // com.google.firebase.messaging.Z.a
                public final Task start() {
                    Task G10;
                    G10 = FirebaseMessaging.this.G(c10, x10);
                    return G10;
                }
            }));
        } catch (InterruptedException | ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    public Task p() {
        if (x() == null) {
            return AbstractC0789m.g(null);
        }
        final C0787k c0787k = new C0787k();
        AbstractC2850o.e().execute(new Runnable() { // from class: com.google.firebase.messaging.x
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.H(c0787k);
            }
        });
        return c0787k.a();
    }

    public boolean q() {
        return L.a();
    }

    void r(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f28052o == null) {
                    f28052o = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1738b("TAG"));
                }
                f28052o.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    Context s() {
        return this.f28054b;
    }

    public Task w() {
        final C0787k c0787k = new C0787k();
        this.f28058f.execute(new Runnable() { // from class: com.google.firebase.messaging.w
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.I(c0787k);
            }
        });
        return c0787k.a();
    }

    e0.a x() {
        return u(this.f28054b).e(v(), M.c(this.f28053a));
    }

    FirebaseMessaging(C3511e c3511e, InterfaceC5263a interfaceC5263a, A8.b bVar, A8.b bVar2, B8.f fVar, A8.b bVar3, InterfaceC5136d interfaceC5136d, M m10) {
        this(c3511e, interfaceC5263a, bVar3, interfaceC5136d, m10, new H(c3511e, m10, bVar, bVar2, fVar), AbstractC2850o.f(), AbstractC2850o.c(), AbstractC2850o.b());
    }

    FirebaseMessaging(C3511e c3511e, InterfaceC5263a interfaceC5263a, A8.b bVar, InterfaceC5136d interfaceC5136d, M m10, H h10, Executor executor, Executor executor2, Executor executor3) {
        this.f28062j = false;
        f28051n = bVar;
        this.f28053a = c3511e;
        this.f28057e = new a(interfaceC5136d);
        Context l10 = c3511e.l();
        this.f28054b = l10;
        C2852q c2852q = new C2852q();
        this.f28063k = c2852q;
        this.f28061i = m10;
        this.f28055c = h10;
        this.f28056d = new Z(executor);
        this.f28058f = executor2;
        this.f28059g = executor3;
        Context l11 = c3511e.l();
        if (l11 instanceof Application) {
            ((Application) l11).registerActivityLifecycleCallbacks(c2852q);
        } else {
            Log.w("FirebaseMessaging", "Context " + l11 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (interfaceC5263a != null) {
            interfaceC5263a.a(new InterfaceC5263a.InterfaceC0675a() { // from class: com.google.firebase.messaging.y
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.z
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.K();
            }
        });
        Task f10 = j0.f(this, m10, h10, l10, AbstractC2850o.g());
        this.f28060h = f10;
        f10.g(executor2, new InterfaceC0783g() { // from class: com.google.firebase.messaging.A
            @Override // D7.InterfaceC0783g
            public final void onSuccess(Object obj) {
                FirebaseMessaging.this.L((j0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.B
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.M();
            }
        });
    }
}
