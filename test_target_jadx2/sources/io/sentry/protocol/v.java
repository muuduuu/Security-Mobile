package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.L1;
import io.sentry.Z;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class v implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private String f35430a;

    /* renamed from: b, reason: collision with root package name */
    private String f35431b;

    /* renamed from: c, reason: collision with root package name */
    private String f35432c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f35433d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f35434e;

    /* renamed from: f, reason: collision with root package name */
    private String f35435f;

    /* renamed from: g, reason: collision with root package name */
    private String f35436g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f35437h;

    /* renamed from: i, reason: collision with root package name */
    private String f35438i;

    /* renamed from: j, reason: collision with root package name */
    private Boolean f35439j;

    /* renamed from: k, reason: collision with root package name */
    private String f35440k;

    /* renamed from: l, reason: collision with root package name */
    private String f35441l;

    /* renamed from: m, reason: collision with root package name */
    private String f35442m;

    /* renamed from: n, reason: collision with root package name */
    private String f35443n;

    /* renamed from: o, reason: collision with root package name */
    private String f35444o;

    /* renamed from: p, reason: collision with root package name */
    private Map f35445p;

    /* renamed from: q, reason: collision with root package name */
    private String f35446q;

    /* renamed from: r, reason: collision with root package name */
    private L1 f35447r;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public v a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            v vVar = new v();
            c3409f0.b();
            ConcurrentHashMap concurrentHashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "image_addr":
                        vVar.f35441l = c3409f0.x1();
                        break;
                    case "in_app":
                        vVar.f35437h = c3409f0.A0();
                        break;
                    case "raw_function":
                        vVar.f35446q = c3409f0.x1();
                        break;
                    case "lineno":
                        vVar.f35433d = c3409f0.i1();
                        break;
                    case "module":
                        vVar.f35432c = c3409f0.x1();
                        break;
                    case "native":
                        vVar.f35439j = c3409f0.A0();
                        break;
                    case "symbol":
                        vVar.f35444o = c3409f0.x1();
                        break;
                    case "package":
                        vVar.f35438i = c3409f0.x1();
                        break;
                    case "filename":
                        vVar.f35430a = c3409f0.x1();
                        break;
                    case "symbol_addr":
                        vVar.f35442m = c3409f0.x1();
                        break;
                    case "lock":
                        vVar.f35447r = (L1) c3409f0.v1(iLogger, new L1.a());
                        break;
                    case "colno":
                        vVar.f35434e = c3409f0.i1();
                        break;
                    case "instruction_addr":
                        vVar.f35443n = c3409f0.x1();
                        break;
                    case "context_line":
                        vVar.f35436g = c3409f0.x1();
                        break;
                    case "function":
                        vVar.f35431b = c3409f0.x1();
                        break;
                    case "abs_path":
                        vVar.f35435f = c3409f0.x1();
                        break;
                    case "platform":
                        vVar.f35440k = c3409f0.x1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c3409f0.z1(iLogger, concurrentHashMap, r10);
                        break;
                }
            }
            vVar.z(concurrentHashMap);
            c3409f0.g();
            return vVar;
        }
    }

    public void r(String str) {
        this.f35430a = str;
    }

    public void s(String str) {
        this.f35431b = str;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35430a != null) {
            a02.k("filename").b(this.f35430a);
        }
        if (this.f35431b != null) {
            a02.k("function").b(this.f35431b);
        }
        if (this.f35432c != null) {
            a02.k("module").b(this.f35432c);
        }
        if (this.f35433d != null) {
            a02.k("lineno").e(this.f35433d);
        }
        if (this.f35434e != null) {
            a02.k("colno").e(this.f35434e);
        }
        if (this.f35435f != null) {
            a02.k("abs_path").b(this.f35435f);
        }
        if (this.f35436g != null) {
            a02.k("context_line").b(this.f35436g);
        }
        if (this.f35437h != null) {
            a02.k("in_app").h(this.f35437h);
        }
        if (this.f35438i != null) {
            a02.k("package").b(this.f35438i);
        }
        if (this.f35439j != null) {
            a02.k("native").h(this.f35439j);
        }
        if (this.f35440k != null) {
            a02.k("platform").b(this.f35440k);
        }
        if (this.f35441l != null) {
            a02.k("image_addr").b(this.f35441l);
        }
        if (this.f35442m != null) {
            a02.k("symbol_addr").b(this.f35442m);
        }
        if (this.f35443n != null) {
            a02.k("instruction_addr").b(this.f35443n);
        }
        if (this.f35446q != null) {
            a02.k("raw_function").b(this.f35446q);
        }
        if (this.f35444o != null) {
            a02.k("symbol").b(this.f35444o);
        }
        if (this.f35447r != null) {
            a02.k("lock").g(iLogger, this.f35447r);
        }
        Map map = this.f35445p;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f35445p.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }

    public void t(Boolean bool) {
        this.f35437h = bool;
    }

    public void u(Integer num) {
        this.f35433d = num;
    }

    public void v(L1 l12) {
        this.f35447r = l12;
    }

    public void w(String str) {
        this.f35432c = str;
    }

    public void x(Boolean bool) {
        this.f35439j = bool;
    }

    public void y(String str) {
        this.f35438i = str;
    }

    public void z(Map map) {
        this.f35445p = map;
    }
}
