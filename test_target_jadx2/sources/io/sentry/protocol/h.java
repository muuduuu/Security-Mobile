package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.Z;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class h implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private String f35341a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f35342b;

    /* renamed from: c, reason: collision with root package name */
    private String f35343c;

    /* renamed from: d, reason: collision with root package name */
    private String f35344d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f35345e;

    /* renamed from: f, reason: collision with root package name */
    private String f35346f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f35347g;

    /* renamed from: h, reason: collision with root package name */
    private String f35348h;

    /* renamed from: i, reason: collision with root package name */
    private String f35349i;

    /* renamed from: j, reason: collision with root package name */
    private Map f35350j;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            c3409f0.b();
            h hVar = new h();
            ConcurrentHashMap concurrentHashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "npot_support":
                        hVar.f35349i = c3409f0.x1();
                        break;
                    case "vendor_id":
                        hVar.f35343c = c3409f0.x1();
                        break;
                    case "multi_threaded_rendering":
                        hVar.f35347g = c3409f0.A0();
                        break;
                    case "id":
                        hVar.f35342b = c3409f0.i1();
                        break;
                    case "name":
                        hVar.f35341a = c3409f0.x1();
                        break;
                    case "vendor_name":
                        hVar.f35344d = c3409f0.x1();
                        break;
                    case "version":
                        hVar.f35348h = c3409f0.x1();
                        break;
                    case "api_type":
                        hVar.f35346f = c3409f0.x1();
                        break;
                    case "memory_size":
                        hVar.f35345e = c3409f0.i1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c3409f0.z1(iLogger, concurrentHashMap, r10);
                        break;
                }
            }
            hVar.j(concurrentHashMap);
            c3409f0.g();
            return hVar;
        }
    }

    public h() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return io.sentry.util.n.a(this.f35341a, hVar.f35341a) && io.sentry.util.n.a(this.f35342b, hVar.f35342b) && io.sentry.util.n.a(this.f35343c, hVar.f35343c) && io.sentry.util.n.a(this.f35344d, hVar.f35344d) && io.sentry.util.n.a(this.f35345e, hVar.f35345e) && io.sentry.util.n.a(this.f35346f, hVar.f35346f) && io.sentry.util.n.a(this.f35347g, hVar.f35347g) && io.sentry.util.n.a(this.f35348h, hVar.f35348h) && io.sentry.util.n.a(this.f35349i, hVar.f35349i);
    }

    public int hashCode() {
        return io.sentry.util.n.b(this.f35341a, this.f35342b, this.f35343c, this.f35344d, this.f35345e, this.f35346f, this.f35347g, this.f35348h, this.f35349i);
    }

    public void j(Map map) {
        this.f35350j = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35341a != null) {
            a02.k("name").b(this.f35341a);
        }
        if (this.f35342b != null) {
            a02.k("id").e(this.f35342b);
        }
        if (this.f35343c != null) {
            a02.k("vendor_id").b(this.f35343c);
        }
        if (this.f35344d != null) {
            a02.k("vendor_name").b(this.f35344d);
        }
        if (this.f35345e != null) {
            a02.k("memory_size").e(this.f35345e);
        }
        if (this.f35346f != null) {
            a02.k("api_type").b(this.f35346f);
        }
        if (this.f35347g != null) {
            a02.k("multi_threaded_rendering").h(this.f35347g);
        }
        if (this.f35348h != null) {
            a02.k("version").b(this.f35348h);
        }
        if (this.f35349i != null) {
            a02.k("npot_support").b(this.f35349i);
        }
        Map map = this.f35350j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f35350j.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }

    h(h hVar) {
        this.f35341a = hVar.f35341a;
        this.f35342b = hVar.f35342b;
        this.f35343c = hVar.f35343c;
        this.f35344d = hVar.f35344d;
        this.f35345e = hVar.f35345e;
        this.f35346f = hVar.f35346f;
        this.f35347g = hVar.f35347g;
        this.f35348h = hVar.f35348h;
        this.f35349i = hVar.f35349i;
        this.f35350j = io.sentry.util.b.b(hVar.f35350j);
    }
}
