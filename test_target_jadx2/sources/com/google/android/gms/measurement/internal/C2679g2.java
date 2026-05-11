package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2679g2 extends com.google.android.gms.internal.measurement.O implements InterfaceC2703j2 {
    C2679g2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void B(n7 n7Var) {
        Parcel k12 = k1();
        com.google.android.gms.internal.measurement.Q.c(k12, n7Var);
        l1(18, k12);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void E0(n7 n7Var) {
        Parcel k12 = k1();
        com.google.android.gms.internal.measurement.Q.c(k12, n7Var);
        l1(4, k12);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final List G(String str, String str2, String str3) {
        Parcel k12 = k1();
        k12.writeString(null);
        k12.writeString(str2);
        k12.writeString(str3);
        Parcel p10 = p(17, k12);
        ArrayList createTypedArrayList = p10.createTypedArrayList(C2692i.CREATOR);
        p10.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void M(n7 n7Var) {
        Parcel k12 = k1();
        com.google.android.gms.internal.measurement.Q.c(k12, n7Var);
        l1(25, k12);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void N0(n7 n7Var) {
        Parcel k12 = k1();
        com.google.android.gms.internal.measurement.Q.c(k12, n7Var);
        l1(27, k12);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final List Q0(String str, String str2, boolean z10, n7 n7Var) {
        Parcel k12 = k1();
        k12.writeString(str);
        k12.writeString(str2);
        int i10 = com.google.android.gms.internal.measurement.Q.f24335b;
        k12.writeInt(z10 ? 1 : 0);
        com.google.android.gms.internal.measurement.Q.c(k12, n7Var);
        Parcel p10 = p(14, k12);
        ArrayList createTypedArrayList = p10.createTypedArrayList(h7.CREATOR);
        p10.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void R(n7 n7Var, Bundle bundle, InterfaceC2727m2 interfaceC2727m2) {
        Parcel k12 = k1();
        com.google.android.gms.internal.measurement.Q.c(k12, n7Var);
        com.google.android.gms.internal.measurement.Q.c(k12, bundle);
        com.google.android.gms.internal.measurement.Q.d(k12, interfaceC2727m2);
        l1(31, k12);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final String V0(n7 n7Var) {
        Parcel k12 = k1();
        com.google.android.gms.internal.measurement.Q.c(k12, n7Var);
        Parcel p10 = p(11, k12);
        String readString = p10.readString();
        p10.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void W(I i10, n7 n7Var) {
        Parcel k12 = k1();
        com.google.android.gms.internal.measurement.Q.c(k12, i10);
        com.google.android.gms.internal.measurement.Q.c(k12, n7Var);
        l1(1, k12);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final List W0(String str, String str2, n7 n7Var) {
        Parcel k12 = k1();
        k12.writeString(str);
        k12.writeString(str2);
        com.google.android.gms.internal.measurement.Q.c(k12, n7Var);
        Parcel p10 = p(16, k12);
        ArrayList createTypedArrayList = p10.createTypedArrayList(C2692i.CREATOR);
        p10.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void X(n7 n7Var) {
        Parcel k12 = k1();
        com.google.android.gms.internal.measurement.Q.c(k12, n7Var);
        l1(6, k12);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void Y(n7 n7Var) {
        Parcel k12 = k1();
        com.google.android.gms.internal.measurement.Q.c(k12, n7Var);
        l1(26, k12);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void d(n7 n7Var, I6 i62, InterfaceC2751p2 interfaceC2751p2) {
        Parcel k12 = k1();
        com.google.android.gms.internal.measurement.Q.c(k12, n7Var);
        com.google.android.gms.internal.measurement.Q.c(k12, i62);
        com.google.android.gms.internal.measurement.Q.d(k12, interfaceC2751p2);
        l1(29, k12);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void d0(n7 n7Var, C2676g c2676g) {
        Parcel k12 = k1();
        com.google.android.gms.internal.measurement.Q.c(k12, n7Var);
        com.google.android.gms.internal.measurement.Q.c(k12, c2676g);
        l1(30, k12);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final List e(String str, String str2, String str3, boolean z10) {
        Parcel k12 = k1();
        k12.writeString(null);
        k12.writeString(str2);
        k12.writeString(str3);
        int i10 = com.google.android.gms.internal.measurement.Q.f24335b;
        k12.writeInt(z10 ? 1 : 0);
        Parcel p10 = p(15, k12);
        ArrayList createTypedArrayList = p10.createTypedArrayList(h7.CREATOR);
        p10.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final byte[] e0(I i10, String str) {
        Parcel k12 = k1();
        com.google.android.gms.internal.measurement.Q.c(k12, i10);
        k12.writeString(str);
        Parcel p10 = p(9, k12);
        byte[] createByteArray = p10.createByteArray();
        p10.recycle();
        return createByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void e1(n7 n7Var) {
        Parcel k12 = k1();
        com.google.android.gms.internal.measurement.Q.c(k12, n7Var);
        l1(20, k12);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void j0(h7 h7Var, n7 n7Var) {
        Parcel k12 = k1();
        com.google.android.gms.internal.measurement.Q.c(k12, h7Var);
        com.google.android.gms.internal.measurement.Q.c(k12, n7Var);
        l1(2, k12);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final C2748p k0(n7 n7Var) {
        Parcel k12 = k1();
        com.google.android.gms.internal.measurement.Q.c(k12, n7Var);
        Parcel p10 = p(21, k12);
        C2748p c2748p = (C2748p) com.google.android.gms.internal.measurement.Q.b(p10, C2748p.CREATOR);
        p10.recycle();
        return c2748p;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void l(C2692i c2692i, n7 n7Var) {
        Parcel k12 = k1();
        com.google.android.gms.internal.measurement.Q.c(k12, c2692i);
        com.google.android.gms.internal.measurement.Q.c(k12, n7Var);
        l1(12, k12);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void m0(Bundle bundle, n7 n7Var) {
        Parcel k12 = k1();
        com.google.android.gms.internal.measurement.Q.c(k12, bundle);
        com.google.android.gms.internal.measurement.Q.c(k12, n7Var);
        l1(19, k12);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2703j2
    public final void z(long j10, String str, String str2, String str3) {
        Parcel k12 = k1();
        k12.writeLong(j10);
        k12.writeString(str);
        k12.writeString(str2);
        k12.writeString(str3);
        l1(10, k12);
    }
}
