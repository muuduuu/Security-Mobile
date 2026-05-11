package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.common.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2031x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        Integer num = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 1) {
                i10 = W6.b.v(parcel, t10);
            } else if (m10 == 2) {
                i11 = W6.b.v(parcel, t10);
            } else if (m10 == 3) {
                pendingIntent = (PendingIntent) W6.b.f(parcel, t10, PendingIntent.CREATOR);
            } else if (m10 == 4) {
                str = W6.b.g(parcel, t10);
            } else if (m10 != 5) {
                W6.b.B(parcel, t10);
            } else {
                num = W6.b.w(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        return new C2010b(i10, i11, pendingIntent, str, num);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2010b[i10];
    }
}
