package expo.modules.location.records;

import Ab.b;
import Ab.c;
import Nb.p;
import android.location.Location;
import android.util.Log;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001d\b\u0000\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001\"B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\u000b\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u000b\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\u0015\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010\u001b\u0012\u0004\b \u0010\u0011\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lexpo/modules/location/records/GeocodeResponse;", "LAb/c;", "Ljava/io/Serializable;", BuildConfig.FLAVOR, AppConstants.LATITUDE, AppConstants.LONGITUDE, BuildConfig.FLAVOR, "accuracy", "altitude", "<init>", "(DDLjava/lang/Float;Ljava/lang/Double;)V", "D", "getLatitude", "()D", "setLatitude", "(D)V", "getLatitude$annotations", "()V", "getLongitude", "setLongitude", "getLongitude$annotations", "Ljava/lang/Float;", "getAccuracy", "()Ljava/lang/Float;", "setAccuracy", "(Ljava/lang/Float;)V", "getAccuracy$annotations", "Ljava/lang/Double;", "getAltitude", "()Ljava/lang/Double;", "setAltitude", "(Ljava/lang/Double;)V", "getAltitude$annotations", "Companion", C4870a.f43493a, "expo-location_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GeocodeResponse implements c, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Float accuracy;
    private Double altitude;
    private double latitude;
    private double longitude;

    /* renamed from: expo.modules.location.records.GeocodeResponse$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final GeocodeResponse a(Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            try {
                return new GeocodeResponse(location.getLatitude(), location.getLongitude(), Float.valueOf(location.getAccuracy()), Double.valueOf(location.getAltitude()));
            } catch (Exception e10) {
                if ((e10 instanceof IllegalAccessException) || (e10 instanceof InstantiationException)) {
                    Log.e(p.INSTANCE.a(), "Unexpected exception was thrown when converting location to coords bundle: ", e10);
                }
                return null;
            }
        }

        private Companion() {
        }
    }

    public GeocodeResponse(double d10, double d11, Float f10, Double d12) {
        this.latitude = d10;
        this.longitude = d11;
        this.accuracy = f10;
        this.altitude = d12;
    }

    @b
    public static /* synthetic */ void getAccuracy$annotations() {
    }

    @b
    public static /* synthetic */ void getAltitude$annotations() {
    }

    @b
    public static /* synthetic */ void getLatitude$annotations() {
    }

    @b
    public static /* synthetic */ void getLongitude$annotations() {
    }

    public final Float getAccuracy() {
        return this.accuracy;
    }

    public final Double getAltitude() {
        return this.altitude;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final void setAccuracy(Float f10) {
        this.accuracy = f10;
    }

    public final void setAltitude(Double d10) {
        this.altitude = d10;
    }

    public final void setLatitude(double d10) {
        this.latitude = d10;
    }

    public final void setLongitude(double d10) {
        this.longitude = d10;
    }

    public /* synthetic */ GeocodeResponse(double d10, double d11, Float f10, Double d12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d10, d11, (i10 & 4) != 0 ? null : f10, (i10 & 8) != 0 ? null : d12);
    }
}
