package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class C extends W6.a {
    public static final Parcelable.Creator<C> CREATOR = new D();

    /* renamed from: a, reason: collision with root package name */
    private final int f24726a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24727b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24728c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f24729d;

    /* renamed from: e, reason: collision with root package name */
    private final Point[] f24730e;

    /* renamed from: f, reason: collision with root package name */
    private final int f24731f;

    /* renamed from: g, reason: collision with root package name */
    private final C2516u f24732g;

    /* renamed from: h, reason: collision with root package name */
    private final C2531x f24733h;

    /* renamed from: i, reason: collision with root package name */
    private final C2536y f24734i;

    /* renamed from: j, reason: collision with root package name */
    private final A f24735j;

    /* renamed from: k, reason: collision with root package name */
    private final C2541z f24736k;

    /* renamed from: l, reason: collision with root package name */
    private final C2521v f24737l;

    /* renamed from: m, reason: collision with root package name */
    private final r f24738m;

    /* renamed from: n, reason: collision with root package name */
    private final C2506s f24739n;

    /* renamed from: o, reason: collision with root package name */
    private final C2511t f24740o;

    public C(int i10, String str, String str2, byte[] bArr, Point[] pointArr, int i11, C2516u c2516u, C2531x c2531x, C2536y c2536y, A a10, C2541z c2541z, C2521v c2521v, r rVar, C2506s c2506s, C2511t c2511t) {
        this.f24726a = i10;
        this.f24727b = str;
        this.f24728c = str2;
        this.f24729d = bArr;
        this.f24730e = pointArr;
        this.f24731f = i11;
        this.f24732g = c2516u;
        this.f24733h = c2531x;
        this.f24734i = c2536y;
        this.f24735j = a10;
        this.f24736k = c2541z;
        this.f24737l = c2521v;
        this.f24738m = rVar;
        this.f24739n = c2506s;
        this.f24740o = c2511t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f24726a);
        W6.c.u(parcel, 2, this.f24727b, false);
        W6.c.u(parcel, 3, this.f24728c, false);
        W6.c.f(parcel, 4, this.f24729d, false);
        W6.c.x(parcel, 5, this.f24730e, i10, false);
        W6.c.m(parcel, 6, this.f24731f);
        W6.c.s(parcel, 7, this.f24732g, i10, false);
        W6.c.s(parcel, 8, this.f24733h, i10, false);
        W6.c.s(parcel, 9, this.f24734i, i10, false);
        W6.c.s(parcel, 10, this.f24735j, i10, false);
        W6.c.s(parcel, 11, this.f24736k, i10, false);
        W6.c.s(parcel, 12, this.f24737l, i10, false);
        W6.c.s(parcel, 13, this.f24738m, i10, false);
        W6.c.s(parcel, 14, this.f24739n, i10, false);
        W6.c.s(parcel, 15, this.f24740o, i10, false);
        W6.c.b(parcel, a10);
    }
}
