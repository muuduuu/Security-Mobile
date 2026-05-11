package com.google.android.gms.internal.auth;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class R1 extends AbstractBinderC2038c implements S1 {
    public R1() {
        super("com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
    }

    @Override // com.google.android.gms.internal.auth.AbstractBinderC2038c
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        Status status = (Status) AbstractC2059j.a(parcel, Status.CREATOR);
        Bundle bundle = (Bundle) AbstractC2059j.a(parcel, Bundle.CREATOR);
        AbstractC2059j.b(parcel);
        R0(status, bundle);
        return true;
    }
}
