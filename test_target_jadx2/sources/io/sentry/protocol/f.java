package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.Z;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class f implements InterfaceC3421j0 {

    /* renamed from: A, reason: collision with root package name */
    private String f35302A;

    /* renamed from: B, reason: collision with root package name */
    private String f35303B;

    /* renamed from: C, reason: collision with root package name */
    private String f35304C;

    /* renamed from: D, reason: collision with root package name */
    private String f35305D;

    /* renamed from: E, reason: collision with root package name */
    private Float f35306E;

    /* renamed from: F, reason: collision with root package name */
    private Integer f35307F;

    /* renamed from: G, reason: collision with root package name */
    private Double f35308G;

    /* renamed from: H, reason: collision with root package name */
    private String f35309H;

    /* renamed from: I, reason: collision with root package name */
    private Map f35310I;

    /* renamed from: a, reason: collision with root package name */
    private String f35311a;

    /* renamed from: b, reason: collision with root package name */
    private String f35312b;

    /* renamed from: c, reason: collision with root package name */
    private String f35313c;

    /* renamed from: d, reason: collision with root package name */
    private String f35314d;

    /* renamed from: e, reason: collision with root package name */
    private String f35315e;

    /* renamed from: f, reason: collision with root package name */
    private String f35316f;

    /* renamed from: g, reason: collision with root package name */
    private String[] f35317g;

    /* renamed from: h, reason: collision with root package name */
    private Float f35318h;

    /* renamed from: i, reason: collision with root package name */
    private Boolean f35319i;

    /* renamed from: j, reason: collision with root package name */
    private Boolean f35320j;

    /* renamed from: k, reason: collision with root package name */
    private b f35321k;

    /* renamed from: l, reason: collision with root package name */
    private Boolean f35322l;

    /* renamed from: m, reason: collision with root package name */
    private Long f35323m;

    /* renamed from: n, reason: collision with root package name */
    private Long f35324n;

    /* renamed from: o, reason: collision with root package name */
    private Long f35325o;

    /* renamed from: p, reason: collision with root package name */
    private Boolean f35326p;

    /* renamed from: q, reason: collision with root package name */
    private Long f35327q;

    /* renamed from: r, reason: collision with root package name */
    private Long f35328r;

    /* renamed from: s, reason: collision with root package name */
    private Long f35329s;

    /* renamed from: t, reason: collision with root package name */
    private Long f35330t;

    /* renamed from: u, reason: collision with root package name */
    private Integer f35331u;

    /* renamed from: v, reason: collision with root package name */
    private Integer f35332v;

    /* renamed from: w, reason: collision with root package name */
    private Float f35333w;

    /* renamed from: x, reason: collision with root package name */
    private Integer f35334x;

    /* renamed from: y, reason: collision with root package name */
    private Date f35335y;

    /* renamed from: z, reason: collision with root package name */
    private TimeZone f35336z;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            c3409f0.b();
            f fVar = new f();
            ConcurrentHashMap concurrentHashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "timezone":
                        fVar.f35336z = c3409f0.y1(iLogger);
                        break;
                    case "boot_time":
                        if (c3409f0.z() != io.sentry.vendor.gson.stream.b.STRING) {
                            break;
                        } else {
                            fVar.f35335y = c3409f0.O0(iLogger);
                            break;
                        }
                    case "simulator":
                        fVar.f35322l = c3409f0.A0();
                        break;
                    case "manufacturer":
                        fVar.f35312b = c3409f0.x1();
                        break;
                    case "language":
                        fVar.f35303B = c3409f0.x1();
                        break;
                    case "processor_count":
                        fVar.f35307F = c3409f0.i1();
                        break;
                    case "orientation":
                        fVar.f35321k = (b) c3409f0.v1(iLogger, new b.a());
                        break;
                    case "battery_temperature":
                        fVar.f35306E = c3409f0.g1();
                        break;
                    case "family":
                        fVar.f35314d = c3409f0.x1();
                        break;
                    case "locale":
                        fVar.f35304C = c3409f0.x1();
                        break;
                    case "online":
                        fVar.f35320j = c3409f0.A0();
                        break;
                    case "battery_level":
                        fVar.f35318h = c3409f0.g1();
                        break;
                    case "model_id":
                        fVar.f35316f = c3409f0.x1();
                        break;
                    case "screen_density":
                        fVar.f35333w = c3409f0.g1();
                        break;
                    case "screen_dpi":
                        fVar.f35334x = c3409f0.i1();
                        break;
                    case "free_memory":
                        fVar.f35324n = c3409f0.m1();
                        break;
                    case "id":
                        fVar.f35302A = c3409f0.x1();
                        break;
                    case "name":
                        fVar.f35311a = c3409f0.x1();
                        break;
                    case "low_memory":
                        fVar.f35326p = c3409f0.A0();
                        break;
                    case "archs":
                        List list = (List) c3409f0.t1();
                        if (list == null) {
                            break;
                        } else {
                            String[] strArr = new String[list.size()];
                            list.toArray(strArr);
                            fVar.f35317g = strArr;
                            break;
                        }
                    case "brand":
                        fVar.f35313c = c3409f0.x1();
                        break;
                    case "model":
                        fVar.f35315e = c3409f0.x1();
                        break;
                    case "cpu_description":
                        fVar.f35309H = c3409f0.x1();
                        break;
                    case "processor_frequency":
                        fVar.f35308G = c3409f0.Z0();
                        break;
                    case "connection_type":
                        fVar.f35305D = c3409f0.x1();
                        break;
                    case "screen_width_pixels":
                        fVar.f35331u = c3409f0.i1();
                        break;
                    case "external_storage_size":
                        fVar.f35329s = c3409f0.m1();
                        break;
                    case "storage_size":
                        fVar.f35327q = c3409f0.m1();
                        break;
                    case "usable_memory":
                        fVar.f35325o = c3409f0.m1();
                        break;
                    case "memory_size":
                        fVar.f35323m = c3409f0.m1();
                        break;
                    case "charging":
                        fVar.f35319i = c3409f0.A0();
                        break;
                    case "external_free_storage":
                        fVar.f35330t = c3409f0.m1();
                        break;
                    case "free_storage":
                        fVar.f35328r = c3409f0.m1();
                        break;
                    case "screen_height_pixels":
                        fVar.f35332v = c3409f0.i1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c3409f0.z1(iLogger, concurrentHashMap, r10);
                        break;
                }
            }
            fVar.s0(concurrentHashMap);
            c3409f0.g();
            return fVar;
        }
    }

    public enum b implements InterfaceC3421j0 {
        PORTRAIT,
        LANDSCAPE;

        public static final class a implements Z {
            @Override // io.sentry.Z
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(C3409f0 c3409f0, ILogger iLogger) {
                return b.valueOf(c3409f0.x().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.InterfaceC3421j0
        public void serialize(A0 a02, ILogger iLogger) {
            a02.b(toString().toLowerCase(Locale.ROOT));
        }
    }

    public f() {
    }

    public String I() {
        return this.f35305D;
    }

    public String J() {
        return this.f35302A;
    }

    public String K() {
        return this.f35303B;
    }

    public String L() {
        return this.f35304C;
    }

    public void M(String[] strArr) {
        this.f35317g = strArr;
    }

    public void N(Float f10) {
        this.f35318h = f10;
    }

    public void O(Float f10) {
        this.f35306E = f10;
    }

    public void P(Date date) {
        this.f35335y = date;
    }

    public void Q(String str) {
        this.f35313c = str;
    }

    public void R(Boolean bool) {
        this.f35319i = bool;
    }

    public void S(String str) {
        this.f35305D = str;
    }

    public void T(Long l10) {
        this.f35330t = l10;
    }

    public void U(Long l10) {
        this.f35329s = l10;
    }

    public void V(String str) {
        this.f35314d = str;
    }

    public void W(Long l10) {
        this.f35324n = l10;
    }

    public void X(Long l10) {
        this.f35328r = l10;
    }

    public void Y(String str) {
        this.f35302A = str;
    }

    public void Z(String str) {
        this.f35303B = str;
    }

    public void a0(String str) {
        this.f35304C = str;
    }

    public void b0(Boolean bool) {
        this.f35326p = bool;
    }

    public void c0(String str) {
        this.f35312b = str;
    }

    public void d0(Long l10) {
        this.f35323m = l10;
    }

    public void e0(String str) {
        this.f35315e = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return io.sentry.util.n.a(this.f35311a, fVar.f35311a) && io.sentry.util.n.a(this.f35312b, fVar.f35312b) && io.sentry.util.n.a(this.f35313c, fVar.f35313c) && io.sentry.util.n.a(this.f35314d, fVar.f35314d) && io.sentry.util.n.a(this.f35315e, fVar.f35315e) && io.sentry.util.n.a(this.f35316f, fVar.f35316f) && Arrays.equals(this.f35317g, fVar.f35317g) && io.sentry.util.n.a(this.f35318h, fVar.f35318h) && io.sentry.util.n.a(this.f35319i, fVar.f35319i) && io.sentry.util.n.a(this.f35320j, fVar.f35320j) && this.f35321k == fVar.f35321k && io.sentry.util.n.a(this.f35322l, fVar.f35322l) && io.sentry.util.n.a(this.f35323m, fVar.f35323m) && io.sentry.util.n.a(this.f35324n, fVar.f35324n) && io.sentry.util.n.a(this.f35325o, fVar.f35325o) && io.sentry.util.n.a(this.f35326p, fVar.f35326p) && io.sentry.util.n.a(this.f35327q, fVar.f35327q) && io.sentry.util.n.a(this.f35328r, fVar.f35328r) && io.sentry.util.n.a(this.f35329s, fVar.f35329s) && io.sentry.util.n.a(this.f35330t, fVar.f35330t) && io.sentry.util.n.a(this.f35331u, fVar.f35331u) && io.sentry.util.n.a(this.f35332v, fVar.f35332v) && io.sentry.util.n.a(this.f35333w, fVar.f35333w) && io.sentry.util.n.a(this.f35334x, fVar.f35334x) && io.sentry.util.n.a(this.f35335y, fVar.f35335y) && io.sentry.util.n.a(this.f35302A, fVar.f35302A) && io.sentry.util.n.a(this.f35303B, fVar.f35303B) && io.sentry.util.n.a(this.f35304C, fVar.f35304C) && io.sentry.util.n.a(this.f35305D, fVar.f35305D) && io.sentry.util.n.a(this.f35306E, fVar.f35306E) && io.sentry.util.n.a(this.f35307F, fVar.f35307F) && io.sentry.util.n.a(this.f35308G, fVar.f35308G) && io.sentry.util.n.a(this.f35309H, fVar.f35309H);
    }

    public void f0(String str) {
        this.f35316f = str;
    }

    public void g0(String str) {
        this.f35311a = str;
    }

    public void h0(Boolean bool) {
        this.f35320j = bool;
    }

    public int hashCode() {
        return (io.sentry.util.n.b(this.f35311a, this.f35312b, this.f35313c, this.f35314d, this.f35315e, this.f35316f, this.f35318h, this.f35319i, this.f35320j, this.f35321k, this.f35322l, this.f35323m, this.f35324n, this.f35325o, this.f35326p, this.f35327q, this.f35328r, this.f35329s, this.f35330t, this.f35331u, this.f35332v, this.f35333w, this.f35334x, this.f35335y, this.f35336z, this.f35302A, this.f35303B, this.f35304C, this.f35305D, this.f35306E, this.f35307F, this.f35308G, this.f35309H) * 31) + Arrays.hashCode(this.f35317g);
    }

    public void i0(b bVar) {
        this.f35321k = bVar;
    }

    public void j0(Integer num) {
        this.f35307F = num;
    }

    public void k0(Double d10) {
        this.f35308G = d10;
    }

    public void l0(Float f10) {
        this.f35333w = f10;
    }

    public void m0(Integer num) {
        this.f35334x = num;
    }

    public void n0(Integer num) {
        this.f35332v = num;
    }

    public void o0(Integer num) {
        this.f35331u = num;
    }

    public void p0(Boolean bool) {
        this.f35322l = bool;
    }

    public void q0(Long l10) {
        this.f35327q = l10;
    }

    public void r0(TimeZone timeZone) {
        this.f35336z = timeZone;
    }

    public void s0(Map map) {
        this.f35310I = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35311a != null) {
            a02.k("name").b(this.f35311a);
        }
        if (this.f35312b != null) {
            a02.k("manufacturer").b(this.f35312b);
        }
        if (this.f35313c != null) {
            a02.k("brand").b(this.f35313c);
        }
        if (this.f35314d != null) {
            a02.k("family").b(this.f35314d);
        }
        if (this.f35315e != null) {
            a02.k("model").b(this.f35315e);
        }
        if (this.f35316f != null) {
            a02.k("model_id").b(this.f35316f);
        }
        if (this.f35317g != null) {
            a02.k("archs").g(iLogger, this.f35317g);
        }
        if (this.f35318h != null) {
            a02.k("battery_level").e(this.f35318h);
        }
        if (this.f35319i != null) {
            a02.k("charging").h(this.f35319i);
        }
        if (this.f35320j != null) {
            a02.k("online").h(this.f35320j);
        }
        if (this.f35321k != null) {
            a02.k("orientation").g(iLogger, this.f35321k);
        }
        if (this.f35322l != null) {
            a02.k("simulator").h(this.f35322l);
        }
        if (this.f35323m != null) {
            a02.k("memory_size").e(this.f35323m);
        }
        if (this.f35324n != null) {
            a02.k("free_memory").e(this.f35324n);
        }
        if (this.f35325o != null) {
            a02.k("usable_memory").e(this.f35325o);
        }
        if (this.f35326p != null) {
            a02.k("low_memory").h(this.f35326p);
        }
        if (this.f35327q != null) {
            a02.k("storage_size").e(this.f35327q);
        }
        if (this.f35328r != null) {
            a02.k("free_storage").e(this.f35328r);
        }
        if (this.f35329s != null) {
            a02.k("external_storage_size").e(this.f35329s);
        }
        if (this.f35330t != null) {
            a02.k("external_free_storage").e(this.f35330t);
        }
        if (this.f35331u != null) {
            a02.k("screen_width_pixels").e(this.f35331u);
        }
        if (this.f35332v != null) {
            a02.k("screen_height_pixels").e(this.f35332v);
        }
        if (this.f35333w != null) {
            a02.k("screen_density").e(this.f35333w);
        }
        if (this.f35334x != null) {
            a02.k("screen_dpi").e(this.f35334x);
        }
        if (this.f35335y != null) {
            a02.k("boot_time").g(iLogger, this.f35335y);
        }
        if (this.f35336z != null) {
            a02.k("timezone").g(iLogger, this.f35336z);
        }
        if (this.f35302A != null) {
            a02.k("id").b(this.f35302A);
        }
        if (this.f35303B != null) {
            a02.k("language").b(this.f35303B);
        }
        if (this.f35305D != null) {
            a02.k("connection_type").b(this.f35305D);
        }
        if (this.f35306E != null) {
            a02.k("battery_temperature").e(this.f35306E);
        }
        if (this.f35304C != null) {
            a02.k("locale").b(this.f35304C);
        }
        if (this.f35307F != null) {
            a02.k("processor_count").e(this.f35307F);
        }
        if (this.f35308G != null) {
            a02.k("processor_frequency").e(this.f35308G);
        }
        if (this.f35309H != null) {
            a02.k("cpu_description").b(this.f35309H);
        }
        Map map = this.f35310I;
        if (map != null) {
            for (String str : map.keySet()) {
                a02.k(str).g(iLogger, this.f35310I.get(str));
            }
        }
        a02.d();
    }

    f(f fVar) {
        this.f35311a = fVar.f35311a;
        this.f35312b = fVar.f35312b;
        this.f35313c = fVar.f35313c;
        this.f35314d = fVar.f35314d;
        this.f35315e = fVar.f35315e;
        this.f35316f = fVar.f35316f;
        this.f35319i = fVar.f35319i;
        this.f35320j = fVar.f35320j;
        this.f35321k = fVar.f35321k;
        this.f35322l = fVar.f35322l;
        this.f35323m = fVar.f35323m;
        this.f35324n = fVar.f35324n;
        this.f35325o = fVar.f35325o;
        this.f35326p = fVar.f35326p;
        this.f35327q = fVar.f35327q;
        this.f35328r = fVar.f35328r;
        this.f35329s = fVar.f35329s;
        this.f35330t = fVar.f35330t;
        this.f35331u = fVar.f35331u;
        this.f35332v = fVar.f35332v;
        this.f35333w = fVar.f35333w;
        this.f35334x = fVar.f35334x;
        this.f35335y = fVar.f35335y;
        this.f35302A = fVar.f35302A;
        this.f35303B = fVar.f35303B;
        this.f35305D = fVar.f35305D;
        this.f35306E = fVar.f35306E;
        this.f35318h = fVar.f35318h;
        String[] strArr = fVar.f35317g;
        this.f35317g = strArr != null ? (String[]) strArr.clone() : null;
        this.f35304C = fVar.f35304C;
        TimeZone timeZone = fVar.f35336z;
        this.f35336z = timeZone != null ? (TimeZone) timeZone.clone() : null;
        this.f35307F = fVar.f35307F;
        this.f35308G = fVar.f35308G;
        this.f35309H = fVar.f35309H;
        this.f35310I = io.sentry.util.b.b(fVar.f35310I);
    }
}
