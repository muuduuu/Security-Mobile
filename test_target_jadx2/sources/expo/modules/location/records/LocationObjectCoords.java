package expo.modules.location.records;

import Ab.b;
import Ab.c;
import android.location.Location;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B[\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ'\u0010\u0016\u001a\u00028\u0000\"\b\b\u0000\u0010\u0011*\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R*\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\u0017\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0017\u0012\u0004\b \u0010\u001d\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR*\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0017\u0012\u0004\b#\u0010\u001d\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR*\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\u0017\u0012\u0004\b&\u0010\u001d\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR*\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010\u0017\u0012\u0004\b)\u0010\u001d\u001a\u0004\b'\u0010\u0019\"\u0004\b(\u0010\u001bR*\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010\u0017\u0012\u0004\b,\u0010\u001d\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR*\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010\u0017\u0012\u0004\b/\u0010\u001d\u001a\u0004\b-\u0010\u0019\"\u0004\b.\u0010\u001b¨\u00060"}, d2 = {"Lexpo/modules/location/records/LocationObjectCoords;", "LAb/c;", "Ljava/io/Serializable;", BuildConfig.FLAVOR, AppConstants.LATITUDE, AppConstants.LONGITUDE, "altitude", "accuracy", "altitudeAccuracy", "heading", "speed", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "Landroid/location/Location;", "location", "(Landroid/location/Location;)V", "Landroid/os/BaseBundle;", "BundleType", "Ljava/lang/Class;", "bundleTypeClass", "toBundle$expo_location_release", "(Ljava/lang/Class;)Landroid/os/BaseBundle;", "toBundle", "Ljava/lang/Double;", "getLatitude", "()Ljava/lang/Double;", "setLatitude", "(Ljava/lang/Double;)V", "getLatitude$annotations", "()V", "getLongitude", "setLongitude", "getLongitude$annotations", "getAltitude", "setAltitude", "getAltitude$annotations", "getAccuracy", "setAccuracy", "getAccuracy$annotations", "getAltitudeAccuracy", "setAltitudeAccuracy", "getAltitudeAccuracy$annotations", "getHeading", "setHeading", "getHeading$annotations", "getSpeed", "setSpeed", "getSpeed$annotations", "expo-location_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LocationObjectCoords implements c, Serializable {
    private Double accuracy;
    private Double altitude;
    private Double altitudeAccuracy;
    private Double heading;
    private Double latitude;
    private Double longitude;
    private Double speed;

    public LocationObjectCoords() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @b
    public static /* synthetic */ void getAccuracy$annotations() {
    }

    @b
    public static /* synthetic */ void getAltitude$annotations() {
    }

    @b
    public static /* synthetic */ void getAltitudeAccuracy$annotations() {
    }

    @b
    public static /* synthetic */ void getHeading$annotations() {
    }

    @b
    public static /* synthetic */ void getLatitude$annotations() {
    }

    @b
    public static /* synthetic */ void getLongitude$annotations() {
    }

    @b
    public static /* synthetic */ void getSpeed$annotations() {
    }

    public final Double getAccuracy() {
        return this.accuracy;
    }

    public final Double getAltitude() {
        return this.altitude;
    }

    public final Double getAltitudeAccuracy() {
        return this.altitudeAccuracy;
    }

    public final Double getHeading() {
        return this.heading;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final Double getSpeed() {
        return this.speed;
    }

    public final void setAccuracy(Double d10) {
        this.accuracy = d10;
    }

    public final void setAltitude(Double d10) {
        this.altitude = d10;
    }

    public final void setAltitudeAccuracy(Double d10) {
        this.altitudeAccuracy = d10;
    }

    public final void setHeading(Double d10) {
        this.heading = d10;
    }

    public final void setLatitude(Double d10) {
        this.latitude = d10;
    }

    public final void setLongitude(Double d10) {
        this.longitude = d10;
    }

    public final void setSpeed(Double d10) {
        this.speed = d10;
    }

    public final <BundleType extends BaseBundle> BundleType toBundle$expo_location_release(Class<BundleType> bundleTypeClass) {
        Intrinsics.checkNotNullParameter(bundleTypeClass, "bundleTypeClass");
        BundleType persistableBundle = Intrinsics.b(bundleTypeClass, PersistableBundle.class) ? new PersistableBundle() : new Bundle();
        Double d10 = this.latitude;
        if (d10 != null) {
            persistableBundle.putDouble(AppConstants.LATITUDE, d10.doubleValue());
        }
        Double d11 = this.longitude;
        if (d11 != null) {
            persistableBundle.putDouble(AppConstants.LONGITUDE, d11.doubleValue());
        }
        Double d12 = this.altitude;
        if (d12 != null) {
            persistableBundle.putDouble("altitude", d12.doubleValue());
        }
        Double d13 = this.accuracy;
        if (d13 != null) {
            persistableBundle.putDouble("accuracy", d13.doubleValue());
        }
        Double d14 = this.altitudeAccuracy;
        if (d14 != null) {
            persistableBundle.putDouble("altitudeAccuracy", d14.doubleValue());
        }
        Double d15 = this.heading;
        if (d15 != null) {
            persistableBundle.putDouble("heading", d15.doubleValue());
        }
        Double d16 = this.speed;
        if (d16 != null) {
            persistableBundle.putDouble("speed", d16.doubleValue());
        }
        return persistableBundle;
    }

    public LocationObjectCoords(Double d10, Double d11, Double d12, Double d13, Double d14, Double d15, Double d16) {
        this.latitude = d10;
        this.longitude = d11;
        this.altitude = d12;
        this.accuracy = d13;
        this.altitudeAccuracy = d14;
        this.heading = d15;
        this.speed = d16;
    }

    public /* synthetic */ LocationObjectCoords(Double d10, Double d11, Double d12, Double d13, Double d14, Double d15, Double d16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : d10, (i10 & 2) != 0 ? null : d11, (i10 & 4) != 0 ? null : d12, (i10 & 8) != 0 ? null : d13, (i10 & 16) != 0 ? null : d14, (i10 & 32) != 0 ? null : d15, (i10 & 64) != 0 ? null : d16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LocationObjectCoords(Location location) {
        this(r3, r4, r5, r6, r0, Double.valueOf(location.getBearing()), Double.valueOf(location.getSpeed()));
        Double d10;
        float verticalAccuracyMeters;
        Intrinsics.checkNotNullParameter(location, "location");
        Double valueOf = Double.valueOf(location.getLatitude());
        Double valueOf2 = Double.valueOf(location.getLongitude());
        Double valueOf3 = Double.valueOf(location.getAltitude());
        Double valueOf4 = Double.valueOf(location.getAccuracy());
        if (Build.VERSION.SDK_INT >= 26) {
            verticalAccuracyMeters = location.getVerticalAccuracyMeters();
            d10 = Double.valueOf(verticalAccuracyMeters);
        } else {
            d10 = null;
        }
    }
}
