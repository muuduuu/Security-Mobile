package io.sentry;

import io.sentry.protocol.r;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class t2 implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.r f35496a;

    /* renamed from: b, reason: collision with root package name */
    private String f35497b;

    /* renamed from: c, reason: collision with root package name */
    private String f35498c;

    /* renamed from: d, reason: collision with root package name */
    private String f35499d;

    /* renamed from: e, reason: collision with root package name */
    private Map f35500e;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t2 a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            c3409f0.b();
            io.sentry.protocol.r rVar = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            HashMap hashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "comments":
                        str3 = c3409f0.x1();
                        break;
                    case "name":
                        str = c3409f0.x1();
                        break;
                    case "email":
                        str2 = c3409f0.x1();
                        break;
                    case "event_id":
                        rVar = new r.a().a(c3409f0, iLogger);
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
            if (rVar != null) {
                t2 t2Var = new t2(rVar, str, str2, str3);
                t2Var.a(hashMap);
                return t2Var;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"event_id\"");
            iLogger.b(K1.ERROR, "Missing required field \"event_id\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public t2(io.sentry.protocol.r rVar, String str, String str2, String str3) {
        this.f35496a = rVar;
        this.f35497b = str;
        this.f35498c = str2;
        this.f35499d = str3;
    }

    public void a(Map map) {
        this.f35500e = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        a02.k("event_id");
        this.f35496a.serialize(a02, iLogger);
        if (this.f35497b != null) {
            a02.k("name").b(this.f35497b);
        }
        if (this.f35498c != null) {
            a02.k("email").b(this.f35498c);
        }
        if (this.f35499d != null) {
            a02.k("comments").b(this.f35499d);
        }
        Map map = this.f35500e;
        if (map != null) {
            for (String str : map.keySet()) {
                a02.k(str).g(iLogger, this.f35500e.get(str));
            }
        }
        a02.d();
    }

    public String toString() {
        return "UserFeedback{eventId=" + this.f35496a + ", name='" + this.f35497b + "', email='" + this.f35498c + "', comments='" + this.f35499d + "'}";
    }
}
