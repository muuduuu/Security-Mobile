package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import x7.InterfaceC5122e;

/* renamed from: p7.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3823k0 extends W6.a implements InterfaceC5122e {
    public static final Parcelable.Creator<C3823k0> CREATOR = new C3825l0();

    /* renamed from: a, reason: collision with root package name */
    private final String f38439a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38440b;

    /* renamed from: c, reason: collision with root package name */
    private final short f38441c;

    /* renamed from: d, reason: collision with root package name */
    private final double f38442d;

    /* renamed from: e, reason: collision with root package name */
    private final double f38443e;

    /* renamed from: f, reason: collision with root package name */
    private final float f38444f;

    /* renamed from: g, reason: collision with root package name */
    private final int f38445g;

    /* renamed from: h, reason: collision with root package name */
    private final int f38446h;

    /* renamed from: i, reason: collision with root package name */
    private final int f38447i;

    public C3823k0(String str, int i10, short s10, double d10, double d11, float f10, long j10, int i11, int i12) {
        if (str == null || str.length() > 100) {
            throw new IllegalArgumentException("requestId is null or too long: ".concat(String.valueOf(str)));
        }
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("invalid radius: " + f10);
        }
        if (d10 > 90.0d || d10 < -90.0d) {
            throw new IllegalArgumentException("invalid latitude: " + d10);
        }
        if (d11 > 180.0d || d11 < -180.0d) {
            throw new IllegalArgumentException("invalid longitude: " + d11);
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            throw new IllegalArgumentException("No supported transition specified: " + i10);
        }
        this.f38441c = s10;
        this.f38439a = str;
        this.f38442d = d10;
        this.f38443e = d11;
        this.f38444f = f10;
        this.f38440b = j10;
        this.f38445g = i13;
        this.f38446h = i11;
        this.f38447i = i12;
    }

    @Override // x7.InterfaceC5122e
    public final String e() {
        return this.f38439a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3823k0) {
            C3823k0 c3823k0 = (C3823k0) obj;
            if (this.f38444f == c3823k0.f38444f && this.f38442d == c3823k0.f38442d && this.f38443e == c3823k0.f38443e && this.f38441c == c3823k0.f38441c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f38442d);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f38443e);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f38444f)) * 31) + this.f38441c) * 31) + this.f38445g;
    }

    public final String toString() {
        Locale locale = Locale.US;
        short s10 = this.f38441c;
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", s10 != -1 ? s10 != 1 ? "UNKNOWN" : "CIRCLE" : "INVALID", this.f38439a.replaceAll("\\p{C}", "?"), Integer.valueOf(this.f38445g), Double.valueOf(this.f38442d), Double.valueOf(this.f38443e), Float.valueOf(this.f38444f), Integer.valueOf(this.f38446h / 1000), Integer.valueOf(this.f38447i), Long.valueOf(this.f38440b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 1, this.f38439a, false);
        W6.c.q(parcel, 2, this.f38440b);
        W6.c.t(parcel, 3, this.f38441c);
        W6.c.h(parcel, 4, this.f38442d);
        W6.c.h(parcel, 5, this.f38443e);
        W6.c.j(parcel, 6, this.f38444f);
        W6.c.m(parcel, 7, this.f38445g);
        W6.c.m(parcel, 8, this.f38446h);
        W6.c.m(parcel, 9, this.f38447i);
        W6.c.b(parcel, a10);
    }
}
