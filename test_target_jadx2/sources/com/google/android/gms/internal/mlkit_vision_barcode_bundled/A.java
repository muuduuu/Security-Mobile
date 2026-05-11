package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class A extends W6.a {
    public static final Parcelable.Creator<A> CREATOR = new W();

    /* renamed from: a, reason: collision with root package name */
    private final String f24721a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24722b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24723c;

    public A(String str, String str2, int i10) {
        this.f24721a = str;
        this.f24722b = str2;
        this.f24723c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 1, this.f24721a, false);
        W6.c.u(parcel, 2, this.f24722b, false);
        W6.c.m(parcel, 3, this.f24723c);
        W6.c.b(parcel, a10);
    }
}
