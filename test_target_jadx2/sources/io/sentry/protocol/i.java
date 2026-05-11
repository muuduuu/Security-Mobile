package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.K1;
import io.sentry.Z;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class i implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private final Number f35351a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35352b;

    /* renamed from: c, reason: collision with root package name */
    private Map f35353c;

    public static final class a implements Z {
        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(C3409f0 c3409f0, ILogger iLogger) {
            c3409f0.b();
            Number number = null;
            String str = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                String r10 = c3409f0.r();
                r10.hashCode();
                if (r10.equals("unit")) {
                    str = c3409f0.x1();
                } else if (r10.equals("value")) {
                    number = (Number) c3409f0.t1();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c3409f0.z1(iLogger, concurrentHashMap, r10);
                }
            }
            c3409f0.g();
            if (number != null) {
                i iVar = new i(number, str);
                iVar.a(concurrentHashMap);
                return iVar;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
            iLogger.b(K1.ERROR, "Missing required field \"value\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public i(Number number, String str) {
        this.f35351a = number;
        this.f35352b = str;
    }

    public void a(Map map) {
        this.f35353c = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        a02.k("value").e(this.f35351a);
        if (this.f35352b != null) {
            a02.k("unit").b(this.f35352b);
        }
        Map map = this.f35353c;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f35353c.get(str);
                a02.k(str);
                a02.g(iLogger, obj);
            }
        }
        a02.d();
    }
}
