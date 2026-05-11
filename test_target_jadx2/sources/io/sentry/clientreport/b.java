package io.sentry.clientreport;

import io.sentry.A0;
import io.sentry.AbstractC3420j;
import io.sentry.C3409f0;
import io.sentry.ILogger;
import io.sentry.InterfaceC3421j0;
import io.sentry.K1;
import io.sentry.Z;
import io.sentry.clientreport.f;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b implements InterfaceC3421j0 {

    /* renamed from: a, reason: collision with root package name */
    private final Date f35066a;

    /* renamed from: b, reason: collision with root package name */
    private final List f35067b;

    /* renamed from: c, reason: collision with root package name */
    private Map f35068c;

    public static final class a implements Z {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(K1.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.Z
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(C3409f0 c3409f0, ILogger iLogger) {
            ArrayList arrayList = new ArrayList();
            c3409f0.b();
            Date date = null;
            HashMap hashMap = null;
            while (c3409f0.z() == io.sentry.vendor.gson.stream.b.NAME) {
                String r10 = c3409f0.r();
                r10.hashCode();
                if (r10.equals("discarded_events")) {
                    arrayList.addAll(c3409f0.l1(iLogger, new f.a()));
                } else if (r10.equals("timestamp")) {
                    date = c3409f0.O0(iLogger);
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    c3409f0.z1(iLogger, hashMap, r10);
                }
            }
            c3409f0.g();
            if (date == null) {
                throw c("timestamp", iLogger);
            }
            if (arrayList.isEmpty()) {
                throw c("discarded_events", iLogger);
            }
            b bVar = new b(date, arrayList);
            bVar.b(hashMap);
            return bVar;
        }
    }

    public b(Date date, List list) {
        this.f35066a = date;
        this.f35067b = list;
    }

    public List a() {
        return this.f35067b;
    }

    public void b(Map map) {
        this.f35068c = map;
    }

    @Override // io.sentry.InterfaceC3421j0
    public void serialize(A0 a02, ILogger iLogger) {
        a02.f();
        a02.k("timestamp").b(AbstractC3420j.g(this.f35066a));
        a02.k("discarded_events").g(iLogger, this.f35067b);
        Map map = this.f35068c;
        if (map != null) {
            for (String str : map.keySet()) {
                a02.k(str).g(iLogger, this.f35068c.get(str));
            }
        }
        a02.d();
    }
}
