package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class N implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        String str = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 1:
                    str = W6.b.g(parcel, t10);
                    break;
                case 2:
                    z10 = W6.b.n(parcel, t10);
                    break;
                case 3:
                    z11 = W6.b.n(parcel, t10);
                    break;
                case 4:
                    iBinder = W6.b.u(parcel, t10);
                    break;
                case 5:
                    z12 = W6.b.n(parcel, t10);
                    break;
                case 6:
                    z13 = W6.b.n(parcel, t10);
                    break;
                case 7:
                default:
                    W6.b.B(parcel, t10);
                    break;
                case 8:
                    z14 = W6.b.n(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new M(str, z10, z11, iBinder, z12, z13, z14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new M[i10];
    }
}
