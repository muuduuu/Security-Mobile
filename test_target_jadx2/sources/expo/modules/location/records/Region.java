package expo.modules.location.records;

import Ab.b;
import Ab.c;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.G;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b)\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BU\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R*\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\u0015\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u001c\u0012\u0004\b!\u0010\u001b\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\u001c\u0012\u0004\b$\u0010\u001b\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R*\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010%\u0012\u0004\b*\u0010\u001b\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010%\u0012\u0004\b-\u0010\u001b\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R*\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010.\u0012\u0004\b3\u0010\u001b\u001a\u0004\b/\u00100\"\u0004\b1\u00102R(\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u00104\u0012\u0004\b9\u0010\u001b\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006:"}, d2 = {"Lexpo/modules/location/records/Region;", "LAb/c;", "Ljava/io/Serializable;", BuildConfig.FLAVOR, "identifier", BuildConfig.FLAVOR, AppConstants.LATITUDE, AppConstants.LONGITUDE, BuildConfig.FLAVOR, "notifyOnEnter", "notifyOnExit", HVRetakeActivity.RADIUS_TAG, "Lexpo/modules/location/records/GeofencingRegionState;", Keys.STATE, "<init>", "(Ljava/lang/String;DDLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Lexpo/modules/location/records/GeofencingRegionState;)V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toMap$expo_location_release", "()Ljava/util/Map;", "toMap", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "setIdentifier", "(Ljava/lang/String;)V", "getIdentifier$annotations", "()V", "D", "getLatitude", "()D", "setLatitude", "(D)V", "getLatitude$annotations", "getLongitude", "setLongitude", "getLongitude$annotations", "Ljava/lang/Boolean;", "getNotifyOnEnter", "()Ljava/lang/Boolean;", "setNotifyOnEnter", "(Ljava/lang/Boolean;)V", "getNotifyOnEnter$annotations", "getNotifyOnExit", "setNotifyOnExit", "getNotifyOnExit$annotations", "Ljava/lang/Double;", "getRadius", "()Ljava/lang/Double;", "setRadius", "(Ljava/lang/Double;)V", "getRadius$annotations", "Lexpo/modules/location/records/GeofencingRegionState;", "getState", "()Lexpo/modules/location/records/GeofencingRegionState;", "setState", "(Lexpo/modules/location/records/GeofencingRegionState;)V", "getState$annotations", "expo-location_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Region implements c, Serializable {
    private String identifier;
    private double latitude;
    private double longitude;
    private Boolean notifyOnEnter;
    private Boolean notifyOnExit;
    private Double radius;
    private GeofencingRegionState state;

    public Region() {
        this(null, 0.0d, 0.0d, null, null, null, null, 127, null);
    }

    @b
    public static /* synthetic */ void getIdentifier$annotations() {
    }

    @b
    public static /* synthetic */ void getLatitude$annotations() {
    }

    @b
    public static /* synthetic */ void getLongitude$annotations() {
    }

    @b
    public static /* synthetic */ void getNotifyOnEnter$annotations() {
    }

    @b
    public static /* synthetic */ void getNotifyOnExit$annotations() {
    }

    @b
    public static /* synthetic */ void getRadius$annotations() {
    }

    @b
    public static /* synthetic */ void getState$annotations() {
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final Boolean getNotifyOnEnter() {
        return this.notifyOnEnter;
    }

    public final Boolean getNotifyOnExit() {
        return this.notifyOnExit;
    }

    public final Double getRadius() {
        return this.radius;
    }

    public final GeofencingRegionState getState() {
        return this.state;
    }

    public final void setIdentifier(String str) {
        this.identifier = str;
    }

    public final void setLatitude(double d10) {
        this.latitude = d10;
    }

    public final void setLongitude(double d10) {
        this.longitude = d10;
    }

    public final void setNotifyOnEnter(Boolean bool) {
        this.notifyOnEnter = bool;
    }

    public final void setNotifyOnExit(Boolean bool) {
        this.notifyOnExit = bool;
    }

    public final void setRadius(Double d10) {
        this.radius = d10;
    }

    public final void setState(GeofencingRegionState geofencingRegionState) {
        Intrinsics.checkNotNullParameter(geofencingRegionState, "<set-?>");
        this.state = geofencingRegionState;
    }

    public final Map<String, Object> toMap$expo_location_release() {
        return G.k(t.a("identifier", this.identifier), t.a(AppConstants.LATITUDE, Double.valueOf(this.latitude)), t.a(AppConstants.LONGITUDE, Double.valueOf(this.longitude)), t.a("notifyOnEnter", this.notifyOnEnter), t.a("notifyOnExit", this.notifyOnExit), t.a(HVRetakeActivity.RADIUS_TAG, this.radius), t.a(Keys.STATE, this.state));
    }

    public Region(String str, double d10, double d11, Boolean bool, Boolean bool2, Double d12, GeofencingRegionState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.identifier = str;
        this.latitude = d10;
        this.longitude = d11;
        this.notifyOnEnter = bool;
        this.notifyOnExit = bool2;
        this.radius = d12;
        this.state = state;
    }

    public /* synthetic */ Region(String str, double d10, double d11, Boolean bool, Boolean bool2, Double d12, GeofencingRegionState geofencingRegionState, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? 0.0d : d10, (i10 & 4) != 0 ? 0.0d : d11, (i10 & 8) != 0 ? Boolean.TRUE : bool, (i10 & 16) != 0 ? Boolean.TRUE : bool2, (i10 & 32) != 0 ? Double.valueOf(0.0d) : d12, (i10 & 64) != 0 ? GeofencingRegionState.UNKNOWN : geofencingRegionState);
    }
}
