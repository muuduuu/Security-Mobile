package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r7.t5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4224t5 extends W6.a {
    public static final Parcelable.Creator<C4224t5> CREATOR = new C4049c();

    /* renamed from: a, reason: collision with root package name */
    public double f40289a;

    /* renamed from: b, reason: collision with root package name */
    public double f40290b;

    public C4224t5(double d10, double d11) {
        this.f40289a = d10;
        this.f40290b = d11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.h(parcel, 2, this.f40289a);
        W6.c.h(parcel, 3, this.f40290b);
        W6.c.b(parcel, a10);
    }
}
