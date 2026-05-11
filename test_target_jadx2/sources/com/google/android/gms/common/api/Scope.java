package com.google.android.gms.common.api;

import V6.AbstractC1287s;
import W6.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes2.dex */
public final class Scope extends W6.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int f23336a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23337b;

    Scope(int i10, String str) {
        AbstractC1287s.h(str, "scopeUri must not be null or empty");
        this.f23336a = i10;
        this.f23337b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f23337b.equals(((Scope) obj).f23337b);
        }
        return false;
    }

    public int hashCode() {
        return this.f23337b.hashCode();
    }

    public String j() {
        return this.f23337b;
    }

    public String toString() {
        return this.f23337b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f23336a;
        int a10 = c.a(parcel);
        c.m(parcel, 1, i11);
        c.u(parcel, 2, j(), false);
        c.b(parcel, a10);
    }

    public Scope(String str) {
        this(1, str);
    }
}
