package co.hyperverge.hypersnapsdk.service.location;

import android.location.Location;
import co.hyperverge.hypersnapsdk.listeners.LocationProviderCallback;

/* loaded from: classes.dex */
public interface LocationService {
    void addLocationCallback(LocationProviderCallback locationProviderCallback);

    Location getLastKnownLocation();

    boolean isGPSSwitchedOn();

    void startLocationUpdates();

    void stopLocationUpdates();
}
