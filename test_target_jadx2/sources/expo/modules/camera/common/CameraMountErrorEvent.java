package expo.modules.camera.common;

import Ab.b;
import Ab.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0006\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lexpo/modules/camera/common/CameraMountErrorEvent;", "LAb/c;", BuildConfig.FLAVOR, "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "getMessage$annotations", "()V", "expo-camera_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CameraMountErrorEvent implements c {
    private final String message;

    public CameraMountErrorEvent(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
    }

    @b
    public static /* synthetic */ void getMessage$annotations() {
    }

    public final String getMessage() {
        return this.message;
    }
}
