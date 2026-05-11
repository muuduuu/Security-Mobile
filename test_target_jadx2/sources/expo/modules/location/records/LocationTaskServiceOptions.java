package expo.modules.location.records;

import Ab.b;
import Ab.c;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.G;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lc.t;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f0\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eR*\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\u0010\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0010\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\u001a\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010\u0010\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014¨\u0006#"}, d2 = {"Lexpo/modules/location/records/LocationTaskServiceOptions;", "LAb/c;", "Ljava/io/Serializable;", BuildConfig.FLAVOR, "notificationTitle", "notificationBody", BuildConfig.FLAVOR, "killServiceOnDestroy", "notificationColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toMutableMap$expo_location_release", "()Ljava/util/Map;", "toMutableMap", "Ljava/lang/String;", "getNotificationTitle", "()Ljava/lang/String;", "setNotificationTitle", "(Ljava/lang/String;)V", "getNotificationTitle$annotations", "()V", "getNotificationBody", "setNotificationBody", "getNotificationBody$annotations", "Ljava/lang/Boolean;", "getKillServiceOnDestroy", "()Ljava/lang/Boolean;", "setKillServiceOnDestroy", "(Ljava/lang/Boolean;)V", "getKillServiceOnDestroy$annotations", "getNotificationColor", "setNotificationColor", "getNotificationColor$annotations", "expo-location_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LocationTaskServiceOptions implements c, Serializable {
    private Boolean killServiceOnDestroy;
    private String notificationBody;
    private String notificationColor;
    private String notificationTitle;

    public LocationTaskServiceOptions() {
        this(null, null, null, null, 15, null);
    }

    @b
    public static /* synthetic */ void getKillServiceOnDestroy$annotations() {
    }

    @b
    public static /* synthetic */ void getNotificationBody$annotations() {
    }

    @b
    public static /* synthetic */ void getNotificationColor$annotations() {
    }

    @b
    public static /* synthetic */ void getNotificationTitle$annotations() {
    }

    public final Boolean getKillServiceOnDestroy() {
        return this.killServiceOnDestroy;
    }

    public final String getNotificationBody() {
        return this.notificationBody;
    }

    public final String getNotificationColor() {
        return this.notificationColor;
    }

    public final String getNotificationTitle() {
        return this.notificationTitle;
    }

    public final void setKillServiceOnDestroy(Boolean bool) {
        this.killServiceOnDestroy = bool;
    }

    public final void setNotificationBody(String str) {
        this.notificationBody = str;
    }

    public final void setNotificationColor(String str) {
        this.notificationColor = str;
    }

    public final void setNotificationTitle(String str) {
        this.notificationTitle = str;
    }

    public final Map<String, ? extends Object> toMutableMap$expo_location_release() {
        return G.l(t.a("notificationTitle", this.notificationTitle), t.a("notificationBody", this.notificationBody), t.a("killServiceOnDestroy", this.killServiceOnDestroy), t.a("notificationColor", this.notificationColor));
    }

    public LocationTaskServiceOptions(String str, String str2, Boolean bool, String str3) {
        this.notificationTitle = str;
        this.notificationBody = str2;
        this.killServiceOnDestroy = bool;
        this.notificationColor = str3;
    }

    public /* synthetic */ LocationTaskServiceOptions(String str, String str2, Boolean bool, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : str3);
    }
}
