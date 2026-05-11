package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class S8 extends W6.a {
    public static final Parcelable.Creator<S8> CREATOR = new l9();

    /* renamed from: a, reason: collision with root package name */
    private final String f39696a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39697b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39698c;

    /* renamed from: d, reason: collision with root package name */
    private final String f39699d;

    /* renamed from: e, reason: collision with root package name */
    private final String f39700e;

    /* renamed from: f, reason: collision with root package name */
    private final String f39701f;

    /* renamed from: g, reason: collision with root package name */
    private final String f39702g;

    public S8(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f39696a = str;
        this.f39697b = str2;
        this.f39698c = str3;
        this.f39699d = str4;
        this.f39700e = str5;
        this.f39701f = str6;
        this.f39702g = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 1, this.f39696a, false);
        W6.c.u(parcel, 2, this.f39697b, false);
        W6.c.u(parcel, 3, this.f39698c, false);
        W6.c.u(parcel, 4, this.f39699d, false);
        W6.c.u(parcel, 5, this.f39700e, false);
        W6.c.u(parcel, 6, this.f39701f, false);
        W6.c.u(parcel, 7, this.f39702g, false);
        W6.c.b(parcel, a10);
    }
}
