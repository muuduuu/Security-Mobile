package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class B6 extends W6.a {
    public static final Parcelable.Creator<B6> CREATOR = new C6();

    /* renamed from: a, reason: collision with root package name */
    public final String f25322a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25323b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25324c;

    B6(String str, long j10, int i10) {
        this.f25322a = str;
        this.f25323b = j10;
        this.f25324c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f25322a;
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 1, str, false);
        W6.c.q(parcel, 2, this.f25323b);
        W6.c.m(parcel, 3, this.f25324c);
        W6.c.b(parcel, a10);
    }
}
