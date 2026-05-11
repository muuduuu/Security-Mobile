package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r7.p3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4183p3 extends W6.a {
    public static final Parcelable.Creator<C4183p3> CREATOR = new t9();

    /* renamed from: a, reason: collision with root package name */
    public String f40193a;

    /* renamed from: b, reason: collision with root package name */
    public String f40194b;

    /* renamed from: c, reason: collision with root package name */
    public String f40195c;

    /* renamed from: d, reason: collision with root package name */
    public String f40196d;

    /* renamed from: e, reason: collision with root package name */
    public String f40197e;

    /* renamed from: f, reason: collision with root package name */
    public O2 f40198f;

    /* renamed from: g, reason: collision with root package name */
    public O2 f40199g;

    public C4183p3(String str, String str2, String str3, String str4, String str5, O2 o22, O2 o23) {
        this.f40193a = str;
        this.f40194b = str2;
        this.f40195c = str3;
        this.f40196d = str4;
        this.f40197e = str5;
        this.f40198f = o22;
        this.f40199g = o23;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 2, this.f40193a, false);
        W6.c.u(parcel, 3, this.f40194b, false);
        W6.c.u(parcel, 4, this.f40195c, false);
        W6.c.u(parcel, 5, this.f40196d, false);
        W6.c.u(parcel, 6, this.f40197e, false);
        W6.c.s(parcel, 7, this.f40198f, i10, false);
        W6.c.s(parcel, 8, this.f40199g, i10, false);
        W6.c.b(parcel, a10);
    }
}
