package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class R8 extends W6.a {
    public static final Parcelable.Creator<R8> CREATOR = new g9();

    /* renamed from: a, reason: collision with root package name */
    private final double f39671a;

    /* renamed from: b, reason: collision with root package name */
    private final double f39672b;

    public R8(double d10, double d11) {
        this.f39671a = d10;
        this.f39672b = d11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.h(parcel, 1, this.f39671a);
        W6.c.h(parcel, 2, this.f39672b);
        W6.c.b(parcel, a10);
    }
}
