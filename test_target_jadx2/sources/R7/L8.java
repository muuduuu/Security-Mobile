package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class L8 extends W6.a {
    public static final Parcelable.Creator<L8> CREATOR = new b9();

    /* renamed from: a, reason: collision with root package name */
    private final int f39499a;

    /* renamed from: b, reason: collision with root package name */
    private final int f39500b;

    /* renamed from: c, reason: collision with root package name */
    private final int f39501c;

    /* renamed from: d, reason: collision with root package name */
    private final int f39502d;

    /* renamed from: e, reason: collision with root package name */
    private final int f39503e;

    /* renamed from: f, reason: collision with root package name */
    private final int f39504f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f39505g;

    /* renamed from: h, reason: collision with root package name */
    private final String f39506h;

    public L8(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.f39499a = i10;
        this.f39500b = i11;
        this.f39501c = i12;
        this.f39502d = i13;
        this.f39503e = i14;
        this.f39504f = i15;
        this.f39505g = z10;
        this.f39506h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f39499a);
        W6.c.m(parcel, 2, this.f39500b);
        W6.c.m(parcel, 3, this.f39501c);
        W6.c.m(parcel, 4, this.f39502d);
        W6.c.m(parcel, 5, this.f39503e);
        W6.c.m(parcel, 6, this.f39504f);
        W6.c.c(parcel, 7, this.f39505g);
        W6.c.u(parcel, 8, this.f39506h, false);
        W6.c.b(parcel, a10);
    }
}
