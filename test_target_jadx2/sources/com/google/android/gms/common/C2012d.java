package com.google.android.gms.common;

import V6.AbstractC1286q;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.common.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2012d extends W6.a {
    public static final Parcelable.Creator<C2012d> CREATOR = new y();

    /* renamed from: a, reason: collision with root package name */
    private final String f23483a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23484b;

    /* renamed from: c, reason: collision with root package name */
    private final long f23485c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f23486d;

    public C2012d(String str, int i10, long j10, boolean z10) {
        this.f23483a = str;
        this.f23484b = i10;
        this.f23485c = j10;
        this.f23486d = z10;
    }

    public long F() {
        long j10 = this.f23485c;
        return j10 == -1 ? this.f23484b : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2012d) {
            C2012d c2012d = (C2012d) obj;
            if (AbstractC1286q.a(u(), c2012d.u()) && F() == c2012d.F() && j() == c2012d.j()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1286q.b(u(), Long.valueOf(F()), Boolean.valueOf(j()));
    }

    public boolean j() {
        return this.f23486d;
    }

    public final String toString() {
        AbstractC1286q.a c10 = AbstractC1286q.c(this);
        c10.a("name", u());
        c10.a("version", Long.valueOf(F()));
        c10.a("is_fully_rolled_out", Boolean.valueOf(j()));
        return c10.toString();
    }

    public String u() {
        return this.f23483a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 1, u(), false);
        W6.c.m(parcel, 2, this.f23484b);
        W6.c.q(parcel, 3, F());
        W6.c.c(parcel, 4, j());
        W6.c.b(parcel, a10);
    }

    public C2012d(String str, long j10) {
        this(str, -1, j10, false);
    }

    public C2012d(String str, long j10, boolean z10) {
        this(str, -1, j10, z10);
    }
}
