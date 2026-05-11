package io.sentry.cache;

import io.sentry.K1;
import io.sentry.N;
import io.sentry.P1;
import io.sentry.Z;
import io.sentry.c2;
import java.util.Collection;

/* loaded from: classes2.dex */
public final class s implements N {

    /* renamed from: a, reason: collision with root package name */
    private final P1 f35064a;

    public s(P1 p12) {
        this.f35064a = p12;
    }

    private void h(String str) {
        c.a(this.f35064a, ".scope-cache", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            this.f35064a.getLogger().b(K1.ERROR, "Serialization task failed", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(Collection collection) {
        p(collection, "breadcrumbs.json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(c2 c2Var) {
        if (c2Var == null) {
            h("trace.json");
        } else {
            p(c2Var, "trace.json");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(String str) {
        if (str == null) {
            h("transaction.json");
        } else {
            p(str, "transaction.json");
        }
    }

    public static Object m(P1 p12, String str, Class cls) {
        return n(p12, str, cls, null);
    }

    public static Object n(P1 p12, String str, Class cls, Z z10) {
        return c.c(p12, ".scope-cache", str, cls, z10);
    }

    private void o(final Runnable runnable) {
        try {
            this.f35064a.getExecutorService().submit(new Runnable() { // from class: io.sentry.cache.r
                @Override // java.lang.Runnable
                public final void run() {
                    s.this.i(runnable);
                }
            });
        } catch (Throwable th) {
            this.f35064a.getLogger().b(K1.ERROR, "Serialization task could not be scheduled", th);
        }
    }

    private void p(Object obj, String str) {
        c.d(this.f35064a, obj, ".scope-cache", str);
    }

    @Override // io.sentry.N
    public void a(final Collection collection) {
        o(new Runnable() { // from class: io.sentry.cache.q
            @Override // java.lang.Runnable
            public final void run() {
                s.this.j(collection);
            }
        });
    }

    @Override // io.sentry.N
    public void b(final c2 c2Var) {
        o(new Runnable() { // from class: io.sentry.cache.p
            @Override // java.lang.Runnable
            public final void run() {
                s.this.k(c2Var);
            }
        });
    }

    @Override // io.sentry.N
    public void c(final String str) {
        o(new Runnable() { // from class: io.sentry.cache.o
            @Override // java.lang.Runnable
            public final void run() {
                s.this.l(str);
            }
        });
    }
}
