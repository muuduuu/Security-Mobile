package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.Z;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class n implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private String f35386a;

    /* renamed from: b, reason: collision with root package name */
    private Map f35387b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f35388c;

    /* renamed from: d, reason: collision with root package name */
    private Long f35389d;

    /* renamed from: e, reason: collision with root package name */
    private Object f35390e;

    /* renamed from: f, reason: collision with root package name */
    private Map f35391f;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            c3409f0.b();
            n nVar = new n();
            ConcurrentHashMap concurrentHashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "status_code":
                        nVar.f35388c = c3409f0.i1();
                        break;
                    case "data":
                        nVar.f35390e = c3409f0.t1();
                        break;
                    case "headers":
                        Map map = (Map) c3409f0.t1();
                        if (map == null) {
                            break;
                        } else {
                            nVar.f35387b = io.sentry.util.b.b(map);
                            break;
                        }
                    case "cookies":
                        nVar.f35386a = c3409f0.x1();
                        break;
                    case "body_size":
                        nVar.f35389d = c3409f0.m1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c3409f0.z1(iLogger, concurrentHashMap, r10);
                        break;
                }
            }
            nVar.f(concurrentHashMap);
            c3409f0.g();
            return nVar;
        }
    }

    public n() {
    }

    public void f(Map map) {
        this.f35391f = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35386a != null) {
            a02.k("cookies").b(this.f35386a);
        }
        if (this.f35387b != null) {
            a02.k("headers").g(iLogger, this.f35387b);
        }
        if (this.f35388c != null) {
            a02.k("status_code").g(iLogger, this.f35388c);
        }
        if (this.f35389d != null) {
            a02.k("body_size").g(iLogger, this.f35389d);
        }
        if (this.f35390e != null) {
            a02.k("data").g(iLogger, this.f35390e);
        }
        Map map = this.f35391f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f35391f.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }

    public n(n nVar) {
        this.f35386a = nVar.f35386a;
        this.f35387b = io.sentry.util.b.b(nVar.f35387b);
        this.f35391f = io.sentry.util.b.b(nVar.f35391f);
        this.f35388c = nVar.f35388c;
        this.f35389d = nVar.f35389d;
        this.f35390e = nVar.f35390e;
    }
}
