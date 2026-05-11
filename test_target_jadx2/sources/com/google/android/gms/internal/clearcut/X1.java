package com.google.android.gms.internal.clearcut;

import V6.AbstractC1286q;
import V6.AbstractC1287s;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class X1 extends W6.a {
    public static final Parcelable.Creator<X1> CREATOR = new Y1();

    /* renamed from: a, reason: collision with root package name */
    private final String f23958a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23959b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23960c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23961d;

    /* renamed from: e, reason: collision with root package name */
    private final String f23962e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f23963f;

    /* renamed from: g, reason: collision with root package name */
    public final String f23964g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f23965h;

    /* renamed from: i, reason: collision with root package name */
    private final int f23966i;

    public X1(String str, int i10, int i11, String str2, String str3, String str4, boolean z10, E1 e12) {
        this.f23958a = (String) AbstractC1287s.m(str);
        this.f23959b = i10;
        this.f23960c = i11;
        this.f23964g = str2;
        this.f23961d = str3;
        this.f23962e = str4;
        this.f23963f = !z10;
        this.f23965h = z10;
        this.f23966i = e12.zzc();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof X1) {
            X1 x12 = (X1) obj;
            if (AbstractC1286q.a(this.f23958a, x12.f23958a) && this.f23959b == x12.f23959b && this.f23960c == x12.f23960c && AbstractC1286q.a(this.f23964g, x12.f23964g) && AbstractC1286q.a(this.f23961d, x12.f23961d) && AbstractC1286q.a(this.f23962e, x12.f23962e) && this.f23963f == x12.f23963f && this.f23965h == x12.f23965h && this.f23966i == x12.f23966i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1286q.b(this.f23958a, Integer.valueOf(this.f23959b), Integer.valueOf(this.f23960c), this.f23964g, this.f23961d, this.f23962e, Boolean.valueOf(this.f23963f), Boolean.valueOf(this.f23965h), Integer.valueOf(this.f23966i));
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.f23958a + ",packageVersionCode=" + this.f23959b + ",logSource=" + this.f23960c + ",logSourceName=" + this.f23964g + ",uploadAccount=" + this.f23961d + ",loggingId=" + this.f23962e + ",logAndroidId=" + this.f23963f + ",isAnonymous=" + this.f23965h + ",qosTier=" + this.f23966i + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 2, this.f23958a, false);
        W6.c.m(parcel, 3, this.f23959b);
        W6.c.m(parcel, 4, this.f23960c);
        W6.c.u(parcel, 5, this.f23961d, false);
        W6.c.u(parcel, 6, this.f23962e, false);
        W6.c.c(parcel, 7, this.f23963f);
        W6.c.u(parcel, 8, this.f23964g, false);
        W6.c.c(parcel, 9, this.f23965h);
        W6.c.m(parcel, 10, this.f23966i);
        W6.c.b(parcel, a10);
    }

    public X1(String str, int i10, int i11, String str2, String str3, boolean z10, String str4, boolean z11, int i12) {
        this.f23958a = str;
        this.f23959b = i10;
        this.f23960c = i11;
        this.f23961d = str2;
        this.f23962e = str3;
        this.f23963f = z10;
        this.f23964g = str4;
        this.f23965h = z11;
        this.f23966i = i12;
    }
}
