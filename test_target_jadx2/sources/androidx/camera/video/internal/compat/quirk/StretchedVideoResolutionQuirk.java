package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.K0;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;

/* loaded from: classes.dex */
public class StretchedVideoResolutionQuirk implements K0 {
    private static boolean g() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    static boolean h() {
        return g();
    }

    public Size f(int i10) {
        if (i10 == 4) {
            return new Size(HVFrameRecorder.VIDEO_HEIGHT, HVFrameRecorder.VIDEO_WIDTH);
        }
        if (i10 == 5) {
            return new Size(960, 720);
        }
        if (i10 != 6) {
            return null;
        }
        return new Size(1440, 1080);
    }
}
