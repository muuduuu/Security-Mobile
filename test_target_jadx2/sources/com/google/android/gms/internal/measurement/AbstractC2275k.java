package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2275k implements InterfaceC2329q, InterfaceC2293m {

    /* renamed from: a, reason: collision with root package name */
    protected final String f24543a;

    /* renamed from: b, reason: collision with root package name */
    protected final Map f24544b = new HashMap();

    public AbstractC2275k(String str) {
        this.f24543a = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final String a() {
        return this.f24543a;
    }

    public abstract InterfaceC2329q b(Y1 y12, List list);

    public final String d() {
        return this.f24543a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2293m
    public final InterfaceC2329q e(String str) {
        Map map = this.f24544b;
        return map.containsKey(str) ? (InterfaceC2329q) map.get(str) : InterfaceC2329q.f24620U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2275k)) {
            return false;
        }
        AbstractC2275k abstractC2275k = (AbstractC2275k) obj;
        String str = this.f24543a;
        if (str != null) {
            return str.equals(abstractC2275k.f24543a);
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
        return InterfaceC2293m.r(this.f24544b);
    }

    public final int hashCode() {
        String str = this.f24543a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public InterfaceC2329q j() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2293m
    public final void k(String str, InterfaceC2329q interfaceC2329q) {
        if (interfaceC2329q == null) {
            this.f24544b.remove(str);
        } else {
            this.f24544b.put(str, interfaceC2329q);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final InterfaceC2329q m(String str, Y1 y12, List list) {
        return "toString".equals(str) ? new C2364u(this.f24543a) : InterfaceC2293m.c(this, new C2364u(str), y12, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2293m
    public final boolean t(String str) {
        return this.f24544b.containsKey(str);
    }
}
