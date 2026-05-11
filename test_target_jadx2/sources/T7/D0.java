package t7;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class D0 extends W6.a {
    public static final Parcelable.Creator<D0> CREATOR = new C4669e1();

    /* renamed from: a, reason: collision with root package name */
    public final PointF[] f42457a;

    /* renamed from: b, reason: collision with root package name */
    public final int f42458b;

    public D0(PointF[] pointFArr, int i10) {
        this.f42457a = pointFArr;
        this.f42458b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.x(parcel, 2, this.f42457a, i10, false);
        W6.c.m(parcel, 3, this.f42458b);
        W6.c.b(parcel, a10);
    }
}
