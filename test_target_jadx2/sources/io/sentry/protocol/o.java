package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.Z;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private String f35392a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f35393b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f35394c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f35395d;

    /* renamed from: e, reason: collision with root package name */
    private Map f35396e;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            o oVar = new o();
            c3409f0.b();
            HashMap hashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "sdk_name":
                        oVar.f35392a = c3409f0.x1();
                        break;
                    case "version_patchlevel":
                        oVar.f35395d = c3409f0.i1();
                        break;
                    case "version_major":
                        oVar.f35393b = c3409f0.i1();
                        break;
                    case "version_minor":
                        oVar.f35394c = c3409f0.i1();
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
            oVar.e(hashMap);
            return oVar;
        }
    }

    public void e(Map map) {
        this.f35396e = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35392a != null) {
            a02.k("sdk_name").b(this.f35392a);
        }
        if (this.f35393b != null) {
            a02.k("version_major").e(this.f35393b);
        }
        if (this.f35394c != null) {
            a02.k("version_minor").e(this.f35394c);
        }
        if (this.f35395d != null) {
            a02.k("version_patchlevel").e(this.f35395d);
        }
        Map map = this.f35396e;
        if (map != null) {
            for (String str : map.keySet()) {
                a02.k(str).g(iLogger, this.f35396e.get(str));
            }
        }
        a02.d();
    }
}
