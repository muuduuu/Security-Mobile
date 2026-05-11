package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class r extends W6.a {
    public static final Parcelable.Creator<r> CREATOR = new H();

    /* renamed from: a, reason: collision with root package name */
    private final String f24911a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24912b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24913c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24914d;

    /* renamed from: e, reason: collision with root package name */
    private final String f24915e;

    /* renamed from: f, reason: collision with root package name */
    private final C2497q f24916f;

    /* renamed from: g, reason: collision with root package name */
    private final C2497q f24917g;

    public r(String str, String str2, String str3, String str4, String str5, C2497q c2497q, C2497q c2497q2) {
        this.f24911a = str;
        this.f24912b = str2;
        this.f24913c = str3;
        this.f24914d = str4;
        this.f24915e = str5;
        this.f24916f = c2497q;
        this.f24917g = c2497q2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 1, this.f24911a, false);
        W6.c.u(parcel, 2, this.f24912b, false);
        W6.c.u(parcel, 3, this.f24913c, false);
        W6.c.u(parcel, 4, this.f24914d, false);
        W6.c.u(parcel, 5, this.f24915e, false);
        W6.c.s(parcel, 6, this.f24916f, i10, false);
        W6.c.s(parcel, 7, this.f24917g, i10, false);
        W6.c.b(parcel, a10);
    }
}
