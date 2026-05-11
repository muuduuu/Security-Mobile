package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class U8 extends W6.a {
    public static final Parcelable.Creator<U8> CREATOR = new n9();

    /* renamed from: a, reason: collision with root package name */
    private final String f39762a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39763b;

    public U8(String str, String str2) {
        this.f39762a = str;
        this.f39763b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 1, this.f39762a, false);
        W6.c.u(parcel, 2, this.f39763b, false);
        W6.c.b(parcel, a10);
    }
}
