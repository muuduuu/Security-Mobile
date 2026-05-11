package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.a3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2189a3 {
    public static InterfaceC2329q a(Object obj) {
        if (obj == null) {
            return InterfaceC2329q.f24621V;
        }
        if (obj instanceof String) {
            return new C2364u((String) obj);
        }
        if (obj instanceof Double) {
            return new C2266j((Double) obj);
        }
        if (obj instanceof Long) {
            return new C2266j(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C2266j(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C2239g((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C2230f c2230f = new C2230f();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c2230f.D(c2230f.w(), a(it.next()));
            }
            return c2230f;
        }
        C2302n c2302n = new C2302n();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            InterfaceC2329q a10 = a(map.get(obj2));
            if (obj2 != null) {
                if (!(obj2 instanceof String)) {
                    obj2 = obj2.toString();
                }
                c2302n.k((String) obj2, a10);
            }
        }
        return c2302n;
    }

    public static InterfaceC2329q b(G3 g32) {
        if (g32 == null) {
            return InterfaceC2329q.f24620U;
        }
        int L10 = g32.L() - 1;
        if (L10 == 1) {
            return g32.E() ? new C2364u(g32.F()) : InterfaceC2329q.f24627e0;
        }
        if (L10 == 2) {
            return g32.I() ? new C2266j(Double.valueOf(g32.J())) : new C2266j(null);
        }
        if (L10 == 3) {
            return g32.G() ? new C2239g(Boolean.valueOf(g32.H())) : new C2239g(null);
        }
        if (L10 != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List C10 = g32.C();
        ArrayList arrayList = new ArrayList();
        Iterator it = C10.iterator();
        while (it.hasNext()) {
            arrayList.add(b((G3) it.next()));
        }
        return new r(g32.D(), arrayList);
    }
}
