package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2531x extends W6.a {
    public static final Parcelable.Creator<C2531x> CREATOR = new T();

    /* renamed from: a, reason: collision with root package name */
    private final int f24977a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24978b;

    public C2531x(int i10, String str) {
        this.f24977a = i10;
        this.f24978b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f24977a);
        W6.c.u(parcel, 2, this.f24978b, false);
        W6.c.b(parcel, a10);
    }
}
