package V6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2012d;

/* loaded from: classes2.dex */
public final class r0 extends W6.a {
    public static final Parcelable.Creator<r0> CREATOR = new s0();

    /* renamed from: a, reason: collision with root package name */
    Bundle f11007a;

    /* renamed from: b, reason: collision with root package name */
    C2012d[] f11008b;

    /* renamed from: c, reason: collision with root package name */
    int f11009c;

    /* renamed from: d, reason: collision with root package name */
    C1273f f11010d;

    r0(Bundle bundle, C2012d[] c2012dArr, int i10, C1273f c1273f) {
        this.f11007a = bundle;
        this.f11008b = c2012dArr;
        this.f11009c = i10;
        this.f11010d = c1273f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.e(parcel, 1, this.f11007a, false);
        W6.c.x(parcel, 2, this.f11008b, i10, false);
        W6.c.m(parcel, 3, this.f11009c);
        W6.c.s(parcel, 4, this.f11010d, i10, false);
        W6.c.b(parcel, a10);
    }
}
