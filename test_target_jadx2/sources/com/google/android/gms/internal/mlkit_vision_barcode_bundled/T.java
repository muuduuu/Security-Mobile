package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class T implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        String str = null;
        int i10 = 0;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 1) {
                i10 = W6.b.v(parcel, t10);
            } else if (m10 != 2) {
                W6.b.B(parcel, t10);
            } else {
                str = W6.b.g(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        return new C2531x(i10, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2531x[i10];
    }
}
