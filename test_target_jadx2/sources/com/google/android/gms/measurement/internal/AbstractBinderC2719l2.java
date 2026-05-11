package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.measurement.internal.l2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2719l2 extends com.google.android.gms.internal.measurement.P implements InterfaceC2727m2 {
    public AbstractBinderC2719l2() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.internal.measurement.P
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(B6.CREATOR);
        com.google.android.gms.internal.measurement.Q.f(parcel);
        P0(createTypedArrayList);
        return true;
    }
}
