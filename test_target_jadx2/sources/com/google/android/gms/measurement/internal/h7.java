package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class h7 extends W6.a {
    public static final Parcelable.Creator<h7> CREATOR = new i7();

    /* renamed from: a, reason: collision with root package name */
    public final int f26095a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26096b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26097c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f26098d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26099e;

    /* renamed from: f, reason: collision with root package name */
    public final String f26100f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f26101g;

    h7(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f26095a = i10;
        this.f26096b = str;
        this.f26097c = j10;
        this.f26098d = l10;
        this.f26101g = i10 == 1 ? f10 != null ? Double.valueOf(f10.doubleValue()) : null : d10;
        this.f26099e = str2;
        this.f26100f = str3;
    }

    public final Object j() {
        Long l10 = this.f26098d;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f26101g;
        if (d10 != null) {
            return d10;
        }
        String str = this.f26099e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        i7.a(this, parcel, i10);
    }

    h7(j7 j7Var) {
        this(j7Var.f26136c, j7Var.f26137d, j7Var.f26138e, j7Var.f26135b);
    }

    h7(String str, long j10, Object obj, String str2) {
        AbstractC1287s.g(str);
        this.f26095a = 2;
        this.f26096b = str;
        this.f26097c = j10;
        this.f26100f = str2;
        if (obj == null) {
            this.f26098d = null;
            this.f26101g = null;
            this.f26099e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f26098d = (Long) obj;
            this.f26101g = null;
            this.f26099e = null;
        } else if (obj instanceof String) {
            this.f26098d = null;
            this.f26101g = null;
            this.f26099e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f26098d = null;
                this.f26101g = (Double) obj;
                this.f26099e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
