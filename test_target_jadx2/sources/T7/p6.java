package t7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class p6 extends W6.a {
    public static final Parcelable.Creator<p6> CREATOR = new q6();

    /* renamed from: a, reason: collision with root package name */
    public int f43191a;

    /* renamed from: b, reason: collision with root package name */
    public int f43192b;

    /* renamed from: c, reason: collision with root package name */
    public int f43193c;

    /* renamed from: d, reason: collision with root package name */
    public long f43194d;

    /* renamed from: e, reason: collision with root package name */
    public int f43195e;

    public p6(int i10, int i11, int i12, long j10, int i13) {
        this.f43191a = i10;
        this.f43192b = i11;
        this.f43193c = i12;
        this.f43194d = j10;
        this.f43195e = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 2, this.f43191a);
        W6.c.m(parcel, 3, this.f43192b);
        W6.c.m(parcel, 4, this.f43193c);
        W6.c.q(parcel, 5, this.f43194d);
        W6.c.m(parcel, 6, this.f43195e);
        W6.c.b(parcel, a10);
    }
}
