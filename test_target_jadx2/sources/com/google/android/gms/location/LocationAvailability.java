package com.google.android.gms.location;

import V6.AbstractC1286q;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import x7.w;

/* loaded from: classes2.dex */
public final class LocationAvailability extends W6.a implements ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    private final int f25236a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25237b;

    /* renamed from: c, reason: collision with root package name */
    private final long f25238c;

    /* renamed from: d, reason: collision with root package name */
    int f25239d;

    /* renamed from: e, reason: collision with root package name */
    private final w[] f25240e;

    /* renamed from: f, reason: collision with root package name */
    public static final LocationAvailability f25234f = new LocationAvailability(0, 1, 1, 0, null, true);

    /* renamed from: g, reason: collision with root package name */
    public static final LocationAvailability f25235g = new LocationAvailability(1000, 1, 1, 0, null, false);
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new a();

    LocationAvailability(int i10, int i11, int i12, long j10, w[] wVarArr, boolean z10) {
        this.f25239d = i10 < 1000 ? 0 : 1000;
        this.f25236a = i11;
        this.f25237b = i12;
        this.f25238c = j10;
        this.f25240e = wVarArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f25236a == locationAvailability.f25236a && this.f25237b == locationAvailability.f25237b && this.f25238c == locationAvailability.f25238c && this.f25239d == locationAvailability.f25239d && Arrays.equals(this.f25240e, locationAvailability.f25240e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC1286q.b(Integer.valueOf(this.f25239d));
    }

    public boolean j() {
        return this.f25239d < 1000;
    }

    public String toString() {
        return "LocationAvailability[" + j() + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f25236a);
        W6.c.m(parcel, 2, this.f25237b);
        W6.c.q(parcel, 3, this.f25238c);
        W6.c.m(parcel, 4, this.f25239d);
        W6.c.x(parcel, 5, this.f25240e, i10, false);
        W6.c.c(parcel, 6, j());
        W6.c.b(parcel, a10);
    }
}
