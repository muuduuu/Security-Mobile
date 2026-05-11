package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2248h implements InterfaceC2329q {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2329q f24514a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24515b;

    public C2248h(String str) {
        this.f24514a = InterfaceC2329q.f24620U;
        this.f24515b = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final String a() {
        throw new IllegalStateException("Control is not a String");
    }

    public final InterfaceC2329q b() {
        return this.f24514a;
    }

    public final String c() {
        return this.f24515b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2248h)) {
            return false;
        }
        C2248h c2248h = (C2248h) obj;
        return this.f24515b.equals(c2248h.f24515b) && this.f24514a.equals(c2248h.f24514a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final Double f() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final Boolean g() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        return (this.f24515b.hashCode() * 31) + this.f24514a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final InterfaceC2329q j() {
        return new C2248h(this.f24515b, this.f24514a.j());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final InterfaceC2329q m(String str, Y1 y12, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public C2248h(String str, InterfaceC2329q interfaceC2329q) {
        this.f24514a = interfaceC2329q;
        this.f24515b = str;
    }
}
