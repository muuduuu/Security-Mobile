package expo.modules.location.records;

import Ab.b;
import Ab.c;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u001f\b\u0016\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0004\b\n\u0010\u0010R(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\u0011\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0018\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\u001e\u0012\u0004\b#\u0010\u0017\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010$\u0012\u0004\b)\u0010\u0017\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lexpo/modules/location/records/LocationOptions;", "LAb/c;", "Ljava/io/Serializable;", BuildConfig.FLAVOR, "accuracy", "distanceInterval", BuildConfig.FLAVOR, "mayShowUserSettingsDialog", BuildConfig.FLAVOR, "timeInterval", "<init>", "(ILjava/lang/Integer;ZLjava/lang/Long;)V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "map", "(Ljava/util/Map;)V", "I", "getAccuracy", "()I", "setAccuracy", "(I)V", "getAccuracy$annotations", "()V", "Ljava/lang/Integer;", "getDistanceInterval", "()Ljava/lang/Integer;", "setDistanceInterval", "(Ljava/lang/Integer;)V", "getDistanceInterval$annotations", "Z", "getMayShowUserSettingsDialog", "()Z", "setMayShowUserSettingsDialog", "(Z)V", "getMayShowUserSettingsDialog$annotations", "Ljava/lang/Long;", "getTimeInterval", "()Ljava/lang/Long;", "setTimeInterval", "(Ljava/lang/Long;)V", "getTimeInterval$annotations", "expo-location_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class LocationOptions implements c, Serializable {
    private int accuracy;
    private Integer distanceInterval;
    private boolean mayShowUserSettingsDialog;
    private Long timeInterval;

    public LocationOptions() {
        this(0, null, false, null, 15, null);
    }

    @b
    public static /* synthetic */ void getAccuracy$annotations() {
    }

    @b
    public static /* synthetic */ void getDistanceInterval$annotations() {
    }

    @b
    public static /* synthetic */ void getMayShowUserSettingsDialog$annotations() {
    }

    @b
    public static /* synthetic */ void getTimeInterval$annotations() {
    }

    public final int getAccuracy() {
        return this.accuracy;
    }

    public final Integer getDistanceInterval() {
        return this.distanceInterval;
    }

    public final boolean getMayShowUserSettingsDialog() {
        return this.mayShowUserSettingsDialog;
    }

    public final Long getTimeInterval() {
        return this.timeInterval;
    }

    public final void setAccuracy(int i10) {
        this.accuracy = i10;
    }

    public final void setDistanceInterval(Integer num) {
        this.distanceInterval = num;
    }

    public final void setMayShowUserSettingsDialog(boolean z10) {
        this.mayShowUserSettingsDialog = z10;
    }

    public final void setTimeInterval(Long l10) {
        this.timeInterval = l10;
    }

    public LocationOptions(int i10, Integer num, boolean z10, Long l10) {
        this.accuracy = i10;
        this.distanceInterval = num;
        this.mayShowUserSettingsDialog = z10;
        this.timeInterval = l10;
    }

    public /* synthetic */ LocationOptions(int i10, Integer num, boolean z10, Long l10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 3 : i10, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? true : z10, (i11 & 8) != 0 ? null : l10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LocationOptions(Map<String, ? extends Object> map) {
        this(r0, r1, r3, r6 instanceof Long ? (Long) r6 : null);
        Intrinsics.checkNotNullParameter(map, "map");
        Object obj = map.get("accuracy");
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int intValue = num != null ? num.intValue() : 3;
        Object obj2 = map.get("distanceInterval");
        Integer num2 = obj2 instanceof Integer ? (Integer) obj2 : null;
        Object obj3 = map.get("mayShowUserSettingsDialog");
        Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : true;
        Object obj4 = map.get("timeInterval");
    }
}
