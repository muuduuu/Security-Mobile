package co.hyperverge.hypersnapsdk.service.location;

import D7.InterfaceC0783g;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Looper;
import android.util.Log;
import co.hyperverge.hypersnapsdk.listeners.LocationProviderCallback;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import x7.AbstractC5129l;
import x7.AbstractC5131n;
import x7.C5132o;
import x7.InterfaceC5121d;

/* loaded from: classes.dex */
public class LocationServiceImpl implements LocationService {
    private static final String TAG = "co.hyperverge.hypersnapsdk.service.location.LocationServiceImpl";
    private static LocationServiceImpl locationProvider;
    private final Context applicationContext;
    private final InterfaceC5121d fusedLocationProviderClient;
    private LocationProviderCallback mLocationProviderCallback;
    private boolean isLocationUpdatesRunning = false;
    private final AbstractC5129l locationCallback = new AbstractC5129l() { // from class: co.hyperverge.hypersnapsdk.service.location.LocationServiceImpl.1
        @Override // x7.AbstractC5129l
        public void onLocationResult(LocationResult locationResult) {
            if (LocationServiceImpl.this.mLocationProviderCallback != null) {
                LocationServiceImpl.this.mLocationProviderCallback.onResult(locationResult.u());
            }
        }
    };
    private Location lastKnownLocation = null;

    private LocationServiceImpl(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.applicationContext = applicationContext;
        this.fusedLocationProviderClient = AbstractC5131n.a(applicationContext);
    }

    public static void destroy() {
        LocationServiceImpl locationServiceImpl = locationProvider;
        if (locationServiceImpl != null) {
            locationServiceImpl.stopLocationUpdates();
            locationProvider.mLocationProviderCallback = null;
            locationProvider = null;
        }
    }

    public static LocationServiceImpl getInstance(Context context) {
        if (locationProvider == null) {
            locationProvider = new LocationServiceImpl(context);
        }
        return locationProvider;
    }

    @Override // co.hyperverge.hypersnapsdk.service.location.LocationService
    public void addLocationCallback(LocationProviderCallback locationProviderCallback) {
        this.mLocationProviderCallback = locationProviderCallback;
    }

    @Override // co.hyperverge.hypersnapsdk.service.location.LocationService
    public Location getLastKnownLocation() {
        HVLogUtils.d(TAG, "getLastKnownLocation() called");
        try {
            this.fusedLocationProviderClient.b().f(new InterfaceC0783g() { // from class: co.hyperverge.hypersnapsdk.service.location.LocationServiceImpl.2
                @Override // D7.InterfaceC0783g
                public void onSuccess(Location location) {
                    if (location != null) {
                        LocationServiceImpl.this.lastKnownLocation = location;
                    }
                }
            });
        } catch (NoClassDefFoundError e10) {
            String str = TAG;
            HVLogUtils.e(str, "getLastKnownLocation(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.d(str, Utils.getErrorMessage(e10));
        }
        return this.lastKnownLocation;
    }

    @Override // co.hyperverge.hypersnapsdk.service.location.LocationService
    public boolean isGPSSwitchedOn() {
        return ((LocationManager) this.applicationContext.getSystemService("location")).isProviderEnabled("gps");
    }

    @Override // co.hyperverge.hypersnapsdk.service.location.LocationService
    public void startLocationUpdates() {
        HVLogUtils.d(TAG, "startLocationUpdates() called");
        this.isLocationUpdatesRunning = true;
        try {
            LocationRequest locationRequest = new LocationRequest();
            locationRequest.f2(5000L);
            locationRequest.e2(1000L);
            locationRequest.g2(500L);
            locationRequest.i2(100);
            new C5132o.a().a(locationRequest);
            this.fusedLocationProviderClient.c(locationRequest, this.locationCallback, Looper.getMainLooper());
        } catch (NoClassDefFoundError e10) {
            String str = TAG;
            HVLogUtils.e(str, "startLocationUpdates(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.d(str, Utils.getErrorMessage(e10));
        }
    }

    @Override // co.hyperverge.hypersnapsdk.service.location.LocationService
    public void stopLocationUpdates() {
        HVLogUtils.d(TAG, "stopLocationUpdates() called");
        try {
            InterfaceC5121d interfaceC5121d = this.fusedLocationProviderClient;
            if (interfaceC5121d == null || !this.isLocationUpdatesRunning) {
                return;
            }
            interfaceC5121d.e(this.locationCallback);
            this.isLocationUpdatesRunning = false;
        } catch (NoClassDefFoundError e10) {
            String str = TAG;
            HVLogUtils.e(str, "stopLocationUpdates(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.d(str, Utils.getErrorMessage(e10));
        }
    }
}
