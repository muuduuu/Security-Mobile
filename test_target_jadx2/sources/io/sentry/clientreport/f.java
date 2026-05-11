package io.sentry.clientreport;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.K1;
import io.sentry.Z;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class f implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f35073a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35074b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f35075c;

    /* renamed from: d, reason: collision with root package name */
    private Map f35076d;

    public static final class a implements Z {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(K1.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            c3409f0.b();
            String str = null;
            String str2 = null;
            Long l10 = null;
            HashMap hashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "quantity":
                        l10 = c3409f0.m1();
                        break;
                    case "reason":
                        str = c3409f0.x1();
                        break;
                    case "category":
                        str2 = c3409f0.x1();
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
            if (str == null) {
                throw c("reason", iLogger);
            }
            if (str2 == null) {
                throw c("category", iLogger);
            }
            if (l10 == null) {
                throw c("quantity", iLogger);
            }
            f fVar = new f(str, str2, l10);
            fVar.d(hashMap);
            return fVar;
        }
    }

    public f(String str, String str2, Long l10) {
        this.f35073a = str;
        this.f35074b = str2;
        this.f35075c = l10;
    }

    public String a() {
        return this.f35074b;
    }

    public Long b() {
        return this.f35075c;
    }

    public String c() {
        return this.f35073a;
    }

    public void d(Map map) {
        this.f35076d = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        a02.k("reason").b(this.f35073a);
        a02.k("category").b(this.f35074b);
        a02.k("quantity").e(this.f35075c);
        Map map = this.f35076d;
        if (map != null) {
            for (String str : map.keySet()) {
                a02.k(str).g(iLogger, this.f35076d.get(str));
            }
        }
        a02.d();
    }

    public String toString() {
        return "DiscardedEvent{reason='" + this.f35073a + "', category='" + this.f35074b + "', quantity=" + this.f35075c + '}';
    }
}
