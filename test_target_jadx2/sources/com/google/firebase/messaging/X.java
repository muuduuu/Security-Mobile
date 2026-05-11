package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class X implements Parcelable.Creator {
    static void c(W w10, Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.e(parcel, 2, w10.f28093a, false);
        W6.c.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public W createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            if (W6.b.m(t10) != 2) {
                W6.b.B(parcel, t10);
            } else {
                bundle = W6.b.a(parcel, t10);
            }
        }
        W6.b.l(parcel, C10);
        return new W(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public W[] newArray(int i10) {
        return new W[i10];
    }
}
