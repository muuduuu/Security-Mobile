package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2487o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        String[] strArr = null;
        int i10 = 0;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 1) {
                i10 = W6.b.v(parcel, t10);
            } else if (m10 != 2) {
                W6.b.B(parcel, t10);
            } else {
                strArr = W6.b.h(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        return new C2492p(i10, strArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2492p[i10];
    }
}
