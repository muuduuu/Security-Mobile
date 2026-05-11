package expo.modules.location.records;

import Ab.b;
import Ab.c;
import Ob.a;
import android.os.Bundle;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bR*\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\r\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0014\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lexpo/modules/location/records/HeadingEventResponse;", "LAb/c;", "Ljava/io/Serializable;", BuildConfig.FLAVOR, "watchId", "LOb/a;", "heading", "<init>", "(Ljava/lang/Integer;LOb/a;)V", "Landroid/os/Bundle;", "toBundle$expo_location_release", "()Landroid/os/Bundle;", "toBundle", "Ljava/lang/Integer;", "getWatchId", "()Ljava/lang/Integer;", "setWatchId", "(Ljava/lang/Integer;)V", "getWatchId$annotations", "()V", "LOb/a;", "getHeading", "()LOb/a;", "setHeading", "(LOb/a;)V", "getHeading$annotations", "expo-location_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HeadingEventResponse implements c, Serializable {
    private a heading;
    private Integer watchId;

    /* JADX WARN: Multi-variable type inference failed */
    public HeadingEventResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @b
    public static /* synthetic */ void getHeading$annotations() {
    }

    @b
    public static /* synthetic */ void getWatchId$annotations() {
    }

    public final a getHeading() {
        return this.heading;
    }

    public final Integer getWatchId() {
        return this.watchId;
    }

    public final void setHeading(a aVar) {
        this.heading = aVar;
    }

    public final void setWatchId(Integer num) {
        this.watchId = num;
    }

    public final Bundle toBundle$expo_location_release() {
        Bundle bundle = new Bundle();
        Integer num = this.watchId;
        if (num != null) {
            bundle.putInt("watchId", num.intValue());
        }
        a aVar = this.heading;
        if (aVar != null) {
            bundle.putBundle("heading", aVar.a());
        }
        return bundle;
    }

    public HeadingEventResponse(Integer num, a aVar) {
        this.watchId = num;
        this.heading = aVar;
    }

    public /* synthetic */ HeadingEventResponse(Integer num, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : aVar);
    }
}
