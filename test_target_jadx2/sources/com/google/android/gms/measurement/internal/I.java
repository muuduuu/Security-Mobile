package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class I extends W6.a {
    public static final Parcelable.Creator<I> CREATOR = new J();

    /* renamed from: a, reason: collision with root package name */
    public final String f25442a;

    /* renamed from: b, reason: collision with root package name */
    public final G f25443b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25444c;

    /* renamed from: d, reason: collision with root package name */
    public final long f25445d;

    I(I i10, long j10) {
        AbstractC1287s.m(i10);
        this.f25442a = i10.f25442a;
        this.f25443b = i10.f25443b;
        this.f25444c = i10.f25444c;
        this.f25445d = j10;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f25443b);
        String str = this.f25444c;
        int length = String.valueOf(str).length();
        String str2 = this.f25442a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + valueOf.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        J.a(this, parcel, i10);
    }

    public I(String str, G g10, String str2, long j10) {
        this.f25442a = str;
        this.f25443b = g10;
        this.f25444c = str2;
        this.f25445d = j10;
    }
}
