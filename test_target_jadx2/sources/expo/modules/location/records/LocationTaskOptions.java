package expo.modules.location.records;

import Ab.b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lc.t;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u001b\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001cH\u0000¢\u0006\u0002\b\u001fR(\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u000f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u000f\u0012\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR(\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u000f\u0012\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR&\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\n\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lexpo/modules/location/records/LocationTaskOptions;", "Lexpo/modules/location/records/LocationOptions;", "deferredUpdatesDistance", BuildConfig.FLAVOR, "deferredUpdatesInterval", "deferredUpdatesTimeout", "foregroundService", "Lexpo/modules/location/records/LocationTaskServiceOptions;", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lexpo/modules/location/records/LocationTaskServiceOptions;)V", "getDeferredUpdatesDistance$annotations", "()V", "getDeferredUpdatesDistance", "()Ljava/lang/Float;", "setDeferredUpdatesDistance", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getDeferredUpdatesInterval$annotations", "getDeferredUpdatesInterval", "setDeferredUpdatesInterval", "getDeferredUpdatesTimeout$annotations", "getDeferredUpdatesTimeout", "setDeferredUpdatesTimeout", "getForegroundService$annotations", "getForegroundService", "()Lexpo/modules/location/records/LocationTaskServiceOptions;", "setForegroundService", "(Lexpo/modules/location/records/LocationTaskServiceOptions;)V", "toMutableMap", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toMutableMap$expo_location_release", "expo-location_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LocationTaskOptions extends LocationOptions {
    private Float deferredUpdatesDistance;
    private Float deferredUpdatesInterval;
    private Float deferredUpdatesTimeout;
    private LocationTaskServiceOptions foregroundService;

    public LocationTaskOptions() {
        this(null, null, null, null, 15, null);
    }

    @b
    public static /* synthetic */ void getDeferredUpdatesDistance$annotations() {
    }

    @b
    public static /* synthetic */ void getDeferredUpdatesInterval$annotations() {
    }

    @b
    public static /* synthetic */ void getDeferredUpdatesTimeout$annotations() {
    }

    @b
    public static /* synthetic */ void getForegroundService$annotations() {
    }

    public final Float getDeferredUpdatesDistance() {
        return this.deferredUpdatesDistance;
    }

    public final Float getDeferredUpdatesInterval() {
        return this.deferredUpdatesInterval;
    }

    public final Float getDeferredUpdatesTimeout() {
        return this.deferredUpdatesTimeout;
    }

    public final LocationTaskServiceOptions getForegroundService() {
        return this.foregroundService;
    }

    public final void setDeferredUpdatesDistance(Float f10) {
        this.deferredUpdatesDistance = f10;
    }

    public final void setDeferredUpdatesInterval(Float f10) {
        this.deferredUpdatesInterval = f10;
    }

    public final void setDeferredUpdatesTimeout(Float f10) {
        this.deferredUpdatesTimeout = f10;
    }

    public final void setForegroundService(LocationTaskServiceOptions locationTaskServiceOptions) {
        this.foregroundService = locationTaskServiceOptions;
    }

    public final Map<String, Object> toMutableMap$expo_location_release() {
        Map<String, ? extends Object> linkedHashMap;
        Pair a10 = t.a("accuracy", Integer.valueOf(getAccuracy()));
        Pair a11 = t.a("distanceInterval", getDistanceInterval());
        Pair a12 = t.a("mayShowUserSettingsDialog", Boolean.valueOf(getMayShowUserSettingsDialog()));
        Pair a13 = t.a("timeInterval", getTimeInterval());
        Pair a14 = t.a("deferredUpdatesDistance", this.deferredUpdatesDistance);
        Pair a15 = t.a("deferredUpdatesInterval", this.deferredUpdatesInterval);
        Pair a16 = t.a("deferredUpdatesTimeout", this.deferredUpdatesTimeout);
        LocationTaskServiceOptions locationTaskServiceOptions = this.foregroundService;
        if (locationTaskServiceOptions == null || (linkedHashMap = locationTaskServiceOptions.toMutableMap$expo_location_release()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        return G.l(a10, a11, a12, a13, a14, a15, a16, t.a("foregroundService", linkedHashMap));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ LocationTaskOptions(Float f10, Float f11, Float f12, LocationTaskServiceOptions locationTaskServiceOptions, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(r7 != 0 ? r0 : f10, (i10 & 2) != 0 ? r0 : f11, (i10 & 4) != 0 ? null : f12, (i10 & 8) != 0 ? null : locationTaskServiceOptions);
        int i11 = i10 & 1;
        Float valueOf = Float.valueOf(0.0f);
    }

    public LocationTaskOptions(Float f10, Float f11, Float f12, LocationTaskServiceOptions locationTaskServiceOptions) {
        super(0, null, false, null, 15, null);
        this.deferredUpdatesDistance = f10;
        this.deferredUpdatesInterval = f11;
        this.deferredUpdatesTimeout = f12;
        this.foregroundService = locationTaskServiceOptions;
    }
}
