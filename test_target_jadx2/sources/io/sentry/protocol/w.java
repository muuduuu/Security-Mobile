package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.Z;
import io.sentry.protocol.v;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class w implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private List f35448a;

    /* renamed from: b, reason: collision with root package name */
    private Map f35449b;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f35450c;

    /* renamed from: d, reason: collision with root package name */
    private Map f35451d;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public w a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            w wVar = new w();
            c3409f0.b();
            ConcurrentHashMap concurrentHashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "frames":
                        wVar.f35448a = c3409f0.l1(iLogger, new v.a());
                        break;
                    case "registers":
                        wVar.f35449b = io.sentry.util.b.b((Map) c3409f0.t1());
                        break;
                    case "snapshot":
                        wVar.f35450c = c3409f0.A0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c3409f0.z1(iLogger, concurrentHashMap, r10);
                        break;
                }
            }
            wVar.f(concurrentHashMap);
            c3409f0.g();
            return wVar;
        }
    }

    public w() {
    }

    public List d() {
        return this.f35448a;
    }

    public void e(Boolean bool) {
        this.f35450c = bool;
    }

    public void f(Map map) {
        this.f35451d = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35448a != null) {
            a02.k("frames").g(iLogger, this.f35448a);
        }
        if (this.f35449b != null) {
            a02.k("registers").g(iLogger, this.f35449b);
        }
        if (this.f35450c != null) {
            a02.k("snapshot").h(this.f35450c);
        }
        Map map = this.f35451d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f35451d.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }

    public w(List list) {
        this.f35448a = list;
    }
}
