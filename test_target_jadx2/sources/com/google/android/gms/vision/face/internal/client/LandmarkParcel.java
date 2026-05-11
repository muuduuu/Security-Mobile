package com.google.android.gms.vision.face.internal.client;

import G7.d;
import W6.a;
import W6.c;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class LandmarkParcel extends a {
    public static final Parcelable.Creator<LandmarkParcel> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    private final int f26521a;

    /* renamed from: b, reason: collision with root package name */
    public final float f26522b;

    /* renamed from: c, reason: collision with root package name */
    public final float f26523c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26524d;

    public LandmarkParcel(int i10, float f10, float f11, int i11) {
        this.f26521a = i10;
        this.f26522b = f10;
        this.f26523c = f11;
        this.f26524d = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 1, this.f26521a);
        c.j(parcel, 2, this.f26522b);
        c.j(parcel, 3, this.f26523c);
        c.m(parcel, 4, this.f26524d);
        c.b(parcel, a10);
    }
}
