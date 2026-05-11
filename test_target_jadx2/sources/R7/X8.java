package r7;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class X8 extends W6.a {
    public static final Parcelable.Creator<X8> CREATOR = new Y8();

    /* renamed from: a, reason: collision with root package name */
    private final int f39837a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39838b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39839c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f39840d;

    /* renamed from: e, reason: collision with root package name */
    private final Point[] f39841e;

    /* renamed from: f, reason: collision with root package name */
    private final int f39842f;

    /* renamed from: g, reason: collision with root package name */
    private final Q8 f39843g;

    /* renamed from: h, reason: collision with root package name */
    private final T8 f39844h;

    /* renamed from: i, reason: collision with root package name */
    private final U8 f39845i;

    /* renamed from: j, reason: collision with root package name */
    private final W8 f39846j;

    /* renamed from: k, reason: collision with root package name */
    private final V8 f39847k;

    /* renamed from: l, reason: collision with root package name */
    private final R8 f39848l;

    /* renamed from: m, reason: collision with root package name */
    private final M8 f39849m;

    /* renamed from: n, reason: collision with root package name */
    private final O8 f39850n;

    /* renamed from: o, reason: collision with root package name */
    private final P8 f39851o;

    public X8(int i10, String str, String str2, byte[] bArr, Point[] pointArr, int i11, Q8 q82, T8 t82, U8 u82, W8 w82, V8 v82, R8 r82, M8 m82, O8 o82, P8 p82) {
        this.f39837a = i10;
        this.f39838b = str;
        this.f39839c = str2;
        this.f39840d = bArr;
        this.f39841e = pointArr;
        this.f39842f = i11;
        this.f39843g = q82;
        this.f39844h = t82;
        this.f39845i = u82;
        this.f39846j = w82;
        this.f39847k = v82;
        this.f39848l = r82;
        this.f39849m = m82;
        this.f39850n = o82;
        this.f39851o = p82;
    }

    public final String F() {
        return this.f39838b;
    }

    public final String I() {
        return this.f39839c;
    }

    public final Point[] Z0() {
        return this.f39841e;
    }

    public final int j() {
        return this.f39837a;
    }

    public final int u() {
        return this.f39842f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f39837a);
        W6.c.u(parcel, 2, this.f39838b, false);
        W6.c.u(parcel, 3, this.f39839c, false);
        W6.c.f(parcel, 4, this.f39840d, false);
        W6.c.x(parcel, 5, this.f39841e, i10, false);
        W6.c.m(parcel, 6, this.f39842f);
        W6.c.s(parcel, 7, this.f39843g, i10, false);
        W6.c.s(parcel, 8, this.f39844h, i10, false);
        W6.c.s(parcel, 9, this.f39845i, i10, false);
        W6.c.s(parcel, 10, this.f39846j, i10, false);
        W6.c.s(parcel, 11, this.f39847k, i10, false);
        W6.c.s(parcel, 12, this.f39848l, i10, false);
        W6.c.s(parcel, 13, this.f39849m, i10, false);
        W6.c.s(parcel, 14, this.f39850n, i10, false);
        W6.c.s(parcel, 15, this.f39851o, i10, false);
        W6.c.b(parcel, a10);
    }

    public final byte[] y0() {
        return this.f39840d;
    }
}
