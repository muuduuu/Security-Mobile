package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class S extends O implements U {
    S(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.U
    public final Bundle K(Bundle bundle) {
        Parcel k12 = k1();
        Q.c(k12, bundle);
        Parcel p10 = p(1, k12);
        Bundle bundle2 = (Bundle) Q.b(p10, Bundle.CREATOR);
        p10.recycle();
        return bundle2;
    }
}
