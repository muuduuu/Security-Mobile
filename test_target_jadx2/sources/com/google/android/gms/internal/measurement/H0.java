package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class H0 extends W6.a {
    public static final Parcelable.Creator<H0> CREATOR = new I0();

    /* renamed from: a, reason: collision with root package name */
    public final long f24223a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24224b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24225c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f24226d;

    /* renamed from: e, reason: collision with root package name */
    public final String f24227e;

    public H0(long j10, long j11, boolean z10, Bundle bundle, String str) {
        this.f24223a = j10;
        this.f24224b = j11;
        this.f24225c = z10;
        this.f24226d = bundle;
        this.f24227e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f24223a;
        int a10 = W6.c.a(parcel);
        W6.c.q(parcel, 1, j10);
        W6.c.q(parcel, 2, this.f24224b);
        W6.c.c(parcel, 3, this.f24225c);
        W6.c.e(parcel, 7, this.f24226d, false);
        W6.c.u(parcel, 8, this.f24227e, false);
        W6.c.b(parcel, a10);
    }
}
