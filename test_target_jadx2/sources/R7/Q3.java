package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class Q3 extends W6.a {
    public static final Parcelable.Creator<Q3> CREATOR = new u9();

    /* renamed from: a, reason: collision with root package name */
    public U5 f39627a;

    /* renamed from: b, reason: collision with root package name */
    public String f39628b;

    /* renamed from: c, reason: collision with root package name */
    public String f39629c;

    /* renamed from: d, reason: collision with root package name */
    public C4245v6[] f39630d;

    /* renamed from: e, reason: collision with root package name */
    public S4[] f39631e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f39632f;

    /* renamed from: g, reason: collision with root package name */
    public C4162n2[] f39633g;

    public Q3(U5 u52, String str, String str2, C4245v6[] c4245v6Arr, S4[] s4Arr, String[] strArr, C4162n2[] c4162n2Arr) {
        this.f39627a = u52;
        this.f39628b = str;
        this.f39629c = str2;
        this.f39630d = c4245v6Arr;
        this.f39631e = s4Arr;
        this.f39632f = strArr;
        this.f39633g = c4162n2Arr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.s(parcel, 2, this.f39627a, i10, false);
        W6.c.u(parcel, 3, this.f39628b, false);
        W6.c.u(parcel, 4, this.f39629c, false);
        W6.c.x(parcel, 5, this.f39630d, i10, false);
        W6.c.x(parcel, 6, this.f39631e, i10, false);
        W6.c.v(parcel, 7, this.f39632f, false);
        W6.c.x(parcel, 8, this.f39633g, i10, false);
        W6.c.b(parcel, a10);
    }
}
