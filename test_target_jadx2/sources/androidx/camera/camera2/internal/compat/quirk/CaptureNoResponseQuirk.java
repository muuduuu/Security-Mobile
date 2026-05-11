package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.impl.K0;
import u.C4832C;

/* loaded from: classes.dex */
public class CaptureNoResponseQuirk implements K0 {
    static boolean f(C4832C c4832c) {
        String str = Build.HARDWARE;
        return ("samsungexynos7420".equalsIgnoreCase(str) || "universal7420".equalsIgnoreCase(str)) && ((Integer) c4832c.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
