package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.Z;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3442b implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private String f35285a;

    /* renamed from: b, reason: collision with root package name */
    private String f35286b;

    /* renamed from: c, reason: collision with root package name */
    private Map f35287c;

    /* renamed from: io.sentry.protocol.b$a */
    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3442b a(C3409f0 c3409f0, ILogger iLogger) {
            c3409f0.b();
            C3442b c3442b = new C3442b();
            ConcurrentHashMap concurrentHashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                String r10 = c3409f0.r();
                r10.hashCode();
                if (r10.equals("name")) {
                    c3442b.f35285a = c3409f0.x1();
                } else if (r10.equals("version")) {
                    c3442b.f35286b = c3409f0.x1();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c3409f0.z1(iLogger, concurrentHashMap, r10);
                }
            }
            c3442b.c(concurrentHashMap);
            c3409f0.g();
            return c3442b;
        }
    }

    public C3442b() {
    }

    public void c(Map map) {
        this.f35287c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3442b.class != obj.getClass()) {
            return false;
        }
        C3442b c3442b = (C3442b) obj;
        return io.sentry.util.n.a(this.f35285a, c3442b.f35285a) && io.sentry.util.n.a(this.f35286b, c3442b.f35286b);
    }

    public int hashCode() {
        return io.sentry.util.n.b(this.f35285a, this.f35286b);
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35285a != null) {
            a02.k("name").b(this.f35285a);
        }
        if (this.f35286b != null) {
            a02.k("version").b(this.f35286b);
        }
        Map map = this.f35287c;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f35287c.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }

    C3442b(C3442b c3442b) {
        this.f35285a = c3442b.f35285a;
        this.f35286b = c3442b.f35286b;
        this.f35287c = io.sentry.util.b.b(c3442b.f35287c);
    }
}
