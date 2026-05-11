package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2526w extends W6.a {
    public static final Parcelable.Creator<C2526w> CREATOR = new S();

    /* renamed from: a, reason: collision with root package name */
    private final String f24966a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24967b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24968c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24969d;

    /* renamed from: e, reason: collision with root package name */
    private final String f24970e;

    /* renamed from: f, reason: collision with root package name */
    private final String f24971f;

    /* renamed from: g, reason: collision with root package name */
    private final String f24972g;

    public C2526w(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f24966a = str;
        this.f24967b = str2;
        this.f24968c = str3;
        this.f24969d = str4;
        this.f24970e = str5;
        this.f24971f = str6;
        this.f24972g = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 1, this.f24966a, false);
        W6.c.u(parcel, 2, this.f24967b, false);
        W6.c.u(parcel, 3, this.f24968c, false);
        W6.c.u(parcel, 4, this.f24969d, false);
        W6.c.u(parcel, 5, this.f24970e, false);
        W6.c.u(parcel, 6, this.f24971f, false);
        W6.c.u(parcel, 7, this.f24972g, false);
        W6.c.b(parcel, a10);
    }
}
