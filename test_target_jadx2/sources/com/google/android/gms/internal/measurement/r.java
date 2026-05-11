package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class r implements InterfaceC2329q {

    /* renamed from: a, reason: collision with root package name */
    private final String f24639a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f24640b;

    public r(String str, List list) {
        this.f24639a = str;
        ArrayList arrayList = new ArrayList();
        this.f24640b = arrayList;
        arrayList.addAll(list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final String a() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final String b() {
        return this.f24639a;
    }

    public final ArrayList c() {
        return this.f24640b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        String str = this.f24639a;
        if (str == null ? rVar.f24639a == null : str.equals(rVar.f24639a)) {
            return this.f24640b.equals(rVar.f24640b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final Double f() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final Boolean g() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        String str = this.f24639a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f24640b.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final InterfaceC2329q j() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final InterfaceC2329q m(String str, Y1 y12, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
