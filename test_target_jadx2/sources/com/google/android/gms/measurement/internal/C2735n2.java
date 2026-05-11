package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.measurement.internal.n2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2735n2 extends com.google.android.gms.internal.measurement.O implements InterfaceC2751p2 {
    C2735n2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2751p2
    public final void G0(K6 k62) {
        Parcel k12 = k1();
        com.google.android.gms.internal.measurement.Q.c(k12, k62);
        m1(2, k12);
    }
}
