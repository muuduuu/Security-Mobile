package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class X extends W6.a {
    public static final Parcelable.Creator<X> CREATOR = new Y();

    /* renamed from: a, reason: collision with root package name */
    private final int f24825a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24826b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24827c;

    /* renamed from: d, reason: collision with root package name */
    private final int f24828d;

    /* renamed from: e, reason: collision with root package name */
    private final long f24829e;

    public X(int i10, int i11, int i12, int i13, long j10) {
        this.f24825a = i10;
        this.f24826b = i11;
        this.f24827c = i12;
        this.f24828d = i13;
        this.f24829e = j10;
    }

    public final int F() {
        return this.f24828d;
    }

    public final int I() {
        return this.f24826b;
    }

    public final int j() {
        return this.f24827c;
    }

    public final int u() {
        return this.f24825a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f24825a);
        W6.c.m(parcel, 2, this.f24826b);
        W6.c.m(parcel, 3, this.f24827c);
        W6.c.m(parcel, 4, this.f24828d);
        W6.c.q(parcel, 5, this.f24829e);
        W6.c.b(parcel, a10);
    }
}
