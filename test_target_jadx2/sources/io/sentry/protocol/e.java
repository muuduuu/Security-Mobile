package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.Z;
import io.sentry.protocol.C3444d;
import io.sentry.protocol.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private o f35299a;

    /* renamed from: b, reason: collision with root package name */
    private List f35300b;

    /* renamed from: c, reason: collision with root package name */
    private Map f35301c;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(C3409f0 c3409f0, ILogger iLogger) {
            e eVar = new e();
            c3409f0.b();
            HashMap hashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                String r10 = c3409f0.r();
                r10.hashCode();
                if (r10.equals("images")) {
                    eVar.f35300b = c3409f0.l1(iLogger, new C3444d.a());
                } else if (r10.equals("sdk_info")) {
                    eVar.f35299a = (o) c3409f0.v1(iLogger, new o.a());
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    c3409f0.z1(iLogger, hashMap, r10);
                }
            }
            c3409f0.g();
            eVar.e(hashMap);
            return eVar;
        }
    }

    public List c() {
        return this.f35300b;
    }

    public void d(List list) {
        this.f35300b = list != null ? new ArrayList(list) : null;
    }

    public void e(Map map) {
        this.f35301c = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35299a != null) {
            a02.k("sdk_info").g(iLogger, this.f35299a);
        }
        if (this.f35300b != null) {
            a02.k("images").g(iLogger, this.f35300b);
        }
        Map map = this.f35301c;
        if (map != null) {
            for (String str : map.keySet()) {
                a02.k(str).g(iLogger, this.f35301c.get(str));
            }
        }
        a02.d();
    }
}
