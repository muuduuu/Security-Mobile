package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class T8 extends W6.a {
    public static final Parcelable.Creator<T8> CREATOR = new m9();

    /* renamed from: a, reason: collision with root package name */
    private final int f39722a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39723b;

    public T8(int i10, String str) {
        this.f39722a = i10;
        this.f39723b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f39722a);
        W6.c.u(parcel, 2, this.f39723b, false);
        W6.c.b(parcel, a10);
    }
}
