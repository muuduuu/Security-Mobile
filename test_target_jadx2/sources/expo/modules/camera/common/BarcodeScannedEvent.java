package expo.modules.camera.common;

import Ab.b;
import Ab.c;
import android.os.Bundle;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u0012\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0014\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0018\u0010\u0016R \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001a\u0010\u0016R0\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u001c\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b\u001d\u0010\u001eR \u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010 \u0012\u0004\b#\u0010\u0013\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lexpo/modules/camera/common/BarcodeScannedEvent;", "LAb/c;", BuildConfig.FLAVOR, "target", BuildConfig.FLAVOR, "data", "raw", "type", "Ljava/util/ArrayList;", "Landroid/os/Bundle;", "Lkotlin/collections/ArrayList;", "cornerPoints", "bounds", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Landroid/os/Bundle;)V", "I", "getTarget", "()I", "getTarget$annotations", "()V", "Ljava/lang/String;", "getData", "()Ljava/lang/String;", "getData$annotations", "getRaw", "getRaw$annotations", "getType", "getType$annotations", "Ljava/util/ArrayList;", "getCornerPoints", "()Ljava/util/ArrayList;", "getCornerPoints$annotations", "Landroid/os/Bundle;", "getBounds", "()Landroid/os/Bundle;", "getBounds$annotations", "expo-camera_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BarcodeScannedEvent implements c {
    private final Bundle bounds;
    private final ArrayList<Bundle> cornerPoints;
    private final String data;
    private final String raw;
    private final int target;
    private final String type;

    public BarcodeScannedEvent(int i10, String data, String raw, String type, ArrayList<Bundle> cornerPoints, Bundle bounds) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(raw, "raw");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(cornerPoints, "cornerPoints");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.target = i10;
        this.data = data;
        this.raw = raw;
        this.type = type;
        this.cornerPoints = cornerPoints;
        this.bounds = bounds;
    }

    @b
    public static /* synthetic */ void getBounds$annotations() {
    }

    @b
    public static /* synthetic */ void getCornerPoints$annotations() {
    }

    @b
    public static /* synthetic */ void getData$annotations() {
    }

    @b
    public static /* synthetic */ void getRaw$annotations() {
    }

    @b
    public static /* synthetic */ void getTarget$annotations() {
    }

    @b
    public static /* synthetic */ void getType$annotations() {
    }

    public final Bundle getBounds() {
        return this.bounds;
    }

    public final ArrayList<Bundle> getCornerPoints() {
        return this.cornerPoints;
    }

    public final String getData() {
        return this.data;
    }

    public final String getRaw() {
        return this.raw;
    }

    public final int getTarget() {
        return this.target;
    }

    public final String getType() {
        return this.type;
    }
}
