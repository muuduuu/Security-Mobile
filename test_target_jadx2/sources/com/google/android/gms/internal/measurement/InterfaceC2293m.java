package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2293m {
    static InterfaceC2329q c(InterfaceC2293m interfaceC2293m, InterfaceC2329q interfaceC2329q, Y1 y12, List list) {
        if (interfaceC2293m.t(interfaceC2329q.a())) {
            InterfaceC2329q e10 = interfaceC2293m.e(interfaceC2329q.a());
            if (e10 instanceof AbstractC2275k) {
                return ((AbstractC2275k) e10).b(y12, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", interfaceC2329q.a()));
        }
        if (!"hasOwnProperty".equals(interfaceC2329q.a())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", interfaceC2329q.a()));
        }
        AbstractC2412z2.a("hasOwnProperty", 1, list);
        return interfaceC2293m.t(y12.a((InterfaceC2329q) list.get(0)).a()) ? InterfaceC2329q.f24625c0 : InterfaceC2329q.f24626d0;
    }

    static Iterator r(Map map) {
        return new C2284l(map.keySet().iterator());
    }

    InterfaceC2329q e(String str);

    void k(String str, InterfaceC2329q interfaceC2329q);

    boolean t(String str);
}
