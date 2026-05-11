package io.sentry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class L1 implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private int f34513a;

    /* renamed from: b, reason: collision with root package name */
    private String f34514b;

    /* renamed from: c, reason: collision with root package name */
    private String f34515c;

    /* renamed from: d, reason: collision with root package name */
    private String f34516d;

    /* renamed from: e, reason: collision with root package name */
    private Long f34517e;

    /* renamed from: f, reason: collision with root package name */
    private Map f34518f;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public L1 a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            L1 l12 = new L1();
            c3409f0.b();
            ConcurrentHashMap concurrentHashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "package_name":
                        l12.f34515c = c3409f0.x1();
                        break;
                    case "thread_id":
                        l12.f34517e = c3409f0.m1();
                        break;
                    case "address":
                        l12.f34514b = c3409f0.x1();
                        break;
                    case "class_name":
                        l12.f34516d = c3409f0.x1();
                        break;
                    case "type":
                        l12.f34513a = c3409f0.p();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c3409f0.z1(iLogger, concurrentHashMap, r10);
                        break;
                }
            }
            l12.m(concurrentHashMap);
            c3409f0.g();
            return l12;
        }
    }

    public L1() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || L1.class != obj.getClass()) {
            return false;
        }
        return io.sentry.util.n.a(this.f34514b, ((L1) obj).f34514b);
    }

    public String f() {
        return this.f34514b;
    }

    public int g() {
        return this.f34513a;
    }

    public void h(String str) {
        this.f34514b = str;
    }

    public int hashCode() {
        return io.sentry.util.n.b(this.f34514b);
    }

    public void i(String str) {
        this.f34516d = str;
    }

    public void j(String str) {
        this.f34515c = str;
    }

    public void k(Long l10) {
        this.f34517e = l10;
    }

    public void l(int i10) {
        this.f34513a = i10;
    }

    public void m(Map map) {
        this.f34518f = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        a02.k("type").a(this.f34513a);
        if (this.f34514b != null) {
            a02.k("address").b(this.f34514b);
        }
        if (this.f34515c != null) {
            a02.k("package_name").b(this.f34515c);
        }
        if (this.f34516d != null) {
            a02.k("class_name").b(this.f34516d);
        }
        if (this.f34517e != null) {
            a02.k("thread_id").e(this.f34517e);
        }
        Map map = this.f34518f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f34518f.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }

    public L1(L1 l12) {
        this.f34513a = l12.f34513a;
        this.f34514b = l12.f34514b;
        this.f34515c = l12.f34515c;
        this.f34516d = l12.f34516d;
        this.f34517e = l12.f34517e;
        this.f34518f = io.sentry.util.b.b(l12.f34518f);
    }
}
