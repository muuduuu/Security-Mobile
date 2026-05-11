package io.sentry.profilemeasurements;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.Z;
import io.sentry.profilemeasurements.b;
import io.sentry.util.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class a implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private Map f35245a;

    /* renamed from: b, reason: collision with root package name */
    private String f35246b;

    /* renamed from: c, reason: collision with root package name */
    private Collection f35247c;

    /* renamed from: io.sentry.profilemeasurements.a$a, reason: collision with other inner class name */
    public static final class C0510a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(C3409f0 c3409f0, ILogger iLogger) {
            c3409f0.b();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                String r10 = c3409f0.r();
                r10.hashCode();
                if (r10.equals("values")) {
                    List l12 = c3409f0.l1(iLogger, new b.a());
                    if (l12 != null) {
                        aVar.f35247c = l12;
                    }
                } else if (r10.equals("unit")) {
                    String x12 = c3409f0.x1();
                    if (x12 != null) {
                        aVar.f35246b = x12;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c3409f0.z1(iLogger, concurrentHashMap, r10);
                }
            }
            aVar.c(concurrentHashMap);
            c3409f0.g();
            return aVar;
        }
    }

    public a() {
        this("unknown", new ArrayList());
    }

    public void c(Map map) {
        this.f35245a = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return n.a(this.f35245a, aVar.f35245a) && this.f35246b.equals(aVar.f35246b) && new ArrayList(this.f35247c).equals(new ArrayList(aVar.f35247c));
    }

    public int hashCode() {
        return n.b(this.f35245a, this.f35246b, this.f35247c);
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        a02.k("unit").g(iLogger, this.f35246b);
        a02.k("values").g(iLogger, this.f35247c);
        Map map = this.f35245a;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f35245a.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }

    public a(String str, Collection collection) {
        this.f35246b = str;
        this.f35247c = collection;
    }
}
