package io.sentry.profilemeasurements;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.Z;
import io.sentry.util.n;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class b implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private Map f35248a;

    /* renamed from: b, reason: collision with root package name */
    private String f35249b;

    /* renamed from: c, reason: collision with root package name */
    private double f35250c;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(C3409f0 c3409f0, ILogger iLogger) {
            c3409f0.b();
            b bVar = new b();
            ConcurrentHashMap concurrentHashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                String r10 = c3409f0.r();
                r10.hashCode();
                if (r10.equals("elapsed_since_start_ns")) {
                    String x12 = c3409f0.x1();
                    if (x12 != null) {
                        bVar.f35249b = x12;
                    }
                } else if (r10.equals("value")) {
                    Double Z02 = c3409f0.Z0();
                    if (Z02 != null) {
                        bVar.f35250c = Z02.doubleValue();
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c3409f0.z1(iLogger, concurrentHashMap, r10);
                }
            }
            bVar.c(concurrentHashMap);
            c3409f0.g();
            return bVar;
        }
    }

    public b() {
        this(0L, 0);
    }

    public void c(Map map) {
        this.f35248a = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return n.a(this.f35248a, bVar.f35248a) && this.f35249b.equals(bVar.f35249b) && this.f35250c == bVar.f35250c;
    }

    public int hashCode() {
        return n.b(this.f35248a, this.f35249b, Double.valueOf(this.f35250c));
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        a02.k("value").g(iLogger, Double.valueOf(this.f35250c));
        a02.k("elapsed_since_start_ns").g(iLogger, this.f35249b);
        Map map = this.f35248a;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f35248a.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }

    public b(Long l10, Number number) {
        this.f35249b = l10.toString();
        this.f35250c = number.doubleValue();
    }
}
