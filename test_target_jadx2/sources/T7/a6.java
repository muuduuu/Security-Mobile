package t7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class a6 extends W6.a {
    public static final Parcelable.Creator<a6> CREATOR = new b6();

    /* renamed from: a, reason: collision with root package name */
    private final int f42820a;

    /* renamed from: b, reason: collision with root package name */
    private final int f42821b;

    /* renamed from: c, reason: collision with root package name */
    private final int f42822c;

    /* renamed from: d, reason: collision with root package name */
    private final int f42823d;

    /* renamed from: e, reason: collision with root package name */
    private final long f42824e;

    public a6(int i10, int i11, int i12, int i13, long j10) {
        this.f42820a = i10;
        this.f42821b = i11;
        this.f42822c = i12;
        this.f42823d = i13;
        this.f42824e = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f42820a);
        W6.c.m(parcel, 2, this.f42821b);
        W6.c.m(parcel, 3, this.f42822c);
        W6.c.m(parcel, 4, this.f42823d);
        W6.c.q(parcel, 5, this.f42824e);
        W6.c.b(parcel, a10);
    }
}
