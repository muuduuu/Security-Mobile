package io.sentry.protocol;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.L1;
import io.sentry.Z;
import io.sentry.protocol.w;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class x implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private Long f35452a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f35453b;

    /* renamed from: c, reason: collision with root package name */
    private String f35454c;

    /* renamed from: d, reason: collision with root package name */
    private String f35455d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f35456e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f35457f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f35458g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f35459h;

    /* renamed from: i, reason: collision with root package name */
    private w f35460i;

    /* renamed from: j, reason: collision with root package name */
    private Map f35461j;

    /* renamed from: k, reason: collision with root package name */
    private Map f35462k;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public x a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            x xVar = new x();
            c3409f0.b();
            ConcurrentHashMap concurrentHashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "daemon":
                        xVar.f35458g = c3409f0.A0();
                        break;
                    case "priority":
                        xVar.f35453b = c3409f0.i1();
                        break;
                    case "held_locks":
                        Map o12 = c3409f0.o1(iLogger, new L1.a());
                        if (o12 == null) {
                            break;
                        } else {
                            xVar.f35461j = new HashMap(o12);
                            break;
                        }
                    case "id":
                        xVar.f35452a = c3409f0.m1();
                        break;
                    case "main":
                        xVar.f35459h = c3409f0.A0();
                        break;
                    case "name":
                        xVar.f35454c = c3409f0.x1();
                        break;
                    case "state":
                        xVar.f35455d = c3409f0.x1();
                        break;
                    case "crashed":
                        xVar.f35456e = c3409f0.A0();
                        break;
                    case "current":
                        xVar.f35457f = c3409f0.A0();
                        break;
                    case "stacktrace":
                        xVar.f35460i = (w) c3409f0.v1(iLogger, new w.a());
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c3409f0.z1(iLogger, concurrentHashMap, r10);
                        break;
                }
            }
            xVar.A(concurrentHashMap);
            c3409f0.g();
            return xVar;
        }
    }

    public void A(Map map) {
        this.f35462k = map;
    }

    public Map k() {
        return this.f35461j;
    }

    public Long l() {
        return this.f35452a;
    }

    public String m() {
        return this.f35454c;
    }

    public w n() {
        return this.f35460i;
    }

    public Boolean o() {
        return this.f35457f;
    }

    public Boolean p() {
        return this.f35459h;
    }

    public void q(Boolean bool) {
        this.f35456e = bool;
    }

    public void r(Boolean bool) {
        this.f35457f = bool;
    }

    public void s(Boolean bool) {
        this.f35458g = bool;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35452a != null) {
            a02.k("id").e(this.f35452a);
        }
        if (this.f35453b != null) {
            a02.k("priority").e(this.f35453b);
        }
        if (this.f35454c != null) {
            a02.k("name").b(this.f35454c);
        }
        if (this.f35455d != null) {
            a02.k(Keys.STATE).b(this.f35455d);
        }
        if (this.f35456e != null) {
            a02.k("crashed").h(this.f35456e);
        }
        if (this.f35457f != null) {
            a02.k("current").h(this.f35457f);
        }
        if (this.f35458g != null) {
            a02.k("daemon").h(this.f35458g);
        }
        if (this.f35459h != null) {
            a02.k("main").h(this.f35459h);
        }
        if (this.f35460i != null) {
            a02.k("stacktrace").g(iLogger, this.f35460i);
        }
        if (this.f35461j != null) {
            a02.k("held_locks").g(iLogger, this.f35461j);
        }
        Map map = this.f35462k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f35462k.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }

    public void t(Map map) {
        this.f35461j = map;
    }

    public void u(Long l10) {
        this.f35452a = l10;
    }

    public void v(Boolean bool) {
        this.f35459h = bool;
    }

    public void w(String str) {
        this.f35454c = str;
    }

    public void x(Integer num) {
        this.f35453b = num;
    }

    public void y(w wVar) {
        this.f35460i = wVar;
    }

    public void z(String str) {
        this.f35455d = str;
    }
}
