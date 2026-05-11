package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class U5 extends W6.a {
    public static final Parcelable.Creator<U5> CREATOR = new C4059d();

    /* renamed from: a, reason: collision with root package name */
    public String f39752a;

    /* renamed from: b, reason: collision with root package name */
    public String f39753b;

    /* renamed from: c, reason: collision with root package name */
    public String f39754c;

    /* renamed from: d, reason: collision with root package name */
    public String f39755d;

    /* renamed from: e, reason: collision with root package name */
    public String f39756e;

    /* renamed from: f, reason: collision with root package name */
    public String f39757f;

    /* renamed from: g, reason: collision with root package name */
    public String f39758g;

    public U5(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f39752a = str;
        this.f39753b = str2;
        this.f39754c = str3;
        this.f39755d = str4;
        this.f39756e = str5;
        this.f39757f = str6;
        this.f39758g = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 2, this.f39752a, false);
        W6.c.u(parcel, 3, this.f39753b, false);
        W6.c.u(parcel, 4, this.f39754c, false);
        W6.c.u(parcel, 5, this.f39755d, false);
        W6.c.u(parcel, 6, this.f39756e, false);
        W6.c.u(parcel, 7, this.f39757f, false);
        W6.c.u(parcel, 8, this.f39758g, false);
        W6.c.b(parcel, a10);
    }
}
