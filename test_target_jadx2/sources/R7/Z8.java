package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class Z8 extends W6.a {
    public static final Parcelable.Creator<Z8> CREATOR = new a9();

    /* renamed from: a, reason: collision with root package name */
    private final int f39889a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39890b;

    public Z8(int i10, boolean z10) {
        this.f39889a = i10;
        this.f39890b = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f39889a);
        W6.c.c(parcel, 2, this.f39890b);
        W6.c.b(parcel, a10);
    }
}
