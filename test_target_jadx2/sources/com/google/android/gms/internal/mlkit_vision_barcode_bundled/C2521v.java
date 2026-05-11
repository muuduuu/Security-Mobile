package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2521v extends W6.a {
    public static final Parcelable.Creator<C2521v> CREATOR = new L();

    /* renamed from: a, reason: collision with root package name */
    private final double f24958a;

    /* renamed from: b, reason: collision with root package name */
    private final double f24959b;

    public C2521v(double d10, double d11) {
        this.f24958a = d10;
        this.f24959b = d11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.h(parcel, 1, this.f24958a);
        W6.c.h(parcel, 2, this.f24959b);
        W6.c.b(parcel, a10);
    }
}
