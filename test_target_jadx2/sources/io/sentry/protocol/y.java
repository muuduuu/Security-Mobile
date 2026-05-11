package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.AbstractC3370a1;
import io.sentry.AbstractC3420j;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.X1;
import io.sentry.Z;
import io.sentry.b2;
import io.sentry.c2;
import io.sentry.n2;
import io.sentry.protocol.i;
import io.sentry.protocol.u;
import io.sentry.protocol.z;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class y extends AbstractC3370a1 implements InterfaceC3421j0 {

    /* renamed from: p, reason: collision with root package name */
    private String f35463p;

    /* renamed from: q, reason: collision with root package name */
    private Double f35464q;

    /* renamed from: r, reason: collision with root package name */
    private Double f35465r;

    /* renamed from: s, reason: collision with root package name */
    private final List f35466s;

    /* renamed from: t, reason: collision with root package name */
    private final String f35467t;

    /* renamed from: u, reason: collision with root package name */
    private final Map f35468u;

    /* renamed from: v, reason: collision with root package name */
    private z f35469v;

    /* renamed from: w, reason: collision with root package name */
    private Map f35470w;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public y a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            c3409f0.b();
            y yVar = new y(BuildConfig.FLAVOR, Double.valueOf(0.0d), null, new ArrayList(), new HashMap(), new z(A.CUSTOM.apiName()));
            AbstractC3370a1.a aVar = new AbstractC3370a1.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "start_timestamp":
                        try {
                            Double Z02 = c3409f0.Z0();
                            if (Z02 == null) {
                                break;
                            } else {
                                yVar.f35464q = Z02;
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            Date O02 = c3409f0.O0(iLogger);
                            if (O02 == null) {
                                break;
                            } else {
                                yVar.f35464q = Double.valueOf(AbstractC3420j.b(O02));
                                break;
                            }
                        }
                    case "measurements":
                        Map o12 = c3409f0.o1(iLogger, new i.a());
                        if (o12 == null) {
                            break;
                        } else {
                            yVar.f35468u.putAll(o12);
                            break;
                        }
                    case "type":
                        c3409f0.x();
                        break;
                    case "timestamp":
                        try {
                            Double Z03 = c3409f0.Z0();
                            if (Z03 == null) {
                                break;
                            } else {
                                yVar.f35465r = Z03;
                                break;
                            }
                        } catch (NumberFormatException unused2) {
                            Date O03 = c3409f0.O0(iLogger);
                            if (O03 == null) {
                                break;
                            } else {
                                yVar.f35465r = Double.valueOf(AbstractC3420j.b(O03));
                                break;
                            }
                        }
                    case "spans":
                        List l12 = c3409f0.l1(iLogger, new u.a());
                        if (l12 == null) {
                            break;
                        } else {
                            yVar.f35466s.addAll(l12);
                            break;
                        }
                    case "transaction_info":
                        yVar.f35469v = new z.a().a(c3409f0, iLogger);
                        break;
                    case "transaction":
                        yVar.f35463p = c3409f0.x1();
                        break;
                    default:
                        if (!aVar.a(yVar, r10, c3409f0, iLogger)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            c3409f0.z1(iLogger, concurrentHashMap, r10);
                            break;
                        } else {
                            break;
                        }
                }
            }
            yVar.r0(concurrentHashMap);
            c3409f0.g();
            return yVar;
        }
    }

    public y(X1 x12) {
        super(x12.l());
        this.f35466s = new ArrayList();
        this.f35467t = "transaction";
        this.f35468u = new HashMap();
        io.sentry.util.n.c(x12, "sentryTracer is required");
        this.f35464q = Double.valueOf(AbstractC3420j.l(x12.r().o()));
        this.f35465r = Double.valueOf(AbstractC3420j.l(x12.r().n(x12.o())));
        this.f35463p = x12.getName();
        for (b2 b2Var : x12.C()) {
            if (Boolean.TRUE.equals(b2Var.C())) {
                this.f35466s.add(new u(b2Var));
            }
        }
        C3443c C10 = C();
        C10.putAll(x12.D());
        c2 n10 = x12.n();
        C10.n(new c2(n10.k(), n10.h(), n10.d(), n10.b(), n10.a(), n10.g(), n10.i(), n10.c()));
        for (Map.Entry entry : n10.j().entrySet()) {
            c0((String) entry.getKey(), (String) entry.getValue());
        }
        Map E10 = x12.E();
        if (E10 != null) {
            for (Map.Entry entry2 : E10.entrySet()) {
                V((String) entry2.getKey(), entry2.getValue());
            }
        }
        this.f35469v = new z(x12.q().apiName());
    }

    private BigDecimal l0(Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public Map m0() {
        return this.f35468u;
    }

    public n2 n0() {
        c2 e10 = C().e();
        if (e10 == null) {
            return null;
        }
        return e10.g();
    }

    public List o0() {
        return this.f35466s;
    }

    public boolean p0() {
        return this.f35465r != null;
    }

    public boolean q0() {
        n2 n02 = n0();
        if (n02 == null) {
            return false;
        }
        return n02.c().booleanValue();
    }

    public void r0(Map map) {
        this.f35470w = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35463p != null) {
            a02.k("transaction").b(this.f35463p);
        }
        a02.k("start_timestamp").g(iLogger, l0(this.f35464q));
        if (this.f35465r != null) {
            a02.k("timestamp").g(iLogger, l0(this.f35465r));
        }
        if (!this.f35466s.isEmpty()) {
            a02.k("spans").g(iLogger, this.f35466s);
        }
        a02.k("type").b("transaction");
        if (!this.f35468u.isEmpty()) {
            a02.k("measurements").g(iLogger, this.f35468u);
        }
        a02.k("transaction_info").g(iLogger, this.f35469v);
        new AbstractC3370a1.b().a(this, a02, iLogger);
        Map map = this.f35470w;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f35470w.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }

    public y(String str, Double d10, Double d11, List list, Map map, z zVar) {
        ArrayList arrayList = new ArrayList();
        this.f35466s = arrayList;
        this.f35467t = "transaction";
        HashMap hashMap = new HashMap();
        this.f35468u = hashMap;
        this.f35463p = str;
        this.f35464q = d10;
        this.f35465r = d11;
        arrayList.addAll(list);
        hashMap.putAll(map);
        this.f35469v = zVar;
    }
}
