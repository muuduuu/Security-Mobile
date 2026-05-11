package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.Z;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class k implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private String f35363a;

    /* renamed from: b, reason: collision with root package name */
    private String f35364b;

    /* renamed from: c, reason: collision with root package name */
    private List f35365c;

    /* renamed from: d, reason: collision with root package name */
    private Map f35366d;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            c3409f0.b();
            k kVar = new k();
            ConcurrentHashMap concurrentHashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "params":
                        List list = (List) c3409f0.t1();
                        if (list == null) {
                            break;
                        } else {
                            kVar.f35365c = list;
                            break;
                        }
                    case "message":
                        kVar.f35364b = c3409f0.x1();
                        break;
                    case "formatted":
                        kVar.f35363a = c3409f0.x1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c3409f0.z1(iLogger, concurrentHashMap, r10);
                        break;
                }
            }
            kVar.e(concurrentHashMap);
            c3409f0.g();
            return kVar;
        }
    }

    public void d(String str) {
        this.f35363a = str;
    }

    public void e(Map map) {
        this.f35366d = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35363a != null) {
            a02.k("formatted").b(this.f35363a);
        }
        if (this.f35364b != null) {
            a02.k("message").b(this.f35364b);
        }
        List list = this.f35365c;
        if (list != null && !list.isEmpty()) {
            a02.k("params").g(iLogger, this.f35365c);
        }
        Map map = this.f35366d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f35366d.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }
}
