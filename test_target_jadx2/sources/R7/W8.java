package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class W8 extends W6.a {
    public static final Parcelable.Creator<W8> CREATOR = new q9();

    /* renamed from: a, reason: collision with root package name */
    private final String f39810a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39811b;

    /* renamed from: c, reason: collision with root package name */
    private final int f39812c;

    public W8(String str, String str2, int i10) {
        this.f39810a = str;
        this.f39811b = str2;
        this.f39812c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 1, this.f39810a, false);
        W6.c.u(parcel, 2, this.f39811b, false);
        W6.c.m(parcel, 3, this.f39812c);
        W6.c.b(parcel, a10);
    }
}
