package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class C2 extends W6.a {
    public static final Parcelable.Creator<C2> CREATOR = new E2();

    /* renamed from: a, reason: collision with root package name */
    public int f25002a;

    /* renamed from: b, reason: collision with root package name */
    public int f25003b;

    /* renamed from: c, reason: collision with root package name */
    public int f25004c;

    /* renamed from: d, reason: collision with root package name */
    public long f25005d;

    /* renamed from: e, reason: collision with root package name */
    public int f25006e;

    public C2() {
    }

    public static C2 j(E7.b bVar) {
        C2 c22 = new C2();
        c22.f25002a = bVar.c().e();
        c22.f25003b = bVar.c().a();
        c22.f25006e = bVar.c().c();
        c22.f25004c = bVar.c().b();
        c22.f25005d = bVar.c().d();
        return c22;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 2, this.f25002a);
        W6.c.m(parcel, 3, this.f25003b);
        W6.c.m(parcel, 4, this.f25004c);
        W6.c.q(parcel, 5, this.f25005d);
        W6.c.m(parcel, 6, this.f25006e);
        W6.c.b(parcel, a10);
    }

    public C2(int i10, int i11, int i12, long j10, int i13) {
        this.f25002a = i10;
        this.f25003b = i11;
        this.f25004c = i12;
        this.f25005d = j10;
        this.f25006e = i13;
    }
}
