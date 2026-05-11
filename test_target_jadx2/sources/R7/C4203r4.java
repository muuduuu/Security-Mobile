package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r7.r4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4203r4 extends W6.a {
    public static final Parcelable.Creator<C4203r4> CREATOR = new v9();

    /* renamed from: a, reason: collision with root package name */
    public String f40230a;

    /* renamed from: b, reason: collision with root package name */
    public String f40231b;

    /* renamed from: c, reason: collision with root package name */
    public String f40232c;

    /* renamed from: d, reason: collision with root package name */
    public String f40233d;

    /* renamed from: e, reason: collision with root package name */
    public String f40234e;

    /* renamed from: f, reason: collision with root package name */
    public String f40235f;

    /* renamed from: g, reason: collision with root package name */
    public String f40236g;

    /* renamed from: h, reason: collision with root package name */
    public String f40237h;

    /* renamed from: i, reason: collision with root package name */
    public String f40238i;

    /* renamed from: j, reason: collision with root package name */
    public String f40239j;

    /* renamed from: k, reason: collision with root package name */
    public String f40240k;

    /* renamed from: l, reason: collision with root package name */
    public String f40241l;

    /* renamed from: m, reason: collision with root package name */
    public String f40242m;

    /* renamed from: n, reason: collision with root package name */
    public String f40243n;

    public C4203r4(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f40230a = str;
        this.f40231b = str2;
        this.f40232c = str3;
        this.f40233d = str4;
        this.f40234e = str5;
        this.f40235f = str6;
        this.f40236g = str7;
        this.f40237h = str8;
        this.f40238i = str9;
        this.f40239j = str10;
        this.f40240k = str11;
        this.f40241l = str12;
        this.f40242m = str13;
        this.f40243n = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 2, this.f40230a, false);
        W6.c.u(parcel, 3, this.f40231b, false);
        W6.c.u(parcel, 4, this.f40232c, false);
        W6.c.u(parcel, 5, this.f40233d, false);
        W6.c.u(parcel, 6, this.f40234e, false);
        W6.c.u(parcel, 7, this.f40235f, false);
        W6.c.u(parcel, 8, this.f40236g, false);
        W6.c.u(parcel, 9, this.f40237h, false);
        W6.c.u(parcel, 10, this.f40238i, false);
        W6.c.u(parcel, 11, this.f40239j, false);
        W6.c.u(parcel, 12, this.f40240k, false);
        W6.c.u(parcel, 13, this.f40241l, false);
        W6.c.u(parcel, 14, this.f40242m, false);
        W6.c.u(parcel, 15, this.f40243n, false);
        W6.c.b(parcel, a10);
    }
}
