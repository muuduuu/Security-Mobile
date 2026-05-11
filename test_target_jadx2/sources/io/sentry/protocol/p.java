package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.K1;
import io.sentry.Z;
import io.sentry.protocol.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class p implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private String f35397a;

    /* renamed from: b, reason: collision with root package name */
    private String f35398b;

    /* renamed from: c, reason: collision with root package name */
    private Set f35399c;

    /* renamed from: d, reason: collision with root package name */
    private Set f35400d;

    /* renamed from: e, reason: collision with root package name */
    private Map f35401e;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public p a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            c3409f0.b();
            String str = null;
            String str2 = null;
            HashMap hashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "name":
                        str = c3409f0.x();
                        break;
                    case "version":
                        str2 = c3409f0.x();
                        break;
                    case "packages":
                        List l12 = c3409f0.l1(iLogger, new s.a());
                        if (l12 == null) {
                            break;
                        } else {
                            arrayList.addAll(l12);
                            break;
                        }
                    case "integrations":
                        List list = (List) c3409f0.t1();
                        if (list == null) {
                            break;
                        } else {
                            arrayList2.addAll(list);
                            break;
                        }
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
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                iLogger.b(K1.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (str2 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
                iLogger.b(K1.ERROR, "Missing required field \"version\"", illegalStateException2);
                throw illegalStateException2;
            }
            p pVar = new p(str, str2);
            pVar.f35399c = new CopyOnWriteArraySet(arrayList);
            pVar.f35400d = new CopyOnWriteArraySet(arrayList2);
            pVar.i(hashMap);
            return pVar;
        }
    }

    public p(String str, String str2) {
        this.f35397a = (String) io.sentry.util.n.c(str, "name is required.");
        this.f35398b = (String) io.sentry.util.n.c(str2, "version is required.");
    }

    public static p k(p pVar, String str, String str2) {
        io.sentry.util.n.c(str, "name is required.");
        io.sentry.util.n.c(str2, "version is required.");
        if (pVar == null) {
            return new p(str, str2);
        }
        pVar.h(str);
        pVar.j(str2);
        return pVar;
    }

    public void c(String str, String str2) {
        I1.c().b(str, str2);
    }

    public Set d() {
        Set set = this.f35400d;
        return set != null ? set : I1.c().d();
    }

    public String e() {
        return this.f35397a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f35397a.equals(pVar.f35397a) && this.f35398b.equals(pVar.f35398b);
    }

    public Set f() {
        Set set = this.f35399c;
        return set != null ? set : I1.c().e();
    }

    public String g() {
        return this.f35398b;
    }

    public void h(String str) {
        this.f35397a = (String) io.sentry.util.n.c(str, "name is required.");
    }

    public int hashCode() {
        return io.sentry.util.n.b(this.f35397a, this.f35398b);
    }

    public void i(Map map) {
        this.f35401e = map;
    }

    public void j(String str) {
        this.f35398b = (String) io.sentry.util.n.c(str, "version is required.");
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        a02.k("name").b(this.f35397a);
        a02.k("version").b(this.f35398b);
        Set f10 = f();
        Set d10 = d();
        if (!f10.isEmpty()) {
            a02.k("packages").g(iLogger, f10);
        }
        if (!d10.isEmpty()) {
            a02.k("integrations").g(iLogger, d10);
        }
        Map map = this.f35401e;
        if (map != null) {
            for (String str : map.keySet()) {
                a02.k(str).g(iLogger, this.f35401e.get(str));
            }
        }
        a02.d();
    }
}
