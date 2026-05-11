package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class S4 extends W6.a {
    public static final Parcelable.Creator<S4> CREATOR = new C4039b();

    /* renamed from: a, reason: collision with root package name */
    public int f39687a;

    /* renamed from: b, reason: collision with root package name */
    public String f39688b;

    /* renamed from: c, reason: collision with root package name */
    public String f39689c;

    /* renamed from: d, reason: collision with root package name */
    public String f39690d;

    public S4(int i10, String str, String str2, String str3) {
        this.f39687a = i10;
        this.f39688b = str;
        this.f39689c = str2;
        this.f39690d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 2, this.f39687a);
        W6.c.u(parcel, 3, this.f39688b, false);
        W6.c.u(parcel, 4, this.f39689c, false);
        W6.c.u(parcel, 5, this.f39690d, false);
        W6.c.b(parcel, a10);
    }
}
