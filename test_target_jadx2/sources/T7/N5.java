package t7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class N5 extends W6.a {
    public static final Parcelable.Creator<N5> CREATOR = new n6();

    /* renamed from: a, reason: collision with root package name */
    public final int f42631a;

    /* renamed from: b, reason: collision with root package name */
    public final float f42632b;

    /* renamed from: c, reason: collision with root package name */
    public final float f42633c;

    /* renamed from: d, reason: collision with root package name */
    public final int f42634d;

    public N5(int i10, float f10, float f11, int i11) {
        this.f42631a = i10;
        this.f42632b = f10;
        this.f42633c = f11;
        this.f42634d = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f42631a);
        W6.c.j(parcel, 2, this.f42632b);
        W6.c.j(parcel, 3, this.f42633c);
        W6.c.m(parcel, 4, this.f42634d);
        W6.c.b(parcel, a10);
    }
}
