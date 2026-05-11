package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.Z;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class j implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private final transient Thread f35354a;

    /* renamed from: b, reason: collision with root package name */
    private String f35355b;

    /* renamed from: c, reason: collision with root package name */
    private String f35356c;

    /* renamed from: d, reason: collision with root package name */
    private String f35357d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f35358e;

    /* renamed from: f, reason: collision with root package name */
    private Map f35359f;

    /* renamed from: g, reason: collision with root package name */
    private Map f35360g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f35361h;

    /* renamed from: i, reason: collision with root package name */
    private Map f35362i;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            j jVar = new j();
            c3409f0.b();
            HashMap hashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "description":
                        jVar.f35356c = c3409f0.x1();
                        break;
                    case "data":
                        jVar.f35360g = io.sentry.util.b.b((Map) c3409f0.t1());
                        break;
                    case "meta":
                        jVar.f35359f = io.sentry.util.b.b((Map) c3409f0.t1());
                        break;
                    case "type":
                        jVar.f35355b = c3409f0.x1();
                        break;
                    case "handled":
                        jVar.f35358e = c3409f0.A0();
                        break;
                    case "synthetic":
                        jVar.f35361h = c3409f0.A0();
                        break;
                    case "help_link":
                        jVar.f35357d = c3409f0.x1();
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
            jVar.k(hashMap);
            return jVar;
        }
    }

    public j() {
        this(null);
    }

    public Boolean h() {
        return this.f35358e;
    }

    public void i(Boolean bool) {
        this.f35358e = bool;
    }

    public void j(String str) {
        this.f35355b = str;
    }

    public void k(Map map) {
        this.f35362i = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35355b != null) {
            a02.k("type").b(this.f35355b);
        }
        if (this.f35356c != null) {
            a02.k("description").b(this.f35356c);
        }
        if (this.f35357d != null) {
            a02.k("help_link").b(this.f35357d);
        }
        if (this.f35358e != null) {
            a02.k("handled").h(this.f35358e);
        }
        if (this.f35359f != null) {
            a02.k("meta").g(iLogger, this.f35359f);
        }
        if (this.f35360g != null) {
            a02.k("data").g(iLogger, this.f35360g);
        }
        if (this.f35361h != null) {
            a02.k("synthetic").h(this.f35361h);
        }
        Map map = this.f35362i;
        if (map != null) {
            for (String str : map.keySet()) {
                a02.k(str).g(iLogger, this.f35362i.get(str));
            }
        }
        a02.d();
    }

    public j(Thread thread) {
        this.f35354a = thread;
    }
}
