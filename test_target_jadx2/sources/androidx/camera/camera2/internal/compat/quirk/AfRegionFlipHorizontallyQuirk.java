package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.impl.K0;
import u.C4832C;

/* loaded from: classes.dex */
public class AfRegionFlipHorizontallyQuirk implements K0 {
    static boolean f(C4832C c4832c) {
        return Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) c4832c.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
