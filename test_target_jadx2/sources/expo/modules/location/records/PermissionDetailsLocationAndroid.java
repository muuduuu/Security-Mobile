package expo.modules.location.records;

import Ab.b;
import Ab.c;
import android.os.Bundle;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tR(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\n\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0006¨\u0006\u0010"}, d2 = {"Lexpo/modules/location/records/PermissionDetailsLocationAndroid;", "LAb/c;", "Ljava/io/Serializable;", BuildConfig.FLAVOR, "accuracy", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "bundle", "(Landroid/os/Bundle;)V", "Ljava/lang/String;", "getAccuracy", "()Ljava/lang/String;", "setAccuracy", "getAccuracy$annotations", "()V", "expo-location_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PermissionDetailsLocationAndroid implements c, Serializable {
    private String accuracy;

    public PermissionDetailsLocationAndroid(String accuracy) {
        Intrinsics.checkNotNullParameter(accuracy, "accuracy");
        this.accuracy = accuracy;
    }

    @b
    public static /* synthetic */ void getAccuracy$annotations() {
    }

    public final String getAccuracy() {
        return this.accuracy;
    }

    public final void setAccuracy(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.accuracy = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PermissionDetailsLocationAndroid(Bundle bundle) {
        this(r2 == null ? "none" : r2);
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String string = bundle.getString("accuracy");
    }
}
