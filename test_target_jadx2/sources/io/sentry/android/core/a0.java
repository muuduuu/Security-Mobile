package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1599p;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.facebook.react.modules.appstate.AppStateModule;
import io.sentry.C3405e;
import io.sentry.K1;
import io.sentry.O0;
import io.sentry.P0;
import io.sentry.Z1;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
final class a0 implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f34807a;

    /* renamed from: b, reason: collision with root package name */
    private final long f34808b;

    /* renamed from: c, reason: collision with root package name */
    private TimerTask f34809c;

    /* renamed from: d, reason: collision with root package name */
    private final Timer f34810d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f34811e;

    /* renamed from: f, reason: collision with root package name */
    private final io.sentry.L f34812f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f34813g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f34814h;

    /* renamed from: i, reason: collision with root package name */
    private final io.sentry.transport.o f34815i;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            a0.this.f("end");
            a0.this.f34812f.J();
        }
    }

    a0(io.sentry.L l10, long j10, boolean z10, boolean z11) {
        this(l10, j10, z10, z11, io.sentry.transport.m.b());
    }

    private void e(String str) {
        if (this.f34814h) {
            C3405e c3405e = new C3405e();
            c3405e.l("navigation");
            c3405e.i(Keys.STATE, str);
            c3405e.h("app.lifecycle");
            c3405e.j(K1.INFO);
            this.f34812f.w(c3405e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(String str) {
        this.f34812f.w(io.sentry.android.core.internal.util.c.a(str));
    }

    private void g() {
        synchronized (this.f34811e) {
            try {
                TimerTask timerTask = this.f34809c;
                if (timerTask != null) {
                    timerTask.cancel();
                    this.f34809c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(O0 o02) {
        Z1 q10;
        if (this.f34807a.get() != 0 || (q10 = o02.q()) == null || q10.k() == null) {
            return;
        }
        this.f34807a.set(q10.k().getTime());
    }

    private void i() {
        synchronized (this.f34811e) {
            try {
                g();
                if (this.f34810d != null) {
                    a aVar = new a();
                    this.f34809c = aVar;
                    this.f34810d.schedule(aVar, this.f34808b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void j() {
        if (this.f34813g) {
            g();
            long a10 = this.f34815i.a();
            this.f34812f.B(new P0() { // from class: io.sentry.android.core.Z
                @Override // io.sentry.P0
                public final void a(O0 o02) {
                    a0.this.h(o02);
                }
            });
            long j10 = this.f34807a.get();
            if (j10 == 0 || j10 + this.f34808b <= a10) {
                f("start");
                this.f34812f.L();
            }
            this.f34807a.set(a10);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(InterfaceC1599p interfaceC1599p) {
        j();
        e("foreground");
        M.a().c(false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(InterfaceC1599p interfaceC1599p) {
        if (this.f34813g) {
            this.f34807a.set(this.f34815i.a());
            i();
        }
        M.a().c(true);
        e(AppStateModule.APP_STATE_BACKGROUND);
    }

    a0(io.sentry.L l10, long j10, boolean z10, boolean z11, io.sentry.transport.o oVar) {
        this.f34807a = new AtomicLong(0L);
        this.f34811e = new Object();
        this.f34808b = j10;
        this.f34813g = z10;
        this.f34814h = z11;
        this.f34812f = l10;
        this.f34815i = oVar;
        if (z10) {
            this.f34810d = new Timer(true);
        } else {
            this.f34810d = null;
        }
    }
}
