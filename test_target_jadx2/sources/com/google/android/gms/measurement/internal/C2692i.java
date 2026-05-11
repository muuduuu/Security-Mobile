package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2692i extends W6.a {
    public static final Parcelable.Creator<C2692i> CREATOR = new C2700j();

    /* renamed from: a, reason: collision with root package name */
    public String f26102a;

    /* renamed from: b, reason: collision with root package name */
    public String f26103b;

    /* renamed from: c, reason: collision with root package name */
    public h7 f26104c;

    /* renamed from: d, reason: collision with root package name */
    public long f26105d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26106e;

    /* renamed from: f, reason: collision with root package name */
    public String f26107f;

    /* renamed from: g, reason: collision with root package name */
    public final I f26108g;

    /* renamed from: h, reason: collision with root package name */
    public long f26109h;

    /* renamed from: i, reason: collision with root package name */
    public I f26110i;

    /* renamed from: j, reason: collision with root package name */
    public final long f26111j;

    /* renamed from: k, reason: collision with root package name */
    public final I f26112k;

    C2692i(C2692i c2692i) {
        AbstractC1287s.m(c2692i);
        this.f26102a = c2692i.f26102a;
        this.f26103b = c2692i.f26103b;
        this.f26104c = c2692i.f26104c;
        this.f26105d = c2692i.f26105d;
        this.f26106e = c2692i.f26106e;
        this.f26107f = c2692i.f26107f;
        this.f26108g = c2692i.f26108g;
        this.f26109h = c2692i.f26109h;
        this.f26110i = c2692i.f26110i;
        this.f26111j = c2692i.f26111j;
        this.f26112k = c2692i.f26112k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 2, this.f26102a, false);
        W6.c.u(parcel, 3, this.f26103b, false);
        W6.c.s(parcel, 4, this.f26104c, i10, false);
        W6.c.q(parcel, 5, this.f26105d);
        W6.c.c(parcel, 6, this.f26106e);
        W6.c.u(parcel, 7, this.f26107f, false);
        W6.c.s(parcel, 8, this.f26108g, i10, false);
        W6.c.q(parcel, 9, this.f26109h);
        W6.c.s(parcel, 10, this.f26110i, i10, false);
        W6.c.q(parcel, 11, this.f26111j);
        W6.c.s(parcel, 12, this.f26112k, i10, false);
        W6.c.b(parcel, a10);
    }

    C2692i(String str, String str2, h7 h7Var, long j10, boolean z10, String str3, I i10, long j11, I i11, long j12, I i12) {
        this.f26102a = str;
        this.f26103b = str2;
        this.f26104c = h7Var;
        this.f26105d = j10;
        this.f26106e = z10;
        this.f26107f = str3;
        this.f26108g = i10;
        this.f26109h = j11;
        this.f26110i = i11;
        this.f26111j = j12;
        this.f26112k = i12;
    }
}
