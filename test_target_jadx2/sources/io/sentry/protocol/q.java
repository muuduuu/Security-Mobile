package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.Z;
import io.sentry.protocol.j;
import io.sentry.protocol.w;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class q implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private String f35402a;

    /* renamed from: b, reason: collision with root package name */
    private String f35403b;

    /* renamed from: c, reason: collision with root package name */
    private String f35404c;

    /* renamed from: d, reason: collision with root package name */
    private Long f35405d;

    /* renamed from: e, reason: collision with root package name */
    private w f35406e;

    /* renamed from: f, reason: collision with root package name */
    private j f35407f;

    /* renamed from: g, reason: collision with root package name */
    private Map f35408g;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            q qVar = new q();
            c3409f0.b();
            HashMap hashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "thread_id":
                        qVar.f35405d = c3409f0.m1();
                        break;
                    case "module":
                        qVar.f35404c = c3409f0.x1();
                        break;
                    case "type":
                        qVar.f35402a = c3409f0.x1();
                        break;
                    case "value":
                        qVar.f35403b = c3409f0.x1();
                        break;
                    case "mechanism":
                        qVar.f35407f = (j) c3409f0.v1(iLogger, new j.a());
                        break;
                    case "stacktrace":
                        qVar.f35406e = (w) c3409f0.v1(iLogger, new w.a());
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        c3409f0.z1(iLogger, hashMap, r10);
                        break;
                }
            }
            c3409f0.g();
            qVar.o(hashMap);
            return qVar;
        }
    }

    public j g() {
        return this.f35407f;
    }

    public Long h() {
        return this.f35405d;
    }

    public String i() {
        return this.f35402a;
    }

    public void j(j jVar) {
        this.f35407f = jVar;
    }

    public void k(String str) {
        this.f35404c = str;
    }

    public void l(w wVar) {
        this.f35406e = wVar;
    }

    public void m(Long l10) {
        this.f35405d = l10;
    }

    public void n(String str) {
        this.f35402a = str;
    }

    public void o(Map map) {
        this.f35408g = map;
    }

    public void p(String str) {
        this.f35403b = str;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35402a != null) {
            a02.k("type").b(this.f35402a);
        }
        if (this.f35403b != null) {
            a02.k("value").b(this.f35403b);
        }
        if (this.f35404c != null) {
            a02.k("module").b(this.f35404c);
        }
        if (this.f35405d != null) {
            a02.k("thread_id").e(this.f35405d);
        }
        if (this.f35406e != null) {
            a02.k("stacktrace").g(iLogger, this.f35406e);
        }
        if (this.f35407f != null) {
            a02.k("mechanism").g(iLogger, this.f35407f);
        }
        Map map = this.f35408g;
        if (map != null) {
            for (String str : map.keySet()) {
                a02.k(str).g(iLogger, this.f35408g.get(str));
            }
        }
        a02.d();
    }
}
