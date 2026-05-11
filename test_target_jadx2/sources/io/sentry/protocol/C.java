package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.Z;
import io.sentry.protocol.D;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class C implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f35260a;

    /* renamed from: b, reason: collision with root package name */
    private final List f35261b;

    /* renamed from: c, reason: collision with root package name */
    private Map f35262c;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C a(C3409f0 c3409f0, ILogger iLogger) {
            c3409f0.b();
            String str = null;
            List list = null;
            HashMap hashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                String r10 = c3409f0.r();
                r10.hashCode();
                if (r10.equals("rendering_system")) {
                    str = c3409f0.x1();
                } else if (r10.equals("windows")) {
                    list = c3409f0.l1(iLogger, new D.a());
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    c3409f0.z1(iLogger, hashMap, r10);
                }
            }
            c3409f0.g();
            C c10 = new C(str, list);
            c10.a(hashMap);
            return c10;
        }
    }

    public C(String str, List list) {
        this.f35260a = str;
        this.f35261b = list;
    }

    public void a(Map map) {
        this.f35262c = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35260a != null) {
            a02.k("rendering_system").b(this.f35260a);
        }
        if (this.f35261b != null) {
            a02.k("windows").g(iLogger, this.f35261b);
        }
        Map map = this.f35262c;
        if (map != null) {
            for (String str : map.keySet()) {
                a02.k(str).g(iLogger, this.f35262c.get(str));
            }
        }
        a02.d();
    }
}
