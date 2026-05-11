package com.webengage.sdk.android;

import D7.AbstractC0789m;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import x7.AbstractC5131n;
import x7.C5126i;
import x7.C5127j;
import x7.InterfaceC5121d;
import x7.InterfaceC5122e;
import x7.InterfaceC5125h;

/* loaded from: classes2.dex */
class t1 extends r1 {

    /* renamed from: a, reason: collision with root package name */
    public Context f30816a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC5121d f30817b;

    /* renamed from: c, reason: collision with root package name */
    LocationRequest f30818c = null;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC5125h f30819d;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        String f30820a;

        /* renamed from: b, reason: collision with root package name */
        Location f30821b;

        /* renamed from: c, reason: collision with root package name */
        int f30822c;

        public a(String str, Location location, int i10) {
            this.f30820a = str;
            this.f30821b = location;
            this.f30822c = i10;
        }

        public String a() {
            return this.f30820a;
        }

        public Location b() {
            return this.f30821b;
        }

        public int c() {
            return this.f30822c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            String str = this.f30820a;
            if (str != null) {
                return str.equals(aVar.f30820a);
            }
            return false;
        }

        public int hashCode() {
            String str = this.f30820a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "GeoFenceTransition: {\n id: " + this.f30820a + ", Location: " + this.f30821b + ", Transition: " + this.f30822c + "\n}";
        }
    }

    public t1(Context context) {
        this.f30816a = context.getApplicationContext();
        this.f30817b = AbstractC5131n.a(context);
        this.f30819d = AbstractC5131n.b(context);
    }

    @Override // com.webengage.sdk.android.r1
    public Location a() {
        Location location;
        if (androidx.core.content.a.a(this.f30816a, "android.permission.ACCESS_FINE_LOCATION") != 0 && androidx.core.content.a.a(this.f30816a, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            Logger.d("WebEngage", "Location Permission not granted, hence not fetching lastKnownLocation");
            return null;
        }
        if (!n2.i()) {
            Logger.e("WebEngage", "Kindly update play-services-location API to 21.0.1 or higher to fetch the last known location.");
            return null;
        }
        try {
            location = (Location) AbstractC0789m.b(this.f30817b.b(), 5000L, TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            Logger.d("WebEngage", "Exception occurred while fetching last known location " + e10.toString());
        }
        if (location != null) {
            return location;
        }
        return null;
    }

    @Override // com.webengage.sdk.android.r1
    public Location b(Intent intent) {
        if (n2.m() && LocationResult.I(intent)) {
            return LocationResult.j(intent).u();
        }
        return null;
    }

    @Override // com.webengage.sdk.android.r1
    public List<a> a(Intent intent) {
        C5126i a10;
        List c10;
        try {
            if (!n2.d() || (a10 = C5126i.a(intent)) == null || a10.e() || (c10 = a10.c()) == null || c10.size() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = c10.iterator();
            while (it.hasNext()) {
                arrayList.add(new a(((InterfaceC5122e) it.next()).e(), a10.d(), a10.b()));
            }
            return arrayList;
        } catch (Exception e10) {
            Logger.e("WebEngage", "Exception while detecting geofence transition " + e10);
            return null;
        }
    }

    @Override // com.webengage.sdk.android.r1
    protected void b() {
        if (!PendingIntentFactory.g(this.f30816a)) {
            Logger.d("WebEngage", "Location pending intent does not exists, no need to unregister");
        } else if (n2.i()) {
            Logger.d("WebEngage", "UnRegistering from location updates ");
            PendingIntent c10 = PendingIntentFactory.c(this.f30816a);
            this.f30817b.n(c10);
            c10.cancel();
        }
    }

    @Override // com.webengage.sdk.android.r1
    public void a(double d10, double d11, float f10, String str, WebEngageConfig webEngageConfig) {
        if (androidx.core.content.a.a(this.f30816a, "android.permission.ACCESS_FINE_LOCATION") != 0 || (Build.VERSION.SDK_INT >= 29 && androidx.core.content.a.a(this.f30816a, "android.permission.ACCESS_BACKGROUND_LOCATION") != 0)) {
            Logger.d("WebEngage", "ACCESS_FINE_LOCATION and ACCESS_BACKGROUND_LOCATION are required to activate for geofence");
            return;
        }
        if (!n2.e() || !n2.f() || !n2.j()) {
            Logger.e("WebEngage", "Kindly update play-services-location to v21.0.1 or higher to register for register geofence.");
            return;
        }
        this.f30819d.l(new C5127j.a().c(4).a(new InterfaceC5122e.a().b(d10, d11, f10).d(str).c(-1L).e(3).a()).b(), PendingIntentFactory.b(this.f30816a));
        if (webEngageConfig == null || webEngageConfig.getLocationTrackingStrategy() == LocationTrackingStrategy.ACCURACY_BEST) {
            return;
        }
        Logger.w("WebEngage", "Current location tracking strategy is " + webEngageConfig.getLocationTrackingStrategy() + ", for better geofencing results use WebEngage.get().setLocationTrackingStrategy(LocationTrackingStrategy.ACCURACY_BEST)");
    }

    @Override // com.webengage.sdk.android.r1
    protected void a(long j10, long j11, float f10, int i10) {
        if (!n2.l()) {
            Logger.e("WebEngage", "Kindly update play-services-location to v21.0.1 or higher to register for location updates ");
            return;
        }
        LocationRequest a10 = new LocationRequest.a(i10, j10).g(j11).f(f10).a();
        this.f30818c = a10;
        a(a10, this.f30816a);
    }

    private void a(LocationRequest locationRequest, Context context) {
        if (locationRequest == null || context == null || !n2.i()) {
            return;
        }
        PendingIntent c10 = PendingIntentFactory.c(context.getApplicationContext());
        if (androidx.core.content.a.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || androidx.core.content.a.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            this.f30817b.j(locationRequest, c10);
        } else {
            Logger.d("WebEngage", "Location Permission not granted, hence not registering Location Updates");
        }
    }

    @Override // com.webengage.sdk.android.r1
    public void a(List<String> list) {
        if (n2.j()) {
            this.f30819d.a(PendingIntentFactory.b(this.f30816a));
        }
    }
}
