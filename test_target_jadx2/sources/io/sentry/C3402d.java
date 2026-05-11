package io.sentry;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.conscrypt.BuildConfig;

/* renamed from: io.sentry.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3402d {

    /* renamed from: e, reason: collision with root package name */
    static final Integer f35085e = 8192;

    /* renamed from: f, reason: collision with root package name */
    static final Integer f35086f = 64;

    /* renamed from: a, reason: collision with root package name */
    final Map f35087a;

    /* renamed from: b, reason: collision with root package name */
    final String f35088b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f35089c;

    /* renamed from: d, reason: collision with root package name */
    final ILogger f35090d;

    /* renamed from: io.sentry.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final List f35091a = Arrays.asList("sentry-trace_id", "sentry-public_key", "sentry-release", "sentry-user_id", "sentry-environment", "sentry-user_segment", "sentry-transaction", "sentry-sample_rate", "sentry-sampled");
    }

    public C3402d(ILogger iLogger) {
        this(new HashMap(), null, true, iLogger);
    }

    public static C3402d b(A1 a12, P1 p12) {
        C3402d c3402d = new C3402d(p12.getLogger());
        c2 e10 = a12.C().e();
        c3402d.A(e10 != null ? e10.k().toString() : null);
        c3402d.w(new C3445q(p12.getDsn()).a());
        c3402d.x(a12.J());
        c3402d.v(a12.F());
        io.sentry.protocol.B Q10 = a12.Q();
        c3402d.C(Q10 != null ? j(Q10) : null);
        c3402d.B(a12.t0());
        c3402d.y(null);
        c3402d.z(null);
        c3402d.a();
        return c3402d;
    }

    private static String j(io.sentry.protocol.B b10) {
        if (b10.m() != null) {
            return b10.m();
        }
        Map j10 = b10.j();
        if (j10 != null) {
            return (String) j10.get("segment");
        }
        return null;
    }

    private static boolean p(io.sentry.protocol.A a10) {
        return (a10 == null || io.sentry.protocol.A.URL.equals(a10)) ? false : true;
    }

    private static Double r(n2 n2Var) {
        if (n2Var == null) {
            return null;
        }
        return n2Var.b();
    }

    private static String s(Double d10) {
        if (io.sentry.util.q.e(d10, false)) {
            return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT)).format(d10);
        }
        return null;
    }

    private static Boolean t(n2 n2Var) {
        if (n2Var == null) {
            return null;
        }
        return n2Var.c();
    }

    public void A(String str) {
        u("sentry-trace_id", str);
    }

    public void B(String str) {
        u("sentry-transaction", str);
    }

    public void C(String str) {
        u("sentry-user_segment", str);
    }

    public void D(O0 o02, P1 p12) {
        K0 o10 = o02.o();
        io.sentry.protocol.B v10 = o02.v();
        A(o10.e().toString());
        w(new C3445q(p12.getDsn()).a());
        x(p12.getRelease());
        v(p12.getEnvironment());
        C(v10 != null ? j(v10) : null);
        B(null);
        y(null);
        z(null);
    }

    public void E(T t10, io.sentry.protocol.B b10, P1 p12, n2 n2Var) {
        A(t10.n().k().toString());
        w(new C3445q(p12.getDsn()).a());
        x(p12.getRelease());
        v(p12.getEnvironment());
        C(b10 != null ? j(b10) : null);
        B(p(t10.q()) ? t10.getName() : null);
        y(s(r(n2Var)));
        z(io.sentry.util.r.f(t(n2Var)));
    }

    public l2 F() {
        String k10 = k();
        String e10 = e();
        if (k10 == null || e10 == null) {
            return null;
        }
        l2 l2Var = new l2(new io.sentry.protocol.r(k10), e10, f(), d(), n(), o(), l(), g(), i());
        l2Var.b(m());
        return l2Var;
    }

    public void a() {
        this.f35089c = false;
    }

    public String c(String str) {
        if (str == null) {
            return null;
        }
        return (String) this.f35087a.get(str);
    }

    public String d() {
        return c("sentry-environment");
    }

    public String e() {
        return c("sentry-public_key");
    }

    public String f() {
        return c("sentry-release");
    }

    public String g() {
        return c("sentry-sample_rate");
    }

    public Double h() {
        String g10 = g();
        if (g10 != null) {
            try {
                double parseDouble = Double.parseDouble(g10);
                if (io.sentry.util.q.e(Double.valueOf(parseDouble), false)) {
                    return Double.valueOf(parseDouble);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public String i() {
        return c("sentry-sampled");
    }

    public String k() {
        return c("sentry-trace_id");
    }

    public String l() {
        return c("sentry-transaction");
    }

    public Map m() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : this.f35087a.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!a.f35091a.contains(str) && str2 != null) {
                concurrentHashMap.put(str.replaceFirst("sentry-", BuildConfig.FLAVOR), str2);
            }
        }
        return concurrentHashMap;
    }

    public String n() {
        return c("sentry-user_id");
    }

    public String o() {
        return c("sentry-user_segment");
    }

    public boolean q() {
        return this.f35089c;
    }

    public void u(String str, String str2) {
        if (this.f35089c) {
            this.f35087a.put(str, str2);
        }
    }

    public void v(String str) {
        u("sentry-environment", str);
    }

    public void w(String str) {
        u("sentry-public_key", str);
    }

    public void x(String str) {
        u("sentry-release", str);
    }

    public void y(String str) {
        u("sentry-sample_rate", str);
    }

    public void z(String str) {
        u("sentry-sampled", str);
    }

    public C3402d(C3402d c3402d) {
        this(c3402d.f35087a, c3402d.f35088b, c3402d.f35089c, c3402d.f35090d);
    }

    public C3402d(Map map, String str, boolean z10, ILogger iLogger) {
        this.f35087a = map;
        this.f35090d = iLogger;
        this.f35089c = z10;
        this.f35088b = str;
    }
}
