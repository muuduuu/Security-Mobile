package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2010b;

/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        String str = null;
        C2010b c2010b = null;
        int i10 = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 1) {
                i10 = W6.b.v(parcel, t10);
            } else if (m10 == 2) {
                str = W6.b.g(parcel, t10);
            } else if (m10 == 3) {
                pendingIntent = (PendingIntent) W6.b.f(parcel, t10, PendingIntent.CREATOR);
            } else if (m10 != 4) {
                W6.b.B(parcel, t10);
            } else {
                c2010b = (C2010b) W6.b.f(parcel, t10, C2010b.CREATOR);
            }
        }
        W6.b.l(parcel, C10);
        return new Status(i10, str, pendingIntent, c2010b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
