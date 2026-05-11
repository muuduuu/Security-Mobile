package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import u.C4832C;

/* loaded from: classes.dex */
public class TemporalNoiseQuirk implements CaptureIntentPreviewQuirk {
    private static boolean f() {
        return "Pixel 8".equalsIgnoreCase(Build.MODEL);
    }

    static boolean g(C4832C c4832c) {
        return f() && ((Integer) c4832c.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
