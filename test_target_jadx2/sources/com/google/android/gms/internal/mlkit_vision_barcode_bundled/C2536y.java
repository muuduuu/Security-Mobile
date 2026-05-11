package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2536y extends W6.a {
    public static final Parcelable.Creator<C2536y> CREATOR = new U();

    /* renamed from: a, reason: collision with root package name */
    private final String f24981a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24982b;

    public C2536y(String str, String str2) {
        this.f24981a = str;
        this.f24982b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 1, this.f24981a, false);
        W6.c.u(parcel, 2, this.f24982b, false);
        W6.c.b(parcel, a10);
    }
}
