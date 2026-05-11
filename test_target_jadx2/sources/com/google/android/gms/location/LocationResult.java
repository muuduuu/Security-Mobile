package com.google.android.gms.location;

import V6.AbstractC1286q;
import W6.e;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class LocationResult extends W6.a implements ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    private final List f25272a;

    /* renamed from: b, reason: collision with root package name */
    static final List f25271b = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new c();

    LocationResult(List list) {
        this.f25272a = list;
    }

    public static boolean I(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT") || intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT_BYTES");
    }

    public static LocationResult j(Intent intent) {
        if (!I(intent)) {
            return null;
        }
        LocationResult locationResult = (LocationResult) e.b(intent, "com.google.android.gms.location.EXTRA_LOCATION_RESULT_BYTES", CREATOR);
        return locationResult == null ? (LocationResult) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT") : locationResult;
    }

    public List F() {
        return this.f25272a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (Build.VERSION.SDK_INT >= 31) {
            return this.f25272a.equals(locationResult.f25272a);
        }
        if (this.f25272a.size() != locationResult.f25272a.size()) {
            return false;
        }
        Iterator it = locationResult.f25272a.iterator();
        for (Location location : this.f25272a) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !AbstractC1286q.a(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbstractC1286q.b(this.f25272a);
    }

    public String toString() {
        return "LocationResult".concat(String.valueOf(this.f25272a));
    }

    public Location u() {
        int size = this.f25272a.size();
        if (size == 0) {
            return null;
        }
        return (Location) this.f25272a.get(size - 1);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.y(parcel, 1, F(), false);
        W6.c.b(parcel, a10);
    }
}
