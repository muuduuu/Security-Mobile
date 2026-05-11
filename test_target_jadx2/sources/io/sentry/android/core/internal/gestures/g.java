package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import io.sentry.A;
import io.sentry.C3405e;
import io.sentry.K1;
import io.sentry.L;
import io.sentry.O0;
import io.sentry.P0;
import io.sentry.T;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.g2;
import io.sentry.internal.gestures.b;
import io.sentry.o2;
import io.sentry.q2;
import io.sentry.util.v;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class g implements GestureDetector.OnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f34870a;

    /* renamed from: b, reason: collision with root package name */
    private final L f34871b;

    /* renamed from: c, reason: collision with root package name */
    private final SentryAndroidOptions f34872c;

    /* renamed from: d, reason: collision with root package name */
    private io.sentry.internal.gestures.b f34873d = null;

    /* renamed from: e, reason: collision with root package name */
    private T f34874e = null;

    /* renamed from: f, reason: collision with root package name */
    private String f34875f = null;

    /* renamed from: g, reason: collision with root package name */
    private final b f34876g = new b();

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f34877a;

        /* renamed from: b, reason: collision with root package name */
        private io.sentry.internal.gestures.b f34878b;

        /* renamed from: c, reason: collision with root package name */
        private float f34879c;

        /* renamed from: d, reason: collision with root package name */
        private float f34880d;

        private b() {
            this.f34877a = null;
            this.f34879c = 0.0f;
            this.f34880d = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String i(MotionEvent motionEvent) {
            float x10 = motionEvent.getX() - this.f34879c;
            float y10 = motionEvent.getY() - this.f34880d;
            return Math.abs(x10) > Math.abs(y10) ? x10 > 0.0f ? "right" : "left" : y10 > 0.0f ? "down" : "up";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
            this.f34878b = null;
            this.f34877a = null;
            this.f34879c = 0.0f;
            this.f34880d = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(io.sentry.internal.gestures.b bVar) {
            this.f34878b = bVar;
        }
    }

    public g(Activity activity, L l10, SentryAndroidOptions sentryAndroidOptions) {
        this.f34870a = new WeakReference(activity);
        this.f34871b = l10;
        this.f34872c = sentryAndroidOptions;
    }

    private void e(io.sentry.internal.gestures.b bVar, String str, Map map, MotionEvent motionEvent) {
        if (this.f34872c.isEnableUserInteractionBreadcrumbs()) {
            A a10 = new A();
            a10.k("android:motionEvent", motionEvent);
            a10.k("android:view", bVar.f());
            this.f34871b.A(C3405e.n(str, bVar.d(), bVar.a(), bVar.e(), map), a10);
        }
    }

    private View h(String str) {
        Activity activity = (Activity) this.f34870a.get();
        if (activity == null) {
            this.f34872c.getLogger().c(K1.DEBUG, "Activity is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            this.f34872c.getLogger().c(K1.DEBUG, "Window is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        this.f34872c.getLogger().c(K1.DEBUG, "DecorView is null in " + str + ". No breadcrumb captured.", new Object[0]);
        return null;
    }

    private String i(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(O0 o02, T t10, T t11) {
        if (t11 == null) {
            o02.x(t10);
        } else {
            this.f34872c.getLogger().c(K1.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", t10.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(O0 o02, T t10) {
        if (t10 == this.f34874e) {
            o02.e();
        }
    }

    private void o(io.sentry.internal.gestures.b bVar, String str) {
        io.sentry.internal.gestures.b bVar2 = this.f34873d;
        if (!this.f34872c.isTracingEnabled() || !this.f34872c.isEnableUserInteractionTracing()) {
            if (bVar.equals(bVar2) && str.equals(this.f34875f)) {
                return;
            }
            v.h(this.f34871b);
            this.f34873d = bVar;
            this.f34875f = str;
            return;
        }
        Activity activity = (Activity) this.f34870a.get();
        if (activity == null) {
            this.f34872c.getLogger().c(K1.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String b10 = bVar.b();
        if (this.f34874e != null) {
            if (bVar.equals(bVar2) && str.equals(this.f34875f) && !this.f34874e.a()) {
                this.f34872c.getLogger().c(K1.DEBUG, "The view with id: " + b10 + " already has an ongoing transaction assigned. Rescheduling finish", new Object[0]);
                if (this.f34872c.getIdleTimeout() != null) {
                    this.f34874e.m();
                    return;
                }
                return;
            }
            p(g2.OK);
        }
        q2 q2Var = new q2();
        q2Var.n(true);
        q2Var.k(this.f34872c.getIdleTimeout());
        q2Var.d(true);
        final T y10 = this.f34871b.y(new o2(i(activity) + "." + b10, io.sentry.protocol.A.COMPONENT, "ui.action." + str), q2Var);
        y10.n().m("auto.ui.gesture_listener." + bVar.c());
        this.f34871b.B(new P0() { // from class: io.sentry.android.core.internal.gestures.d
            @Override // io.sentry.P0
            public final void a(O0 o02) {
                g.this.l(y10, o02);
            }
        });
        this.f34874e = y10;
        this.f34873d = bVar;
        this.f34875f = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void l(final O0 o02, final T t10) {
        o02.B(new O0.c() { // from class: io.sentry.android.core.internal.gestures.e
            @Override // io.sentry.O0.c
            public final void a(T t11) {
                g.this.j(o02, t10, t11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void m(final O0 o02) {
        o02.B(new O0.c() { // from class: io.sentry.android.core.internal.gestures.f
            @Override // io.sentry.O0.c
            public final void a(T t10) {
                g.this.k(o02, t10);
            }
        });
    }

    public void n(MotionEvent motionEvent) {
        View h10 = h("onUp");
        io.sentry.internal.gestures.b bVar = this.f34876g.f34878b;
        if (h10 == null || bVar == null) {
            return;
        }
        if (this.f34876g.f34877a == null) {
            this.f34872c.getLogger().c(K1.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
            return;
        }
        e(bVar, this.f34876g.f34877a, Collections.singletonMap("direction", this.f34876g.i(motionEvent)), motionEvent);
        o(bVar, this.f34876g.f34877a);
        this.f34876g.j();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.f34876g.j();
        this.f34876g.f34879c = motionEvent.getX();
        this.f34876g.f34880d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.f34876g.f34877a = "swipe";
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        View h10 = h("onScroll");
        if (h10 != null && motionEvent != null && this.f34876g.f34877a == null) {
            io.sentry.internal.gestures.b a10 = i.a(this.f34872c, h10, motionEvent.getX(), motionEvent.getY(), b.a.SCROLLABLE);
            if (a10 == null) {
                this.f34872c.getLogger().c(K1.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            this.f34872c.getLogger().c(K1.DEBUG, "Scroll target found: " + a10.b(), new Object[0]);
            this.f34876g.k(a10);
            this.f34876g.f34877a = "scroll";
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View h10 = h("onSingleTapUp");
        if (h10 != null && motionEvent != null) {
            io.sentry.internal.gestures.b a10 = i.a(this.f34872c, h10, motionEvent.getX(), motionEvent.getY(), b.a.CLICKABLE);
            if (a10 == null) {
                this.f34872c.getLogger().c(K1.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            e(a10, "click", Collections.emptyMap(), motionEvent);
            o(a10, "click");
        }
        return false;
    }

    void p(g2 g2Var) {
        T t10 = this.f34874e;
        if (t10 != null) {
            t10.e(g2Var);
        }
        this.f34871b.B(new P0() { // from class: io.sentry.android.core.internal.gestures.c
            @Override // io.sentry.P0
            public final void a(O0 o02) {
                g.this.m(o02);
            }
        });
        this.f34874e = null;
        if (this.f34873d != null) {
            this.f34873d = null;
        }
        this.f34875f = null;
    }
}
