package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2497q extends W6.a {
    public static final Parcelable.Creator<C2497q> CREATOR = new G();

    /* renamed from: a, reason: collision with root package name */
    private final int f24900a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24901b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24902c;

    /* renamed from: d, reason: collision with root package name */
    private final int f24903d;

    /* renamed from: e, reason: collision with root package name */
    private final int f24904e;

    /* renamed from: f, reason: collision with root package name */
    private final int f24905f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f24906g;

    /* renamed from: h, reason: collision with root package name */
    private final String f24907h;

    public C2497q(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.f24900a = i10;
        this.f24901b = i11;
        this.f24902c = i12;
        this.f24903d = i13;
        this.f24904e = i14;
        this.f24905f = i15;
        this.f24906g = z10;
        this.f24907h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f24900a);
        W6.c.m(parcel, 2, this.f24901b);
        W6.c.m(parcel, 3, this.f24902c);
        W6.c.m(parcel, 4, this.f24903d);
        W6.c.m(parcel, 5, this.f24904e);
        W6.c.m(parcel, 6, this.f24905f);
        W6.c.c(parcel, 7, this.f24906g);
        W6.c.u(parcel, 8, this.f24907h, false);
        W6.c.b(parcel, a10);
    }
}
