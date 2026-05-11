package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class O2 extends W6.a {
    public static final Parcelable.Creator<O2> CREATOR = new o9();

    /* renamed from: a, reason: collision with root package name */
    public int f39562a;

    /* renamed from: b, reason: collision with root package name */
    public int f39563b;

    /* renamed from: c, reason: collision with root package name */
    public int f39564c;

    /* renamed from: d, reason: collision with root package name */
    public int f39565d;

    /* renamed from: e, reason: collision with root package name */
    public int f39566e;

    /* renamed from: f, reason: collision with root package name */
    public int f39567f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f39568g;

    /* renamed from: h, reason: collision with root package name */
    public String f39569h;

    public O2(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.f39562a = i10;
        this.f39563b = i11;
        this.f39564c = i12;
        this.f39565d = i13;
        this.f39566e = i14;
        this.f39567f = i15;
        this.f39568g = z10;
        this.f39569h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 2, this.f39562a);
        W6.c.m(parcel, 3, this.f39563b);
        W6.c.m(parcel, 4, this.f39564c);
        W6.c.m(parcel, 5, this.f39565d);
        W6.c.m(parcel, 6, this.f39566e);
        W6.c.m(parcel, 7, this.f39567f);
        W6.c.c(parcel, 8, this.f39568g);
        W6.c.u(parcel, 9, this.f39569h, false);
        W6.c.b(parcel, a10);
    }
}
