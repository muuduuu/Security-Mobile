package io.sentry.android.core;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import io.sentry.AbstractC3410f1;
import io.sentry.C3405e;
import io.sentry.C3464w0;
import io.sentry.C3472z;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.InterfaceC3430m0;
import io.sentry.K1;
import io.sentry.O0;
import io.sentry.P0;
import io.sentry.P1;
import io.sentry.g2;
import io.sentry.o2;
import io.sentry.p2;
import io.sentry.q2;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ActivityLifecycleIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final Application f34636a;

    /* renamed from: b, reason: collision with root package name */
    private final N f34637b;

    /* renamed from: c, reason: collision with root package name */
    private io.sentry.L f34638c;

    /* renamed from: d, reason: collision with root package name */
    private SentryAndroidOptions f34639d;

    /* renamed from: g, reason: collision with root package name */
    private boolean f34642g;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f34644i;

    /* renamed from: k, reason: collision with root package name */
    private io.sentry.S f34646k;

    /* renamed from: r, reason: collision with root package name */
    private final C3378h f34653r;

    /* renamed from: e, reason: collision with root package name */
    private boolean f34640e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f34641f = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f34643h = false;

    /* renamed from: j, reason: collision with root package name */
    private C3472z f34645j = null;

    /* renamed from: l, reason: collision with root package name */
    private final WeakHashMap f34647l = new WeakHashMap();

    /* renamed from: m, reason: collision with root package name */
    private final WeakHashMap f34648m = new WeakHashMap();

    /* renamed from: n, reason: collision with root package name */
    private AbstractC3410f1 f34649n = AbstractC3388s.a();

    /* renamed from: o, reason: collision with root package name */
    private final Handler f34650o = new Handler(Looper.getMainLooper());

    /* renamed from: p, reason: collision with root package name */
    private Future f34651p = null;

    /* renamed from: q, reason: collision with root package name */
    private final WeakHashMap f34652q = new WeakHashMap();

    public ActivityLifecycleIntegration(Application application, N n10, C3378h c3378h) {
        Application application2 = (Application) io.sentry.util.n.c(application, "Application is required");
        this.f34636a = application2;
        this.f34637b = (N) io.sentry.util.n.c(n10, "BuildInfoProvider is required");
        this.f34653r = (C3378h) io.sentry.util.n.c(c3378h, "ActivityFramesTracker is required");
        if (n10.d() >= 29) {
            this.f34642g = true;
        }
        this.f34644i = P.m(application2);
    }

    private void C(final io.sentry.T t10, io.sentry.S s10, io.sentry.S s11) {
        if (t10 == null || t10.a()) {
            return;
        }
        z(s10, g2.DEADLINE_EXCEEDED);
        g1(s11, s10);
        q();
        g2 c10 = t10.c();
        if (c10 == null) {
            c10 = g2.OK;
        }
        t10.e(c10);
        io.sentry.L l10 = this.f34638c;
        if (l10 != null) {
            l10.B(new P0() { // from class: io.sentry.android.core.l
                @Override // io.sentry.P0
                public final void a(O0 o02) {
                    ActivityLifecycleIntegration.this.A0(t10, o02);
                }
            });
        }
    }

    private String F(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private String H(boolean z10) {
        return z10 ? "Cold Start" : "Warm Start";
    }

    private String I(boolean z10) {
        return z10 ? "app.start.cold" : "app.start.warm";
    }

    private String K(io.sentry.S s10) {
        String description = s10.getDescription();
        if (description != null && description.endsWith(" - Deadline Exceeded")) {
            return description;
        }
        return s10.getDescription() + " - Deadline Exceeded";
    }

    private String N(String str) {
        return str + " full display";
    }

    private String Q(String str) {
        return str + " initial display";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a1(WeakReference weakReference, String str, io.sentry.T t10) {
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            this.f34653r.n(activity, t10.l());
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.f34639d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(K1.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
        }
    }

    private boolean i0(SentryAndroidOptions sentryAndroidOptions) {
        return sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void Z0(io.sentry.S s10, io.sentry.S s11) {
        SentryAndroidOptions sentryAndroidOptions = this.f34639d;
        if (sentryAndroidOptions == null || s11 == null) {
            u(s11);
            return;
        }
        AbstractC3410f1 now = sentryAndroidOptions.getDateProvider().now();
        long millis = TimeUnit.NANOSECONDS.toMillis(now.c(s11.r()));
        Long valueOf = Long.valueOf(millis);
        InterfaceC3430m0.a aVar = InterfaceC3430m0.a.MILLISECOND;
        s11.i("time_to_initial_display", valueOf, aVar);
        if (s10 != null && s10.a()) {
            s10.d(now);
            s11.i("time_to_full_display", Long.valueOf(millis), aVar);
        }
        x(s11, now);
    }

    private void m1(Bundle bundle) {
        if (this.f34643h) {
            return;
        }
        L.e().j(bundle == null);
    }

    private void o(Activity activity, String str) {
        SentryAndroidOptions sentryAndroidOptions = this.f34639d;
        if (sentryAndroidOptions == null || this.f34638c == null || !sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()) {
            return;
        }
        C3405e c3405e = new C3405e();
        c3405e.l("navigation");
        c3405e.i(Keys.STATE, str);
        c3405e.i("screen", F(activity));
        c3405e.h("ui.lifecycle");
        c3405e.j(K1.INFO);
        io.sentry.A a10 = new io.sentry.A();
        a10.k("android:activity", activity);
        this.f34638c.A(c3405e, a10);
    }

    private boolean o0(Activity activity) {
        return this.f34652q.containsKey(activity);
    }

    private void o1(io.sentry.S s10) {
        if (s10 != null) {
            s10.n().m("auto.ui.activity");
        }
    }

    private void q() {
        Future future = this.f34651p;
        if (future != null) {
            future.cancel(false);
            this.f34651p = null;
        }
    }

    private void s() {
        AbstractC3410f1 a10 = L.e().a();
        if (!this.f34640e || a10 == null) {
            return;
        }
        x(this.f34646k, a10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void g1(io.sentry.S s10, io.sentry.S s11) {
        if (s10 == null || s10.a()) {
            return;
        }
        s10.k(K(s10));
        AbstractC3410f1 o10 = s11 != null ? s11.o() : null;
        if (o10 == null) {
            o10 = s10.r();
        }
        y(s10, o10, g2.DEADLINE_EXCEEDED);
    }

    private void t1(Activity activity) {
        final WeakReference weakReference = new WeakReference(activity);
        if (this.f34638c == null || o0(activity)) {
            return;
        }
        boolean z10 = this.f34640e;
        if (!z10) {
            this.f34652q.put(activity, C3464w0.s());
            io.sentry.util.v.h(this.f34638c);
            return;
        }
        if (z10) {
            v1();
            final String F10 = F(activity);
            AbstractC3410f1 d10 = this.f34644i ? L.e().d() : null;
            Boolean f10 = L.e().f();
            q2 q2Var = new q2();
            if (this.f34639d.isEnableActivityLifecycleTracingAutoFinish()) {
                q2Var.k(this.f34639d.getIdleTimeout());
                q2Var.d(true);
            }
            q2Var.n(true);
            q2Var.m(new p2() { // from class: io.sentry.android.core.n
                @Override // io.sentry.p2
                public final void a(io.sentry.T t10) {
                    ActivityLifecycleIntegration.this.a1(weakReference, F10, t10);
                }
            });
            AbstractC3410f1 abstractC3410f1 = (this.f34643h || d10 == null || f10 == null) ? this.f34649n : d10;
            q2Var.l(abstractC3410f1);
            final io.sentry.T y10 = this.f34638c.y(new o2(F10, io.sentry.protocol.A.COMPONENT, "ui.load"), q2Var);
            o1(y10);
            if (!this.f34643h && d10 != null && f10 != null) {
                io.sentry.S g10 = y10.g(I(f10.booleanValue()), H(f10.booleanValue()), d10, io.sentry.W.SENTRY);
                this.f34646k = g10;
                o1(g10);
                s();
            }
            String Q10 = Q(F10);
            io.sentry.W w10 = io.sentry.W.SENTRY;
            final io.sentry.S g11 = y10.g("ui.load.initial_display", Q10, abstractC3410f1, w10);
            this.f34647l.put(activity, g11);
            o1(g11);
            if (this.f34641f && this.f34645j != null && this.f34639d != null) {
                final io.sentry.S g12 = y10.g("ui.load.full_display", N(F10), abstractC3410f1, w10);
                o1(g12);
                try {
                    this.f34648m.put(activity, g12);
                    this.f34651p = this.f34639d.getExecutorService().b(new Runnable() { // from class: io.sentry.android.core.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityLifecycleIntegration.this.g1(g12, g11);
                        }
                    }, 30000L);
                } catch (RejectedExecutionException e10) {
                    this.f34639d.getLogger().b(K1.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e10);
                }
            }
            this.f34638c.B(new P0() { // from class: io.sentry.android.core.p
                @Override // io.sentry.P0
                public final void a(O0 o02) {
                    ActivityLifecycleIntegration.this.i1(y10, o02);
                }
            });
            this.f34652q.put(activity, y10);
        }
    }

    private void u(io.sentry.S s10) {
        if (s10 == null || s10.a()) {
            return;
        }
        s10.h();
    }

    private void v1() {
        for (Map.Entry entry : this.f34652q.entrySet()) {
            C((io.sentry.T) entry.getValue(), (io.sentry.S) this.f34647l.get(entry.getKey()), (io.sentry.S) this.f34648m.get(entry.getKey()));
        }
    }

    private void x(io.sentry.S s10, AbstractC3410f1 abstractC3410f1) {
        y(s10, abstractC3410f1, null);
    }

    private void x1(Activity activity, boolean z10) {
        if (this.f34640e && z10) {
            C((io.sentry.T) this.f34652q.get(activity), null, null);
        }
    }

    private void y(io.sentry.S s10, AbstractC3410f1 abstractC3410f1, g2 g2Var) {
        if (s10 == null || s10.a()) {
            return;
        }
        if (g2Var == null) {
            g2Var = s10.c() != null ? s10.c() : g2.OK;
        }
        s10.p(g2Var, abstractC3410f1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(O0 o02, io.sentry.T t10, io.sentry.T t11) {
        if (t11 == null) {
            o02.x(t10);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.f34639d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(K1.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", t10.getName());
        }
    }

    private void z(io.sentry.S s10, g2 g2Var) {
        if (s10 == null || s10.a()) {
            return;
        }
        s10.e(g2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z0(io.sentry.T t10, O0 o02, io.sentry.T t11) {
        if (t11 == t10) {
            o02.e();
        }
    }

    @Override // io.sentry.Integration
    public void c(io.sentry.L l10, P1 p12) {
        this.f34639d = (SentryAndroidOptions) io.sentry.util.n.c(p12 instanceof SentryAndroidOptions ? (SentryAndroidOptions) p12 : null, "SentryAndroidOptions is required");
        this.f34638c = (io.sentry.L) io.sentry.util.n.c(l10, "Hub is required");
        ILogger logger = this.f34639d.getLogger();
        K1 k12 = K1.DEBUG;
        logger.c(k12, "ActivityLifecycleIntegration enabled: %s", Boolean.valueOf(this.f34639d.isEnableActivityLifecycleBreadcrumbs()));
        this.f34640e = i0(this.f34639d);
        this.f34645j = this.f34639d.getFullyDisplayedReporter();
        this.f34641f = this.f34639d.isEnableTimeToFullDisplayTracing();
        this.f34636a.registerActivityLifecycleCallbacks(this);
        this.f34639d.getLogger().c(k12, "ActivityLifecycleIntegration installed.", new Object[0]);
        a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f34636a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f34639d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(K1.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        this.f34653r.p();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        m1(bundle);
        o(activity, "created");
        t1(activity);
        final io.sentry.S s10 = (io.sentry.S) this.f34648m.get(activity);
        this.f34643h = true;
        C3472z c3472z = this.f34645j;
        if (c3472z != null) {
            c3472z.b(new C3472z.a() { // from class: io.sentry.android.core.i
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityDestroyed(Activity activity) {
        try {
            if (!this.f34640e) {
                if (this.f34639d.isEnableActivityLifecycleBreadcrumbs()) {
                }
                this.f34652q.remove(activity);
            }
            o(activity, "destroyed");
            z(this.f34646k, g2.CANCELLED);
            io.sentry.S s10 = (io.sentry.S) this.f34647l.get(activity);
            io.sentry.S s11 = (io.sentry.S) this.f34648m.get(activity);
            z(s10, g2.DEADLINE_EXCEEDED);
            g1(s11, s10);
            q();
            x1(activity, true);
            this.f34646k = null;
            this.f34647l.remove(activity);
            this.f34648m.remove(activity);
            this.f34652q.remove(activity);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityPaused(Activity activity) {
        try {
            if (!this.f34642g) {
                io.sentry.L l10 = this.f34638c;
                if (l10 == null) {
                    this.f34649n = AbstractC3388s.a();
                } else {
                    this.f34649n = l10.D().getDateProvider().now();
                }
            }
            o(activity, "paused");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        if (this.f34642g) {
            io.sentry.L l10 = this.f34638c;
            if (l10 == null) {
                this.f34649n = AbstractC3388s.a();
            } else {
                this.f34649n = l10.D().getDateProvider().now();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f34640e) {
                AbstractC3410f1 d10 = L.e().d();
                AbstractC3410f1 a10 = L.e().a();
                if (d10 != null && a10 == null) {
                    L.e().g();
                }
                s();
                final io.sentry.S s10 = (io.sentry.S) this.f34647l.get(activity);
                final io.sentry.S s11 = (io.sentry.S) this.f34648m.get(activity);
                View findViewById = activity.findViewById(R.id.content);
                if (this.f34637b.d() < 16 || findViewById == null) {
                    this.f34650o.post(new Runnable() { // from class: io.sentry.android.core.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityLifecycleIntegration.this.Z0(s11, s10);
                        }
                    });
                } else {
                    io.sentry.android.core.internal.util.j.e(findViewById, new Runnable() { // from class: io.sentry.android.core.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityLifecycleIntegration.this.O0(s11, s10);
                        }
                    }, this.f34637b);
                }
            }
            o(activity, "resumed");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        o(activity, "saveInstanceState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        try {
            if (this.f34640e) {
                this.f34653r.e(activity);
            }
            o(activity, "started");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        o(activity, "stopped");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void i1(final O0 o02, final io.sentry.T t10) {
        o02.B(new O0.c() { // from class: io.sentry.android.core.q
            @Override // io.sentry.O0.c
            public final void a(io.sentry.T t11) {
                ActivityLifecycleIntegration.this.y0(o02, t10, t11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void A0(final O0 o02, final io.sentry.T t10) {
        o02.B(new O0.c() { // from class: io.sentry.android.core.m
            @Override // io.sentry.O0.c
            public final void a(io.sentry.T t11) {
                ActivityLifecycleIntegration.z0(io.sentry.T.this, o02, t11);
            }
        });
    }
}
