package G7;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class a extends W6.a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    public final PointF[] f2936a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2937b;

    public a(PointF[] pointFArr, int i10) {
        this.f2936a = pointFArr;
        this.f2937b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.x(parcel, 2, this.f2936a, i10, false);
        W6.c.m(parcel, 3, this.f2937b);
        W6.c.b(parcel, a10);
    }
}
