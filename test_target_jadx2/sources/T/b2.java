package t;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import u.C4832C;

/* loaded from: classes.dex */
public abstract class b2 {
    public static boolean a(C4832C c4832c) {
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 33 && (iArr = (int[]) c4832c.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) != null && iArr.length != 0) {
            for (int i10 : iArr) {
                if (i10 == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
