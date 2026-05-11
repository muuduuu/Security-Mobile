package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.A1;
import io.sentry.AbstractC3370a1;
import io.sentry.AbstractC3420j;
import io.sentry.InterfaceC3466x;
import io.sentry.K1;
import io.sentry.android.core.P;
import io.sentry.protocol.C3441a;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
final class T implements InterfaceC3466x {

    /* renamed from: a, reason: collision with root package name */
    final Context f34771a;

    /* renamed from: b, reason: collision with root package name */
    private final N f34772b;

    /* renamed from: c, reason: collision with root package name */
    private final SentryAndroidOptions f34773c;

    /* renamed from: d, reason: collision with root package name */
    private final Future f34774d;

    public T(final Context context, N n10, final SentryAndroidOptions sentryAndroidOptions) {
        this.f34771a = (Context) io.sentry.util.n.c(context, "The application context is required.");
        this.f34772b = (N) io.sentry.util.n.c(n10, "The BuildInfoProvider is required.");
        this.f34773c = (SentryAndroidOptions) io.sentry.util.n.c(sentryAndroidOptions, "The options object is required.");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f34774d = newSingleThreadExecutor.submit(new Callable() { // from class: io.sentry.android.core.S
            @Override // java.util.concurrent.Callable
            public final Object call() {
                U p10;
                p10 = U.p(context, sentryAndroidOptions);
                return p10;
            }
        });
        newSingleThreadExecutor.shutdown();
    }

    private void f(AbstractC3370a1 abstractC3370a1) {
        String str;
        io.sentry.protocol.l c10 = abstractC3370a1.C().c();
        try {
            abstractC3370a1.C().j(((U) this.f34774d.get()).r());
        } catch (Throwable th) {
            this.f34773c.getLogger().b(K1.ERROR, "Failed to retrieve os system", th);
        }
        if (c10 != null) {
            String g10 = c10.g();
            if (g10 == null || g10.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + g10.trim().toLowerCase(Locale.ROOT);
            }
            abstractC3370a1.C().put(str, c10);
        }
    }

    private void g(AbstractC3370a1 abstractC3370a1) {
        io.sentry.protocol.B Q10 = abstractC3370a1.Q();
        if (Q10 == null) {
            abstractC3370a1.e0(c(this.f34771a));
        } else if (Q10.k() == null) {
            Q10.n(Y.a(this.f34771a));
        }
    }

    private void h(AbstractC3370a1 abstractC3370a1, io.sentry.A a10) {
        C3441a a11 = abstractC3370a1.C().a();
        if (a11 == null) {
            a11 = new C3441a();
        }
        i(a11, a10);
        m(abstractC3370a1, a11);
        abstractC3370a1.C().f(a11);
    }

    private void i(C3441a c3441a, io.sentry.A a10) {
        Boolean b10;
        c3441a.m(P.b(this.f34771a, this.f34773c.getLogger()));
        c3441a.n(AbstractC3420j.n(L.e().d()));
        if (io.sentry.util.j.i(a10) || c3441a.j() != null || (b10 = M.a().b()) == null) {
            return;
        }
        c3441a.p(Boolean.valueOf(!b10.booleanValue()));
    }

    private void j(AbstractC3370a1 abstractC3370a1, boolean z10, boolean z11) {
        g(abstractC3370a1);
        k(abstractC3370a1, z10, z11);
        n(abstractC3370a1);
    }

    private void k(AbstractC3370a1 abstractC3370a1, boolean z10, boolean z11) {
        if (abstractC3370a1.C().b() == null) {
            try {
                abstractC3370a1.C().h(((U) this.f34774d.get()).a(z10, z11));
            } catch (Throwable th) {
                this.f34773c.getLogger().b(K1.ERROR, "Failed to retrieve device info", th);
            }
            f(abstractC3370a1);
        }
    }

    private void l(AbstractC3370a1 abstractC3370a1, String str) {
        if (abstractC3370a1.E() == null) {
            abstractC3370a1.T(str);
        }
    }

    private void m(AbstractC3370a1 abstractC3370a1, C3441a c3441a) {
        PackageInfo i10 = P.i(this.f34771a, 4096, this.f34773c.getLogger(), this.f34772b);
        if (i10 != null) {
            l(abstractC3370a1, P.k(i10, this.f34772b));
            P.o(i10, this.f34772b, c3441a);
        }
    }

    private void n(AbstractC3370a1 abstractC3370a1) {
        try {
            P.a t10 = ((U) this.f34774d.get()).t();
            if (t10 != null) {
                for (Map.Entry entry : t10.a().entrySet()) {
                    abstractC3370a1.c0((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th) {
            this.f34773c.getLogger().b(K1.ERROR, "Error getting side loaded info.", th);
        }
    }

    private void o(A1 a12, io.sentry.A a10) {
        if (a12.s0() != null) {
            boolean i10 = io.sentry.util.j.i(a10);
            for (io.sentry.protocol.x xVar : a12.s0()) {
                boolean b10 = io.sentry.android.core.internal.util.b.e().b(xVar);
                if (xVar.o() == null) {
                    xVar.r(Boolean.valueOf(b10));
                }
                if (!i10 && xVar.p() == null) {
                    xVar.v(Boolean.valueOf(b10));
                }
            }
        }
    }

    private boolean p(AbstractC3370a1 abstractC3370a1, io.sentry.A a10) {
        if (io.sentry.util.j.u(a10)) {
            return true;
        }
        this.f34773c.getLogger().c(K1.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC3370a1.G());
        return false;
    }

    @Override // io.sentry.InterfaceC3466x
    public A1 b(A1 a12, io.sentry.A a10) {
        boolean p10 = p(a12, a10);
        if (p10) {
            h(a12, a10);
            o(a12, a10);
        }
        j(a12, true, p10);
        return a12;
    }

    public io.sentry.protocol.B c(Context context) {
        io.sentry.protocol.B b10 = new io.sentry.protocol.B();
        b10.n(Y.a(context));
        return b10;
    }

    @Override // io.sentry.InterfaceC3466x
    public io.sentry.protocol.y e(io.sentry.protocol.y yVar, io.sentry.A a10) {
        boolean p10 = p(yVar, a10);
        if (p10) {
            h(yVar, a10);
        }
        j(yVar, false, p10);
        return yVar;
    }
}
