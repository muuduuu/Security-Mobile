package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.Z;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class m implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private String f35374a;

    /* renamed from: b, reason: collision with root package name */
    private String f35375b;

    /* renamed from: c, reason: collision with root package name */
    private String f35376c;

    /* renamed from: d, reason: collision with root package name */
    private Object f35377d;

    /* renamed from: e, reason: collision with root package name */
    private String f35378e;

    /* renamed from: f, reason: collision with root package name */
    private Map f35379f;

    /* renamed from: g, reason: collision with root package name */
    private Map f35380g;

    /* renamed from: h, reason: collision with root package name */
    private Long f35381h;

    /* renamed from: i, reason: collision with root package name */
    private Map f35382i;

    /* renamed from: j, reason: collision with root package name */
    private String f35383j;

    /* renamed from: k, reason: collision with root package name */
    private String f35384k;

    /* renamed from: l, reason: collision with root package name */
    private Map f35385l;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            c3409f0.b();
            m mVar = new m();
            ConcurrentHashMap concurrentHashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "fragment":
                        mVar.f35383j = c3409f0.x1();
                        break;
                    case "method":
                        mVar.f35375b = c3409f0.x1();
                        break;
                    case "env":
                        Map map = (Map) c3409f0.t1();
                        if (map == null) {
                            break;
                        } else {
                            mVar.f35380g = io.sentry.util.b.b(map);
                            break;
                        }
                    case "url":
                        mVar.f35374a = c3409f0.x1();
                        break;
                    case "data":
                        mVar.f35377d = c3409f0.t1();
                        break;
                    case "other":
                        Map map2 = (Map) c3409f0.t1();
                        if (map2 == null) {
                            break;
                        } else {
                            mVar.f35382i = io.sentry.util.b.b(map2);
                            break;
                        }
                    case "headers":
                        Map map3 = (Map) c3409f0.t1();
                        if (map3 == null) {
                            break;
                        } else {
                            mVar.f35379f = io.sentry.util.b.b(map3);
                            break;
                        }
                    case "cookies":
                        mVar.f35378e = c3409f0.x1();
                        break;
                    case "body_size":
                        mVar.f35381h = c3409f0.m1();
                        break;
                    case "query_string":
                        mVar.f35376c = c3409f0.x1();
                        break;
                    case "api_target":
                        mVar.f35384k = c3409f0.x1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c3409f0.z1(iLogger, concurrentHashMap, r10);
                        break;
                }
            }
            mVar.m(concurrentHashMap);
            c3409f0.g();
            return mVar;
        }
    }

    public m() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return io.sentry.util.n.a(this.f35374a, mVar.f35374a) && io.sentry.util.n.a(this.f35375b, mVar.f35375b) && io.sentry.util.n.a(this.f35376c, mVar.f35376c) && io.sentry.util.n.a(this.f35378e, mVar.f35378e) && io.sentry.util.n.a(this.f35379f, mVar.f35379f) && io.sentry.util.n.a(this.f35380g, mVar.f35380g) && io.sentry.util.n.a(this.f35381h, mVar.f35381h) && io.sentry.util.n.a(this.f35383j, mVar.f35383j) && io.sentry.util.n.a(this.f35384k, mVar.f35384k);
    }

    public int hashCode() {
        return io.sentry.util.n.b(this.f35374a, this.f35375b, this.f35376c, this.f35378e, this.f35379f, this.f35380g, this.f35381h, this.f35383j, this.f35384k);
    }

    public Map l() {
        return this.f35379f;
    }

    public void m(Map map) {
        this.f35385l = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35374a != null) {
            a02.k("url").b(this.f35374a);
        }
        if (this.f35375b != null) {
            a02.k("method").b(this.f35375b);
        }
        if (this.f35376c != null) {
            a02.k("query_string").b(this.f35376c);
        }
        if (this.f35377d != null) {
            a02.k("data").g(iLogger, this.f35377d);
        }
        if (this.f35378e != null) {
            a02.k("cookies").b(this.f35378e);
        }
        if (this.f35379f != null) {
            a02.k("headers").g(iLogger, this.f35379f);
        }
        if (this.f35380g != null) {
            a02.k("env").g(iLogger, this.f35380g);
        }
        if (this.f35382i != null) {
            a02.k("other").g(iLogger, this.f35382i);
        }
        if (this.f35383j != null) {
            a02.k("fragment").g(iLogger, this.f35383j);
        }
        if (this.f35381h != null) {
            a02.k("body_size").g(iLogger, this.f35381h);
        }
        if (this.f35384k != null) {
            a02.k("api_target").g(iLogger, this.f35384k);
        }
        Map map = this.f35385l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f35385l.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }

    public m(m mVar) {
        this.f35374a = mVar.f35374a;
        this.f35378e = mVar.f35378e;
        this.f35375b = mVar.f35375b;
        this.f35376c = mVar.f35376c;
        this.f35379f = io.sentry.util.b.b(mVar.f35379f);
        this.f35380g = io.sentry.util.b.b(mVar.f35380g);
        this.f35382i = io.sentry.util.b.b(mVar.f35382i);
        this.f35385l = io.sentry.util.b.b(mVar.f35385l);
        this.f35377d = mVar.f35377d;
        this.f35383j = mVar.f35383j;
        this.f35381h = mVar.f35381h;
        this.f35384k = mVar.f35384k;
    }
}
