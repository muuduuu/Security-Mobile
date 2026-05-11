package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class H6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        byte[] bArr = null;
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 1:
                    j10 = W6.b.x(parcel, t10);
                    break;
                case 2:
                    bArr = W6.b.b(parcel, t10);
                    break;
                case 3:
                    str = W6.b.g(parcel, t10);
                    break;
                case 4:
                    bundle = W6.b.a(parcel, t10);
                    break;
                case 5:
                    i10 = W6.b.v(parcel, t10);
                    break;
                case 6:
                    j11 = W6.b.x(parcel, t10);
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
        return new G6(j10, bArr, str, bundle, i10, j11, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new G6[i10];
    }
}
