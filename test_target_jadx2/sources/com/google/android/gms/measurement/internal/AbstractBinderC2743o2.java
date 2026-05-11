package com.google.android.gms.measurement.internal;

import android.os.Parcel;

/* renamed from: com.google.android.gms.measurement.internal.o2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2743o2 extends com.google.android.gms.internal.measurement.P implements InterfaceC2751p2 {
    public AbstractBinderC2743o2() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.P
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        K6 k62 = (K6) com.google.android.gms.internal.measurement.Q.b(parcel, K6.CREATOR);
        com.google.android.gms.internal.measurement.Q.f(parcel);
        G0(k62);
        return true;
    }
}
