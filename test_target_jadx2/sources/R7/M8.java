package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class M8 extends W6.a {
    public static final Parcelable.Creator<M8> CREATOR = new c9();

    /* renamed from: a, reason: collision with root package name */
    private final String f39526a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39527b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39528c;

    /* renamed from: d, reason: collision with root package name */
    private final String f39529d;

    /* renamed from: e, reason: collision with root package name */
    private final String f39530e;

    /* renamed from: f, reason: collision with root package name */
    private final L8 f39531f;

    /* renamed from: g, reason: collision with root package name */
    private final L8 f39532g;

    public M8(String str, String str2, String str3, String str4, String str5, L8 l82, L8 l83) {
        this.f39526a = str;
        this.f39527b = str2;
        this.f39528c = str3;
        this.f39529d = str4;
        this.f39530e = str5;
        this.f39531f = l82;
        this.f39532g = l83;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 1, this.f39526a, false);
        W6.c.u(parcel, 2, this.f39527b, false);
        W6.c.u(parcel, 3, this.f39528c, false);
        W6.c.u(parcel, 4, this.f39529d, false);
        W6.c.u(parcel, 5, this.f39530e, false);
        W6.c.s(parcel, 6, this.f39531f, i10, false);
        W6.c.s(parcel, 7, this.f39532g, i10, false);
        W6.c.b(parcel, a10);
    }
}
