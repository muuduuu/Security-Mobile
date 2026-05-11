package r7;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r7.v8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4247v8 extends W6.a {
    public static final Parcelable.Creator<C4247v8> CREATOR = new N8();

    /* renamed from: a, reason: collision with root package name */
    public int f40339a;

    /* renamed from: b, reason: collision with root package name */
    public String f40340b;

    /* renamed from: c, reason: collision with root package name */
    public String f40341c;

    /* renamed from: d, reason: collision with root package name */
    public int f40342d;

    /* renamed from: e, reason: collision with root package name */
    public Point[] f40343e;

    /* renamed from: f, reason: collision with root package name */
    public S4 f40344f;

    /* renamed from: g, reason: collision with root package name */
    public C4245v6 f40345g;

    /* renamed from: h, reason: collision with root package name */
    public W6 f40346h;

    /* renamed from: i, reason: collision with root package name */
    public U7 f40347i;

    /* renamed from: j, reason: collision with root package name */
    public C4266x7 f40348j;

    /* renamed from: k, reason: collision with root package name */
    public C4224t5 f40349k;

    /* renamed from: l, reason: collision with root package name */
    public C4183p3 f40350l;

    /* renamed from: m, reason: collision with root package name */
    public Q3 f40351m;

    /* renamed from: n, reason: collision with root package name */
    public C4203r4 f40352n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f40353o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f40354p;

    /* renamed from: q, reason: collision with root package name */
    public double f40355q;

    public C4247v8(int i10, String str, String str2, int i11, Point[] pointArr, S4 s42, C4245v6 c4245v6, W6 w62, U7 u72, C4266x7 c4266x7, C4224t5 c4224t5, C4183p3 c4183p3, Q3 q32, C4203r4 c4203r4, byte[] bArr, boolean z10, double d10) {
        this.f40339a = i10;
        this.f40340b = str;
        this.f40353o = bArr;
        this.f40341c = str2;
        this.f40342d = i11;
        this.f40343e = pointArr;
        this.f40354p = z10;
        this.f40355q = d10;
        this.f40344f = s42;
        this.f40345g = c4245v6;
        this.f40346h = w62;
        this.f40347i = u72;
        this.f40348j = c4266x7;
        this.f40349k = c4224t5;
        this.f40350l = c4183p3;
        this.f40351m = q32;
        this.f40352n = c4203r4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 2, this.f40339a);
        W6.c.u(parcel, 3, this.f40340b, false);
        W6.c.u(parcel, 4, this.f40341c, false);
        W6.c.m(parcel, 5, this.f40342d);
        W6.c.x(parcel, 6, this.f40343e, i10, false);
        W6.c.s(parcel, 7, this.f40344f, i10, false);
        W6.c.s(parcel, 8, this.f40345g, i10, false);
        W6.c.s(parcel, 9, this.f40346h, i10, false);
        W6.c.s(parcel, 10, this.f40347i, i10, false);
        W6.c.s(parcel, 11, this.f40348j, i10, false);
        W6.c.s(parcel, 12, this.f40349k, i10, false);
        W6.c.s(parcel, 13, this.f40350l, i10, false);
        W6.c.s(parcel, 14, this.f40351m, i10, false);
        W6.c.s(parcel, 15, this.f40352n, i10, false);
        W6.c.f(parcel, 16, this.f40353o, false);
        W6.c.c(parcel, 17, this.f40354p);
        W6.c.h(parcel, 18, this.f40355q);
        W6.c.b(parcel, a10);
    }
}
