package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class G6 extends W6.a {
    public static final Parcelable.Creator<G6> CREATOR = new H6();

    /* renamed from: a, reason: collision with root package name */
    public final long f25424a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f25425b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25426c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f25427d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25428e;

    /* renamed from: f, reason: collision with root package name */
    public final long f25429f;

    /* renamed from: g, reason: collision with root package name */
    public String f25430g;

    G6(long j10, byte[] bArr, String str, Bundle bundle, int i10, long j11, String str2) {
        this.f25424a = j10;
        this.f25425b = bArr;
        this.f25426c = str;
        this.f25427d = bundle;
        this.f25428e = i10;
        this.f25429f = j11;
        this.f25430g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f25424a;
        int a10 = W6.c.a(parcel);
        W6.c.q(parcel, 1, j10);
        W6.c.f(parcel, 2, this.f25425b, false);
        W6.c.u(parcel, 3, this.f25426c, false);
        W6.c.e(parcel, 4, this.f25427d, false);
        W6.c.m(parcel, 5, this.f25428e);
        W6.c.q(parcel, 6, this.f25429f);
        W6.c.u(parcel, 7, this.f25430g, false);
        W6.c.b(parcel, a10);
    }
}
