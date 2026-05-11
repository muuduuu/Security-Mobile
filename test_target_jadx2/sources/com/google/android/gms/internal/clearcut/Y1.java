package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.attribution.RequestError;

/* loaded from: classes2.dex */
public final class Y1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        boolean z11 = true;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 2:
                    str = W6.b.g(parcel, t10);
                    break;
                case 3:
                    i10 = W6.b.v(parcel, t10);
                    break;
                case 4:
                    i11 = W6.b.v(parcel, t10);
                    break;
                case 5:
                    str2 = W6.b.g(parcel, t10);
                    break;
                case 6:
                    str3 = W6.b.g(parcel, t10);
                    break;
                case 7:
                    z11 = W6.b.n(parcel, t10);
                    break;
                case 8:
                    str4 = W6.b.g(parcel, t10);
                    break;
                case 9:
                    z10 = W6.b.n(parcel, t10);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    i12 = W6.b.v(parcel, t10);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new X1(str, i10, i11, str2, str3, z11, str4, z10, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new X1[i10];
    }
}
