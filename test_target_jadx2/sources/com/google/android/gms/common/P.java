package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class P implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        long j10 = -1;
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        String str = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 1) {
                z10 = W6.b.n(parcel, t10);
            } else if (m10 == 2) {
                str = W6.b.g(parcel, t10);
            } else if (m10 == 3) {
                i10 = W6.b.v(parcel, t10);
            } else if (m10 == 4) {
                i11 = W6.b.v(parcel, t10);
            } else if (m10 != 5) {
                W6.b.B(parcel, t10);
            } else {
                j10 = W6.b.x(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        return new O(z10, str, i10, i11, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new O[i10];
    }
}
