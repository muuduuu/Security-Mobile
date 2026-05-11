package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        String str = null;
        Long l10 = null;
        ArrayList arrayList = null;
        String str2 = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 1:
                    i10 = W6.b.v(parcel, t10);
                    break;
                case 2:
                    str = W6.b.g(parcel, t10);
                    break;
                case 3:
                    l10 = W6.b.y(parcel, t10);
                    break;
                case 4:
                    z10 = W6.b.n(parcel, t10);
                    break;
                case 5:
                    z11 = W6.b.n(parcel, t10);
                    break;
                case 6:
                    arrayList = W6.b.i(parcel, t10);
                    break;
                case 7:
                    str2 = W6.b.g(parcel, t10);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new TokenData(i10, str, l10, z10, z11, arrayList, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new TokenData[i10];
    }
}
