package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2506s extends W6.a {
    public static final Parcelable.Creator<C2506s> CREATOR = new I();

    /* renamed from: a, reason: collision with root package name */
    private final C2526w f24927a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24928b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24929c;

    /* renamed from: d, reason: collision with root package name */
    private final C2531x[] f24930d;

    /* renamed from: e, reason: collision with root package name */
    private final C2516u[] f24931e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f24932f;

    /* renamed from: g, reason: collision with root package name */
    private final C2492p[] f24933g;

    public C2506s(C2526w c2526w, String str, String str2, C2531x[] c2531xArr, C2516u[] c2516uArr, String[] strArr, C2492p[] c2492pArr) {
        this.f24927a = c2526w;
        this.f24928b = str;
        this.f24929c = str2;
        this.f24930d = c2531xArr;
        this.f24931e = c2516uArr;
        this.f24932f = strArr;
        this.f24933g = c2492pArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.s(parcel, 1, this.f24927a, i10, false);
        W6.c.u(parcel, 2, this.f24928b, false);
        W6.c.u(parcel, 3, this.f24929c, false);
        W6.c.x(parcel, 4, this.f24930d, i10, false);
        W6.c.x(parcel, 5, this.f24931e, i10, false);
        W6.c.v(parcel, 6, this.f24932f, false);
        W6.c.x(parcel, 7, this.f24933g, i10, false);
        W6.c.b(parcel, a10);
    }
}
