package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2756q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            if (W6.b.m(t10) != 1) {
                W6.b.B(parcel, t10);
            } else {
                bundle = W6.b.a(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        return new C2748p(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2748p[i10];
    }
}
