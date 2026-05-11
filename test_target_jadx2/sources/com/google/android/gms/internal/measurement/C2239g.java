package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2239g implements InterfaceC2329q {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f24504a;

    public C2239g(Boolean bool) {
        this.f24504a = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final String a() {
        return Boolean.toString(this.f24504a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2239g) && this.f24504a == ((C2239g) obj).f24504a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final Double f() {
        return Double.valueOf(true != this.f24504a ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final Boolean g() {
        return Boolean.valueOf(this.f24504a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f24504a).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final InterfaceC2329q j() {
        return new C2239g(Boolean.valueOf(this.f24504a));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final InterfaceC2329q m(String str, Y1 y12, List list) {
        if ("toString".equals(str)) {
            return new C2364u(Boolean.toString(this.f24504a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f24504a), str));
    }

    public final String toString() {
        return String.valueOf(this.f24504a);
    }
}
