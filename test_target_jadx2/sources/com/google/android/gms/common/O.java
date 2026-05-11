package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class O extends W6.a {
    public static final Parcelable.Creator<O> CREATOR = new P();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23312a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23313b;

    /* renamed from: c, reason: collision with root package name */
    private final int f23314c;

    /* renamed from: d, reason: collision with root package name */
    private final int f23315d;

    /* renamed from: e, reason: collision with root package name */
    private final long f23316e;

    O(boolean z10, String str, int i10, int i11, long j10) {
        this.f23312a = z10;
        this.f23313b = str;
        this.f23314c = X.a(i10) - 1;
        this.f23315d = z.a(i11) - 1;
        this.f23316e = j10;
    }

    public final int F() {
        return X.a(this.f23314c);
    }

    public final int I() {
        return z.a(this.f23315d);
    }

    public final String j() {
        return this.f23313b;
    }

    public final long u() {
        return this.f23316e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.c(parcel, 1, this.f23312a);
        W6.c.u(parcel, 2, this.f23313b, false);
        W6.c.m(parcel, 3, this.f23314c);
        W6.c.m(parcel, 4, this.f23315d);
        W6.c.q(parcel, 5, this.f23316e);
        W6.c.b(parcel, a10);
    }

    public final boolean zza() {
        return this.f23312a;
    }
}
