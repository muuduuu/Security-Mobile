package x;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import s.C4301a;

/* loaded from: classes.dex */
public class k {
    public void a(int i10, C4301a.C0609a c0609a) {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        if (((ImageCapturePixelHDRPlusQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ImageCapturePixelHDRPlusQuirk.class)) == null) {
            return;
        }
        if (i10 == 0) {
            key = CaptureRequest.CONTROL_ENABLE_ZSL;
            c0609a.f(key, Boolean.TRUE);
        } else {
            if (i10 != 1) {
                return;
            }
            key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
            c0609a.f(key2, Boolean.FALSE);
        }
    }
}
