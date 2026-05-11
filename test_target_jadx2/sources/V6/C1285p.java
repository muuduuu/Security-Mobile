package V6;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: V6.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1285p extends W6.a {
    public static final Parcelable.Creator<C1285p> CREATOR = new P();

    /* renamed from: a, reason: collision with root package name */
    private final int f10992a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10993b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10994c;

    /* renamed from: d, reason: collision with root package name */
    private final long f10995d;

    /* renamed from: e, reason: collision with root package name */
    private final long f10996e;

    /* renamed from: f, reason: collision with root package name */
    private final String f10997f;

    /* renamed from: g, reason: collision with root package name */
    private final String f10998g;

    /* renamed from: h, reason: collision with root package name */
    private final int f10999h;

    /* renamed from: i, reason: collision with root package name */
    private final int f11000i;

    public C1285p(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13) {
        this(i10, i11, i12, j10, j11, str, str2, i13, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f10992a;
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, i11);
        W6.c.m(parcel, 2, this.f10993b);
        W6.c.m(parcel, 3, this.f10994c);
        W6.c.q(parcel, 4, this.f10995d);
        W6.c.q(parcel, 5, this.f10996e);
        W6.c.u(parcel, 6, this.f10997f, false);
        W6.c.u(parcel, 7, this.f10998g, false);
        W6.c.m(parcel, 8, this.f10999h);
        W6.c.m(parcel, 9, this.f11000i);
        W6.c.b(parcel, a10);
    }

    public C1285p(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f10992a = i10;
        this.f10993b = i11;
        this.f10994c = i12;
        this.f10995d = j10;
        this.f10996e = j11;
        this.f10997f = str;
        this.f10998g = str2;
        this.f10999h = i13;
        this.f11000i = i14;
    }
}
