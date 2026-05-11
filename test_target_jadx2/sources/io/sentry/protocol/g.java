package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.Z;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class g implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private String f35337a;

    /* renamed from: b, reason: collision with root package name */
    private String f35338b;

    /* renamed from: c, reason: collision with root package name */
    private String f35339c;

    /* renamed from: d, reason: collision with root package name */
    private Map f35340d;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            c3409f0.b();
            g gVar = new g();
            ConcurrentHashMap concurrentHashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "region":
                        gVar.f35339c = c3409f0.x1();
                        break;
                    case "city":
                        gVar.f35337a = c3409f0.x1();
                        break;
                    case "country_code":
                        gVar.f35338b = c3409f0.x1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c3409f0.z1(iLogger, concurrentHashMap, r10);
                        break;
                }
            }
            gVar.d(concurrentHashMap);
            c3409f0.g();
            return gVar;
        }
    }

    public void d(Map map) {
        this.f35340d = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35337a != null) {
            a02.k("city").b(this.f35337a);
        }
        if (this.f35338b != null) {
            a02.k("country_code").b(this.f35338b);
        }
        if (this.f35339c != null) {
            a02.k("region").b(this.f35339c);
        }
        Map map = this.f35340d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f35340d.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }
}
