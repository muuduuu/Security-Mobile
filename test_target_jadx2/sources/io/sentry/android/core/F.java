package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import io.sentry.A1;
import io.sentry.AbstractC3370a1;
import io.sentry.B1;
import io.sentry.C3405e;
import io.sentry.InterfaceC3399c;
import io.sentry.K1;
import io.sentry.R1;
import io.sentry.android.core.P;
import io.sentry.c2;
import io.sentry.protocol.C3441a;
import io.sentry.protocol.C3443c;
import io.sentry.protocol.C3444d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class F implements InterfaceC3399c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34714a;

    /* renamed from: b, reason: collision with root package name */
    private final SentryAndroidOptions f34715b;

    /* renamed from: c, reason: collision with root package name */
    private final N f34716c;

    /* renamed from: d, reason: collision with root package name */
    private final B1 f34717d;

    public F(Context context, SentryAndroidOptions sentryAndroidOptions, N n10) {
        this.f34714a = context;
        this.f34715b = sentryAndroidOptions;
        this.f34716c = n10;
        this.f34717d = new B1(new R1(sentryAndroidOptions));
    }

    private void A(AbstractC3370a1 abstractC3370a1) {
        if (abstractC3370a1.J() == null) {
            abstractC3370a1.Y((String) io.sentry.cache.n.v(this.f34715b, "release.json", String.class));
        }
    }

    private void B(AbstractC3370a1 abstractC3370a1) {
        if (abstractC3370a1.K() == null) {
            abstractC3370a1.Z((io.sentry.protocol.m) io.sentry.cache.s.m(this.f34715b, "request.json", io.sentry.protocol.m.class));
        }
    }

    private void C(AbstractC3370a1 abstractC3370a1) {
        Map map = (Map) io.sentry.cache.s.m(this.f34715b, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (abstractC3370a1.N() == null) {
            abstractC3370a1.d0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!abstractC3370a1.N().containsKey(entry.getKey())) {
                abstractC3370a1.c0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    private void D(AbstractC3370a1 abstractC3370a1) {
        if (abstractC3370a1.L() == null) {
            abstractC3370a1.a0((io.sentry.protocol.p) io.sentry.cache.n.v(this.f34715b, "sdk-version.json", io.sentry.protocol.p.class));
        }
    }

    private void E(AbstractC3370a1 abstractC3370a1) {
        try {
            P.a n10 = P.n(this.f34714a, this.f34715b.getLogger(), this.f34716c);
            if (n10 != null) {
                for (Map.Entry entry : n10.a().entrySet()) {
                    abstractC3370a1.c0((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th) {
            this.f34715b.getLogger().b(K1.ERROR, "Error getting side loaded info.", th);
        }
    }

    private void F(A1 a12) {
        m(a12);
        E(a12);
    }

    private void G(A1 a12) {
        c2 c2Var = (c2) io.sentry.cache.s.m(this.f34715b, "trace.json", c2.class);
        if (a12.C().e() != null || c2Var == null || c2Var.h() == null || c2Var.k() == null) {
            return;
        }
        a12.C().n(c2Var);
    }

    private void H(A1 a12) {
        String str = (String) io.sentry.cache.s.m(this.f34715b, "transaction.json", String.class);
        if (a12.t0() == null) {
            a12.E0(str);
        }
    }

    private void I(AbstractC3370a1 abstractC3370a1) {
        if (abstractC3370a1.Q() == null) {
            abstractC3370a1.e0((io.sentry.protocol.B) io.sentry.cache.s.m(this.f34715b, "user.json", io.sentry.protocol.B.class));
        }
    }

    private void a(A1 a12, Object obj) {
        A(a12);
        t(a12);
        s(a12);
        q(a12);
        D(a12);
        n(a12, obj);
        y(a12);
    }

    private void c(A1 a12) {
        B(a12);
        I(a12);
        C(a12);
        o(a12);
        v(a12);
        p(a12);
        H(a12);
        w(a12);
        x(a12);
        G(a12);
    }

    private io.sentry.protocol.x d(List list) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            io.sentry.protocol.x xVar = (io.sentry.protocol.x) it.next();
            String m10 = xVar.m();
            if (m10 != null && m10.equals("main")) {
                return xVar;
            }
        }
        return null;
    }

    private io.sentry.protocol.B f() {
        io.sentry.protocol.B b10 = new io.sentry.protocol.B();
        b10.n(h());
        return b10;
    }

    private io.sentry.protocol.f g() {
        io.sentry.protocol.f fVar = new io.sentry.protocol.f();
        if (this.f34715b.isSendDefaultPii()) {
            fVar.g0(P.d(this.f34714a, this.f34716c));
        }
        fVar.c0(Build.MANUFACTURER);
        fVar.Q(Build.BRAND);
        fVar.V(P.f(this.f34715b.getLogger()));
        fVar.e0(Build.MODEL);
        fVar.f0(Build.ID);
        fVar.M(P.c(this.f34716c));
        ActivityManager.MemoryInfo h10 = P.h(this.f34714a, this.f34715b.getLogger());
        if (h10 != null) {
            fVar.d0(i(h10));
        }
        fVar.p0(this.f34716c.f());
        DisplayMetrics e10 = P.e(this.f34714a, this.f34715b.getLogger());
        if (e10 != null) {
            fVar.o0(Integer.valueOf(e10.widthPixels));
            fVar.n0(Integer.valueOf(e10.heightPixels));
            fVar.l0(Float.valueOf(e10.density));
            fVar.m0(Integer.valueOf(e10.densityDpi));
        }
        if (fVar.J() == null) {
            fVar.Y(h());
        }
        List c10 = io.sentry.android.core.internal.util.f.a().c();
        if (!c10.isEmpty()) {
            fVar.k0(Double.valueOf(((Integer) Collections.max(c10)).doubleValue()));
            fVar.j0(Integer.valueOf(c10.size()));
        }
        return fVar;
    }

    private String h() {
        try {
            return Y.a(this.f34714a);
        } catch (Throwable th) {
            this.f34715b.getLogger().b(K1.ERROR, "Error getting installationId.", th);
            return null;
        }
    }

    private Long i(ActivityManager.MemoryInfo memoryInfo) {
        return this.f34716c.d() >= 16 ? Long.valueOf(memoryInfo.totalMem) : Long.valueOf(Runtime.getRuntime().totalMemory());
    }

    private io.sentry.protocol.l j() {
        io.sentry.protocol.l lVar = new io.sentry.protocol.l();
        lVar.j("Android");
        lVar.m(Build.VERSION.RELEASE);
        lVar.h(Build.DISPLAY);
        try {
            lVar.i(P.g(this.f34715b.getLogger()));
        } catch (Throwable th) {
            this.f34715b.getLogger().b(K1.ERROR, "Error getting OperatingSystem.", th);
        }
        return lVar;
    }

    private boolean k(Object obj) {
        if (obj instanceof io.sentry.hints.a) {
            return "anr_background".equals(((io.sentry.hints.a) obj).f());
        }
        return false;
    }

    private void l(AbstractC3370a1 abstractC3370a1) {
        String str;
        io.sentry.protocol.l c10 = abstractC3370a1.C().c();
        abstractC3370a1.C().j(j());
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

    private void m(AbstractC3370a1 abstractC3370a1) {
        if (this.f34715b.isSendDefaultPii()) {
            if (abstractC3370a1.Q() == null) {
                io.sentry.protocol.B b10 = new io.sentry.protocol.B();
                b10.o("{{auto}}");
                abstractC3370a1.e0(b10);
            } else if (abstractC3370a1.Q().l() == null) {
                abstractC3370a1.Q().o("{{auto}}");
            }
        }
        io.sentry.protocol.B Q10 = abstractC3370a1.Q();
        if (Q10 == null) {
            abstractC3370a1.e0(f());
        } else if (Q10.k() == null) {
            Q10.n(h());
        }
    }

    private void n(AbstractC3370a1 abstractC3370a1, Object obj) {
        C3441a a10 = abstractC3370a1.C().a();
        if (a10 == null) {
            a10 = new C3441a();
        }
        a10.m(P.b(this.f34714a, this.f34715b.getLogger()));
        a10.p(Boolean.valueOf(!k(obj)));
        PackageInfo j10 = P.j(this.f34714a, this.f34715b.getLogger(), this.f34716c);
        if (j10 != null) {
            a10.l(j10.packageName);
        }
        String J10 = abstractC3370a1.J() != null ? abstractC3370a1.J() : (String) io.sentry.cache.n.v(this.f34715b, "release.json", String.class);
        if (J10 != null) {
            try {
                String substring = J10.substring(J10.indexOf(64) + 1, J10.indexOf(43));
                String substring2 = J10.substring(J10.indexOf(43) + 1);
                a10.o(substring);
                a10.k(substring2);
            } catch (Throwable unused) {
                this.f34715b.getLogger().c(K1.WARNING, "Failed to parse release from scope cache: %s", J10);
            }
        }
        abstractC3370a1.C().f(a10);
    }

    private void o(AbstractC3370a1 abstractC3370a1) {
        List list = (List) io.sentry.cache.s.n(this.f34715b, "breadcrumbs.json", List.class, new C3405e.a());
        if (list == null) {
            return;
        }
        if (abstractC3370a1.B() == null) {
            abstractC3370a1.R(new ArrayList(list));
        } else {
            abstractC3370a1.B().addAll(list);
        }
    }

    private void p(AbstractC3370a1 abstractC3370a1) {
        C3443c c3443c = (C3443c) io.sentry.cache.s.m(this.f34715b, "contexts.json", C3443c.class);
        if (c3443c == null) {
            return;
        }
        C3443c C10 = abstractC3370a1.C();
        Iterator it = new C3443c(c3443c).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            if (!"trace".equals(entry.getKey()) || !(value instanceof c2)) {
                if (!C10.containsKey(entry.getKey())) {
                    C10.put((String) entry.getKey(), value);
                }
            }
        }
    }

    private void q(AbstractC3370a1 abstractC3370a1) {
        io.sentry.protocol.e D10 = abstractC3370a1.D();
        if (D10 == null) {
            D10 = new io.sentry.protocol.e();
        }
        if (D10.c() == null) {
            D10.d(new ArrayList());
        }
        List c10 = D10.c();
        if (c10 != null) {
            String str = (String) io.sentry.cache.n.v(this.f34715b, "proguard-uuid.json", String.class);
            if (str != null) {
                C3444d c3444d = new C3444d();
                c3444d.k("proguard");
                c3444d.m(str);
                c10.add(c3444d);
            }
            abstractC3370a1.S(D10);
        }
    }

    private void r(AbstractC3370a1 abstractC3370a1) {
        if (abstractC3370a1.C().b() == null) {
            abstractC3370a1.C().h(g());
        }
    }

    private void s(AbstractC3370a1 abstractC3370a1) {
        String str;
        if (abstractC3370a1.E() == null) {
            abstractC3370a1.T((String) io.sentry.cache.n.v(this.f34715b, "dist.json", String.class));
        }
        if (abstractC3370a1.E() != null || (str = (String) io.sentry.cache.n.v(this.f34715b, "release.json", String.class)) == null) {
            return;
        }
        try {
            abstractC3370a1.T(str.substring(str.indexOf(43) + 1));
        } catch (Throwable unused) {
            this.f34715b.getLogger().c(K1.WARNING, "Failed to parse release from scope cache: %s", str);
        }
    }

    private void t(AbstractC3370a1 abstractC3370a1) {
        if (abstractC3370a1.F() == null) {
            String str = (String) io.sentry.cache.n.v(this.f34715b, "environment.json", String.class);
            if (str == null) {
                str = this.f34715b.getEnvironment();
            }
            abstractC3370a1.U(str);
        }
    }

    private void u(A1 a12, Object obj) {
        io.sentry.protocol.j jVar = new io.sentry.protocol.j();
        if (((io.sentry.hints.c) obj).a()) {
            jVar.j("AppExitInfo");
        } else {
            jVar.j("HistoricalAppExitInfo");
        }
        String str = "ANR";
        if (k(obj)) {
            str = "Background ANR";
        }
        ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(str, Thread.currentThread());
        io.sentry.protocol.x d10 = d(a12.s0());
        if (d10 == null) {
            d10 = new io.sentry.protocol.x();
            d10.y(new io.sentry.protocol.w());
        }
        a12.x0(this.f34717d.e(d10, jVar, applicationNotResponding));
    }

    private void v(AbstractC3370a1 abstractC3370a1) {
        Map map = (Map) io.sentry.cache.s.m(this.f34715b, "extras.json", Map.class);
        if (map == null) {
            return;
        }
        if (abstractC3370a1.H() == null) {
            abstractC3370a1.W(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!abstractC3370a1.H().containsKey(entry.getKey())) {
                abstractC3370a1.H().put((String) entry.getKey(), entry.getValue());
            }
        }
    }

    private void w(A1 a12) {
        List list = (List) io.sentry.cache.s.m(this.f34715b, "fingerprint.json", List.class);
        if (a12.p0() == null) {
            a12.y0(list);
        }
    }

    private void x(A1 a12) {
        K1 k12 = (K1) io.sentry.cache.s.m(this.f34715b, "level.json", K1.class);
        if (a12.q0() == null) {
            a12.z0(k12);
        }
    }

    private void y(AbstractC3370a1 abstractC3370a1) {
        Map map = (Map) io.sentry.cache.n.v(this.f34715b, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (abstractC3370a1.N() == null) {
            abstractC3370a1.d0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!abstractC3370a1.N().containsKey(entry.getKey())) {
                abstractC3370a1.c0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    private void z(AbstractC3370a1 abstractC3370a1) {
        if (abstractC3370a1.I() == null) {
            abstractC3370a1.X("java");
        }
    }

    @Override // io.sentry.InterfaceC3466x
    public A1 b(A1 a12, io.sentry.A a10) {
        Object g10 = io.sentry.util.j.g(a10);
        if (!(g10 instanceof io.sentry.hints.c)) {
            this.f34715b.getLogger().c(K1.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return a12;
        }
        u(a12, g10);
        z(a12);
        l(a12);
        r(a12);
        if (!((io.sentry.hints.c) g10).a()) {
            this.f34715b.getLogger().c(K1.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return a12;
        }
        c(a12);
        a(a12, g10);
        F(a12);
        return a12;
    }
}
