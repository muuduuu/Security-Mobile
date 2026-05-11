package expo.modules.location.records;

import Ab.b;
import Ab.c;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R*\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\b\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR*\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\b\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\f¨\u0006\u0012"}, d2 = {"Lexpo/modules/location/records/LocationLastKnownOptions;", "LAb/c;", "Ljava/io/Serializable;", BuildConfig.FLAVOR, "maxAge", "requiredAccuracy", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "Ljava/lang/Double;", "getMaxAge", "()Ljava/lang/Double;", "setMaxAge", "(Ljava/lang/Double;)V", "getMaxAge$annotations", "()V", "getRequiredAccuracy", "setRequiredAccuracy", "getRequiredAccuracy$annotations", "expo-location_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LocationLastKnownOptions implements c, Serializable {
    private Double maxAge;
    private Double requiredAccuracy;

    /* JADX WARN: Multi-variable type inference failed */
    public LocationLastKnownOptions() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @b
    public static /* synthetic */ void getMaxAge$annotations() {
    }

    @b
    public static /* synthetic */ void getRequiredAccuracy$annotations() {
    }

    public final Double getMaxAge() {
        return this.maxAge;
    }

    public final Double getRequiredAccuracy() {
        return this.requiredAccuracy;
    }

    public final void setMaxAge(Double d10) {
        this.maxAge = d10;
    }

    public final void setRequiredAccuracy(Double d10) {
        this.requiredAccuracy = d10;
    }

    public LocationLastKnownOptions(Double d10, Double d11) {
        this.maxAge = d10;
        this.requiredAccuracy = d11;
    }

    public /* synthetic */ LocationLastKnownOptions(Double d10, Double d11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : d10, (i10 & 2) != 0 ? null : d11);
    }
}
