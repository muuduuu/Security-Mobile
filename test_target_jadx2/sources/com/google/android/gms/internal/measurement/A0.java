package com.google.android.gms.internal.measurement;

import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class A0 extends P implements B0 {
    public A0() {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.P
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        g();
        return true;
    }
}
