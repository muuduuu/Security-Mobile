package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class S implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        boolean z10 = false;
        String str = null;
        IBinder iBinder = null;
        boolean z11 = false;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 1) {
                str = W6.b.g(parcel, t10);
            } else if (m10 == 2) {
                iBinder = W6.b.u(parcel, t10);
            } else if (m10 == 3) {
                z10 = W6.b.n(parcel, t10);
            } else if (m10 != 4) {
                W6.b.B(parcel, t10);
            } else {
                z11 = W6.b.n(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        return new Q(str, iBinder, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Q[i10];
    }
}
