package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2676g extends W6.a {
    public static final Parcelable.Creator<C2676g> CREATOR = new C2684h();

    /* renamed from: a, reason: collision with root package name */
    public final long f26062a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26063b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26064c;

    C2676g(long j10, int i10, long j11) {
        this.f26062a = j10;
        this.f26063b = i10;
        this.f26064c = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f26062a;
        int a10 = W6.c.a(parcel);
        W6.c.q(parcel, 1, j10);
        W6.c.m(parcel, 2, this.f26063b);
        W6.c.q(parcel, 3, this.f26064c);
        W6.c.b(parcel, a10);
    }
}
