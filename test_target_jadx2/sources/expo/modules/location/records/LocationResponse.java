package expo.modules.location.records;

import Ab.b;
import Ab.c;
import android.location.Location;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.PersistableBundle;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ'\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u000f*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R*\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\u0015\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u001c\u0012\u0004\b!\u0010\u001b\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010\"\u0012\u0004\b'\u0010\u001b\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, d2 = {"Lexpo/modules/location/records/LocationResponse;", "LAb/c;", "Ljava/io/Serializable;", "Lexpo/modules/location/records/LocationObjectCoords;", "coords", BuildConfig.FLAVOR, "timestamp", BuildConfig.FLAVOR, "mocked", "<init>", "(Lexpo/modules/location/records/LocationObjectCoords;Ljava/lang/Double;Ljava/lang/Boolean;)V", "Landroid/location/Location;", "location", "(Landroid/location/Location;)V", "Landroid/os/BaseBundle;", "BundleType", "Ljava/lang/Class;", "bundleTypeClass", "toBundle$expo_location_release", "(Ljava/lang/Class;)Landroid/os/BaseBundle;", "toBundle", "Lexpo/modules/location/records/LocationObjectCoords;", "getCoords", "()Lexpo/modules/location/records/LocationObjectCoords;", "setCoords", "(Lexpo/modules/location/records/LocationObjectCoords;)V", "getCoords$annotations", "()V", "Ljava/lang/Double;", "getTimestamp", "()Ljava/lang/Double;", "setTimestamp", "(Ljava/lang/Double;)V", "getTimestamp$annotations", "Ljava/lang/Boolean;", "getMocked", "()Ljava/lang/Boolean;", "setMocked", "(Ljava/lang/Boolean;)V", "getMocked$annotations", "expo-location_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LocationResponse implements c, Serializable {
    private LocationObjectCoords coords;
    private Boolean mocked;
    private Double timestamp;

    public LocationResponse() {
        this(null, null, null, 7, null);
    }

    @b
    public static /* synthetic */ void getCoords$annotations() {
    }

    @b
    public static /* synthetic */ void getMocked$annotations() {
    }

    @b
    public static /* synthetic */ void getTimestamp$annotations() {
    }

    public final LocationObjectCoords getCoords() {
        return this.coords;
    }

    public final Boolean getMocked() {
        return this.mocked;
    }

    public final Double getTimestamp() {
        return this.timestamp;
    }

    public final void setCoords(LocationObjectCoords locationObjectCoords) {
        this.coords = locationObjectCoords;
    }

    public final void setMocked(Boolean bool) {
        this.mocked = bool;
    }

    public final void setTimestamp(Double d10) {
        this.timestamp = d10;
    }

    public final <BundleType extends BaseBundle> BundleType toBundle$expo_location_release(Class<BundleType> bundleTypeClass) {
        Intrinsics.checkNotNullParameter(bundleTypeClass, "bundleTypeClass");
        BundleType persistableBundle = Intrinsics.b(bundleTypeClass, PersistableBundle.class) ? new PersistableBundle() : new Bundle();
        Double d10 = this.timestamp;
        if (d10 != null) {
            persistableBundle.putDouble("timestamp", d10.doubleValue());
        }
        Boolean bool = this.mocked;
        if (bool != null) {
            persistableBundle.putBoolean("mocked", bool.booleanValue());
        }
        if (persistableBundle instanceof PersistableBundle) {
            PersistableBundle persistableBundle2 = (PersistableBundle) persistableBundle;
            LocationObjectCoords locationObjectCoords = this.coords;
            persistableBundle2.putPersistableBundle("coords", locationObjectCoords != null ? (PersistableBundle) locationObjectCoords.toBundle$expo_location_release(PersistableBundle.class) : null);
        } else if (persistableBundle instanceof Bundle) {
            Bundle bundle = (Bundle) persistableBundle;
            LocationObjectCoords locationObjectCoords2 = this.coords;
            bundle.putBundle("coords", locationObjectCoords2 != null ? (Bundle) locationObjectCoords2.toBundle$expo_location_release(Bundle.class) : null);
        }
        return persistableBundle;
    }

    public LocationResponse(LocationObjectCoords locationObjectCoords, Double d10, Boolean bool) {
        this.coords = locationObjectCoords;
        this.timestamp = d10;
        this.mocked = bool;
    }

    public /* synthetic */ LocationResponse(LocationObjectCoords locationObjectCoords, Double d10, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : locationObjectCoords, (i10 & 2) != 0 ? null : d10, (i10 & 4) != 0 ? null : bool);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationResponse(Location location) {
        this(new LocationObjectCoords(location), Double.valueOf(location.getTime()), Boolean.valueOf(location.isFromMockProvider()));
        Intrinsics.checkNotNullParameter(location, "location");
    }
}
