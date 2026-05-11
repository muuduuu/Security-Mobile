package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.Z;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class z implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f35471a;

    /* renamed from: b, reason: collision with root package name */
    private Map f35472b;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public z a(C3409f0 c3409f0, ILogger iLogger) {
            c3409f0.b();
            String str = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                String r10 = c3409f0.r();
                r10.hashCode();
                if (r10.equals("source")) {
                    str = c3409f0.x1();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c3409f0.z1(iLogger, concurrentHashMap, r10);
                }
            }
            z zVar = new z(str);
            zVar.a(concurrentHashMap);
            c3409f0.g();
            return zVar;
        }
    }

    public z(String str) {
        this.f35471a = str;
    }

    public void a(Map map) {
        this.f35472b = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35471a != null) {
            a02.k("source").g(iLogger, this.f35471a);
        }
        Map map = this.f35472b;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f35472b.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }
}
