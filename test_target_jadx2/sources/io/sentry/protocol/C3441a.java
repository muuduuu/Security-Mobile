package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.Z;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3441a implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private String f35275a;

    /* renamed from: b, reason: collision with root package name */
    private Date f35276b;

    /* renamed from: c, reason: collision with root package name */
    private String f35277c;

    /* renamed from: d, reason: collision with root package name */
    private String f35278d;

    /* renamed from: e, reason: collision with root package name */
    private String f35279e;

    /* renamed from: f, reason: collision with root package name */
    private String f35280f;

    /* renamed from: g, reason: collision with root package name */
    private String f35281g;

    /* renamed from: h, reason: collision with root package name */
    private Map f35282h;

    /* renamed from: i, reason: collision with root package name */
    private Boolean f35283i;

    /* renamed from: j, reason: collision with root package name */
    private Map f35284j;

    /* renamed from: io.sentry.protocol.a$a, reason: collision with other inner class name */
    public static final class C0511a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3441a a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            c3409f0.b();
            C3441a c3441a = new C3441a();
            ConcurrentHashMap concurrentHashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "device_app_hash":
                        c3441a.f35277c = c3409f0.x1();
                        break;
                    case "app_version":
                        c3441a.f35280f = c3409f0.x1();
                        break;
                    case "in_foreground":
                        c3441a.f35283i = c3409f0.A0();
                        break;
                    case "build_type":
                        c3441a.f35278d = c3409f0.x1();
                        break;
                    case "app_identifier":
                        c3441a.f35275a = c3409f0.x1();
                        break;
                    case "app_start_time":
                        c3441a.f35276b = c3409f0.O0(iLogger);
                        break;
                    case "permissions":
                        c3441a.f35282h = io.sentry.util.b.b((Map) c3409f0.t1());
                        break;
                    case "app_name":
                        c3441a.f35279e = c3409f0.x1();
                        break;
                    case "app_build":
                        c3441a.f35281g = c3409f0.x1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c3409f0.z1(iLogger, concurrentHashMap, r10);
                        break;
                }
            }
            c3441a.r(concurrentHashMap);
            c3409f0.g();
            return c3441a;
        }
    }

    public C3441a() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3441a.class != obj.getClass()) {
            return false;
        }
        C3441a c3441a = (C3441a) obj;
        return io.sentry.util.n.a(this.f35275a, c3441a.f35275a) && io.sentry.util.n.a(this.f35276b, c3441a.f35276b) && io.sentry.util.n.a(this.f35277c, c3441a.f35277c) && io.sentry.util.n.a(this.f35278d, c3441a.f35278d) && io.sentry.util.n.a(this.f35279e, c3441a.f35279e) && io.sentry.util.n.a(this.f35280f, c3441a.f35280f) && io.sentry.util.n.a(this.f35281g, c3441a.f35281g);
    }

    public int hashCode() {
        return io.sentry.util.n.b(this.f35275a, this.f35276b, this.f35277c, this.f35278d, this.f35279e, this.f35280f, this.f35281g);
    }

    public Boolean j() {
        return this.f35283i;
    }

    public void k(String str) {
        this.f35281g = str;
    }

    public void l(String str) {
        this.f35275a = str;
    }

    public void m(String str) {
        this.f35279e = str;
    }

    public void n(Date date) {
        this.f35276b = date;
    }

    public void o(String str) {
        this.f35280f = str;
    }

    public void p(Boolean bool) {
        this.f35283i = bool;
    }

    public void q(Map map) {
        this.f35282h = map;
    }

    public void r(Map map) {
        this.f35284j = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35275a != null) {
            a02.k("app_identifier").b(this.f35275a);
        }
        if (this.f35276b != null) {
            a02.k("app_start_time").g(iLogger, this.f35276b);
        }
        if (this.f35277c != null) {
            a02.k("device_app_hash").b(this.f35277c);
        }
        if (this.f35278d != null) {
            a02.k("build_type").b(this.f35278d);
        }
        if (this.f35279e != null) {
            a02.k("app_name").b(this.f35279e);
        }
        if (this.f35280f != null) {
            a02.k("app_version").b(this.f35280f);
        }
        if (this.f35281g != null) {
            a02.k("app_build").b(this.f35281g);
        }
        Map map = this.f35282h;
        if (map != null && !map.isEmpty()) {
            a02.k("permissions").g(iLogger, this.f35282h);
        }
        if (this.f35283i != null) {
            a02.k("in_foreground").h(this.f35283i);
        }
        Map map2 = this.f35284j;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                a02.k(str).g(iLogger, this.f35284j.get(str));
            }
        }
        a02.d();
    }

    C3441a(C3441a c3441a) {
        this.f35281g = c3441a.f35281g;
        this.f35275a = c3441a.f35275a;
        this.f35279e = c3441a.f35279e;
        this.f35276b = c3441a.f35276b;
        this.f35280f = c3441a.f35280f;
        this.f35278d = c3441a.f35278d;
        this.f35277c = c3441a.f35277c;
        this.f35282h = io.sentry.util.b.b(c3441a.f35282h);
        this.f35283i = c3441a.f35283i;
        this.f35284j = io.sentry.util.b.b(c3441a.f35284j);
    }
}
