package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import x7.w;

/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        int i10 = 1000;
        int i11 = 1;
        int i12 = 1;
        long j10 = 0;
        w[] wVarArr = null;
        boolean z10 = false;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 1:
                    i11 = W6.b.v(parcel, t10);
                    break;
                case 2:
                    i12 = W6.b.v(parcel, t10);
                    break;
                case 3:
                    j10 = W6.b.x(parcel, t10);
                    break;
                case 4:
                    i10 = W6.b.v(parcel, t10);
                    break;
                case 5:
                    wVarArr = (w[]) W6.b.j(parcel, t10, w.CREATOR);
                    break;
                case 6:
                    z10 = W6.b.n(parcel, t10);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new LocationAvailability(i10, i11, i12, j10, wVarArr, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
