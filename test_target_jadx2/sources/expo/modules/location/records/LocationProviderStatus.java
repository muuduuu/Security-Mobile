package expo.modules.location.records;

import Ab.b;
import Ab.c;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR*\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\u000b\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u000b\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR*\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u000b\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR(\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\u0018\u0012\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010\u000b\u0012\u0004\b \u0010\u0011\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000f¨\u0006!"}, d2 = {"Lexpo/modules/location/records/LocationProviderStatus;", "LAb/c;", "Ljava/io/Serializable;", BuildConfig.FLAVOR, "backgroundModeEnabled", "gpsAvailable", "networkAvailable", "locationServicesEnabled", "passiveAvailable", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getBackgroundModeEnabled", "()Ljava/lang/Boolean;", "setBackgroundModeEnabled", "(Ljava/lang/Boolean;)V", "getBackgroundModeEnabled$annotations", "()V", "getGpsAvailable", "setGpsAvailable", "getGpsAvailable$annotations", "getNetworkAvailable", "setNetworkAvailable", "getNetworkAvailable$annotations", "Z", "getLocationServicesEnabled", "()Z", "setLocationServicesEnabled", "(Z)V", "getLocationServicesEnabled$annotations", "getPassiveAvailable", "setPassiveAvailable", "getPassiveAvailable$annotations", "expo-location_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LocationProviderStatus implements c, Serializable {
    private Boolean backgroundModeEnabled;
    private Boolean gpsAvailable;
    private boolean locationServicesEnabled;
    private Boolean networkAvailable;
    private Boolean passiveAvailable;

    public LocationProviderStatus() {
        this(null, null, null, false, null, 31, null);
    }

    @b
    public static /* synthetic */ void getBackgroundModeEnabled$annotations() {
    }

    @b
    public static /* synthetic */ void getGpsAvailable$annotations() {
    }

    @b
    public static /* synthetic */ void getLocationServicesEnabled$annotations() {
    }

    @b
    public static /* synthetic */ void getNetworkAvailable$annotations() {
    }

    @b
    public static /* synthetic */ void getPassiveAvailable$annotations() {
    }

    public final Boolean getBackgroundModeEnabled() {
        return this.backgroundModeEnabled;
    }

    public final Boolean getGpsAvailable() {
        return this.gpsAvailable;
    }

    public final boolean getLocationServicesEnabled() {
        return this.locationServicesEnabled;
    }

    public final Boolean getNetworkAvailable() {
        return this.networkAvailable;
    }

    public final Boolean getPassiveAvailable() {
        return this.passiveAvailable;
    }

    public final void setBackgroundModeEnabled(Boolean bool) {
        this.backgroundModeEnabled = bool;
    }

    public final void setGpsAvailable(Boolean bool) {
        this.gpsAvailable = bool;
    }

    public final void setLocationServicesEnabled(boolean z10) {
        this.locationServicesEnabled = z10;
    }

    public final void setNetworkAvailable(Boolean bool) {
        this.networkAvailable = bool;
    }

    public final void setPassiveAvailable(Boolean bool) {
        this.passiveAvailable = bool;
    }

    public LocationProviderStatus(Boolean bool, Boolean bool2, Boolean bool3, boolean z10, Boolean bool4) {
        this.backgroundModeEnabled = bool;
        this.gpsAvailable = bool2;
        this.networkAvailable = bool3;
        this.locationServicesEnabled = z10;
        this.passiveAvailable = bool4;
    }

    public /* synthetic */ LocationProviderStatus(Boolean bool, Boolean bool2, Boolean bool3, boolean z10, Boolean bool4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? Boolean.FALSE : bool2, (i10 & 4) != 0 ? null : bool3, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : bool4);
    }
}
