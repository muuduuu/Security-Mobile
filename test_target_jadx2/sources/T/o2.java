package t;

import android.hardware.camera2.CameraCharacteristics;
import u.C4832C;

/* loaded from: classes.dex */
abstract class o2 {
    public static boolean a(C4832C c4832c, int i10) {
        int[] iArr = (int[]) c4832c.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }
}
