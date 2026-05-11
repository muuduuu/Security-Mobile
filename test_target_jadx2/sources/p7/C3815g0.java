package p7;

import V6.AbstractC1286q;
import V6.C1269d;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import java.util.Iterator;
import java.util.List;

/* renamed from: p7.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3815g0 extends W6.a {
    public static final Parcelable.Creator<C3815g0> CREATOR = new C3817h0();

    /* renamed from: a, reason: collision with root package name */
    LocationRequest f38426a;

    C3815g0(LocationRequest locationRequest, List list, boolean z10, boolean z11, String str, boolean z12, boolean z13, String str2, long j10) {
        WorkSource workSource;
        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C1269d c1269d = (C1269d) it.next();
                    com.google.android.gms.common.util.s.a(workSource, c1269d.f10924a, c1269d.f10925b);
                }
            }
            aVar.m(workSource);
        }
        if (z10) {
            aVar.c(1);
        }
        if (z11) {
            aVar.l(2);
        }
        if (str != null) {
            aVar.k(str);
        } else if (str2 != null) {
            aVar.k(str2);
        }
        if (z12) {
            aVar.j(true);
        }
        if (z13) {
            aVar.i(true);
        }
        if (j10 != Long.MAX_VALUE) {
            aVar.d(j10);
        }
        this.f38426a = aVar.a();
    }

    public static C3815g0 j(String str, LocationRequest locationRequest) {
        return new C3815g0(locationRequest, null, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3815g0) {
            return AbstractC1286q.a(this.f38426a, ((C3815g0) obj).f38426a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38426a.hashCode();
    }

    public final String toString() {
        return this.f38426a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.s(parcel, 1, this.f38426a, i10, false);
        W6.c.b(parcel, a10);
    }
}
