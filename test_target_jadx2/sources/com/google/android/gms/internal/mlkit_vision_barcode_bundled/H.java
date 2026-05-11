package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class H implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        C2497q c2497q = null;
        C2497q c2497q2 = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 1:
                    str = W6.b.g(parcel, t10);
                    break;
                case 2:
                    str2 = W6.b.g(parcel, t10);
                    break;
                case 3:
                    str3 = W6.b.g(parcel, t10);
                    break;
                case 4:
                    str4 = W6.b.g(parcel, t10);
                    break;
                case 5:
                    str5 = W6.b.g(parcel, t10);
                    break;
                case 6:
                    c2497q = (C2497q) W6.b.f(parcel, t10, C2497q.CREATOR);
                    break;
                case 7:
                    c2497q2 = (C2497q) W6.b.f(parcel, t10, C2497q.CREATOR);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new r(str, str2, str3, str4, str5, c2497q, c2497q2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new r[i10];
    }
}
