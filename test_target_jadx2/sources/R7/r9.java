package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class r9 extends W6.a {
    public static final Parcelable.Creator<r9> CREATOR = new s9();

    /* renamed from: a, reason: collision with root package name */
    private final int f40244a;

    /* renamed from: b, reason: collision with root package name */
    private final int f40245b;

    /* renamed from: c, reason: collision with root package name */
    private final int f40246c;

    /* renamed from: d, reason: collision with root package name */
    private final int f40247d;

    /* renamed from: e, reason: collision with root package name */
    private final long f40248e;

    public r9(int i10, int i11, int i12, int i13, long j10) {
        this.f40244a = i10;
        this.f40245b = i11;
        this.f40246c = i12;
        this.f40247d = i13;
        this.f40248e = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f40244a);
        W6.c.m(parcel, 2, this.f40245b);
        W6.c.m(parcel, 3, this.f40246c);
        W6.c.m(parcel, 4, this.f40247d);
        W6.c.q(parcel, 5, this.f40248e);
        W6.c.b(parcel, a10);
    }
}
