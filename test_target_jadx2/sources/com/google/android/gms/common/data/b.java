package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            int m10 = W6.b.m(t10);
            if (m10 == 1) {
                strArr = W6.b.h(parcel, t10);
            } else if (m10 == 2) {
                cursorWindowArr = (CursorWindow[]) W6.b.j(parcel, t10, CursorWindow.CREATOR);
            } else if (m10 == 3) {
                i11 = W6.b.v(parcel, t10);
            } else if (m10 == 4) {
                bundle = W6.b.a(parcel, t10);
            } else if (m10 != 1000) {
                W6.b.B(parcel, t10);
            } else {
                i10 = W6.b.v(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        DataHolder dataHolder = new DataHolder(i10, strArr, cursorWindowArr, i11, bundle);
        dataHolder.F();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new DataHolder[i10];
    }
}
