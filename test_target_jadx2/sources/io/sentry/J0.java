package io.sentry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class J0 implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private String f34498a;

    /* renamed from: b, reason: collision with root package name */
    private String f34499b;

    /* renamed from: c, reason: collision with root package name */
    private String f34500c;

    /* renamed from: d, reason: collision with root package name */
    private Long f34501d;

    /* renamed from: e, reason: collision with root package name */
    private Long f34502e;

    /* renamed from: f, reason: collision with root package name */
    private Long f34503f;

    /* renamed from: g, reason: collision with root package name */
    private Long f34504g;

    /* renamed from: h, reason: collision with root package name */
    private Map f34505h;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public J0 a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            c3409f0.b();
            J0 j02 = new J0();
            ConcurrentHashMap concurrentHashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "relative_start_ns":
                        Long m12 = c3409f0.m1();
                        if (m12 == null) {
                            break;
                        } else {
                            j02.f34501d = m12;
                            break;
                        }
                    case "relative_end_ns":
                        Long m13 = c3409f0.m1();
                        if (m13 == null) {
                            break;
                        } else {
                            j02.f34502e = m13;
                            break;
                        }
                    case "id":
                        String x12 = c3409f0.x1();
                        if (x12 == null) {
                            break;
                        } else {
                            j02.f34498a = x12;
                            break;
                        }
                    case "name":
                        String x13 = c3409f0.x1();
                        if (x13 == null) {
                            break;
                        } else {
                            j02.f34500c = x13;
                            break;
                        }
                    case "trace_id":
                        String x14 = c3409f0.x1();
                        if (x14 == null) {
                            break;
                        } else {
                            j02.f34499b = x14;
                            break;
                        }
                    case "relative_cpu_end_ms":
                        Long m14 = c3409f0.m1();
                        if (m14 == null) {
                            break;
                        } else {
                            j02.f34504g = m14;
                            break;
                        }
                    case "relative_cpu_start_ms":
                        Long m15 = c3409f0.m1();
                        if (m15 == null) {
                            break;
                        } else {
                            j02.f34503f = m15;
                            break;
                        }
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c3409f0.z1(iLogger, concurrentHashMap, r10);
                        break;
                }
            }
            j02.j(concurrentHashMap);
            c3409f0.g();
            return j02;
        }
    }

    public J0() {
        this(C3464w0.s(), 0L, 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J0.class != obj.getClass()) {
            return false;
        }
        J0 j02 = (J0) obj;
        return this.f34498a.equals(j02.f34498a) && this.f34499b.equals(j02.f34499b) && this.f34500c.equals(j02.f34500c) && this.f34501d.equals(j02.f34501d) && this.f34503f.equals(j02.f34503f) && io.sentry.util.n.a(this.f34504g, j02.f34504g) && io.sentry.util.n.a(this.f34502e, j02.f34502e) && io.sentry.util.n.a(this.f34505h, j02.f34505h);
    }

    public String h() {
        return this.f34498a;
    }

    public int hashCode() {
        return io.sentry.util.n.b(this.f34498a, this.f34499b, this.f34500c, this.f34501d, this.f34502e, this.f34503f, this.f34504g, this.f34505h);
    }

    public void i(Long l10, Long l11, Long l12, Long l13) {
        if (this.f34502e == null) {
            this.f34502e = Long.valueOf(l10.longValue() - l11.longValue());
            this.f34501d = Long.valueOf(this.f34501d.longValue() - l11.longValue());
            this.f34504g = Long.valueOf(l12.longValue() - l13.longValue());
            this.f34503f = Long.valueOf(this.f34503f.longValue() - l13.longValue());
        }
    }

    public void j(Map map) {
        this.f34505h = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        a02.k("id").g(iLogger, this.f34498a);
        a02.k("trace_id").g(iLogger, this.f34499b);
        a02.k("name").g(iLogger, this.f34500c);
        a02.k("relative_start_ns").g(iLogger, this.f34501d);
        a02.k("relative_end_ns").g(iLogger, this.f34502e);
        a02.k("relative_cpu_start_ms").g(iLogger, this.f34503f);
        a02.k("relative_cpu_end_ms").g(iLogger, this.f34504g);
        Map map = this.f34505h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f34505h.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }

    public J0(T t10, Long l10, Long l11) {
        this.f34498a = t10.l().toString();
        this.f34499b = t10.n().k().toString();
        this.f34500c = t10.getName();
        this.f34501d = l10;
        this.f34503f = l11;
    }
}
