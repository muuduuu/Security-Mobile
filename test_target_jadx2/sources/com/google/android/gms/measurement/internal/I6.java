package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class I6 extends W6.a {
    public static final Parcelable.Creator<I6> CREATOR = new J6();

    /* renamed from: a, reason: collision with root package name */
    public final List f25499a;

    I6(List list) {
        this.f25499a = list;
    }

    public static I6 j(EnumC2714k5... enumC2714k5Arr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(enumC2714k5Arr[0].zza()));
        return new I6(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f25499a;
        int a10 = W6.c.a(parcel);
        W6.c.o(parcel, 1, list, false);
        W6.c.b(parcel, a10);
    }
}
