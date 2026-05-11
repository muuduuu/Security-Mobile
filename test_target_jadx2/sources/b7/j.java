package B7;

import V6.V;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class j extends W6.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    final int f526a;

    /* renamed from: b, reason: collision with root package name */
    final V f527b;

    j(int i10, V v10) {
        this.f526a = i10;
        this.f527b = v10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f526a);
        W6.c.s(parcel, 2, this.f527b, i10, false);
        W6.c.b(parcel, a10);
    }
}
