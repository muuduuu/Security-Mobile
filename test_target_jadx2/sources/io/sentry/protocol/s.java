package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.K1;
import io.sentry.Z;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class s implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private String f35411a;

    /* renamed from: b, reason: collision with root package name */
    private String f35412b;

    /* renamed from: c, reason: collision with root package name */
    private Map f35413c;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s a(C3409f0 c3409f0, ILogger iLogger) {
            c3409f0.b();
            String str = null;
            String str2 = null;
            HashMap hashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                String r10 = c3409f0.r();
                r10.hashCode();
                if (r10.equals("name")) {
                    str = c3409f0.x();
                } else if (r10.equals("version")) {
                    str2 = c3409f0.x();
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    c3409f0.z1(iLogger, hashMap, r10);
                }
            }
            c3409f0.g();
            if (str == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                iLogger.b(K1.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (str2 != null) {
                s sVar = new s(str, str2);
                sVar.a(hashMap);
                return sVar;
            }
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
            iLogger.b(K1.ERROR, "Missing required field \"version\"", illegalStateException2);
            throw illegalStateException2;
        }
    }

    public s(String str, String str2) {
        this.f35411a = (String) io.sentry.util.n.c(str, "name is required.");
        this.f35412b = (String) io.sentry.util.n.c(str2, "version is required.");
    }

    public void a(Map map) {
        this.f35413c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return Objects.equals(this.f35411a, sVar.f35411a) && Objects.equals(this.f35412b, sVar.f35412b);
    }

    public int hashCode() {
        return Objects.hash(this.f35411a, this.f35412b);
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        a02.k("name").b(this.f35411a);
        a02.k("version").b(this.f35412b);
        Map map = this.f35413c;
        if (map != null) {
            for (String str : map.keySet()) {
                a02.k(str).g(iLogger, this.f35413c.get(str));
            }
        }
        a02.d();
    }
}
