package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.k2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2711k2 extends com.google.android.gms.internal.measurement.O implements InterfaceC2727m2 {
    C2711k2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2727m2
    public final void P0(List list) {
        Parcel k12 = k1();
        k12.writeTypedList(list);
        m1(2, k12);
    }
}
