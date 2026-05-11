package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.Z;
import io.sentry.protocol.g;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class B implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private String f35251a;

    /* renamed from: b, reason: collision with root package name */
    private String f35252b;

    /* renamed from: c, reason: collision with root package name */
    private String f35253c;

    /* renamed from: d, reason: collision with root package name */
    private String f35254d;

    /* renamed from: e, reason: collision with root package name */
    private String f35255e;

    /* renamed from: f, reason: collision with root package name */
    private String f35256f;

    /* renamed from: g, reason: collision with root package name */
    private g f35257g;

    /* renamed from: h, reason: collision with root package name */
    private Map f35258h;

    /* renamed from: i, reason: collision with root package name */
    private Map f35259i;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public B a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            c3409f0.b();
            B b10 = new B();
            ConcurrentHashMap concurrentHashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "username":
                        b10.f35253c = c3409f0.x1();
                        break;
                    case "id":
                        b10.f35252b = c3409f0.x1();
                        break;
                    case "geo":
                        b10.f35257g = new g.a().a(c3409f0, iLogger);
                        break;
                    case "data":
                        b10.f35258h = io.sentry.util.b.b((Map) c3409f0.t1());
                        break;
                    case "name":
                        b10.f35256f = c3409f0.x1();
                        break;
                    case "email":
                        b10.f35251a = c3409f0.x1();
                        break;
                    case "other":
                        if (b10.f35258h != null && !b10.f35258h.isEmpty()) {
                            break;
                        } else {
                            b10.f35258h = io.sentry.util.b.b((Map) c3409f0.t1());
                            break;
                        }
                    case "ip_address":
                        b10.f35255e = c3409f0.x1();
                        break;
                    case "segment":
                        b10.f35254d = c3409f0.x1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c3409f0.z1(iLogger, concurrentHashMap, r10);
                        break;
                }
            }
            b10.p(concurrentHashMap);
            c3409f0.g();
            return b10;
        }
    }

    public B() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || B.class != obj.getClass()) {
            return false;
        }
        B b10 = (B) obj;
        return io.sentry.util.n.a(this.f35251a, b10.f35251a) && io.sentry.util.n.a(this.f35252b, b10.f35252b) && io.sentry.util.n.a(this.f35253c, b10.f35253c) && io.sentry.util.n.a(this.f35254d, b10.f35254d) && io.sentry.util.n.a(this.f35255e, b10.f35255e);
    }

    public int hashCode() {
        return io.sentry.util.n.b(this.f35251a, this.f35252b, this.f35253c, this.f35254d, this.f35255e);
    }

    public Map j() {
        return this.f35258h;
    }

    public String k() {
        return this.f35252b;
    }

    public String l() {
        return this.f35255e;
    }

    public String m() {
        return this.f35254d;
    }

    public void n(String str) {
        this.f35252b = str;
    }

    public void o(String str) {
        this.f35255e = str;
    }

    public void p(Map map) {
        this.f35259i = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35251a != null) {
            a02.k("email").b(this.f35251a);
        }
        if (this.f35252b != null) {
            a02.k("id").b(this.f35252b);
        }
        if (this.f35253c != null) {
            a02.k("username").b(this.f35253c);
        }
        if (this.f35254d != null) {
            a02.k("segment").b(this.f35254d);
        }
        if (this.f35255e != null) {
            a02.k("ip_address").b(this.f35255e);
        }
        if (this.f35256f != null) {
            a02.k("name").b(this.f35256f);
        }
        if (this.f35257g != null) {
            a02.k("geo");
            this.f35257g.serialize(a02, iLogger);
        }
        if (this.f35258h != null) {
            a02.k("data").g(iLogger, this.f35258h);
        }
        Map map = this.f35259i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f35259i.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }

    public B(B b10) {
        this.f35251a = b10.f35251a;
        this.f35253c = b10.f35253c;
        this.f35252b = b10.f35252b;
        this.f35255e = b10.f35255e;
        this.f35254d = b10.f35254d;
        this.f35256f = b10.f35256f;
        this.f35257g = b10.f35257g;
        this.f35258h = io.sentry.util.b.b(b10.f35258h);
        this.f35259i = io.sentry.util.b.b(b10.f35259i);
    }
}
