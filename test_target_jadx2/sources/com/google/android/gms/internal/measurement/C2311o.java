package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2311o implements InterfaceC2329q {
    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final String a() {
        return "null";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C2311o;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final Double f() {
        return Double.valueOf(0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final Boolean g() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final InterfaceC2329q j() {
        return InterfaceC2329q.f24621V;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final InterfaceC2329q m(String str, Y1 y12, List list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }
}
