package t;

import A.C0696f0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import u.C4844h;

/* loaded from: classes.dex */
public abstract class M0 {
    public static boolean a(u.P p10, String str) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) p10.c(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (C4844h e10) {
            throw new C0696f0(P0.a(e10));
        }
    }
}
