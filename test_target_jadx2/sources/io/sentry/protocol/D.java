package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.Z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class D implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private String f35263a;

    /* renamed from: b, reason: collision with root package name */
    private String f35264b;

    /* renamed from: c, reason: collision with root package name */
    private String f35265c;

    /* renamed from: d, reason: collision with root package name */
    private String f35266d;

    /* renamed from: e, reason: collision with root package name */
    private Double f35267e;

    /* renamed from: f, reason: collision with root package name */
    private Double f35268f;

    /* renamed from: g, reason: collision with root package name */
    private Double f35269g;

    /* renamed from: h, reason: collision with root package name */
    private Double f35270h;

    /* renamed from: i, reason: collision with root package name */
    private String f35271i;

    /* renamed from: j, reason: collision with root package name */
    private Double f35272j;

    /* renamed from: k, reason: collision with root package name */
    private List f35273k;

    /* renamed from: l, reason: collision with root package name */
    private Map f35274l;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public D a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            D d10 = new D();
            c3409f0.b();
            HashMap hashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "rendering_system":
                        d10.f35263a = c3409f0.x1();
                        break;
                    case "identifier":
                        d10.f35265c = c3409f0.x1();
                        break;
                    case "height":
                        d10.f35268f = c3409f0.Z0();
                        break;
                    case "x":
                        d10.f35269g = c3409f0.Z0();
                        break;
                    case "y":
                        d10.f35270h = c3409f0.Z0();
                        break;
                    case "tag":
                        d10.f35266d = c3409f0.x1();
                        break;
                    case "type":
                        d10.f35264b = c3409f0.x1();
                        break;
                    case "alpha":
                        d10.f35272j = c3409f0.Z0();
                        break;
                    case "width":
                        d10.f35267e = c3409f0.Z0();
                        break;
                    case "children":
                        d10.f35273k = c3409f0.l1(iLogger, this);
                        break;
                    case "visibility":
                        d10.f35271i = c3409f0.x1();
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
            d10.q(hashMap);
            return d10;
        }
    }

    public void l(Double d10) {
        this.f35272j = d10;
    }

    public void m(List list) {
        this.f35273k = list;
    }

    public void n(Double d10) {
        this.f35268f = d10;
    }

    public void o(String str) {
        this.f35265c = str;
    }

    public void p(String str) {
        this.f35264b = str;
    }

    public void q(Map map) {
        this.f35274l = map;
    }

    public void r(String str) {
        this.f35271i = str;
    }

    public void s(Double d10) {
        this.f35267e = d10;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35263a != null) {
            a02.k("rendering_system").b(this.f35263a);
        }
        if (this.f35264b != null) {
            a02.k("type").b(this.f35264b);
        }
        if (this.f35265c != null) {
            a02.k("identifier").b(this.f35265c);
        }
        if (this.f35266d != null) {
            a02.k("tag").b(this.f35266d);
        }
        if (this.f35267e != null) {
            a02.k("width").e(this.f35267e);
        }
        if (this.f35268f != null) {
            a02.k("height").e(this.f35268f);
        }
        if (this.f35269g != null) {
            a02.k("x").e(this.f35269g);
        }
        if (this.f35270h != null) {
            a02.k("y").e(this.f35270h);
        }
        if (this.f35271i != null) {
            a02.k("visibility").b(this.f35271i);
        }
        if (this.f35272j != null) {
            a02.k("alpha").e(this.f35272j);
        }
        List list = this.f35273k;
        if (list != null && !list.isEmpty()) {
            a02.k("children").g(iLogger, this.f35273k);
        }
        Map map = this.f35274l;
        if (map != null) {
            for (String str : map.keySet()) {
                a02.k(str).g(iLogger, this.f35274l.get(str));
            }
        }
        a02.d();
    }

    public void t(Double d10) {
        this.f35269g = d10;
    }

    public void u(Double d10) {
        this.f35270h = d10;
    }
}
