package io.sentry.cache;

import io.sentry.K1;
import io.sentry.M;
import io.sentry.P1;
import io.sentry.Z;
import java.util.Map;

/* loaded from: classes2.dex */
public final class n implements M {

    /* renamed from: a, reason: collision with root package name */
    private final P1 f35055a;

    public n(P1 p12) {
        this.f35055a = p12;
    }

    private void n(String str) {
        c.a(this.f35055a, ".options-cache", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            this.f35055a.getLogger().b(K1.ERROR, "Serialization task failed", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(String str) {
        if (str == null) {
            n("dist.json");
        } else {
            y(str, "dist.json");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(String str) {
        if (str == null) {
            n("environment.json");
        } else {
            y(str, "environment.json");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(String str) {
        if (str == null) {
            n("proguard-uuid.json");
        } else {
            y(str, "proguard-uuid.json");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(String str) {
        if (str == null) {
            n("release.json");
        } else {
            y(str, "release.json");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(io.sentry.protocol.p pVar) {
        if (pVar == null) {
            n("sdk-version.json");
        } else {
            y(pVar, "sdk-version.json");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(Map map) {
        y(map, "tags.json");
    }

    public static Object v(P1 p12, String str, Class cls) {
        return w(p12, str, cls, null);
    }

    public static Object w(P1 p12, String str, Class cls, Z z10) {
        return c.c(p12, ".options-cache", str, cls, z10);
    }

    private void x(final Runnable runnable) {
        try {
            this.f35055a.getExecutorService().submit(new Runnable() { // from class: io.sentry.cache.m
                @Override // java.lang.Runnable
                public final void run() {
                    n.this.o(runnable);
                }
            });
        } catch (Throwable th) {
            this.f35055a.getLogger().b(K1.ERROR, "Serialization task could not be scheduled", th);
        }
    }

    private void y(Object obj, String str) {
        c.d(this.f35055a, obj, ".options-cache", str);
    }

    @Override // io.sentry.M
    public void a(final Map map) {
        x(new Runnable() { // from class: io.sentry.cache.g
            @Override // java.lang.Runnable
            public final void run() {
                n.this.u(map);
            }
        });
    }

    @Override // io.sentry.M
    public void b(final io.sentry.protocol.p pVar) {
        x(new Runnable() { // from class: io.sentry.cache.k
            @Override // java.lang.Runnable
            public final void run() {
                n.this.t(pVar);
            }
        });
    }

    @Override // io.sentry.M
    public void c(final String str) {
        x(new Runnable() { // from class: io.sentry.cache.h
            @Override // java.lang.Runnable
            public final void run() {
                n.this.p(str);
            }
        });
    }

    @Override // io.sentry.M
    public void d(final String str) {
        x(new Runnable() { // from class: io.sentry.cache.i
            @Override // java.lang.Runnable
            public final void run() {
                n.this.q(str);
            }
        });
    }

    @Override // io.sentry.M
    public void e(final String str) {
        x(new Runnable() { // from class: io.sentry.cache.j
            @Override // java.lang.Runnable
            public final void run() {
                n.this.r(str);
            }
        });
    }

    @Override // io.sentry.M
    public void f(final String str) {
        x(new Runnable() { // from class: io.sentry.cache.l
            @Override // java.lang.Runnable
            public final void run() {
                n.this.s(str);
            }
        });
    }
}
