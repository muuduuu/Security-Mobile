package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.core.impl.K0;
import u.C4832C;

/* loaded from: classes.dex */
public class CaptureSessionStuckQuirk implements K0 {
    static boolean f(C4832C c4832c) {
        Integer num = (Integer) c4832c.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
