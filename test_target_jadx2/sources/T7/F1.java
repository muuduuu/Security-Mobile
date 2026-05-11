package t7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class F1 extends W6.a {
    public static final Parcelable.Creator<F1> CREATOR = new C4684g2();

    /* renamed from: a, reason: collision with root package name */
    public final int f42494a;

    /* renamed from: b, reason: collision with root package name */
    public final int f42495b;

    /* renamed from: c, reason: collision with root package name */
    public final float f42496c;

    /* renamed from: d, reason: collision with root package name */
    public final float f42497d;

    /* renamed from: e, reason: collision with root package name */
    public final float f42498e;

    /* renamed from: f, reason: collision with root package name */
    public final float f42499f;

    /* renamed from: g, reason: collision with root package name */
    public final float f42500g;

    /* renamed from: h, reason: collision with root package name */
    public final float f42501h;

    /* renamed from: i, reason: collision with root package name */
    public final float f42502i;

    /* renamed from: j, reason: collision with root package name */
    public final N5[] f42503j;

    /* renamed from: k, reason: collision with root package name */
    public final float f42504k;

    /* renamed from: l, reason: collision with root package name */
    public final float f42505l;

    /* renamed from: m, reason: collision with root package name */
    public final float f42506m;

    /* renamed from: n, reason: collision with root package name */
    public final D0[] f42507n;

    /* renamed from: o, reason: collision with root package name */
    public final float f42508o;

    public F1(int i10, int i11, float f10, float f11, float f12, float f13, float f14, float f15, float f16, N5[] n5Arr, float f17, float f18, float f19, D0[] d0Arr, float f20) {
        this.f42494a = i10;
        this.f42495b = i11;
        this.f42496c = f10;
        this.f42497d = f11;
        this.f42498e = f12;
        this.f42499f = f13;
        this.f42500g = f14;
        this.f42501h = f15;
        this.f42502i = f16;
        this.f42503j = n5Arr;
        this.f42504k = f17;
        this.f42505l = f18;
        this.f42506m = f19;
        this.f42507n = d0Arr;
        this.f42508o = f20;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f42494a);
        W6.c.m(parcel, 2, this.f42495b);
        W6.c.j(parcel, 3, this.f42496c);
        W6.c.j(parcel, 4, this.f42497d);
        W6.c.j(parcel, 5, this.f42498e);
        W6.c.j(parcel, 6, this.f42499f);
        W6.c.j(parcel, 7, this.f42500g);
        W6.c.j(parcel, 8, this.f42501h);
        W6.c.x(parcel, 9, this.f42503j, i10, false);
        W6.c.j(parcel, 10, this.f42504k);
        W6.c.j(parcel, 11, this.f42505l);
        W6.c.j(parcel, 12, this.f42506m);
        W6.c.x(parcel, 13, this.f42507n, i10, false);
        W6.c.j(parcel, 14, this.f42502i);
        W6.c.j(parcel, 15, this.f42508o);
        W6.c.b(parcel, a10);
    }
}
