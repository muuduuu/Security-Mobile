package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class P8 extends W6.a {
    public static final Parcelable.Creator<P8> CREATOR = new e9();

    /* renamed from: a, reason: collision with root package name */
    private final String f39605a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39606b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39607c;

    /* renamed from: d, reason: collision with root package name */
    private final String f39608d;

    /* renamed from: e, reason: collision with root package name */
    private final String f39609e;

    /* renamed from: f, reason: collision with root package name */
    private final String f39610f;

    /* renamed from: g, reason: collision with root package name */
    private final String f39611g;

    /* renamed from: h, reason: collision with root package name */
    private final String f39612h;

    /* renamed from: i, reason: collision with root package name */
    private final String f39613i;

    /* renamed from: j, reason: collision with root package name */
    private final String f39614j;

    /* renamed from: k, reason: collision with root package name */
    private final String f39615k;

    /* renamed from: l, reason: collision with root package name */
    private final String f39616l;

    /* renamed from: m, reason: collision with root package name */
    private final String f39617m;

    /* renamed from: n, reason: collision with root package name */
    private final String f39618n;

    public P8(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f39605a = str;
        this.f39606b = str2;
        this.f39607c = str3;
        this.f39608d = str4;
        this.f39609e = str5;
        this.f39610f = str6;
        this.f39611g = str7;
        this.f39612h = str8;
        this.f39613i = str9;
        this.f39614j = str10;
        this.f39615k = str11;
        this.f39616l = str12;
        this.f39617m = str13;
        this.f39618n = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 1, this.f39605a, false);
        W6.c.u(parcel, 2, this.f39606b, false);
        W6.c.u(parcel, 3, this.f39607c, false);
        W6.c.u(parcel, 4, this.f39608d, false);
        W6.c.u(parcel, 5, this.f39609e, false);
        W6.c.u(parcel, 6, this.f39610f, false);
        W6.c.u(parcel, 7, this.f39611g, false);
        W6.c.u(parcel, 8, this.f39612h, false);
        W6.c.u(parcel, 9, this.f39613i, false);
        W6.c.u(parcel, 10, this.f39614j, false);
        W6.c.u(parcel, 11, this.f39615k, false);
        W6.c.u(parcel, 12, this.f39616l, false);
        W6.c.u(parcel, 13, this.f39617m, false);
        W6.c.u(parcel, 14, this.f39618n, false);
        W6.c.b(parcel, a10);
    }
}
