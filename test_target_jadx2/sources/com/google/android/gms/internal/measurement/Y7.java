package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class Y7 {

    /* renamed from: a, reason: collision with root package name */
    final TreeMap f24432a = new TreeMap();

    /* renamed from: b, reason: collision with root package name */
    final TreeMap f24433b = new TreeMap();

    private static final int c(Y1 y12, C2320p c2320p, InterfaceC2329q interfaceC2329q) {
        InterfaceC2329q b10 = c2320p.b(y12, Collections.singletonList(interfaceC2329q));
        if (b10 instanceof C2266j) {
            return AbstractC2412z2.g(b10.f().doubleValue());
        }
        return -1;
    }

    public final void a(String str, int i10, C2320p c2320p, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f24433b;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
            }
            treeMap = this.f24432a;
        }
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            i10 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i10), c2320p);
    }

    public final void b(Y1 y12, C2203c c2203c) {
        B4 b42 = new B4(c2203c);
        TreeMap treeMap = this.f24432a;
        for (Integer num : treeMap.keySet()) {
            C2194b clone = c2203c.c().clone();
            int c10 = c(y12, (C2320p) treeMap.get(num), b42);
            if (c10 == 2 || c10 == -1) {
                c2203c.d(clone);
            }
        }
        TreeMap treeMap2 = this.f24433b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            c(y12, (C2320p) treeMap2.get((Integer) it.next()), b42);
        }
    }
}
