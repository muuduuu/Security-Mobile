package expo.modules.camera.common;

import Ab.b;
import Ab.c;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\r\u0012\u0004\b\u0010\u0010\f\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lexpo/modules/camera/common/PictureSavedEvent;", "LAb/c;", BuildConfig.FLAVOR, "id", "Landroid/os/Bundle;", "data", "<init>", "(ILandroid/os/Bundle;)V", "I", "getId", "()I", "getId$annotations", "()V", "Landroid/os/Bundle;", "getData", "()Landroid/os/Bundle;", "getData$annotations", "expo-camera_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PictureSavedEvent implements c {
    private final Bundle data;
    private final int id;

    public PictureSavedEvent(int i10, Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.id = i10;
        this.data = data;
    }

    @b
    public static /* synthetic */ void getData$annotations() {
    }

    @b
    public static /* synthetic */ void getId$annotations() {
    }

    public final Bundle getData() {
        return this.data;
    }

    public final int getId() {
        return this.id;
    }
}
