package io.sentry;

import co.hyperverge.hypersnapsdk.utils.AppConstants;
import io.sentry.P1;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: io.sentry.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3469y {

    /* renamed from: A, reason: collision with root package name */
    private List f35623A;

    /* renamed from: B, reason: collision with root package name */
    private Boolean f35624B;

    /* renamed from: a, reason: collision with root package name */
    private String f35625a;

    /* renamed from: b, reason: collision with root package name */
    private String f35626b;

    /* renamed from: c, reason: collision with root package name */
    private String f35627c;

    /* renamed from: d, reason: collision with root package name */
    private String f35628d;

    /* renamed from: e, reason: collision with root package name */
    private String f35629e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f35630f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f35631g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f35632h;

    /* renamed from: i, reason: collision with root package name */
    private Boolean f35633i;

    /* renamed from: j, reason: collision with root package name */
    private Double f35634j;

    /* renamed from: k, reason: collision with root package name */
    private Double f35635k;

    /* renamed from: l, reason: collision with root package name */
    private P1.f f35636l;

    /* renamed from: n, reason: collision with root package name */
    private P1.e f35638n;

    /* renamed from: s, reason: collision with root package name */
    private String f35643s;

    /* renamed from: t, reason: collision with root package name */
    private Long f35644t;

    /* renamed from: v, reason: collision with root package name */
    private Boolean f35646v;

    /* renamed from: w, reason: collision with root package name */
    private Boolean f35647w;

    /* renamed from: y, reason: collision with root package name */
    private Boolean f35649y;

    /* renamed from: z, reason: collision with root package name */
    private Boolean f35650z;

    /* renamed from: m, reason: collision with root package name */
    private final Map f35637m = new ConcurrentHashMap();

    /* renamed from: o, reason: collision with root package name */
    private final List f35639o = new CopyOnWriteArrayList();

    /* renamed from: p, reason: collision with root package name */
    private final List f35640p = new CopyOnWriteArrayList();

    /* renamed from: q, reason: collision with root package name */
    private List f35641q = null;

    /* renamed from: r, reason: collision with root package name */
    private final List f35642r = new CopyOnWriteArrayList();

    /* renamed from: u, reason: collision with root package name */
    private final Set f35645u = new CopyOnWriteArraySet();

    /* renamed from: x, reason: collision with root package name */
    private Set f35648x = new CopyOnWriteArraySet();

    public static C3469y g(io.sentry.config.f fVar, ILogger iLogger) {
        C3469y c3469y = new C3469y();
        c3469y.K(fVar.a("dsn"));
        c3469y.Q(fVar.a("environment"));
        c3469y.Y(fVar.a("release"));
        c3469y.J(fVar.a("dist"));
        c3469y.b0(fVar.a("servername"));
        c3469y.O(fVar.b("uncaught.handler.enabled"));
        c3469y.U(fVar.b("uncaught.handler.print-stacktrace"));
        c3469y.N(fVar.b("enable-tracing"));
        c3469y.d0(fVar.d("traces-sample-rate"));
        c3469y.V(fVar.d("profiles-sample-rate"));
        c3469y.I(fVar.b("debug"));
        c3469y.L(fVar.b("enable-deduplication"));
        c3469y.Z(fVar.b("send-client-reports"));
        String a10 = fVar.a("max-request-body-size");
        if (a10 != null) {
            c3469y.T(P1.f.valueOf(a10.toUpperCase(Locale.ROOT)));
        }
        for (Map.Entry entry : fVar.getMap("tags").entrySet()) {
            c3469y.c0((String) entry.getKey(), (String) entry.getValue());
        }
        String a11 = fVar.a("proxy.host");
        String a12 = fVar.a("proxy.user");
        String a13 = fVar.a("proxy.pass");
        String e10 = fVar.e("proxy.port", "80");
        if (a11 != null) {
            c3469y.X(new P1.e(a11, e10, a12, a13));
        }
        Iterator it = fVar.f("in-app-includes").iterator();
        while (it.hasNext()) {
            c3469y.e((String) it.next());
        }
        Iterator it2 = fVar.f("in-app-excludes").iterator();
        while (it2.hasNext()) {
            c3469y.d((String) it2.next());
        }
        List f10 = fVar.a("trace-propagation-targets") != null ? fVar.f("trace-propagation-targets") : null;
        if (f10 == null && fVar.a("tracing-origins") != null) {
            f10 = fVar.f("tracing-origins");
        }
        if (f10 != null) {
            Iterator it3 = f10.iterator();
            while (it3.hasNext()) {
                c3469y.f((String) it3.next());
            }
        }
        Iterator it4 = fVar.f("context-tags").iterator();
        while (it4.hasNext()) {
            c3469y.b((String) it4.next());
        }
        c3469y.W(fVar.a("proguard-uuid"));
        Iterator it5 = fVar.f("bundle-ids").iterator();
        while (it5.hasNext()) {
            c3469y.a((String) it5.next());
        }
        c3469y.R(fVar.c("idle-timeout"));
        c3469y.P(fVar.b(AppConstants.VIDEO_RECORDING_ENABLED));
        c3469y.M(fVar.b("enable-pretty-serialization-output"));
        c3469y.a0(fVar.b("send-modules"));
        c3469y.S(fVar.f("ignored-checkins"));
        for (String str : fVar.f("ignored-exceptions-for-type")) {
            try {
                Class<?> cls = Class.forName(str);
                if (Throwable.class.isAssignableFrom(cls)) {
                    c3469y.c(cls);
                } else {
                    iLogger.c(K1.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str, str);
                }
            } catch (ClassNotFoundException unused) {
                iLogger.c(K1.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str, str);
            }
        }
        return c3469y;
    }

    public Boolean A() {
        return this.f35647w;
    }

    public String B() {
        return this.f35629e;
    }

    public Map C() {
        return this.f35637m;
    }

    public List D() {
        return this.f35641q;
    }

    public Double E() {
        return this.f35634j;
    }

    public Boolean F() {
        return this.f35650z;
    }

    public Boolean G() {
        return this.f35649y;
    }

    public Boolean H() {
        return this.f35624B;
    }

    public void I(Boolean bool) {
        this.f35631g = bool;
    }

    public void J(String str) {
        this.f35628d = str;
    }

    public void K(String str) {
        this.f35625a = str;
    }

    public void L(Boolean bool) {
        this.f35632h = bool;
    }

    public void M(Boolean bool) {
        this.f35650z = bool;
    }

    public void N(Boolean bool) {
        this.f35633i = bool;
    }

    public void O(Boolean bool) {
        this.f35630f = bool;
    }

    public void P(Boolean bool) {
        this.f35649y = bool;
    }

    public void Q(String str) {
        this.f35626b = str;
    }

    public void R(Long l10) {
        this.f35644t = l10;
    }

    public void S(List list) {
        this.f35623A = list;
    }

    public void T(P1.f fVar) {
        this.f35636l = fVar;
    }

    public void U(Boolean bool) {
        this.f35646v = bool;
    }

    public void V(Double d10) {
        this.f35635k = d10;
    }

    public void W(String str) {
        this.f35643s = str;
    }

    public void X(P1.e eVar) {
        this.f35638n = eVar;
    }

    public void Y(String str) {
        this.f35627c = str;
    }

    public void Z(Boolean bool) {
        this.f35647w = bool;
    }

    public void a(String str) {
        this.f35648x.add(str);
    }

    public void a0(Boolean bool) {
        this.f35624B = bool;
    }

    public void b(String str) {
        this.f35642r.add(str);
    }

    public void b0(String str) {
        this.f35629e = str;
    }

    public void c(Class cls) {
        this.f35645u.add(cls);
    }

    public void c0(String str, String str2) {
        this.f35637m.put(str, str2);
    }

    public void d(String str) {
        this.f35639o.add(str);
    }

    public void d0(Double d10) {
        this.f35634j = d10;
    }

    public void e(String str) {
        this.f35640p.add(str);
    }

    public void f(String str) {
        if (this.f35641q == null) {
            this.f35641q = new CopyOnWriteArrayList();
        }
        if (str.isEmpty()) {
            return;
        }
        this.f35641q.add(str);
    }

    public Set h() {
        return this.f35648x;
    }

    public List i() {
        return this.f35642r;
    }

    public Boolean j() {
        return this.f35631g;
    }

    public String k() {
        return this.f35628d;
    }

    public String l() {
        return this.f35625a;
    }

    public Boolean m() {
        return this.f35632h;
    }

    public Boolean n() {
        return this.f35633i;
    }

    public Boolean o() {
        return this.f35630f;
    }

    public String p() {
        return this.f35626b;
    }

    public Long q() {
        return this.f35644t;
    }

    public List r() {
        return this.f35623A;
    }

    public Set s() {
        return this.f35645u;
    }

    public List t() {
        return this.f35639o;
    }

    public List u() {
        return this.f35640p;
    }

    public Boolean v() {
        return this.f35646v;
    }

    public Double w() {
        return this.f35635k;
    }

    public String x() {
        return this.f35643s;
    }

    public P1.e y() {
        return this.f35638n;
    }

    public String z() {
        return this.f35627c;
    }
}
