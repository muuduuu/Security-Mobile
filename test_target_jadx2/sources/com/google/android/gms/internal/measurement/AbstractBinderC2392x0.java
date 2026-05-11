package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2392x0 extends P implements InterfaceC2401y0 {
    public AbstractBinderC2392x0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.P
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) Q.b(parcel, Bundle.CREATOR);
        Q.f(parcel);
        r0(bundle);
        parcel2.writeNoException();
        return true;
    }
}
