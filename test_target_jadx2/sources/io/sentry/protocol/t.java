package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.Z;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class t implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private String f35414a;

    /* renamed from: b, reason: collision with root package name */
    private String f35415b;

    /* renamed from: c, reason: collision with root package name */
    private String f35416c;

    /* renamed from: d, reason: collision with root package name */
    private Map f35417d;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            c3409f0.b();
            t tVar = new t();
            ConcurrentHashMap concurrentHashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "raw_description":
                        tVar.f35416c = c3409f0.x1();
                        break;
                    case "name":
                        tVar.f35414a = c3409f0.x1();
                        break;
                    case "version":
                        tVar.f35415b = c3409f0.x1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c3409f0.z1(iLogger, concurrentHashMap, r10);
                        break;
                }
            }
            tVar.g(concurrentHashMap);
            c3409f0.g();
            return tVar;
        }
    }

    public t() {
    }

    public String d() {
        return this.f35414a;
    }

    public String e() {
        return this.f35415b;
    }

    public void f(String str) {
        this.f35414a = str;
    }

    public void g(Map map) {
        this.f35417d = map;
    }

    public void h(String str) {
        this.f35415b = str;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35414a != null) {
            a02.k("name").b(this.f35414a);
        }
        if (this.f35415b != null) {
            a02.k("version").b(this.f35415b);
        }
        if (this.f35416c != null) {
            a02.k("raw_description").b(this.f35416c);
        }
        Map map = this.f35417d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f35417d.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }

    t(t tVar) {
        this.f35414a = tVar.f35414a;
        this.f35415b = tVar.f35415b;
        this.f35416c = tVar.f35416c;
        this.f35417d = io.sentry.util.b.b(tVar.f35417d);
    }
}
