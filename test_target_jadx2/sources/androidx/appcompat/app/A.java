package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
class A {

    /* renamed from: d, reason: collision with root package name */
    private static A f13001d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f13002a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f13003b;

    /* renamed from: c, reason: collision with root package name */
    private final a f13004c = new a();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f13005a;

        /* renamed from: b, reason: collision with root package name */
        long f13006b;

        a() {
        }
    }

    A(Context context, LocationManager locationManager) {
        this.f13002a = context;
        this.f13003b = locationManager;
    }

    static A a(Context context) {
        if (f13001d == null) {
            Context applicationContext = context.getApplicationContext();
            f13001d = new A(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f13001d;
    }

    private Location b() {
        Location c10 = androidx.core.content.e.c(this.f13002a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c11 = androidx.core.content.e.c(this.f13002a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c11 == null || c10 == null) ? c11 != null ? c11 : c10 : c11.getTime() > c10.getTime() ? c11 : c10;
    }

    private Location c(String str) {
        try {
            if (this.f13003b.isProviderEnabled(str)) {
                return this.f13003b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        return this.f13004c.f13006b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f13004c;
        long currentTimeMillis = System.currentTimeMillis();
        z b10 = z.b();
        b10.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        b10.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = b10.f13313c == 1;
        long j11 = b10.f13312b;
        long j12 = b10.f13311a;
        b10.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j13 = b10.f13312b;
        if (j11 == -1 || j12 == -1) {
            j10 = currentTimeMillis + 43200000;
        } else {
            if (currentTimeMillis <= j12) {
                j13 = currentTimeMillis > j11 ? j12 : j11;
            }
            j10 = j13 + 60000;
        }
        aVar.f13005a = z10;
        aVar.f13006b = j10;
    }

    boolean d() {
        a aVar = this.f13004c;
        if (e()) {
            return aVar.f13005a;
        }
        Location b10 = b();
        if (b10 != null) {
            f(b10);
            return aVar.f13005a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
