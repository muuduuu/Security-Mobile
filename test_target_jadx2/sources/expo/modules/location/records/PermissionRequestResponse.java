package expo.modules.location.records;

import Ab.b;
import Ab.c;
import Nb.C1003b;
import android.os.Bundle;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fR*\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\u0010\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0017\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\u001d\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010\u0017\u0012\u0004\b%\u0010\u0016\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR*\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010&\u0012\u0004\b+\u0010\u0016\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lexpo/modules/location/records/PermissionRequestResponse;", "LAb/c;", "Ljava/io/Serializable;", BuildConfig.FLAVOR, "canAskAgain", BuildConfig.FLAVOR, "expires", "granted", "status", "Lexpo/modules/location/records/PermissionDetailsLocationAndroid;", "android", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;Lexpo/modules/location/records/PermissionDetailsLocationAndroid;)V", "Landroid/os/Bundle;", "bundle", "(Landroid/os/Bundle;)V", "Ljava/lang/Boolean;", "getCanAskAgain", "()Ljava/lang/Boolean;", "setCanAskAgain", "(Ljava/lang/Boolean;)V", "getCanAskAgain$annotations", "()V", "Ljava/lang/String;", "getExpires", "()Ljava/lang/String;", "setExpires", "(Ljava/lang/String;)V", "getExpires$annotations", "Z", "getGranted", "()Z", "setGranted", "(Z)V", "getGranted$annotations", "getStatus", "setStatus", "getStatus$annotations", "Lexpo/modules/location/records/PermissionDetailsLocationAndroid;", "getAndroid", "()Lexpo/modules/location/records/PermissionDetailsLocationAndroid;", "setAndroid", "(Lexpo/modules/location/records/PermissionDetailsLocationAndroid;)V", "getAndroid$annotations", "expo-location_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PermissionRequestResponse implements c, Serializable {
    private PermissionDetailsLocationAndroid android;
    private Boolean canAskAgain;
    private String expires;
    private boolean granted;
    private String status;

    public PermissionRequestResponse(Boolean bool, String str, boolean z10, String str2, PermissionDetailsLocationAndroid permissionDetailsLocationAndroid) {
        this.canAskAgain = bool;
        this.expires = str;
        this.granted = z10;
        this.status = str2;
        this.android = permissionDetailsLocationAndroid;
    }

    @b
    public static /* synthetic */ void getAndroid$annotations() {
    }

    @b
    public static /* synthetic */ void getCanAskAgain$annotations() {
    }

    @b
    public static /* synthetic */ void getExpires$annotations() {
    }

    @b
    public static /* synthetic */ void getGranted$annotations() {
    }

    @b
    public static /* synthetic */ void getStatus$annotations() {
    }

    public final PermissionDetailsLocationAndroid getAndroid() {
        return this.android;
    }

    public final Boolean getCanAskAgain() {
        return this.canAskAgain;
    }

    public final String getExpires() {
        return this.expires;
    }

    public final boolean getGranted() {
        return this.granted;
    }

    public final String getStatus() {
        return this.status;
    }

    public final void setAndroid(PermissionDetailsLocationAndroid permissionDetailsLocationAndroid) {
        this.android = permissionDetailsLocationAndroid;
    }

    public final void setCanAskAgain(Boolean bool) {
        this.canAskAgain = bool;
    }

    public final void setExpires(String str) {
        this.expires = str;
    }

    public final void setGranted(boolean z10) {
        this.granted = z10;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PermissionRequestResponse(Bundle bundle) {
        this(r2, r3, r4, r5, r8 != null ? new PermissionDetailsLocationAndroid(r8) : null);
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Boolean valueOf = Boolean.valueOf(bundle.getBoolean("canAskAgain"));
        String string = bundle.getString("expires");
        if (string != null) {
            boolean z10 = bundle.getBoolean("granted");
            String string2 = bundle.getString("status");
            if (string2 != null) {
                Bundle bundle2 = bundle.getBundle("android");
                return;
            }
            throw new C1003b(Bundle.class, PermissionRequestResponse.class, "value under `status` key is undefined");
        }
        throw new C1003b(Bundle.class, PermissionRequestResponse.class, "value under `expires` key is undefined");
    }
}
