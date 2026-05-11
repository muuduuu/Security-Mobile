package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class Q8 extends W6.a {
    public static final Parcelable.Creator<Q8> CREATOR = new f9();

    /* renamed from: a, reason: collision with root package name */
    private final int f39642a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39643b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39644c;

    /* renamed from: d, reason: collision with root package name */
    private final String f39645d;

    public Q8(int i10, String str, String str2, String str3) {
        this.f39642a = i10;
        this.f39643b = str;
        this.f39644c = str2;
        this.f39645d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f39642a);
        W6.c.u(parcel, 2, this.f39643b, false);
        W6.c.u(parcel, 3, this.f39644c, false);
        W6.c.u(parcel, 4, this.f39645d, false);
        W6.c.b(parcel, a10);
    }
}
