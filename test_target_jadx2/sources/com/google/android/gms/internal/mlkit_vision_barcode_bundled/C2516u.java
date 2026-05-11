package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2516u extends W6.a {
    public static final Parcelable.Creator<C2516u> CREATOR = new K();

    /* renamed from: a, reason: collision with root package name */
    private final int f24951a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24952b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24953c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24954d;

    public C2516u(int i10, String str, String str2, String str3) {
        this.f24951a = i10;
        this.f24952b = str;
        this.f24953c = str2;
        this.f24954d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f24951a);
        W6.c.u(parcel, 2, this.f24952b, false);
        W6.c.u(parcel, 3, this.f24953c, false);
        W6.c.u(parcel, 4, this.f24954d, false);
        W6.c.b(parcel, a10);
    }
}
