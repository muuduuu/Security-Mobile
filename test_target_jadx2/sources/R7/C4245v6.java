package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r7.v6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4245v6 extends W6.a {
    public static final Parcelable.Creator<C4245v6> CREATOR = new C4069e();

    /* renamed from: a, reason: collision with root package name */
    public int f40337a;

    /* renamed from: b, reason: collision with root package name */
    public String f40338b;

    public C4245v6(int i10, String str) {
        this.f40337a = i10;
        this.f40338b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 2, this.f40337a);
        W6.c.u(parcel, 3, this.f40338b, false);
        W6.c.b(parcel, a10);
    }
}
