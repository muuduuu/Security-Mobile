package io.sentry.protocol;

import com.appsflyer.attribution.RequestError;
import io.sentry.A0;
import io.sentry.AbstractC3420j;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.K1;
import io.sentry.Z;
import io.sentry.b2;
import io.sentry.e2;
import io.sentry.g2;
import io.sentry.protocol.r;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class u implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private final Double f35418a;

    /* renamed from: b, reason: collision with root package name */
    private final Double f35419b;

    /* renamed from: c, reason: collision with root package name */
    private final r f35420c;

    /* renamed from: d, reason: collision with root package name */
    private final e2 f35421d;

    /* renamed from: e, reason: collision with root package name */
    private final e2 f35422e;

    /* renamed from: f, reason: collision with root package name */
    private final String f35423f;

    /* renamed from: g, reason: collision with root package name */
    private final String f35424g;

    /* renamed from: h, reason: collision with root package name */
    private final g2 f35425h;

    /* renamed from: i, reason: collision with root package name */
    private final String f35426i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f35427j;

    /* renamed from: k, reason: collision with root package name */
    private final Map f35428k;

    /* renamed from: l, reason: collision with root package name */
    private Map f35429l;

    public static final class a implements Z {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(K1.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u a(C3409f0 c3409f0, ILogger iLogger) {
            char c10;
            c3409f0.b();
            ConcurrentHashMap concurrentHashMap = null;
            Double d10 = null;
            Double d11 = null;
            r rVar = null;
            e2 e2Var = null;
            e2 e2Var2 = null;
            String str = null;
            String str2 = null;
            g2 g2Var = null;
            String str3 = null;
            Map map = null;
            Map map2 = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                String r10 = c3409f0.r();
                r10.hashCode();
                switch (r10.hashCode()) {
                    case -2011840976:
                        if (r10.equals("span_id")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1757797477:
                        if (r10.equals("parent_span_id")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1724546052:
                        if (r10.equals("description")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1526966919:
                        if (r10.equals("start_timestamp")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1008619738:
                        if (r10.equals("origin")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -892481550:
                        if (r10.equals("status")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3553:
                        if (r10.equals("op")) {
                            c10 = 6;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3076010:
                        if (r10.equals("data")) {
                            c10 = 7;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3552281:
                        if (r10.equals("tags")) {
                            c10 = '\b';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 55126294:
                        if (r10.equals("timestamp")) {
                            c10 = '\t';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1270300245:
                        if (r10.equals("trace_id")) {
                            c10 = '\n';
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                switch (c10) {
                    case 0:
                        e2Var = new e2.a().a(c3409f0, iLogger);
                        break;
                    case 1:
                        e2Var2 = (e2) c3409f0.v1(iLogger, new e2.a());
                        break;
                    case 2:
                        str2 = c3409f0.x1();
                        break;
                    case 3:
                        try {
                            d10 = c3409f0.Z0();
                            break;
                        } catch (NumberFormatException unused) {
                            Date O02 = c3409f0.O0(iLogger);
                            if (O02 == null) {
                                d10 = null;
                                break;
                            } else {
                                d10 = Double.valueOf(AbstractC3420j.b(O02));
                                break;
                            }
                        }
                    case 4:
                        str3 = c3409f0.x1();
                        break;
                    case 5:
                        g2Var = (g2) c3409f0.v1(iLogger, new g2.a());
                        break;
                    case 6:
                        str = c3409f0.x1();
                        break;
                    case 7:
                        map2 = (Map) c3409f0.t1();
                        break;
                    case '\b':
                        map = (Map) c3409f0.t1();
                        break;
                    case '\t':
                        try {
                            d11 = c3409f0.Z0();
                            break;
                        } catch (NumberFormatException unused2) {
                            Date O03 = c3409f0.O0(iLogger);
                            if (O03 == null) {
                                d11 = null;
                                break;
                            } else {
                                d11 = Double.valueOf(AbstractC3420j.b(O03));
                                break;
                            }
                        }
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        rVar = new r.a().a(c3409f0, iLogger);
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c3409f0.z1(iLogger, concurrentHashMap, r10);
                        break;
                }
            }
            if (d10 == null) {
                throw c("start_timestamp", iLogger);
            }
            if (rVar == null) {
                throw c("trace_id", iLogger);
            }
            if (e2Var == null) {
                throw c("span_id", iLogger);
            }
            if (str == null) {
                throw c("op", iLogger);
            }
            if (map == null) {
                map = new HashMap();
            }
            u uVar = new u(d10, d11, rVar, e2Var, e2Var2, str, str2, g2Var, str3, map, map2);
            uVar.c(concurrentHashMap);
            c3409f0.g();
            return uVar;
        }
    }

    public u(b2 b2Var) {
        this(b2Var, b2Var.s());
    }

    private BigDecimal a(Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public String b() {
        return this.f35423f;
    }

    public void c(Map map) {
        this.f35429l = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        a02.k("start_timestamp").g(iLogger, a(this.f35418a));
        if (this.f35419b != null) {
            a02.k("timestamp").g(iLogger, a(this.f35419b));
        }
        a02.k("trace_id").g(iLogger, this.f35420c);
        a02.k("span_id").g(iLogger, this.f35421d);
        if (this.f35422e != null) {
            a02.k("parent_span_id").g(iLogger, this.f35422e);
        }
        a02.k("op").b(this.f35423f);
        if (this.f35424g != null) {
            a02.k("description").b(this.f35424g);
        }
        if (this.f35425h != null) {
            a02.k("status").g(iLogger, this.f35425h);
        }
        if (this.f35426i != null) {
            a02.k("origin").g(iLogger, this.f35426i);
        }
        if (!this.f35427j.isEmpty()) {
            a02.k("tags").g(iLogger, this.f35427j);
        }
        if (this.f35428k != null) {
            a02.k("data").g(iLogger, this.f35428k);
        }
        Map map = this.f35429l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f35429l.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }

    public u(b2 b2Var, Map map) {
        io.sentry.util.n.c(b2Var, "span is required");
        this.f35424g = b2Var.getDescription();
        this.f35423f = b2Var.u();
        this.f35421d = b2Var.y();
        this.f35422e = b2Var.w();
        this.f35420c = b2Var.A();
        this.f35425h = b2Var.c();
        this.f35426i = b2Var.n().c();
        Map b10 = io.sentry.util.b.b(b2Var.z());
        this.f35427j = b10 == null ? new ConcurrentHashMap() : b10;
        this.f35419b = Double.valueOf(AbstractC3420j.l(b2Var.r().n(b2Var.o())));
        this.f35418a = Double.valueOf(AbstractC3420j.l(b2Var.r().o()));
        this.f35428k = map;
    }

    public u(Double d10, Double d11, r rVar, e2 e2Var, e2 e2Var2, String str, String str2, g2 g2Var, String str3, Map map, Map map2) {
        this.f35418a = d10;
        this.f35419b = d11;
        this.f35420c = rVar;
        this.f35421d = e2Var;
        this.f35422e = e2Var2;
        this.f35423f = str;
        this.f35424g = str2;
        this.f35425h = g2Var;
        this.f35427j = map;
        this.f35428k = map2;
        this.f35426i = str3;
    }
}
