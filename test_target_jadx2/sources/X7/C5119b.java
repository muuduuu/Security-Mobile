package x7;

import V6.AbstractC1286q;
import V6.AbstractC1287s;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Comparator;

/* renamed from: x7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5119b extends W6.a {

    /* renamed from: a, reason: collision with root package name */
    int f44841a;

    /* renamed from: b, reason: collision with root package name */
    int f44842b;

    /* renamed from: c, reason: collision with root package name */
    public static final Comparator f44840c = new C();
    public static final Parcelable.Creator<C5119b> CREATOR = new D();

    public C5119b(int i10, int i11) {
        this.f44841a = i10;
        this.f44842b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5119b) {
            C5119b c5119b = (C5119b) obj;
            if (this.f44841a == c5119b.f44841a && this.f44842b == c5119b.f44842b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1286q.b(Integer.valueOf(this.f44841a), Integer.valueOf(this.f44842b));
    }

    public int j() {
        return this.f44842b;
    }

    public String toString() {
        int u10 = u();
        return "DetectedActivity [type=" + (u10 != 0 ? u10 != 1 ? u10 != 2 ? u10 != 3 ? u10 != 4 ? u10 != 5 ? u10 != 7 ? u10 != 8 ? u10 != 16 ? u10 != 17 ? Integer.toString(u10) : "IN_RAIL_VEHICLE" : "IN_ROAD_VEHICLE" : "RUNNING" : "WALKING" : "TILTING" : "UNKNOWN" : "STILL" : "ON_FOOT" : "ON_BICYCLE" : "IN_VEHICLE") + ", confidence=" + this.f44842b + "]";
    }

    public int u() {
        int i10 = this.f44841a;
        if (i10 > 22 || i10 < 0) {
            return 4;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        AbstractC1287s.m(parcel);
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f44841a);
        W6.c.m(parcel, 2, this.f44842b);
        W6.c.b(parcel, a10);
    }
}
