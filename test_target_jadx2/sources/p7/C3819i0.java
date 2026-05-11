package p7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: p7.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3819i0 extends W6.a {
    public static final Parcelable.Creator<C3819i0> CREATOR = new C3821j0();

    /* renamed from: a, reason: collision with root package name */
    private final int f38428a;

    /* renamed from: b, reason: collision with root package name */
    private final C3815g0 f38429b;

    /* renamed from: c, reason: collision with root package name */
    private final x7.M f38430c;

    /* renamed from: d, reason: collision with root package name */
    private final x7.J f38431d;

    /* renamed from: e, reason: collision with root package name */
    private final PendingIntent f38432e;

    /* renamed from: f, reason: collision with root package name */
    private final G0 f38433f;

    /* renamed from: g, reason: collision with root package name */
    private final String f38434g;

    C3819i0(int i10, C3815g0 c3815g0, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        this.f38428a = i10;
        this.f38429b = c3815g0;
        G0 g02 = null;
        this.f38430c = iBinder != null ? x7.L.k1(iBinder) : null;
        this.f38432e = pendingIntent;
        this.f38431d = iBinder2 != null ? x7.I.k1(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            g02 = queryLocalInterface instanceof G0 ? (G0) queryLocalInterface : new E0(iBinder3);
        }
        this.f38433f = g02;
        this.f38434g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f38428a);
        W6.c.s(parcel, 2, this.f38429b, i10, false);
        x7.M m10 = this.f38430c;
        W6.c.l(parcel, 3, m10 == null ? null : m10.asBinder(), false);
        W6.c.s(parcel, 4, this.f38432e, i10, false);
        x7.J j10 = this.f38431d;
        W6.c.l(parcel, 5, j10 == null ? null : j10.asBinder(), false);
        G0 g02 = this.f38433f;
        W6.c.l(parcel, 6, g02 != null ? g02.asBinder() : null, false);
        W6.c.u(parcel, 8, this.f38434g, false);
        W6.c.b(parcel, a10);
    }
}
