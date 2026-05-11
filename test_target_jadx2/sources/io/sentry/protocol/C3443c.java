package io.sentry.protocol;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.Z;
import io.sentry.c2;
import io.sentry.protocol.C3441a;
import io.sentry.protocol.C3442b;
import io.sentry.protocol.f;
import io.sentry.protocol.h;
import io.sentry.protocol.l;
import io.sentry.protocol.n;
import io.sentry.protocol.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3443c extends ConcurrentHashMap implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f35288a = new Object();

    /* renamed from: io.sentry.protocol.c$a */
    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3443c a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            C3443c c3443c = new C3443c();
            c3409f0.b();
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "device":
                        c3443c.h(new f.a().a(c3409f0, iLogger));
                        break;
                    case "response":
                        c3443c.l(new n.a().a(c3409f0, iLogger));
                        break;
                    case "os":
                        c3443c.j(new l.a().a(c3409f0, iLogger));
                        break;
                    case "app":
                        c3443c.f(new C3441a.C0511a().a(c3409f0, iLogger));
                        break;
                    case "gpu":
                        c3443c.i(new h.a().a(c3409f0, iLogger));
                        break;
                    case "trace":
                        c3443c.n(new c2.a().a(c3409f0, iLogger));
                        break;
                    case "browser":
                        c3443c.g(new C3442b.a().a(c3409f0, iLogger));
                        break;
                    case "runtime":
                        c3443c.m(new t.a().a(c3409f0, iLogger));
                        break;
                    default:
                        Object t12 = c3409f0.t1();
                        if (t12 == null) {
                            break;
                        } else {
                            c3443c.put(r10, t12);
                            break;
                        }
                }
            }
            c3409f0.g();
            return c3443c;
        }
    }

    public C3443c() {
    }

    private Object o(String str, Class cls) {
        Object obj = get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    public C3441a a() {
        return (C3441a) o("app", C3441a.class);
    }

    public f b() {
        return (f) o("device", f.class);
    }

    public l c() {
        return (l) o("os", l.class);
    }

    public t d() {
        return (t) o("runtime", t.class);
    }

    public c2 e() {
        return (c2) o("trace", c2.class);
    }

    public void f(C3441a c3441a) {
        put("app", c3441a);
    }

    public void g(C3442b c3442b) {
        put("browser", c3442b);
    }

    public void h(f fVar) {
        put("device", fVar);
    }

    public void i(h hVar) {
        put("gpu", hVar);
    }

    public void j(l lVar) {
        put("os", lVar);
    }

    public void l(n nVar) {
        synchronized (this.f35288a) {
            put(Keys.RESPONSE, nVar);
        }
    }

    public void m(t tVar) {
        put("runtime", tVar);
    }

    public void n(c2 c2Var) {
        io.sentry.util.n.c(c2Var, "traceContext is required");
        put("trace", c2Var);
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        ArrayList<String> list = Collections.list(keys());
        Collections.sort(list);
        for (String str : list) {
            Object obj = get(str);
            if (obj != null) {
                a02.k(str).g(iLogger, obj);
            }
        }
        a02.d();
    }

    public C3443c(C3443c c3443c) {
        Iterator it = c3443c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof C3441a)) {
                    f(new C3441a((C3441a) value));
                } else if ("browser".equals(entry.getKey()) && (value instanceof C3442b)) {
                    g(new C3442b((C3442b) value));
                } else if ("device".equals(entry.getKey()) && (value instanceof f)) {
                    h(new f((f) value));
                } else if ("os".equals(entry.getKey()) && (value instanceof l)) {
                    j(new l((l) value));
                } else if ("runtime".equals(entry.getKey()) && (value instanceof t)) {
                    m(new t((t) value));
                } else if ("gpu".equals(entry.getKey()) && (value instanceof h)) {
                    i(new h((h) value));
                } else if ("trace".equals(entry.getKey()) && (value instanceof c2)) {
                    n(new c2((c2) value));
                } else if (Keys.RESPONSE.equals(entry.getKey()) && (value instanceof n)) {
                    l(new n((n) value));
                } else {
                    put((String) entry.getKey(), value);
                }
            }
        }
    }
}
