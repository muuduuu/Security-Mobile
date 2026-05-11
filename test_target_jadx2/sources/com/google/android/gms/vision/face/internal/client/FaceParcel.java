package com.google.android.gms.vision.face.internal.client;

import G7.c;
import W6.a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class FaceParcel extends a {
    public static final Parcelable.Creator<FaceParcel> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    private final int f26506a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26507b;

    /* renamed from: c, reason: collision with root package name */
    public final float f26508c;

    /* renamed from: d, reason: collision with root package name */
    public final float f26509d;

    /* renamed from: e, reason: collision with root package name */
    public final float f26510e;

    /* renamed from: f, reason: collision with root package name */
    public final float f26511f;

    /* renamed from: g, reason: collision with root package name */
    public final float f26512g;

    /* renamed from: h, reason: collision with root package name */
    public final float f26513h;

    /* renamed from: i, reason: collision with root package name */
    public final float f26514i;

    /* renamed from: j, reason: collision with root package name */
    public final LandmarkParcel[] f26515j;

    /* renamed from: k, reason: collision with root package name */
    public final float f26516k;

    /* renamed from: l, reason: collision with root package name */
    public final float f26517l;

    /* renamed from: m, reason: collision with root package name */
    public final float f26518m;

    /* renamed from: n, reason: collision with root package name */
    public final G7.a[] f26519n;

    /* renamed from: o, reason: collision with root package name */
    public final float f26520o;

    public FaceParcel(int i10, int i11, float f10, float f11, float f12, float f13, float f14, float f15, float f16, LandmarkParcel[] landmarkParcelArr, float f17, float f18, float f19, G7.a[] aVarArr, float f20) {
        this.f26506a = i10;
        this.f26507b = i11;
        this.f26508c = f10;
        this.f26509d = f11;
        this.f26510e = f12;
        this.f26511f = f13;
        this.f26512g = f14;
        this.f26513h = f15;
        this.f26514i = f16;
        this.f26515j = landmarkParcelArr;
        this.f26516k = f17;
        this.f26517l = f18;
        this.f26518m = f19;
        this.f26519n = aVarArr;
        this.f26520o = f20;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f26506a);
        W6.c.m(parcel, 2, this.f26507b);
        W6.c.j(parcel, 3, this.f26508c);
        W6.c.j(parcel, 4, this.f26509d);
        W6.c.j(parcel, 5, this.f26510e);
        W6.c.j(parcel, 6, this.f26511f);
        W6.c.j(parcel, 7, this.f26512g);
        W6.c.j(parcel, 8, this.f26513h);
        W6.c.x(parcel, 9, this.f26515j, i10, false);
        W6.c.j(parcel, 10, this.f26516k);
        W6.c.j(parcel, 11, this.f26517l);
        W6.c.j(parcel, 12, this.f26518m);
        W6.c.x(parcel, 13, this.f26519n, i10, false);
        W6.c.j(parcel, 14, this.f26514i);
        W6.c.j(parcel, 15, this.f26520o);
        W6.c.b(parcel, a10);
    }

    public FaceParcel(int i10, int i11, float f10, float f11, float f12, float f13, float f14, float f15, LandmarkParcel[] landmarkParcelArr, float f16, float f17, float f18) {
        this(i10, i11, f10, f11, f12, f13, f14, f15, 0.0f, landmarkParcelArr, f16, f17, f18, new G7.a[0], -1.0f);
    }
}
