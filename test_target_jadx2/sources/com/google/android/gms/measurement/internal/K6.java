package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes2.dex */
public final class K6 extends W6.a {
    public static final Parcelable.Creator<K6> CREATOR = new L6();

    /* renamed from: a, reason: collision with root package name */
    public final List f25528a;

    K6(List list) {
        this.f25528a = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f25528a;
        int a10 = W6.c.a(parcel);
        W6.c.y(parcel, 1, list, false);
        W6.c.b(parcel, a10);
    }
}
