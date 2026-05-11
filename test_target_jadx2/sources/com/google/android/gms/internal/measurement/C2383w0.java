package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.w0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2383w0 extends O implements InterfaceC2401y0 {
    C2383w0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2401y0
    public final void r0(Bundle bundle) {
        Parcel k12 = k1();
        Q.c(k12, bundle);
        l1(1, k12);
    }
}
