package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2492p extends W6.a {
    public static final Parcelable.Creator<C2492p> CREATOR = new C2487o();

    /* renamed from: a, reason: collision with root package name */
    private final int f24894a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f24895b;

    public C2492p(int i10, String[] strArr) {
        this.f24894a = i10;
        this.f24895b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f24894a);
        W6.c.v(parcel, 2, this.f24895b, false);
        W6.c.b(parcel, a10);
    }
}
