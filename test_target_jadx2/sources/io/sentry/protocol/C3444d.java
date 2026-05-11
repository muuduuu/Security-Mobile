package io.sentry.protocol;

import co.hyperverge.hypersnapsdk.utils.AppConstants;
import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.Z;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.protocol.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3444d implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private String f35289a;

    /* renamed from: b, reason: collision with root package name */
    private String f35290b;

    /* renamed from: c, reason: collision with root package name */
    private String f35291c;

    /* renamed from: d, reason: collision with root package name */
    private String f35292d;

    /* renamed from: e, reason: collision with root package name */
    private String f35293e;

    /* renamed from: f, reason: collision with root package name */
    private String f35294f;

    /* renamed from: g, reason: collision with root package name */
    private String f35295g;

    /* renamed from: h, reason: collision with root package name */
    private Long f35296h;

    /* renamed from: i, reason: collision with root package name */
    private String f35297i;

    /* renamed from: j, reason: collision with root package name */
    private Map f35298j;

    /* renamed from: io.sentry.protocol.d$a */
    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3444d a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            C3444d c3444d = new C3444d();
            c3409f0.b();
            HashMap hashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "debug_file":
                        c3444d.f35292d = c3409f0.x1();
                        break;
                    case "image_addr":
                        c3444d.f35295g = c3409f0.x1();
                        break;
                    case "image_size":
                        c3444d.f35296h = c3409f0.m1();
                        break;
                    case "code_file":
                        c3444d.f35294f = c3409f0.x1();
                        break;
                    case "arch":
                        c3444d.f35297i = c3409f0.x1();
                        break;
                    case "type":
                        c3444d.f35290b = c3409f0.x1();
                        break;
                    case "uuid":
                        c3444d.f35289a = c3409f0.x1();
                        break;
                    case "debug_id":
                        c3444d.f35291c = c3409f0.x1();
                        break;
                    case "code_id":
                        c3444d.f35293e = c3409f0.x1();
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
            c3444d.l(hashMap);
            return c3444d;
        }
    }

    public void j(String str) {
        this.f35291c = str;
    }

    public void k(String str) {
        this.f35290b = str;
    }

    public void l(Map map) {
        this.f35298j = map;
    }

    public void m(String str) {
        this.f35289a = str;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35289a != null) {
            a02.k(AppConstants.PARAMS_UUID).b(this.f35289a);
        }
        if (this.f35290b != null) {
            a02.k("type").b(this.f35290b);
        }
        if (this.f35291c != null) {
            a02.k("debug_id").b(this.f35291c);
        }
        if (this.f35292d != null) {
            a02.k("debug_file").b(this.f35292d);
        }
        if (this.f35293e != null) {
            a02.k("code_id").b(this.f35293e);
        }
        if (this.f35294f != null) {
            a02.k("code_file").b(this.f35294f);
        }
        if (this.f35295g != null) {
            a02.k("image_addr").b(this.f35295g);
        }
        if (this.f35296h != null) {
            a02.k("image_size").e(this.f35296h);
        }
        if (this.f35297i != null) {
            a02.k("arch").b(this.f35297i);
        }
        Map map = this.f35298j;
        if (map != null) {
            for (String str : map.keySet()) {
                a02.k(str).g(iLogger, this.f35298j.get(str));
            }
        }
        a02.d();
    }
}
