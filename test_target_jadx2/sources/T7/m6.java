package t7;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class m6 extends W6.a {
    public static final Parcelable.Creator<m6> CREATOR = new o6();

    /* renamed from: a, reason: collision with root package name */
    private final int f43076a;

    /* renamed from: b, reason: collision with root package name */
    private final PointF f43077b;

    public m6(int i10, PointF pointF) {
        this.f43076a = i10;
        this.f43077b = pointF;
    }

    public final int j() {
        return this.f43076a;
    }

    public final PointF u() {
        return this.f43077b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f43076a);
        W6.c.s(parcel, 2, this.f43077b, i10, false);
        W6.c.b(parcel, a10);
    }
}
