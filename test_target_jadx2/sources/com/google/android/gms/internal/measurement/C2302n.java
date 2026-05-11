package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2302n implements InterfaceC2329q, InterfaceC2293m {

    /* renamed from: a, reason: collision with root package name */
    final Map f24575a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final String a() {
        return "[object Object]";
    }

    public final List b() {
        return new ArrayList(this.f24575a.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2293m
    public final InterfaceC2329q e(String str) {
        Map map = this.f24575a;
        return map.containsKey(str) ? (InterfaceC2329q) map.get(str) : InterfaceC2329q.f24620U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2302n) {
            return this.f24575a.equals(((C2302n) obj).f24575a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final Boolean g() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final Iterator h() {
        return InterfaceC2293m.r(this.f24575a);
    }

    public final int hashCode() {
        return this.f24575a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final InterfaceC2329q j() {
        C2302n c2302n = new C2302n();
        for (Map.Entry entry : this.f24575a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC2293m) {
                c2302n.f24575a.put((String) entry.getKey(), (InterfaceC2329q) entry.getValue());
            } else {
                c2302n.f24575a.put((String) entry.getKey(), ((InterfaceC2329q) entry.getValue()).j());
            }
        }
        return c2302n;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2293m
    public final void k(String str, InterfaceC2329q interfaceC2329q) {
        if (interfaceC2329q == null) {
            this.f24575a.remove(str);
        } else {
            this.f24575a.put(str, interfaceC2329q);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public InterfaceC2329q m(String str, Y1 y12, List list) {
        return "toString".equals(str) ? new C2364u(toString()) : InterfaceC2293m.c(this, new C2364u(str), y12, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2293m
    public final boolean t(String str) {
        return this.f24575a.containsKey(str);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        Map map = this.f24575a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb2.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }
}
