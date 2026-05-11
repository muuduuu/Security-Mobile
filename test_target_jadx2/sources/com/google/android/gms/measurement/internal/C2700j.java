package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.attribution.RequestError;

/* renamed from: com.google.android.gms.measurement.internal.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2700j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        String str = null;
        String str2 = null;
        h7 h7Var = null;
        String str3 = null;
        I i10 = null;
        I i11 = null;
        I i12 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 2:
                    str = W6.b.g(parcel, t10);
                    break;
                case 3:
                    str2 = W6.b.g(parcel, t10);
                    break;
                case 4:
                    h7Var = (h7) W6.b.f(parcel, t10, h7.CREATOR);
                    break;
                case 5:
                    j10 = W6.b.x(parcel, t10);
                    break;
                case 6:
                    z10 = W6.b.n(parcel, t10);
                    break;
                case 7:
                    str3 = W6.b.g(parcel, t10);
                    break;
                case 8:
                    i10 = (I) W6.b.f(parcel, t10, I.CREATOR);
                    break;
                case 9:
                    j11 = W6.b.x(parcel, t10);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    i11 = (I) W6.b.f(parcel, t10, I.CREATOR);
                    break;
                case 11:
                    j12 = W6.b.x(parcel, t10);
                    break;
                case 12:
                    i12 = (I) W6.b.f(parcel, t10, I.CREATOR);
                    break;
                default:
                    W6.b.B(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new C2692i(str, str2, h7Var, j10, z10, str3, i10, j11, i11, j12, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2692i[i10];
    }
}
