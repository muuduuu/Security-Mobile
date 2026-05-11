package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class U1 extends AbstractC2108a implements T1 {
    U1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    @Override // com.google.android.gms.internal.clearcut.T1
    public final void U(R1 r12, Q6.f fVar) {
        Parcel p10 = p();
        V.b(p10, r12);
        V.c(p10, fVar);
        k1(1, p10);
    }
}
