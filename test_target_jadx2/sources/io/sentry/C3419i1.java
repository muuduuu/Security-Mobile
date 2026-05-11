package io.sentry;

import io.sentry.l2;
import io.sentry.protocol.p;
import io.sentry.protocol.r;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.i1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3419i1 implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.r f35149a;

    /* renamed from: b, reason: collision with root package name */
    private final io.sentry.protocol.p f35150b;

    /* renamed from: c, reason: collision with root package name */
    private final l2 f35151c;

    /* renamed from: d, reason: collision with root package name */
    private Date f35152d;

    /* renamed from: e, reason: collision with root package name */
    private Map f35153e;

    /* renamed from: io.sentry.i1$a */
    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3419i1 a(C3409f0 c3409f0, ILogger iLogger) {
            String r10;
            c3409f0.b();
            io.sentry.protocol.r rVar = null;
            io.sentry.protocol.p pVar = null;
            l2 l2Var = null;
            Date date = null;
            HashMap hashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                r10 = c3409f0.r();
                r10.hashCode();
                switch (r10) {
                    case "sdk":
                        pVar = (io.sentry.protocol.p) c3409f0.v1(iLogger, new p.a());
                        break;
                    case "trace":
                        l2Var = (l2) c3409f0.v1(iLogger, new l2.b());
                        break;
                    case "event_id":
                        rVar = (io.sentry.protocol.r) c3409f0.v1(iLogger, new r.a());
                        break;
                    case "sent_at":
                        date = c3409f0.O0(iLogger);
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        c3409f0.z1(iLogger, hashMap, r10);
                        break;
                }
            }
            C3419i1 c3419i1 = new C3419i1(rVar, pVar, l2Var);
            c3419i1.d(date);
            c3419i1.e(hashMap);
            c3409f0.g();
            return c3419i1;
        }
    }

    public C3419i1(io.sentry.protocol.r rVar, io.sentry.protocol.p pVar) {
        this(rVar, pVar, null);
    }

    public io.sentry.protocol.r a() {
        return this.f35149a;
    }

    public io.sentry.protocol.p b() {
        return this.f35150b;
    }

    public l2 c() {
        return this.f35151c;
    }

    public void d(Date date) {
        this.f35152d = date;
    }

    public void e(Map map) {
        this.f35153e = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        if (this.f35149a != null) {
            a02.k("event_id").g(iLogger, this.f35149a);
        }
        if (this.f35150b != null) {
            a02.k("sdk").g(iLogger, this.f35150b);
        }
        if (this.f35151c != null) {
            a02.k("trace").g(iLogger, this.f35151c);
        }
        if (this.f35152d != null) {
            a02.k("sent_at").g(iLogger, AbstractC3420j.g(this.f35152d));
        }
        Map map = this.f35153e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f35153e.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }

    public C3419i1(io.sentry.protocol.r rVar, io.sentry.protocol.p pVar, l2 l2Var) {
        this.f35149a = rVar;
        this.f35150b = pVar;
        this.f35151c = l2Var;
    }
}
