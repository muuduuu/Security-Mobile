package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2684h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 1) {
                j10 = W6.b.x(parcel, t10);
            } else if (m10 == 2) {
                i10 = W6.b.v(parcel, t10);
            } else if (m10 != 3) {
                W6.b.B(parcel, t10);
            } else {
                j11 = W6.b.x(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        return new C2676g(j10, i10, j11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2676g[i10];
    }
}
