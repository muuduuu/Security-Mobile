package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.Z;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class l implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private String f35367a;

    /* renamed from: b, reason: collision with root package name */
    private String f35368b;

    /* renamed from: c, reason: collision with root package name */
    private String f35369c;

    /* renamed from: d, reason: collision with root package name */
    private String f35370d;

    /* renamed from: e, reason: collision with root package name */
    private String f35371e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f35372f;

    /* renamed from: g, reason: collision with root package name */
    private Map f35373g;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            c3409f0.b();
            l lVar = new l();
            ConcurrentHashMap concurrentHashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "rooted":
                        lVar.f35372f = c3409f0.A0();
                        break;
                    case "raw_description":
                        lVar.f35369c = c3409f0.x1();
                        break;
                    case "name":
                        lVar.f35367a = c3409f0.x1();
                        break;
                    case "build":
                        lVar.f35370d = c3409f0.x1();
                        break;
                    case "version":
                        lVar.f35368b = c3409f0.x1();
                        break;
                    case "kernel_version":
                        lVar.f35371e = c3409f0.x1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c3409f0.z1(iLogger, concurrentHashMap, r10);
                        break;
                }
            }
            lVar.l(concurrentHashMap);
            c3409f0.g();
            return lVar;
        }
    }

    public l() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return io.sentry.util.n.a(this.f35367a, lVar.f35367a) && io.sentry.util.n.a(this.f35368b, lVar.f35368b) && io.sentry.util.n.a(this.f35369c, lVar.f35369c) && io.sentry.util.n.a(this.f35370d, lVar.f35370d) && io.sentry.util.n.a(this.f35371e, lVar.f35371e) && io.sentry.util.n.a(this.f35372f, lVar.f35372f);
    }

    public String g() {
        return this.f35367a;
    }

    public void h(String str) {
        this.f35370d = str;
    }

    public int hashCode() {
        return io.sentry.util.n.b(this.f35367a, this.f35368b, this.f35369c, this.f35370d, this.f35371e, this.f35372f);
    }

    public void i(String str) {
        this.f35371e = str;
    }

    public void j(String str) {
        this.f35367a = str;
    }

    public void k(Boolean bool) {
        this.f35372f = bool;
    }

    public void l(Map map) {
        this.f35373g = map;
    }

    public void m(String str) {
        this.f35368b = str;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35367a != null) {
            a02.k("name").b(this.f35367a);
        }
        if (this.f35368b != null) {
            a02.k("version").b(this.f35368b);
        }
        if (this.f35369c != null) {
            a02.k("raw_description").b(this.f35369c);
        }
        if (this.f35370d != null) {
            a02.k("build").b(this.f35370d);
        }
        if (this.f35371e != null) {
            a02.k("kernel_version").b(this.f35371e);
        }
        if (this.f35372f != null) {
            a02.k("rooted").h(this.f35372f);
        }
        Map map = this.f35373g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f35373g.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }

    l(l lVar) {
        this.f35367a = lVar.f35367a;
        this.f35368b = lVar.f35368b;
        this.f35369c = lVar.f35369c;
        this.f35370d = lVar.f35370d;
        this.f35371e = lVar.f35371e;
        this.f35372f = lVar.f35372f;
        this.f35373g = io.sentry.util.b.b(lVar.f35373g);
    }
}
